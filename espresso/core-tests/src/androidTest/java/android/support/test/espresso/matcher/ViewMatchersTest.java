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

package android.support.test.espresso.matcher;

import static android.support.test.espresso.matcher.ViewMatchers.assertThat;
import static android.support.test.espresso.matcher.ViewMatchers.hasContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.hasDescendant;
import static android.support.test.espresso.matcher.ViewMatchers.hasImeAction;
import static android.support.test.espresso.matcher.ViewMatchers.hasLinks;
import static android.support.test.espresso.matcher.ViewMatchers.hasSibling;
import static android.support.test.espresso.matcher.ViewMatchers.isAssignableFrom;
import static android.support.test.espresso.matcher.ViewMatchers.isChecked;
import static android.support.test.espresso.matcher.ViewMatchers.isClickable;
import static android.support.test.espresso.matcher.ViewMatchers.isDescendantOfA;
import static android.support.test.espresso.matcher.ViewMatchers.isEnabled;
import static android.support.test.espresso.matcher.ViewMatchers.isFocusable;
import static android.support.test.espresso.matcher.ViewMatchers.isNotChecked;
import static android.support.test.espresso.matcher.ViewMatchers.isRoot;
import static android.support.test.espresso.matcher.ViewMatchers.isSelected;
import static android.support.test.espresso.matcher.ViewMatchers.supportsInputMethods;
import static android.support.test.espresso.matcher.ViewMatchers.withChild;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withEffectiveVisibility;
import static android.support.test.espresso.matcher.ViewMatchers.withHint;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withParent;
import static android.support.test.espresso.matcher.ViewMatchers.withSpinnerText;
import static android.support.test.espresso.matcher.ViewMatchers.withTagKey;
import static android.support.test.espresso.matcher.ViewMatchers.withTagValue;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;

import android.support.test.espresso.matcher.ViewMatchers.Visibility;
import android.support.test.testapp.test.R;
import com.google.common.collect.Lists;

import android.graphics.Color;
import android.test.InstrumentationTestCase;
import android.text.Spannable;
import android.text.style.ForegroundColorSpan;
import android.text.util.Linkify;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Checkable;
import android.widget.CheckedTextView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;

import java.util.List;

/**
 * Unit tests for {@link ViewMatchers}.
 */
public class ViewMatchersTest extends InstrumentationTestCase {
  public void testIsAssignableFrom_notAnInstance() {
    View v = new View(getInstrumentation().getTargetContext());
    assertFalse(isAssignableFrom(Spinner.class).matches(v));
  }

  public void testIsAssignableFrom_plainView() {
    View v = new View(getInstrumentation().getTargetContext());
    assertTrue(isAssignableFrom(View.class).matches(v));
  }

  public void testIsAssignableFrom_superclass() {
    View v = new RadioButton(getInstrumentation().getTargetContext());
    assertTrue(isAssignableFrom(Button.class).matches(v));
  }

  @SuppressWarnings("cast")
  public void testWithContentDescriptionCharSequence() {
    View view = new View(getInstrumentation().getTargetContext());
    view.setContentDescription(null);
    assertTrue(withContentDescription(Matchers.<CharSequence>nullValue()).matches(view));
    CharSequence testText = "test text!";
    view.setContentDescription(testText);
    assertTrue(withContentDescription(is(testText)).matches(view));
    assertFalse(withContentDescription(is((CharSequence) "blah")).matches(view));
    assertFalse(withContentDescription(is((CharSequence) "")).matches(view));
  }

  public void testWithContentDescriptionNull() {
    try {
      withContentDescription((Matcher<CharSequence>) null);
      fail("Should of thrown NPE");
    } catch (NullPointerException e) {
      // Good, this is expected.
    }
  }

  public void testHasContentDescription() {
    View view = new View(getInstrumentation().getTargetContext());
    view.setContentDescription(null);
    assertFalse(hasContentDescription().matches(view));
    CharSequence testText = "test text!";
    view.setContentDescription(testText);
    assertTrue(hasContentDescription().matches(view));
  }

