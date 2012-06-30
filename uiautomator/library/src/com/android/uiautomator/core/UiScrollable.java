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

import android.graphics.Rect;
import android.util.Log;
import android.view.accessibility.AccessibilityNodeInfo;

/**
 * UiScrollable is a {@link UiCollection} however this class provides additional functionality
 * where the tests need to deal with scrollable contents or desire to enumerate lists of
 * items. This calls can perform automatic searches within a scrollable container. Whether
 * the content scrolls vertically or horizontally can be set by calling
 * {@link #setAsVerticalList()} which is the default, or {@link #setAsHorizontalList()}.
 */
public class UiScrollable extends UiCollection {
    private static final String LOG_TAG = UiScrollable.class.getSimpleName();

    // More steps slows the swipe and prevents contents from being flung too far
    private static final int SCROLL_STEPS = 55;

    private static final int FLING_STEPS = 5;

    // Restrict a swipe's starting and ending points inside a 10% margin of the target
    private static final double DEFAULT_SWIPE_DEADZONE_PCT = 0.1;

    // Limits the number of swipes/scrolls performed during a search
    private static int mMaxSearchSwipes = 30;

    // Used in ScrollForward() and ScrollBackward() to determine swipe direction
    protected boolean mIsVerticalList = true;

    private double mSwipeDeadZonePercentage = DEFAULT_SWIPE_DEADZONE_PCT;

    /**
     * UiScrollable is a {@link UiCollection} and as such requires a {@link UiSelector} to identify
     * the UI element it represents. In the case of UiScrollable, the selector specified is
     * considered a container where further calls to enumerate or find children will be performed
     * in.
     * @param container a {@link UiSelector} selector
     */
    public UiScrollable(UiSelector container) {
        // wrap the container selector with container so that QueryController can handle
        // this type of enumeration search accordingly
        super(container);
    }

    /**
     * Set the direction of swipes when performing scroll search
     */
    public void setAsVerticalList() {
        mIsVerticalList = true;
    }

    /**
     * Set the direction of swipes when performing scroll search
     */
    public void setAsHorizontalList() {
        mIsVerticalList = false;
    }

    /**
     * Used privately when performing swipe searches to decide if an element has become
     * visible or not.
     * @param selector
     * @return true if found else false
     */
    protected boolean exists(UiSelector selector) {
        if(getQueryController().findAccessibilityNodeInfo(selector) != null) {
            return true;
        }
        return false;
    }

    /**
     * Searches for child UI element within the constraints of this UiScrollable {@link UiSelector}
     * selector. It looks for any child matching the <code>childPattern</code> argument that has
     * a child UI element anywhere within its sub hierarchy that has content-description text.
     * The returned UiObject will point at the <code>childPattern</code> instance that matched the
     * search and not at the identifying child element that matched the content description.</p>
     * By default this operation will perform scroll search while attempting to find the
     * UI element.
     * See {@link #getChildByDescription(UiSelector, String, boolean)}
     * @param childPattern {@link UiSelector} selector of the child pattern to match and return
     * @param text String of the identifying child contents of of the <code>childPattern</code>
     * @return {@link UiObject} pointing at and instance of <code>childPattern</code>
     * @throws UiObjectNotFoundException
     */
    @Override
    public UiObject getChildByDescription(UiSelector childPattern, String text)
            throws UiObjectNotFoundException {
        return getChildByDescription(childPattern, text, true);
    }

    /**
     * Searches for child UI element within the constraints of this UiScrollable {@link UiSelector}
     * selector. It looks for any child matching the <code>childPattern</code> argument that has
     * a child UI element anywhere within its sub hierarchy that has content-description text.
     * The returned UiObject will point at the <code>childPattern</code> instance that matched the
     * search and not at the identifying child element that matched the content description.
     * @param childPattern {@link UiSelector} selector of the child pattern to match and return
     * @param text String may be a partial match for the content-description of a child element.
     * @param allowScrollSearch set to true if scrolling is allowed
     * @return {@link UiObject} pointing at and instance of <code>childPattern</code>
     * @throws UiObjectNotFoundException
     */
    public UiObject getChildByDescription(UiSelector childPattern, String text,
            boolean allowScrollSearch) throws UiObjectNotFoundException {
        if (text != null) {
            if (allowScrollSearch) {
                scrollIntoView(new UiSelector().descriptionContains(text));
            }
            return super.getChildByDescription(childPattern, text);
        }
        throw new UiObjectNotFoundException("for description= \"" + text + "\"");
    }

