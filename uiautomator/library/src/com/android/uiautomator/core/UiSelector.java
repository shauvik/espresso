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

import android.util.SparseArray;
import android.view.accessibility.AccessibilityNodeInfo;

/**
 * This class provides the mechanism for tests to describe the UI elements they
 * intend to target. A UI element has many properties associated with it such as
 * text values, a content-description field, class name and multiple state
 * information like isSelected, isEnabled or isChecked. Additionally a UI element
 * may also be associated with a specific layout hierarchy that the test wishes
 * to use to unambiguously target one UI element distinguishing it from other
 * similar elements.
 */
public class UiSelector {
    static final int SELECTOR_NIL = 0;
    static final int SELECTOR_TEXT = 1;
    static final int SELECTOR_START_TEXT = 2;
    static final int SELECTOR_CONTAINS_TEXT = 3;
    static final int SELECTOR_CLASS = 4;
    static final int SELECTOR_DESCRIPTION = 5;
    static final int SELECTOR_START_DESCRIPTION = 6;
    static final int SELECTOR_CONTAINS_DESCRIPTION = 7;
    static final int SELECTOR_INDEX = 8;
    static final int SELECTOR_INSTANCE = 9;
    static final int SELECTOR_ENABLED = 10;
    static final int SELECTOR_FOCUSED = 11;
    static final int SELECTOR_FOCUSABLE = 12;
    static final int SELECTOR_SCROLLABLE = 13;
    static final int SELECTOR_CLICKABLE = 14;
    static final int SELECTOR_CHECKED = 15;
    static final int SELECTOR_SELECTED = 16;
    static final int SELECTOR_ID = 17;
    static final int SELECTOR_PACKAGE_NAME = 18;
    static final int SELECTOR_CHILD = 19;
    static final int SELECTOR_CONTAINER = 20;
    static final int SELECTOR_PATTERN = 21;
    static final int SELECTOR_PARENT = 22;
    static final int SELECTOR_COUNT = 23;

    private SparseArray<Object> mSelectorAttributes = new SparseArray<Object>();
    public static final String LOG_TAG = "ByClass";

    public UiSelector() {
    }

    protected UiSelector(UiSelector by) {
        mSelectorAttributes = by.cloneSelectors().mSelectorAttributes;
    }

    protected UiSelector cloneSelectors() {
        UiSelector ret = new UiSelector();
        ret.mSelectorAttributes = mSelectorAttributes.clone();
        return ret;
    }

    static UiSelector patternBuilder(UiSelector selector) {
        if(!selector.hasPatternSelector()) {
            return new UiSelector().patternSelector(selector);
        }
        return selector;
    }

    static UiSelector patternBuilder(UiSelector container, UiSelector pattern) {
        return new UiSelector(
                new UiSelector().containerSelector(container).patternSelector(pattern));
    }

    public UiSelector text(String text) {
        return buildSelector(SELECTOR_TEXT, text);
    }

    public UiSelector textStartsWith(String text) {
        return buildSelector(SELECTOR_START_TEXT, text);
    }

    public UiSelector textContains(String text) {
        return buildSelector(SELECTOR_CONTAINS_TEXT, text);
    }

    public UiSelector className(String className) {
        return buildSelector(SELECTOR_CLASS, className);
    }

    public UiSelector description(String desc) {
        return buildSelector(SELECTOR_DESCRIPTION, desc);
    }

    public UiSelector descriptionStartsWith(String desc) {
        return buildSelector(SELECTOR_START_DESCRIPTION, desc);
    }

    public UiSelector descriptionContains(String desc) {
        return buildSelector(SELECTOR_CONTAINS_DESCRIPTION, desc);
    }

    public UiSelector index(final int index) {
        return buildSelector(SELECTOR_INDEX, index);
    }

    public UiSelector instance(final int instance) {
        return buildSelector(SELECTOR_INSTANCE, instance);
    }

    public UiSelector enabled(boolean val) {
        return buildSelector(SELECTOR_ENABLED, val);
    }

    public UiSelector focused(boolean val) {
        return buildSelector(SELECTOR_FOCUSED, val);
    }

    public UiSelector focusable(boolean val) {
        return buildSelector(SELECTOR_FOCUSABLE, val);
    }

    public UiSelector scrollable(boolean val) {
        return buildSelector(SELECTOR_SCROLLABLE, val);
    }

    public UiSelector selected(boolean val) {
        return buildSelector(SELECTOR_SELECTED, val);
    }

    public UiSelector checked(boolean val) {
        return buildSelector(SELECTOR_CHECKED, val);
    }