  public void testWithContentDescriptionString() {
    View view = new View(getInstrumentation().getTargetContext());
    view.setContentDescription(null);
    assertTrue(withContentDescription(Matchers.<String>nullValue()).matches(view));
    String testText = "test text!";
    view.setContentDescription(testText);
    assertTrue(withContentDescription(is(testText)).matches(view));
    assertFalse(withContentDescription(is("blah")).matches(view));
    assertFalse(withContentDescription(is("")).matches(view));
  }

  public void testWithId() {
    View view = new View(getInstrumentation().getTargetContext());
    view.setId(R.id.testId1);
    assertTrue(withId(is(R.id.testId1)).matches(view));
    assertFalse(withId(is(R.id.testId2)).matches(view));
    assertFalse(withId(is(1234)).matches(view));
  }

  public void testWithId_describeWithNoResourceLookup() {
    assertThat(withId(5).toString(), is("with id: 5"));
  }

  public void testWithId_describeWithFailedResourceLookup() {
    View view = new View(getInstrumentation().getContext());
    Matcher<View> matcher = withId(5);
    // Running matches will allow withId to grab resources from view Context
    matcher.matches(view);
    assertThat(matcher.toString(), is("with id: 5 (resource name not found)"));
  }

  public void testWithId_describeWithResourceLookup() {
    View view = new View(getInstrumentation().getContext());
    Matcher<View> matcher = withId(R.id.testId1);
    // Running matches will allow withId to grab resources from view Context
    matcher.matches(view);
    assertThat(matcher.toString(), containsString("id/testId1"));
  }

  public void testWithTagNull() {
    try {
      withTagKey(0, null);
      fail("Should of thrown NPE");
    } catch (NullPointerException e) {
      // Good, this is expected.
    }

    try {
      withTagValue(null);
      fail("Should of thrown NPE");
    } catch (NullPointerException e) {
      // Good, this is expected.
    }
  }

  public void testWithTagObject() {
    View view = new View(getInstrumentation().getTargetContext());
    view.setTag(null);
    assertTrue(withTagValue(Matchers.<Object>nullValue()).matches(view));
    String testObjectText = "test text!";
    view.setTag(testObjectText);
    assertFalse(withTagKey(R.id.testId1).matches(view));
    assertTrue(withTagValue(is((Object) testObjectText)).matches(view));
    assertFalse(withTagValue(is((Object) "blah")).matches(view));
    assertFalse(withTagValue(is((Object) "")).matches(view));
  }

  public void testWithTagKey() {
    View view = new View(getInstrumentation().getTargetContext());
    assertFalse(withTagKey(R.id.testId1).matches(view));
    view.setTag(R.id.testId1, "blah");
    assertFalse(withTagValue(is((Object) "blah")).matches(view));
    assertTrue(withTagKey(R.id.testId1).matches(view));
    assertFalse(withTagKey(R.id.testId2).matches(view));
    assertFalse(withTagKey(R.id.testId3).matches(view));
    assertFalse(withTagKey(65535).matches(view));

    view.setTag(R.id.testId2, "blah2");
    assertTrue(withTagKey(R.id.testId1).matches(view));
    assertTrue(withTagKey(R.id.testId2).matches(view));
    assertFalse(withTagKey(R.id.testId3).matches(view));
    assertFalse(withTagKey(65535).matches(view));
    assertFalse(withTagValue(is((Object) "blah")).matches(view));
  }

  public void testWithTagKeyObject() {
    View view = new View(getInstrumentation().getTargetContext());
    String testObjectText1 = "test text1!";
    String testObjectText2 = "test text2!";
    assertFalse(withTagKey(R.id.testId1, is((Object) testObjectText1)).matches(view));
    view.setTag(R.id.testId1, testObjectText1);
    assertTrue(withTagKey(R.id.testId1, is((Object) testObjectText1)).matches(view));
    assertFalse(withTagKey(R.id.testId1, is((Object) testObjectText2)).matches(view));
    assertFalse(withTagKey(R.id.testId2, is((Object) testObjectText1)).matches(view));
    assertFalse(withTagKey(R.id.testId3, is((Object) testObjectText1)).matches(view));
    assertFalse(withTagKey(65535, is((Object) testObjectText1)).matches(view));
    assertFalse(withTagValue(is((Object) "blah")).matches(view));

    view.setTag(R.id.testId2, testObjectText2);
    assertTrue(withTagKey(R.id.testId1, is((Object) testObjectText1)).matches(view));
    assertFalse(withTagKey(R.id.testId1, is((Object) testObjectText2)).matches(view));
    assertTrue(withTagKey(R.id.testId2, is((Object) testObjectText2)).matches(view));
    assertFalse(withTagKey(R.id.testId2, is((Object) testObjectText1)).matches(view));
    assertFalse(withTagKey(R.id.testId3, is((Object) testObjectText1)).matches(view));
    assertFalse(withTagKey(65535, is((Object) testObjectText1)).matches(view));
    assertFalse(withTagValue(is((Object) "blah")).matches(view));
  }

