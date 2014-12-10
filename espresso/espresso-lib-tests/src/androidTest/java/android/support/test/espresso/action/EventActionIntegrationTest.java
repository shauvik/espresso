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
import static android.support.test.espresso.action.ViewActions.doubleClick;
import static android.support.test.espresso.action.ViewActions.longClick;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isAssignableFrom;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;

import android.support.test.filters.SdkSuppress;

import android.support.test.espresso.UiController;
import android.support.test.espresso.ViewAction;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.testapp.GestureActivity;
import android.support.test.testapp.R;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.LargeTest;
import android.view.View;

import org.hamcrest.Matcher;

/**
 * UI tests for ClickAction, LongClickAction and DoubleClickAction.
 */
@LargeTest
public class EventActionIntegrationTest extends ActivityInstrumentationTestCase2<GestureActivity> {

  @SuppressWarnings("deprecation")
  public EventActionIntegrationTest() {
    // Keep froyo happy.
    super("android.support.test.testapp", GestureActivity.class);
  }

  @Override
  public void setUp() throws Exception {
    super.setUp();
    getActivity();
  }

  public void testClick() {
    onView(withText(is(getActivity().getString(R.string.text_click))))
        .check(matches(not(isDisplayed())));
    onView(withId(is(R.id.gesture_area))).perform(click());
    onView(withId(is(R.id.text_click))).check(matches(isDisplayed()));
    onView(withText(is(getActivity().getString(R.string.text_click))))
        .check(matches(isDisplayed()));
  }

  public void testBadClick() {
    onView(withText(is(getActivity().getString(R.string.text_click))))
        .check(matches(not(isDisplayed())));
    getActivity().setTouchDelay(700);

    onView(withId(is(R.id.gesture_area))).perform(click(
        new ViewAction() {
          @Override
          public String getDescription() {
            return "Handle tap->longclick.";
          }
          @Override
          public Matcher<View> getConstraints() {
            return isAssignableFrom(View.class);
          }
          @Override
          public void perform(UiController uiController, View view) {
            getActivity().setTouchDelay(0);
          }
        }));


    onView(withId(is(R.id.text_click))).check(matches(isDisplayed()));
    onView(withText(is(getActivity().getString(R.string.text_click))))
        .check(matches(isDisplayed()));
  }

  @SdkSuppress(minSdkVersion = 14)
  public void testLongClick() {
    onView(withText(is(getActivity().getString(R.string.text_long_click))))
        .check(matches(not(isDisplayed())));
    onView(withId(is(R.id.gesture_area))).perform(longClick());
    onView(withId(is(R.id.text_long_click))).check(matches(isDisplayed()));
    onView(withText(is(getActivity().getString(R.string.text_long_click))))
        .check(matches(isDisplayed()));
  }

    @SdkSuppress(minSdkVersion = 14)
  public void testDoubleClick() {
    onView(withText(is(getActivity().getString(R.string.text_double_click))))
        .check(matches(not(ViewMatchers.isDisplayed())));
    onView(withId(is(R.id.gesture_area))).perform(doubleClick());
    onView(withId(is(R.id.text_double_click))).check(matches(isDisplayed()));
    onView(withText(is("Double Click"))).check(matches(isDisplayed()));
    onView(withText(is(getActivity().getString(R.string.text_double_click))))
        .check(matches(isDisplayed()));
  }
}
