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

package android.support.test.rules;

import android.support.test.UiThreadTest;
import android.support.test.internal.runner.junit4.statements.UiThreadStatement;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

import java.util.concurrent.atomic.AtomicReference;

import static android.support.test.InstrumentationRegistry.getInstrumentation;

/**
 * This rule allows the test method annotated with {@link UiThreadTest} to execute on the
 * application's main thread (or UI thread).
 * <p/>
 * Note, methods annotated with {@link org.junit.Before} and {@link org.junit.After} will also be
 * executed on the UI thread.
 *
 * @see android.support.test.UiThreadTest
 */
public class UiThreadTestRule implements TestRule {

    @Override
    public Statement apply(final Statement base, Description description) {
        return new UiThreadStatement(base, shouldRunOnUiThread(description));
    }

    protected boolean shouldRunOnUiThread(Description description) {
        return description.getAnnotation(UiThreadTest.class) != null;
    }

    /**
     * Helper for running portions of a test on the UI thread.
     * <p/>
     * Note, in most cases it is simpler to annotate the test method with
     * {@link UiThreadTest}, which will run the entire test method including methods annotated with
     * {@link org.junit.Before} and {@link org.junit.After} on the UI thread.
     * <p/>
     * Use this method if you need to switch in and out of the UI thread to perform your test.
     *
     * @param runnable runnable containing test code in the {@link Runnable#run()} method
     *
     * @see android.support.test.UiThreadTest
     */
    public void runTestOnUiThread(final Runnable runnable) throws Throwable {
        final AtomicReference<Throwable> exceptionRef = new AtomicReference<>();
        getInstrumentation().runOnMainSync(new Runnable() {
            public void run() {
                try {
                    runnable.run();
                } catch (Throwable throwable) {
                    exceptionRef.set(throwable);
                }
            }
        });

        Throwable throwable = exceptionRef.get();
        if (throwable != null) {
            throw throwable;
        }
    }
}
