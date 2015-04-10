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

import android.support.test.filters.RequiresDevice;
import android.support.test.filters.SdkSuppress;
import android.support.test.internal.runner.TestRequestBuilder.DeviceBuild;
import android.test.suitebuilder.annotation.MediumTest;
import android.test.suitebuilder.annotation.SmallTest;
import android.test.suitebuilder.annotation.Suppress;

import junit.framework.TestCase;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.Description;
import org.junit.runner.JUnitCore;
import org.junit.runner.Request;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.RunListener;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.Collection;

import static android.support.test.InstrumentationRegistry.getArguments;
import static android.support.test.InstrumentationRegistry.getInstrumentation;

/**
 * Unit tests for {@link TestRequestBuilder}.
 */
public class TestRequestBuilderTest {

    public static class SampleTest {

        @SmallTest
        @Test
        public void testSmall() {
        }

        @Test
        public void testOther() {
        }
    }

    @SmallTest
    public static class SampleClassSize {

        @Test
        public void testSmall() {
        }

        @Test
        public void testSmallToo() {
        }
    }

    public static class SampleNoSize extends TestCase {

        public void testOther() {
        }

        public void testOther2() {
        }

    }

    public static class SampleJUnit3Test extends TestCase {

        @SmallTest
        public void testSmall() {
        }

        @SmallTest
        public void testSmall2() {
        }

        public void testOther() {
        }
    }

    @SmallTest
    public static class SampleJUnit3ClassSize extends TestCase {

        public void testSmall() {
        }

        public void testSmall2() {
        }

    }

    @SmallTest
    public static class SampleOverrideSize extends TestCase {

        public void testSmall() {
        }

        @MediumTest
        public void testMedium() {
        }
    }

    @SmallTest
    public static class SampleSameSize extends TestCase {

        @SmallTest
        public void testSmall() {
        }

        @MediumTest
        public void testMedium() {
        }
    }

    public static class SampleJUnit3Suppressed extends TestCase {

        public void testRun() {
        }
        public void testRun2() {
        }

        @Suppress
        public void testSuppressed() {
        }
    }

    public static class SampleSizeWithSuppress extends TestCase {

        public void testNoSize() {
        }

        @SmallTest
        @Suppress
        public void testSmallAndSuppressed() {
        }

        @Suppress
        public void testSuppressed() {
        }
    }

    public static class SampleAllSuppressed extends TestCase {

        @Suppress
        public void testSuppressed2() {
        }

        @Suppress
        public void testSuppressed() {
        }
    }

    public static class SampleSizeAndSuppress extends TestCase {

        @MediumTest
        public void testMedium() {
        }

        @Suppress
        public void testSuppressed() {
        }
    }

    public static class SampleJUnit3 extends TestCase {
        public void testFromSuper() {

        }
    }

    public static class SampleJUnit3SuppressedWithSuper extends SampleJUnit3 {

        public void testRun() {
        }
        public void testRun2() {
        }

        @Suppress
        public void testSuppressed() {
        }
    }

    // test fixtures for super-class annotation processing
    public static class InheritedAnnnotation extends SampleJUnit3Test {
    }

    public static class SampleMultipleAnnotation {

        @Test
        @SmallTest
        public void testSmallSkipped() {
            Assert.fail("should not run");
        }

        @Test
        @MediumTest
        public void testMediumSkipped() {
            Assert.fail("should not run");
        }

        @Test
        public void testRunThis() {
            // fail this test too to make it easier to check it was run
            Assert.fail("should run");
        }
    }

    public static class SampleRequiresDevice {
        @RequiresDevice
        @Test
        public void skipThis() {}

        @Test
        public void runMe() {}

        @Test
        public void runMe2() {}
    }

    public static class SampleSdkSuppress {
        @SdkSuppress(minSdkVersion=15)
        @Test
        public void skipThis() {}

        @SdkSuppress(minSdkVersion=16)
        @Test
        public void runMe() {}

        @SdkSuppress(minSdkVersion=17)
        @Test
        public void runMe2() {}
    }

    public static class DollarMethod {

        @Test
        public void testWith$() {
        }

