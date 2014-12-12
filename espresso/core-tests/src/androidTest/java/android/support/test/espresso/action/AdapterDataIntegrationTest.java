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

import static android.support.test.espresso.Espresso.onData;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.hasSibling;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.hasEntry;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;

import android.support.test.testapp.LongListActivity;
import android.support.test.testapp.R;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.LargeTest;

import java.util.Map;

/**
 * Integration tests for operating on data displayed in an adapter.
 */
@LargeTest
public class AdapterDataIntegrationTest extends ActivityInstrumentationTestCase2<LongListActivity> {
  @SuppressWarnings("deprecation")
  public AdapterDataIntegrationTest() {
    // Supporting froyo.
    super("android.support.test.testapp", LongListActivity.class);
  }

  @Override
  public void setUp() throws Exception {
    super.setUp();
    getActivity();
  }

  @SuppressWarnings("unchecked")
  public void testClickAroundList() {
    onData(allOf(is(instanceOf(Map.class)), hasEntry(is(LongListActivity.STR), is("item: 99"))))
        .perform(click());
    onView(withId(R.id.selection_row_value))
        .check(matches(withText("99")));

    onData(allOf(is(instanceOf(Map.class)), hasEntry(is(LongListActivity.STR), is("item: 1"))))
        .perform(click());

    onView(withId(R.id.selection_row_value))
        .check(matches(withText("1")));

    onData(allOf(is(instanceOf(Map.class))))
        .atPosition(20)
        .perform(click());

    onView(withId(R.id.selection_row_value))
        .check(matches(withText("20")));

    // lets operate on a specific child of a row...
    onData(allOf(is(instanceOf(Map.class)), hasEntry(is(LongListActivity.STR), is("item: 50"))))
        .onChildView(withId(R.id.item_size))
        .perform(click())
        .check(matches(withText(String.valueOf("item: 50".length()))));

    onView(withId(R.id.selection_row_value))
        .check(matches(withText("50")));
  }

  @SuppressWarnings("unchecked")
  public void testSelectItemWithSibling() {
    onView(allOf(withText("7"), hasSibling(withText("item: 0"))))
        .perform(click());
    onView(withId(R.id.selection_row_value))
        .check(matches(withText("0")));
  }
}
