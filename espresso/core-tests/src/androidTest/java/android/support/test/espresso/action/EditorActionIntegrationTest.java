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
import static android.support.test.espresso.action.ViewActions.pressImeActionButton;
import static android.support.test.espresso.action.ViewActions.scrollTo;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.hasImeAction;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.containsString;

import android.support.test.espresso.PerformException;
import android.support.test.testapp.R;
import android.support.test.testapp.SendActivity;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.LargeTest;
import android.view.inputmethod.EditorInfo;

/**
 * Tests for {@link EditorAction}.
 */
@LargeTest
public class EditorActionIntegrationTest extends ActivityInstrumentationTestCase2<SendActivity> {
  @SuppressWarnings("deprecation")
  public EditorActionIntegrationTest() {
    // Supporting froyo.
    super("android.support.test.testapp", SendActivity.class);
  }

  @Override
  public void setUp() throws Exception {
    super.setUp();
    getActivity();
  }

  @SuppressWarnings("unchecked")
  public void testPressImeActionButtonOnSearchBox() {
    String searchFor = "rainbows and unicorns";
    onView(withId(R.id.search_box)).perform(scrollTo(), ViewActions.typeText(searchFor));
    onView(withId(R.id.search_box))
        .check(matches(hasImeAction(EditorInfo.IME_ACTION_SEARCH)))
        .perform(pressImeActionButton());
    onView(withId(R.id.search_result)).perform(scrollTo());
    onView(withId(R.id.search_result))
        .check(matches(allOf(isDisplayed(), withText(containsString(searchFor)))));
  }

  public void testPressImeActionButtonOnNonEditorWidget() {
    try {
      onView(withId(R.id.send_button)).perform(pressImeActionButton());
      fail("Expected exception on previous call");
    } catch (PerformException expected) {
      assertTrue(expected.getCause() instanceof IllegalStateException);
    }
  }

  public void testPressSearchOnDefaultEditText() {
    onView(withId(R.id.enter_data_edit_text)).perform(pressImeActionButton());
  }
}
