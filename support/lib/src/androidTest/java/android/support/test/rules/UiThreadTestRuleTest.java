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

package android.support.test.rules;

import android.os.Looper;
import android.support.test.UiThreadTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Rule;
import org.junit.Test;

public class UiThreadTestRuleTest {

    @Rule
    public UiThreadTestRule mUiThreadRule = new UiThreadTestRule();

    @Test
    public void verifyNotOnUiThread() {
        assertFalse(Looper.getMainLooper().getThread() == Thread.currentThread());
        assertFalse(Looper.myLooper() == Looper.getMainLooper());
    }

    @Test
    @UiThreadTest
    public void verifyOnUiThread() {
        assertTrue(Looper.getMainLooper().getThread() == Thread.currentThread());
        assertTrue(Looper.myLooper() == Looper.getMainLooper());
    }

    @Test
    public void verifyRunTestOnUiThreadMethod() throws Throwable {
        // verify not on UI thread
        assertFalse(Looper.getMainLooper().getThread() == Thread.currentThread());
        assertFalse(Looper.myLooper() == Looper.getMainLooper());
        mUiThreadRule.runTestOnUiThread(new Runnable() {
            @Override
            public void run() {
                // verify on UI thread
                assertTrue(Looper.getMainLooper().getThread() == Thread.currentThread());
                assertTrue(Looper.myLooper() == Looper.getMainLooper());
            }
        });
    }

    @Test
    @UiThreadTest
    public void attemptingToRunOnUiThreadFromUiThreadShouldFail() throws Throwable {
        // verify on UI thread
        assertTrue(Looper.getMainLooper().getThread() == Thread.currentThread());
        assertTrue(Looper.myLooper() == Looper.getMainLooper());

        try {
            mUiThreadRule.runTestOnUiThread(new Runnable() {
                @Override
                public void run() {
                    fail("Should never reach here, RuntimeException is expected");
                }
            });
        } catch (Exception e) {
            assertEquals(RuntimeException.class, e.getClass());
            assertEquals("This method can not be called from the main application thread",
                    e.getMessage());
        }
    }
}
