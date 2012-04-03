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

import junit.framework.Test;

import org.junit.runner.Description;
import org.junit.runner.notification.Failure;

import java.io.PrintStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * A class for loading JUnit3 and JUnit4 test classes given a set of potential class names.
 */
public class TestLoader {

    private static final String LOG_TAG = "TestLoader";

    public static class LoadResults {
        private final List<Class<?>> mLoadedClasses;
        private final List<Failure> mMissingClasses;

        LoadResults(List<Class<?>> loadedClasses, List<Failure> missingClasses) {
            mMissingClasses = missingClasses;
            mLoadedClasses = loadedClasses;
        }

        public List<Class<?>> getLoadedClasses() {
            return mLoadedClasses;
        }

        public List<Failure> getLoadFailures() {
            return mMissingClasses;
        }
    }

    /**
     * Loads the test classes from the given list of test names.
     *
     * @param classNames the {@link Collection} of class names to attempt to load
     * @param writer the {@link PrintStream} to use to output error messages
     * @return the {@link LoadResults} containing the test classes
     */
    public LoadResults loadTests(Collection<String> classNames, PrintStream writer) {
        List<Class<?>> classes = new ArrayList<Class<?>>();
        List<Failure> missingClasses = new ArrayList<Failure>();
        for (String className : classNames) {
            try {
                Class<?> loadedClass = Class.forName(className);
                if (isTestClass(loadedClass)) {
                    classes.add(loadedClass);
                }
            } catch (ClassNotFoundException e) {
                String errMsg = String.format("Could not find class: %s", className);
                Log.e(LOG_TAG, errMsg);
                writer.println(errMsg);
                Description description = Description.createSuiteDescription(className);
                Failure failure = new Failure(description, e);
                missingClasses.add(failure);
            }
        }
        return new LoadResults(classes, missingClasses);
    }

    /**
     * Determines if given class is a valid test class.
     *
     * @param loadedClass
     * @return <code>true</code> if loadedClass is a test
     */
    private boolean isTestClass(Class<?> loadedClass) {
        // TODO: try to find upstream junit calls to replace these checks
        if (Test.class.isAssignableFrom(loadedClass)) {
            return true;
        }
        // TODO: look for a 'suite' method?
        if (loadedClass.isAnnotationPresent(org.junit.runner.RunWith.class)) {
            return true;
        }
        for (Method testMethod : loadedClass.getMethods()) {
            if (testMethod.isAnnotationPresent(org.junit.Test.class)) {
                return true;
            }
        }
        Log.v(LOG_TAG, String.format("Skipping class %s: not a test", loadedClass.getName()));
        return false;
    }
}
