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

package com.google.android.apps.common.testing.ui.espresso;

import android.support.test.internal.runner.tracker.UsageTrackerRegistry;

import static com.google.common.base.Preconditions.checkNotNull;
import static com.google.common.base.Preconditions.checkState;

import com.google.android.apps.common.testing.ui.espresso.base.BaseLayerModule;
import com.google.android.apps.common.testing.ui.espresso.base.IdlingResourceRegistry;

import dagger.Module;
import dagger.ObjectGraph;

import java.util.concurrent.atomic.AtomicReference;

/**
 * Holds Espresso's ObjectGraph.
 */
public final class GraphHolder {

  private static final AtomicReference<GraphHolder> instance =
      new AtomicReference<GraphHolder>(null);

  private final ObjectGraph graph;

  private GraphHolder(ObjectGraph graph) {
    this.graph = checkNotNull(graph);
  }

  static ObjectGraph graph() {
    GraphHolder instanceRef = instance.get();
    if (null == instanceRef) {
      instanceRef = new GraphHolder(ObjectGraph.create(EspressoModule.class));
      if (instance.compareAndSet(null, instanceRef)) {
        UsageTrackerRegistry.getInstance().trackUsage("Espresso");
        return instanceRef.graph;
      } else {
        return instance.get().graph;
      }
    } else {
      return instanceRef.graph;
    }
  }

  // moe:begin_strip
  public static void initialize(Object... modules) {
    checkNotNull(modules);
    Object[] allModules = new Object[modules.length + 1];
    allModules[0] = EspressoModule.class;
    System.arraycopy(modules, 0, allModules, 1, modules.length);
    GraphHolder holder = new GraphHolder(ObjectGraph.create(modules));
    checkState(instance.compareAndSet(null, holder), "Espresso already initialized.");
  }
  // moe:end_strip

  @Module(
    includes = BaseLayerModule.class,
    injects = IdlingResourceRegistry.class
  )
  static class EspressoModule {
  }

}
