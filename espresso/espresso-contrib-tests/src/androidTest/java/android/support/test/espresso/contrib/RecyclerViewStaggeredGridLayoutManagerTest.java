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

package android.support.test.espresso.contrib;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isCompletelyDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

import android.support.test.testapp.RecyclerViewFragment.LayoutManagerType;

import android.test.suitebuilder.annotation.LargeTest;

/**
 * {@link RecyclerViewIntegrationTest}s for {@link android.support.v7.widget.RecyclerView} using a
 * {@link android.support.v7.widget.StaggeredGridLayoutManager}
 */
@LargeTest
public class RecyclerViewStaggeredGridLayoutManagerTest extends RecyclerViewIntegrationTest {

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    // Click on the GridLayoutManager Tab.
    onView(withText("STAGGERED")).perform(click());
    onView(withId(getRVLayoutId())).check(matches(isCompletelyDisplayed()));
  }

  @Override
  protected int getRVLayoutId() {
    return LayoutManagerType.STAGGERED.getRVId();
  }

  @Override
  protected int getSelectedItemId() {
    return LayoutManagerType.STAGGERED.getSelectedItemId();
  }
}