    public UiSelector clickable(boolean val) {
        return buildSelector(SELECTOR_CLICKABLE, val);
    }

    public UiSelector childSelector(UiSelector by) {
        return buildSelector(SELECTOR_CHILD, by);
    }

    private UiSelector patternSelector(UiSelector by) {
        return buildSelector(SELECTOR_PATTERN, by);
    }

    private UiSelector containerSelector(UiSelector by) {
        return buildSelector(SELECTOR_CONTAINER, by);
    }

    public UiSelector fromParent(UiSelector by) {
        return buildSelector(SELECTOR_PARENT, by);
    }

    public UiSelector packageName(String name) {
        return buildSelector(SELECTOR_PACKAGE_NAME, name);
    }

    /**
     * Building a By selector always returns a new By selector and never modifies the
     * existing By selector being used. For example a test library have predefined
     * By selectors SA, SB, SC etc. The test may decide that it needs a By selector SX in the
     * context of SB. It can use SX = SB.critereon(x) to generate SX without modifying the
     * state of SB which is expected to be something else. For this we will return a new
     * By selector every time.
     */
    private UiSelector buildSelector(int selectorId, Object selectorValue) {
        UiSelector by = new UiSelector(this);
        if(selectorId == SELECTOR_CHILD || selectorId == SELECTOR_PARENT)
            by.getLastSubSelector().mSelectorAttributes.put(selectorId, selectorValue);
        else
            by.mSelectorAttributes.put(selectorId, selectorValue);
        return by;
    }

    /**
     * Selectors may have a hierarchy defined by specifying child nodes to be matched.
     * It is not necessary that every selector have more than one level. A selector
     * can also be a single level referencing only one node. In such cases the return
     * it null.
     * @return a child selector if one exists. Else null if this selector does not
     * reference child node.
     */

    UiSelector getChildSelector() {
        UiSelector by = (UiSelector)mSelectorAttributes.get(UiSelector.SELECTOR_CHILD, null);
        if(by != null)
            return new UiSelector(by);
        return null;
    }

    UiSelector getPatternSelector() {
        UiSelector by = (UiSelector)mSelectorAttributes.get(UiSelector.SELECTOR_PATTERN, null);
        if(by != null)
            return new UiSelector(by);
        return null;
    }

    UiSelector getContainerSelector() {
        UiSelector by = (UiSelector)mSelectorAttributes.get(UiSelector.SELECTOR_CONTAINER, null);
        if(by != null)
            return new UiSelector(by);
        return null;
    }

    UiSelector getParentSelector() {
        UiSelector by = (UiSelector) mSelectorAttributes.get(UiSelector.SELECTOR_PARENT, null);
        if(by != null)
            return new UiSelector(by);
        return null;
    }

    int getInstance() {
        return getInt(UiSelector.SELECTOR_INSTANCE);
    }

    String getString(int criterion) {
        return (String) mSelectorAttributes.get(criterion, null);
    }

    boolean getBoolean(int criterion) {
        return (Boolean) mSelectorAttributes.get(criterion, false);
    }

    int getInt(int criterion) {
        return (Integer) mSelectorAttributes.get(criterion, 0);
    }

