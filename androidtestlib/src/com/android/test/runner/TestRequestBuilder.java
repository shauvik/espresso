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

import android.app.Instrumentation;
import android.util.Log;

import com.android.test.runner.ClassPathScanner.ChainedClassNameFilter;
import com.android.test.runner.ClassPathScanner.ExcludePackageNameFilter;
import com.android.test.runner.ClassPathScanner.ExternalClassNameFilter;

import org.junit.runner.Computer;
import org.junit.runner.Description;
import org.junit.runner.Request;
import org.junit.runner.Runner;
import org.junit.runner.manipulation.Filter;
import org.junit.runners.model.InitializationError;

import java.io.IOException;
import java.io.PrintStream;
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
    private TestLoader mTestLoader;
    private Filter mFilter = Filter.ALL;

    private PrintStream mWriter;

    public TestRequestBuilder(PrintStream writer, String... apkPaths) {
        mApkPaths = apkPaths;
        mTestLoader = new TestLoader(writer);
    }

    /**
     * Add a test class to be executed. All test methods in this class will be executed.
     *
     * @param className
     */
    public void addTestClass(String className) {
        mTestLoader.loadClass(className);
    }

    /**
     * Adds a test method to run.
     * <p/>
     * Currently only supports one test method to be run.
     */
    public void addTestMethod(String testClassName, String testMethodName) {
        Class<?> clazz = mTestLoader.loadClass(testClassName);
        if (clazz != null) {
            mFilter = mFilter.intersect(Filter.matchMethodDescription(
                    Description.createTestDescription(clazz, testMethodName)));
        }
    }

    /**
     * Builds the {@link TestRequest} based on current contents of added classes and methods.
     * <p/>
     * If no classes have been explicitly added, will scan the classpath for all tests.
     *
     */
    TestRequest build(Instrumentation instr) {
        if (mTestLoader.isEmpty()) {
            // no class restrictions have been specified. Load all classes
            loadClassesFromClassPath();
        }

        Request request = classes(instr, new Computer(), mTestLoader.getLoadedClasses().toArray(
                new Class[0]));
        return new TestRequest(mTestLoader.getLoadFailures(), request.filterWith(mFilter));
    }

    /**
     * Create a <code>Request</code> that, when processed, will run all the tests
     * in a set of classes.
     *
     * @param instr the {@link Instrumentation} to inject into any tests that require it
     * @param computer Helps construct Runners from classes
     * @param classes the classes containing the tests
     * @return a <code>Request</code> that will cause all tests in the classes to be run
     */
    private static Request classes(Instrumentation instr, Computer computer, Class<?>... classes) {
        try {
            AndroidRunnerBuilder builder = new AndroidRunnerBuilder(true, instr);
            Runner suite = computer.getSuite(builder, classes);
            return Request.runner(suite);
        } catch (InitializationError e) {
            throw new RuntimeException(
                    "Suite constructor, called as above, should always complete");
        }
    }

    private void loadClassesFromClassPath() {
        Collection<String> classNames = getClassNamesFromClassPath();
        for (String className : classNames) {
            mTestLoader.loadIfTest(className);
        }
    }

    private Collection<String> getClassNamesFromClassPath() {
        Log.i(LOG_TAG, String.format("Scanning classpath to find tests in apks %s",
                Arrays.toString(mApkPaths)));
        ClassPathScanner scanner = new ClassPathScanner(mApkPaths);
        try {
            // exclude inner classes, and classes from junit and this lib namespace
            return scanner.getClassPathEntries(new ChainedClassNameFilter(
                    new ExcludePackageNameFilter("junit"),
                    new ExcludePackageNameFilter("org.junit"),
                    new ExcludePackageNameFilter("org.hamcrest"),
                    new ExternalClassNameFilter()));
        } catch (IOException e) {
            mWriter.println("failed to scan classes");
            Log.e(LOG_TAG, "Failed to scan classes", e);
        }
        return Collections.emptyList();
    }

    /**
     * Factory method for {@link ClassPathScanner}.
     * <p/>
     * Exposed so unit tests can mock.
     */
    ClassPathScanner createClassPathScanner(String... apkPaths) {
        return new ClassPathScanner(apkPaths);
    }
}
