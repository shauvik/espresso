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

package android.support.test.espresso.assertion;

import static android.support.test.espresso.assertion.PositionAssertions.isRelativePosition;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.spy;

import android.support.test.espresso.assertion.PositionAssertions.Position;

import android.test.AndroidTestCase;
import android.view.View;

import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

/**
 * Test case for {@link PositionAssertions}.
 */
public class PositionAssertionsUnitTest extends AndroidTestCase {
  private static final int AXIS_X = 0;
  private static final int AXIS_Y = 1;

  public void testIsRelativePosition_NoOverlap() {
    View v1 = setupView(10 /* x */, 10 /* y */, 30 /* width */, 20 /* height */);
    View v2 = setupView(100 /* x */, 100 /* y */, 15 /* width */, 10 /* height */);

    assertTrue("v1 is NOT left of v2, " + getDebugDetails(v1, v2),
        isRelativePosition(v1, v2, Position.LEFT_OF));
    assertTrue("v2 is NOT right of v1, " + getDebugDetails(v1, v2),
        isRelativePosition(v2, v1, Position.RIGHT_OF));
    assertTrue("v1 is NOT above v2, " + getDebugDetails(v1, v2),
        isRelativePosition(v1, v2, Position.ABOVE));
    assertTrue("v2 is NOT below v1, " + getDebugDetails(v1, v2),
        isRelativePosition(v2, v1, Position.BELOW));
    assertFalse("Unexpected left alignement of v1 and v2, " + getDebugDetails(v1, v2),
        isRelativePosition(v1, v2, Position.LEFT_ALIGNED));
    assertFalse("Unexpected right alignement of v1 and v2, " + getDebugDetails(v1, v2),
        isRelativePosition(v2, v1, Position.RIGHT_ALIGNED));
    assertFalse("Unexpected top alignement of v1 and v2, " + getDebugDetails(v1, v2),
        isRelativePosition(v1, v2, Position.TOP_ALIGNED));
    assertFalse("Unexpected bottom alignement of v1 and v2, " + getDebugDetails(v1, v2),
        isRelativePosition(v2, v1, Position.BOTTOM_ALIGNED));
  }

  public void testIsRelativePosition_Overlap() {
    // 2 views v1 is overlapping with v2
    View v1 = setupView(10 /* x */, 10 /* y */, 30 /* width */, 20 /* height */);
    // Test the case of 2 Views, v1 left of v2 with 1 pixel overlap at the border
    // and overlapped vertically from pixel 12 to 22.
    View v2 = setupView(40 /* x */, 12 /* y */, 15 /* width */, 10 /* height */);

    assertTrue("v1 is not left of v2 " + getDebugDetails(v1, v2),
        isRelativePosition(v1, v2, Position.LEFT_OF));
    assertTrue("v1 is not right of v2 " + getDebugDetails(v1, v2),
        isRelativePosition(v2, v1, Position.RIGHT_OF));
    assertFalse("v1 is above v2, although they overlap, " + getDebugDetails(v1, v2),
        isRelativePosition(v1, v2, Position.ABOVE));
    assertFalse("v1 is below v2, although they overlap, " + getDebugDetails(v1, v2),
        isRelativePosition(v2, v1, Position.BELOW));
    assertFalse("v1 is left aligned with v2, although they overlap, " + getDebugDetails(v1, v2),
        isRelativePosition(v2, v1, Position.LEFT_ALIGNED));
    assertFalse("v1 is right aligned with v2, although they overlap, " + getDebugDetails(v1, v2),
        isRelativePosition(v2, v1, Position.RIGHT_ALIGNED));
    assertFalse("v1 is top aligned with v2, although they overlap, " + getDebugDetails(v1, v2),
        isRelativePosition(v2, v1, Position.TOP_ALIGNED));
    assertFalse("v1 is bottom aligned with v2, although they overlap, " + getDebugDetails(v1, v2),
        isRelativePosition(v2, v1, Position.BOTTOM_ALIGNED));
  }

  public void testIsRelativePosition_AlignedLeft() {
    // 2 views aligned left at x=10
    View v1 = setupView(10 /* x */, 10 /* y */, 30 /* width */, 20 /* height */);
    View v2 = setupView(10 /* x */, 100 /* y */, 15 /* width */, 10 /* height */);

    assertTrue("v1 and v2 are NOT left aligned, " + getDebugDetails(v1, v2),
        isRelativePosition(v2, v1, Position.LEFT_ALIGNED));
    assertFalse("Unexpected right alignement of v1 and v2, " + getDebugDetails(v1, v2),
        isRelativePosition(v2, v1, Position.RIGHT_ALIGNED));
    assertFalse("v1 is left of v2, although they are left aligned, " + getDebugDetails(v1, v2),
        isRelativePosition(v1, v2, Position.LEFT_OF));
    assertFalse("v1 is right of v2, although they are left aligned, " + getDebugDetails(v1, v2),
        isRelativePosition(v2, v1, Position.RIGHT_OF));
  }

