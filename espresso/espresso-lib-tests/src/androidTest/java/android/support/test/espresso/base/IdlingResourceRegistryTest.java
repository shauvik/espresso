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

import android.support.test.espresso.IdlingResource;
import android.support.test.espresso.base.IdlingResourceRegistry.IdleNotificationCallback;
import com.google.common.collect.Lists;


import android.os.Handler;
import android.os.Looper;
import android.test.InstrumentationTestCase;
import android.test.suitebuilder.annotation.LargeTest;
import android.util.Log;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Unit tests for {@link IdlingResourceRegistry}.
 */
public class IdlingResourceRegistryTest extends InstrumentationTestCase {

  private IdlingResourceRegistry registry;
  private Handler handler;

  @Override
  public void setUp() throws Exception {
    Looper looper = Looper.getMainLooper();
    handler = new Handler(looper);
    registry = new IdlingResourceRegistry(looper);
  }

  public void testRegisterDuplicates() {
    IdlingResource r1 = new OnDemandIdlingResource("r1");
    IdlingResource r1dup = new OnDemandIdlingResource("r1");
    registry.registerResources(Lists.newArrayList(r1));
    registry.registerResources(Lists.newArrayList(r1));
    registry.registerResources(Lists.newArrayList(r1dup));
  }

  public void testUnregisterNeverRegistered() throws InterruptedException {
    final IdlingResource r1 = new OnDemandIdlingResource("r1");
    final IdlingResource r2 = new OnDemandIdlingResource("r2");

    registry.registerResources(Lists.newArrayList(r1));
    registry.unregisterResources(Lists.newArrayList(r2));

    final AtomicBoolean resourcesIdle = new AtomicBoolean();
    final CountDownLatch latch = new CountDownLatch(1);
    handler.post(new Runnable() {
      @Override
      public void run() {
        resourcesIdle.set(registry.allResourcesAreIdle());
        latch.countDown();
      }
    });
    latch.await();

    // r1 should still be registered
    assertFalse(resourcesIdle.get());
  }

  public void testRegisterAndUnregisterIdling() throws InterruptedException {
    OnDemandIdlingResource r1 = new OnDemandIdlingResource("r1");
    r1.forceIdleNow();

    final AtomicBoolean resourcesIdle = new AtomicBoolean();

    final CountDownLatch latch = new CountDownLatch(1);
    registry.registerResources(Lists.newArrayList(r1));
    handler.post(new Runnable() {
      @Override
      public void run() {
        resourcesIdle.set(registry.allResourcesAreIdle());
        latch.countDown();
      }
    });
    latch.await();
    assertTrue(resourcesIdle.get());

    r1.reset();

    final CountDownLatch latch2 = new CountDownLatch(1);
    registry.unregisterResources(Lists.newArrayList(r1));
    handler.post(new Runnable() {
      @Override
      public void run() {
        resourcesIdle.set(registry.allResourcesAreIdle());
        latch2.countDown();
      }
    });
    latch2.await();
    assertTrue(resourcesIdle.get());
  }

  public void testRegisterAndUnregisterNeverIdling() throws InterruptedException {
    IdlingResource r1 = new OnDemandIdlingResource("r1");
    final AtomicBoolean resourcesIdle = new AtomicBoolean();

    final CountDownLatch latch = new CountDownLatch(1);
    registry.registerResources(Lists.newArrayList(r1));
    handler.post(new Runnable() {
      @Override
      public void run() {
        resourcesIdle.set(registry.allResourcesAreIdle());
        latch.countDown();
      }
    });
    latch.await();
    assertFalse(resourcesIdle.get());

    final CountDownLatch latch2 = new CountDownLatch(1);
    registry.unregisterResources(Lists.newArrayList(r1));
    handler.post(new Runnable() {
      @Override
      public void run() {
        resourcesIdle.set(registry.allResourcesAreIdle());
        latch2.countDown();
      }
    });
    latch2.await();
    assertTrue(resourcesIdle.get());
  }

