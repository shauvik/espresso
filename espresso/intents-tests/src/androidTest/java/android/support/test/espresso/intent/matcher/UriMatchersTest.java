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

import static android.support.test.espresso.intent.matcher.UriMatchers.getQueryParameterNames;
import static android.support.test.espresso.intent.matcher.UriMatchers.hasHost;
import static android.support.test.espresso.intent.matcher.UriMatchers.hasParamWithName;
import static android.support.test.espresso.intent.matcher.UriMatchers.hasParamWithValue;
import static android.support.test.espresso.intent.matcher.UriMatchers.hasPath;
import static android.support.test.espresso.intent.matcher.UriMatchers.hasScheme;
import static android.support.test.espresso.intent.matcher.UriMatchers.hasSchemeSpecificPart;
import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.equalTo;

import com.google.common.collect.Sets;

import android.net.Uri;

import junit.framework.TestCase;

import org.hamcrest.Matcher;

import java.util.Set;

/**
 * Unit tests for {@link UriMatchers}.
 */
public class UriMatchersTest extends TestCase {

  private final Uri uri =
      Uri.parse("https://www.google.com/search?q=Matcher&aq=f&oq=Matcher&sourceid=chrome&ie=UTF-8");

  public void testHasHost() {
    String host = "www.google.com";
    assertTrue("HasHost didn't match", hasHost(host).matches(uri));
    assertTrue("HasHost didn't match", hasHost(equalTo(host)).matches(uri));
  }

  public void testHasHostDoesNotMatch() {
    String host = "www.android.com";
    assertFalse("HasHost Matched, But it shouldn't have", hasHost(host).matches(uri));
    assertFalse("HasHost Matched, But it shouldn't have", hasHost(equalTo(host)).matches(uri));
  }

  public void testHasPath() {
    String pathName = "/search";
    assertTrue("HasPath didn't match", hasPath(pathName).matches(uri));
    assertTrue("HasPath didn't match", hasPath(equalTo(pathName)).matches(uri));
  }

  public void testHasPathDoesNotMatch() {
    String pathName = "/query";
    assertFalse("HasPath Matched, But it shouldn't have", hasPath(pathName).matches(uri));
    assertFalse("HasPath Matched, But it shouldn't have", hasPath(equalTo(pathName)).matches(uri));
  }

  public void testHasScheme() {
    Uri schemeUri = Uri.parse("market://details?id=com.google.android.apps.plus");
    assertTrue("HasPath didn't match", hasScheme("market").matches(schemeUri));
    assertTrue("HasPath didn't match", hasScheme(equalTo("market")).matches(schemeUri));
  }

  public void testHasSchemeDoesNotMatch() {
    Uri schemeUri = Uri.parse("market://details?id=com.google.android.apps.plus");
    assertFalse("HasPath Matched, But it shouldn't have", hasScheme("details").matches(schemeUri));
    assertFalse("HasPath Matched, But it shouldn't have",
        hasScheme(equalTo("details")).matches(schemeUri));
  }

  public void testHasSchemeSpecificPart() {
    Uri schemeUri = Uri.parse("tel:123456789");
    Matcher<Uri> hasSchemeMatcher = hasSchemeSpecificPart(equalTo("tel"), equalTo("123456789"));
    assertTrue("HasScheme didn't match",
        hasSchemeSpecificPart("tel", "123456789").matches(schemeUri));
    assertTrue("HasScheme didn't match", hasSchemeMatcher.matches(schemeUri));
  }

  public void testHasSchemeSpecificPartDoesNotMatch() {
    Uri schemeUri = Uri.parse("tel:123456789");
    Matcher<Uri> hasSchemeMatcher = hasSchemeSpecificPart(equalTo("tel"), equalTo("987654321"));
    assertFalse("HasScheme Matched, But it shouldn't have",
        hasSchemeSpecificPart("tel", "987654321").matches(schemeUri));
    assertFalse("HasScheme Matched, But it shouldn't have", hasSchemeMatcher.matches(schemeUri));
  }

  public void testHasParamName() {
    String paramName = "sourceid";
    assertTrue("HasParam didn't match", hasParamWithName(paramName).matches(uri));
    assertTrue("HasParam didn't match", hasParamWithName(equalTo(paramName)).matches(uri));
  }

