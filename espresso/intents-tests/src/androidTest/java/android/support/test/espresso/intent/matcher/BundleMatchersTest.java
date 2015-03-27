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

import static android.support.test.espresso.intent.matcher.BundleMatchers.hasEntry;
import static android.support.test.espresso.intent.matcher.BundleMatchers.hasKey;
import static android.support.test.espresso.intent.matcher.BundleMatchers.hasValue;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.instanceOf;

import android.os.Bundle;

import junit.framework.TestCase;

/**
 * Unit tests for {@link BundleMatchers}.
 */
public class BundleMatchersTest extends TestCase {

  public void testHasEntry() {
    Bundle bundle = new Bundle();
    bundle.putInt("key", 1);

    assertTrue(hasEntry("key", 1).matches(bundle));
    assertTrue(hasEntry("key", equalTo(1)).matches(bundle));
    assertTrue(hasEntry(equalTo("key"), equalTo(1)).matches(bundle));
  }

  public void testHasEntryDoesNotMatch() {
    Bundle bundle = new Bundle();
    bundle.putInt("key", 1);

    assertFalse(hasEntry("key", 2).matches(bundle));
    assertFalse(hasEntry("keyy", 1).matches(bundle));
    assertFalse(hasEntry("key", equalTo(2)).matches(bundle));
    assertFalse(hasEntry(equalTo("key"), equalTo(2)).matches(bundle));
  }

  public void testHasKey() {
    Bundle bundle = new Bundle();
    bundle.putBoolean("key", true);

    assertTrue(hasKey("key").matches(bundle));
    assertTrue(hasKey(equalTo("key")).matches(bundle));
  }

  public void testHasKeyDoesNotMatch() {
    Bundle bundle = new Bundle();
    bundle.putBoolean("key", true);

    assertFalse(hasKey("keyy").matches(bundle));
    assertFalse(hasKey(equalTo("keyy")).matches(bundle));
  }

  public void testHasKeyWithMultipleEntries() {
    Bundle bundle = new Bundle();
    bundle.putDouble("key", 10000000);
    bundle.putDouble("key1", 10000001);
    bundle.putBundle("key2", new Bundle());

    assertTrue(hasKey("key2").matches(bundle));
    assertTrue(hasKey(equalTo("key2")).matches(bundle));
  }

  public void testHasValue() {
    Bundle bundle = new Bundle();
    Bundle value = new Bundle();
    value.putString("hello", "world");
    bundle.putBundle("key", value);

    assertTrue(hasValue(hasValue("world")).matches(bundle));
    assertTrue(hasValue(hasValue(equalTo("world"))).matches(bundle));
  }

  public void testHasValueDoesNotMatch() {
    Bundle bundle = new Bundle();
    Bundle value = new Bundle();
    value.putString("hello", "world");
    bundle.putBundle("key", value);

    assertFalse(hasValue(hasValue("not_world")).matches(bundle));
    assertFalse(hasValue(hasValue(equalTo("not_world"))).matches(bundle));
  }

  public void testHasValueWithMultipleEntries() {
    Bundle bundle = new Bundle();
    bundle.putDouble("key", 10000000);
    bundle.putDouble("key1", 10000001);
    bundle.putBundle("key2", new Bundle());

    double dbl = 10000000;
    assertTrue(hasValue(dbl).matches(bundle));
    assertTrue(hasValue(instanceOf(Double.class)).matches(bundle));
  }
}
