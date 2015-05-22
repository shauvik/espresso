/*
 * Copyright (C) 2015 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package android.support.test.espresso.intent;

import static android.support.test.espresso.intent.matcher.IntentMatchers.hasAction;
import static android.support.test.espresso.intent.matcher.IntentMatchers.hasData;
import static android.support.test.espresso.intent.matcher.UriMatchers.hasHost;
import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.any;
import static org.hamcrest.CoreMatchers.equalTo;

import android.app.Instrumentation.ActivityResult;
import android.content.Intent;
import android.net.Uri;
import android.test.InstrumentationTestCase;
import android.test.UiThreadTest;

import org.hamcrest.Matcher;

/**
 * Unit tests for {@link ResettingStubberImpl}.
 */
public class ResettingStubberImplTest extends InstrumentationTestCase {

  private ResettingStubber resettingStubber;

  @Override
  public void setUp() throws Exception {
    super.setUp();
    resettingStubber = new ResettingStubberImpl();
    resettingStubber.initialize();
  }

  @UiThreadTest
  public void testIsInitialized() {
    assertTrue(resettingStubber.isInitialized());

    resettingStubber.reset();
    assertFalse(resettingStubber.isInitialized());

    resettingStubber.initialize();
    assertTrue(resettingStubber.isInitialized());
  }

  @UiThreadTest
  public void testReset_getActivityResultForIntent() {
    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.android.com"));
    ActivityResult result = new ActivityResult(10, intent);
    resettingStubber.setActivityResultForIntent(any(Intent.class), result);
    assertEquals(resettingStubber.getActivityResultForIntent(intent), result);

    resettingStubber.reset();
    resettingStubber.initialize();
    assertEquals(null, resettingStubber.getActivityResultForIntent(intent));
  }

  @SuppressWarnings("unchecked") // TODO(user): remove after upgrading hamcrest to 1.3
  @UiThreadTest
  public void testSetActivityResultForIntent() {
    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.android.com"));
    ActivityResult result = new ActivityResult(10, intent);
    resettingStubber.setActivityResultForIntent(
            allOf(hasAction(equalTo(Intent.ACTION_VIEW)),
                    hasData(hasHost(equalTo("www.android.com")))),
            result);
    assertEquals(
        "Activity Result Not Equal.", resettingStubber.getActivityResultForIntent(intent), result);
  }

  @SuppressWarnings("unchecked") // TODO(user): remove after upgrading hamcrest to 1.3
  @UiThreadTest
  public void testSetActivityResultMultipleTime() {
    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.android.com"));
    ActivityResult result = new ActivityResult(10, intent);
    ActivityResult duplicateResult =
        new ActivityResult(100, new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com")));
    Matcher<Intent> matcher =
        allOf(hasAction(equalTo(Intent.ACTION_VIEW)), hasData(hasHost(equalTo("www.android.com"))));
    resettingStubber.setActivityResultForIntent(matcher, result);
    resettingStubber.setActivityResultForIntent(matcher, duplicateResult);
    assertEquals("Activity result didn't match expected value.",
        resettingStubber.getActivityResultForIntent(intent), duplicateResult);
    assertEquals("Activity result didn't match expected value.",
        resettingStubber.getActivityResultForIntent(intent), duplicateResult);
  }
}
