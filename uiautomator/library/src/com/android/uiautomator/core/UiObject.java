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
import android.os.SystemClock;
import android.util.Log;
import android.view.KeyEvent;
import android.view.accessibility.AccessibilityNodeInfo;

/**
 * UiObject is a representation of UI element. It is not in any way directly bound to a
 * UI element as an object reference. A UiObject holds information to help it locate
 * at runtime a matching UI element based on its {@UiSelector} properties specified in
 * its constructor. Since a UiObject is a representative for a matching UI element, it can
 * be reused on different screens and applications with matching UI elements. Using a
 * UiObject on a screen where none of the displayed UI elements match its UiSelector's
 * properties will result in a {@UiObjectNotFoundException} to be thrown.
 */
public class UiObject {
    private static final String LOG_TAG = UiObject.class.getSimpleName();
    protected static final long WAIT_FOR_SELECTOR_TIMEOUT = 10 * 1000;
    protected static final long WAIT_FOR_SELECTOR_POLL = 1000;
    // set a default timeout to 5.5s, since ANR threshold is 5s
    protected static final long WAIT_FOR_WINDOW_TMEOUT = 5500;
    protected static final int SWIPE_MARGIN_LIMIT = 5;

    private UiSelector mSelector;
    private final UiAutomatorBridge mUiAutomationBridge;

    /**
     * Constructs a UiObject to represent a specific UI element matched by the specified
     * {@link UiSelector} selector properties.
     *
     * @param selector
     */
    public UiObject(UiSelector selector) {
        mUiAutomationBridge = UiDevice.getInstance().getAutomatorBridge();
        mSelector = selector;
    }

    /**
     * Debugging helper. A test can dump the properties of a selector as a string
     * to its logs if needed. <code>getSelector().toString();</code>
     *
     * @return {@link UiSelector}
     */
    public final UiSelector getSelector() {
        return new UiSelector(mSelector);
    }

    /**
     * Retrieves the {@link QueryController} to translate a {@link UiSelector} selector
     * into an {@link AccessibilityNodeInfo}.
     *
     * @return {@link QueryController}
     */
    QueryController getQueryController() {
        return mUiAutomationBridge.getQueryController();
    }

    /**
     * Retrieves the {@link InteractionController} to perform finger actions such as tapping,
     * swiping or entering text.
     *
     * @return {@link InteractionController}
     */
    InteractionController getInteractionController() {
        return mUiAutomationBridge.getInteractionController();
    }

    /**
     * Creates a new UiObject representing a child UI element of the element currently represented
     * by this UiObject.
     *
     * @param selector for UI element to match
     * @return a new UiObject representing the matched UI element
     */
    public UiObject getChild(UiSelector selector) throws UiObjectNotFoundException {
        return new UiObject(getSelector().childSelector(selector));
    }

    /**
     * Creates a new UiObject representing a child UI element from the parent element currently
     * represented by this object. Essentially this is starting the search from the parent
     * element and can also be used to find sibling UI elements to the one currently represented
     * by this UiObject.
     *
     * @param selector for the UI element to match
     * @return a new UiObject representing the matched UI element
     * @throws UiObjectNotFoundException
     */
    public UiObject getFromParent(UiSelector selector) throws UiObjectNotFoundException {
        return new UiObject(getSelector().fromParent(selector));
    }

    /**
     * Counts the child UI elements immediately under the UI element currently represented by
     * this UiObject.
     *
     * @return the count of child UI elements.
     * @throws UiObjectNotFoundException
     */
    public int getChildCount() throws UiObjectNotFoundException {
        AccessibilityNodeInfo node = findAccessibilityNodeInfo(WAIT_FOR_SELECTOR_TIMEOUT);
        if(node == null) {
            throw new UiObjectNotFoundException(getSelector().toString());
        }
        return node.getChildCount();
    }

