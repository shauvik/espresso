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

import static android.support.test.espresso.Espresso.onData;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.Espresso.pressBack;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.contrib.DrawerActions.closeDrawer;
import static android.support.test.espresso.contrib.DrawerActions.openDrawer;
import static android.support.test.espresso.contrib.DrawerMatchers.isClosed;
import static android.support.test.espresso.contrib.DrawerMatchers.isOpen;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;

import android.support.test.testapp.DrawerActivity;
import android.support.test.testapp.R;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.LargeTest;

/**
 * Integration tests for {@link DrawerActions}.
 */
@LargeTest
public class DrawerActionsIntegrationTest extends ActivityInstrumentationTestCase2<DrawerActivity> {

  static final String EXTRA_DATA = "android.support.test.testapp.DATA";

  public DrawerActionsIntegrationTest() {
    super(DrawerActivity.class);
  }

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    getActivity();
  }

  public void testOpenAndCloseDrawer() {
    // Drawer should not be open to start.
    onView(withId(R.id.drawer_layout)).check(matches(isClosed()));

    openDrawer(R.id.drawer_layout);

    // The drawer should now be open.
    onView(withId(R.id.drawer_layout)).check(matches(isOpen()));

    closeDrawer(R.id.drawer_layout);

    // Drawer should be closed again.
    onView(withId(R.id.drawer_layout)).check(matches(isClosed()));
  }

  public void testOpenAndCloseDrawer_idempotent() {
    // Drawer should not be open to start.
    onView(withId(R.id.drawer_layout)).check(matches(isClosed()));

    // Open drawer repeatedly.
    openDrawer(R.id.drawer_layout);
    openDrawer(R.id.drawer_layout);
    openDrawer(R.id.drawer_layout);

    // The drawer should be open.
    onView(withId(R.id.drawer_layout)).check(matches(isOpen()));

    // Close drawer repeatedly.
    closeDrawer(R.id.drawer_layout);
    closeDrawer(R.id.drawer_layout);
    closeDrawer(R.id.drawer_layout);

    // Drawer should be closed.
    onView(withId(R.id.drawer_layout)).check(matches(isClosed()));
  }

  @SuppressWarnings("unchecked")
  public void testOpenDrawer_clickItem() {
    openDrawer(R.id.drawer_layout);

    // Click an item in the drawer.
    int rowIndex = 2;
    String rowContents = DrawerActivity.DRAWER_CONTENTS[rowIndex];
    onData(allOf(is(instanceOf(String.class)), is(rowContents))).perform(click());

    // clicking the item should close the drawer.
    onView(withId(R.id.drawer_layout)).check(matches(isClosed()));

    // The text view will now display "You picked: Pickle"
    onView(withId(R.id.drawer_text_view)).check(matches(withText("You picked: " + rowContents)));
  }

// Don't use swipeLeft() to close an open drawer. Since we unregister the IdlingDrawerListener
// after the drawer is open, a left swipe to close the drawer is not synchronized and will result
// in a flaky test. Therefore this test is commented out.
//
//  public void testOpenDrawer_closeBySwipeLeft() {
//    openDrawer(R.id.drawer_layout);
//
//    // Swipe left to close drawer.
//    onView(withId(R.id.drawer_layout)).perform(swipeLeft());
//
//    // Drawer should be closed.
//    onView(withId(R.id.drawer_layout)).check(matches(isClosed()));
//  }

  public void testOpenDrawer_startNewActivity() {
    openDrawer(R.id.drawer_layout);

    Intent displayActivity = new Intent().setClassName(getInstrumentation().getTargetContext(),
        "android.support.test.testapp.DisplayActivity");
    displayActivity.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    displayActivity.putExtra(EXTRA_DATA, "Have a cup of Espresso.");
    getInstrumentation().startActivitySync(displayActivity);

    onView(withId(R.id.display_data)).check(matches(withText(("Have a cup of Espresso."))));

    // Going back to the previous activity
    pressBack();

    // The drawer should still be open.
    onView(withId(R.id.drawer_layout)).check(matches(isOpen()));
  }

  public void testOpenDrawer_rotateScreen() {
    openDrawer(R.id.drawer_layout);

    // Rotate to landscape.
    setOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

    // The drawer should still be open.
    onView(withId(R.id.drawer_layout)).check(matches(isOpen()));

    // Rotate to portrait.
    setOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

    // The drawer should still be open.
    onView(withId(R.id.drawer_layout)).check(matches(isOpen()));
  }


  private void setOrientation(final int orientation) {
    getInstrumentation().runOnMainSync(new Runnable() {
      @Override
      public void run() {
        getActivity().setRequestedOrientation(orientation);
      }
    });
  }
}
