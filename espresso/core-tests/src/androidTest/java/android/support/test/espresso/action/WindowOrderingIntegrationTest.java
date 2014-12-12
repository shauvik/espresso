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
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.scrollTo;
import static android.support.test.espresso.assertion.ViewAssertions.doesNotExist;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

import android.support.test.testapp.R;
import android.support.test.testapp.SendActivity;

import android.os.Build;
import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.LargeTest;

/**
 * Ensures view root ordering works properly.
 */
@LargeTest
public class WindowOrderingIntegrationTest extends ActivityInstrumentationTestCase2<SendActivity> {
  @SuppressWarnings("deprecation")
  public WindowOrderingIntegrationTest() {
    // Supporting froyo.
    super("android.support.test.testapp", SendActivity.class);
  }

  @Override
  public void setUp() throws Exception {
    super.setUp();
    getActivity();
  }

  public void testPopupMenu() {
    if (Build.VERSION.SDK_INT < 11) {
      // popup menus are post honeycomb.
      return;
    }
    onView(withText(R.string.item_1_text))
        .check(doesNotExist());
    onView(withId(R.id.make_popup_menu_button))
        .perform(scrollTo(), click());
    onView(withText(R.string.item_1_text))
        .check(matches(isDisplayed()))
        .perform(click());
    onView(withText(R.string.item_1_text))
        .check(doesNotExist());
  }

  public void testPopupWindow() {
    getActivity();
    onView(withId(R.id.popup_title))
        .check(doesNotExist());
    onView(withId(R.id.make_popup_view_button))
        .perform(scrollTo(), click());
    onView(withId(R.id.popup_title))
        .check(matches(withText(R.string.popup_title)))
        .perform(click());
    onView(withId(R.id.popup_title))
        .check(doesNotExist());
  }

  public void testDialog() {
    onView(withText(R.string.dialog_title))
        .check(doesNotExist());
    onView(withId(R.id.make_alert_dialog))
        .perform(scrollTo(), click());
    onView(withText(R.string.dialog_title))
        .check(matches(isDisplayed()));

    onView(withText("Fine"))
        .perform(click());

    onView(withText(R.string.dialog_title))
        .check(doesNotExist());
  }
}
