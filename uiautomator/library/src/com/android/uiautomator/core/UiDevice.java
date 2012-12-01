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

package com.android.uiautomator.core;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Point;
import android.hardware.display.DisplayManagerGlobal;
import android.os.Build;
import android.os.Environment;
import android.os.RemoteException;
import android.os.ServiceManager;
import android.os.SystemClock;
import android.os.Trace;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.KeyEvent;
import android.view.Surface;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

import com.android.internal.statusbar.IStatusBarService;
import com.android.internal.util.Predicate;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeoutException;

/**
 * UiDevice provides access to state information about the device.
 * You can also use this class to simulate user actions on the device,
 * such as pressing the d-pad or pressing the Home and Menu buttons.
 * @since API Level 16
 */
public class UiDevice {
    private static final String LOG_TAG = UiDevice.class.getSimpleName();

    private static final long DEFAULT_TIMEOUT_MILLIS = 10 * 1000;

    // Sometimes HOME and BACK key presses will generate no events if already on
    // home page or there is nothing to go back to, Set low timeouts.
    private static final long KEY_PRESS_EVENT_TIMEOUT = 1 * 1000;

    // store for registered UiWatchers
    private final HashMap<String, UiWatcher> mWatchers = new HashMap<String, UiWatcher>();
    private final List<String> mWatchersTriggers = new ArrayList<String>();

    // remember if we're executing in the context of a UiWatcher
    private boolean mInWatcherContext = false;

    // provides access the {@link QueryController} and {@link InteractionController}
    private final UiAutomatorBridge mUiAutomationBridge;

    // reference to self
    private static UiDevice mDevice;

    private UiDevice() {
        mUiAutomationBridge = new UiAutomatorBridge();
        mDevice = this;
    }

    boolean isInWatcherContext() {
        return mInWatcherContext;
    }

    /**
     * Provides access the {@link QueryController} and {@link InteractionController}
     * @return {@link UiAutomatorBridge}
     */
    UiAutomatorBridge getAutomatorBridge() {
        return mUiAutomationBridge;
    }
    /**
     * Retrieves a singleton instance of UiDevice
     *
     * @return UiDevice instance
     * @since API Level 16
     */
    public static UiDevice getInstance() {
        if (mDevice == null) {
            mDevice = new UiDevice();
        }
        return mDevice;
    }

    /**
     * Returns the display size in dp (device-independent pixel)
     *
     * The returned display size is adjusted per screen rotation
     *
     * @return a Point containing the display size in dp
     * @hide
     */
    public Point getDisplaySizeDp() {
        Tracer.trace();
        Display display = getDefaultDisplay();
        Point p = new Point();
        display.getSize(p);
        DisplayMetrics metrics = new DisplayMetrics();
        display.getMetrics(metrics);
        float dpx = p.x / metrics.density;
        float dpy = p.y / metrics.density;
        p.x = Math.round(dpx);
        p.y = Math.round(dpy);
        return p;
    }

    /**
     * Retrieves the product name of the device.
     *
     * This method provides information on what type of device the test is running on. This value is
     * the same as returned by invoking #adb shell getprop ro.product.name.
     *
     * @return product name of the device
     * @since API Level 17
     */
    public String getProductName() {
        Tracer.trace();
        return Build.PRODUCT;
    }

    /**
     * Retrieves the text from the last UI traversal event received.
     *
     * You can use this method to read the contents in a WebView container
     * because the accessibility framework fires events
     * as each text is highlighted. You can write a test to perform
     * directional arrow presses to focus on different elements inside a WebView,
     * and call this method to get the text from each traversed element.
     * If you are testing a view container that can return a reference to a
     * Document Object Model (DOM) object, your test should use the view's
     * DOM instead.
     *
     * @return text of the last traversal event, else return an empty string
     * @since API Level 16
     */
    public String getLastTraversedText() {
        Tracer.trace();
        return mUiAutomationBridge.getQueryController().getLastTraversedText();
    }

    /**
     * Clears the text from the last UI traversal event.
     * See {@link #getLastTraversedText()}.
     * @since API Level 16
     */
    public void clearLastTraversedText() {
        Tracer.trace();
        mUiAutomationBridge.getQueryController().clearLastTraversedText();
    }