    /**
     * Uses the member UiSelector properties to find a matching UI element reported in
     * the accessibility hierarchy.
     *
     * @param selector {@link UiSelector}
     * @param timeout in milliseconds
     * @return AccessibilityNodeInfo if found else null
     */
    protected AccessibilityNodeInfo findAccessibilityNodeInfo(long timeout) {
        AccessibilityNodeInfo node = null;
        if(UiDevice.getInstance().isInWatcherContext()) {
            // we will NOT run watchers or do any sort of polling if the
            // reason we're here is because of a watcher is executing. Watchers
            // will not have other watchers run for them so they should not block
            // while they poll for items to become present. We disable polling for them.
            node = getQueryController().findAccessibilityNodeInfo(getSelector());
        } else {
            long startMills = SystemClock.uptimeMillis();
            long currentMills = 0;
            while (currentMills <= timeout) {
                node = getQueryController().findAccessibilityNodeInfo(getSelector());
                if (node != null) {
                    break;
                } else {
                    UiDevice.getInstance().runWatchers();
                }
                currentMills = SystemClock.uptimeMillis() - startMills;
                if(timeout > 0) {
                    SystemClock.sleep(WAIT_FOR_SELECTOR_POLL);
                }
            }
        }
        return node;
    }

    /**
     * Perform the action on the UI element that is represented by this UiObject. Also see
     * {@link #scrollToBeginning(int)}, {@link #scrollToEnd(int)}, {@link #scrollBackward()},
     * {@link #scrollForward()}.
     *
     * @param steps indicates the number of injected move steps into the system. Steps are
     * injected about 5ms apart. So a 100 steps may take about 1/2 second to complete.
     * @return true of successful
     * @throws UiObjectNotFoundException
     */
    public boolean swipeUp(int steps) throws UiObjectNotFoundException {
        Rect rect = getVisibleBounds();
        if(rect.height() <= SWIPE_MARGIN_LIMIT * 2)
            return false; // too small to swipe
        return getInteractionController().swipe(rect.centerX(),
                rect.bottom - SWIPE_MARGIN_LIMIT, rect.centerX(), rect.top + SWIPE_MARGIN_LIMIT,
                steps);
    }

    /**
     * Perform the action on the UI element that is represented by this object, Also see
     * {@link #scrollToBeginning(int)}, {@link #scrollToEnd(int)}, {@link #scrollBackward()},
     * {@link #scrollForward()}. This method will perform the swipe gesture over any
     * surface. The targeted UI element does not need to have the attribute
     * <code>scrollable</code> set to <code>true</code> for this operation to be performed.
     *
     * @param steps indicates the number of injected move steps into the system. Steps are
     * injected about 5ms apart. So a 100 steps may take about 1/2 second to complete.
     * @return true if successful
     * @throws UiObjectNotFoundException
     */
    public boolean swipeDown(int steps) throws UiObjectNotFoundException {
        Rect rect = getVisibleBounds();
        if(rect.height() <= SWIPE_MARGIN_LIMIT * 2)
            return false; // too small to swipe
        return getInteractionController().swipe(rect.centerX(),
                rect.top + SWIPE_MARGIN_LIMIT, rect.centerX(),
                rect.bottom - SWIPE_MARGIN_LIMIT, steps);
    }

    /**
     * Perform the action on the UI element that is represented by this object. Also see
     * {@link #scrollToBeginning(int)}, {@link #scrollToEnd(int)}, {@link #scrollBackward()},
     * {@link #scrollForward()}. This method will perform the swipe gesture over any
     * surface. The targeted UI element does not need to have the attribute
     * <code>scrollable</code> set to <code>true</code> for this operation to be performed.
     *
     * @param steps indicates the number of injected move steps into the system. Steps are
     * injected about 5ms apart. So a 100 steps may take about 1/2 second to complete.
     * @return true if successful
     * @throws UiObjectNotFoundException
     */
    public boolean swipeLeft(int steps) throws UiObjectNotFoundException {
        Rect rect = getVisibleBounds();
        if(rect.width() <= SWIPE_MARGIN_LIMIT * 2)
            return false; // too small to swipe
        return getInteractionController().swipe(rect.right - SWIPE_MARGIN_LIMIT,
                rect.centerY(), rect.left + SWIPE_MARGIN_LIMIT, rect.centerY(), steps);
    }

    /**
     * Perform the action on the UI element that is represented by this object. Also see
     * {@link #scrollToBeginning(int)}, {@link #scrollToEnd(int)}, {@link #scrollBackward()},
     * {@link #scrollForward()}. This method will perform the swipe gesture over any
     * surface. The targeted UI element does not need to have the attribute
     * <code>scrollable</code> set to <code>true</code> for this operation to be performed.
     *
     * @param steps indicates the number of injected move steps into the system. Steps are
     * injected about 5ms apart. So a 100 steps may take about 1/2 second to complete.
     * @return true if successful
     * @throws UiObjectNotFoundException
     */
    public boolean swipeRight(int steps) throws UiObjectNotFoundException {
        Rect rect = getVisibleBounds();
        if(rect.width() <= SWIPE_MARGIN_LIMIT * 2)
            return false; // too small to swipe
        return getInteractionController().swipe(rect.left + SWIPE_MARGIN_LIMIT,
                rect.centerY(), rect.right - SWIPE_MARGIN_LIMIT, rect.centerY(), steps);
    }