        @Test
        public void testSkipped() {
        }
    }

    @RunWith(value = Parameterized.class)
    public static class ParameterizedTest {

        public ParameterizedTest(int data) {
        }

        @Parameterized.Parameters
        public static Collection<Object[]> data() {
            Object[][] data = new Object[][]{{1}, {2}, {3}};
            return Arrays.asList(data);
        }

        @Test
        public void testParameterized() {

        }
    }


    @Mock
    private DeviceBuild mMockDeviceBuild;

    private TestRequestBuilder mBuilder;

    @Before
    public void setUp() throws Exception {
        mBuilder = createBuilder();
    }

    private TestRequestBuilder createBuilder() {
        return new TestRequestBuilder(getInstrumentation(), getArguments());
    }

    private TestRequestBuilder createBuilder(DeviceBuild deviceBuild) {
        return new TestRequestBuilder(deviceBuild, getInstrumentation(), getArguments());
    }

    /**
     * Test initial condition for size filtering - that all tests run when no filter is attached
     */
    @Test
    public void testNoSize() {
        Request request = mBuilder
                .addTestClass(SampleTest.class.getName())
                .build()
                .getRequest();
        JUnitCore testRunner = new JUnitCore();
        Result result = testRunner.run(request);
        Assert.assertEquals(2, result.getRunCount());
    }

    /**
     * Test that size annotation filtering works
     */
    @Test
    public void testSize() {
        Request request = mBuilder
                .addTestClass(SampleTest.class.getName())
                .addTestSizeFilter("small")
                .build()
                .getRequest();
        JUnitCore testRunner = new JUnitCore();
        Result result = testRunner.run(request);
        Assert.assertEquals(1, result.getRunCount());
    }

    /**
     * Test that size annotation filtering by class works
     */
    @Test
    public void testSize_class() {
        Request request = mBuilder
                .addTestClass(SampleTest.class.getName())
                .addTestClass(SampleClassSize.class.getName())
                .addTestSizeFilter("small")
                .build()
                .getRequest();
        JUnitCore testRunner = new JUnitCore();
        Result result = testRunner.run(request);
        Assert.assertEquals(3, result.getRunCount());
    }

    /**
     * Test case where entire JUnit3 test class has been filtered out
     */
    @Test
    public void testSize_classFiltered() {
        Request request = mBuilder
                .addTestClass(SampleTest.class.getName())
                .addTestClass(SampleNoSize.class.getName())
                .addTestSizeFilter("small")
                .build()
                .getRequest();
        MyRunListener l = new MyRunListener();
        JUnitCore testRunner = new JUnitCore();
        testRunner.addListener(l);
        testRunner.run(request);
        Assert.assertEquals(1, l.mTestCount);
    }

    private static class MyRunListener extends RunListener {
        private int mTestCount = -1;

        @Override
        public void testRunStarted(Description description) throws Exception {
            mTestCount = description.testCount();
        }
    }

    /**
     * Test size annotations with JUnit3 test methods
     */
    @Test
    public void testSize_junit3Method() {
        Request request = mBuilder
                .addTestClass(SampleJUnit3Test.class.getName())
                .addTestClass(SampleNoSize.class.getName())
                .addTestSizeFilter("small")
                .build()
                .getRequest();
        JUnitCore testRunner = new JUnitCore();
        Result r = testRunner.run(request);
        Assert.assertEquals(2, r.getRunCount());
    }

    /**
     * Test @Suppress with JUnit3 tests
     */
    @Test
    public void testSuppress_junit3Method() {
        Request request = mBuilder
                .addTestClass(SampleJUnit3Suppressed.class.getName())
                .build()
                .getRequest();
        JUnitCore testRunner = new JUnitCore();
        Result r = testRunner.run(request);
        Assert.assertEquals(2, r.getRunCount());
    }