  public void testRegisterAndUnregisterReturnValue() {
    IdlingResource r1 = new OnDemandIdlingResource("r1");
    IdlingResource r2 = new OnDemandIdlingResource("r2");

    assertTrue(registry.registerResources(Lists.newArrayList(r1)));
    assertFalse(registry.registerResources(Lists.newArrayList(r1)));
    assertTrue(registry.registerResources(Lists.newArrayList(r2)));

    IdlingResource r3 = new OnDemandIdlingResource("r3");
    assertFalse(registry.registerResources(Lists.newArrayList(r3, r3)));

    IdlingResource r4 = new OnDemandIdlingResource("r4");
    assertFalse(registry.unregisterResources(Lists.newArrayList(r4)));

    assertTrue(registry.unregisterResources(Lists.newArrayList(r1)));
    assertFalse(registry.unregisterResources(Lists.newArrayList(r1)));
    assertTrue(registry.unregisterResources(Lists.newArrayList(r2)));

    assertFalse(registry.unregisterResources(Lists.newArrayList(r3, r3)));
  }

  public void testGetResources() {
    IdlingResource r1 = new OnDemandIdlingResource("r1");
    IdlingResource r2 = new OnDemandIdlingResource("r2");

    assertEquals(registry.getResources().size(), 0);

    registry.registerResources(Lists.newArrayList(r1, r2));
    assertEquals(registry.getResources().size(), 2);

    registry.unregisterResources(Lists.newArrayList(r1, r2));
    assertEquals(registry.getResources().size(), 0);
  }

  public void testAllResourcesAreIdle() throws InterruptedException {
    OnDemandIdlingResource r1 = new OnDemandIdlingResource("r1");
    OnDemandIdlingResource r2 = new OnDemandIdlingResource("r2");
    IdlingResource r3 = new OnDemandIdlingResource("r3");
    r1.forceIdleNow();
    r2.forceIdleNow();
    registry.registerResources(Lists.newArrayList(r1, r2));
    final AtomicBoolean resourcesIdle = new AtomicBoolean(false);
    final CountDownLatch latch = new CountDownLatch(1);
    handler.post(new Runnable() {
      @Override
      public void run() {
        resourcesIdle.set(registry.allResourcesAreIdle());
        latch.countDown();
      }
    });
    latch.await();
    assertTrue(resourcesIdle.get());

    final CountDownLatch latch2 = new CountDownLatch(1);
    registry.registerResources(Lists.newArrayList(r3));
    handler.post(new Runnable() {
      @Override
      public void run() {
        resourcesIdle.set(registry.allResourcesAreIdle());
        latch2.countDown();
      }
    });
    latch2.await();
    assertFalse(resourcesIdle.get());
  }

  @LargeTest
  public void testAllResourcesAreIdle_RepeatingToIdleTransitions() throws InterruptedException {
    OnDemandIdlingResource r1 = new OnDemandIdlingResource("r1");
    registry.registerResources(Lists.newArrayList(r1));
    final AtomicBoolean resourcesIdle = new AtomicBoolean(false);
    for (int i = 1; i <= 3; i++) {
      final CountDownLatch latch = new CountDownLatch(1);
      handler.post(new Runnable() {
        @Override
        public void run() {
          resourcesIdle.set(registry.allResourcesAreIdle());
          latch.countDown();
        }
      });
      latch.await();
      assertFalse("Busy test " + i, resourcesIdle.get());

      r1.forceIdleNow();
      final CountDownLatch latch2 = new CountDownLatch(1);
      handler.post(new Runnable() {
        @Override
        public void run() {
          resourcesIdle.set(registry.allResourcesAreIdle());
          latch2.countDown();
        }
      });
      latch2.await();
      assertTrue("Idle transition test " + i, resourcesIdle.get());

      r1.reset();
    }
  }