  public void testWithTextNull() {
    try {
      withText((Matcher<String>) null);
      fail("Should of thrown NPE");
    } catch (NullPointerException e) {
      // Good, this is expected.
    }
  }

  public void testCheckBoxMatchers() {
    assertFalse(isChecked().matches(new Spinner(getInstrumentation().getTargetContext())));
    assertFalse(isNotChecked().matches(new Spinner(getInstrumentation().getTargetContext())));

    CheckBox checkBox = new CheckBox(getInstrumentation().getTargetContext());
    checkBox.setChecked(true);
    assertTrue(isChecked().matches(checkBox));
    assertFalse(isNotChecked().matches(checkBox));

    checkBox.setChecked(false);
    assertFalse(isChecked().matches(checkBox));
    assertTrue(isNotChecked().matches(checkBox));

    RadioButton radioButton = new RadioButton(getInstrumentation().getTargetContext());
    radioButton.setChecked(false);
    assertFalse(isChecked().matches(radioButton));
    assertTrue(isNotChecked().matches(radioButton));

    radioButton.setChecked(true);
    assertTrue(isChecked().matches(radioButton));
    assertFalse(isNotChecked().matches(radioButton));

    CheckedTextView checkedText = new CheckedTextView(getInstrumentation().getTargetContext());
    checkedText.setChecked(false);
    assertFalse(isChecked().matches(checkedText));
    assertTrue(isNotChecked().matches(checkedText));

    checkedText.setChecked(true);
    assertTrue(isChecked().matches(checkedText));
    assertFalse(isNotChecked().matches(checkedText));

    Checkable checkable = new Checkable() {
      @Override
      public boolean isChecked() { return true; }
      @Override
      public void setChecked(boolean ignored) {}
      @Override
      public void toggle() {}
    };

    assertFalse(isChecked().matches(checkable));
    assertFalse(isNotChecked().matches(checkable));
  }

  public void testWithTextString() {
    TextView textView = new TextView(getInstrumentation().getTargetContext());
    textView.setText(null);
    assertTrue(withText(is("")).matches(textView));
    String testText = "test text!";
    textView.setText(testText);
    assertTrue(withText(is(testText)).matches(textView));
    assertFalse(withText(is("blah")).matches(textView));
    assertFalse(withText(is("")).matches(textView));
  }

  public void testHasDescendant() {
    View v = new TextView(getInstrumentation().getTargetContext());
    ViewGroup parent = new RelativeLayout(getInstrumentation().getTargetContext());
    ViewGroup grany = new ScrollView(getInstrumentation().getTargetContext());
    grany.addView(parent);
    parent.addView(v);
    assertTrue(hasDescendant(isAssignableFrom(TextView.class)).matches(grany));
    assertTrue(hasDescendant(isAssignableFrom(TextView.class)).matches(parent));
    assertFalse(hasDescendant(isAssignableFrom(ScrollView.class)).matches(parent));
    assertFalse(hasDescendant(isAssignableFrom(TextView.class)).matches(v));
  }

  public void testIsDescendantOfA() {
    View v = new TextView(getInstrumentation().getTargetContext());
    ViewGroup parent = new RelativeLayout(getInstrumentation().getTargetContext());
    ViewGroup grany = new ScrollView(getInstrumentation().getTargetContext());
    grany.addView(parent);
    parent.addView(v);
    assertTrue(isDescendantOfA(isAssignableFrom(RelativeLayout.class)).matches(v));
    assertTrue(isDescendantOfA(isAssignableFrom(ScrollView.class)).matches(v));
    assertFalse(isDescendantOfA(isAssignableFrom(LinearLayout.class)).matches(v));
  }