    /**
     * Simulates a short press on the MENU button.
     * @return true if successful, else return false
     * @since API Level 16
     */
    public boolean pressMenu() {
        Tracer.trace();
        waitForIdle();
        return mUiAutomationBridge.getInteractionController().sendKeyAndWaitForEvent(
                KeyEvent.KEYCODE_MENU, 0, AccessibilityEvent.TYPE_WINDOW_CONTENT_CHANGED,
                KEY_PRESS_EVENT_TIMEOUT);
    }

    /**
     * Simulates a short press on the BACK button.
     * @return true if successful, else return false
     * @since API Level 16
     */
    public boolean pressBack() {
        Tracer.trace();
        waitForIdle();
        return mUiAutomationBridge.getInteractionController().sendKeyAndWaitForEvent(
                KeyEvent.KEYCODE_BACK, 0, AccessibilityEvent.TYPE_WINDOW_CONTENT_CHANGED,
                KEY_PRESS_EVENT_TIMEOUT);
    }

    /**
     * Simulates a short press on the HOME button.
     * @return true if successful, else return false
     * @since API Level 16
     */
    public boolean pressHome() {
        Tracer.trace();
        waitForIdle();
        return mUiAutomationBridge.getInteractionController().sendKeyAndWaitForEvent(
                KeyEvent.KEYCODE_HOME, 0, AccessibilityEvent.TYPE_WINDOW_CONTENT_CHANGED,
                KEY_PRESS_EVENT_TIMEOUT);
    }

    /**
     * Simulates a short press on the SEARCH button.
     * @return true if successful, else return false
     * @since API Level 16
     */
    public boolean pressSearch() {
        Tracer.trace();
        return pressKeyCode(KeyEvent.KEYCODE_SEARCH);
    }

    /**
     * Simulates a short press on the CENTER button.
     * @return true if successful, else return false
     * @since API Level 16
     */
    public boolean pressDPadCenter() {
        Tracer.trace();
        return pressKeyCode(KeyEvent.KEYCODE_DPAD_CENTER);
    }

    /**
     * Simulates a short press on the DOWN button.
     * @return true if successful, else return false
     * @since API Level 16
     */
    public boolean pressDPadDown() {
        Tracer.trace();
        return pressKeyCode(KeyEvent.KEYCODE_DPAD_DOWN);
    }

    /**
     * Simulates a short press on the UP button.
     * @return true if successful, else return false
     * @since API Level 16
     */
    public boolean pressDPadUp() {
        Tracer.trace();
        return pressKeyCode(KeyEvent.KEYCODE_DPAD_UP);
    }

    /**
     * Simulates a short press on the LEFT button.
     * @return true if successful, else return false
     * @since API Level 16
     */
    public boolean pressDPadLeft() {
        Tracer.trace();
        return pressKeyCode(KeyEvent.KEYCODE_DPAD_LEFT);
    }

    /**
     * Simulates a short press on the RIGHT button.
     * @return true if successful, else return false
     * @since API Level 16
     */
    public boolean pressDPadRight() {
        Tracer.trace();
        return pressKeyCode(KeyEvent.KEYCODE_DPAD_RIGHT);
    }

    /**
     * Simulates a short press on the DELETE key.
     * @return true if successful, else return false
     * @since API Level 16
     */
    public boolean pressDelete() {
        Tracer.trace();
        return pressKeyCode(KeyEvent.KEYCODE_DEL);
    }

    /**
     * Simulates a short press on the ENTER key.
     * @return true if successful, else return false
     * @since API Level 16
     */
    public boolean pressEnter() {
        Tracer.trace();
        return pressKeyCode(KeyEvent.KEYCODE_ENTER);
    }

    /**
     * Simulates a short press using a key code.
     *
     * See {@link KeyEvent}
     * @return true if successful, else return false
     * @since API Level 16
     */
    public boolean pressKeyCode(int keyCode) {
        Tracer.trace(keyCode);
        waitForIdle();
        return mUiAutomationBridge.getInteractionController().sendKey(keyCode, 0);
    }

    /**
     * Simulates a short press using a key code.
     *
     * See {@link KeyEvent}.
     * @param keyCode the key code of the event.
     * @param metaState an integer in which each bit set to 1 represents a pressed meta key
     * @return true if successful, else return false
     * @since API Level 16
     */
    public boolean pressKeyCode(int keyCode, int metaState) {
        Tracer.trace(keyCode, metaState);
        waitForIdle();
        return mUiAutomationBridge.getInteractionController().sendKey(keyCode, metaState);
    }

