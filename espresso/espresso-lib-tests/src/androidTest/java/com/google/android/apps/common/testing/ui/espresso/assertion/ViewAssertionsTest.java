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

package com.google.android.apps.common.testing.ui.espresso.assertion;

import static com.google.android.apps.common.testing.ui.espresso.assertion.ViewAssertions.matches;
import static com.google.android.apps.common.testing.ui.espresso.assertion.ViewAssertions.selectedDescendantsMatch;
import static com.google.android.apps.common.testing.ui.espresso.matcher.ViewMatchers.hasContentDescription;
import static com.google.android.apps.common.testing.ui.espresso.matcher.ViewMatchers.isAssignableFrom;
import static com.google.android.apps.common.testing.ui.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.nullValue;

import com.google.android.apps.common.testing.ui.espresso.NoMatchingViewException;

import android.test.InstrumentationTestCase;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import junit.framework.AssertionFailedError;

import org.hamcrest.Matcher;

/**
 * Unit tests for {@link ViewAssertions}.
 */
public class ViewAssertionsTest extends InstrumentationTestCase {

  private View presentView;
  private View absentView;
  private NoMatchingViewException absentException;
  private NoMatchingViewException presentException;
  private Matcher<View> alwaysAccepts;
  private Matcher<View> alwaysFails;
  private Matcher<View> nullViewMatcher;

  @Override
  public void setUp() throws Exception {
    super.setUp();
    presentView = new View(getInstrumentation().getTargetContext());
    absentView = null;
    absentException = null;
    alwaysAccepts = is(presentView);
    alwaysFails = not(is(presentView));
    nullViewMatcher = nullValue();

    presentException = new NoMatchingViewException.Builder()
        .withViewMatcher(alwaysFails)
        .withRootView(new View(getInstrumentation().getTargetContext()))
        .build();
  }

  public void testViewPresent_MatcherFail() {
    try {
      matches(alwaysFails).check(presentView, absentException);
    } catch (AssertionFailedError expected) {
      return;
    }
    // cannot place inside try block, would be caught.
    fail("Should not accept.");
  }

  public void testViewPresent_MatcherPass() {
    try {
      matches(alwaysAccepts).check(presentView, absentException);
    } catch (AssertionError error) {
      throw new RuntimeException("Should not die!!!", error);
    }
  }

  public void testViewAbsent_Unexpectedly() {
    try {
      matches(alwaysAccepts).check(absentView, presentException);
    } catch (NoMatchingViewException expected) {
      return;
    }

    fail("should not accept, view not present.");
  }

  public void testViewAbsent_AndThatsWhatIWant() {
    try {
      matches(nullViewMatcher).check(absentView, presentException);
    } catch (NoMatchingViewException expected) {
      return;
    }

    fail("should not accept, view not present.");
  }

  public void testSelectedDescendantsMatch_ThereAreNone() {
    View grany = setUpViewHierarchy();

    try {
      selectedDescendantsMatch(withText("welfjkw"), hasContentDescription())
          .check(grany, absentException);
    } catch (AssertionError error) {
      throw new RuntimeException("Should not die!!!", error);
    }
  }

  public void testSelectedDescendantsMatch_SelectedDescendantsMatch() {
    View grany = setUpViewHierarchy();

    try {
      selectedDescendantsMatch(withText("has content description"), hasContentDescription())
          .check(grany, absentException);
    } catch (AssertionError error) {
      throw new RuntimeException("Should not die!!!", error);
    }
  }

  public void testSelectedDescendantsMatch_SelectedDescendantsDoNotMatch() {
    View grany = setUpViewHierarchy();

    try {
      selectedDescendantsMatch(withText("no content description"), hasContentDescription())
          .check(grany, absentException);
    } catch (AssertionFailedError expected) {
      return;
    }

    fail("should fail because descendants do not match.");
  }

  public void testSelectedDescendantsMatch_SelectedDescendantsMatchAndDoNotMatch() {
    View grany = setUpViewHierarchy();

    try {
      selectedDescendantsMatch(isAssignableFrom(TextView.class), hasContentDescription())
          .check(grany, absentException);
    } catch (AssertionFailedError expected) {
      return;
    }

    fail("should fail because not all descendants match.");
  }

  private View setUpViewHierarchy() {
    TextView v1 = new TextView(getInstrumentation().getTargetContext());
    v1.setText("no content description");
    TextView v2 = new TextView(getInstrumentation().getTargetContext());
    v2.setText("has content description");
    v2.setContentDescription("content description");
    ViewGroup parent = new RelativeLayout(getInstrumentation().getTargetContext());
    View grany = new ScrollView(getInstrumentation().getTargetContext());
    ((ViewGroup) grany).addView(parent);
    parent.addView(v1);
    parent.addView(v2);

    return grany;
  }
}