    /**
     * Test @Suppress in combination with size that filters out all methods
     */
    @Test
    public void testSuppress_withSize() {
        Request request = mBuilder
                .addTestClass(SampleJUnit3Suppressed.class.getName())
                .addTestClass(SampleJUnit3Test.class.getName())
                .addTestSizeFilter(TestRequestBuilder.SMALL_SIZE)
                .build()
                .getRequest();
        JUnitCore testRunner = new JUnitCore();
        MyRunListener l = new MyRunListener();
        testRunner.addListener(l);
        Result r = testRunner.run(request);
        Assert.assertEquals(2, r.getRunCount());
        Assert.assertEquals(2, l.mTestCount);
    }

    /**
     * Test @Suppress in combination with size that filters out all methods, with super class.
     */
    @Test
    public void testSuppress_withSizeAndSuper() {
        Request request = mBuilder
                .addTestClass(SampleJUnit3SuppressedWithSuper.class.getName())
                .addTestClass(SampleJUnit3Test.class.getName())
                .addTestSizeFilter(TestRequestBuilder.SMALL_SIZE)
                .build()
                .getRequest();
        JUnitCore testRunner = new JUnitCore();
        MyRunListener l = new MyRunListener();
        testRunner.addListener(l);
        Result r = testRunner.run(request);
        Assert.assertEquals(2, r.getRunCount());
        Assert.assertEquals(2, l.mTestCount);
    }

    /**
     * Test @Suppress when all methods have been filtered
     */
    @Test
    public void testSuppress_all() {
        Request request = mBuilder
                .addTestClass(SampleAllSuppressed.class.getName())
                .addTestClass(SampleJUnit3Suppressed.class.getName())
                .build()
                .getRequest();
        JUnitCore testRunner = new JUnitCore();
        MyRunListener l = new MyRunListener();
        testRunner.addListener(l);
        Result r = testRunner.run(request);
        Assert.assertEquals(2, r.getRunCount());
        Assert.assertEquals(2, l.mTestCount);
    }

    /**
     * Test case where all methods are filtered out by combination of @Suppress and size when all
     * methods have been filtered.
     */
    @Test
    public void testSizeAndSuppress() {
        Request request = mBuilder
                .addTestClass(SampleSizeAndSuppress.class.getName())
                .addTestClass(SampleJUnit3Test.class.getName())
                .addTestSizeFilter(TestRequestBuilder.SMALL_SIZE)
                .build()
                .getRequest();
        JUnitCore testRunner = new JUnitCore();
        MyRunListener l = new MyRunListener();
        testRunner.addListener(l);
        Result r = testRunner.run(request);
        Assert.assertEquals(2, r.getRunCount());
        Assert.assertEquals(2, l.mTestCount);
    }

    /**
     * Test case where method has both a size annotation and suppress annotation. Expect suppress
     * to overrule the size.
     */
    @Test
    public void testSizeWithSuppress() {
        Request request = mBuilder
                .addTestClass(SampleSizeWithSuppress.class.getName())
                .addTestClass(SampleJUnit3Test.class.getName())
                .addTestSizeFilter(TestRequestBuilder.SMALL_SIZE)
                .build()
                .getRequest();
        JUnitCore testRunner = new JUnitCore();
        MyRunListener l = new MyRunListener();
        testRunner.addListener(l);
        Result r = testRunner.run(request);
        Assert.assertEquals(2, r.getRunCount());
        Assert.assertEquals(2, l.mTestCount);
    }

    /**
     * Test that annotation filtering by class works
     */
    @Test
    public void testAddAnnotationInclusionFilter() {
        Request request = mBuilder
                .addAnnotationInclusionFilter(SmallTest.class.getName())
                .addTestClass(SampleTest.class.getName())
                .addTestClass(SampleClassSize.class.getName())
                .build()
                .getRequest();
        JUnitCore testRunner = new JUnitCore();
        Result result = testRunner.run(request);
        Assert.assertEquals(3, result.getRunCount());
    }

    /**
     * Test that annotation filtering by class works
     */
    @Test
    public void testAddAnnotationExclusionFilter() {
        Request request = mBuilder
                .addAnnotationExclusionFilter(SmallTest.class.getName())
                .addTestClass(SampleTest.class.getName())
                .addTestClass(SampleClassSize.class.getName())
                .build()
                .getRequest();
        JUnitCore testRunner = new JUnitCore();
        Result result = testRunner.run(request);
        Assert.assertEquals(1, result.getRunCount());
    }

