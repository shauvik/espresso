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

import android.support.test.espresso.action.EspressoKey.Builder;

import android.os.Build;
import android.view.KeyEvent;

import junit.framework.TestCase;

/**
 * Unit tests for {@link Builder}.
 */
public class EspressoKeyBuilderTest extends TestCase {

  static final int KEY_CODE = KeyEvent.KEYCODE_X;

  public void testBuildWithNoMetaState() {
    EspressoKey key = new Builder().withKeyCode(KEY_CODE).build();
    assertEquals(KEY_CODE, key.getKeyCode());
    assertEquals(0, key.getMetaState());
  }

  public void testBuildWithShiftPressed() {
    EspressoKey key = new Builder().withKeyCode(KEY_CODE).withShiftPressed(true).build();
    assertEquals(KEY_CODE, key.getKeyCode());
    assertEquals(KeyEvent.META_SHIFT_ON, key.getMetaState());
  }

  public void testBuildWithCtrlPressed() {
    EspressoKey key = new Builder().withKeyCode(KEY_CODE).withCtrlPressed(true).build();
    assertEquals(KEY_CODE, key.getKeyCode());

    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
      assertEquals(KeyEvent.META_CTRL_ON, key.getMetaState());
    } else {
      assertEquals(0, key.getMetaState());
    }
  }

  public void testBuildWithAltPressed() {
    EspressoKey key = new Builder().withKeyCode(KEY_CODE).withAltPressed(true).build();
    assertEquals(KEY_CODE, key.getKeyCode());
    assertEquals(KeyEvent.META_ALT_ON, key.getMetaState());
  }

  public void testBuildWithAllMetaKeysPressed() {
    EspressoKey key = new Builder().withKeyCode(KEY_CODE)
        .withShiftPressed(true)
        .withCtrlPressed(true)
        .withAltPressed(true)
        .build();

    assertEquals(KEY_CODE, key.getKeyCode());
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
      assertEquals(KeyEvent.META_SHIFT_ON | KeyEvent.META_CTRL_ON | KeyEvent.META_ALT_ON,
          key.getMetaState());
    } else {
      assertEquals(KeyEvent.META_SHIFT_ON | KeyEvent.META_ALT_ON, key.getMetaState());
    }
  }
}