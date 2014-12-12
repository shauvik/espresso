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

package android.support.test.espresso.assertion;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.isRoot;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

import android.support.test.espresso.NoMatchingViewException;
import android.support.test.testapp.LayoutIssuesActivity;
import android.support.test.testapp.R;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.LargeTest;

import junit.framework.AssertionFailedError;

/**
 * Integration tests for {@link LayoutAssertions}.
 */
@LargeTest
public class LayoutAssertionsTest extends ActivityInstrumentationTestCase2<LayoutIssuesActivity> {

  public LayoutAssertionsTest() {
    super(LayoutIssuesActivity.class);
  }

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    getActivity();
  }

  public void testAssertNoEllipsizedText() {
    try {
      onView(isRoot()).check(LayoutAssertions.noEllipsizedText());
    } catch (AssertionFailedError expected) { return; }
    fail("Ellipsized text is not detected");
  }

  public void testAssertNoMultilineButtons() {
    onView(withId(R.id.wrap)).perform(click());
    try {
      onView(isRoot()).check(LayoutAssertions.noMultilineButtons());
    } catch (AssertionFailedError expected) { return; }
    fail("Multiline button is not detected");
  }

  public void testAssertNoOverlaps() {
    onView(withId(R.id.length)).perform(click());
    try {
      onView(isRoot()).check(LayoutAssertions.noOverlaps());
    } catch (AssertionFailedError expected) { return; }
    fail("Overlaps are not detected");
  }

  public void testAssertNoOverlapsViewNotFound() {
    onView(withId(R.id.length)).perform(click());
    try {
      onView(withText("nonexistent")).check(LayoutAssertions.noOverlaps());
    } catch (NoMatchingViewException expected) { return; }
    fail("NoMatchingViewException should be thrown");
  }
}
