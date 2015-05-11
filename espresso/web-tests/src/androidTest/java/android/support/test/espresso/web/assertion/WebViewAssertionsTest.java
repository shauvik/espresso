/*
 * Copyright (C) 2015 The Android Open Source Project
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

package android.support.test.espresso.web.assertion;

import static android.support.test.espresso.matcher.ViewMatchers.isAssignableFrom;
import static android.support.test.espresso.matcher.ViewMatchers.isRoot;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static android.support.test.espresso.web.assertion.WebViewAssertions.webContent;
import static android.support.test.espresso.web.matcher.DomMatchers.elementById;
import static android.support.test.espresso.web.matcher.DomMatchers.withTextContent;
import static android.support.test.espresso.web.sugar.Web.onWebView;
import static junit.framework.Assert.fail;

import android.support.test.espresso.NoMatchingViewException;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.support.test.testapp.WebFormActivity;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.LargeTest;
import android.webkit.WebView;

import junit.framework.AssertionFailedError;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;

/**
 * Test case for Espresso web assertions.
 */
@LargeTest
@RunWith(AndroidJUnit4.class)
public class WebViewAssertionsTest {

  @Rule
  public ExpectedException mthrown = ExpectedException.none();

  @Rule
  public ActivityTestRule<WebFormActivity> mActivityTestRule =
          new ActivityTestRule<>(WebFormActivity.class);

  @Test
  public void webContent_legitAssertion() {
    onWebView(isAssignableFrom(WebView.class)).check(webContent(
        elementById("info", withTextContent("Enter input and click the Submit button."))));
  }

  @Test
  public void webContent_NotWebView() {
    mthrown.expect(RuntimeException.class);
      onWebView(isRoot()).check(webContent(
          elementById("info", withTextContent("Enter input and click the Submit button."))));
  }

  @Test
  public void webContent_NoViewFound() {
    mthrown.expect(NoMatchingViewException.class);
      onWebView(withText("not there")).check(webContent(
              elementById("info", withTextContent("Enter input and click the Submit button."))));
  }

  @Test
  public void webContent_validAssertion_fails() {
    mthrown.expect(AssertionFailedError.class);
      onWebView(isAssignableFrom(WebView.class)).check(webContent(
          elementById("info", withTextContent("Not what we expect."))));
  }
}
