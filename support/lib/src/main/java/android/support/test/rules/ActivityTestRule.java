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

import org.junit.runner.Description;
import org.junit.runners.model.Statement;

import android.app.Activity;
import android.content.Intent;
import android.support.test.annotation.Beta;
import android.support.test.internal.runner.junit4.statements.UiThreadStatement;
import android.util.Log;

import static android.support.test.InstrumentationRegistry.getInstrumentation;

/**
 * This rule provides functional testing of a single activity. The activity under test will be
 * launched before each test annotated with {@link org.junit.Test} and before method annotated with
 * {@link org.junit.Before}. It will be terminated after the test is completed and method annotated
 * with {@link org.junit.After} is finished. During the duration of the test you will be able to
 * manipulate your Activity directly.
 *
 * @param <T> The activity to test
 */
@Beta
public class ActivityTestRule<T extends Activity> extends UiThreadTestRule {

    private static final String LOG_TAG = "ActivityInstrumentationRule";

    private Class<T> mActivityClass;

    private boolean mInitialTouchMode = false;

    private T mActivity;

    /**
     * Creates an {@link ActivityTestRule}
     *
     * @param activityClass The activity to test. This must be a class in the instrumentation
     *                      targetPackage specified in the AndroidManifest.xml
     */
    public ActivityTestRule(Class<T> activityClass) {
        this(activityClass, false);
    }

    /**
     * Creates an {@link ActivityTestRule}
     *
     * @param activityClass    The activity to test. This must be a class in the instrumentation
     *                         targetPackage specified in the AndroidManifest.xml
     * @param initialTouchMode true if the Activity should be placed into "touch mode" when started
     */
    public ActivityTestRule(Class<T> activityClass, boolean initialTouchMode) {
        mActivityClass = activityClass;
        mInitialTouchMode = initialTouchMode;
    }

    /**
     * Override this method to set up Intent as if supplied to
     * {@link android.content.Context#startActivity}.
     * <p>
     * The default Intent (if this method returns null or is not overwritten) is:
     * action = {@link Intent#ACTION_MAIN}
     * flags = {@link Intent#FLAG_ACTIVITY_NEW_TASK}
     * All other intent fields are null or empty.
     *
     * @return The Intent as if supplied to {@link android.content.Context#startActivity}.
     */
    protected Intent getActivityIntent() {
        return new Intent(Intent.ACTION_MAIN);
    }

    /**
     * Overwrite this method to execute any code that should run before your {@link Activity} is
     * launched.
     * This method is called before each test method, including any method annotated with
     * {@link @Before}.
     */
    protected void beforeActivity() {
        // empty by default
    }

    /**
     * Overwrite this method to execute any code that should run after your {@link Activity} is
     * finished.
     * This method is called after each test method, including any method annotated with
     * {@link @After}.
     */
    protected void afterActivity() {
        // empty by default
    }

    /**
     * @return The activity under test.
     */
    public T getActivity() {
        if (mActivity == null) {
            Log.w(LOG_TAG, "Activity wasn't created yet");
        }
        return mActivity;
    }

    @Override
    public Statement apply(final Statement base, Description description) {
        return new ActivityStatement(super.apply(base, description));
    }

    T launchActivity() {
        // set initial touch mode
        getInstrumentation().setInTouchMode(mInitialTouchMode);

        final String targetPackage = getInstrumentation().getTargetContext().getPackageName();
        // inject custom intent, if provided
        Intent intent = getActivityIntent();
        if (intent == null) {
            intent = new Intent(Intent.ACTION_MAIN);
        }
        intent.setClassName(targetPackage, mActivityClass.getName());
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        Log.d(LOG_TAG, String.format("Launching activity %s",
                mActivityClass.getName()));
        // The following cast is correct because the activity we're creating is of the same type as
        // the one passed in
        @SuppressWarnings("unchecked")
        T activity = (T) getInstrumentation().startActivitySync(intent);

        getInstrumentation().waitForIdleSync();
        return activity;
    }

    void finishActivity() {
        if (mActivity != null) {
            mActivity.finish();
            mActivity = null;
        }
    }

    /**
     * {@link UiThreadStatement} that finishes the activity after the test was executed
     */
    private class ActivityStatement extends Statement {

        private final Statement mBase;

        public ActivityStatement(Statement base) {
            mBase = base;
        }

        @Override
        public void evaluate() throws Throwable {
            beforeActivity();
            mActivity = launchActivity();
            try {
                mBase.evaluate();
            } finally {
                finishActivity();
                afterActivity();
            }
        }
    }
}