    /**
     * Finds the visible bounds of a partially visible UI element
     *
     * @param node
     * @return the same AccessibilityNodeInfo passed in as argument
     */
    private Rect getVisibleBounds(AccessibilityNodeInfo node) {
        if (node == null) {
            return null;
        }

        // targeted node's bounds
        Rect nodeRect = new Rect();
        node.getBoundsInScreen(nodeRect);

        // is the targeted node within a scrollable container?
        AccessibilityNodeInfo scrollableParentNode = getScrollableParent(node);
        if(scrollableParentNode == null) {
            // nothing to adjust for so return the node's Rect as is
            return nodeRect;
        }

        // Scrollable parent's visible bounds
        Rect parentRect = new Rect();
        scrollableParentNode.getBoundsInScreen(parentRect);
        // adjust for partial clipping of targeted by parent node if required
        nodeRect.intersect(parentRect);
        return nodeRect;
    }

    /**
     * Walk the hierarchy up to find a scrollable parent. A scrollable parent indicates that
     * this node may be in a content where it is partially visible due to scrolling. its
     * clickable center maybe invisible and adjustments should be made to the click coordinates.
     *
     * @param node
     * @return
     */
    private AccessibilityNodeInfo getScrollableParent(AccessibilityNodeInfo node) {
        AccessibilityNodeInfo parent = node;
        while(parent != null) {
            parent = parent.getParent();
            if (parent != null && parent.isScrollable()) {
                return parent;
            }
        }
        return null;
    }

    /**
     * Performs a click at the center of the visible bounds of the UI element represented
     * by this UiObject </p>
     * Take note that the UI element represented by this UiObject may not have its attribute
     * <code>clickable</code> set to <code>true</code> however one of its ancestor elements
     * may be clickable. This is the reason this method does not check the clickable attribute.
     *
     * @return true id successful else false
     * @throws UiObjectNotFoundException
     */
    public boolean click() throws UiObjectNotFoundException {
        AccessibilityNodeInfo node = findAccessibilityNodeInfo(WAIT_FOR_SELECTOR_TIMEOUT);
        if(node == null) {
            throw new UiObjectNotFoundException(getSelector().toString());
        }
        Rect rect = getVisibleBounds(node);
        return getInteractionController().click(rect.centerX(), rect.centerY());
    }

    /**
     * See {@link #clickAndWaitForNewWindow(long)}
     * This method is intended for reliably wait for window transitions that would typically take
     * longer than the usual deault timeouts.
     *
     * @return true if the event was triggered, else false
     * @throws UiObjectNotFoundException
     */
    public boolean clickAndWaitForNewWindow() throws UiObjectNotFoundException {
        return clickAndWaitForNewWindow(WAIT_FOR_WINDOW_TMEOUT);
    }

    /**
     * Performs a click at the center of the visible bounds of the UI element UI element represented
     * by this UiObject </p>
     * This method differ from {@link UiObject#click()} only in that this method waits for a
     * a new window transition as a result of the tap. Some examples of a window transition:
     * <li>launching a new activity</li>
     * <li>bringing up a pop-up menu</li>
     * <li>bringing up a dialog</li>
     *
     * @param timeout timeout before giving up on waiting for a new window
     * @return true if the event was triggered, else false
     * @throws UiObjectNotFoundException
     */
    public boolean clickAndWaitForNewWindow(long timeout) throws UiObjectNotFoundException {
        AccessibilityNodeInfo node = findAccessibilityNodeInfo(WAIT_FOR_SELECTOR_TIMEOUT);
        if(node == null) {
            throw new UiObjectNotFoundException(getSelector().toString());
        }
        Rect rect = getVisibleBounds(node);
        return getInteractionController().clickAndWaitForNewWindow(
                rect.centerX(), rect.centerY(), timeout);
    }

