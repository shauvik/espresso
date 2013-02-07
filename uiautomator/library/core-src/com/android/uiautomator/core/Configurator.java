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
package com.android.uiautomator.core;

/**
 * The Configurator allows for modification of some key framework parameters.
 * New settings take effect immediately and can be changed any time during a test run.
 *
 * Can be obtained by calling {@link #getInstance()}
 * @since API Level 18
 */
public final class Configurator {
    private long mWaitForIdleTimeout = 10 * 1000;
    private long mWaitForSelector = 10 * 1000;
    private long mWaitForActionAcknowledgment = 3 * 1000;

    // The events for a scroll typically complete even before touchUp occurs.
    // This short timeout to make sure we get the very last in cases where the above isn't true.
    private long mScrollEventWaitTimeout = 200; // ms

    // Default is inject as fast as we can
    private long mKeyInjectionDelay = 0; // ms

    // reference to self
    private static Configurator sConfigurator;

    private Configurator() {
        /* hide constructor */
    }

    /**
     * Retrieves a singleton instance of Configurator
     *
     * @return Configurator instance
     * @since API Level 18
     */
    public static Configurator getInstance() {
        if (sConfigurator == null) {
            sConfigurator = new Configurator();
        }
        return sConfigurator;
    }

    /**
     * Sets the timeout used to wait for user interface idle before an automation action.
     *
     * All automation APIs, except {@link UiDevice}, perform this wait for idle before looking for
     * the widget specified by the object's {@link UiSelector}. Once idle is detected, a
     * wait for selector will begin. See {@link #setWaitForSelectorTimeout(long)}
     *
     * @param timeout Timeout value in milliseconds
     * @return self
     * @since API Level 18
     */
    public Configurator setWaitForIdleTimeout(long timeout) {
        mWaitForIdleTimeout = timeout;
        return this;
    }

    /**
     * Gets the timeout used to wait for user interface idle before an automation action.
     *
     * All automation APIs, except {@link UiDevice}, perform this wait for idle before looking for
     * the widget specified by the object's {@link UiSelector}. Once idle is detected, a
     * wait for selector will begin. See {@link #setWaitForSelectorTimeout(long)}
     *
     * @return current timeout in milliseconds
     * @since API Level 18
     */
    public long getWaitForIdleTimeout() {
        return mWaitForIdleTimeout;
    }

    /**
     * Sets the timeout used to wait for a widget matching a selector to become visible
     * in user interface.
     *
     * The user interface content is dynamic and sometimes the specific widget to be
     * automated may not yet be visible. This wait allows the framework to keep looking
     * for a matching widget to the object's {@link UiSelector}, up until the timeout.
     *
     * @param timeout Timeout value in milliseconds.
     * @return self
     * @since API Level 18
     */
    public Configurator setWaitForSelectorTimeout(long timeout) {
        mWaitForSelector = timeout;
        return this;
    }

    /**
     * Gets the timeout used to wait for a widget matching a selector to become visible
     * in user interface.
     *
     * The user interface content is dynamic and sometimes the specific widget to be
     * automated, may not yet be visible. This wait allows the framework to keep looking
     * for a matching widget to the object's {@link UiSelector}, up until the timeout.
     *
     * @return current timeout in milliseconds
     * @since API Level 18
     */
    public long getWaitForSelectorTimeout() {
        return mWaitForSelector;
    }

    /**
     * Sets the timeout used to wait for acknowledgment events caused by automation scroll
     * swipe action.
     *
     * The acknowledgment event is an accessibility event, corresponding to the scroll action.
     * This acknowledgment helps the framework determine if the requested action was successful.
     * Changing this timeout value should only be made in very rare cases and in general use,
     * should not be modified.
     *
     * @param timeout Timeout value in milliseconds
     * @return self
     * @since API Level 18
     */
    public Configurator setScrollAcknowledgmentTimeout(long timeout) {
        mScrollEventWaitTimeout = timeout;
        return this;
    }

    /**
     * Gets the timeout used to wait for acknowledgment events caused by automation scroll
     * swipe action.
     *
     * The acknowledgment event is an accessibility event, corresponding to the scroll action.
     * This acknowledgment helps the framework determine if the requested action was successful.
     * Changing this timeout value should only be made in very rare cases and in general use,
     * should not be modified.
     *
     * @return current timeout in milliseconds
     * @since API Level 18
     */
    public long getScrollAcknowledgmentTimeout() {
        return mScrollEventWaitTimeout;
    }

    /**
     * Sets the timeout used to wait for acknowledgment events caused by generic automation
     * actions such as clicks, setText, pressMenu etc...
     *
     * The acknowledgment event is an accessibility event, corresponding to an action, that the
     * framework looks for after an action is performed. This acknowledgment helps the
     * framework determine if the requested action was successful. Changing this timeout
     * value should only be made in very rare cases and in general use, should not be modified.
     *
     * @param timeout Timeout value in milliseconds
     * @return self
     * @since API Level 18
     */
    public Configurator setActionAcknowledgmentTimeout(long timeout) {
        mWaitForActionAcknowledgment = timeout;
        return this;
    }

    /**
     * Gets the timeout used to wait for acknowledgment events caused by generic automation
     * actions such as clicks, setText, pressMenu etc...
     *
     * The acknowledgment event is an accessibility event, corresponding to an action, that the
     * framework looks for after an action is performed. This acknowledgment helps the
     * framework determine if the requested action was successful. Changing this timeout
     * value should only be made in very rare cases and in general use, should not be modified.
     *
     * @return current timeout in milliseconds
     * @since API Level 18
     */
    public long getActionAcknowledgmentTimeout() {
        return mWaitForActionAcknowledgment;
    }

    /**
     * Sets a delay between key presses when sending text.
     *
     * @param delay Delay value in milliseconds
     * @return self
     * @since API Level 18
     */
    public Configurator setKeyInjectionDelay(long delay) {
        mKeyInjectionDelay = delay;
        return this;
    }

    /**
     * Gets the delay between key presses when sending text.
     *
     * @return current delay in milliseconds
     * @since API Level 18
     */
    public long getKeyInjectionDelay() {
        return mKeyInjectionDelay;
    }
}
