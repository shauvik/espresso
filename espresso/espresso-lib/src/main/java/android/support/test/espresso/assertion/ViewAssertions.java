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

import android.support.test.espresso.NoMatchingViewException;
import android.support.test.espresso.ViewAssertion;
import android.support.test.espresso.util.HumanReadables;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;

import android.util.Log;
import android.view.View;

import junit.framework.AssertionFailedError;

import org.hamcrest.Matcher;
import org.hamcrest.StringDescription;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * A collection of common {@link ViewAssertion}s.
 */
public final class ViewAssertions {

  private static final String TAG = ViewAssertions.class.getSimpleName();


  private ViewAssertions() {}

  /**
   * Returns an assert that ensures the view matcher does not find any matching view in the
   * hierarchy.
   */
  public static ViewAssertion doesNotExist() {
    return new ViewAssertion() {
      @Override
      public void check(View view, NoMatchingViewException noView) {
        if (view != null) {
          assertThat("View is present in the hierarchy: " + HumanReadables.describe(view), true,
              is(false));
        }
      }
    };
  }

  /**
   * Returns a generic {@link ViewAssertion} that asserts that a view exists in the view hierarchy
   * and is matched by the given view matcher.
   */
  public static ViewAssertion matches(final Matcher<? super View> viewMatcher) {
    checkNotNull(viewMatcher);
    return new ViewAssertion() {
      @Override
      public void check(View view, NoMatchingViewException noViewException) {
        StringDescription description = new StringDescription();
        description.appendText("'");
        viewMatcher.describeTo(description);
        if (noViewException != null) {
          description.appendText(String.format(
              "' check could not be performed because view '%s' was not found.\n", viewMatcher));
          Log.e(TAG, description.toString());
          throw noViewException;
        } else {
          // TODO(valeraz): ideally, we should append the matcher used to find the view
          // This can be done in DefaultFailureHandler (just like we currently to with
          // PerformException)
          description.appendText("' doesn't match the selected view.");
          assertThat(description.toString(), view, viewMatcher);
        }
      }
    };
  }


  /**
   * Returns a generic {@link ViewAssertion} that asserts that the descendant views selected by the
   * selector match the specified matcher.
   *
   *  Example: onView(rootView).check(selectedDescendantsMatch(
   * not(isAssignableFrom(TextView.class)), hasContentDescription()));
   */
  public static ViewAssertion selectedDescendantsMatch(
      final Matcher<View> selector, final Matcher<View> matcher) {
    return new ViewAssertion() {
      @SuppressWarnings("unchecked")
      @Override
      public void check(View view, NoMatchingViewException noViewException) {
        Preconditions.checkNotNull(view);

        final Predicate<View> viewPredicate = new Predicate<View>() {
          @Override
          public boolean apply(View input) {
            return selector.matches(input);
          }
        };

        Iterator<View> selectedViewIterator =
            Iterables.filter(breadthFirstViewTraversal(view), viewPredicate).iterator();

        List<View> nonMatchingViews = new ArrayList<View>();
        while (selectedViewIterator.hasNext()) {
          View selectedView = selectedViewIterator.next();

          if (!matcher.matches(selectedView)) {
            nonMatchingViews.add(selectedView);
          }
        }

        if (nonMatchingViews.size() > 0) {
          String errorMessage = HumanReadables.getViewHierarchyErrorMessage(view,
              nonMatchingViews,
              String.format("At least one view did not match the required matcher: %s", matcher),
              "****DOES NOT MATCH****");
          throw new AssertionFailedError(errorMessage);
        }
      }
    };
  }
}
