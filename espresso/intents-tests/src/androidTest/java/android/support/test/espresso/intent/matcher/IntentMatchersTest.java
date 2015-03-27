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
import static android.support.test.espresso.intent.matcher.IntentMatchers.hasAction;
import static android.support.test.espresso.intent.matcher.IntentMatchers.hasCategories;
import static android.support.test.espresso.intent.matcher.IntentMatchers.hasComponent;
import static android.support.test.espresso.intent.matcher.IntentMatchers.hasData;
import static android.support.test.espresso.intent.matcher.IntentMatchers.hasExtra;
import static android.support.test.espresso.intent.matcher.IntentMatchers.hasExtraWithKey;
import static android.support.test.espresso.intent.matcher.IntentMatchers.hasExtras;
import static android.support.test.espresso.intent.matcher.IntentMatchers.hasFlags;
import static android.support.test.espresso.intent.matcher.IntentMatchers.hasPackage;
import static android.support.test.espresso.intent.matcher.IntentMatchers.hasType;
import static android.support.test.espresso.intent.matcher.IntentMatchers.isInternal;
import static android.support.test.espresso.intent.matcher.IntentMatchers.toPackage;
import static android.support.test.espresso.intent.matcher.UriMatchers.hasHost;
import static android.support.test.espresso.intent.matcher.UriMatchers.hasParamWithValue;
import static android.support.test.espresso.intent.matcher.UriMatchers.hasPath;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.hasItems;

import android.support.test.espresso.intent.ResolvedIntent;
import android.support.test.InstrumentationRegistry;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

import junit.framework.TestCase;

import org.hamcrest.Matcher;

import java.util.HashSet;

/**
 * Unit tests for {@link IntentMatchers}.
 */
public class IntentMatchersTest extends TestCase {

  private final Uri uri = Uri.parse("https://www.google.com/search?q=Matcher");

  // TODO(user): Clean up these tests - each matcher should be tested separated.

  @SuppressWarnings("unchecked")
  public void testMatches() {
    Matcher<Intent> matcher = allOf(hasAction(equalTo(Intent.ACTION_VIEW)),
        hasData(allOf(hasHost(equalTo("www.google.com")),
            hasPath(equalTo("/search")),
            hasParamWithValue(equalTo("q"), equalTo("Matcher")))),
        hasCategories(hasItem(equalTo("category"))),
        hasType(equalTo(Context.ACTIVITY_SERVICE)),
        hasExtras(hasEntry(equalTo("key"), equalTo("value"))));
    Intent intent = new Intent(Intent.ACTION_VIEW).addCategory("category")
        .setDataAndType(uri, Context.ACTIVITY_SERVICE).putExtra("key", "value");
    assertTrue(matcher.matches(intent));
  }

  @SuppressWarnings("unchecked")
  public void testMatchesIntentWithNoTypeAndMatcherWithType() {
    Matcher<Intent> matcher = allOf(hasAction(equalTo(Intent.ACTION_VIEW)),
        hasData(allOf(hasHost(equalTo("www.google.com")),
            hasPath(equalTo("/search")),
            hasParamWithValue(equalTo("q"), equalTo("Matcher")))),
        hasCategories(hasItem(equalTo("category"))),
        hasType(equalTo(Context.ACTIVITY_SERVICE)),
        hasExtras(hasEntry(equalTo("key"), equalTo("value"))));
    assertFalse(
        matcher.matches(new Intent(Intent.ACTION_VIEW).setData(uri).addCategory("category")));
  }

  @SuppressWarnings("unchecked")
  public void testMatchesIntentWithTypeAndMatcherWithNoType() {
    Matcher<Intent> matcher = hasAction(equalTo(Intent.ACTION_VIEW));
    Intent intent = new Intent(Intent.ACTION_VIEW).addCategory("category")
        .setDataAndType(uri, Context.ACTIVITY_SERVICE);
    assertTrue(matcher.matches(intent));
  }

  @SuppressWarnings("unchecked")
  public void testMatchesIntentWithNoExtraAndMatcherWithOneExtra() {
    Matcher<Intent> matcher = allOf(hasAction(equalTo(Intent.ACTION_VIEW)),
        hasData(allOf(hasHost(equalTo("www.google.com")),
            hasPath(equalTo("/search")),
            hasParamWithValue(equalTo("q"), equalTo("Matcher")))),
        hasCategories(hasItem(equalTo("category"))),
        hasType(equalTo(Context.ACTIVITY_SERVICE)),
        hasExtras(hasEntry(equalTo("key"), equalTo("value"))));
    assertFalse(matcher.matches(new Intent(Intent.ACTION_VIEW).addCategory("category")
        .setDataAndType(uri, Context.ACTIVITY_SERVICE)));
  }

