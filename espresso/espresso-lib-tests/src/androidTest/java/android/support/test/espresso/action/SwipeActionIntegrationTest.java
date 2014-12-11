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
import static android.support.test.espresso.action.ViewActions.swipeDown;
import static android.support.test.espresso.action.ViewActions.swipeLeft;
import static android.support.test.espresso.action.ViewActions.swipeRight;
import static android.support.test.espresso.action.ViewActions.swipeUp;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.hasDescendant;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

import android.support.test.espresso.ViewAction;
import android.support.test.testapp.R;
import android.support.test.testapp.SwipeActivity;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.LargeTest;

/**
 * Integration tests for swiping actions.
 */
@LargeTest
public class SwipeActionIntegrationTest extends ActivityInstrumentationTestCase2<SwipeActivity> {

  @SuppressWarnings("deprecation")
  public SwipeActionIntegrationTest() {
    // Keep froyo happy.
    super("android.support.test.testapp", SwipeActivity.class);
  }

  @Override
  public void setUp() throws Exception {
    super.setUp();
    getActivity();
  }

  /** Tests that a small view can be swiped in both directions. */
  public void testSwipeOverSmallView() {
    onView(withId(R.id.small_pager))
      .check(matches(hasDescendant(withText("Position #0"))))
      .perform(swipeLeft())
      .check(matches(hasDescendant(withText("Position #1"))))
      .perform(swipeLeft())
      .check(matches(hasDescendant(withText("Position #2"))))
      .perform(swipeRight())
      .check(matches(hasDescendant(withText("Position #1"))))
      .perform(swipeRight())
      .check(matches(hasDescendant(withText("Position #0"))));
  }

  /** Tests that a view can be swiped outwards from its edge. */
  public void testSwipeOutwardFromEdge() {
    onView(withId(R.id.small_pager))
      .check(matches(hasDescendant(withText("Position #0"))))
      .perform(swipeLeftFromLeftEdge())
      .check(matches(hasDescendant(withText("Position #1"))))
      .perform(swipeLeftFromLeftEdge())
      .check(matches(hasDescendant(withText("Position #2"))));
  }

  /**
   * Like {@link ViewActions#swipeLeft()}, but starts at the left edge of the view.
   */
  private static ViewAction swipeLeftFromLeftEdge() {
    CoordinatesProvider startPoint = GeneralLocation.CENTER_LEFT;
    CoordinatesProvider endPoint = GeneralLocation.translate(startPoint, -1.0f, 0);
    return new GeneralSwipeAction(Swipe.FAST, startPoint, endPoint, Press.FINGER);
  }

  /** Tests that trying to swipe beyond the start of a view pager has no effect. */
  public void testSwipingRightHasNoEffectWhenAtStart() {
    onView(withId(R.id.small_pager))
      .check(matches(hasDescendant(withText("Position #0"))))
      .perform(swipeRight())
      .check(matches(hasDescendant(withText("Position #0"))))
      .perform(swipeRight())
      .check(matches(hasDescendant(withText("Position #0"))));
  }

  /** Tests that trying to swipe beyond the end of a view pager has no effect. */
  public void testSwipingLeftHasNoEffectWhenAtEnd() {
    onView(withId(R.id.small_pager))
      .perform(swipeLeft())
      .perform(swipeLeft())
      .check(matches(hasDescendant(withText("Position #2"))))
      .perform(swipeLeft())
      .check(matches(hasDescendant(withText("Position #2"))))
      .perform(swipeLeft())
      .check(matches(hasDescendant(withText("Position #2"))));
  }

  /** Tests that swiping across a partially overlapped view works correctly. */
  public void testSwipeOverPartiallyOverlappedView() {
    onView(withId(R.id.overlapped_pager))
      .check(matches(hasDescendant(withText("Position #0"))))
      .perform(swipeLeft())
      .check(matches(hasDescendant(withText("Position #1"))))
      .perform(swipeRight())
      .check(matches(hasDescendant(withText("Position #0"))));
  }

  /** Tests that trying to swipe a view that doesn't respond to swipes has no effect. */
  @SuppressWarnings("unchecked")
  public void testSwipeOverUnswipableView() {
    onView(withId(R.id.text_simple))
      .check(matches(allOf(isDisplayed(), withText(R.string.text_simple))))
      .perform(swipeLeft())
      .check(matches(allOf(isDisplayed(), withText(R.string.text_simple))))
      .perform(swipeRight())
      .check(matches(allOf(isDisplayed(), withText(R.string.text_simple))));
  }

  /** Tests that a vertical paper can be swiped up and down */
  public void testSwipeOverVerticalPager() {
    onView(withId(R.id.vertical_pager))
      .check(matches(hasDescendant(withText("Position #0"))))
      .perform(swipeUp())
      .check(matches(hasDescendant(withText("Position #1"))))
      .perform(swipeUp())
      .check(matches(hasDescendant(withText("Position #2"))))
      .perform(swipeDown())
      .check(matches(hasDescendant(withText("Position #1"))))
      .perform(swipeDown())
      .check(matches(hasDescendant(withText("Position #0"))));
  }

  /** Tests that trying to swipe beyond the start of a vertical view pager has no effect. */
  public void testSwipingDownHasNoEffectWhenAtStart() {
    onView(withId(R.id.vertical_pager))
      .check(matches(hasDescendant(withText("Position #0"))))
      .perform(swipeDown())
      .check(matches(hasDescendant(withText("Position #0"))))
      .perform(swipeDown())
      .check(matches(hasDescendant(withText("Position #0"))));
  }

  /** Tests that trying to swipe beyond the end of a vertical view pager has no effect. */
  public void testSwipingUpHasNoEffectWhenAtEnd() {
    onView(withId(R.id.vertical_pager))
      .perform(swipeUp())
      .perform(swipeUp())
      .check(matches(hasDescendant(withText("Position #2"))))
      .perform(swipeUp())
      .check(matches(hasDescendant(withText("Position #2"))))
      .perform(swipeUp())
      .check(matches(hasDescendant(withText("Position #2"))));
  }
}
