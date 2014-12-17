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

import static android.support.test.espresso.matcher.ViewMatchers.assertThat;
import static android.support.test.espresso.util.TreeIterables.breadthFirstViewTraversal;
import static com.google.common.base.Preconditions.checkNotNull;
import static org.hamcrest.Matchers.is;

import android.support.test.espresso.AmbiguousViewMatcherException;
import android.support.test.espresso.NoMatchingViewException;
import android.support.test.espresso.ViewAssertion;
import android.support.test.espresso.util.HumanReadables;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import org.hamcrest.Matcher;
import org.hamcrest.StringDescription;

import java.util.Iterator;

/**
 * A collection of {@link ViewAssertion}s for checking relative position of elements on the screen.
 */
public final class PositionAssertions {

  private static final String TAG = "PositionAssertions";

  private PositionAssertions() {}

  /**
   * Returns a {@link ViewAssertion} that asserts that view displayed is completely left of
   * the view matching the given matcher.
   *
   * @throws AssertionFailedError if there is more than 1 pixel of horizontal overlap.
   * @throws AmbiguousViewMatcherException if more than one view matches the given matcher.
   * @throws NoMatchingViewException if no views match the given matcher.
   */
  public static ViewAssertion isLeftOf(Matcher<View> matcher) {
    return relativePositionOf(matcher, Position.LEFT_OF);
  }

  /**
   * Returns a {@link ViewAssertion} that asserts that view displayed is completely right of
   * the view matching the given matcher.
   *
   * @throws AssertionFailedError if there is more than 1 pixel of horizontal overlap.
   * @throws AmbiguousViewMatcherException if more than one view matches the given matcher.
   * @throws NoMatchingViewException if no views match the given matcher.
   */
  public static ViewAssertion isRightOf(Matcher<View> matcher) {
    return relativePositionOf(matcher, Position.RIGHT_OF);
  }

  /**
   * Returns a {@link ViewAssertion} that asserts that view displayed is completely aligned
   * to the left as the view matching the given matcher.
   *
   * <p>The left 'x' coordinate of the view displayed must equal the left 'x'
   * coordinate of the view matching the given matcher.
   *
   * @throws AssertionFailedError if the views are not aligned to the left.
   * @throws AmbiguousViewMatcherException if more than one view matches the given matcher.
   * @throws NoMatchingViewException if no views match the given matcher.
   */
  public static ViewAssertion isLeftAlignedWith(Matcher<View> matcher) {
    return relativePositionOf(matcher, Position.LEFT_ALIGNED);
  }

  /**
   * Returns a {@link ViewAssertion} that asserts that view displayed is completely aligned
   * to the right as the view matching the given matcher.
   *
   * <p>The right 'x' coordinate of the view displayed must equal the right 'x'
   * coordinate of the view matching the given matcher.
   *
   * @throws AssertionFailedError if the views are not aligned to the right.
   * @throws AmbiguousViewMatcherException if more than one view matches the given matcher.
   * @throws NoMatchingViewException if no views match the given matcher.
   */
  public static ViewAssertion isRightAlignedWith(Matcher<View> matcher) {
    return relativePositionOf(matcher, Position.RIGHT_ALIGNED);
  }

  /**
   * Returns an Assertion that asserts that view displayed is completely above
   * the view matching the given matcher.
   *
   * @throws AssertionFailedError if there is more than 1 pixel of vertical overlap.
   * @throws AmbiguousViewMatcherException if more than one view matches the given matcher.
   * @throws NoMatchingViewException if no views match the given matcher.
   */
  public static ViewAssertion isAbove(Matcher<View> matcher) {
    return relativePositionOf(matcher, Position.ABOVE);
  }

  /**
   * Returns a {@link ViewAssertion} that asserts that view displayed is completely
   * below the view matching the given matcher.
   *
   * @throws AssertionFailedError if there is more than 1 pixel of vertical overlap.
   * @throws AmbiguousViewMatcherException if more than one view matches the given matcher.
   * @throws NoMatchingViewException if no views match the given matcher.
   */
  public static ViewAssertion isBelow(Matcher<View> matcher) {
    return relativePositionOf(matcher, Position.BELOW);
  }

  /**
   * Returns a {@link ViewAssertion} that asserts that view displayed is completely
   * aligned to bottom with the view matching the given matcher.
   *
   * <p>The bottom 'y' coordinate of the view displayed must equal the bottom 'y'
   * coordinate of the view matching the given matcher.
   *
   * @throws AssertionFailedError if the views are not aligned bottom.
   * @throws AmbiguousViewMatcherException if more than one view matches the given matcher.
   * @throws NoMatchingViewException if no views match the given matcher.
   */
  public static ViewAssertion isBottomAlignedWith(Matcher<View> matcher) {
    return relativePositionOf(matcher, Position.BOTTOM_ALIGNED);
  }