  @SuppressWarnings("unchecked")
  public void testMatchesIntentWithOneExtraAndMatcherWithNoExtra() {
    Matcher<Intent> matcher = allOf(hasAction(equalTo(Intent.ACTION_VIEW)),
        hasData(allOf(hasHost(equalTo("www.google.com")),
            hasPath(equalTo("/search")),
            hasParamWithValue(equalTo("q"), equalTo("Matcher")))),
        hasCategories(hasItem(equalTo("category"))),
        hasType(equalTo(Context.ACTIVITY_SERVICE)));
    assertTrue(matcher.matches(new Intent(Intent.ACTION_VIEW).addCategory("category")
        .setDataAndType(uri, Context.ACTIVITY_SERVICE).putExtra("key", "value")));
  }

  @SuppressWarnings("unchecked")
  public void testMatchesIntentWithMultipleExtraAndMatcherWithMultipleExtra() {
    Matcher<Intent> matcher = hasExtras(allOf(
        hasEntry(equalTo("key1"), equalTo("value1")),
        hasEntry(equalTo("key1"), equalTo("value1"))));
    assertTrue(matcher.matches(new Intent(Intent.ACTION_VIEW).addCategory("category")
        .setDataAndType(uri, Context.ACTIVITY_SERVICE).putExtra("key1", "value1")
        .putExtra("key2", "value2")));
  }

  @SuppressWarnings("unchecked")
  public void testMatchesIntentWithNoCategoryAndMatcherWithOneCategory() {
    Matcher<Intent> matcher = hasCategories(hasItem(equalTo("category")));
    assertFalse(matcher.matches(new Intent(Intent.ACTION_VIEW, uri)));
  }

  @SuppressWarnings("unchecked")
  public void testMatchesIntentWithOneCategoryAndMatcherWithNoCategory() {
    Matcher<Intent> matcher = hasAction(equalTo(Intent.ACTION_VIEW));
    assertTrue(matcher.matches(new Intent(Intent.ACTION_VIEW, uri).addCategory("category")));
  }

  @SuppressWarnings("unchecked")
  public void testMatchesIntentAndMatcherWithMultipleCategory() {
    Matcher<Intent> matcher =
        hasCategories(allOf(hasItem(equalTo("category")), hasItem(equalTo("category1"))));
    assertTrue(matcher.matches(
        new Intent(Intent.ACTION_VIEW, uri).addCategory("category").addCategory("category1")));
  }

  @SuppressWarnings("unchecked")
  public void testMatchesIntentWithOneCategoryAndMatcherWithMultipleCategories() {
    Matcher<Intent> matcher = hasCategories(allOf(
        hasItem(equalTo("category")),
        hasItem(equalTo("category1")),
        hasItem(equalTo("category2"))));
    assertFalse(matcher.matches(new Intent(Intent.ACTION_VIEW, uri).addCategory("category")));
  }

  public void testHasAction() {
    Intent intent = new Intent(Intent.ACTION_VIEW).addCategory("category")
        .setDataAndType(uri, Context.ACTIVITY_SERVICE).putExtra("key", "value");
    assertTrue(hasAction(Intent.ACTION_VIEW).matches(intent));
    assertTrue(hasAction(equalTo(Intent.ACTION_VIEW)).matches(intent));
  }

  public void testHasActionDoesNotMatch() {
    Intent intent = new Intent(Intent.ACTION_VIEW).addCategory("category")
        .setDataAndType(uri, Context.ACTIVITY_SERVICE).putExtra("key", "value");
    assertFalse(hasAction(Intent.ACTION_DIAL).matches(intent));
    assertFalse(hasAction(equalTo(Intent.ACTION_DIAL)).matches(intent));
  }

  public void testHasCategories() {
    Intent intent = new Intent(Intent.ACTION_VIEW);
    intent.addCategory("category");
    intent.addCategory("category1");
    intent.addCategory("category2");

    assertTrue(hasCategories(intent.getCategories()).matches(intent));
    assertTrue(hasCategories(hasItems("category", "category1", "category2")).matches(intent));
  }

  public void testHasCategoriesDoesNotMatch() {
    Intent intent = new Intent(Intent.ACTION_VIEW);
    intent.addCategory("category");
    intent.addCategory("category1");
    intent.addCategory("category2");

    HashSet<String> set = new HashSet<String>();
    set.add("category");
    set.add("category1");
    set.add("category8");

    assertFalse(hasCategories(set).matches(intent));
    assertFalse(hasCategories(hasItems("category", "category1", "category8")).matches(intent));
  }