    boolean isMatchFor(AccessibilityNodeInfo node, int index) {
        int size = mSelectorAttributes.size();
        for(int x = 0; x < size; x++) {
            CharSequence s = null;
            int criterion = mSelectorAttributes.keyAt(x);
            switch(criterion) {
            case UiSelector.SELECTOR_INDEX:
                if(index != this.getInt(criterion))
                    return false;
                break;
            case UiSelector.SELECTOR_CHECKED:
                if (node.isChecked() != getBoolean(criterion)) {
                    return false;
                }
                break;
            case UiSelector.SELECTOR_CLASS:
                s = node.getClassName();
                if (s == null || !s.toString().contentEquals(getString(criterion))) {
                    return false;
                }
                break;
            case UiSelector.SELECTOR_CLICKABLE:
                if (node.isClickable() != getBoolean(criterion)) {
                    return false;
                }
                break;
            case UiSelector.SELECTOR_CONTAINS_DESCRIPTION:
                s = node.getContentDescription();
                if(s == null || !s.toString().toLowerCase()
                        .contains(getString(criterion).toLowerCase())) {
                    return false;
                }
                break;
            case UiSelector.SELECTOR_START_DESCRIPTION:
                s = node.getContentDescription();
                if(s == null || !s.toString().toLowerCase()
                        .startsWith(getString(criterion).toLowerCase())) {
                    return false;
                }
                break;
            case UiSelector.SELECTOR_DESCRIPTION:
                s = node.getContentDescription();
                if(s == null || !s.toString().contentEquals(getString(criterion))) {
                    return false;
                }
                break;
            case UiSelector.SELECTOR_CONTAINS_TEXT:
                s = node.getText();
                if(s == null || !s.toString().toLowerCase()
                        .contains(getString(criterion).toLowerCase())) {
                    return false;
                }
                break;
            case UiSelector.SELECTOR_START_TEXT:
                s = node.getText();
                if(s == null || !s.toString().toLowerCase()
                        .startsWith(getString(criterion).toLowerCase())) {
                    return false;
                }
                break;
            case UiSelector.SELECTOR_TEXT:
                s = node.getText();
                if(s == null || !s.toString().contentEquals(getString(criterion))) {
                    return false;
                }
                break;
            case UiSelector.SELECTOR_ENABLED:
                if(node.isEnabled() != getBoolean(criterion)) {
                    return false;
                }
                break;
            case UiSelector.SELECTOR_FOCUSABLE:
                if(node.isFocusable() != getBoolean(criterion)) {
                    return false;
                }
                break;
            case UiSelector.SELECTOR_FOCUSED:
                if(node.isFocused() != getBoolean(criterion)) {
                    return false;
                }
                break;
            case UiSelector.SELECTOR_ID:
                break; //TODO: do we need this for AccessibilityNodeInfo.id?
            case UiSelector.SELECTOR_PACKAGE_NAME:
                s = node.getPackageName();
                if(s == null || !s.toString().contentEquals(getString(criterion))) {
                    return false;
                }
                break;
            case UiSelector.SELECTOR_SCROLLABLE:
                if(node.isScrollable() != getBoolean(criterion)) {
                    return false;
                }
                break;
            case UiSelector.SELECTOR_SELECTED:
                if(node.isSelected() != getBoolean(criterion)) {
                    return false;
                }
                break;
            }
        }
        return matchOrUpdateInstance();
    }

    private boolean matchOrUpdateInstance() {
        int currentSelectorCounter = 0;
        int currentSelectorInstance = 0;

        // matched attributes - now check for matching instance number
        if(mSelectorAttributes.indexOfKey(UiSelector.SELECTOR_INSTANCE) > 0) {
            currentSelectorInstance =
                    (Integer)mSelectorAttributes.get(UiSelector.SELECTOR_INSTANCE);
        }

        // instance is required. Add count if not already counting
        if(mSelectorAttributes.indexOfKey(UiSelector.SELECTOR_COUNT) > 0) {
            currentSelectorCounter = (Integer)mSelectorAttributes.get(UiSelector.SELECTOR_COUNT);
        }

        // Verify
        if (currentSelectorInstance == currentSelectorCounter) {
            return true;
        }
        // Update count
        if (currentSelectorInstance > currentSelectorCounter) {
            mSelectorAttributes.put(UiSelector.SELECTOR_COUNT, ++currentSelectorCounter);
        }
        return false;
    }

    /**
     * Leaf selector indicates no more child or parent selectors
     * are declared in the this selector.
     * @return true if is leaf.
     */
    boolean isLeaf() {
        if(mSelectorAttributes.indexOfKey(UiSelector.SELECTOR_CHILD) < 0 &&
                mSelectorAttributes.indexOfKey(UiSelector.SELECTOR_PARENT) < 0) {
            return true;
        }
        return false;
    }

    boolean hasChildSelector() {
        if(mSelectorAttributes.indexOfKey(UiSelector.SELECTOR_CHILD) < 0) {
            return false;
        }
        return true;
    }

    boolean hasPatternSelector() {
        if(mSelectorAttributes.indexOfKey(UiSelector.SELECTOR_PATTERN) < 0) {
            return false;
        }
        return true;
    }

    boolean hasContainerSelector() {
        if(mSelectorAttributes.indexOfKey(UiSelector.SELECTOR_CONTAINER) < 0) {
            return false;
        }
        return true;
    }

    boolean hasParentSelector() {
        if(mSelectorAttributes.indexOfKey(UiSelector.SELECTOR_PARENT) < 0) {
            return false;
        }
        return true;
    }

    /**
     * Returns the deepest selector in the chain of possible sub selectors.
     * A chain of selector is created when either of {@link UiSelector#childSelector(UiSelector)}
     * or {@link UiSelector#fromParent(UiSelector)} are used once or more in the construction of
     * a selector.
     * @return last By selector in chain
     */
    private UiSelector getLastSubSelector() {
        if(mSelectorAttributes.indexOfKey(UiSelector.SELECTOR_CHILD) >= 0) {
            UiSelector child = (UiSelector)mSelectorAttributes.get(UiSelector.SELECTOR_CHILD);
            if(child.getLastSubSelector() == null) {
                return child;
            }
            return child.getLastSubSelector();
        } else if(mSelectorAttributes.indexOfKey(UiSelector.SELECTOR_PARENT) >= 0) {
            UiSelector parent = (UiSelector)mSelectorAttributes.get(UiSelector.SELECTOR_PARENT);
            if(parent.getLastSubSelector() == null) {
                return parent;
            }
            return parent.getLastSubSelector();
        }
        return this;
    }

