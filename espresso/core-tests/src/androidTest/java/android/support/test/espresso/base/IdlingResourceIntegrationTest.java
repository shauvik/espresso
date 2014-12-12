/*
 * Copyright (C) 2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package android.support.test.espresso.base;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.Espresso.pressBack;
import static android.support.test.espresso.Espresso.registerIdlingResources;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.hamcrest.Matchers.is;

import android.support.test.espresso.IdlingResource;
import android.support.test.testapp.SendActivity;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.LargeTest;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Integration test with IdlingResources.
 */
@LargeTest
public class IdlingResourceIntegrationTest extends ActivityInstrumentationTestCase2<SendActivity> {

  private ResettingIdlingResource r1;
  private ResettingIdlingResource r2;

  @SuppressWarnings("deprecation")
  public IdlingResourceIntegrationTest() {
    super("android.support.test.testapp", SendActivity.class);
  }

  @Override
  public void setUp() throws Exception {
    super.setUp();
    r1 = new ResettingIdlingResource("SlowResource", 6000);
    r2 = new ResettingIdlingResource("FastResource", 500);
    registerIdlingResources(r1, r2);
    getActivity();
  }

  public void testClickWithCustomIdlingResources() {
    onView(withText(equalToIgnoringCase("send"))).perform(click());
    r1.reset();
    r2.reset();
    onView(withText(is("Data from sender"))).check(matches(isDisplayed()));
    r1.reset();
    r2.reset();
    pressBack();
    r1.reset();
    r2.reset();
    onView(withText(equalToIgnoringCase("send"))).perform(click());
    r1.reset();
    r2.reset();
    pressBack();
    r1.reset();
    r2.reset();
    onView(withText(equalToIgnoringCase("send"))).perform(click());
  }

  private class ResettingIdlingResource implements IdlingResource {
    private final String name;
    private final long delay;
    private final AtomicBoolean isIdle = new AtomicBoolean(false);
    private final ScheduledExecutorService pool;
    
    private ResourceCallback callback;

    public ResettingIdlingResource(String name, long delay) {
      this.name = name;
      this.delay = delay;
      this.pool = Executors.newScheduledThreadPool(1);
    }

    @Override
    public void registerIdleTransitionCallback(final ResourceCallback callback) {
      this.callback = callback;
      scheduleDelayedCallback();
    }

    private void scheduleDelayedCallback() {
      pool.schedule(new Runnable() {
        @Override
        public void run() {
          callback.onTransitionToIdle();
          isIdle.set(true);
        }
      }, delay, TimeUnit.MILLISECONDS);
    }

    @Override
    public boolean isIdleNow() {
      return isIdle.get();
    }

    @Override
    public String getName() {
      return name;
    }

    public void reset() {
      isIdle.set(false);
      scheduleDelayedCallback();
    }
  }
}