    /**
     * Simulates a short press on the Recent Apps button.
     *
     * @return true if successful, else return false
     * @throws RemoteException
     * @since API Level 16
     */
    public boolean pressRecentApps() throws RemoteException {
        Tracer.trace();
        waitForIdle();
        final IStatusBarService statusBar = IStatusBarService.Stub.asInterface(
                ServiceManager.getService(Context.STATUS_BAR_SERVICE));

        if (statusBar != null) {
            statusBar.toggleRecentApps();
            return true;
        }
        return false;
    }

    /**
     * Gets the width of the display, in pixels. The width and height details
     * are reported based on the current orientation of the display.
     * @return width in pixels or zero on failure
     * @since API Level 16
     */
    public int getDisplayWidth() {
        Tracer.trace();
        Display display = getDefaultDisplay();
        Point p = new Point();
        display.getSize(p);
        return p.x;
    }

    /**
     * Gets the height of the display, in pixels. The size is adjusted based
     * on the current orientation of the display.
     * @return height in pixels or zero on failure
     * @since API Level 16
     */
    public int getDisplayHeight() {
        Tracer.trace();
        Display display = getDefaultDisplay();
        Point p = new Point();
        display.getSize(p);
        return p.y;
    }

    /**
     * Perform a click at arbitrary coordinates specified by the user
     *
     * @param x coordinate
     * @param y coordinate
     * @return true if the click succeeded else false
     * @since API Level 16
     */
    public boolean click(int x, int y) {
        Tracer.trace(x, y);
        if (x >= getDisplayWidth() || y >= getDisplayHeight()) {
            return (false);
        }
        return getAutomatorBridge().getInteractionController().click(x, y);
    }

    /**
     * Performs a swipe from one coordinate to another using the number of steps
     * to determine smoothness and speed. Each step execution is throttled to 5ms
     * per step. So for a 100 steps, the swipe will take about 1/2 second to complete.
     *
     * @param startX
     * @param startY
     * @param endX
     * @param endY
     * @param steps is the number of move steps sent to the system
     * @return false if the operation fails or the coordinates are invalid
     * @since API Level 16
     */
    public boolean swipe(int startX, int startY, int endX, int endY, int steps) {
        Tracer.trace(startX, startY, endX, endY, steps);
        return mUiAutomationBridge.getInteractionController()
                .scrollSwipe(startX, startY, endX, endY, steps);
    }

    /**
     * Performs a swipe between points in the Point array. Each step execution is throttled
     * to 5ms per step. So for a 100 steps, the swipe will take about 1/2 second to complete
     *
     * @param segments is Point array containing at least one Point object
     * @param segmentSteps steps to inject between two Points
     * @return true on success
     * @since API Level 16
     */
    public boolean swipe(Point[] segments, int segmentSteps) {
        Tracer.trace(segments, segmentSteps);
        return mUiAutomationBridge.getInteractionController().swipe(segments, segmentSteps);
    }

    /**
     * Waits for the current application to idle.
     * Default wait timeout is 10 seconds
     * @since API Level 16
     */
    public void waitForIdle() {
        Tracer.trace();
        waitForIdle(DEFAULT_TIMEOUT_MILLIS);
    }

    /**
     * Waits for the current application to idle.
     * @param timeout in milliseconds
     * @since API Level 16
     */
    public void waitForIdle(long timeout) {
        Tracer.trace(timeout);
        mUiAutomationBridge.waitForIdle(timeout);
    }

    /**
     * Retrieves the last activity to report accessibility events.
     * @deprecated The results returned should be considered unreliable
     * @return String name of activity
     * @since API Level 16
     */
    @Deprecated
    public String getCurrentActivityName() {
        Tracer.trace();
        return mUiAutomationBridge.getQueryController().getCurrentActivityName();
    }

    /**
     * Retrieves the name of the last package to report accessibility events.
     * @return String name of package
     * @since API Level 16
     */
    public String getCurrentPackageName() {
        Tracer.trace();
        return mUiAutomationBridge.getQueryController().getCurrentPackageName();
    }