  public void testHasComponent() {
    Intent intent = new Intent(Intent.ACTION_VIEW);
    String pkg = "com.some.wonderful.package.name";
    String cls = pkg + ".FooBar";
    ComponentName c = new ComponentName(pkg, cls);
    intent.setComponent(c);

    assertTrue(hasComponent(intent.getComponent().getClassName()).matches(intent));
    assertTrue(hasComponent(intent.getComponent()).matches(intent));
    assertTrue(hasComponent(equalTo(c)).matches(intent));
  }

  public void testHasComponentDoesNotMatch() {
    Intent intent = new Intent(Intent.ACTION_VIEW);
    String pkg = "com.some.wonderful.package.name";
    String cls = pkg + ".FooBar";
    ComponentName c = new ComponentName(pkg, cls);
    intent.setComponent(c);

    c = new ComponentName(pkg, pkg + ".Baz");
    assertFalse(hasComponent("not_component").matches(intent));
    assertFalse(hasComponent(c).matches(intent));
    assertFalse(hasComponent(equalTo(c)).matches(intent));
  }

  public void testHasData() {
    Intent intent = new Intent(Intent.ACTION_VIEW).addCategory("category")
        .setDataAndType(uri, Context.ACTIVITY_SERVICE).putExtra("key1", "value1");

    assertTrue(hasData(uri.toString()).matches(intent));
    assertTrue(hasData(uri).matches(intent));
    assertTrue(hasData(equalTo(uri)).matches(intent));
  }

  public void testHasDataDoesMatch() {
    Intent intent = new Intent(Intent.ACTION_VIEW).addCategory("category")
        .setDataAndType(uri, Context.ACTIVITY_SERVICE).putExtra("key1", "value1");

    assertFalse(hasData("https://www.google.com/search?q=NotMatcher").matches(intent));
    assertFalse(hasData(Uri.parse("https://www.google.com/search?q=NotMatcher")).matches(intent));
    assertFalse(
        hasData(equalTo(Uri.parse("https://www.google.com/search?q=NotMatcher"))).matches(intent));
  }

  public void testHasType() {
    Intent intent = new Intent(Intent.ACTION_VIEW);
    intent.addCategory("category");
    intent.setDataAndType(uri, Context.ACTIVITY_SERVICE);
    intent.putExtra("key1", "value1");

    assertTrue(hasType(Context.ACTIVITY_SERVICE).matches(intent));
    assertTrue(hasType(equalTo(Context.ACTIVITY_SERVICE)).matches(intent));
  }

  public void testHasTypeDoesNotMatch() {
    Intent intent = new Intent(Intent.ACTION_VIEW);
    intent.addCategory("category");
    intent.setDataAndType(uri, Context.ACTIVITY_SERVICE);
    intent.putExtra("key1", "value1");

    assertFalse(hasType(Context.ACCOUNT_SERVICE).matches(intent));
    assertFalse(hasType(equalTo(Context.ACCOUNT_SERVICE)).matches(intent));
  }

  public void testToPackage() {
    final String pkg = "pkg1";
    ResolvedIntent intent = new FakeResolvedIntent(pkg);
    assertTrue(toPackage(pkg).matches(intent));
    assertFalse(toPackage("notpkg1").matches(intent));
    try {
      toPackage("whatever").matches(new Intent(Intent.ACTION_VIEW));
      fail("Expected previous call to fail.");
    } catch (RuntimeException expected) {

    }
  }

  public void testHasExtraWithKey() {
    Intent intent = new Intent().putExtra("key1", "value1").putExtra("key2", 100.0);
    assertTrue(hasExtraWithKey("key1").matches(intent));
    assertTrue(hasExtraWithKey("key2").matches(intent));
  }

  public void testHasExtra() {
    Intent intent = new Intent().putExtra("key1", "value1").putExtra("key2", 100.0);
    assertTrue(hasExtra("key1", "value1").matches(intent));
    assertTrue(hasExtra("key2", 100.0).matches(intent));
  }

  public void testHasExtraWithKeyDoesNotMatch() {
    Intent intent = new Intent().putExtra("key1", "value1");
    assertFalse(hasExtraWithKey("key2").matches(intent));
  }

  public void testHasExtraDoesNotMatch() {
    Intent intent = new Intent().putExtra("key1", "value1");
    assertFalse(hasExtra("key1", "value2").matches(intent));
    assertFalse(hasExtra("key2", "value1").matches(intent));
  }