    /**
     * Clicks the top and left corner of the UI element
     *
     * @return true on success
     * @throws Exception
     */
    public boolean clickTopLeft() throws UiObjectNotFoundException {
        AccessibilityNodeInfo node = findAccessibilityNodeInfo(WAIT_FOR_SELECTOR_TIMEOUT);
        if(node == null) {
            throw new UiObjectNotFoundException(getSelector().toString());
        }
        Rect rect = getVisibleBounds(node);
        return getInteractionController().click(rect.left + 5, rect.top + 5);
    }

    /**
     * Long clicks bottom and right corner of the UI element
     *
     * @return true if operation was successful
     * @throws UiObjectNotFoundException
     */
    public boolean longClickBottomRight() throws UiObjectNotFoundException  {
        AccessibilityNodeInfo node = findAccessibilityNodeInfo(WAIT_FOR_SELECTOR_TIMEOUT);
        if(node == null) {
            throw new UiObjectNotFoundException(getSelector().toString());
        }
        Rect rect = getVisibleBounds(node);
        return getInteractionController().longTap(rect.right - 5, rect.bottom - 5);
    }

    /**
     * Clicks the bottom and right corner of the UI element
     *
     * @return true on success
     * @throws Exception
     */
    public boolean clickBottomRight() throws UiObjectNotFoundException {
        AccessibilityNodeInfo node = findAccessibilityNodeInfo(WAIT_FOR_SELECTOR_TIMEOUT);
        if(node == null) {
            throw new UiObjectNotFoundException(getSelector().toString());
        }
        Rect rect = getVisibleBounds(node);
        return getInteractionController().click(rect.right - 5, rect.bottom - 5);
    }

    /**
     * Long clicks the center of the visible bounds of the UI element
     *
     * @return true if operation was successful
     * @throws UiObjectNotFoundException
     */
    public boolean longClick() throws UiObjectNotFoundException  {
        AccessibilityNodeInfo node = findAccessibilityNodeInfo(WAIT_FOR_SELECTOR_TIMEOUT);
        if(node == null) {
            throw new UiObjectNotFoundException(getSelector().toString());
        }
        Rect rect = getVisibleBounds(node);
        return getInteractionController().longTap(rect.centerX(), rect.centerY());
    }

    /**
     * Long clicks on the top and left corner of the UI element
     *
     * @return true if operation was successful
     * @throws UiObjectNotFoundException
     */
    public boolean longClickTopLeft() throws UiObjectNotFoundException {
        AccessibilityNodeInfo node = findAccessibilityNodeInfo(WAIT_FOR_SELECTOR_TIMEOUT);
        if(node == null) {
            throw new UiObjectNotFoundException(getSelector().toString());
        }
        Rect rect = getVisibleBounds(node);
        return getInteractionController().longTap(rect.left + 5, rect.top + 5);
    }

    /**
     * Reads the <code>text</code> property of the UI element
     *
     * @return text value of the current node represented by this UiObject
     * @throws UiObjectNotFoundException if no match could be found
     */
    public String getText() throws UiObjectNotFoundException {
        AccessibilityNodeInfo node = findAccessibilityNodeInfo(WAIT_FOR_SELECTOR_TIMEOUT);
        if(node == null) {
            throw new UiObjectNotFoundException(getSelector().toString());
        }
        String retVal = safeStringReturn(node.getText());
        Log.d(LOG_TAG, String.format("getText() = %s", retVal));
        return retVal;
    }

    /**
     * Reads the <code>content_desc</code> property of the UI element
     *
     * @return value of node attribute "content_desc"
     * @throws UiObjectNotFoundException
     */
    public String getContentDescription() throws UiObjectNotFoundException {
        AccessibilityNodeInfo node = findAccessibilityNodeInfo(WAIT_FOR_SELECTOR_TIMEOUT);
        if(node == null) {
            throw new UiObjectNotFoundException(getSelector().toString());
        }
        return safeStringReturn(node.getContentDescription());
    }

    /**
     * First this function clears the existing text from the field. If this is not the intended
     * behavior, do a {@link #getText()} first, modify the text and then use this function.
     * The {@link UiSelector} selector of this object MUST be pointing directly at a UI element
     * that accepts edits. The way this method works is by first performing a {@link #click()}
     * on the edit field to set focus then it begins injecting the text
     *
     * @param text
     * @return true if operation is successful
     * @throws UiObjectNotFoundException
     */
    public boolean setText(String text) throws UiObjectNotFoundException {
        clearTextField();
        return getInteractionController().sendText(text);
    }

