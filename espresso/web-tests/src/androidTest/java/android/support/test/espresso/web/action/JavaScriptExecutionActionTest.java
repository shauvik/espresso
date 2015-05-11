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

package android.support.test.espresso.web.action;

import static android.support.test.espresso.matcher.ViewMatchers.isAssignableFrom;
import static android.support.test.espresso.web.assertion.WebViewAssertions.webContent;
import static android.support.test.espresso.web.matcher.DomMatchers.elementById;
import static android.support.test.espresso.web.matcher.DomMatchers.withTextContent;
import static android.support.test.espresso.web.model.Atoms.script;
import static android.support.test.espresso.web.sugar.Web.onWebView;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.instanceOf;

import android.support.test.espresso.IdlingResourceTimeoutException;
import android.support.test.testapp.WebFormActivity;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.LargeTest;
import android.webkit.WebView;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * Test case for {@link JavaScriptExecutionAction}.
 */
@LargeTest
public class JavaScriptExecutionActionTest extends
    ActivityInstrumentationTestCase2<WebFormActivity> {

  public JavaScriptExecutionActionTest() {
    super(WebFormActivity.class);
  }

  @Override
  public void setUp() throws Exception {
    super.setUp();
    getActivity();
  }

  public void testJavaScriptExecution() {
    onWebView(isAssignableFrom(WebView.class))
        .perform(script("document.getElementById('input').value = 'stuff'"))
        .perform(script("document.getElementById('submit').click()"))
        .check(webContent(elementById("info", withTextContent(containsString("stuff")))));
  }

  public void testJavaScriptExecution_BadCommand() {
    try {
      onWebView(isAssignableFrom(WebView.class))
          .perform(script("rubbish"));
      fail("Previous command should have failed.");
    } catch (RuntimeException expected) {
      assertThat(expected.getMessage(), containsString("rubbish is not defined"));
    }
  }

  public void testJavaScriptExecution_Timeout() {
    try {
      onWebView(isAssignableFrom(WebView.class))
          .withTimeout(2, TimeUnit.SECONDS)
          .perform(script("while(true){};"));
      fail("Previous command should have timed out.");
    } catch (IdlingResourceTimeoutException expected) {
      // Expected on API level 18 and lower (javascript handling is synchronized with Espresso
      // via IdlingResource).
    } catch (RuntimeException e) {
      // Expected on API level 19 and above
      // (synchronized by polling the Conduit.getResult().isDone()).
      assertThat(e.getCause(), instanceOf(TimeoutException.class));
    }
  }
}