  public void testHasPackageMatches() {
    Intent intent = new Intent().setPackage("com.foo.bar");
    assertTrue(hasPackage("com.foo.bar").matches(intent));
    assertTrue(hasPackage(equalTo("com.foo.bar")).matches(intent));
  }

  public void testHasPackageDoesNotMatch() {
    Intent intent = new Intent().setPackage("com.foo.bar");
    assertFalse(hasPackage("com.baz.qux").matches(intent));
    assertFalse(hasPackage(equalTo("com.baz.qux")).matches(intent));
  }

  public void testHasPackageNoPackage() {
    Intent intent = new Intent();
    assertFalse(hasPackage("com.foo.bar").matches(intent));
    assertFalse(hasPackage(equalTo("com.foo.bar")).matches(intent));
  }

  public void testHasFlagsWithSingleFlag() {
    Intent intent = new Intent();
    assertTrue(hasFlags(0).matches(intent));
    intent.setFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION);
    assertTrue(hasFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION).matches(intent));
  }

  public void testHasFlagsWithMultipleFlags() {
    Intent intent = new Intent();
    intent.setFlags(Intent.FLAG_DEBUG_LOG_RESOLUTION | Intent.FLAG_ACTIVITY_NO_HISTORY
        | Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);
    assertTrue(hasFlags(Intent.FLAG_DEBUG_LOG_RESOLUTION).matches(intent));
    assertTrue(hasFlags(Intent.FLAG_ACTIVITY_NO_HISTORY).matches(intent));
    assertTrue(hasFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS).matches(intent));
    assertTrue(hasFlags(Intent.FLAG_DEBUG_LOG_RESOLUTION
        | Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS).matches(intent));
    assertTrue(hasFlags(Intent.FLAG_DEBUG_LOG_RESOLUTION | Intent.FLAG_ACTIVITY_NO_HISTORY
        | Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS).matches(intent));
  }

  public void testHasFlagsWithCustomFlags() {
    Intent intent = new Intent();
    intent.addFlags(Intent.FLAG_DEBUG_LOG_RESOLUTION | 8 | 4 | 2);
    assertTrue((hasFlags(8 | 2)).matches(intent));
    assertTrue((hasFlags(Intent.FLAG_DEBUG_LOG_RESOLUTION | 4)).matches(intent));
    assertTrue((hasFlags(Intent.FLAG_DEBUG_LOG_RESOLUTION, 8, 4)).matches(intent));
  }

  public void testHasFlagsDoesNotMatch() {
    Intent intent = new Intent();
    assertFalse(hasFlags(Intent.FLAG_DEBUG_LOG_RESOLUTION).matches(intent));
    intent.setFlags(Intent.FLAG_DEBUG_LOG_RESOLUTION | Intent.FLAG_ACTIVITY_NO_HISTORY);
    assertFalse(hasFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS).matches(intent));
    assertFalse(hasFlags(Intent.FLAG_DEBUG_LOG_RESOLUTION
        | Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS).matches(intent));
  }

  public void testHasFlagsWithCustomFlagsDoesNotMatch() {
    Intent intent = new Intent();
    intent.addFlags(Intent.FLAG_DEBUG_LOG_RESOLUTION | 8);
    assertFalse((hasFlags(16)).matches(intent));
    assertFalse((hasFlags(Intent.FLAG_ACTIVITY_NO_HISTORY | 8)).matches(intent));
  }

  public void testIsInternal() {
    String targetPackage =
        InstrumentationRegistry.getTargetContext().getPackageName();
    ComponentName targetComponent = new ComponentName(targetPackage, targetPackage + ".SomeClass ");
    assertTrue(isInternal().matches(new Intent().setComponent(targetComponent)));
    assertFalse(not(isInternal()).matches(new Intent().setComponent(targetComponent)));
  }

  public void testIsInternalDoesNotMatch() {
    assertFalse(isInternal().matches(new Intent())); // no target package
    ComponentName externalComponent = new
        ComponentName("com.google.android", "com.google.android.SomeClass");
    assertFalse(isInternal().matches(new Intent().setComponent(externalComponent)));
  }

  private class FakeResolvedIntent extends Intent implements ResolvedIntent {
    private final String pkg;

    FakeResolvedIntent(String pkg) {
      this.pkg = pkg;
    }

    @Override
    public boolean canBeHandledBy(String appPackage) {
      return appPackage.equals(pkg);
    }

    @Override
    public Intent getIntent() {
      return this;
    }
  };
}