    /**
     * Test that annotation filtering by class works when methods are from superclass.
     *
     * TODO: add a similiar test to upstream junit.
     */
    @Test
    public void testAddAnnotationInclusionFilter_super() {
        Request request = mBuilder
                .addAnnotationInclusionFilter(SmallTest.class.getName())
                .addTestClass(InheritedAnnnotation.class.getName())
                .build()
                .getRequest();
        JUnitCore testRunner = new JUnitCore();
        Result result = testRunner.run(request);
        Assert.assertEquals(2, result.getRunCount());
    }

    /**
     * Test that a method size annotation overrides a class size annotation.
     */
    @Test
    public void testTestSizeFilter_override() {
        Request request = mBuilder
                .addTestSizeFilter(TestRequestBuilder.SMALL_SIZE)
                .addTestClass(SampleOverrideSize.class.getName())
                .build()
                .getRequest();
        JUnitCore testRunner = new JUnitCore();
        Result result = testRunner.run(request);
        Assert.assertEquals(1, result.getRunCount());

        request = createBuilder()
                .addTestSizeFilter(TestRequestBuilder.MEDIUM_SIZE)
                .addTestClass(SampleOverrideSize.class.getName())
                .build()
                .getRequest();
        testRunner = new JUnitCore();
        result = testRunner.run(request);
        Assert.assertEquals(1, result.getRunCount());
    }

    /**
     * Test that a method size annotation of same type as class level annotation is correctly
     * filtered.
     */
    @Test
    public void testTestSizeFilter_sameAnnotation() {
        Request request = mBuilder
                .addTestSizeFilter(TestRequestBuilder.SMALL_SIZE)
                .addTestClass(SampleSameSize.class.getName())
                .build()
                .getRequest();
        JUnitCore testRunner = new JUnitCore();
        Result result = testRunner.run(request);
        Assert.assertEquals(1, result.getRunCount());
    }

    /**
     * Test provided multiple annotations to exclude.
     */
    @Test
    public void testTestSizeFilter_multipleNotAnnotation() {
        Request request = mBuilder
                .addAnnotationExclusionFilter(SmallTest.class.getName())
                .addAnnotationExclusionFilter(MediumTest.class.getName())
                .addTestClass(SampleMultipleAnnotation.class.getName())
                .build()
                .getRequest();
        JUnitCore testRunner = new JUnitCore();
        Result result = testRunner.run(request);
        // expect 1 test that failed
        Assert.assertEquals(1, result.getRunCount());
        Assert.assertEquals("testRunThis",
                result.getFailures().get(0).getDescription().getMethodName());
    }

    /**
     * Test the sharding filter.
     */
    @Test
    public void testShardingFilter() {
        JUnitCore testRunner = new JUnitCore();

        Result[] results = new Result[4];
        int totalRun = 0;
        // The last iteration through the loop doesn't add a ShardingFilter - it runs all the
        // tests to establish a baseline for the total number that should have been run.
        for (int i = 0; i < 5; i++) {
            TestRequestBuilder b = createBuilder();
            if (i < 4) {
                b.addShardingFilter(4, i);
            }
            Request request = b.addTestClass(SampleTest.class.getName())
                .addTestClass(SampleNoSize.class.getName())
                .addTestClass(SampleClassSize.class.getName())
                .addTestClass(SampleJUnit3Test.class.getName())
                .addTestClass(SampleOverrideSize.class.getName())
                .addTestClass(SampleJUnit3ClassSize.class.getName())
                .addTestClass(SampleMultipleAnnotation.class.getName())
                .build()
                .getRequest();
            Result result = testRunner.run(request);
            if (i == 4) {
                Assert.assertEquals(result.getRunCount(), totalRun);
            } else {
                totalRun += result.getRunCount();
                results[i] = result;
            }
        }
        for (int i = 0; i < 4; i++) {
            // Theoretically everything could collide into one shard, but, we'll trust that
            // the implementation of hashCode() is random enough to avoid that.
            Assert.assertTrue(results[i].getRunCount() < totalRun);
        }
    }

