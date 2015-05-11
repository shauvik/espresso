/*
 * Copyright (C) 2015 The Android Open Source Project
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

package android.support.test.espresso.web.webdriver;

import static android.support.test.espresso.web.model.Atoms.castOrDie;
import static com.google.common.base.Preconditions.checkNotNull;

import android.support.test.espresso.web.model.Atom;
import android.support.test.espresso.web.model.ElementReference;
import android.support.test.espresso.web.model.Evaluation;
import android.support.test.espresso.web.model.SimpleAtom;
import android.support.test.espresso.web.model.TransformingAtom;
import android.support.test.espresso.web.model.WindowReference;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import java.util.List;
import java.util.Map;

/**
 * A collection of Javascript Atoms from the WebDriver project.
 */
public final class DriverAtoms {

  private DriverAtoms() {}


  /**
   * Simulates the javascript events to click on a particular element.
   */
  public static Atom<Evaluation> webClick() {
    return new SimpleAtom(WebDriverAtomScripts.CLICK_ANDROID) {
      @Override
      public void handleNoElementReference() {
        throw new RuntimeException("webClick: Need an element to click on!");
      }
    };
  }

  /**
   * Clears content from an editable element.
   */
  public static Atom<Evaluation> clearElement() {
    return new SimpleAtom(WebDriverAtomScripts.CLEAR_ANDROID) {
      @Override
      public void handleNoElementReference() {
        throw new RuntimeException("clearElement: Need an element to clear!");
      }
    };
  }

  /**
   * Simulates javascript key events sent to a certain element.
   */
  public static Atom<Evaluation> webKeys(final String text) {
    checkNotNull(text);
    return new SimpleAtom(WebDriverAtomScripts.SEND_KEYS_ANDROID) {
      @Override
      public void handleNoElementReference() {
        throw new RuntimeException("webKeys: Need an element to type on!");
      }

      @Override
      public List<Object> getNonContextualArguments() {
        return Lists.newArrayList((Object) text);
      }
    };
  }

  /**
   * Finds an element using the provided locator strategy.
   */
  public static Atom<ElementReference> findElement(final Locator locator, final String value) {
    final Map<String, String> locatorJson = makeLocatorJSON(locator, value);
    SimpleAtom atom =
        new SimpleAtom(WebDriverAtomScripts.FIND_ELEMENT_ANDROID,
            SimpleAtom.ElementReferencePlacement.LAST) {
          @Override
          public List<Object> getNonContextualArguments() {
            return Lists.newArrayList((Object) locatorJson);
          }
        };

    return new TransformingAtom<Evaluation, ElementReference>(atom,
        castOrDie(ElementReference.class));
  }

  /**
   * Finds the currently active element in the document.
   */
  public static Atom<ElementReference> selectActiveElement() {
    SimpleAtom atom = new SimpleAtom(WebDriverAtomScripts.ACTIVE_ELEMENT_ANDROID);

    return new TransformingAtom<Evaluation, ElementReference>(atom,
        castOrDie(ElementReference.class));
  }


  /**
   * Selects a subframe of the currently selected window by it's index.
   */
  public static Atom<WindowReference> selectFrameByIndex(int index) {
    return internalFrameByIndex(index, null);
  }

  /**
   * Selects a subframe of the given window by it's index.
   */
  public static Atom<WindowReference> selectFrameByIndex(int index, WindowReference root) {
    checkNotNull(root);
    return internalFrameByIndex(index, root);
  }

  private static Atom<WindowReference> internalFrameByIndex(final int index,
      final WindowReference optRoot) {
    SimpleAtom atom =
        new SimpleAtom(WebDriverAtomScripts.FRAME_BY_INDEX_ANDROID) {
          @Override
          public List<Object> getNonContextualArguments() {
            List<Object> args = Lists.newArrayList((Object) index);
            if (null != optRoot) {
              args.add(optRoot);
            }
            return args;
          }
        };

    return new TransformingAtom<Evaluation, WindowReference>(atom,
        castOrDie(WindowReference.class));
  }

  /**
   * Selects a subframe of the given window by it's name or id.
   */
  public static Atom<WindowReference> selectFrameByIdOrName(String idOrName, WindowReference root) {
    checkNotNull(idOrName);
    checkNotNull(root);
    return internalFrameByIdOrName(idOrName, root);
  }

  /**
   * Selects a subframe of the current window by it's name or id.
   */
  public static Atom<WindowReference> selectFrameByIdOrName(String idOrName) {
    checkNotNull(idOrName);
    return internalFrameByIdOrName(idOrName, null);
  }

  private static Atom<WindowReference> internalFrameByIdOrName(final String idOrName,
      final WindowReference optRoot) {
    SimpleAtom atom =
        new SimpleAtom(WebDriverAtomScripts.FRAME_BY_ID_OR_NAME_ANDROID) {
          @Override
          public List<Object> getNonContextualArguments() {
            List<Object> args = Lists.newArrayList((Object) idOrName);
            if (null != optRoot) {
              args.add(optRoot);
            }
            return args;
          }
        };

    return new TransformingAtom<Evaluation, WindowReference>(atom,
        castOrDie(WindowReference.class));
  }


  /**
   * Returns the visible text beneath a given DOM element.
   */
  public static Atom<String> getText() {
    return new TransformingAtom(new SimpleAtom(WebDriverAtomScripts.GET_VISIBLE_TEXT_ANDROID),
        castOrDie(String.class));
  }


  /**
   * Finds multiple elements given a locator strategy.
   */
  public static Atom<List<ElementReference>> findMultipleElements(final Locator locator,
      final String value) {
    final Map<String, String> locatorJson = makeLocatorJSON(locator, value);
    SimpleAtom atom =
        new SimpleAtom(WebDriverAtomScripts.FIND_ELEMENTS_ANDROID,
            SimpleAtom.ElementReferencePlacement.LAST) {
          @Override
          public List<Object> getNonContextualArguments() {
            return Lists.newArrayList((Object) locatorJson);
          }
        };

    return new TransformingAtom<Evaluation, List<ElementReference>>(atom,
        new TransformingAtom.Transformer<Evaluation, List<ElementReference>>() {
          @Override
          public List<ElementReference> apply(Evaluation e) {
            Object rawValues = e.getValue();
            if (null == rawValues) {
              return Lists.newArrayList();
            }
            if (rawValues instanceof Iterable) {
              List<ElementReference> references = Lists.newArrayList();
              for (Object rawValue : ((Iterable) rawValues)) {
                if (rawValue instanceof ElementReference) {
                  references.add((ElementReference) rawValue);
                } else {
                  throw new RuntimeException(
                      String.format(
                          "Unexpected non-elementReference in findMultipleElements(%s, %s): "
                          + "(%s) all: %s ",
                          locator.name(), value, rawValue, e));
                }
              }
              return references;
            } else {
              throw new RuntimeException(
                  String.format(
                      "Unexpected non-iterableType in findMultipleElements(%s, %s): "
                      + "return evaluation: %s ",
                      locator.name(), value, e));
            }
          }
        });
  }

  private static Map<String, String> makeLocatorJSON(Locator locator, String value) {
    checkNotNull(locator);
    checkNotNull(value);
    Map<String, String> map = Maps.newHashMap();
    map.put(locator.getType(), value);
    return map;
  }

}
