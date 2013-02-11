/*
 * Copyright (C) 2013 The Android Open Source Project
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

package com.android.uiautomator.platform;

import android.os.Bundle;
import android.os.Environment;
import android.util.Log;

import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * Helper class for jankiness test.
 * All the jank test must extend the JankBaseHelper
 */
public class JankTestBase extends UiAutomatorTestCase {
    protected UiDevice mDevice;
    protected BufferedWriter mWriter = null;
    protected BufferedWriter mStatusWriter = null;
    protected int mIteration = 1; // default iteration is set 1
    protected Bundle mParams;
    protected String mTestCaseName;
    protected int mSuccessTestRuns = 0;

    private final static String TAG = "BasePerformance";
    // holds all params for the derived tests
    private final static String PROPERTY_FILE_NAME = "UiJankinessTests.conf";
    private final static String PARAM_CONFIG = "conf";
    private final static String LOCAL_TMP_DIR = "/data/local/tmp/";
    // File that hold the test results
    private static String OUTPUT_FILE_NAME = LOCAL_TMP_DIR + "UiJankinessTestsOutput.txt";
    // File that hold test status, e.g successful test iterations
    private static String STATUS_FILE_NAME = LOCAL_TMP_DIR + "UiJankinessTestsStatus.txt";
    private static int SUCCESS_THRESHOLD = 80;
    private static boolean DEBUG = false;

    /* Array to record jankiness data in each test iteration */
    private int[] jankinessArray;
    /* Array to record frame rate in each test iteration */
    private double[] frameRateArray;
    /* Array to save max accumulated frame number in each test iteration */
    private int[] maxDeltaVsyncArray;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        mDevice = UiDevice.getInstance();

        mWriter = new BufferedWriter(new FileWriter(new File(OUTPUT_FILE_NAME), true));
        mStatusWriter = new BufferedWriter(new FileWriter(new File(STATUS_FILE_NAME), true));

        mParams = getParams();
        if (mParams != null && !mParams.isEmpty()) {
            log("mParams is not empty, get properties.");
            String mIterationStr;
            if ((mIterationStr = getPropertyString(mParams, "iteration")) != null) {
                mIteration = Integer.valueOf(mIterationStr);
            }
        }
        jankinessArray = new int[mIteration];
        frameRateArray = new double[mIteration];
        maxDeltaVsyncArray = new int[mIteration];
        mTestCaseName = this.getName();