    /**
     * Registers a {@link UiWatcher} to run automatically when the testing framework is unable to
     * find a match using a {@link UiSelector}. See {@link #runWatchers()}
     *
     * @param name to register the UiWatcher
     * @param watcher {@link UiWatcher}
     * @since API Level 16
     */
    public void registerWatcher(String name, UiWatcher watcher) {
        Tracer.trace(name, watcher);
        if (mInWatcherContext) {
            throw new IllegalStateException("Cannot register new watcher from within another");
        }
        mWatchers.put(name, watcher);
    }

    /**
     * Removes a previously registered {@link UiWatcher}.
     *
     * See {@link #registerWatcher(String, UiWatcher)}
     * @param name used to register the UiWatcher
     * @since API Level 16
     */
    public void removeWatcher(String name) {
        Tracer.trace(name);
        if (mInWatcherContext) {
            throw new IllegalStateException("Cannot remove a watcher from within another");
        }
        mWatchers.remove(name);
    }

    /**
     * This method forces all registered watchers to run.
     * See {@link #registerWatcher(String, UiWatcher)}
     * @since API Level 16
     */
    public void runWatchers() {
        Tracer.trace();
        if (mInWatcherContext) {
            return;
        }

        for (String watcherName : mWatchers.keySet()) {
            UiWatcher watcher = mWatchers.get(watcherName);
            if (watcher != null) {
                try {
                    mInWatcherContext = true;
                    if (watcher.checkForCondition()) {
                        setWatcherTriggered(watcherName);
                    }
                } catch (Exception e) {
                    Log.e(LOG_TAG, "Exceuting watcher: " + watcherName, e);
                } finally {
                    mInWatcherContext = false;
                }
            }
        }
    }

    /**
     * Resets a {@link UiWatcher} that has been triggered.
     * If a UiWatcher runs and its {@link UiWatcher#checkForCondition()} call
     * returned <code>true</code>, then the UiWatcher is considered triggered.
     * See {@link #registerWatcher(String, UiWatcher)}
     * @since API Level 16
     */
    public void resetWatcherTriggers() {
        Tracer.trace();
        mWatchersTriggers.clear();
    }

    /**
     * Checks if a specific registered  {@link UiWatcher} has triggered.
     * See {@link #registerWatcher(String, UiWatcher)}. If a UiWatcher runs and its
     * {@link UiWatcher#checkForCondition()} call returned <code>true</code>, then
     * the UiWatcher is considered triggered. This is helpful if a watcher is detecting errors
     * from ANR or crash dialogs and the test needs to know if a UiWatcher has been triggered.
     *
     * @param watcherName
     * @return true if triggered else false
     * @since API Level 16
     */
    public boolean hasWatcherTriggered(String watcherName) {
        Tracer.trace(watcherName);
        return mWatchersTriggers.contains(watcherName);
    }

    /**
     * Checks if any registered {@link UiWatcher} have triggered.
     *
     * See {@link #registerWatcher(String, UiWatcher)}
     * See {@link #hasWatcherTriggered(String)}
     * @since API Level 16
     */
    public boolean hasAnyWatcherTriggered() {
        Tracer.trace();
        return mWatchersTriggers.size() > 0;
    }

    /**
     * Used internally by this class to set a {@link UiWatcher} state as triggered.
     * @param watcherName
     */
    private void setWatcherTriggered(String watcherName) {
        Tracer.trace(watcherName);
        if (!hasWatcherTriggered(watcherName)) {
            mWatchersTriggers.add(watcherName);
        }
    }

    /**
     * Check if the device is in its natural orientation. This is determined by checking if the
     * orientation is at 0 or 180 degrees.
     * @return true if it is in natural orientation
     * @since API Level 17
     */
    public boolean isNaturalOrientation() {
        Tracer.trace();
        Display display = getDefaultDisplay();
        return display.getRotation() == Surface.ROTATION_0 ||
                display.getRotation() == Surface.ROTATION_180;
    }

    /**
     * Returns the current rotation of the display, as defined in {@link Surface}
     * @since API Level 17
     */
    public int getDisplayRotation() {
        Tracer.trace();
        return getDefaultDisplay().getRotation();
    }

    /**
     * Disables the sensors and freezes the device rotation at its
     * current rotation state.
     * @throws RemoteException
     * @since API Level 16
     */
    public void freezeRotation() throws RemoteException {
        Tracer.trace();
        getAutomatorBridge().getInteractionController().freezeRotation();
    }

