/*
 * Copyright (C) 2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package android.support.test.espresso.action;

import static com.google.common.base.Preconditions.checkNotNull;
import static org.hamcrest.Matchers.any;
import static org.hamcrest.Matchers.is;

import android.support.test.espresso.ViewAction;

import android.net.Uri;
import android.view.KeyEvent;

import org.hamcrest.Matcher;

import javax.annotation.Nonnull;

/**
 * A collection of common {@link ViewActions}.
 */
public final class ViewActions {

  private ViewActions() {}

  /**
   * The distance of a swipe's start position from the view's edge, in terms of the view's length.
   * We do not start the swipe exactly on the view's edge, but somewhat more inward, since swiping
   * from the exact edge may behave in an unexpected way (e.g. may open a navigation drawer).
   */
  private static final float EDGE_FUZZ_FACTOR = 0.083f;

  /**
   * Returns an action that clears text on the view.<br>
   * <br>
   * View constraints:
   * <ul>
   * <li>must be displayed on screen
   * <ul>
   */
  public static ViewAction clearText() {
    return new ReplaceTextAction("");
  }

  /**
   * Returns an action that clicks the view.<br>
   * <br>
   * View constraints:
   * <ul>
   * <li>must be displayed on screen
   * <ul>
   */
  public static ViewAction click() {
    return new GeneralClickAction(Tap.SINGLE, GeneralLocation.VISIBLE_CENTER, Press.FINGER);
  }

  /**
   * Returns an action that performs a single click on the view.
   *
   * If the click takes longer than the 'long press' duration (which is possible) the provided
   * rollback action is invoked on the view and a click is attempted again.
   *
   * This is only necessary if the view being clicked on has some different behaviour for long press
   * versus a normal tap.
   *
   * For example - if a long press on a particular view element opens a popup menu -
   * ViewActions.pressBack() may be an acceptable rollback action.
   *
   * <br>
   * View constraints:
   * <ul>
   * <li>must be displayed on screen</li>
   * <li>any constraints of the rollbackAction</li>
   * <ul>
   */
  public static ViewAction click(ViewAction rollbackAction) {
    checkNotNull(rollbackAction);
    return new GeneralClickAction(Tap.SINGLE, GeneralLocation.CENTER, Press.FINGER,
        rollbackAction);
  }

  /**
   * Returns an action that performs a swipe right-to-left across the vertical center of the
   * view. The swipe doesn't start at the very edge of the view, but is a bit offset.<br>
   * <br>
   * View constraints:
   * <ul>
   * <li>must be displayed on screen
   * <ul>
   */
  public static ViewAction swipeLeft() {
    return new GeneralSwipeAction(Swipe.FAST,
        GeneralLocation.translate(GeneralLocation.CENTER_RIGHT, -EDGE_FUZZ_FACTOR, 0),
        GeneralLocation.CENTER_LEFT, Press.FINGER);
  }

  /**
   * Returns an action that performs a swipe left-to-right across the vertical center of the
   * view. The swipe doesn't start at the very edge of the view, but is a bit offset.<br>
   * <br>
   * View constraints:
   * <ul>
   * <li>must be displayed on screen
   * <ul>
   */
  public static ViewAction swipeRight() {
    return new GeneralSwipeAction(Swipe.FAST,
        GeneralLocation.translate(GeneralLocation.CENTER_LEFT, EDGE_FUZZ_FACTOR, 0),
        GeneralLocation.CENTER_RIGHT, Press.FINGER);
  }

  /**
   * Returns an action that performs a swipe top-to-bottom across the horizontal center of the view.
   * The swipe doesn't start at the very edge of the view, but has a bit of offset.<br>
   * <br>
   * View constraints:
   * <ul>
   * <li>must be displayed on screen
   * <ul>
   */
  public static ViewAction swipeDown() {
    return new GeneralSwipeAction(Swipe.FAST,
        GeneralLocation.translate(GeneralLocation.TOP_CENTER, 0, EDGE_FUZZ_FACTOR),
        GeneralLocation.BOTTOM_CENTER, Press.FINGER);
  }

  /**
   * Returns an action that performs a swipe bottom-to-top across the horizontal center of the view.
   * The swipe doesn't start at the very edge of the view, but has a bit of offset.<br>
   * <br>
   * View constraints:
   * <ul>
   * <li>must be displayed on screen
   * <ul>
   */
  public static ViewAction swipeUp() {
    return new GeneralSwipeAction(Swipe.FAST,
        GeneralLocation.translate(GeneralLocation.BOTTOM_CENTER, 0, -EDGE_FUZZ_FACTOR),
        GeneralLocation.TOP_CENTER, Press.FINGER);
  }

  /**
   * Returns an action that closes soft keyboard. If the keyboard is already closed, it is a no-op.
   */
  public static ViewAction closeSoftKeyboard() {
    return new CloseKeyboardAction();
  }

  /**
   * Returns an action that presses the current action button (next, done, search, etc) on the IME
   * (Input Method Editor). The selected view will have its onEditorAction method called.
   */
  public static ViewAction pressImeActionButton() {
    return new EditorAction();
  }

