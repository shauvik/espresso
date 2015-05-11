/*
 * Copyright (C) 2015 The Android Open Source Project
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

package android.support.test.espresso.web.bridge;

import android.support.test.espresso.web.deps.guava.util.concurrent.SettableFuture;

import android.support.test.espresso.web.bridge.Conduit;
import android.test.AndroidTestCase;
import android.test.suitebuilder.annotation.SmallTest;

import java.util.concurrent.ExecutionException;

/**
 * Unit tests for JSBB.
 */
@SmallTest
public class JavaScriptBoundBridgeTest extends AndroidTestCase {

  private JavaScriptBoundBridge bridge;

  @Override
  public void setUp() throws Exception {
    super.setUp();
    bridge = new JavaScriptBoundBridge();
  }

  public void testStandardFlow() throws Exception {
    Conduit c = makeConduit("hello");
    bridge.addConduit(c);
    bridge.setResult("hello", "world");
    assertTrue(c.getResult().isDone());
    assertEquals("world", c.getResult().get());
  }

  public void testStandardFlow_Exception() throws Exception {
    Conduit c = makeConduit("hello");
    bridge.addConduit(c);
    bridge.setError("hello", "OhNo!");
    assertTrue(c.getResult().isDone());
    try {
      c.getResult().get();
      fail("should throw an exception!");
    } catch (ExecutionException expected) { }
  }

  public void testUFODoesNothing() throws Exception {
    Conduit c = makeConduit("hello");
    bridge.addConduit(c);
    bridge.setResult("something unknown", "blah!");
    assertFalse(c.getResult().isDone());
  }

  public void testUFODoesNothing_Exception() throws Exception {
    Conduit c = makeConduit("hello");
    bridge.addConduit(c);
    bridge.setError("something unknown", "blah!");
    assertFalse(c.getResult().isDone());
  }

  private Conduit makeConduit(String token) {
    return new Conduit.Builder()
        .withBridgeName("junk")
        .withErrorMethod("foo")
        .withSuccessMethod("bar")
        .withToken(token)
        .withJsResult(SettableFuture.<String>create())
        .build();
  }
}
