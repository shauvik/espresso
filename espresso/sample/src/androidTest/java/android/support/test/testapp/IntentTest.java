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

package android.support.test.testapp;

import static android.support.test.espresso.intent.Intents.intended;
import static android.support.test.espresso.intent.Intents.intending;
import static android.support.test.espresso.intent.Intents.times;
import static android.support.test.espresso.intent.matcher.IntentMatchers.hasData;
import static android.support.test.espresso.intent.matcher.IntentMatchers.isInternal;
import static android.support.test.espresso.intent.matcher.IntentMatchers.toPackage;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.openLink;
import static android.support.test.espresso.action.ViewActions.openLinkWithText;
import static android.support.test.espresso.action.ViewActions.scrollTo;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;

import android.support.test.espresso.intent.Intents;

import android.app.Activity;
import android.app.Instrumentation.ActivityResult;
import android.net.Uri;
import android.test.ActivityInstrumentationTestCase2;

/**
 * Sample test that demonstrates the use of Intents as well as the openLink action.
 */
public class IntentTest extends ActivityInstrumentationTestCase2<SendActivity>{
  @SuppressWarnings("deprecation")
  public IntentTest() {
    // This constructor was deprecated - but we want to support lower API levels.
    super("android.support.test.testapp", SendActivity.class);
  }

  @Override
  public void setUp() throws Exception {
    super.setUp();
    // Espresso will not launch our activity for us, we must launch it via getActivity().
    getActivity();
    // Once initialized, Intents will begin recording and providing stubbing for intents.
    Intents.init();
    // Stubbing to block all external intents
    intending(not(isInternal())).respondWith(new ActivityResult(Activity.RESULT_OK, null));
  }

  @Override
  public void tearDown() throws Exception {
    // Releasing clears recorded intents and stubbing, ensuring a clean state for each test.
    Intents.release();
    super.tearDown();
  }

  public void testOpenLink() {
    // Basic usage of the openLink action
    onView(withId(R.id.spanned)).perform(scrollTo(), openLinkWithText("altavista.com"));
    // A simple Intents validation - verify an intent with our data was sent by opening the link.
    intended(hasData("http://altavista.com"));

    // You can also pass both a Matcher<String> and Matcher<Uri> to the openLink action.
    onView(withId(R.id.spanned)).perform(scrollTo(),
        openLink(containsString("google"), is(Uri.parse("http://www.google.com"))));
    // toPackage validates that intents from the actions above would get resolved to the browser.
    intended(toPackage("com.android.browser"), times(2));
  }
}