    @Override
    public String toString() {
        return dumpToString(true);
    }

    String dumpToString(boolean all) {
        StringBuilder builder = new StringBuilder();
        builder.append("By[");
        final int criterionCount = mSelectorAttributes.size();
        for (int i = 0; i < criterionCount; i++) {
            if (i > 0) {
                builder.append(", ");
            }
            final int criterion = mSelectorAttributes.keyAt(i);
            switch (criterion) {
            case SELECTOR_TEXT:
                builder.append("TEXT=").append(mSelectorAttributes.valueAt(i));
                break;
            case SELECTOR_START_TEXT:
                builder.append("START_TEXT=").append(mSelectorAttributes.valueAt(i));
                break;
            case SELECTOR_CONTAINS_TEXT:
                builder.append("CONTAINS_TEXT=").append(mSelectorAttributes.valueAt(i));
                break;
            case SELECTOR_CLASS:
                builder.append("CLASS=").append(mSelectorAttributes.valueAt(i));
                break;
            case SELECTOR_DESCRIPTION:
                builder.append("DESCRIPTION=").append(mSelectorAttributes.valueAt(i));
                break;
            case SELECTOR_START_DESCRIPTION:
                builder.append("START_DESCRIPTION=").append(mSelectorAttributes.valueAt(i));
                break;
            case SELECTOR_CONTAINS_DESCRIPTION:
                builder.append("CONTAINS_DESCRIPTION=").append(mSelectorAttributes.valueAt(i));
                break;
            case SELECTOR_INDEX:
                builder.append("INDEX=").append(mSelectorAttributes.valueAt(i));
                break;
            case SELECTOR_INSTANCE:
                builder.append("INSTANCE=").append(mSelectorAttributes.valueAt(i));
                break;
            case SELECTOR_ENABLED:
                builder.append("ENABLED=").append(mSelectorAttributes.valueAt(i));
                break;
            case SELECTOR_FOCUSED:
                builder.append("FOCUSED=").append(mSelectorAttributes.valueAt(i));
                break;
            case SELECTOR_FOCUSABLE:
                builder.append("FOCUSABLE=").append(mSelectorAttributes.valueAt(i));
                break;
            case SELECTOR_SCROLLABLE:
                builder.append("SCROLLABLE=").append(mSelectorAttributes.valueAt(i));
                break;
            case SELECTOR_CLICKABLE:
                builder.append("CLICKABLE=").append(mSelectorAttributes.valueAt(i));
                break;
            case SELECTOR_CHECKED:
                builder.append("CHECKED=").append(mSelectorAttributes.valueAt(i));
                break;
            case SELECTOR_SELECTED:
                builder.append("SELECTED=").append(mSelectorAttributes.valueAt(i));
                break;
            case SELECTOR_ID:
                builder.append("ID=").append(mSelectorAttributes.valueAt(i));
                break;
            case SELECTOR_CHILD:
                if(all)
                    builder.append("CHILD=").append(mSelectorAttributes.valueAt(i));
                else
                    builder.append("CHILD[..]");
                break;
            case SELECTOR_PATTERN:
                if(all)
                    builder.append("PATTERN=").append(mSelectorAttributes.valueAt(i));
                else
                    builder.append("PATTERN[..]");
                break;
            case SELECTOR_CONTAINER:
                if(all)
                    builder.append("CONTAINER=").append(mSelectorAttributes.valueAt(i));
                else
                    builder.append("CONTAINER[..]");
                break;
            case SELECTOR_PARENT:
                if(all)
                    builder.append("PARENT=").append(mSelectorAttributes.valueAt(i));
                else
                    builder.append("PARENT[..]");
                break;
            case SELECTOR_COUNT:
                builder.append("COUNT=").append(mSelectorAttributes.valueAt(i));
                break;
            case SELECTOR_PACKAGE_NAME:
                builder.append("PACKAGE NAME=").append(mSelectorAttributes.valueAt(i));
                break;
            default:
                builder.append("UNDEFINED="+criterion+" ").append(mSelectorAttributes.valueAt(i));
            }
        }
        builder.append("]");
        return builder.toString();
    }
}
