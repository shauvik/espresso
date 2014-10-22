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
package android.support.test.internal.runner.junit3;

import android.support.test.internal.util.AndroidRunnerParams;

import junit.framework.Test;
import junit.framework.TestResult;
import junit.framework.TestSuite;

import org.junit.Ignore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * An extension of {@link TestSuite} that supports Android construct injection into test cases,
 * and properly supports test timeouts and annotation filtering of test cases.
 * <p/>
 * Also tries to use {@link NonLeakyTestSuite} where possible to save memory.
 */
@Ignore
class AndroidTestSuite extends DelegatingFilterableTestSuite {

    private final AndroidRunnerParams mAndroidRunnerParams;

    public AndroidTestSuite(Class<?> testClass, AndroidRunnerParams runnerParams) {
        this(new NonLeakyTestSuite(testClass), runnerParams);
    }

    public AndroidTestSuite(TestSuite s, AndroidRunnerParams runnerParams) {
        super(s);
        mAndroidRunnerParams = runnerParams;
    }

    @Override
    public void run(TestResult result) {
        // wrap the result in a new AndroidTestResult to do the bundle and instrumentation injection
        AndroidTestResult androidTestResult = new AndroidTestResult(
                mAndroidRunnerParams.getBundle(),
                mAndroidRunnerParams.getInstrumentation(),
                result);

        long timeout = mAndroidRunnerParams.getPerTestTimeout();
        if (timeout > 0) {
            runTestsWithTimeout(timeout, androidTestResult);
        } else {
            super.run(androidTestResult);
        }
    }

    /**
     * Executes all tests within a {@link junit.framework.TestSuite} individually on a separate
     * thread with a specified timeout.
     */
    private void runTestsWithTimeout(long timeout, AndroidTestResult result) {
        int suiteSize = testCount();
        for (int i = 0; i < suiteSize; i++) {
            Test test = testAt(i);
            try {
                runTestWithTimeout(test, result, timeout);
            } catch (Throwable throwable) {
                result.notifyFailureAndFinish(test, throwable);
            }
        }
    }

    /**
     * Executes {@link junit.framework.Test} on a separate thread with a specified timeout.
     */
    private void runTestWithTimeout(final Test test,
                                    final AndroidTestResult androidTestResult,
                                    final long timeout) throws Throwable {

        // Create a new thread to execute the test on
        ExecutorService threadExecutor = Executors.newSingleThreadExecutor();
        // Wraps test execution in a Runnable so that it can be passed to the new thread
        final Runnable execRunnable = new Runnable() {
            @Override
            public void run() {
                test.run(androidTestResult);
            }
        };

        try {
            // executes test and waits if necessary for at most the given time for the execution
            // to complete
            threadExecutor.submit(execRunnable).get(timeout, TimeUnit.MILLISECONDS);
        } catch (TimeoutException e) {
            throw new TimeoutException(String.format(
                    "Test timed out after %d milliseconds", timeout));
        } finally {
            threadExecutor.shutdownNow();
        }
    }
}