  public void testIsRelativePosition_AlignedRight() {
    // 2 views that aligned to right at x = 40
    View v1 = setupView(10 /* x */, 10 /* y */, 30 /* width */, 30 /* height */);
    View v2 = setupView(30 /* x */, 20 /* y */, 10 /* width */, 10 /* height */);

    assertTrue("v1 and v2 are NOT right aligned, " + getDebugDetails(v1, v2),
        isRelativePosition(v2, v1, Position.RIGHT_ALIGNED));
    assertFalse("Unexpected left alignement of v1 and v2, " + getDebugDetails(v1, v2),
        isRelativePosition(v2, v1, Position.LEFT_ALIGNED));
    assertFalse("v1 is left of v2 although they are horizontally overlapped, "
        + getDebugDetails(v1, v2), isRelativePosition(v1, v2, Position.LEFT_OF));
    assertFalse("v1 is right of v2 although they are right aligned, " + getDebugDetails(v1, v2),
        isRelativePosition(v2, v1, Position.RIGHT_OF));
  }

  public void testIsRelativePosition_AlignedTop() {
    // 2 views that aligned TOP at y = 10
    View v1 = setupView(10 /* x */, 10 /* y */, 30 /* width */, 30 /* height */);
    View v2 = setupView(50 /* x */, 10 /* y */, 10 /* width */, 10 /* height */);

    assertTrue("v1 and v2 are NOT Top aligned, " + getDebugDetails(v1, v2),
        isRelativePosition(v2, v1, Position.TOP_ALIGNED));
    assertFalse("Unexpected bottom alignement of v1 and v2, " + getDebugDetails(v1, v2),
        isRelativePosition(v2, v1, Position.BOTTOM_ALIGNED));
    assertFalse("v1 is above of v2 although they are top aligned, " + getDebugDetails(v1, v2),
        isRelativePosition(v2, v1, Position.ABOVE));
    assertFalse("v1 is below of v2 although they are vertically overlapped, "
        + getDebugDetails(v1, v2), isRelativePosition(v2, v1, Position.BELOW));
  }

  public void testIsRelativePosition_AlignedBottom() {
    // 2 views that aligned Bottom at y = 100
    View v1 = setupView(10 /* x */, 10 /* y */, 30 /* width */, 90 /* height */);
    View v2 = setupView(20 /* x */, 50 /* y */, 10 /* width */, 50 /* height */);

    assertTrue("v1 and v2 are NOT bottom aligned, " + getDebugDetails(v1, v2),
        isRelativePosition(v2, v1, Position.BOTTOM_ALIGNED));
    assertFalse("Unexpected top alignement of v1 and v2, " + getDebugDetails(v1, v2),
        isRelativePosition(v2, v1, Position.TOP_ALIGNED));
    assertFalse("v1 is above of v2 although they are bottom aligned, " + getDebugDetails(v1, v2),
        isRelativePosition(v2, v1, Position.ABOVE));
    assertFalse("v1 is below of v2 although they are vertically overlapped, "
        + getDebugDetails(v1, v2), isRelativePosition(v2, v1, Position.BELOW));
  }

  //Helper methods
  private View setupView(final int x, final  int y, final int width, final int height) {
    View mockView = spy(new View(getContext()));
    doAnswer(new Answer<Void>() {
      @Override
      public Void answer(InvocationOnMock invocation) throws Throwable {
        int[] array = (int[]) invocation.getArguments()[0];
        array[AXIS_X] = x;
        array[AXIS_Y] = y;
        return null;
      }
    }).when(mockView).getLocationOnScreen(any(int[].class));
    mockView.layout(x, y, x + width, y + height);
    return mockView;
  }

  private String getDebugDetails(View v1, View v2) {
    int[] location1 = new int[2];
    int[] location2 = new int[2];
    v1.getLocationOnScreen(location1);
    v2.getLocationOnScreen(location2);

    return new StringBuilder().append("v1 coordinates: (")
        .append("").append(location1[0]).append(", ").append(location1[1])
        .append("), v2 coordinates: (").append(location2[0]).append(", ").append(location2[1])
        .append(")").toString();
  }
}