    /**
     * The object targeted must be an edit field capable of performing text insert. This
     * method sets focus at the start edge of the field and long presses to select
     * existing text. Note: It is possible that not all the text is selected especially
     * if the text contains separators such as spaces, slashes, at signs etc... The function
     * will attempt to use the "Select-All" option if one is displayed to ensure full text
     * selection.
     * @throws UiObjectNotFoundException
     */
    public void clearTextField() throws UiObjectNotFoundException {
        // long click left + center
        AccessibilityNodeInfo node = findAccessibilityNodeInfo(WAIT_FOR_SELECTOR_TIMEOUT);
        if(node == null) {
            throw new UiObjectNotFoundException(getSelector().toString());
        }
        Rect rect = getVisibleBounds(node);
        getInteractionController().longTap(rect.left + 20, rect.centerY());
        // check if the edit menu is open
        UiObject selectAll = new UiObject(new UiSelector().descriptionContains("Select all"));
        if(selectAll.waitForExists(50))
            selectAll.click();
        // wait for the selection
        SystemClock.sleep(250);
        // delete it
        getInteractionController().sendKey(KeyEvent.KEYCODE_DEL, 0);
    }

    /**
     * Check if the UI element's <code>checked</code> property is currently true
     *
     * @return true if it is else false
     */
    public boolean isChecked() throws UiObjectNotFoundException {
        AccessibilityNodeInfo node = findAccessibilityNodeInfo(WAIT_FOR_SELECTOR_TIMEOUT);
        if(node == null) {
            throw new UiObjectNotFoundException(getSelector().toString());
        }
        return node.isChecked();
    }

    /**
     * Check if the UI element's <code>selected</code> property is currently true
     *
     * @return true if it is else false
     * @throws UiObjectNotFoundException
     */
    public boolean isSelected() throws UiObjectNotFoundException {
        AccessibilityNodeInfo node = findAccessibilityNodeInfo(WAIT_FOR_SELECTOR_TIMEOUT);
        if(node == null) {
            throw new UiObjectNotFoundException(getSelector().toString());
        }
        return node.isSelected();
    }

    /**
     * Check if the UI element's <code>checkable</code> property is currently true
     *
     * @return true if it is else false
     * @throws UiObjectNotFoundException
     */
    public boolean isCheckable() throws UiObjectNotFoundException {
        AccessibilityNodeInfo node = findAccessibilityNodeInfo(WAIT_FOR_SELECTOR_TIMEOUT);
        if(node == null) {
            throw new UiObjectNotFoundException(getSelector().toString());
        }
        return node.isCheckable();
    }

    /**
     * Check if the UI element's <code>enabled</code> property is currently true
     *
     * @return true if it is else false
     * @throws UiObjectNotFoundException
     */
    public boolean isEnabled() throws UiObjectNotFoundException {
        AccessibilityNodeInfo node = findAccessibilityNodeInfo(WAIT_FOR_SELECTOR_TIMEOUT);
        if(node == null) {
            throw new UiObjectNotFoundException(getSelector().toString());
        }
        return node.isEnabled();
    }

    /**
     * Check if the UI element's <code>clickable</code> property is currently true
     *
     * @return true if it is else false
     * @throws UiObjectNotFoundException
     */
    public boolean isClickable() throws UiObjectNotFoundException {
        AccessibilityNodeInfo node = findAccessibilityNodeInfo(WAIT_FOR_SELECTOR_TIMEOUT);
        if(node == null) {
            throw new UiObjectNotFoundException(getSelector().toString());
        }
        return node.isClickable();
    }

    /**
     * Check if the UI element's <code>focused</code> property is currently true
     *
     * @return true if it is else false
     * @throws UiObjectNotFoundException
     */
    public boolean isFocused() throws UiObjectNotFoundException {
        AccessibilityNodeInfo node = findAccessibilityNodeInfo(WAIT_FOR_SELECTOR_TIMEOUT);
        if(node == null) {
            throw new UiObjectNotFoundException(getSelector().toString());
        }
        return node.isFocused();
    }

    /**
     * Check if the UI element's <code>focusable</code> property is currently true
     *
     * @return true if it is else false
     * @throws UiObjectNotFoundException
     */
    public boolean isFocusable() throws UiObjectNotFoundException {
        AccessibilityNodeInfo node = findAccessibilityNodeInfo(WAIT_FOR_SELECTOR_TIMEOUT);
        if(node == null) {
            throw new UiObjectNotFoundException(getSelector().toString());
        }
        return node.isFocusable();
    }

