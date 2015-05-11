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

package android.support.test.espresso.web.bridge;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.isAssignableFrom;
import static com.google.common.base.Preconditions.checkNotNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assume.assumeTrue;

import android.os.Build;
import android.support.test.InstrumentationRegistry;
import android.support.test.espresso.UiController;
import android.support.test.espresso.ViewAction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.support.test.testapp.SimpleWebViewActivity;

import android.test.suitebuilder.annotation.LargeTest;
import android.view.View;
import android.webkit.WebView;

import org.hamcrest.Matcher;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.TimeUnit;

/**
 * Evaluate some javascript thru the Javascript bridge.
 */
@LargeTest
@RunWith(AndroidJUnit4.class)
public class JavaScriptIntegrationTest {

  @Rule
  public ActivityTestRule<SimpleWebViewActivity> mActivtyTestRule =
          new ActivityTestRule<>(SimpleWebViewActivity.class);

  @Before
  public void onlyRunTestOnApiLowerThan19() throws Exception {
    assumeTrue(Build.VERSION.SDK_INT < 19);
    InstrumentationRegistry.getInstrumentation().runOnMainSync(new Runnable() {
      @Override
      public void run() {
        JavaScriptBridge.installBridge();
      }
    });
  }

  @Test
  public void clickBlock() throws Exception {
    Conduit initialValue = JavaScriptBridge.makeConduit();
    onView(isAssignableFrom(WebView.class))
        .perform(new JavaScriptExecutionAction(
            initialValue.wrapScriptInConduit("document.was_clicked")));

    assertEquals("false", initialValue.getResult().get(2, TimeUnit.SECONDS));

    // The displayed webview is one huge button... so no need for intellegently determining where
    // to click.
    onView(isAssignableFrom(WebView.class))
        .perform(click());

    Conduit endValue = JavaScriptBridge.makeConduit();
    onView(isAssignableFrom(WebView.class))
        .perform(new JavaScriptExecutionAction(
            endValue.wrapScriptInConduit("document.was_clicked")));

    assertEquals("true", endValue.getResult().get(2, TimeUnit.SECONDS));
  }

  @Test
  public void javascriptEvaluation() throws Exception {
    Conduit resultConduit = JavaScriptBridge.makeConduit();
    onView(isAssignableFrom(WebView.class))
        .perform(new JavaScriptExecutionAction(resultConduit.wrapScriptInConduit("1+2+3")));
    assertEquals("6", resultConduit.getResult().get(2, TimeUnit.SECONDS));
  }

  private static class JavaScriptExecutionAction implements ViewAction {
    private final String wrappedScript;

    JavaScriptExecutionAction(String wrappedScript) {
      this.wrappedScript = checkNotNull(wrappedScript);
    }

    @Override
    public Matcher<View> getConstraints() {
      return isAssignableFrom(WebView.class);
    }

    @Override
    public String getDescription() {
      return "exec me some javascript!";
    }

    @Override
    public void perform(UiController controller, View view) {
      controller.loopMainThreadForAtLeast(5000); // TODO(user): replace with Web sugar.
      ((WebView) view).loadUrl("javascript:" + wrappedScript);
    }

  }
}