  public void testIsVisible() {
    View visible = new View(getInstrumentation().getTargetContext());
    visible.setVisibility(View.VISIBLE);
    View invisible = new View(getInstrumentation().getTargetContext());
    invisible.setVisibility(View.INVISIBLE);
    assertTrue(withEffectiveVisibility(Visibility.VISIBLE).matches(visible));
    assertFalse(withEffectiveVisibility(Visibility.VISIBLE).matches(invisible));

    // Make the visible view invisible by giving it an invisible parent.
    ViewGroup parent = new RelativeLayout(getInstrumentation().getTargetContext());
    parent.addView(visible);
    parent.setVisibility(View.INVISIBLE);
    assertFalse(withEffectiveVisibility(Visibility.VISIBLE).matches(visible));
  }

  public void testIsInvisible() {
    View visible = new View(getInstrumentation().getTargetContext());
    visible.setVisibility(View.VISIBLE);
    View invisible = new View(getInstrumentation().getTargetContext());
    invisible.setVisibility(View.INVISIBLE);
    assertFalse(withEffectiveVisibility(Visibility.INVISIBLE).matches(visible));
    assertTrue(withEffectiveVisibility(Visibility.INVISIBLE).matches(invisible));

    // Make the visible view invisible by giving it an invisible parent.
    ViewGroup parent = new RelativeLayout(getInstrumentation().getTargetContext());
    parent.addView(visible);
    parent.setVisibility(View.INVISIBLE);
    assertTrue(withEffectiveVisibility(Visibility.INVISIBLE).matches(visible));
  }

  public void testIsGone() {
    View gone = new View(getInstrumentation().getTargetContext());
    gone.setVisibility(View.GONE);
    View visible = new View(getInstrumentation().getTargetContext());
    visible.setVisibility(View.VISIBLE);
    assertFalse(withEffectiveVisibility(Visibility.GONE).matches(visible));
    assertTrue(withEffectiveVisibility(Visibility.GONE).matches(gone));

    // Make the gone view gone by giving it a gone parent.
    ViewGroup parent = new RelativeLayout(getInstrumentation().getTargetContext());
    parent.addView(visible);
    parent.setVisibility(View.GONE);
    assertTrue(withEffectiveVisibility(Visibility.GONE).matches(visible));
  }

  public void testIsClickable() {
    View clickable = new View(getInstrumentation().getTargetContext());
    clickable.setClickable(true);
    View notClickable = new View(getInstrumentation().getTargetContext());
    notClickable.setClickable(false);
    assertTrue(isClickable().matches(clickable));
    assertFalse(isClickable().matches(notClickable));
  }

  public void testIsEnabled() {
    View enabled = new View(getInstrumentation().getTargetContext());
    enabled.setEnabled(true);
    View notEnabled = new View(getInstrumentation().getTargetContext());
    notEnabled.setEnabled(false);
    assertTrue(isEnabled().matches(enabled));
    assertFalse(isEnabled().matches(notEnabled));
  }

  public void testIsFocusable() {
    View focusable = new View(getInstrumentation().getTargetContext());
    focusable.setFocusable(true);
    View notFocusable = new View(getInstrumentation().getTargetContext());
    notFocusable.setFocusable(false);
    assertTrue(isFocusable().matches(focusable));
    assertFalse(isFocusable().matches(notFocusable));
  }

  public void testIsSelected() {
    View selected = new View(getInstrumentation().getTargetContext());
    selected.setSelected(true);
    View notSelected = new View(getInstrumentation().getTargetContext());
    notSelected.setSelected(false);
    assertTrue(isSelected().matches(selected));
    assertFalse(isSelected().matches(notSelected));
  }

  public void testWithTextResourceId() {
    TextView textView = new TextView(getInstrumentation().getTargetContext());
    textView.setText(R.string.something);
    assertTrue(withText(R.string.something).matches(textView));
    assertFalse(withText(R.string.other_string).matches(textView));
  }

