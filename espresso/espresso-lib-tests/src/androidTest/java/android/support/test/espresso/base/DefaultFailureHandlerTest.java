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

package android.support.test.espresso.base;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.isRoot;
import static com.google.common.base.Throwables.getStackTraceAsString;
import static org.hamcrest.Matchers.not;

import android.support.test.espresso.AmbiguousViewMatcherException;
import android.support.test.espresso.NoMatchingViewException;
import android.support.test.espresso.ViewAssertion;
import android.support.test.testapp.MainActivity;

import android.test.ActivityInstrumentationTestCase2;
import android.view.View;

import junit.framework.AssertionFailedError;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;

/**
 * Tests Espresso's default failure handling.
 */
public class DefaultFailureHandlerTest extends ActivityInstrumentationTestCase2<MainActivity> {

  @SuppressWarnings("deprecation")
  public DefaultFailureHandlerTest() {
    // Supporting froyo.
    super("android.support.test.testapp", MainActivity.class);
  }

  @Override
  public void setUp() throws Exception {
    super.setUp();
    getActivity();
  }

  public void testMismatchInCheck() {
    try {
      onView(isRoot()).check(matches(not(isDisplayed())));
      fail("Previous call expected to fail");
    } catch (AssertionFailedError e) {
      assertFailureStackContainsThisClass(e);
    }
  }

  public void testCustomAssertionError() {
    try {
      onView(isRoot()).check(new ViewAssertion() {
        @Override
        public void check(View view, NoMatchingViewException noViewFoundException) {
          assertFalse(true);
        }
      });
      fail("Previous call expected to fail");
    } catch (AssertionFailedError e) {
      assertFailureStackContainsThisClass(e);
    }
  }

  public void testNoMatchingViewException() {
    try {
      onView(withMatchesThatReturns(false)).check(matches(not(isDisplayed())));
      fail("Previous call expected to fail");
    } catch (NoMatchingViewException e) {
      assertFailureStackContainsThisClass(e);
    }
  }

  public void testAmbiguousViewMatcherException() {
    try {
      onView(withMatchesThatReturns(true)).check(matches(isDisplayed()));
    } catch (RuntimeException e) {
      assertTrue(e instanceof AmbiguousViewMatcherException);
      assertFailureStackContainsThisClass(e);
    }
  }

  private void assertFailureStackContainsThisClass(Throwable e) {
    assertTrue(getStackTraceAsString(e).contains(getClass().getSimpleName().toString()));
  }

  private static Matcher<View> withMatchesThatReturns(final boolean returnValue) {
    return new BaseMatcher<View>() {
      @Override
      public void describeTo(Description description) {
        description.appendText("matches=" + returnValue);
      }

      @Override
      public boolean matches(Object item) {
        return returnValue;
      }
    };
  }

}