    /**
     * Re-enables the sensors and un-freezes the device rotation allowing its contents
     * to rotate with the device physical rotation. During a test execution, it is best to
     * keep the device frozen in a specific orientation until the test case execution has completed.
     * @throws RemoteException
     */
    public void unfreezeRotation() throws RemoteException {
        Tracer.trace();
        getAutomatorBridge().getInteractionController().unfreezeRotation();
    }

    /**
     * Simulates orienting the device to the left and also freezes rotation
     * by disabling the sensors.
     *
     * If you want to un-freeze the rotation and re-enable the sensors
     * see {@link #unfreezeRotation()}.
     * @throws RemoteException
     * @since API Level 17
     */
    public void setOrientationLeft() throws RemoteException {
        Tracer.trace();
        getAutomatorBridge().getInteractionController().setRotationLeft();
    }

    /**
     * Simulates orienting the device to the right and also freezes rotation
     * by disabling the sensors.
     *
     * If you want to un-freeze the rotation and re-enable the sensors
     * see {@link #unfreezeRotation()}.
     * @throws RemoteException
     * @since API Level 17
     */
    public void setOrientationRight() throws RemoteException {
        Tracer.trace();
        getAutomatorBridge().getInteractionController().setRotationRight();
    }

    /**
     * Simulates orienting the device into its natural orientation and also freezes rotation
     * by disabling the sensors.
     *
     * If you want to un-freeze the rotation and re-enable the sensors
     * see {@link #unfreezeRotation()}.
     * @throws RemoteException
     * @since API Level 17
     */
    public void setOrientationNatural() throws RemoteException {
        Tracer.trace();
        getAutomatorBridge().getInteractionController().setRotationNatural();
    }

    /**
     * This method simulates pressing the power button if the screen is OFF else
     * it does nothing if the screen is already ON.
     *
     * If the screen was OFF and it just got turned ON, this method will insert a 500ms delay
     * to allow the device time to wake up and accept input.
     * @throws RemoteException
     * @since API Level 16
     */
    public void wakeUp() throws RemoteException {
        Tracer.trace();
        if(getAutomatorBridge().getInteractionController().wakeDevice()) {
            // sync delay to allow the window manager to start accepting input
            // after the device is awakened.
            SystemClock.sleep(500);
        }
    }

    /**
     * Checks the power manager if the screen is ON.
     *
     * @return true if the screen is ON else false
     * @throws RemoteException
     * @since API Level 16
     */
    public boolean isScreenOn() throws RemoteException {
        Tracer.trace();
        return getAutomatorBridge().getInteractionController().isScreenOn();
    }

    /**
     * This method simply presses the power button if the screen is ON else
     * it does nothing if the screen is already OFF.
     *
     * @throws RemoteException
     * @since API Level 16
     */
    public void sleep() throws RemoteException {
        Tracer.trace();
        getAutomatorBridge().getInteractionController().sleepDevice();
    }

    /**
     * Helper method used for debugging to dump the current window's layout hierarchy.
     * The file root location is /data/local/tmp
     *
     * @param fileName
     * @since API Level 16
     */
    public void dumpWindowHierarchy(String fileName) {
        Tracer.trace(fileName);
        AccessibilityNodeInfo root =
                getAutomatorBridge().getQueryController().getAccessibilityRootNode();
        if(root != null) {
            AccessibilityNodeInfoDumper.dumpWindowToFile(
                    root, new File(new File(Environment.getDataDirectory(),
                            "local/tmp"), fileName));
        }
    }

    /**
     * Waits for a window content update event to occur.
     *
     * If a package name for the window is specified, but the current window
     * does not have the same package name, the function returns immediately.
     *
     * @param packageName the specified window package name (can be <code>null</code>).
     *        If <code>null</code>, a window update from any front-end window will end the wait
     * @param timeout the timeout for the wait
     *
     * @return true if a window update occurred, false if timeout has elapsed or if the current
     *         window does not have the specified package name
     * @since API Level 16
     */
    public boolean waitForWindowUpdate(final String packageName, long timeout) {
        Tracer.trace(packageName, timeout);
        if (packageName != null) {
            if (!packageName.equals(getCurrentPackageName())) {
                return false;
            }
        }
        Runnable emptyRunnable = new Runnable() {
            @Override
            public void run() {
            }
        };
        Predicate<AccessibilityEvent> checkWindowUpdate = new Predicate<AccessibilityEvent>() {
            @Override
            public boolean apply(AccessibilityEvent t) {
                if (t.getEventType() == AccessibilityEvent.TYPE_WINDOW_CONTENT_CHANGED) {
                    return packageName == null || packageName.equals(t.getPackageName());
                }
                return false;
            }
        };
        try {
            getAutomatorBridge().executeCommandAndWaitForAccessibilityEvent(
                    emptyRunnable, checkWindowUpdate, timeout);
        } catch (TimeoutException e) {
            return false;
        } catch (Exception e) {
            Log.e(LOG_TAG, "waitForWindowUpdate: general exception from bridge", e);
            return false;
        }
        return true;
    }