    /**
     * Verify that filtering out all tests is not treated as an error
     */
    @Test
    public void testNoTests() {
        Request request = mBuilder
                .addTestClass(SampleTest.class.getName())
                .addTestSizeFilter("medium")
                .build()
                .getRequest();
        JUnitCore testRunner = new JUnitCore();
        Result result = testRunner.run(request);
        Assert.assertEquals(0, result.getRunCount());
    }

    /**
     * Test that {@link SdkSuppress} filters tests as appropriate
     */
    @Test
    public void testSdkSuppress() throws Exception {
        MockitoAnnotations.initMocks(this);
        TestRequestBuilder b = createBuilder(mMockDeviceBuild);
        Mockito.when(mMockDeviceBuild.getSdkVersionInt()).thenReturn(16);
        Request request = b.addTestClass(SampleSdkSuppress.class.getName())
                .build()
                .getRequest();
        JUnitCore testRunner = new JUnitCore();
        Result result = testRunner.run(request);
        Assert.assertEquals(2, result.getRunCount());
    }

    /**
     * Test that {@link RequiresDevice} filters tests as appropriate
     */
    @Test
    public void testRequiresDevice() {
        MockitoAnnotations.initMocks(this);
        TestRequestBuilder b = createBuilder(mMockDeviceBuild);
        Mockito.when(mMockDeviceBuild.getHardware()).thenReturn(
                TestRequestBuilder.EMULATOR_HARDWARE);
        Request request = b.addTestClass(SampleRequiresDevice.class.getName())
                .build()
                .getRequest();
        JUnitCore testRunner = new JUnitCore();
        Result result = testRunner.run(request);
        Assert.assertEquals(2, result.getRunCount());
    }

    /**
     * Test method filters with dollar signs are allowed
     */
    @Test
    public void testMethodFilterWithDollar() {
        Request request = mBuilder
                .addTestMethod(DollarMethod.class.getName(), "testWith$")
                .build()
                .getRequest();
        JUnitCore testRunner = new JUnitCore();
        Result result = testRunner.run(request);
        Assert.assertEquals(1, result.getRunCount());
    }

    /**
     * Test filtering by two methods in single class
     */
    @Test
    public void testMultipleMethodsFilter() {
        Request request = mBuilder
                .addTestMethod(SampleJUnit3Test.class.getName(), "testSmall")
                .addTestMethod(SampleJUnit3Test.class.getName(), "testSmall2")
                .build()
                .getRequest();
        JUnitCore testRunner = new JUnitCore();
        Result result = testRunner.run(request);
        Assert.assertEquals(2, result.getRunCount());
    }

    /**
     * Test filtering by two methods in separate classes
     */
    @Test
    public void testTwoMethodsDiffClassFilter() {
        Request request = mBuilder
                .addTestMethod(SampleJUnit3Test.class.getName(), "testSmall")
                .addTestMethod(SampleTest.class.getName(), "testOther")
                .build()
                .getRequest();
        JUnitCore testRunner = new JUnitCore();
        Result result = testRunner.run(request);
        Assert.assertEquals(2, result.getRunCount());
    }

    /**
     * Test filtering a parameterized method
     */
    @Test
    public void testParameterizedMethods() throws Exception {
        Request request = mBuilder
                .addTestMethod(ParameterizedTest.class.getName(), "testParameterized")
                .build()
                .getRequest();
        JUnitCore testRunner = new JUnitCore();
        Result result = testRunner.run(request);
        Assert.assertEquals(3, result.getRunCount());
    }

    /**
     * Test exception is thrown when no apk path and no class has been provided
     */
    @Test(expected = IllegalArgumentException.class)
    public void testNoApkPath() throws Exception {
        mBuilder.addTestPackageFilter("android.support.test.internal.runner")
                .build();
    }

    /**
     * Test exception is thrown when both test package and class has been provided
     */
    @Test(expected = IllegalArgumentException.class)
    public void testBothPackageAndTestClass() throws Exception {
        mBuilder.addTestPackageFilter("android.support.test.internal.runner")
                .addTestClass(SampleJUnit3Test.class.getName())
                .build();
    }
}
