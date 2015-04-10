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

import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Placeholder test to verify {@link InstrumentationRegistry#getArguments()}.
 */
@RunWith(AndroidJUnit4.class)
public class BundleJUnit4Test {

    public BundleJUnit4Test() {
        Log.d("BundleJUnit4Test", "I'm created");
    }

    @Test
    public void verifyBundleInjected() {
        Assert.assertNotNull(InstrumentationRegistry.getArguments());
    }
}