  public void testWithTextResourceId_charSequence() {
    TextView textView = new TextView(getInstrumentation().getTargetContext());
    String expectedText = getInstrumentation().getTargetContext()
        .getResources().getString(R.string.something);
    Spannable textSpan = Spannable.Factory.getInstance().newSpannable(expectedText);
    textSpan.setSpan(new ForegroundColorSpan(Color.RED), 0, expectedText.length() - 1, 0);
    textView.setText(textSpan);
    assertTrue(withText(R.string.something).matches(textView));
    assertFalse(withText(R.string.other_string).matches(textView));
  }

  public void testWithHintString() {
    TextView textView = new TextView(getInstrumentation().getTargetContext());
    textView.setHint(null);
    assertFalse(withHint(is("")).matches(textView));
    String testText = "test text!";
    textView.setHint(testText);
    assertTrue(withHint(is(testText)).matches(textView));
    assertFalse(withHint(is("blah")).matches(textView));
  }

  public void testWithHintResourceId() {
    TextView textView = new TextView(getInstrumentation().getTargetContext());
    textView.setHint(R.string.something);
    assertTrue(withHint(R.string.something).matches(textView));
    assertFalse(withHint(R.string.other_string).matches(textView));
    // test the case of resource is not found, espresso should not crash
    assertFalse(withHint(R.string.other_string + 100).matches(textView));
  }


  public void testWithHintResourceId_charSequence() {
    TextView textView = new TextView(getInstrumentation().getTargetContext());
    String expectedText = getInstrumentation().getTargetContext()
        .getResources().getString(R.string.something);
    Spannable textSpan = Spannable.Factory.getInstance().newSpannable(expectedText);
    textSpan.setSpan(new ForegroundColorSpan(Color.RED), 0, expectedText.length() - 1, 0);
    textView.setHint(textSpan);
    assertTrue(withHint(R.string.something).matches(textView));
    assertFalse(withHint(R.string.other_string).matches(textView));
  }

  public void testWithParent() {
    View view1 = new TextView(getInstrumentation().getTargetContext());
    View view2 = new TextView(getInstrumentation().getTargetContext());
    View view3 = new TextView(getInstrumentation().getTargetContext());
    ViewGroup tiptop = new RelativeLayout(getInstrumentation().getTargetContext());
    ViewGroup secondLevel = new RelativeLayout(getInstrumentation().getTargetContext());
    secondLevel.addView(view2);
    secondLevel.addView(view3);
    tiptop.addView(secondLevel);
    tiptop.addView(view1);
    assertTrue(withParent(is((View) tiptop)).matches(view1));
    assertTrue(withParent(is((View) tiptop)).matches(secondLevel));
    assertFalse(withParent(is((View) tiptop)).matches(view2));
    assertFalse(withParent(is((View) tiptop)).matches(view3));
    assertFalse(withParent(is((View) secondLevel)).matches(view1));

    assertTrue(withParent(is((View) secondLevel)).matches(view2));
    assertTrue(withParent(is((View) secondLevel)).matches(view3));

    assertFalse(withParent(is(view3)).matches(view3));
  }

  public void testWithChild() {
    View view1 = new TextView(getInstrumentation().getTargetContext());
    View view2 = new TextView(getInstrumentation().getTargetContext());
    View view3 = new TextView(getInstrumentation().getTargetContext());
    ViewGroup tiptop = new RelativeLayout(getInstrumentation().getTargetContext());
    ViewGroup secondLevel = new RelativeLayout(getInstrumentation().getTargetContext());
    secondLevel.addView(view2);
    secondLevel.addView(view3);
    tiptop.addView(secondLevel);
    tiptop.addView(view1);
    assertTrue(withChild(is(view1)).matches(tiptop));
    assertTrue(withChild(is((View) secondLevel)).matches(tiptop));
    assertFalse(withChild(is((View) tiptop)).matches(view1));
    assertFalse(withChild(is(view2)).matches(tiptop));
    assertFalse(withChild(is(view1)).matches(secondLevel));

    assertTrue(withChild(is(view2)).matches(secondLevel));

    assertFalse(withChild(is(view3)).matches(view3));
  }