    /**
     * Check if the UI element's <code>scrollable</code> property is currently true
     *
     * @return true if it is else false
     * @throws UiObjectNotFoundException
     */
    public boolean isScrollable() throws UiObjectNotFoundException {
        AccessibilityNodeInfo node = findAccessibilityNodeInfo(WAIT_FOR_SELECTOR_TIMEOUT);
        if(node == null) {
            throw new UiObjectNotFoundException(getSelector().toString());
        }
        return node.isScrollable();
    }

    /**
     * Check if the UI element's <code>long-clickable</code> property is currently true
     *
     * @return true if it is else false
     * @throws UiObjectNotFoundException
     */
    public boolean isLongClickable() throws UiObjectNotFoundException {
        AccessibilityNodeInfo node = findAccessibilityNodeInfo(WAIT_FOR_SELECTOR_TIMEOUT);
        if(node == null) {
            throw new UiObjectNotFoundException(getSelector().toString());
        }
        return node.isLongClickable();
    }

    /**
     * Reads the UI element's <code>package</code> property
     *
     * @return true if it is else false
     * @throws UiObjectNotFoundException
     */
    public String getPackageName() throws UiObjectNotFoundException {
        AccessibilityNodeInfo node = findAccessibilityNodeInfo(WAIT_FOR_SELECTOR_TIMEOUT);
        if(node == null) {
            throw new UiObjectNotFoundException(getSelector().toString());
        }
        return safeStringReturn(node.getPackageName());
    }

    /**
     * Reports the visible bounds of the UI element. If a portion of the UI element is
     * visible, only the bounds of the visible portion are reported. see {@link #getBound()}
     *
     * @return Rect
     * @throws UiObjectNotFoundException
     */
    public Rect getVisibleBounds() throws UiObjectNotFoundException {
        AccessibilityNodeInfo node = findAccessibilityNodeInfo(WAIT_FOR_SELECTOR_TIMEOUT);
        if(node == null) {
            throw new UiObjectNotFoundException(getSelector().toString());
        }
        return getVisibleBounds(node);
    }

    /**
     * Reads the UI element's <code>bounds</code> property. See {@link #getVisibleBounds()}
     *
     * @return Rect
     * @throws UiObjectNotFoundException
     */
    public Rect getBounds() throws UiObjectNotFoundException {
        AccessibilityNodeInfo node = findAccessibilityNodeInfo(WAIT_FOR_SELECTOR_TIMEOUT);
        if(node == null) {
            throw new UiObjectNotFoundException(getSelector().toString());
        }
        Rect nodeRect = new Rect();
        node.getBoundsInScreen(nodeRect);

        return nodeRect;
    }

    /**
     * This method will wait for a UI element to become visible on the display. It
     * can be used for situations where the content to be selected is not yet displayed
     *
     * @param timeout
     * @return true if the UI element exists else false for timeout while waiting
     */
    public boolean waitForExists(long timeout) {
        if(findAccessibilityNodeInfo(timeout) != null) {
            return true;
        }
        return false;
    }

    /**
     * Helper to wait for a UI element to no longer be matchable. An element becomes
     * un-matchable when this UiObject's {@link UiSelector} no longer matches the
     * UI element because it has either changed its state or is no longer displayed.
     *
     * @param timeout
     * @return true if gone before timeout else false for still matching an element
     */
    public boolean waitUntilGone(long timeout) {
        long startMills = SystemClock.uptimeMillis();
        long currentMills = 0;
        while (currentMills <= timeout) {
            if(findAccessibilityNodeInfo(0) == null)
                return true;
            currentMills = SystemClock.uptimeMillis() - startMills;
            if(timeout > 0)
                SystemClock.sleep(WAIT_FOR_SELECTOR_POLL);
        }
        return false;
    }

    /**
     * This methods performs a {@link #waitForExists(long)} with zero timeout. This
     * basically returns immediately whether the UI element represented by this UiObject
     * exists or not. If you need to wait longer for this UI element, then see
     * {@link #waitForExists(long)}.
     *
     * @return true if the UI element represented by this UiObject does exist
     */
    public boolean exists() {
        return waitForExists(0);
    }

    private String safeStringReturn(CharSequence cs) {
        if(cs == null)
            return "";
        return cs.toString();
    }
}
