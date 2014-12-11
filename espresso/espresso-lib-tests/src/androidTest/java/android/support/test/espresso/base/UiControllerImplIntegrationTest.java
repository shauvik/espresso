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

import android.support.test.espresso.InjectEventSecurityException;
import android.support.test.espresso.UiController;
import android.support.test.espresso.util.HumanReadables;
import android.support.test.testapp.R;
import android.support.test.testapp.SendActivity;
import com.google.common.base.Optional;

import android.app.Activity;
import android.app.Instrumentation;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.LargeTest;
import android.util.Log;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Test for {@link UiControllerImpl}.
 */
public class UiControllerImplIntegrationTest
    extends ActivityInstrumentationTestCase2<SendActivity> {
  private Activity sendActivity;
  private final AtomicBoolean injectEventWorked = new AtomicBoolean(false);
  private final AtomicBoolean injectEventThrewSecurityException = new AtomicBoolean(false);
  private final CountDownLatch focusLatch = new CountDownLatch(1);
  private final CountDownLatch latch = new CountDownLatch(1);
  private UiController uiController;

  @SuppressWarnings("deprecation")
  public UiControllerImplIntegrationTest() {
    // Supporting froyo.
    super("android.support.test.testapp", SendActivity.class);
  }

  @Override
  public void setUp() throws Exception {
    super.setUp();
    EventInjector injector = null;
    if (Build.VERSION.SDK_INT > 15) {
      InputManagerEventInjectionStrategy strat = new InputManagerEventInjectionStrategy();
      strat.initialize();
      injector = new EventInjector(strat);
    } else {
      WindowManagerEventInjectionStrategy strat = new WindowManagerEventInjectionStrategy();
      strat.initialize();
      injector = new EventInjector(strat);
    }
    Recycler recycler = Recycler.DEFAULT_RECYCLER;
    if (Build.VERSION.SDK_INT > 20) {
      recycler = new UncheckedRecycler();
    }
    uiController = new UiControllerImpl(
        injector,
        new AsyncTaskPoolMonitor(new ThreadPoolExecutorExtractor(
            Looper.getMainLooper()).getAsyncTaskThreadPool()),
        Optional.<AsyncTaskPoolMonitor>absent(),
        new IdlingResourceRegistry(Looper.getMainLooper()),
        Looper.getMainLooper(),
        recycler);
  }


  @Override
  public SendActivity getActivity() {
    SendActivity a = super.getActivity();

    while (!a.hasWindowFocus()) {
      getInstrumentation().waitForIdleSync();
    }

    return a;
  }

  @LargeTest
  public void testInjectKeyEvent() throws InterruptedException {
    sendActivity = getActivity();
    getInstrumentation().waitForIdleSync();

    getInstrumentation().runOnMainSync(new Runnable() {
      @Override
      public void run() {
        try {
          KeyCharacterMap keyCharacterMap = UiControllerImpl.getKeyCharacterMap();
          KeyEvent[] events = keyCharacterMap.getEvents("a".toCharArray());
          injectEventWorked.set(uiController.injectKeyEvent(events[0]));
          latch.countDown();
        } catch (InjectEventSecurityException e) {
          injectEventThrewSecurityException.set(true);
        }
      }
    });

    assertFalse("injectEvent threw a SecurityException", injectEventThrewSecurityException.get());
    assertTrue("Timed out!", latch.await(10, TimeUnit.SECONDS));
    assertTrue(injectEventWorked.get());
  }

  @LargeTest
  public void testInjectString() throws InterruptedException {
    sendActivity = getActivity();
    getInstrumentation().waitForIdleSync();
    final AtomicBoolean requestFocusSucceded = new AtomicBoolean(false);

    getInstrumentation().runOnMainSync(new Runnable() {
      @Override
      public void run() {
        final View view = sendActivity.findViewById(R.id.send_data_to_call_edit_text);
        Log.i("TEST", HumanReadables.describe(view));
        requestFocusSucceded.set(view.requestFocus() && view.hasWindowFocus());
        Log.i("TEST-post", HumanReadables.describe(view));
        focusLatch.countDown();
      }
    });

    getInstrumentation().waitForIdleSync();
    assertTrue("requestFocus timed out!", focusLatch.await(2, TimeUnit.SECONDS));
    assertTrue("requestFocus failed.", requestFocusSucceded.get());

    getInstrumentation().runOnMainSync(new Runnable() {
      @Override
      public void run() {
        try {
          injectEventWorked.set(uiController.injectString("Hello! \n&*$$$"));
          latch.countDown();
        } catch (InjectEventSecurityException e) {
          injectEventThrewSecurityException.set(true);
        }
      }
    });

    assertFalse("SecurityException exception was thrown.", injectEventThrewSecurityException.get());
    assertTrue("Timed out!", latch.await(20, TimeUnit.SECONDS));
    assertTrue(injectEventWorked.get());
  }

  @LargeTest
  public void testInjectLargeString() throws InterruptedException {
    sendActivity = getActivity();
    getInstrumentation().waitForIdleSync();
    final AtomicBoolean requestFocusSucceded = new AtomicBoolean(false);

    getInstrumentation().runOnMainSync(new Runnable() {
      @Override
      public void run() {
        final View view = sendActivity.findViewById(R.id.send_data_to_call_edit_text);
        Log.i("TEST", HumanReadables.describe(view));
        requestFocusSucceded.set(view.requestFocus());
        Log.i("TEST-post", HumanReadables.describe(view));

        focusLatch.countDown();
      }
    });

    assertTrue("requestFocus timed out!", focusLatch.await(2, TimeUnit.SECONDS));
    assertTrue("requestFocus failed.", requestFocusSucceded.get());

    getInstrumentation().runOnMainSync(new Runnable() {
      @Override
      public void run() {
        try {
          injectEventWorked.set(uiController.injectString("This is a string with 32 chars!!"));
          latch.countDown();
        } catch (InjectEventSecurityException e) {
          injectEventThrewSecurityException.set(true);
        }
      }
    });

    assertFalse("SecurityException exception was thrown.", injectEventThrewSecurityException.get());
    assertTrue("Timed out!", latch.await(20, TimeUnit.SECONDS));
    assertTrue(injectEventWorked.get());
  }

  @LargeTest
  public void testInjectEmptyString() throws InterruptedException {
    sendActivity = getActivity();
    getInstrumentation().waitForIdleSync();
    final AtomicBoolean requestFocusSucceded = new AtomicBoolean(false);

    getInstrumentation().runOnMainSync(new Runnable() {
      @Override
      public void run() {
        final View view = sendActivity.findViewById(R.id.send_data_to_call_edit_text);
        requestFocusSucceded.set(view.requestFocus());
        focusLatch.countDown();
      }
    });

    assertTrue("requestFocus timed out!", focusLatch.await(2, TimeUnit.SECONDS));
    assertTrue("requestFocus failed.", requestFocusSucceded.get());

    getInstrumentation().runOnMainSync(new Runnable() {
      @Override
      public void run() {
        try {
          injectEventWorked.set(uiController.injectString(""));
          latch.countDown();
        } catch (InjectEventSecurityException e) {
          injectEventThrewSecurityException.set(true);
        }
      }
    });

    assertFalse("SecurityException exception was thrown.", injectEventThrewSecurityException.get());
    assertTrue("Timed out!", latch.await(20, TimeUnit.SECONDS));
    assertTrue(injectEventWorked.get());
  }

  @LargeTest
  public void testInjectStringSecurityException() throws InterruptedException {
    getInstrumentation().runOnMainSync(new Runnable() {
      @Override
      public void run() {
        try {
          injectEventWorked.set(uiController.injectString("Hello! \n&*$$$"));
          latch.countDown();
        } catch (InjectEventSecurityException e) {
          injectEventThrewSecurityException.set(true);
        }
      }
    });

    assertTrue("SecurityException exception was thrown.", injectEventThrewSecurityException.get());
    assertFalse("Did NOT time out!", latch.await(3, TimeUnit.SECONDS));
    assertFalse(injectEventWorked.get());
  }

  @LargeTest
  public void testInjectMotionEvent() throws InterruptedException {
    sendActivity = getActivity();
    final int xy[] = getCoordinatesInMiddleOfSendButton(sendActivity, getInstrumentation());

    getInstrumentation().runOnMainSync(new Runnable() {
      @Override
      public void run() {
        long downTime = SystemClock.uptimeMillis();
        try {
          MotionEvent event = MotionEvent.obtain(downTime,
              SystemClock.uptimeMillis(),
              MotionEvent.ACTION_DOWN,
              xy[0],
              xy[1],
              0);

          injectEventWorked.set(uiController.injectMotionEvent(event));
          event.recycle();
          latch.countDown();
        } catch (InjectEventSecurityException e) {
          injectEventThrewSecurityException.set(true);
        }
      }
    });

    assertFalse("SecurityException exception was thrown.", injectEventThrewSecurityException.get());
    assertTrue("Timed out!", latch.await(10, TimeUnit.SECONDS));
    assertTrue(injectEventWorked.get());
  }

  static int[] getCoordinatesInMiddleOfSendButton(
      Activity activity, Instrumentation instrumentation) {
    final View sendButton = activity.findViewById(R.id.send_button);
    final int[] xy = new int[2];
    instrumentation.runOnMainSync(new Runnable() {
      @Override
      public void run() {
        sendButton.getLocationOnScreen(xy);
      }
    });
    int x = xy[0] + (sendButton.getWidth() / 2);
    int y = xy[1] + (sendButton.getHeight() / 2);
    int[] xyMiddle = {x, y};
    return xyMiddle;
  }
}
