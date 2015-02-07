/*
 * Copyright (C) 2012 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package android.support.test.runner;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.test.internal.runner.listener.InstrumentationResultPrinter;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Unit tests for {@link AndroidJUnitRunner}.
 */
public class AndroidJUnitRunnerTest {
    public static final int SLEEP_TIME = 300;

    private final Thread mInstantiationThread = Thread.currentThread();

    private AndroidJUnitRunner mAndroidJUnitRunner;
    private PrintStream mStubStream;

    @Mock
    private Context mMockContext;
    @Mock
    private InstrumentationResultPrinter mInstrumentationResultPrinter;

    @Before
    public void setUp() throws Exception {
        mAndroidJUnitRunner = new AndroidJUnitRunner() {

            @Override
            public Context getContext() {
                return mMockContext;
            }

            @Override
            InstrumentationResultPrinter getInstrumentationResultPrinter() {
                return mInstrumentationResultPrinter;
            }
        };
        mStubStream = new PrintStream(new ByteArrayOutputStream());
        MockitoAnnotations.initMocks(this);
    }

    /**
     * Ensures that the main looper is not blocked and can process
     * messages during test execution.
     */
    @Test
    public void testMainLooperIsAlive() throws InterruptedException {
        final boolean[] called = new boolean[1];
        Handler handler = new Handler(Looper.getMainLooper()) {
            @Override
            public void handleMessage(Message msg) {
                called[0] = true;
            }
        };
        handler.sendEmptyMessage(0);
        Thread.sleep(SLEEP_TIME);
        Assert.assertTrue(called[0]);
    }

    /**
     * Ensures that the thread the test runs on has not been
     * prepared as a looper.  It doesn't make sense for it
     * to be a looper because it will be blocked for the entire
     * duration of test execution.  Tests should instead post
     * messages to the main looper or a new handler thread
     * of their own as appropriate while running.
     */
    @Test
    public void testTestThreadIsNotALooper() {
        Assert.assertNull(Looper.myLooper());
    }

    /**
     * Ensure the correct exception is passed to
     * {@link InstrumentationResultPrinter#reportProcessCrash(Throwable)}
     */
    @Test
    public void testInstrResultPrinter_reportProcessCrash() {
        Throwable e = new RuntimeException();
        mAndroidJUnitRunner.getInstrumentationResultPrinter();
        mAndroidJUnitRunner.onException(this, e);
        Mockito.verify(mInstrumentationResultPrinter).reportProcessCrash(e);
    }
}
