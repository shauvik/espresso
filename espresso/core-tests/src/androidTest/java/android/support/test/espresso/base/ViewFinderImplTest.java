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

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;
import static org.hamcrest.Matchers.nullValue;
import static org.hamcrest.Matchers.sameInstance;

import android.support.test.espresso.AmbiguousViewMatcherException;
import android.support.test.espresso.NoMatchingViewException;
import android.support.test.espresso.ViewFinder;

import android.test.InstrumentationTestCase;
import android.test.UiThreadTest;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import javax.inject.Provider;

/** Unit tests for {@link ViewFinderImpl}. */
public class ViewFinderImplTest extends InstrumentationTestCase {
  private Provider<View> testViewProvider;
  private RelativeLayout testView;
  private View child1;
  private View child2;
  private View child3;
  private View child4;
  private View nestedChild;

  @Override
  public void setUp() throws Exception {
    super.setUp();
    testView = new RelativeLayout(getInstrumentation().getTargetContext());
    child1 = new TextView(getInstrumentation().getTargetContext());
    child1.setId(1);
    child2 = new TextView(getInstrumentation().getTargetContext());
    child2.setId(2);
    child3 = new TextView(getInstrumentation().getTargetContext());
    child3.setId(3);
    child4 = new TextView(getInstrumentation().getTargetContext());
    child4.setId(4);
    nestedChild = new TextView(getInstrumentation().getTargetContext());
    nestedChild.setId(5);
    RelativeLayout nestingLayout = new RelativeLayout(getInstrumentation().getTargetContext());
    nestingLayout.addView(nestedChild);
    testView.addView(child1);
    testView.addView(child2);
    testView.addView(nestingLayout);
    testView.addView(child3);
    testView.addView(child4);
    testViewProvider = new Provider<View>() {
      @Override
      public View get() {
        return testView;
      }

      @Override
      public String toString() {
        return "of(" + testView + ")";
      }
    };
  }

  @UiThreadTest
  public void testGetView_present() {
    ViewFinder finder = new ViewFinderImpl(sameInstance(nestedChild), testViewProvider);
    assertThat(finder.getView(), sameInstance(nestedChild));
  }

  @UiThreadTest
  public void testGetView_missing() {
    ViewFinder finder = new ViewFinderImpl(nullValue(View.class), testViewProvider);
    try {
      finder.getView();
      fail("No children should pass that matcher!");
    } catch (NoMatchingViewException expected) {}
  }

  @UiThreadTest
  public void testGetView_multiple() {
    ViewFinder finder = new ViewFinderImpl(notNullValue(View.class), testViewProvider);
    try {
      finder.getView();
      fail("All nodes hit that matcher!");
    } catch (AmbiguousViewMatcherException expected) {}
  }

  public void testFind_offUiThread() {
    ViewFinder finder = new ViewFinderImpl(sameInstance(nestedChild), testViewProvider);
    try {
      finder.getView();
      fail("not on main thread, should die.");
    } catch (IllegalStateException expected) {}
  }

}
