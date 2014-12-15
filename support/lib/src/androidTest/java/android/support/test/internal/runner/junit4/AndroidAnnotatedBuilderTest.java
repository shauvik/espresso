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

package android.support.test.internal.runner.junit4;

import android.support.test.runner.AndroidJUnit4;
import android.support.test.internal.util.AndroidRunnerParams;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runner.Runner;
import org.junit.runners.JUnit4;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.RunnerBuilder;

import java.lang.reflect.InvocationTargetException;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

public class AndroidAnnotatedBuilderTest {
    RunnerBuilder mMockRunnerBuilder;
    AndroidRunnerParams mMockAndroidRunnerParams;

    @RunWith(AndroidJUnit4.class)
    public class RunWithAndroidJUnit4Class {
    }

    @RunWith(JUnit4.class)
    public class RunWithJUnit4Class {
    }

    public class NoRunWithClass {
    }

    @Before
    public void before() {
        mMockRunnerBuilder = mock(RunnerBuilder.class);
        mMockAndroidRunnerParams = mock(AndroidRunnerParams.class);
    }

    @Test
    public void successfullyCreateAndroidRunner() throws Exception {
        final Runner mockedRunner = mock(Runner.class);
        AndroidAnnotatedBuilder ab = new AndroidAnnotatedBuilder(mMockRunnerBuilder,
                mMockAndroidRunnerParams) {
            @Override
            public Runner buildAndroidRunner(Class<? extends Runner> runnerClass,
                                             Class<?> testClass) throws Exception {
                Assert.assertEquals(runnerClass, AndroidJUnit4.class);
                Assert.assertEquals(testClass, RunWithAndroidJUnit4Class.class);
                return mockedRunner;
            }
        };
        // attempt to create a runner for a class annotated with @RunWith(AndroidJUnit4.class)
        Runner runner = ab.runnerForClass(RunWithAndroidJUnit4Class.class);
        assertEquals(0, runner.testCount());
    }

    @Test(expected = InitializationError.class)
    public void failCreatingAndroidRunner() throws Exception {
        AndroidAnnotatedBuilder ab = new AndroidAnnotatedBuilder(mMockRunnerBuilder,
                mMockAndroidRunnerParams) {
            @Override
            public Runner buildAndroidRunner(Class<? extends Runner> runnerClass,
                                             Class<?> testClass) throws Exception {
                Assert.assertEquals(runnerClass, AndroidJUnit4.class);
                Assert.assertEquals(testClass, RunWithAndroidJUnit4Class.class);
                // return null to simulate runner creation failure, should fall back to default
                // implementation that should throw an Exception
                return null;
            }
        };
        // attempt to create a runner for a class annotated with @RunWith(AndroidJUnit4.class)
        ab.runnerForClass(RunWithAndroidJUnit4Class.class);
    }

    @Test(expected = InvocationTargetException.class)
    public void failRunWithJUnit4() throws Exception {
        AndroidAnnotatedBuilder ab = new AndroidAnnotatedBuilder(mMockRunnerBuilder,
                mMockAndroidRunnerParams) {
            @Override
            public Runner buildAndroidRunner(Class<? extends Runner> runnerClass,
                                             Class<?> testClass) throws Exception {
                Assert.fail("Should not attempt to build Android Runner when test class annotated" +
                        " with @RunWith(JUnit4.class)");
                return null;
            }
        };
        // attempt to create a runner for a class annotated with @RunWith(JUnit4.class)
        ab.runnerForClass(RunWithJUnit4Class.class);
    }

    @Test
    public void testNoRunWith() throws Exception {
        AndroidAnnotatedBuilder ab = new AndroidAnnotatedBuilder(mMockRunnerBuilder,
                mMockAndroidRunnerParams) {
            @Override
            public Runner buildAndroidRunner(Class<? extends Runner> runnerClass,
                                             Class<?> testClass) throws Exception {
                Assert.fail("Should not attempt to build Android Runner no @RunWith " +
                        "annotation is used");
                return null;
            }
        };
        // attempt to create a runner for a class with no @RunWith annotation
        ab.runnerForClass(NoRunWithClass.class);
    }
}