  public void testIsRootView() {
    ViewGroup rootView = new ViewGroup(getInstrumentation().getTargetContext()) {
      @Override
      protected void onLayout(boolean changed, int l, int t, int r, int b) {
      }
    };

    View view = new View(getInstrumentation().getTargetContext());
    rootView.addView(view);

    assertTrue(isRoot().matches(rootView));
    assertFalse(isRoot().matches(view));
  }

  public void testHasSibling() {
    TextView v1 = new TextView(getInstrumentation().getTargetContext());
    v1.setText("Bill Odama");
    Button v2 = new Button(getInstrumentation().getTargetContext());
    View v3 = new View(getInstrumentation().getTargetContext());
    ViewGroup parent = new LinearLayout(getInstrumentation().getTargetContext());
    parent.addView(v1);
    parent.addView(v2);
    parent.addView(v3);
    assertTrue(hasSibling(withText("Bill Odama")).matches(v2));
    assertFalse(hasSibling(is(v3)).matches(parent));
  }

  public void testHasImeAction() {
    EditText editText = new EditText(getInstrumentation().getTargetContext());
    assertFalse(hasImeAction(EditorInfo.IME_ACTION_GO).matches(editText));
    editText.setImeOptions(EditorInfo.IME_ACTION_NEXT);
    assertFalse(hasImeAction(EditorInfo.IME_ACTION_GO).matches(editText));
    assertTrue(hasImeAction(EditorInfo.IME_ACTION_NEXT).matches(editText));
  }

  public void testHasImeActionNoInputConnection() {
    Button button = new Button(getInstrumentation().getTargetContext());
    assertFalse(hasImeAction(0).matches(button));
  }

  public void testSupportsInputMethods() {
    Button button = new Button(getInstrumentation().getTargetContext());
    EditText editText = new EditText(getInstrumentation().getTargetContext());
    assertFalse(supportsInputMethods().matches(button));
    assertTrue(supportsInputMethods().matches(editText));
  }

  public void testHasLinks() {
    TextView viewWithLinks = new TextView(getInstrumentation().getTargetContext());
    viewWithLinks.setText("Here is a www.google.com link");
    Linkify.addLinks(viewWithLinks, Linkify.ALL);
    assertTrue(hasLinks().matches(viewWithLinks));

    TextView viewWithNoLinks = new TextView(getInstrumentation().getTargetContext());
    viewWithNoLinks.setText("Here is an unlikified www.google.com");
    assertFalse(hasLinks().matches(viewWithNoLinks));
  }

  public void testWithSpinnerTextResourceId() {
    Spinner spinner = new Spinner(this.getInstrumentation().getTargetContext());
    List<String> values = Lists.newArrayList();
    values.add(this.getInstrumentation().getTargetContext().getString(R.string.something));
    values.add(this.getInstrumentation().getTargetContext().getString(R.string.other_string));
    ArrayAdapter<String> adapter = new ArrayAdapter<String>(
        this.getInstrumentation().getTargetContext(),
        android.R.layout.simple_spinner_item,
        values);
    spinner.setAdapter(adapter);
    spinner.setSelection(0);
    assertTrue(withSpinnerText(R.string.something).matches(spinner));
    assertFalse(withSpinnerText(R.string.other_string).matches(spinner));
  }

  public void testWithSpinnerTextString() {
    Spinner spinner = new Spinner(this.getInstrumentation().getTargetContext());
    List<String> values = Lists.newArrayList();
    values.add("Hello World");
    values.add("Goodbye!!");
    ArrayAdapter<String> adapter = new ArrayAdapter<String>(
        this.getInstrumentation().getTargetContext(),
        android.R.layout.simple_spinner_item,
        values);
    spinner.setAdapter(adapter);
    spinner.setSelection(0);
    spinner.setTag("spinner");
    assertTrue(withSpinnerText(is("Hello World")).matches(spinner));
    assertFalse(withSpinnerText(is("Goodbye!!")).matches(spinner));
    assertFalse(withSpinnerText(is("")).matches(spinner));
  }

  public void testWithSpinnerTextNull() {
    try {
      withSpinnerText((Matcher<String>) null);
      fail("Should of thrown NPE");
    } catch (NullPointerException e) {
      // Good, this is expected.
    }
  }
}
