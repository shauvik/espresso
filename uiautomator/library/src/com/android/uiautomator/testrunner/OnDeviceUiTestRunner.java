/*
 * Copyright (C) 2013 The Android Open Source Project
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

package com.android.uiautomator.testrunner;

import android.test.AndroidTestRunner;
import android.test.InstrumentationTestRunner;

import junit.framework.TestCase;
import junit.framework.TestResult;

import java.util.List;

/**
 * Test runner for {@link OnDeviceUiTestCase}s. Such tests are executed
 * on the device and have access to an applications context.
 */
public class OnDeviceUiTestRunner extends InstrumentationTestRunner {

    @Override
    protected AndroidTestRunner getAndroidTestRunner() {
        return new AndroidTestRunner() {
            @Override
            public void runTest(TestResult testResult) {
                List<TestCase> testCases = getTestCases();
                final int testCaseCount = testCases.size();
                for (int i = 0; i < testCaseCount; i++) {
                    TestCase testCase = testCases.get(i);
                    if (testCase instanceof OnDeviceUiTestCase) {
                        OnDeviceUiTestCase uiTestCase = (OnDeviceUiTestCase) testCase;
                        uiTestCase.initialize(OnDeviceUiTestRunner.this.getUiAutomation(),
                                getArguments());
                    }
                }
                super.runTest(testResult);
            }
        };
    }
}
