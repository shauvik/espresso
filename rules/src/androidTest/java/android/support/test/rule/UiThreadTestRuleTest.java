/*
 * Copyright (C) 2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package android.support.test.rule;

import android.os.Looper;
import android.support.test.annotation.Beta;
import android.support.test.annotation.UiThreadTest;
import android.test.suitebuilder.annotation.SmallTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.Result;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.runner.JUnitCore.runClasses;

@Beta
@SmallTest
public class UiThreadTestRuleTest {

    @Rule
    public UiThreadTestRule mUiThreadRule = new UiThreadTestRule();

    private static void verifyRunsOnUiThread() {
        assertTrue("Not running on the UI Thread", Looper.getMainLooper().getThread() == Thread
                .currentThread());
        assertTrue("Not running on the UI Thread", Looper.myLooper() == Looper.getMainLooper());
    }

    private static void verifyRunsNotOnUiThread() {
        assertFalse("Running on the UI Thread", Looper.getMainLooper().getThread() == Thread
                .currentThread());
        assertFalse("Running on the UI Thread", Looper.myLooper() == Looper.getMainLooper());
    }

    @Test
    public void verifyNotOnUiThread() {
        verifyRunsNotOnUiThread();
    }

    @Test
    @UiThreadTest
    public void verifyOnUiThread() {
        verifyRunsOnUiThread();
    }

    @Test
    public void verifyRunTestOnUiThreadMethod() throws Throwable {
        // verify not on UI thread
        verifyRunsNotOnUiThread();
        mUiThreadRule.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                // verify on UI thread
                verifyRunsOnUiThread();
            }
        });
    }

    @Test
    @UiThreadTest
    public void attemptingToRunOnUiThreadFromUiThreadShouldNotFail() throws Throwable {
        // verify on UI thread
        verifyRunsOnUiThread();

        mUiThreadRule.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                // verify still on UI thread
                verifyRunsOnUiThread();
            }
        });
    }

    @Test
    public void verifyExceptionPropagate() throws Throwable {
        final String exceptionMessage = "Don't try this at home";
        try {
            mUiThreadRule.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    throw new IllegalStateException(exceptionMessage);
                }
            });
        } catch (Exception e) {
            assertEquals(IllegalStateException.class, e.getClass());
            assertEquals(exceptionMessage, e.getMessage());
        }
    }

    public static class CheckBeforeAndAfterRunOnUiThread {
        @Rule
        public UiThreadTestRule mUiThreadRule = new UiThreadTestRule();

        @Before
        public void verifyBeforeOnUiThread() {
            verifyRunsOnUiThread();
        }

        @Test
        @UiThreadTest
        public void verifyOnUiThread() {
            verifyRunsOnUiThread();
        }

        @After
        public void verifyAfterOnUiThread() {
            verifyRunsOnUiThread();
        }
    }

    @Test
    public void verifyBeforeAndAfterRunOnUiThread() {
        Result result = runClasses(CheckBeforeAndAfterRunOnUiThread.class);
        assertEquals(0, result.getFailureCount());
    }

    public static class CheckBeforeAndAfterRunNotOnUiThread {
        @Rule
        public UiThreadTestRule mUiThreadRule = new UiThreadTestRule();

        @Before
        public void verifyBeforeNotOnUiThread() {
            verifyRunsNotOnUiThread();
        }

        @Test
        public void verifyRunTestOnUiThreadMethod() throws Throwable {
            // verify not on UI thread
            verifyRunsNotOnUiThread();
            mUiThreadRule.runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    // verify on UI thread
                    verifyRunsOnUiThread();
                }
            });
        }

        @After
        public void verifyAfterNotOnUiThread() {
            verifyRunsNotOnUiThread();
        }
    }

    @Test
    public void verifyBeforeAndAfterRunNotOnUiThread() {
        Result result = runClasses(CheckBeforeAndAfterRunNotOnUiThread.class);
        assertEquals(0, result.getFailureCount());
    }
}
