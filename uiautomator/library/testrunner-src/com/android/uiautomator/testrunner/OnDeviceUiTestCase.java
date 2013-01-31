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

package com.android.uiautomator.testrunner;

import android.app.UiAutomation;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.ServiceManager;
import android.os.SystemClock;
import android.test.AndroidTestCase;
import android.view.inputmethod.InputMethodInfo;

import com.android.internal.view.IInputMethodManager;
import com.android.uiautomator.core.UiDevice;

import java.util.List;

/**
 * UI automator test case that is executed on the device. 
 */
public class OnDeviceUiTestCase extends AndroidTestCase {
    private static final String DISABLE_IME = "disable_ime";
    private static final String DUMMY_IME_PACKAGE = "com.android.testing.dummyime";
    private boolean mShouldDisableIme;

    private UiAutomation mUiAutomation;
    private Bundle mParams;

    private final IAutomationSupport mAutomationSupport = new IAutomationSupport() {
        @Override
        public void sendStatus(int resultCode, Bundle status) {
            sendStatus(resultCode, status);
        }
    };

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        UiDevice.getInstance().initialize(getContext(), mUiAutomation);
        mShouldDisableIme = "true".equals(getParams().getString(DISABLE_IME));
        if (mShouldDisableIme) {
            setDummyIme();
        }
    }

    @Override
    protected void tearDown() throws Exception {
        if (mShouldDisableIme) {
            restoreActiveIme();
        }
        super.tearDown();
    }

    /**
     * Get current instance of {@link UiDevice}. Works similar to calling the static
     * {@link UiDevice#getInstance()} from anywhere in the test classes.
     * @since API Level 16
     */
    public UiDevice getUiDevice() {
        return UiDevice.getInstance();
    }

    /**
     * Get command line parameters. On the command line when passing <code>-e key value</code>
     * pairs, the {@link Bundle} will have the key value pairs conveniently available to the
     * tests.
     * @since API Level 16
     */
    public Bundle getParams() {
        return mParams;
    }

    /**
     * Initializes this test case.
     *
     * @param uiAutomation An {@link UiAutomation} instance.
     * @param params Instrumentation arguments.
     */
    void initialize(UiAutomation uiAutomation,  Bundle params) {
        mUiAutomation = uiAutomation;
        mParams = params;
    }

    /**
     * Provides support for running tests to report interim status
     *
     * @return IAutomationSupport
     * @since API Level 16
     */
    public IAutomationSupport getAutomationSupport() {
        return mAutomationSupport;
    }

    /**
     * Calls {@link SystemClock#sleep(long)} to sleep
     * @param ms is in milliseconds.
     * @since API Level 16
     */
    public void sleep(long ms) {
        SystemClock.sleep(ms);
    }

    private void setDummyIme() throws RemoteException {
        IInputMethodManager im = IInputMethodManager.Stub.asInterface(ServiceManager
                .getService(Context.INPUT_METHOD_SERVICE));
        List<InputMethodInfo> infos = im.getInputMethodList();
        String id = null;
        for (InputMethodInfo info : infos) {
            if (DUMMY_IME_PACKAGE.equals(info.getComponent().getPackageName())) {
                id = info.getId();
            }
        }
        if (id == null) {
            throw new RuntimeException(String.format(
                    "Required testing fixture missing: IME package (%s)", DUMMY_IME_PACKAGE));
        }
        im.setInputMethod(null, id);
    }

    private void restoreActiveIme() throws RemoteException {
        // TODO: figure out a way to restore active IME
        // Currently retrieving active IME requires querying secure settings provider, which is hard
        // to do without a Context; so the caveat here is that to make the post test device usable,
        // the active IME needs to be manually switched.
    }
}
