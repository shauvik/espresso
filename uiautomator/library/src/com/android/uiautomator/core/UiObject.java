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
 * UiObject is designed to be a representation of displayed UI element. It is not in any way
 * directly bound to a specific UI element. It holds information to find any displayed UI element
 * that matches its selectors. This means it can be reused on any screen where a UI element
 * exists to match its selector criteria. This help tests define a single UiObject say for
 * an "OK" or tool-bar button and use it across many activities.
 */
public class UiObject {
    private static final String LOG_TAG = UiObject.class.getSimpleName();
    protected static final long WAIT_FOR_SELECTOR_TIMEOUT = 10 * 1000;
    protected static final long WAIT_FOR_SELECTOR_POLL = 1000;
    // set a default timeout to 5.5s, since ANR threshold is 5s
    protected static final long WAIT_FOR_WINDOW_TMEOUT = 5500;
    protected static final int SWIPE_MARGIN_LIMIT = 5;

    protected UiSelector mSelector;
    protected final UiDevice mDevice;
    protected final UiAutomatorBridge mUiAutomationBridge;

    /**
     * Constructs a UiObject that references any UI element that may match the specified
     * {@link UiSelector} selector. UiObject can be pre-constructed and reused across an
     * application where applicable. A good example is a tool bar and its buttons.
     * A toolbar may remain visible on the various views the application is displaying but
     * may have different contextual buttons displayed for each. The same UiObject that
     * describes the toolbar can be reused.<p/>
     * It is a good idea in certain cases before using any operations of this UiObject is to
     * call {@link #exists()} to verify if the UI element matching this object is actually
     * visible on the screen. This way the test can gracefully handle this situation else
     * a {@link UiObjectNotFoundException} will be thrown when using this object.
     * @param selector
     */
    public UiObject(UiSelector selector) {
        mUiAutomationBridge = UiDevice.getInstance().getAutomatorBridge();
        mDevice = UiDevice.getInstance();
        mSelector = selector;
    }

    /**
     * Helper for debugging. During testing a test can dump the selector of the object into
     * its logs of needed. <code>getSelector().toString();</code>
     * @return {@link UiSelector}
     */
    public final UiSelector getSelector() {
        return new UiSelector(mSelector);
    }

    /**
     * Used in test operations to retrieve the {@link QueryController} to translate
     * a {@link UiSelector} selector into an {@link AccessibilityNodeInfo}.
     * @return {@link QueryController}
     */
    protected QueryController getQueryController() {
        return mUiAutomationBridge.getQueryController();
    }

    /**
     * Used in test operations to retrieve the {@link InteractionController} to perform
     * finger actions such as tapping, swiping or entering text.
     * @return {@link InteractionController}
     */
    protected InteractionController getInteractionController() {
        return mUiAutomationBridge.getInteractionController();
    }

    /**
     * Creates a new UiObject that points at a child UI element of the currently pointed
     * to element by this object. UI element are considered layout elements as well as UI
     * widgets. A layout element could have child widgets like buttons and text labels.
     * @param selector
     * @return a new UiObject with a new selector. It doesn't test if the object exists.
     */
    public UiObject getChild(UiSelector selector) throws UiObjectNotFoundException {
        return new UiObject(getSelector().childSelector(selector));
    }

    /**
     * Creates a new UiObject that points at a child UI element of the parent of this object.
     * Essentially this is starting the search from any one of the siblings UI element of this
     * element.
     * @param selector
     * @return
     * @throws UiObjectNotFoundException
     */
    public UiObject getFromParent(UiSelector selector) throws UiObjectNotFoundException {
        return new UiObject(getSelector().fromParent(selector));
    }

