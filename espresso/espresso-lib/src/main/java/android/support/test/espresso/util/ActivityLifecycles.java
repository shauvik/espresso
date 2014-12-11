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

package android.support.test.espresso.util;

import android.support.test.runner.lifecycle.ActivityLifecycleMonitor;
import android.support.test.runner.lifecycle.Stage;


/**
 * Helper methods to understand ActivityLifecycle of the app.
 */
public final class ActivityLifecycles {

  private ActivityLifecycles() {}


  /**
   * Indicates whether or not an Activity in our app is currently in the foreground.
   *
   * <p>The "Foreground lifetime" of an activity occurs after a call to onResume and before a call
   * to onPause.
   *
   * <p>During this time, the activity is in front of all other activities and is currently
   * receiving user input.
   *
   * @param monitor the ActivityLifecycleMonitor to use.
   * @return true if an activity exists in the foreground state.
   */
  public static boolean hasForegroundActivities(ActivityLifecycleMonitor monitor) {
    return !monitor.getActivitiesInStage(Stage.RESUMED).isEmpty();
  }


  /**
   * Indicates whether or not an Activity exists in our app within the "Visible Lifetime" state.
   *
   * <p>The "Visible Lifetime" is defined as an activity who's onStart() method has been called but
   * who's onStop() method has not been called.
   *
   * <p>During this time, the Activity may be visible to the user, and it may be receiving input 
   * from the user. This time is a superset of the "Foreground lifetime' of the activity.
   *
   * <p>It may be the case that an application has activities in the "visible lifetime" but none in
   * the "Foreground lifetime." It may be the case that without user input an activity will shortly
   * transition into the "Foreground lifetime" in this state, however it also may not transition
   * without further user interaction.
   *
   * @param monitor the ActivityLifecycleMonitor to use
   * @return true if any activity exists within it's foreground lifetime.
   */
  public static boolean hasVisibleActivities(ActivityLifecycleMonitor monitor) {
    return hasForegroundActivities(monitor)
        || !monitor.getActivitiesInStage(Stage.RESTARTED).isEmpty()
        || !monitor.getActivitiesInStage(Stage.STARTED).isEmpty()
        || !monitor.getActivitiesInStage(Stage.PAUSED).isEmpty();
  }

}
