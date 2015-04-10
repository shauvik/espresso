/*
 * Copyright (C) 2014 The Android Open Source Project
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
package android.support.test;

import android.app.Instrumentation;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

/**
 * Placeholder to verify {@link Instrumentation} can be injected into {@link Parameterized} tests
 */
@RunWith(Parameterized.class)
public class MyParameterizedTest {

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 0, 0 }, { 1, 1 }
        });
    }

    private final int mInput;
    private final int mExpected;

    public MyParameterizedTest(int i, int b) {
        mInput = i;
        mExpected = b;
    }

    @Test
    public void testFoo() {
        Assert.assertEquals(mInput, mExpected);
        Assert.assertNotNull(InstrumentationRegistry.getInstrumentation());
    }
}
