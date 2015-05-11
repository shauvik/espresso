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

package android.support.test.espresso.web.assertion;

import static com.google.common.base.Preconditions.checkNotNull;

import android.support.test.espresso.NoMatchingViewException;
import android.support.test.espresso.ViewAssertion;
import android.support.test.espresso.web.model.Atom;

import android.view.View;
import android.webkit.WebView;

/**
 * Similar to a ViewAssertion - a WebAssertion allows users to check the results of an atom
 * evaluated against the provided webview.
 *
 * @param <E> The type the specific Atom returns.
 */
public abstract class WebAssertion<E> {
  private final Atom<E> atom;

  public WebAssertion(Atom<E> atom) {
    this.atom = checkNotNull(atom);
  }

  public final Atom<E> getAtom() {
    return atom;
  }

  public final ViewAssertion toViewAssertion(final E result) {
    checkNotNull(result);
    return new ViewAssertion() {
      @Override
      public void check(View v,  NoMatchingViewException noView) {
        if (null == v) {
          throw noView;
        } else if (!(v instanceof WebView)) {
          throw new RuntimeException(v + ": is not a webview!");
        } else {
          checkResult((WebView) v, result);
        }
      }
    };
  }

  /**
   * Extension point to validate a view and atom result on the main thread.
   *
   * @param view the WebView that the Atom was evaluated on.
   * @param result the result of atom evaluation.
   */
  protected abstract void checkResult(WebView view, E result);
}