    private static Display getDefaultDisplay() {
        return DisplayManagerGlobal.getInstance().getRealDisplay(Display.DEFAULT_DISPLAY);
    }

    /**
     * @return the current display rotation in degrees
     */
    private static float getDegreesForRotation(int value) {
        switch (value) {
        case Surface.ROTATION_90:
            return 360f - 90f;
        case Surface.ROTATION_180:
            return 360f - 180f;
        case Surface.ROTATION_270:
            return 360f - 270f;
        }
        return 0f;
    }

    /**
     * Take a screenshot of current window and store it as PNG
     *
     * Default scale of 1.0f (original size) and 90% quality is used
     * The screenshot is adjusted per screen rotation
     *
     * @param storePath where the PNG should be written to
     * @return true if screen shot is created successfully, false otherwise
     * @since API Level 17
     */
    public boolean takeScreenshot(File storePath) {
        Tracer.trace(storePath);
        return takeScreenshot(storePath, 1.0f, 90);
    }

    /**
     * Take a screenshot of current window and store it as PNG
     *
     * The screenshot is adjusted per screen rotation
     *
     * @param storePath where the PNG should be written to
     * @param scale scale the screenshot down if needed; 1.0f for original size
     * @param quality quality of the PNG compression; range: 0-100
     * @return true if screen shot is created successfully, false otherwise
     * @since API Level 17
     */
    public boolean takeScreenshot(File storePath, float scale, int quality) {
        Tracer.trace(storePath, scale, quality);
        // This is from com.android.systemui.screenshot.GlobalScreenshot#takeScreenshot
        // We need to orient the screenshot correctly (and the Surface api seems to take screenshots
        // only in the natural orientation of the device :!)
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Display display = getDefaultDisplay();
        display.getRealMetrics(displayMetrics);
        float[] dims = {displayMetrics.widthPixels, displayMetrics.heightPixels};
        float degrees = getDegreesForRotation(display.getRotation());
        boolean requiresRotation = (degrees > 0);
        Matrix matrix = new Matrix();
        matrix.reset();
        if (scale != 1.0f) {
            matrix.setScale(scale, scale);
        }
        if (requiresRotation) {
            // Get the dimensions of the device in its native orientation
            matrix.preRotate(-degrees);
        }
        matrix.mapPoints(dims);
        dims[0] = Math.abs(dims[0]);
        dims[1] = Math.abs(dims[1]);

        // Take the screenshot
        Bitmap screenShot = Surface.screenshot((int) dims[0], (int) dims[1]);
        if (screenShot == null) {
            return false;
        }

        if (requiresRotation) {
            // Rotate the screenshot to the current orientation
            int width = displayMetrics.widthPixels;
            int height = displayMetrics.heightPixels;
            if (scale != 1.0f) {
                width = Math.round(scale * width);
                height = Math.round(scale * height);
            }
            Bitmap ss = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            Canvas c = new Canvas(ss);
            c.translate(ss.getWidth() / 2, ss.getHeight() / 2);
            c.rotate(degrees);
            c.translate(-dims[0] / 2, -dims[1] / 2);
            c.drawBitmap(screenShot, 0, 0, null);
            c.setBitmap(null);
            screenShot = ss;
        }

        // Optimizations
        screenShot.setHasAlpha(false);

        try {
            FileOutputStream fos = new FileOutputStream(storePath);
            screenShot.compress(Bitmap.CompressFormat.PNG, quality, fos);
            fos.flush();
            fos.close();
        } catch (IOException ioe) {
            Log.e(LOG_TAG, "failed to save screen shot to file", ioe);
            return false;
        } finally {
            screenShot.recycle();
        }
        return true;
    }
}
