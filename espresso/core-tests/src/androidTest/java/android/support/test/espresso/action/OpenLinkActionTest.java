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
import static android.support.test.espresso.action.ViewActions.openLinkWithText;
import static android.support.test.espresso.action.ViewActions.scrollTo;
import static android.support.test.espresso.matcher.ViewMatchers.assertThat;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;

import android.support.test.espresso.PerformException;
import android.support.test.testapp.R;
import android.support.test.testapp.SendActivity;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.LargeTest;

/**
 * {@link OpenLinkAction} integration tests.
 */
@LargeTest
public class OpenLinkActionTest extends ActivityInstrumentationTestCase2<SendActivity> {
  @SuppressWarnings("deprecation")
  public OpenLinkActionTest() {
    // Supporting froyo.
    super("android.support.test.testapp", SendActivity.class);
  }

  @Override
  public void setUp() throws Exception {
    super.setUp();
    // Espresso will not launch our activity for us, we must launch it via getActivity().
    getActivity();
  }


  public void testOpenLink_TargetViewNotSpanned() {
    try {
      onView(withId(R.id.send_title)).perform(scrollTo(), openLinkWithText("altavista.com"));
      fail("Expected previous call to fail");
    } catch (PerformException expected) {
      assertThat(expected.getCause().getMessage(), containsString("has-links=false"));
    }
  }

  public void testOpenLink_NoLinkFound() {
    try {
      onView(withId(R.id.spanned)).perform(scrollTo(), openLinkWithText("bacon"));
      fail("Expected previous call to fail");
    } catch (PerformException expected) {
      assertThat(expected.getCause().getMessage(), containsString("bacon"));
    }
  }

}
