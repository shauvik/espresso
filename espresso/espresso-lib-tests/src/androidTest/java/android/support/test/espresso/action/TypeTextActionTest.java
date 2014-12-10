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

import static org.mockito.Matchers.isA;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

import android.support.test.espresso.InjectEventSecurityException;
import android.support.test.espresso.PerformException;
import android.support.test.espresso.UiController;

import android.view.MotionEvent;
import android.view.View;

import junit.framework.TestCase;

import org.mockito.Mock;

/**
 * Unit tests for {@link TypeTextAction}.
 */
public class TypeTextActionTest extends TestCase {
  @Mock
  private UiController mockUiController;

  @Mock
  private View mockView;

  private TypeTextAction typeTextAction;

  @Override
  public void setUp() throws Exception {
    super.setUp();
    initMocks(this);
  }

  public void testTypeTextActionPerform() throws InjectEventSecurityException {
    String stringToBeTyped = "Hello!";
    typeTextAction = new TypeTextAction(stringToBeTyped);
    when(mockUiController.injectMotionEvent(isA(MotionEvent.class))).thenReturn(true);
    when(mockUiController.injectString(stringToBeTyped)).thenReturn(true);
    typeTextAction.perform(mockUiController, mockView);
  }

  public void testTypeTextActionPerformFailed() throws InjectEventSecurityException {
    String stringToBeTyped = "Hello!";
    typeTextAction = new TypeTextAction(stringToBeTyped);
    when(mockUiController.injectMotionEvent(isA(MotionEvent.class))).thenReturn(true);
    when(mockUiController.injectString(stringToBeTyped)).thenReturn(false);

    try {
      typeTextAction.perform(mockUiController, mockView);
      fail("Should have thrown PerformException");
    } catch (PerformException e) {
      if (e.getCause() instanceof InjectEventSecurityException) {
        fail("Exception cause should NOT be of type InjectEventSecurityException");
      }
    }
  }

  public void testTypeTextActionPerformInjectEventSecurityException()
      throws InjectEventSecurityException {
    String stringToBeTyped = "Hello!";
    typeTextAction = new TypeTextAction(stringToBeTyped);
    when(mockUiController.injectMotionEvent(isA(MotionEvent.class))).thenReturn(true);
    when(mockUiController.injectString(stringToBeTyped))
        .thenThrow(new InjectEventSecurityException(""));

    try {
      typeTextAction.perform(mockUiController, mockView);
      fail("Should have thrown PerformException");
    } catch (PerformException e) {
      if (!(e.getCause() instanceof InjectEventSecurityException)) {
        fail("Exception cause should be of type InjectEventSecurityException");
      }
    }
  }
}
