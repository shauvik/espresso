/*
 * Copyright (C) 2012 The Android Open Source Project
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
package com.android.test.runner;

import android.util.Log;

import com.android.test.runner.ClassPathScanner.ChainedClassNameFilter;
import com.android.test.runner.ClassPathScanner.ExcludePackageNameFilter;
import com.android.test.runner.ClassPathScanner.ExternalClassNameFilter;
import com.android.test.runner.TestLoader.LoadResults;

import org.junit.runner.Request;
import org.junit.runner.manipulation.Filter;

import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * Builds a {@link Request} from test classes in given apk paths, filtered on provided set of
 * restrictions.
 */
public class TestRequestBuilder {

    private static final String LOG_TAG = "TestRequestBuilder";

    private String[] mApkPaths;
    private Collection<String> mTestClasses = new ArrayList<String>();
    @SuppressWarnings("unused")
    private Filter mFilter = Filter.ALL;

    public TestRequestBuilder(String... apkPaths) {
        mApkPaths = apkPaths;
    }

    /**
     * Add a test class to be executed
     * @param className
     *
     * TODO: add method support
     */
    public void addTestClass(String className) {
        mTestClasses.add(className);
    }

    TestRequest build(PrintStream writer) {
        if (mTestClasses.isEmpty()) {
            mTestClasses = getClassNames(writer);
        }
        TestLoader loader = new TestLoader();
        LoadResults loadedTests = loader.loadTests(mTestClasses, writer);

        Request request = Request.classes(loadedTests.getLoadedClasses().toArray(new Class[0]));
        return new TestRequest(loadedTests.getLoadFailures(), request);
    }

    private Collection<String> getClassNames(PrintStream writer) {
        Log.i(LOG_TAG, String.format("Scanning classpath to find tests in apks %s",
                Arrays.toString(mApkPaths)));
        ClassPathScanner scanner = new ClassPathScanner(mApkPaths);
        try {
            // exclude inner classes, and classes from junit namespace
            return scanner.getClassPathEntries(new ChainedClassNameFilter(
                    new ExcludePackageNameFilter("junit"),
                    new ExcludePackageNameFilter("org.junit"),
                    new ExcludePackageNameFilter("org.hamcrest"),
                    new ExternalClassNameFilter()));
        } catch (IOException e) {
            writer.println("failed to scan classes");
            Log.e(LOG_TAG, "Failed to scan classes", e);
        }
        return Collections.emptyList();
    }
}