  @LargeTest
  public void testNotifyWhenAllResourcesAreIdle_success() throws InterruptedException {
    final CountDownLatch busyWarningLatch = new CountDownLatch(4);
    final CountDownLatch timeoutLatch = new CountDownLatch(1);
    final CountDownLatch allResourcesIdleLatch = new CountDownLatch(1);
    final AtomicReference<List<String>> busysFromWarning = new AtomicReference<List<String>>();

    OnDemandIdlingResource r1 = new OnDemandIdlingResource("r1");
    OnDemandIdlingResource r2 = new OnDemandIdlingResource("r2");
    OnDemandIdlingResource r3 = new OnDemandIdlingResource("r3");
    registry.registerResources(Lists.newArrayList(r1, r2, r3));

    handler.post(new Runnable() {

      @Override
      public void run() {
        registry.notifyWhenAllResourcesAreIdle(new IdleNotificationCallback() {
          private static final String TAG = "IdleNotificationCallback";
          @Override
          public void resourcesStillBusyWarning(List<String> busyResourceNames) {
            Log.w(TAG, "Timeout warning: " + busyResourceNames);
            busysFromWarning.set(busyResourceNames);
            busyWarningLatch.countDown();
          }

          @Override
          public void resourcesHaveTimedOut(List<String> busyResourceNames) {
            Log.w(TAG, "Timeout error: " + busyResourceNames);
            timeoutLatch.countDown();
          }

          @Override
          public void allResourcesIdle() {
            allResourcesIdleLatch.countDown();
          }
        });
      }
    });

    assertFalse("Expected to timeout", busyWarningLatch.await(6, TimeUnit.SECONDS));
    assertEquals(3, busysFromWarning.get().size());

    r3.forceIdleNow();
    assertFalse("Expected to timeout", busyWarningLatch.await(6, TimeUnit.SECONDS));
    assertEquals(2, busysFromWarning.get().size());

    r2.forceIdleNow();
    assertFalse("Expected to timeout", busyWarningLatch.await(6, TimeUnit.SECONDS));
    assertEquals(1, busysFromWarning.get().size());

    r1.forceIdleNow();
    assertTrue(allResourcesIdleLatch.await(200, TimeUnit.MILLISECONDS));
    assertEquals(1, busyWarningLatch.getCount());
    assertEquals(1, timeoutLatch.getCount());
  }

  @LargeTest
  public void testNotifyWhenAllResourcesAreIdle_timeout() throws InterruptedException {
    final CountDownLatch busyWarningLatch = new CountDownLatch(5);
    final CountDownLatch timeoutLatch = new CountDownLatch(1);
    final CountDownLatch allResourcesIdleLatch = new CountDownLatch(1);
    final AtomicReference<List<String>> busysFromWarning = new AtomicReference<List<String>>();

    OnDemandIdlingResource r1 = new OnDemandIdlingResource("r1");
    OnDemandIdlingResource r2 = new OnDemandIdlingResource("r2");
    OnDemandIdlingResource r3 = new OnDemandIdlingResource("r3");
    registry.registerResources(Lists.newArrayList(r1, r2, r3));

    handler.post(new Runnable() {
      @Override
      public void run() {
        registry.notifyWhenAllResourcesAreIdle(new IdleNotificationCallback() {
          private static final String TAG = "IdleNotificationCallback";
          @Override
          public void resourcesStillBusyWarning(List<String> busyResourceNames) {
            Log.w(TAG, "Timeout warning: " + busyResourceNames);
            busysFromWarning.set(busyResourceNames);
            busyWarningLatch.countDown();
          }

          @Override
          public void resourcesHaveTimedOut(List<String> busyResourceNames) {
            Log.w(TAG, "Timeout error: " + busyResourceNames);
            timeoutLatch.countDown();
          }

          @Override
          public void allResourcesIdle() {
            allResourcesIdleLatch.countDown();
          }
        });
      }
    });

    assertFalse("Expected to timeout", busyWarningLatch.await(6, TimeUnit.SECONDS));
    assertEquals(3, busysFromWarning.get().size());

    r1.forceIdleNow();
    assertFalse("Expected to timeout", busyWarningLatch.await(6, TimeUnit.SECONDS));
    assertEquals(2, busysFromWarning.get().size());

    r2.forceIdleNow();
    assertFalse("Expected to timeout", busyWarningLatch.await(6, TimeUnit.SECONDS));
    assertEquals(1, busysFromWarning.get().size());

    assertTrue("Expected to finish count down", busyWarningLatch.await(8, TimeUnit.SECONDS));
    assertTrue("Should have timed out", timeoutLatch.await(2, TimeUnit.SECONDS));
    assertEquals(1, busysFromWarning.get().size());
    assertEquals(1, allResourcesIdleLatch.getCount());
  }
}
