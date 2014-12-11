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

import static com.google.common.base.Throwables.propagate;

import android.os.Message;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Recycles messages thru recycleUnchecked method.
 */
class UncheckedRecycler implements Recycler {

  private static final String UNCHECKED_RECYCLE_METHOD_NAME = "recycleUnchecked";
  private final Method uncheckedRecycle;

  UncheckedRecycler() {
    try {
      uncheckedRecycle = Message.class.getDeclaredMethod(UNCHECKED_RECYCLE_METHOD_NAME);
      uncheckedRecycle.setAccessible(true);
    } catch (NoSuchMethodException nsme) {
      throw propagate(nsme);
    }
  }

  public void recycle(Message message) {
    try {
      uncheckedRecycle.invoke(message);
    } catch (IllegalAccessException iae) {
      throw propagate(iae);
    } catch (InvocationTargetException ite) {
      if (ite.getCause() != null) {
        throw propagate(ite.getCause());
      } else {
        throw propagate(ite);
      }
    }
  }
}
