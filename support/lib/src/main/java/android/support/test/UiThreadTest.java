/*
 * Copyright (C) 2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package android.support.test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This annotation should be used along with {@link android.support.test.rules.UiThreadTestRule} or
 * with any rule that inherits from it. When the annotation is present, the test method is executed
 * on the application's UI thread (or main thread).
 * <p/>
 * Note, due to current JUnit limitation, methods annotated with {@link org.junit.Before} and
 * {@link org.junit.After} will also be executed on the UI Thread. Consider using
 * {@link android.support.test.rules.UiThreadTestRule#runTestOnUiThread(Runnable)} if this is an
 * issue.
 *
 * @see android.support.test.rules.UiThreadTestRule#runTestOnUiThread(Runnable)
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface UiThreadTest {
}