        mSuccessTestRuns = 0;
        mDevice.pressHome();
    }

    /**
     * Expects a file from the command line via conf param or default following format each on its
     * own line. <code>
     *    key=Value
     *    Browser_URL1=cnn.com
     *    Browser_URL2=google.com
     *    Camera_ShutterDelay=1000
     *    etc...
     * </code>
     * @param Bundle params
     * @param key
     * @return the value of the property else defaultValue
     * @throws FileNotFoundException
     * @throws IOException
     */
    protected String getPropertyString(Bundle params, String key)
            throws FileNotFoundException, IOException {
        Properties prop = new Properties();
        prop.load(new FileInputStream(new File(LOCAL_TMP_DIR,
                params.getString(PARAM_CONFIG, PROPERTY_FILE_NAME))));
        String value = prop.getProperty(key);
        if (value != null && !value.isEmpty())
            return value;
        return null;
    }

    /**
     * Expects a file from the command line via conf param or default following format each on its
     * own line. <code>
     *    key=Value
     *    Browser_URL1=cnn.com
     *    Browser_URL2=google.com
     *    Camera_ShutterDelay=1000
     *    etc...
     * </code>
     * @param Bundle params
     * @param key
     * @return the value of the property else defaultValue
     * @throws FileNotFoundException
     * @throws IOException
     */
    protected long getPropertyLong(Bundle params, String key)
            throws FileNotFoundException, IOException {
        Properties prop = new Properties();
        prop.load(new FileInputStream(new File(LOCAL_TMP_DIR,
                params.getString(PARAM_CONFIG, PROPERTY_FILE_NAME))));
        String value = prop.getProperty(key);
        if (value != null && !value.trim().isEmpty())
            return Long.valueOf(value.trim());
        return 0;
    }

    /**
     * Process the raw data, calculate jankiness, frame rate and max accumulated frames number
     * @param testCaseName
     * @param iteration
     */
    protected void recordResults(String testCaseName, int iteration) {
        long refreshPeriod = SurfaceFlingerHelper.getRefreshPeriod();
        // get jankiness count
        int jankinessCount = SurfaceFlingerHelper.getVsyncJankiness();
        // get frame rate
        double frameRate = SurfaceFlingerHelper.getFrameRate();
        // get max accumulated frames
        int maxDeltaVsync = SurfaceFlingerHelper.getMaxDeltaVsync();

        // only record data when they are valid
        if (jankinessCount >=0 && frameRate > 0) {
            jankinessArray[iteration] = jankinessCount;
            frameRateArray[iteration] = frameRate;
            maxDeltaVsyncArray[iteration] = maxDeltaVsync;
            mSuccessTestRuns++;
        }
        String msg = String.format("%s, iteration %d\n" +
                "refresh period: %d\n" +
                "jankiness count: %d\n" +
                "frame rate: %f\n" +
                "max accumulated frames: %d\n",
                testCaseName, iteration, refreshPeriod,
                jankinessCount, frameRate, maxDeltaVsync);
        log(msg);
        if (DEBUG) {
            SurfaceFlingerHelper.printData(testCaseName, iteration);
        }
    }

    /**
     * Process data from all test iterations, and save to disk
     * @param testCaseName
     */
    protected void saveResults(String testCaseName) {
        // write test status into status file
        try {
            mStatusWriter.write(String.format("%s: %d success runs out of %d iterations\n",
                    testCaseName, mSuccessTestRuns, mIteration));
        } catch (IOException e) {
            log("failed to write output for test case " + testCaseName);
        }

        // if successful test runs is less than the threshold, no results will be saved.
        if (mSuccessTestRuns * 100 / mIteration < SUCCESS_THRESHOLD) {
            log(String.format("In %s, # of successful test runs out of %s iterations: %d ",
                    testCaseName, mIteration, mSuccessTestRuns));
            log(String.format("threshold is %d%%", SUCCESS_THRESHOLD));
            return;
        }

        if (DEBUG) {
            print(jankinessArray, "jankiness array");
            print(frameRateArray, "frame rate array");
            print(maxDeltaVsyncArray, "max delta vsync array");
        }
        double avgJankinessCount = getAverage(jankinessArray);
        int maxJankinessCount = getMaxValue(jankinessArray);
        double avgFrameRate = getAverage(frameRateArray);
        double avgMaxDeltaVsync = getAverage(maxDeltaVsyncArray);

        String avgMsg = String.format("%s\n" +
                "average number of jankiness: %f\n" +
                "max number of jankiness: %d\n" +
                "average frame rate: %f\n" +
                "average of max accumulated frames: %f\n",
                testCaseName, avgJankinessCount, maxJankinessCount, avgFrameRate, avgMaxDeltaVsync);
        log(avgMsg);

        try {
            mWriter.write(avgMsg);
        } catch (IOException e) {
            log("failed to write output for test case " + testCaseName);
        }
    }

    // return the max value in an integer array
    private int getMaxValue(int[] intArray) {
        int index = 0;
        int max = intArray[index];
        for (int i  = 1; i < intArray.length; i++) {
            if (max < intArray[i]) {
                max = intArray[i];
            }
        }
        return max;
    }

    private double getAverage(int[] intArray) {
        int mean = 0;
        int numberTests = 0;
        for (int i = 0; i < intArray.length; i++) {
            // in case in some iteration, test fails, no data points is collected
            if (intArray[i] >= 0) {
                mean += intArray[i];
                ++numberTests;
            }
        }
        return (double)mean/numberTests;
    }

    private double getAverage(double[] doubleArray) {
        double mean = 0;
        int numberTests = 0;
        for (int i = 0; i < doubleArray.length; i++) {
            // in case in some iteration, test fails, no data points is collected
            if (doubleArray[i] >= 0) {
                mean += doubleArray[i];
                ++numberTests;
            }
        }
        return mean/numberTests;
    }

    private void print(int[] intArray, String arrayName) {
        log("start to print array for " + arrayName);
        for (int i = 0; i < intArray.length; i++) {
            log(String.format("%d: %d", i, intArray[i]));
        }
    }

    private void print(double[] doubleArray, String arrayName) {
        log("start to print array for " + arrayName);
        for (int i = 0; i < doubleArray.length; i++) {
            log(String.format("%d: %f", i, doubleArray[i]));
        }
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
        if (mWriter != null) {
            mWriter.close();
        }
        if (mStatusWriter != null) {
            mStatusWriter.close();
        }
    }

   private void log(String message) {
       Log.v(TAG, message);
   }

   /**
    * Set the total number of test iteration
    * @param iteration
    */
   protected void setIteration(int iteration){
       mIteration = iteration;
   }

   /**
    * Get the total number of test iteration
    * @return iteration
    */
   protected int getIteration(){
       return mIteration;
   }

}
