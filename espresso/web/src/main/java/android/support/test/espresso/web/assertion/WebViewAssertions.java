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

import static android.support.test.espresso.matcher.ViewMatchers.assertThat;
import static android.support.test.espresso.web.model.Atoms.script;
import static android.support.test.espresso.web.model.Atoms.transform;
import static com.google.common.base.Preconditions.checkNotNull;

import android.support.test.espresso.web.model.Atom;
import android.support.test.espresso.web.model.Evaluation;
import android.support.test.espresso.web.model.TransformingAtom;

import android.webkit.WebView;

import org.hamcrest.Matcher;
import org.hamcrest.StringDescription;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.io.StringWriter;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

/**
 * A collection of {@link WebAssertion}s that assert on {@link WebView}s.
 */
public final class WebViewAssertions {

  private WebViewAssertions() {}

  /**
   * Converts a result to a String.
   * @param <E> The type of the result.
   */
  public interface ResultDescriber<E> {
    public String apply(E input);
  }

  private static final ResultDescriber<Object> TO_STRING_DESCRIBER = new ResultDescriber<Object>() {
    public String apply(Object input) {
      return input.toString();
    }
  };

  /**
   * A WebAssertion which asserts that the given Atom's result is accepted by the provided matcher.
   *
   * @param atom an atom to evaluate on the webview
   * @param resultMatcher a matcher to apply to the result of the atom.
   * @param resultDescriber a describer that converts the result to a string.
   */
  public static <E> WebAssertion<E> webMatches(Atom<E> atom, final Matcher<E> resultMatcher,
      final ResultDescriber<? super E> resultDescriber) {
    checkNotNull(resultMatcher);
    checkNotNull(resultDescriber);
    checkNotNull(atom);
    return new WebAssertion<E>(atom) {
      @Override
      public void checkResult(WebView view, E result) {
        StringDescription description = new StringDescription();
        description.appendText("'");
        resultMatcher.describeTo(description);
        description.appendText("' doesn't match: ");
        description.appendText(null == result ? "null" : resultDescriber.apply(result));
        assertThat(description.toString(), result, resultMatcher);
      }
    };
  }

  /**
   * A WebAssertion which asserts that the given Atom's result is accepted by the provided matcher.
   *
   * @param atom an atom to evaluate on the webview
   * @param resultMatcher a matcher to apply to the result of the atom.
   */
  public static <E> WebAssertion<E> webMatches(Atom<E> atom, final Matcher<E> resultMatcher) {
    return webMatches(atom, resultMatcher, TO_STRING_DESCRIBER);
  }

  /**
   * A WebAssertion which asserts that the document is matched by th provided matcher.
   */
  public static WebAssertion<Document> webContent(final Matcher<Document> domMatcher) {
    checkNotNull(domMatcher);
    return webMatches(transform(script("return document.documentElement.outerHTML;"),
          new TransformingAtom.Transformer<Evaluation, Document>() {
            @Override
            public Document apply(Evaluation eval) {
              if (eval.getValue() instanceof String) {
                try {
                  return TagSoupDocumentParser.newInstance().parse((String) eval.getValue());
                } catch (SAXException se) {
                  throw new RuntimeException("Parse failed: " + eval.getValue(), se);
                } catch (IOException ioe) {
                  throw new RuntimeException("Parse failed: " + eval.getValue(), ioe);
                }
              }
              throw new RuntimeException("Value should have been a string: " + eval);
            }
          }), domMatcher,
        new ResultDescriber<Document>() {
          @Override
          public String apply(Document document) {
            try {
              DOMSource docSource = new DOMSource(document);
              Transformer tf = TransformerFactory.newInstance().newTransformer();
              StringWriter writer = new StringWriter();
              StreamResult streamer = new StreamResult(writer);
              tf.transform(docSource, streamer);
              return writer.toString();
            } catch (TransformerException e) {
              return "Could not transform!!!" + e;
            }
          }
        });
  }
}

