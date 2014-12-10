/*
 * Copyright (C) 2014 The Android Open Source Project
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

package android.support.test;

import android.support.test.internal.runner.TestRequestBuilder;
import android.support.test.internal.runner.junit4.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import junit.framework.TestCase;

import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.junit.runner.JUnitCore;
import org.junit.runner.Request;
import org.junit.runner.Result;
import org.junit.runner.RunWith;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static android.support.test.InstrumentationRegistry.getArguments;
import static android.support.test.InstrumentationRegistry.getInstrumentation;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class TimeoutTest {
    private static final int GLOBAL_ARG_TIMEOUT = 100;
    private static final int GLOBAL_RULE_TIMEOUT = 50;
    private static final int TEST_TIMEOUT = 25;

    @Test
    public void testTimeoutsInJUnit4WithRule() {
        TestRequestBuilder b = new TestRequestBuilder(new PrintStream(new ByteArrayOutputStream()));
        b.addTestClass(JUnit4WithRuleClass.class.getName());
        b.setPerTestTimeout(GLOBAL_ARG_TIMEOUT);
        Request request = b.build(getInstrumentation(), getArguments()).getRequest();
        JUnitCore junitCore = new JUnitCore();
        Result result = junitCore.run(request);
        assertThat(result.getFailures(), isEmpty());
        assertEquals(2, result.getRunCount());
    }

    @Test
    public void testTimeoutsInJUnit4WithNoRule() {
        TestRequestBuilder b = new TestRequestBuilder(new PrintStream(new ByteArrayOutputStream()));
        b.addTestClass(JUnit4NoRuleClass.class.getName());
        b.setPerTestTimeout(GLOBAL_ARG_TIMEOUT);
        Request request = b.build(getInstrumentation(), getArguments()).getRequest();
        JUnitCore junitCore = new JUnitCore();
        Result result = junitCore.run(request);
        assertThat(result.getFailures(), isEmpty());
        assertEquals(2, result.getRunCount());
    }

    @Test
    public void testTimeoutInJUnit3Style() {
        TestRequestBuilder b = new TestRequestBuilder(new PrintStream(new ByteArrayOutputStream()));
        b.addTestClass(JUnit3StyleClass.class.getName());
        b.setPerTestTimeout(GLOBAL_ARG_TIMEOUT);
        Request request = b.build(getInstrumentation(), getArguments()).getRequest();
        JUnitCore junitCore = new JUnitCore();
        Result result = junitCore.run(request);
        assertEquals(String.format("Test timed out after %s milliseconds", GLOBAL_ARG_TIMEOUT),
                result.getFailures().get(0).getMessage());
    }

    private Matcher<List<?>> isEmpty() {
        return new TypeSafeMatcher<List<?>>() {
            public void describeTo(org.hamcrest.Description description) {
                description.appendText("is empty");
            }

            @Override
            public boolean matchesSafely(List<?> item) {
                return item.size() == 0;
            }
        };
    }

    /**
     * Test various timeout functionality without @RunWith(AndroidJUnit4.class) annotation. By
     * default the Android specific runner should be used.
     */
    public static class JUnit4WithRuleClass {
        @Rule
        public Timeout globalTimeout = new Timeout(GLOBAL_RULE_TIMEOUT);
        @Rule
        public final ExpectedException thrown = ExpectedException.none();

        @Test
        public void checkGlobalRuleTimeoutInterruptsOverArgTimeout() throws InterruptedException {
            thrown.expectMessage(getTimeoutExceptionMessage(GLOBAL_RULE_TIMEOUT));
            Thread.sleep(GLOBAL_ARG_TIMEOUT);
        }

        @Test(timeout = TEST_TIMEOUT)
        public void checkTestTimeoutInterruptsOverAllOthers() throws InterruptedException {
            thrown.expectMessage(getTimeoutExceptionMessage(TEST_TIMEOUT));
            Thread.sleep(GLOBAL_RULE_TIMEOUT);
        }

        private String getTimeoutExceptionMessage(int millis) {
            return String.format("test timed out after %s milliseconds", millis);
        }
    }

    /**
     * Test various timeout functionality with @RunWith(AndroidJUnit4.class) annotation. All
     * Android specific features should still work when RunWith explicitly defined.
     */
    @RunWith(AndroidJUnit4.class)
    public static class JUnit4NoRuleClass {
        @Rule
        public final ExpectedException thrown = ExpectedException.none();

        @Test
        public void checkArgTimeoutInterrupts() throws InterruptedException {
            thrown.expectMessage(getTimeoutExceptionMessage(GLOBAL_ARG_TIMEOUT));
            Thread.sleep(GLOBAL_ARG_TIMEOUT + 1);
        }

        @Test(timeout = TEST_TIMEOUT)
        public void checkTestTimeoutInterruptsOverArgTimeout() throws InterruptedException {
            thrown.expectMessage(getTimeoutExceptionMessage(TEST_TIMEOUT));
            Thread.sleep(GLOBAL_ARG_TIMEOUT);
        }

        private String getTimeoutExceptionMessage(int millis) {
            return String.format("test timed out after %s milliseconds", millis);
        }
    }

    /**
     * Fixture to test timeout functionality for a JUnit3 style test.
     */
    public static class JUnit3StyleClass extends TestCase {
        public void testArgTimeoutInterrupts() throws InterruptedException {
            Thread.sleep(GLOBAL_ARG_TIMEOUT + 10);
        }
    }
}
