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

package android.support.test.espresso.action;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.scrollTo;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

import android.support.test.testapp.PaddingActivity;
import android.support.test.testapp.R;

import android.test.ActivityInstrumentationTestCase2;

/**
 * Tests padding within a scrollview.
 */
public class PaddingActivityTest extends ActivityInstrumentationTestCase2<PaddingActivity> {

  @SuppressWarnings("deprecation")
  public PaddingActivityTest() {
    // Supporting froyo.
    super("android.support.test.testapp", PaddingActivity.class);
  }

  @Override
  public void setUp() throws Exception {
    super.setUp();
    getActivity();
  }

  @SuppressWarnings("unchecked")
  public void testTextViewWithHugePadding() {
    onView(withId(R.id.view_with_padding))
        .perform(scrollTo(), typeText("Hello World"));
  }
}
