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
package android.support.test.internal.runner;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.test.runner.AndroidJUnitRunner;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.junit.runner.Runner;
import org.mockito.Mockito;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * Unit tests for {@link android.support.test.internal.runner.RunnerArgs}.
 */
public class RunnerArgsTest {

    /**
     * Simple test for parsing test class name
     */
    @Test
    public void testFromBundle_singleClass() {
        Bundle b = new Bundle();
        b.putString(RunnerArgs.ARGUMENT_TEST_CLASS, "ClassName");
        RunnerArgs args = new RunnerArgs.Builder().fromBundle(b).build();
        assertEquals(1, args.tests.size());
        assertEquals("ClassName", args.tests.get(0).testClassName);
        assertNull(args.tests.get(0).methodName);
    }

    /**
     * Test parsing bundle when multiple class names are provided.
     */
    @Test
    public void testFromBundle_multiClass() {
        Bundle b = new Bundle();
        b.putString(RunnerArgs.ARGUMENT_TEST_CLASS, "ClassName1,ClassName2");
        RunnerArgs args = new RunnerArgs.Builder().fromBundle(b).build();
        assertEquals(2, args.tests.size());
        assertEquals("ClassName1", args.tests.get(0).testClassName);
        assertEquals("ClassName2", args.tests.get(1).testClassName);
        assertNull(args.tests.get(0).methodName);
        assertNull(args.tests.get(1).methodName);
    }

    /**
     * Test parsing bundle when class name and method name is provided.
     */
    @Test
    public void testFromBundle_method() {
        Bundle b = new Bundle();
        b.putString(RunnerArgs.ARGUMENT_TEST_CLASS, "ClassName1#method");
        RunnerArgs args = new RunnerArgs.Builder().fromBundle(b).build();
        assertEquals("ClassName1", args.tests.get(0).testClassName);
        assertEquals("method", args.tests.get(0).methodName);
    }

    /**
     * Test {@link android.support.test.runner.AndroidJUnitRunner#buildRequest(android.os.Bundle, java.io.PrintStream)} when
     * class name and method name is provided along with an additional class name.
     */
    @Test
    public void  testFromBundle_classAndMethodCombo() {
        Bundle b = new Bundle();
        b.putString(RunnerArgs.ARGUMENT_TEST_CLASS, "ClassName1#method,ClassName2");
        RunnerArgs args = new RunnerArgs.Builder().fromBundle(b).build();
        assertEquals(2, args.tests.size());
        assertEquals("ClassName1", args.tests.get(0).testClassName);
        assertEquals("method", args.tests.get(0).methodName);
        assertEquals("ClassName2", args.tests.get(1).testClassName);
        assertNull(args.tests.get(1).methodName);
    }

    /**
     * Temp file used for testing
     */
    @Rule
    public TemporaryFolder mTmpFolder = new TemporaryFolder();

    /**
     * Test parsing bundle when multiple class and method names are provided within a test file
     */
    @Test
    public void testFromBundle_testFile() throws IOException {
        final File file = mTmpFolder.newFile("myTestFile.txt");
        BufferedWriter out = new BufferedWriter(new FileWriter(file));
        out.write("ClassName3\n");
        out.write("ClassName4#method2\n");
        out.close();

        Bundle b = new Bundle();
        b.putString(RunnerArgs.ARGUMENT_TEST_FILE, file.getPath());
        b.putString(RunnerArgs.ARGUMENT_TEST_CLASS, "ClassName1#method1,ClassName2");
        RunnerArgs args = new RunnerArgs.Builder().fromBundle(b).build();
        assertEquals(4, args.tests.size());
        assertEquals("ClassName1", args.tests.get(0).testClassName);
        assertEquals("method1", args.tests.get(0).methodName);
        assertEquals("ClassName2", args.tests.get(1).testClassName);
        assertNull(args.tests.get(1).methodName);
        assertEquals("ClassName3", args.tests.get(2).testClassName);
        assertNull(args.tests.get(2).methodName);
        assertEquals("ClassName4", args.tests.get(3).testClassName);
        assertEquals("method2", args.tests.get(3).methodName);
    }

    /**
     * Test failure reading a testfile
     */
    @Test(expected = IllegalArgumentException.class)
    public void testFromBundle_testFileFailure() {
        Bundle b = new Bundle();
        b.putString(RunnerArgs.ARGUMENT_TEST_FILE, "idontexist");
        new RunnerArgs.Builder().fromBundle(b).build();
    }

    /**
     * Test parsing bundle when test timeout is provided
     */
    @Test
    public void testFromBundle_timeout() {
        Bundle b = new Bundle();
        b.putString(RunnerArgs.ARGUMENT_TIMEOUT, "5000"); // 5 seconds
        RunnerArgs args = new RunnerArgs.Builder().fromBundle(b).build();
        assertEquals(5000, args.testTimeout);
    }

    /**
     * Test parsing the boolean debug argument
     */
    @Test
    public void testFromBundle_debug() {
        Bundle b = new Bundle();
        b.putString(RunnerArgs.ARGUMENT_DEBUG, "true");
        RunnerArgs args = new RunnerArgs.Builder().fromBundle(b).build();
        assertTrue(args.debug);

        b.putString(RunnerArgs.ARGUMENT_DEBUG, "false");
        args = new RunnerArgs.Builder().fromBundle(b).build();
        assertFalse(args.debug);

        b.putString(RunnerArgs.ARGUMENT_DEBUG, "blargh");
        args = new RunnerArgs.Builder().fromBundle(b).build();
        assertFalse(args.debug);
    }

    /**
     * Test parsing the boolean logOnly argument
     */
    @Test
    public void testFromBundle_logOnly() {
        Bundle b = new Bundle();
        b.putString(RunnerArgs.ARGUMENT_LOG_ONLY, "true");
        RunnerArgs args = new RunnerArgs.Builder().fromBundle(b).build();
        assertTrue(args.logOnly);

        b.putString(RunnerArgs.ARGUMENT_LOG_ONLY, "false");
        args = new RunnerArgs.Builder().fromBundle(b).build();
        assertFalse(args.logOnly);

        b.putString(RunnerArgs.ARGUMENT_LOG_ONLY, "blargh");
        args = new RunnerArgs.Builder().fromBundle(b).build();
        assertFalse(args.logOnly);
    }

    /**
     * Test parsing bundle when an invalid test timeout is provided
     */
    @Test(expected = NumberFormatException.class)
    public void testFromBundle_timeoutWithWrongFormat() {
        Bundle b = new Bundle();
        b.putString(RunnerArgs.ARGUMENT_TIMEOUT, "not a long");
        new RunnerArgs.Builder().fromBundle(b);
    }

    /**
     * Test parsing bundle when a negative test timeout is provided
     */
    @Test(expected = NumberFormatException.class)
    public void testFromBundle_timeoutWithNegativeValue() {
        Bundle b = new Bundle();
        b.putString(RunnerArgs.ARGUMENT_TIMEOUT, "-500");
        new RunnerArgs.Builder().fromBundle(b);
    }
}
