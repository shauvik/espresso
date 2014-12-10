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

import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static com.google.common.base.Preconditions.checkNotNull;

import android.support.test.internal.runner.lifecycle.ActivityLifecycleMonitorRegistry;
import android.support.test.runner.lifecycle.Stage;
import android.support.test.espresso.InjectEventSecurityException;
import android.support.test.espresso.NoActivityResumedException;
import android.support.test.espresso.PerformException;
import android.support.test.espresso.UiController;
import android.support.test.espresso.ViewAction;
import android.support.test.espresso.util.HumanReadables;

import android.os.SystemClock;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;

import org.hamcrest.Matcher;

/**
 * Enables pressing KeyEvents on views.
 */
public final class KeyEventAction implements ViewAction {
  private static final String TAG = KeyEventAction.class.getSimpleName();

  private final EspressoKey key;

  public KeyEventAction(EspressoKey key) {
    this.key = checkNotNull(key);
  }

  @SuppressWarnings("unchecked")
  @Override
  public Matcher<View> getConstraints() {
    return isDisplayed();
  }

  @Override
  public void perform(UiController uiController, View view) {
    try {
      if (!sendKeyEvent(uiController, view)) {
        Log.e(TAG, "Failed to inject key event: " + this.key);
        throw new PerformException.Builder()
          .withActionDescription(this.getDescription())
          .withViewDescription(HumanReadables.describe(view))
          .withCause(new RuntimeException("Failed to inject key event " + this.key))
          .build();
      }
    } catch (InjectEventSecurityException e) {
      Log.e(TAG, "Failed to inject key event: " + this.key);
      throw new PerformException.Builder()
        .withActionDescription(this.getDescription())
        .withViewDescription(HumanReadables.describe(view))
        .withCause(e)
        .build();
    }
  }

  private final boolean sendKeyEvent(UiController controller, View view)
      throws InjectEventSecurityException {

    boolean injected = false;
    long eventTime = SystemClock.uptimeMillis();
    for (int attempts = 0; !injected && attempts < 4; attempts++) {
      injected = controller.injectKeyEvent(new KeyEvent(eventTime,
          eventTime,
          KeyEvent.ACTION_DOWN,
          this.key.getKeyCode(),
          0,
          this.key.getMetaState()));
    }

    if (!injected) {
      // it is not a transient failure... :(
      return false;
    }

    injected = false;
    eventTime = SystemClock.uptimeMillis();
    for (int attempts = 0; !injected && attempts < 4; attempts++) {
      injected = controller.injectKeyEvent(
          new KeyEvent(eventTime, eventTime, KeyEvent.ACTION_UP, this.key.getKeyCode(), 0));
    }


    if (this.key.getKeyCode() == KeyEvent.KEYCODE_BACK) {
      controller.loopMainThreadUntilIdle();
      boolean activeActivities = !ActivityLifecycleMonitorRegistry.getInstance()
          .getActivitiesInStage(Stage.RESUMED)
          .isEmpty();
      if (!activeActivities) {
        Throwable cause = new PerformException.Builder()
          .withActionDescription(this.getDescription())
          .withViewDescription(HumanReadables.describe(view))
          .build();
        throw new NoActivityResumedException("Pressed back and killed the app", cause);
      }
    }

    return injected;
  }

  @Override
  public String getDescription() {
    return String.format("send %s key event", this.key);
  }
}
