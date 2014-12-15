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

package android.support.test.espresso;

import static android.support.test.espresso.Espresso.onData;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.Espresso.openActionBarOverflowOrOptionsMenu;
import static android.support.test.espresso.Espresso.openContextualActionModeOverflowMenu;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.anything;
import static org.hamcrest.Matchers.hasValue;
import static org.hamcrest.Matchers.instanceOf;

import android.support.test.espresso.action.ViewActions;
import android.support.test.testapp.ActionBarTestActivity;
import android.support.test.testapp.MainActivity;
import android.support.test.testapp.R;
import android.support.test.testapp.SendActivity;

import android.content.Context;
import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.LargeTest;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

import org.hamcrest.Matcher;

import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Tests Espresso top level (i.e. ones not specific to a view) actions like pressBack and
 * closeSoftKeyboard.
 */
@LargeTest
public class EspressoTest extends ActivityInstrumentationTestCase2<MainActivity> {
  @SuppressWarnings("deprecation")
  public EspressoTest() {
    // Supporting froyo.
    super("android.support.test.testapp", MainActivity.class);
  }

  @Override
  public void setUp() throws Exception {
    super.setUp();
    getActivity();
  }

  @SuppressWarnings("unchecked")
  public void testOpenOverflowFromActionBar() {
    onData(allOf(instanceOf(Map.class), hasValue(ActionBarTestActivity.class.getSimpleName())))
        .perform(click());
    onView(withId(R.id.hide_contextual_action_bar))
        .perform(click());
    openActionBarOverflowOrOptionsMenu(getInstrumentation().getTargetContext());
    onView(withText("World"))
        .perform(click());
    onView(withId(R.id.text_action_bar_result))
        .check(matches(withText("World")));
  }

  @SuppressWarnings("unchecked")
  public void testOpenOverflowInActionMode() {
    onData(allOf(instanceOf(Map.class), hasValue(ActionBarTestActivity.class.getSimpleName())))
        .perform(click());
    openContextualActionModeOverflowMenu();
    onView(withText("Key"))
        .perform(click());
    onView(withId(R.id.text_action_bar_result))
        .check(matches(withText("Key")));
  }

  @SuppressWarnings("unchecked")
  public void testCloseSoftKeyboard() {
    onData(allOf(instanceOf(Map.class), hasValue(SendActivity.class.getSimpleName())))
        .perform(click());

    onView(withId(R.id.enter_data_edit_text)).perform(new ViewAction() {
      @Override
      public Matcher<View> getConstraints() {
        return anything();
      }

      @Override
      public void perform(UiController uiController, View view) {
        InputMethodManager imm = (InputMethodManager) getInstrumentation().getTargetContext()
          .getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.showSoftInput(view, 0);
        uiController.loopMainThreadUntilIdle();
      }

      @Override
      public String getDescription() {
        return "show soft input";
      }
    });

    onView(withId(R.id.enter_data_edit_text)).perform(ViewActions.closeSoftKeyboard());
  }

  public void testSetFailureHandler() {
    final AtomicBoolean handled = new AtomicBoolean(false);
    Espresso.setFailureHandler(new FailureHandler() {
      @Override
      public void handle(Throwable error, Matcher<View> viewMatcher) {
        handled.set(true);
      }
    });
    onView(withText("does not exist")).perform(click());
    assertTrue(handled.get());
  }

  public void testRegisterResourceWithNullName() {
    try {
      Espresso.registerIdlingResources(new DummyIdlingResource(null));
      fail("Should have thrown NPE");
    } catch (RuntimeException expected) {}
  }

  public void testGetIdlingResources() {
    int originalCount = Espresso.getIdlingResources().size();

    IdlingResource resource = new DummyIdlingResource("testGetIdlingResources");

    Espresso.registerIdlingResources(resource);
    assertEquals(originalCount + 1, Espresso.getIdlingResources().size());

    Espresso.unregisterIdlingResources(resource);
    assertEquals(originalCount, Espresso.getIdlingResources().size());
  }

  public void testRegisterIdlingResources() {
    IdlingResource resource = new DummyIdlingResource("testRegisterIdlingResources");
    assertTrue(Espresso.registerIdlingResources(resource));
    assertFalse(Espresso.registerIdlingResources(resource));
  }

  public void testUnregisterIdlingResources() {
    IdlingResource resource = new DummyIdlingResource("testUnregisterIdlingResources");
    Espresso.registerIdlingResources(resource);
    assertTrue(Espresso.unregisterIdlingResources(resource));
    assertFalse(Espresso.unregisterIdlingResources(resource));
  }

  private class DummyIdlingResource implements IdlingResource {
    private String name;

    public DummyIdlingResource(String name) {
      this.name = name;
    }

    @Override
    public boolean isIdleNow() {
      return true;
    }

    @Override
    public String getName() {
      return name;
    }

   @Override
   public void registerIdleTransitionCallback(ResourceCallback callback) {
     // ignore
   }
  }
}
