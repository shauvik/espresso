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

package android.support.test.testapp;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.Espresso.pressBack;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

import android.support.test.filters.SdkSuppress;

import android.test.ActivityInstrumentationTestCase2;

public class TaskStackTest extends ActivityInstrumentationTestCase2<TaskStackActivity> {

  public TaskStackTest() {
    super(TaskStackActivity.class);
  }

  @Override
  public void setUp() throws Exception {
    super.setUp();
    getActivity();
  }

  // The task stack behavior is available on API level 11 and up.
 @SdkSuppress(minSdkVersion=10)
  public void testTaskStack() {
    onView(withText("display activity")).check(matches(isDisplayed()));
    pressBack();
    onView(withText("tool bar activity")).check(matches(isDisplayed()));
    pressBack();
    onView(withText("drawer activity")).check(matches(isDisplayed()));
  }
}