  /**
   * Returns an action that clicks the back button.
   */
  public static ViewAction pressBack() {
    return pressKey(KeyEvent.KEYCODE_BACK);
  }

  /**
   * Returns an action that presses the hardware menu key.
   */
  public static ViewAction pressMenuKey() {
    return pressKey(KeyEvent.KEYCODE_MENU);
  }

  /**
   * Returns an action that presses the key specified by the keyCode (eg. Keyevent.KEYCODE_BACK).
   */
  public static ViewAction pressKey(int keyCode) {
    return new KeyEventAction(new EspressoKey.Builder().withKeyCode(keyCode).build());
  }

  /**
   * Returns an action that presses the specified key with the specified modifiers.
   */
  public static ViewAction pressKey(EspressoKey key) {
    return new KeyEventAction(key);
  }

  /**
   * Returns an action that double clicks the view.<br>
   * <br>
   * View preconditions:
   * <ul>
   * <li>must be displayed on screen
   * <ul>
   */
  public static ViewAction doubleClick() {
    return new GeneralClickAction(Tap.DOUBLE, GeneralLocation.CENTER, Press.FINGER);
  }

  /**
   * Returns an action that long clicks the view.<br>
   *
   * <br>
   * View preconditions:
   * <ul>
   * <li>must be displayed on screen
   * <ul>
   */
  public static ViewAction longClick() {
    return new GeneralClickAction(Tap.LONG, GeneralLocation.CENTER, Press.FINGER);
  }

  /**
   * Returns an action that scrolls to the view.<br>
   * <br>
   * View preconditions:
   * <ul>
   * <li>must be a descendant of ScrollView
   * <li>must have visibility set to View.VISIBLE
   * <ul>
   */
  public static ViewAction scrollTo() {
    return new ScrollToAction();
  }

  /**
   * Returns an action that types the provided string into the view.
   * Appending a \n to the end of the string translates to a ENTER key event. Note: this method
   * does not change cursor position in the focused view - text is inserted at the location where
   * the cursor is currently pointed.<br>
   * <br>
   * View preconditions:
   * <ul>
   * <li>must be displayed on screen
   * <li>must support input methods
   * <li>must be already focused
   * <ul>
   */
  public static ViewAction typeTextIntoFocusedView(String stringToBeTyped) {
    return new TypeTextAction(stringToBeTyped, false /* tapToFocus */);
  }

  /**
   * Returns an action that selects the view (by clicking on it) and types the provided string into
   * the view. Appending a \n to the end of the string translates to a ENTER key event. Note: this
   * method performs a tap on the view before typing to force the view into focus, if the view
   * already contains text this tap may place the cursor at an arbitrary position within the text.
   * <br>
   * <br>
   * View preconditions:
   * <ul>
   * <li>must be displayed on screen
   * <li>must support input methods
   * <ul>
   */
  public static ViewAction typeText(String stringToBeTyped) {
    return new TypeTextAction(stringToBeTyped);
  }

  /**
   * Returns an action that updates the text attribute of a view.
   * <br>
   * <br>
   * View preconditions:
   * <ul>
   * <li>must be displayed on screen
   * <li>must be assignable from EditText
   * <ul>
   */
  public static ViewAction replaceText(@Nonnull String stringToBeSet) {
    return new ReplaceTextAction(stringToBeSet);
  }

  /**
   * Same as {@code openLinkWithText(Matcher<String> linkTextMatcher)}, but uses
   * {@code is(linkText)} as the linkTextMatcher.
   */
  public static ViewAction openLinkWithText(String linkText) {
    return openLinkWithText(is(linkText));
  }

  /**
   * Same as {@code openLink(Matcher<String> linkTextMatcher, Matcher<Uri> uriMatcher)}, but uses
   * {@code any(Uri.class)} as the uriMatcher.
   */
  public static ViewAction openLinkWithText(Matcher<String> linkTextMatcher) {
    return openLink(linkTextMatcher, any(Uri.class));
  }

  /**
   * Same as {@code openLinkWithUri(Matcher<Uri> uriMatcher)}, but uses {@code is(uri)} as the
   * uriMatcher.
   */
  public static ViewAction openLinkWithUri(String uri) {
    return openLinkWithUri(is(Uri.parse(uri)));
  }

  /**
   * Same as {@code openLink(Matcher<String> linkTextMatcher, Matcher<Uri> uriMatcher)}, but uses
   * {@code any(String.class)} as the linkTextMatcher.
   */
  public static ViewAction openLinkWithUri(Matcher<Uri> uriMatcher) {
    return openLink(any(String.class), uriMatcher);
  }

  /**
   * Returns an action that opens a link matching the given link text and uri matchers. The action
   * is performed by invoking the link's onClick method (as opposed to actually issuing a click on
   * the screen).
   * <br>
   * <br>
   * View preconditions:
   * <ul>
   * <li>must be displayed on screen
   * <li>must be assignable from TextView
   * <li>must have links
   * <ul>
   */
  public static ViewAction openLink(Matcher<String> linkTextMatcher, Matcher<Uri> uriMatcher) {
    checkNotNull(linkTextMatcher);
    checkNotNull(uriMatcher);
    return new OpenLinkAction(linkTextMatcher, uriMatcher);
  }
}