    /**
     * Counts the child UI elements immediately under the UI element currently referenced by
     * this UiObject.
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
     * Helper method to allow for a specific content to become present on the
     * screen before moving on to do other operations.
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
     * Perform the action on the UI element that is represented by this object. Also see
     * {@link #scrollToBeginning(int)}, {@link #scrollToEnd(int)}, {@link #scrollBackward()},
     * {@link #scrollForward()}. This method will perform the swipe gesture over any
     * surface. The targeted UI element does not need to have the attribute
     * <code>scrollable</code> set to <code>true</code> for this operation to be performed.
     * @param steps indicates the number of injected move steps into the system. More steps
     * injected the smoother the motion and slower.
     * @return
     * @throws UiObjectNotFoundException
     */
    public boolean swipeUp(int steps) throws UiObjectNotFoundException {
        Rect rect = getBounds();
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
     * @param steps indicates the number of injected move steps into the system. More steps
     * injected the smoother the motion and slower.
     * @return
     * @throws UiObjectNotFoundException
     */
    public boolean swipeDown(int steps) throws UiObjectNotFoundException {
        Rect rect = getBounds();
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
     * @param steps indicates the number of injected move steps into the system. More steps
     * injected the smoother the motion and slower.
     * @return
     * @throws UiObjectNotFoundException
     */
    public boolean swipeLeft(int steps) throws UiObjectNotFoundException {
        Rect rect = getBounds();
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
     * @param steps indicates the number of injected move steps into the system. More steps
     * injected the smoother the motion and slower.
     * @return
     * @throws UiObjectNotFoundException
     */
    public boolean swipeRight(int steps) throws UiObjectNotFoundException {
        Rect rect = getBounds();
        if(rect.width() <= SWIPE_MARGIN_LIMIT * 2)
            return false; // too small to swipe
        return getInteractionController().swipe(rect.left + SWIPE_MARGIN_LIMIT,
                rect.centerY(), rect.right - SWIPE_MARGIN_LIMIT, rect.centerY(), steps);
    }

    /**
     * In rare situations, the node hierarchy returned from accessibility will
     * return items that are slightly OFF the screen (list view contents). This method
     * validate that the item is visible to avoid click operation failures. It will adjust
     * the center of the click as much as possible to be within visible bounds to make
     * the click successful.
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
     * Performs a click over the UI element this object represents. </p>
     * Take note that the UI element directly represented by this UiObject may not have
     * its attribute <code>clickable</code> set to <code>true</code> and yet still perform
     * the click successfully. This is because all clicks are performed in the center of the
     * targeted UI element and if this element is a child or a parent that wraps the clickable
     * element the operation will still succeed. This is the reason this operation does not
     * not validate the targeted UI element is clickable or not before operating.
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
    *
    * Performs a click over the represented UI element, and expect window transition as
    * a result.</p>
    *
    * This method is similar to the plain {@link UiObject#click()}, with an important difference
    * that the method goes further to expect a window transition as a result of the tap. Some
    * examples of a window transition:
    * <li>launching a new activity</li>
    * <li>bringing up a pop-up menu</li>
    * <li>bringing up a dialog</li>
    * This method is intended for reliably handling window transitions that would typically lasts
    * longer than the usual preset timeouts.
    *
    * @return true if the event was triggered, else false
    * @throws UiObjectNotFoundException
    */
    public boolean clickAndWaitForNewWindow() throws UiObjectNotFoundException {
        return clickAndWaitForNewWindow(WAIT_FOR_WINDOW_TMEOUT);
    }

    /**
     *
     * Performs a click over the represented UI element, and expect window transition as
     * a result.</p>
     *
     * This method is similar to the plain {@link UiObject#click()}, with an important difference
     * that the method goes further to expect a window transition as a result of the tap. Some
     * examples of a window transition:
     * <li>launching a new activity</li>
     * <li>bringing up a pop-up menu</li>
     * <li>bringing up a dialog</li>
     * This method is intended for reliably handling window transitions that would typically lasts
     * longer than the usual preset timeouts.
     *
     * @param timeout timeout before giving up on waiting for new window
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
     * Clicks the top and left corner of the UI element.
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
     * Long clicks a UI element pointed to by the {@link UiSelector} selector of this object at the
     * bottom right corner. The duration of what will be considered as a long click is dynamically
     * retrieved from the system and used in the operation.
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
     * Clicks the bottom and right corner of the UI element.
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
     * Long clicks a UI element pointed to by the {@link UiSelector} selector of this object. The
     * duration of what will be considered as a long click is dynamically retrieved from the
     * system and used in the operation.
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
     * Long clicks a UI element pointed to by the {@link UiSelector} selector of this object at the
     * top left corner. The duration of what will be considered as a long click is dynamically
     * retrieved from the system and used in the operation.
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
     * This function can be used to return the UI element's displayed text. This applies to
     * UI element that are displaying labels or edit fields.
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
     * Retrieves the content-description value set for the UI element. In Accessibility, the
     * spoken text to speech is usually the <code>text</code> property of the UI element. If that
     * is not present, then the content-description is spoken. Many UI element such as buttons on
     * a toolbar may be too small to incorporate a visible text on their surfaces, so in such
     * cases, these UI elements must have their content-description fields populated to describe
     * them when accessibility is active.
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
     * that can accept edits. The way this method works is by first performing a {@link #click()}
     * on the edit field to set focus then it begins injecting the content of the text param
     * into the system. Since the targeted field is in focus, the text contents should be
     * inserted into the field.<p/>
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
     * method sets focus at the left edge of the field and long presses to select
     * existing text. It will then follow that with delete press. Note: It is possible
     * that not all the text is selected especially if the text contained separators
     * such as spaces, slashes, at signs etc... The function will attempt to use the
     * Select-All option if one is displayed to ensure full text selection.
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
     * Check if item pointed to by this object's selector is currently checked. <p/>
     * Take note that the {@link UiSelector} specified for this UiObjecy must be pointing
     * directly at the element you wish to query for this attribute.
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
     * Check if item pointed to by this object's selector is currently selected.<p/>
     * Take note that the {@link UiSelector} specified for this UiObjecy must be pointing
     * directly at the element you wish to query for this attribute.
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
     * Check if item pointed to by this object's selector can be checked and unchecked. <p/>
     * Take note that the {@link UiSelector} specified for this UiObjecy must be pointing
     * directly at the element you wish to query for this attribute.
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
     * Check if item pointed to by this object's selector is currently not grayed out. <p/>
     * Take note that the {@link UiSelector} specified for this UiObjecy must be pointing
     * directly at the element you wish to query for this attribute.
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
     * Check if item pointed to by this object's selector responds to clicks <p/>
     * Take note that the {@link UiSelector} specified for this UiObjecy must be pointing
     * directly at the element you wish to query for this attribute.
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
     * Check if item pointed to by this object's selector is currently focused.
     * Objects with focus will receive key stroke events when key events
     * are fired
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
     * Check if item pointed to by this object's selector is capable of receiving focus. <p/>
     * Take note that the {@link UiSelector} selector specified for this UiObjecy must be pointing
     * directly at the element you wish to query for this attribute.
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
     * Check if item pointed to by this object's selector can be scrolled.<p/>
     * Take note that the {@link UiSelector} selector specified for this UiObjecy must be pointing
     * directly at the element you wish to query for this attribute.
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
     * Check if item pointed to by this object's selector responds to long clicks.<p/>
     * Take note that the {@link UiSelector} selector specified for this UiObjecy must be pointing
     * directly at the element you wish to query for this attribute.
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
     * This method retrieves the package name of the currently displayed content on the screen.
     * This can be helpful when verifying that the expected package is on the screen before
     * proceeding with further test operations.
     * @return String package name
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
     * Reports the absolute visible screen bounds of the object. If a portion of the UI element
     * is visible, only the bounds of the visible portion of the UI element are reported. This
     * becomes important when using bounds to calculate exact coordinates for tapping the element.
     * @return Rect
     * @throws UiObjectNotFoundException
     */
    public Rect getBounds() throws UiObjectNotFoundException {
        AccessibilityNodeInfo node = findAccessibilityNodeInfo(WAIT_FOR_SELECTOR_TIMEOUT);
        if(node == null) {
            throw new UiObjectNotFoundException(getSelector().toString());
        }
        return getVisibleBounds(node);
    }

    /**
     * This method will wait for a UI element to become visible on the display. It
     * can be used for situations where the content to be selected is not yet displayed
     * and the time it will be present is unknown.
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
     * Helper to wait for a specified object to no longer be detectable. This can be
     * useful when having to wait for a progress dialog to finish.
     * @param timeout
     * @return true if gone before timeout else false for still present at timeout
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
