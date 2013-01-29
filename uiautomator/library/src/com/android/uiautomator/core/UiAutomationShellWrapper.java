package com.android.uiautomator.core;

import android.app.UiAutomation;
import android.app.UiAutomationConnection;
import android.os.HandlerThread;

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
}