    /**
     * Searches for child UI element within the constraints of this UiScrollable {@link UiSelector}
     * selector. It looks for any child matching the <code>childPattern</code> argument and
     * return the <code>instance</code> specified. The operation is performed only on the visible
     * items and no scrolling is performed in this case.
     * @param childPattern {@link UiSelector} selector of the child pattern to match and return
     * @param instance int the desired matched instance of this <code>childPattern</code>
     * @return {@link UiObject} pointing at and instance of <code>childPattern</code>
     */
    @Override
    public UiObject getChildByInstance(UiSelector childPattern, int instance)
            throws UiObjectNotFoundException {
        UiSelector patternSelector = UiSelector.patternBuilder(getSelector(),
                UiSelector.patternBuilder(childPattern).instance(instance));
        return new UiObject(patternSelector);
    }

    /**
     * Searches for child UI element within the constraints of this UiScrollable {@link UiSelector}
     * selector. It looks for any child matching the <code>childPattern</code> argument that has
     * a child UI element anywhere within its sub hierarchy that has text attribute =
     * <code>text</code>. The returned UiObject will point at the <code>childPattern</code>
     * instance that matched the search and not at the identifying child element that matched the
     * text attribute.</p>
     * By default this operation will perform scroll search while attempting to find the UI
     * element.
     * See {@link #getChildByText(UiSelector, String, boolean)}
     * @param childPattern {@link UiSelector} selector of the child pattern to match and return
     * @param text String of the identifying child contents of of the <code>childPattern</code>
     * @return {@link UiObject} pointing at and instance of <code>childPattern</code>
     * @throws UiObjectNotFoundException
     */
    @Override
    public UiObject getChildByText(UiSelector childPattern, String text)
            throws UiObjectNotFoundException {
        return getChildByText(childPattern, text, true);
    }

    /**
     * Searches for child UI element within the constraints of this UiScrollable {@link UiSelector}
     * selector. It looks for any child matching the <code>childPattern</code> argument that has
     * a child UI element anywhere within its sub hierarchy that has the text attribute =
     * <code>text</code>.
     * The returned UiObject will point at the <code>childPattern</code> instance that matched the
     * search and not at the identifying child element that matched the text attribute.
     * @param childPattern {@link UiSelector} selector of the child pattern to match and return
     * @param text String of the identifying child contents of of the <code>childPattern</code>
     * @param allowScrollSearch set to true if scrolling is allowed
     * @return {@link UiObject} pointing at and instance of <code>childPattern</code>
     * @throws UiObjectNotFoundException
     */
    public UiObject getChildByText(UiSelector childPattern, String text, boolean allowScrollSearch)
            throws UiObjectNotFoundException {

        if (text != null) {
            if (allowScrollSearch) {
                scrollIntoView(new UiSelector().text(text));
            }
            return super.getChildByText(childPattern, text);
        }
        throw new UiObjectNotFoundException("for text= \"" + text + "\"");
    }

    /**
     * Performs a swipe Up on the associated UI element until the requested content-description
     * is found or until swipe attempts have been exhausted. See {@link #setMaxSearchSwipes(int)}
     * @param text to look for anywhere within the contents of this scrollable.
     * @return true if item us found else false
     */
    public boolean scrollDescriptionIntoView(String text) {
        return scrollIntoView(new UiSelector().description(text));
    }

