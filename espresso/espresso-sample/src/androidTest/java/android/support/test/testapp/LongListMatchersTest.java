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

package android.support.test.testapp;

import static android.support.test.espresso.matcher.ViewMatchers.assertThat;
import static android.support.test.testapp.LongListMatchers.withItemContent;
import static android.support.test.testapp.LongListMatchers.withItemSize;
import static org.hamcrest.Matchers.anyOf;
import static org.hamcrest.Matchers.endsWith;
import static org.hamcrest.Matchers.equalTo;

import android.content.Intent;
import android.test.ActivityUnitTestCase;

/**
 * UnitTests for LongListMatchers matcher factory.
 */
public final class LongListMatchersTest extends ActivityUnitTestCase<LongListActivity> {

  public LongListMatchersTest() {
    super(LongListActivity.class);
  }

  @Override
  public void setUp() throws Exception {
    super.setUp();
    startActivity(new Intent(getInstrumentation().getTargetContext(), LongListActivity.class),
        null, null);
  }

  public void testWithContent() {
    assertThat(getActivity().makeItem(54), withItemContent("item: 54"));
    assertThat(getActivity().makeItem(54), withItemContent(endsWith("54")));
    assertFalse(withItemContent("hello world").matches(getActivity().makeItem(54)));
  }

  @SuppressWarnings("unchecked")
  public void testWithItemSize() {
    assertThat(getActivity().makeItem(54), withItemSize(8));
    assertThat(getActivity().makeItem(54), withItemSize(anyOf(equalTo(8), equalTo(7))));
    assertFalse(withItemSize(7).matches(getActivity().makeItem(54)));
  }
}
