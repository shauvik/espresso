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

package android.support.test.espresso;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;
import android.test.AndroidTestCase;
import android.view.View;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.hamcrest.StringDescription;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

/** Unit tests for {@link NoMatchingViewException}. */
public class NoMatchingViewExceptionTest extends AndroidTestCase {
  private Matcher<View> alwaysFailingMatcher;

  @Mock
  private View testView;

  @Override
  public void setUp() throws Exception {
    super.setUp();
    MockitoAnnotations.initMocks(this);
    alwaysFailingMatcher = Matchers.<View>nullValue();
  }

  public void testExceptionContainsMatcherDescription() {
    StringBuilder matcherDescription = new StringBuilder();
    alwaysFailingMatcher.describeTo(new StringDescription(matcherDescription));
    assertThat(createException().getMessage(), containsString(matcherDescription.toString()));
  }

  public void testExceptionContainsView() {
    String exceptionMessage = createException().getMessage();

    assertThat("missing root element" + exceptionMessage, exceptionMessage,
        containsString("{id=0,"));
  }

  public void testException_MatcherDescriptionReturnsCorrectValue () {
    final NoMatchingViewException noMatchingViewExcpetion = createException();
    final String viewMatcherDescription = noMatchingViewExcpetion.getViewMatcherDescription();

    assertThat("wrong view matcher description", viewMatcherDescription, equalTo("null"));
  }

  private NoMatchingViewException createException() {
    return new NoMatchingViewException.Builder()
        .withViewMatcher(alwaysFailingMatcher)
        .withRootView(testView)
        .build();
  }
}
