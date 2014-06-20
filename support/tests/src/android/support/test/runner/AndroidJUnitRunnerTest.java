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
package android.support.test.runner;

import android.content.Context;
import android.os.Bundle;
import android.support.test.internal.runner.TestRequestBuilder;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.Reader;
import java.io.StringReader;

/**
 * Unit tests for {@link AndroidJUnitRunner}.
 */
public class AndroidJUnitRunnerTest {

    private AndroidJUnitRunner mAndroidJUnitRunner;
    private PrintStream mStubStream;
    @Mock
    private TestRequestBuilder mMockBuilder;
    @Mock
    private Context mMockContext;

    @Before
    public void setUp() throws Exception {
        mAndroidJUnitRunner = new AndroidJUnitRunner() {


            @Override
            TestRequestBuilder createTestRequestBuilder(PrintStream writer,
                    String... packageCodePaths) {
                return mMockBuilder;
            }

            @Override
            public Context getContext() {
                return mMockContext;
            }
        };
        mAndroidJUnitRunner.setArguments(new Bundle());
        mStubStream = new PrintStream(new ByteArrayOutputStream());
        MockitoAnnotations.initMocks(this);
    }

    /**
     * Test {@link AndroidJUnitRunner#buildRequest(Bundle, PrintStream)} when
     * a single class name is provided.
     */
    @Test
    public void testBuildRequest_singleClass() {
        Bundle b = new Bundle();
        b.putString(AndroidJUnitRunner.ARGUMENT_TEST_CLASS, "ClassName");
        mAndroidJUnitRunner.buildRequest(b, mStubStream);
        Mockito.verify(mMockBuilder).addTestClass("ClassName");
    }

    /**
     * Test {@link AndroidJUnitRunner#buildRequest(Bundle, PrintStream)} when
     * multiple class names are provided.
     */
    @Test
    public void testBuildRequest_multiClass() {
        Bundle b = new Bundle();
        b.putString(AndroidJUnitRunner.ARGUMENT_TEST_CLASS, "ClassName1,ClassName2");
        mAndroidJUnitRunner.buildRequest(b, mStubStream);
        Mockito.verify(mMockBuilder).addTestClass("ClassName1");
        Mockito.verify(mMockBuilder).addTestClass("ClassName2");
    }

    /**
     * Test {@link AndroidJUnitRunner#buildRequest(Bundle, PrintStream)} when
     * class name and method name is provided.
     */
    @Test
    public void testBuildRequest_method() {
        Bundle b = new Bundle();
        b.putString(AndroidJUnitRunner.ARGUMENT_TEST_CLASS, "ClassName1#method");
        mAndroidJUnitRunner.buildRequest(b, mStubStream);
        Mockito.verify(mMockBuilder).addTestMethod("ClassName1", "method");
    }

    /**
     * Test {@link AndroidJUnitRunner#buildRequest(Bundle, PrintStream)} when
     * class name and method name is provided along with an additional class name.
     */
    @Test
    public void testBuildRequest_classAndMethodCombo() {
        Bundle b = new Bundle();
        b.putString(AndroidJUnitRunner.ARGUMENT_TEST_CLASS, "ClassName1#method,ClassName2");
        mAndroidJUnitRunner.buildRequest(b, mStubStream);
        Mockito.verify(mMockBuilder).addTestMethod("ClassName1", "method");
        Mockito.verify(mMockBuilder).addTestClass("ClassName2");
    }

    /**
     * Temp file used for testing
     */
    @Rule
    public TemporaryFolder mTmpFolder = new TemporaryFolder();

    /**
     * Test {@link AndroidJUnitRunner#buildRequest(Bundle, PrintStream)} when
     * multiple class and method names are provided within a test file
     */
    @Test
    public void testBuildRequest_testFile() throws IOException {
        final File file = mTmpFolder.newFile("myTestFile.txt");
        BufferedWriter out = new BufferedWriter(new FileWriter(file));
        out.write("ClassName3\n");
        out.write("ClassName4#method2\n");
        out.close();

        Bundle b = new Bundle();
        b.putString(AndroidJUnitRunner.ARGUMENT_TEST_FILE, file.getPath());
        b.putString(AndroidJUnitRunner.ARGUMENT_TEST_CLASS, "ClassName1#method1,ClassName2");
        mAndroidJUnitRunner.buildRequest(b, mStubStream);
        Mockito.verify(mMockBuilder).addTestMethod("ClassName1", "method1");
        Mockito.verify(mMockBuilder).addTestClass("ClassName2");
        Mockito.verify(mMockBuilder).addTestClass("ClassName3");
        Mockito.verify(mMockBuilder).addTestMethod("ClassName4", "method2");
    }
}
