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

package android.support.test.espresso.web.model;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.List;

/**
 * Utility class wrapping simple and more commonly used atoms.
 */
public final class Atoms {
  private Atoms() {}

  /**
   * Creates an atom which wraps the input atom and transforms its output using the given
   * transformer.
   */
  public static <I, O> Atom<O> transform(Atom<I> in,
      TransformingAtom.Transformer<I, O> transformer) {
    return new TransformingAtom(in, transformer);
  }

  /**
   * Creates an atom that will execute the provided script and return an object created by the given
   * transformer.
   */
  public static <O> Atom<O> script(String script,
      TransformingAtom.Transformer<Evaluation, O> transformer) {
    return transform(script(script), transformer);
  }

  /**
   * Creates a transformer which will convert an Evaluation to a given type (or die trying).
   */
  public static <E> TransformingAtom.Transformer<Evaluation, E> castOrDie(final Class<E> clazz) {
    checkNotNull(clazz);
    return new TransformingAtom.Transformer<Evaluation, E>() {
      @Override
      public E apply(Evaluation in) {
        if (null == in.getValue()) {
          throw new RuntimeException("Atom evaluation returned null!");
        }

        if (clazz.isInstance(in.getValue())) {
          return clazz.cast(in.getValue());
        }

        throw new RuntimeException(String.format(
            "%s: is not compatible with Evaluation: %s", clazz.getName(),
            in.getValue().getClass().getName()));
      }
    };
  }

  /**
   * Creates an atom that will execute the provided script and return an evaluation object.
   */
  public static Atom<Evaluation> script(String script) {
    return new SimpleAtom(script);
  }

  /**
   * Returns the value of document.location.href.
   */
  public static Atom<String> getCurrentUrl() {
    return script("return document.location.href;", castOrDie(String.class));
  }

  /**
   * Returns the value of document.title.
   */
  public static Atom<String> getTitle() {
    return script("return document.title;", castOrDie(String.class));
  }

  /**
   * Creates an atom that will execute the provided script with the given non-contextual arguments.
   */
  public static Atom<Evaluation> scriptWithArgs(String script, final List<? extends Object> args) {
    checkNotNull(args);
    return new SimpleAtom(script) {
      @Override
      public List<? extends Object> getNonContextualArguments() {
        return args;
      }
    };
  }
}
