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

import static com.google.common.base.Preconditions.checkNotNull;

import android.support.test.espresso.UiController;
import android.support.test.espresso.action.MotionEvents.DownResultHolder;

import android.util.Log;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/**
 * Executes different click types to given position.
 */
public enum Tap implements Tapper {
  SINGLE {
  @Override
    public Tapper.Status sendTap(UiController uiController, float[] coordinates,
        float[] precision) {
      checkNotNull(uiController);

      checkNotNull(coordinates);
      checkNotNull(precision);
      DownResultHolder res = MotionEvents.sendDown(uiController, coordinates, precision);
      try {
        if (!MotionEvents.sendUp(uiController, res.down)) {
          Log.d(TAG, "Injection of up event as part of the click failed. Send cancel event.");
          MotionEvents.sendCancel(uiController, res.down);
          return Tapper.Status.FAILURE;
        }
      } finally {
        res.down.recycle();
      }
      return res.longPress ? Tapper.Status.WARNING : Tapper.Status.SUCCESS;
    }
  },
  LONG {
  @Override
    public Tapper.Status sendTap(UiController uiController, float[] coordinates,
        float[] precision) {
      checkNotNull(uiController);
      checkNotNull(coordinates);
      checkNotNull(precision);

      MotionEvent downEvent = MotionEvents.sendDown(uiController, coordinates, precision).down;
      try {
        // Duration before a press turns into a long press.
        // Factor 1.5 is needed, otherwise a long press is not safely detected.
        // See android.test.TouchUtils longClickView
        long longPressTimeout = (long) (ViewConfiguration.getLongPressTimeout() * 1.5f);
        uiController.loopMainThreadForAtLeast(longPressTimeout);

        if (!MotionEvents.sendUp(uiController, downEvent)) {
          MotionEvents.sendCancel(uiController, downEvent);
          return Tapper.Status.FAILURE;
        }
      } finally {
        downEvent.recycle();
        downEvent = null;
      }
      return Tapper.Status.SUCCESS;
    }
  },
  DOUBLE {
  @Override
    public Tapper.Status sendTap(UiController uiController, float[] coordinates,
        float[] precision) {
      checkNotNull(uiController);
      checkNotNull(coordinates);
      checkNotNull(precision);
      Tapper.Status stat = SINGLE.sendTap(uiController, coordinates, precision);
      if (stat == Tapper.Status.FAILURE) {
        return Tapper.Status.FAILURE;
      }

      Tapper.Status secondStat = SINGLE.sendTap(uiController, coordinates, precision);

      if (secondStat == Tapper.Status.FAILURE) {
        return Tapper.Status.FAILURE;
      }

      if (secondStat == Tapper.Status.WARNING || stat == Tapper.Status.WARNING) {
        return Tapper.Status.WARNING;
      } else {
        return Tapper.Status.SUCCESS;
      }
    }
  };

  private static final String TAG = Tap.class.getSimpleName();

}
