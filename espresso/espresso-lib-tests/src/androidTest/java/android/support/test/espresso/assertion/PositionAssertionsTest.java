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

import static android.support.test.espresso.assertion.PositionAssertions.findView;
import static android.support.test.espresso.matcher.ViewMatchers.isAssignableFrom;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

import android.support.test.espresso.AmbiguousViewMatcherException;
import android.support.test.espresso.NoMatchingViewException;

import android.test.InstrumentationTestCase;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

/**
 * Test case for {@link PositionAssertions} focusing on failure cases.
 * Please check {@link PositionAssertionsUnitTest} for more unit tests related
 * to getLocationOnScreen.
 */
public class PositionAssertionsTest extends InstrumentationTestCase {

  private final String text1 = "text1";
  private final String text2 = "text2";

  public void testFindView_Exists() {
    View root = setUpViewHierarchy();
    View foundView = findView(withText(text1), root);
    assertNotNull(foundView);
  }

  public void testFindView_NotFound() {
    View root = setUpViewHierarchy();
    try {
      findView(withText("does not exist"), root);
    } catch (NoMatchingViewException expected) {
      return;
    }
    fail("NoMatchingViewException is expected.");
  }

  public void testFindView_Ambiguous() {
    View root = setUpViewHierarchy();
    try {
      findView(isAssignableFrom(TextView.class), root);
    } catch (AmbiguousViewMatcherException expected) {
      return;
    }
    fail("AmbiguousViewMatcherException is expected.");
  }

  private View setUpViewHierarchy() {
    TextView v1 = new TextView(getInstrumentation().getTargetContext());
    v1.setText(text1);
    TextView v2 = new TextView(getInstrumentation().getTargetContext());
    v2.setText(text2);
    v2.setContentDescription("content description");
    ViewGroup parent = new RelativeLayout(getInstrumentation().getTargetContext());
    View grany = new ScrollView(getInstrumentation().getTargetContext());
    ((ViewGroup) grany).addView(parent);
    parent.addView(v1);
    parent.addView(v2);

    return grany;
  }
}
