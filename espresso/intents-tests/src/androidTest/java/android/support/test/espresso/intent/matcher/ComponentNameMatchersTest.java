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

package android.support.test.espresso.intent.matcher;

import static android.support.test.espresso.intent.matcher.ComponentNameMatchers.hasClassName;
import static android.support.test.espresso.intent.matcher.ComponentNameMatchers.hasMyPackageName;
import static android.support.test.espresso.intent.matcher.ComponentNameMatchers.hasPackageName;
import static android.support.test.espresso.intent.matcher.ComponentNameMatchers.hasShortClassName;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;

import android.support.test.InstrumentationRegistry;
import android.content.ComponentName;

import junit.framework.TestCase;

/**
 * Unit tests for {@link ComponentNameMatchers}.
 */
public class ComponentNameMatchersTest extends TestCase {

  private static final String PKG = "com.some.wonderful.package.name";
  private static final String SHORT_CLASS_NAME = ".FooBar";
  private static final String CLS = PKG + SHORT_CLASS_NAME;
  private static final ComponentName c = new ComponentName(PKG, CLS);

  public void testHasClassName() {
    assertTrue(hasClassName(CLS).matches(c));
    assertTrue(hasClassName(equalTo(CLS)).matches(c));
  }

  public void testHasClassNameDoesNotMatch() {
    assertFalse(hasClassName("not_there").matches(c));
    assertFalse(hasClassName(containsString("not there")).matches(c));
  }

  public void testHasPackageName() {
    assertTrue(hasPackageName(PKG).matches(c));
    assertTrue(hasPackageName(equalTo(PKG)).matches(c));
  }

  public void testHasPackageNameDoesNotMatch() {
    assertFalse(hasPackageName("not_there").matches(c));
    assertFalse(hasPackageName(containsString(SHORT_CLASS_NAME)).matches(c));
  }

  public void testHasShortClassName() {
    assertTrue(hasShortClassName(SHORT_CLASS_NAME).matches(c));
    assertTrue(hasShortClassName(equalTo(SHORT_CLASS_NAME)).matches(c));
  }

  public void testHasShortClassNameDoesNotMatch() {
    assertFalse(hasShortClassName("not_there").matches(c));
    assertFalse(hasShortClassName(equalTo(CLS)).matches(c));
  }

  public void testHasMyPackageName() {
    String targetPackage =
        InstrumentationRegistry.getTargetContext().getPackageName();
    ComponentName targetComponent = new ComponentName(targetPackage, targetPackage + ".SomeClass ");
    assertTrue(hasMyPackageName().matches(targetComponent));
  }

  //This test will fail because PKG is not the target package for this instrumentation.
  public void testHasMyPackageNameDoesNotMatch() {
    assertFalse(hasMyPackageName().matches(c));
  }
}