    /**
     * Perform a scroll search for a UI element matching the {@link UiSelector} selector argument.
     * Also see {@link #scrollDescriptionIntoView(String)} and {@link #scrollTextIntoView(String)}.
     * @param selector {@link UiSelector} selector
     * @return true if the item was found and now is in view else false
     */
    public boolean scrollIntoView(UiSelector selector) {
        // if we happen to be on top of the text we want then return here
        if (exists(getSelector().childSelector(selector))) {
            return (true);
        } else {
            // we will need to reset the search from the beginning to start search
            scrollToBeginning(mMaxSearchSwipes);
            if (exists(getSelector().childSelector(selector))) {
                return (true);
            }
            for (int x = 0; x < mMaxSearchSwipes; x++) {
                if(!scrollForward()) {
                    return false;
                }

                if(exists(getSelector().childSelector(selector))) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Performs a swipe up on the associated display element until the requested text
     * appears or until swipe attempts have been exhausted. See {@link #setMaxSearchSwipes(int)}
     * @param text to look for
     * @return true if item us found else false
     */
    public boolean scrollTextIntoView(String text) {
        return scrollIntoView(new UiSelector().text(text));
    }

    /**
     * {@link #getChildByDescription(String, boolean)} and {@link #getChildByText(String, boolean)}
     * use an arguments that specifies if scrolling is allowed while searching for the UI element.
     * The number of scrolls allowed to perform a search can be modified by this method.
     * The current value can be read by calling {@link #getMaxSearchSwipes()}
     * @param swipes
     */
    public void setMaxSearchSwipes(int swipes) {
        mMaxSearchSwipes = swipes;
    }

    /**
     * {@link #getChildByDescription(String, boolean)} and {@link #getChildByText(String, boolean)}
     * use an arguments that specifies if scrolling is allowed while searching for the UI element.
     * The number of scrolls currently allowed to perform a search can be read by this method.
     * See {@link #setMaxSearchSwipes(int)}
     * @return max value of the number of swipes currently allowed during a scroll search
     */
    public int getMaxSearchSwipes() {
        return mMaxSearchSwipes;
    }

    /**
     * A convenience version of {@link UiScrollable#scrollForward(int)}, performs a fling
     *
     * @return true if scrolled and false if can't scroll anymore
     */
    public boolean flingForward() {
        return scrollForward(FLING_STEPS);
    }

    /**
     * A convenience version of {@link UiScrollable#scrollForward(int)}, performs a regular scroll
     *
     * @return true if scrolled and false if can't scroll anymore
     */
    public boolean scrollForward() {
        return scrollForward(SCROLL_STEPS);
    }

    /**
     * Perform a scroll forward. If this list is set to vertical (see {@link #setAsVerticalList()}
     * default) then the swipes will be executed from the bottom to top. If this list is set
     * to horizontal (see {@link #setAsHorizontalList()}) then the swipes will be executed from
     * the right to left.
     *
     * @param steps use steps to control the speed, so that it may be a scroll, or fling
     * @return true if scrolled and false if can't scroll anymore
     */
    public boolean scrollForward(int steps) {
        Log.d(LOG_TAG, "scrollForward() on selector = " + getSelector());
        AccessibilityNodeInfo node = findAccessibilityNodeInfo(WAIT_FOR_SELECTOR_TIMEOUT);
        if(node == null) {
            // Object Not Found
            return false;
        }
        Rect rect = new Rect();;
        node.getBoundsInScreen(rect);

        int downX = 0;
        int downY = 0;
        int upX = 0;
        int upY = 0;

        // scrolling is by default assumed vertically unless the object is explicitly
        // set otherwise by setAsHorizontalContainer()
        if(mIsVerticalList) {
            int swipeAreaAdjust = (int)(rect.height() * getSwipeDeadZonePercentage());
            // scroll vertically: swipe down -> up
            downX = rect.centerX();
            downY = rect.bottom - swipeAreaAdjust;
            upX = rect.centerX();
            upY = rect.top + swipeAreaAdjust;
        } else {
            int swipeAreaAdjust = (int)(rect.width() * getSwipeDeadZonePercentage());
            // scroll horizontally: swipe right -> left
            // TODO: Assuming device is not in right to left language
            downX = rect.right - swipeAreaAdjust;
            downY = rect.centerY();
            upX = rect.left + swipeAreaAdjust;
            upY = rect.centerY();
        }
        return getInteractionController().scrollSwipe(downX, downY, upX, upY, steps);
    }

    /**
     * A convenience version of {@link UiScrollable#scrollBackward(int)}, performs a fling
     *
     * @return true if scrolled and false if can't scroll anymore
     */
    public boolean flingBackward() {
        return scrollBackward(FLING_STEPS);
    }

    /**
     * A convenience version of {@link UiScrollable#scrollBackward(int)}, performs a regular scroll
     *
     * @return true if scrolled and false if can't scroll anymore
     */
    public boolean scrollBackward() {
        return scrollBackward(SCROLL_STEPS);
    }

    /**
     * Perform a scroll backward. If this list is set to vertical (see {@link #setAsVerticalList()}
     * default) then the swipes will be executed from the top to bottom. If this list is set
     * to horizontal (see {@link #setAsHorizontalList()}) then the swipes will be executed from
     * the left to right.
     *
     * @param steps use steps to control the speed, so that it may be a scroll, or fling
     * @return true if scrolled and false if can't scroll anymore
     */
    public boolean scrollBackward(int steps) {
        Log.d(LOG_TAG, "scrollBackward() on selector = " + getSelector());
        AccessibilityNodeInfo node = findAccessibilityNodeInfo(WAIT_FOR_SELECTOR_TIMEOUT);
        if(node == null) {
            // Object Not Found
            return false;
        }
        Rect rect = new Rect();;
        node.getBoundsInScreen(rect);

        int downX = 0;
        int downY = 0;
        int upX = 0;
        int upY = 0;

        // scrolling is by default assumed vertically unless the object is explicitly
        // set otherwise by setAsHorizontalContainer()
        if(mIsVerticalList) {
            int swipeAreaAdjust = (int)(rect.height() * getSwipeDeadZonePercentage());
            Log.d(LOG_TAG, "scrollToBegining() using vertical scroll");
            // scroll vertically: swipe up -> down
            downX = rect.centerX();
            downY = rect.top + swipeAreaAdjust;
            upX = rect.centerX();
            upY = rect.bottom - swipeAreaAdjust;
        } else {
            int swipeAreaAdjust = (int)(rect.width() * getSwipeDeadZonePercentage());
            Log.d(LOG_TAG, "scrollToBegining() using hotizontal scroll");
            // scroll horizontally: swipe left -> right
            // TODO: Assuming device is not in right to left language
            downX = rect.left + swipeAreaAdjust;
            downY = rect.centerY();
            upX = rect.right - swipeAreaAdjust;
            upY = rect.centerY();
        }
        return getInteractionController().scrollSwipe(downX, downY, upX, upY, steps);
    }

    /**
     * Scrolls to the beginning of a scrollable UI element. The beginning could be the top most
     * in case of vertical lists or the left most in case of horizontal lists.
     *
     * @param steps use steps to control the speed, so that it may be a scroll, or fling
     * @return true on scrolled else false
     */
    public boolean scrollToBeginning(int maxSwipes, int steps) {
        Log.d(LOG_TAG, "scrollToBeginning() on selector = " + getSelector());
        // protect against potential hanging and return after preset attempts
        for(int x = 0; x < maxSwipes; x++) {
            if(!scrollBackward(steps)) {
                break;
            }
        }
        return true;
    }

    /**
     * A convenience version of {@link UiScrollable#scrollToBeginning(int, int)} with regular scroll
     *
     * @param maxSwipes
     * @return true on scrolled else false
     */
    public boolean scrollToBeginning(int maxSwipes) {
        return scrollToBeginning(maxSwipes, SCROLL_STEPS);
    }

    /**
     * A convenience version of {@link UiScrollable#scrollToBeginning(int, int)} with fling
     *
     * @param maxSwipes
     * @return true on scrolled else false
     */
    public boolean flingToBeginning(int maxSwipes) {
        return scrollToBeginning(maxSwipes, FLING_STEPS);
    }

    /**
     * Scrolls to the end of a scrollable UI element. The end could be the bottom most
     * in case of vertical controls or the right most for horizontal controls
     *
     * @param steps use steps to control the speed, so that it may be a scroll, or fling
     * @return true on scrolled else false
     */
    public boolean scrollToEnd(int maxSwipes, int steps) {
        // protect against potential hanging and return after preset attempts
        for(int x = 0; x < maxSwipes; x++) {
            if(!scrollForward(steps)) {
                break;
            }
        }
        return true;
    }

    /**
     * A convenience version of {@link UiScrollable#scrollToEnd(int, int)} with regular scroll
     *
     * @param maxSwipes
     * @return true on scrolled else false
     */
    public boolean scrollToEnd(int maxSwipes) {
        return scrollToEnd(maxSwipes, SCROLL_STEPS);
    }

    /**
     * A convenience version of {@link UiScrollable#scrollToEnd(int, int)} with fling
     *
     * @param maxSwipes
     * @return true on scrolled else false
     */
    public boolean flingToEnd(int maxSwipes) {
        return scrollToEnd(maxSwipes, FLING_STEPS);
    }

    public double getSwipeDeadZonePercentage() {
        return mSwipeDeadZonePercentage;
    }

    public void setSwipeDeadZonePercentage(double swipeDeadZonePercentage) {
        mSwipeDeadZonePercentage = swipeDeadZonePercentage;
    }
}
