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

import android.app.Activity;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.Result;
import org.junit.runner.RunWith;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.junit.runner.JUnitCore.runClasses;
import static org.mockito.Mockito.mock;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class ActivityTestRuleTest {

    private static final ActivityFixture MOCK_ACTIVITY = mock(ActivityFixture.class);

    public class ActivityFixture extends Activity {

        private final boolean SUCCESS = true;
    }

    public static class ActivityLifecycleTest {

        private static StringBuilder log = new StringBuilder();

        @Rule
        public ActivityTestRule<ActivityFixture> mActivityRule =
                new ActivityTestRule<ActivityFixture>(ActivityFixture.class) {
                    @Override
                    protected void beforeActivity() {
                        log.append("beforeActivity ");
                    }

                    @Override
                    ActivityFixture launchActivity() {
                        log.append("launchActivity ");
                        return null;
                    }

                    @Override
                    protected void afterActivity() {
                        log.append("afterActivity ");
                    }

                    @Override
                    void finishActivity() {
                        log.append("finishActivity ");
                    }
                };

        @Before
        public void before() {
            log.append("before ");
        }

        @Test
        public void fails() {
            log.append("test ");
            fail("This is a dummy test");
        }


        @After
        public void after() {
            log.append("after ");
        }
    }

    @Test
    public void activityLifecycleTest() {
        Result result = runClasses(ActivityLifecycleTest.class);
        assertEquals(1, result.getFailureCount());
        assertThat(result.getFailures().get(0).getMessage(), is("This is a dummy test"));
        assertThat(ActivityLifecycleTest.log.toString(),
                is("beforeActivity launchActivity before test after finishActivity afterActivity "));
    }

    public static class FailureOfActivityLaunch {

        @Rule
        public ActivityTestRule<ActivityFixture> mActivityRule =
                new ActivityTestRule<>(ActivityFixture.class);

        @Test
        public void emptyTest() {
        }
    }

    @Test
    public void failureOfActivityLaunch() {
        Result result = runClasses(FailureOfActivityLaunch.class);
        assertEquals(1, result.getFailureCount());
        assertEquals(RuntimeException.class, result.getFailures().get(0).getException().getClass());
        assertThat(result.getFailures().get(0).getMessage(), is("Could not launch activity"));
    }

    public static class SuccessfulLaunch {

        @Rule
        public ActivityTestRule<ActivityFixture> mActivityRule =
                new ActivityTestRule<ActivityFixture>(ActivityFixture.class) {
                    @Override
                    ActivityFixture launchActivity() {
                        return MOCK_ACTIVITY;
                    }
                };

        @Test
        public void verifyTheLaunchedActivityIsReturned() {
            assertNotNull(mActivityRule.getActivity());
        }
    }

    @Test
    public void successfulLaunch() {
        Result result = runClasses(SuccessfulLaunch.class);
        assertEquals(0, result.getFailureCount());
    }
}