  public void testHasParamNameDoesNotMatch() {
    String paramName = "param";
    assertFalse("HasParamName Matched, But it shouldn't have",
        hasParamWithName(paramName).matches(uri));
    assertFalse("HasParamName Matched, But it shouldn't have",
        hasParamWithName(equalTo(paramName)).matches(uri));
  }

  public void testHasParamWithValue() {
    Matcher<Uri> hasParamWithValue = hasParamWithValue(equalTo("sourceid"), equalTo("chrome"));
    assertTrue("HasParamWithValue didn't match",
        hasParamWithValue("sourceid", "chrome").matches(uri));
    assertTrue("HasParamWithValue didn't match", hasParamWithValue.matches(uri));
  }

  public void testHasParamWithValueMatcherDoesNotMatch() {
    Matcher<Uri> hasParamWithValue = hasParamWithValue(equalTo("sourceid"), equalTo("google"));
    assertFalse("HasParamWithValue Matched, But it shouldn't have",
        hasParamWithValue("sourceid", "google").matches(uri));
    assertFalse("HasParamWithValue Matched, But it shouldn't have", hasParamWithValue.matches(uri));
  }

  public void testAllOfMatcher() {
    @SuppressWarnings("unchecked")
    Matcher<Uri> allOfMatcher = allOf(hasHost(equalTo("www.google.com")),
        hasParamWithName("sourceid"),
        hasParamWithName("aq"),
        hasPath("/search"),
        hasParamWithValue("q", "Matcher"),
        hasParamWithValue("aq", "f"),
        hasParamWithValue("oq", "Matcher"),
        hasParamWithValue("sourceid", "chrome"),
        hasParamWithValue("ie", "UTF-8"));

    assertTrue("AllOf matcher didn't match", allOfMatcher.matches(uri));
  }

  public void testAllOfMatcherForMailToScheme() {
    @SuppressWarnings("unchecked")
    Uri schemeUri = Uri.parse("mailto:nobody@google.com");
    Matcher<Uri> allOfMatcher = allOf(hasScheme(equalTo("mailto")),
        hasSchemeSpecificPart(equalTo("mailto"), equalTo("nobody@google.com")));

    assertTrue("AllOf matcher for MailTo Scheme didn't match", allOfMatcher.matches(schemeUri));
  }

  public void testAllOfWithWrongMatcher() {
    @SuppressWarnings("unchecked")
    Matcher<Uri> allOfMatcher = allOf(
        hasHost("www.google.com"), hasParamWithName("sourceid"),
        hasParamWithName("param"), hasPath("/search"));
    assertFalse("Matcher shouldn't have matched.", allOfMatcher.matches(uri));
  }

  public void testAnyOfMatcherWithOneMatch() {
    @SuppressWarnings("unchecked")
    Matcher<Uri> anyOfMatcher = anyOf(
        hasHost(equalTo("www.google.com")), hasParamWithName(equalTo("param1")),
        hasParamWithName(equalTo("param2")));

    assertTrue("AnyOf matcher didn't match", anyOfMatcher.matches(uri));
  }

  public void testAnyOfMatcherWithMoreThanOneMatch() {
    @SuppressWarnings("unchecked")
    Matcher<Uri> anyOfMatcher = anyOf(
        hasHost(equalTo("www.google.com")), hasPath(equalTo("/search")),
        hasParamWithName(equalTo("param2")), hasParamWithValue(equalTo("ie"), equalTo("UTF-8")));

    assertTrue("AnyOf matcher didn't match", anyOfMatcher.matches(uri));
  }

  public void testGetQueryParameterNames() {
    Set<String> paramNames = getQueryParameterNames(uri);
    assertTrue(paramNames.equals(Sets.newHashSet("q", "aq", "oq", "sourceid", "ie")));
  }

  public void testMatches() {
    @SuppressWarnings("unchecked")
    Matcher<Uri> matcher = allOf(hasHost(equalTo("www.google.com")), hasPath(equalTo("/search")),
        hasParamWithValue(equalTo("q"), equalTo("Matcher")),
        hasParamWithValue(equalTo("aq"), equalTo("f")));
    Uri uri = Uri.parse("https://www.google.com/search?q=Matcher&aq=f");
    assertTrue("Matches failed.", matcher.matches(uri));
  }
}