  /**
   * Returns a {@link ViewAssertion} that asserts that view displayed is completely
   *  aligned to top with the view matching the given matcher.
   *
   * <p>The top 'y' coordinate of the view displayed must equal the top 'y'
   * coordinate of the view matching the given matcher.
   *
   * @throws AssertionFailedError if the views are not aligned top.
   * @throws AmbiguousViewMatcherException if more than one view matches the given matcher.
   * @throws NoMatchingViewException if no views match the given matcher.
   */
  public static ViewAssertion isTopAlignedWith(Matcher<View> matcher) {
    return relativePositionOf(matcher, Position.TOP_ALIGNED);
  }

  static ViewAssertion relativePositionOf(final Matcher<View> viewMatcher,
      final Position position) {
    checkNotNull(viewMatcher);
    return new ViewAssertion(){
      @Override
      public void check(final View foundView, NoMatchingViewException noViewException) {
        StringDescription description = new StringDescription();
        if (noViewException != null) {
          description.appendText(String.format(
              "' check could not be performed because view '%s' was not found.\n",
              noViewException.getViewMatcherDescription()));
          Log.e(TAG, description.toString());
          throw noViewException;
        } else {
          // TODO(user): describe the foundView matcher instead of the foundView it self.
          description.appendText("View:").appendText(HumanReadables.describe(foundView))
              .appendText(" is not ")
              .appendText(position.toString())
              .appendText(" view ")
              .appendText(viewMatcher.toString());
          assertThat(description.toString(), isRelativePosition(foundView, findView(viewMatcher,
            getTopViewGroup(foundView)), position), is(true));
        }
      }
    };
  }

  // Helper methods
  static View findView(final Matcher<View> toView, View root) {
    Preconditions.checkNotNull(toView);
    Preconditions.checkNotNull(root);
    final Predicate<View> viewPredicate = new Predicate<View>() {
      @Override
      public boolean apply(View input) {
        return toView.matches(input);
      }
    };
    Iterator<View> matchedViewIterator  =
        Iterables.filter(breadthFirstViewTraversal(root), viewPredicate).iterator();
    View matchedView = null;
    while (matchedViewIterator.hasNext()) {
      if (matchedView != null) {
        // Ambiguous!
        throw new AmbiguousViewMatcherException.Builder()
          .withRootView(root)
          .withViewMatcher(toView)
          .withView1(matchedView)
          .withView2(matchedViewIterator.next())
          .withOtherAmbiguousViews(Iterators.toArray(matchedViewIterator, View.class))
          .build();
      } else {
        matchedView = matchedViewIterator.next();
      }
    }
    if (matchedView == null){
      throw new NoMatchingViewException.Builder()
        .withViewMatcher(toView)
        .withRootView(root)
        .build();
    }
    return matchedView;
  }

  private static ViewGroup getTopViewGroup(View view) {
    ViewParent currentParent = view.getParent();
    ViewGroup topView = null;
    while (currentParent != null) {
      if (currentParent instanceof ViewGroup) {
        topView = (ViewGroup) currentParent;
      }
      currentParent = currentParent.getParent();
    }
    return topView;
  }

  static boolean isRelativePosition(View view1, View view2, Position position) {
    int[] location1 = new int[2];
    int[] location2 = new int[2];
    view1.getLocationOnScreen(location1);
    view2.getLocationOnScreen(location2);

    switch (position) {
      case LEFT_OF:
        return location1[0] + view1.getWidth() <= location2[0];
      case RIGHT_OF:
        return location2[0] + view2.getWidth() <= location1[0];
      case ABOVE:
        return location1[1] + view1.getHeight() <= location2[1];
      case BELOW:
        return location2[1] + view2.getHeight() <= location1[1];
      case LEFT_ALIGNED:
        return location1[0] == location2[0];
      case RIGHT_ALIGNED:
        return location1[0] + view1.getWidth() == location2[0] + view2.getWidth();
      case TOP_ALIGNED:
        return location1[1] == location2[1];
      case BOTTOM_ALIGNED:
        return location1[1] + view1.getHeight() == location2[1] + view2.getHeight();
      default:
        return false;
    }
  }

  enum Position {
    LEFT_OF("left of"),
    RIGHT_OF("right of"),
    ABOVE("above"),
    BELOW("below"),
    LEFT_ALIGNED("aligned left with"),
    RIGHT_ALIGNED("aligned right with"),
    TOP_ALIGNED("aligned top with"),
    BOTTOM_ALIGNED("aligned bottom with");

    private final String positionValue;

    private Position(String value) {
      positionValue = value;
    }

    @Override
    public String toString() {
      return positionValue;
    }
  }
}
