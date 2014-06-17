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

package com.google.android.apps.common.testing.ui.espresso.matcher;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


import static com.google.android.apps.common.testing.ui.espresso.matcher.PreferenceMatchers.withKey;
import static com.google.android.apps.common.testing.ui.espresso.matcher.PreferenceMatchers.withSummary;
import static com.google.android.apps.common.testing.ui.espresso.matcher.PreferenceMatchers.withSummaryText;
import static com.google.android.apps.common.testing.ui.espresso.matcher.PreferenceMatchers.withTitle;
import static com.google.android.apps.common.testing.ui.espresso.matcher.PreferenceMatchers.withTitleText;
import static com.google.android.apps.common.testing.ui.espresso.matcher.PreferenceMatchers.isEnabled;
import static org.hamcrest.Matchers.not;

import com.google.android.apps.common.testing.ui.testapp.test.R;

import android.test.InstrumentationTestCase;
import android.preference.CheckBoxPreference;
import android.preference.EditTextPreference;

/**
 * Unit tests for preference matchers.
 */
public class PreferenceMatchersTest extends InstrumentationTestCase {


  public void testWithSummary() {
    CheckBoxPreference pref = new CheckBoxPreference(getInstrumentation().getContext());
    pref.setSummary(R.string.something);
    assertThat(pref, withSummary(R.string.something));
    assertThat(pref, not(withSummary(R.string.other_string)));
    assertThat(pref, withSummaryText("Hello World"));
    assertThat(pref, not(withSummaryText(("Hello Mars"))));
    assertThat(pref, withSummaryText(is("Hello World")));
  }

  public void testWithTitle() {
    CheckBoxPreference pref = new CheckBoxPreference(getInstrumentation().getContext());
    pref.setTitle(R.string.other_string);
    assertThat(pref, withTitle(R.string.other_string));
    assertThat(pref, not(withTitle(R.string.something)));
    assertThat(pref, withTitleText("Goodbye!!"));
    assertThat(pref, not(withTitleText(("Hello Mars"))));
    assertThat(pref, withTitleText(is("Goodbye!!")));
  }


  public void testIsEnabled() {
    CheckBoxPreference pref = new CheckBoxPreference(getInstrumentation().getContext());
    pref.setEnabled(true);
    assertThat(pref, isEnabled());
    pref.setEnabled(false);
    assertThat(pref, not(isEnabled()));
    EditTextPreference pref2 = new EditTextPreference(getInstrumentation().getContext());
    pref2.setEnabled(true);
    assertThat(pref2, isEnabled());
    pref2.setEnabled(false);
    assertThat(pref2, not(isEnabled()));
  }

  public void testWithKey() {
    CheckBoxPreference pref = new CheckBoxPreference(getInstrumentation().getContext());
    pref.setKey("foo");
    assertThat(pref, withKey("foo"));
    assertThat(pref, not(withKey("bar")));
    assertThat(pref, withKey(is("foo")));
  }
}
