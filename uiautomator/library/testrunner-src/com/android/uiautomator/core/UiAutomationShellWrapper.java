package com.android.uiautomator.core;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.app.ActivityManager;
import android.app.UiAutomation;
import android.app.UiAutomationConnection;
import android.os.HandlerThread;

/**
 * @hide
 */
public class UiAutomationShellWrapper {

    private static final String HANDLER_THREAD_NAME = "UiAutomatorHandlerThread";

    private final HandlerThread mHandlerThread = new HandlerThread(HANDLER_THREAD_NAME);

    private UiAutomation mUiAutomation;

    public void connect() {
        if (mHandlerThread.isAlive()) {
            throw new IllegalStateException("Already connected!");
        }
        mHandlerThread.start();
        mUiAutomation = new UiAutomation(mHandlerThread.getLooper(),
                new UiAutomationConnection());
        mUiAutomation.connect();
    }

    /**
     * Enable or disable monkey test mode.
     *
     * Setting test as "monkey" indicates to some applications that a test framework is
     * running as a "monkey" type. Such applications may choose not to perform actions that
     * do submits so to avoid allowing monkey tests from doing harm or performing annoying
     * actions such as dialing 911 or posting messages to public forums, etc.
     *
     * @param isSet True to set as monkey test. False to set as regular functional test (default).
     * @see {@link ActivityManager#isUserAMonkey()}
     */
    public void setRunAsMonkey(boolean isSet) {
        mUiAutomation.setRunAsMonkey(isSet);
    }

    public void disconnect() {
        if (!mHandlerThread.isAlive()) {
            throw new IllegalStateException("Already disconnected!");
        }
        mUiAutomation.disconnect();
        mHandlerThread.quit();
    }

    public UiAutomation getUiAutomation() {
        return mUiAutomation;
    }

    public void setCompressedLayoutHierarchy(boolean compressed) {
        AccessibilityServiceInfo info = mUiAutomation.getServiceInfo();
        if (compressed)
            info.flags &= ~AccessibilityServiceInfo.FLAG_INCLUDE_NOT_IMPORTANT_VIEWS;
        else
            info.flags |= AccessibilityServiceInfo.FLAG_INCLUDE_NOT_IMPORTANT_VIEWS;
        mUiAutomation.setServiceInfo(info);
    }
}
