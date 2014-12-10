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

package android.support.test.espresso;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

import android.support.test.testapp.R;
import android.support.test.testapp.SyncActivity;

import android.os.Handler;
import android.os.Looper;
import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.LargeTest;

import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Test case for {@link AppNotIdleException}.
 */
@LargeTest
public class AppNotIdleExceptionTest extends ActivityInstrumentationTestCase2<SyncActivity> {

  @SuppressWarnings("deprecation")
  public AppNotIdleExceptionTest() {
    // This constructor was deprecated - but we want to support lower API levels.
    super("android.support.test.testapp", SyncActivity.class);
  }

  @Override
  public void setUp() throws Exception {
    super.setUp();
    getActivity();
  }

  public void testAppIdleException() throws Exception {
    final AtomicBoolean continueBeingBusy = new AtomicBoolean(true);
    try {
      final Handler handler = new Handler(Looper.getMainLooper());
      Runnable runnable = new Runnable() {
        @Override
        public void run() {
          if (!continueBeingBusy.get()) {
            return;
          } else {
            handler.post(this);
          }
        }
      };
      FutureTask<Void> task = new FutureTask<Void>(runnable, null);
      handler.post(task);
      task.get(); // Will Make sure that the first post is sent before we do a lookup.
      // Request the "hello world!" text by clicking on the request button.
      onView(withId(R.id.request_button)).perform(click());
      fail("Espresso failed to throw AppNotIdleException");
    } catch (AppNotIdleException e) {
      // Do Nothing. Test pass.
      continueBeingBusy.getAndSet(false);
    }
  }
}
