package android.support.test.internal.runner;

import android.app.Instrumentation;
import android.os.Bundle;
import android.os.Debug;
import android.support.test.internal.runner.listener.InstrumentationRunListener;
import android.support.test.internal.util.Checks;
import android.util.Log;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.RunListener;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Class that given a TestRequest containing tests to run, wires up the test listeners and
 * actually executes the test using upstream JUnit
 */
public final class TestExecutor {
    private static final String LOG_TAG = "TestExecutor";

    private final List<RunListener> mListeners;
    private final boolean mWaitForDebugger;
    private final Instrumentation mInstr;

    private TestExecutor(Builder builder) {
        mListeners = Checks.checkNotNull(builder.mListeners);
        mWaitForDebugger = builder.mWaitForDebugger;
        mInstr = builder.mInstr;
    }

    /**
     * Execute the tests
     */
    public Bundle execute(TestRequest testRequest) {
        Bundle results = new Bundle();

        if (mWaitForDebugger) {
            Log.i(LOG_TAG, "Waiting for debugger to connect...");
            Debug.waitForDebugger();
            Log.i(LOG_TAG, "Debugger connected.");
        }

        ByteArrayOutputStream summaryStream = new ByteArrayOutputStream();
        // create the stream used to output summary data to the user
        PrintStream summaryWriter = new PrintStream(summaryStream);

        try {
            JUnitCore testRunner = new JUnitCore();
            setUpListeners(testRunner);
            Result result = testRunner.run(testRequest.getRequest());
            result.getFailures().addAll(testRequest.getFailures());
        } catch (Throwable t) {
            // catch all exceptions so a more verbose error message can be displayed
            summaryWriter.println(String.format(
                    "Test run aborted due to unexpected exception: %s",
                    t.getMessage()));
            t.printStackTrace(summaryWriter);

        } finally {
            reportRunEnded(mListeners, summaryWriter, results);
            summaryWriter.close();
            results.putString(Instrumentation.REPORT_KEY_STREAMRESULT,
                    String.format("\n%s", summaryStream.toString()));
        }
        return results;
    }

    private void setupDexmakerClassloader() {
        ClassLoader originalClassLoader = Thread.currentThread().getContextClassLoader();
        // must set the context classloader for apps that use a shared uid, see
        // frameworks/base/core/java/android/app/LoadedApk.java
        ClassLoader newClassLoader = this.getClass().getClassLoader();
        Log.i(LOG_TAG, String.format("Setting context classloader to '%s', Original: '%s'",
                newClassLoader.toString(), originalClassLoader.toString()));
        Thread.currentThread().setContextClassLoader(newClassLoader);
    }

    /**
     * Initialize listeners and add them to the JUnitCore runner
     */
    private void setUpListeners(JUnitCore testRunner) {
        for (RunListener listener : mListeners) {
            Log.d(LOG_TAG, "Adding listener " + listener.getClass().getName());
            testRunner.addListener(listener);
            if (listener instanceof InstrumentationRunListener) {
                ((InstrumentationRunListener)listener).setInstrumentation(mInstr);
            }
        }
    }

    private void reportRunEnded(List<RunListener> listeners, PrintStream summaryWriter,
                                Bundle results) {
        for (RunListener listener : listeners) {
            if (listener instanceof InstrumentationRunListener) {
                ((InstrumentationRunListener)listener).instrumentationRunFinished(summaryWriter,
                        results);
            }
        }
    }

    public static class Builder {
        private final List<RunListener> mListeners = new ArrayList<RunListener>();
        private boolean mWaitForDebugger = false;
        private final Instrumentation mInstr;

        public Builder(Instrumentation instr) {
            mInstr = instr;
        }

        public Builder setWaitForDebugger(boolean waitForDebugger) {
            mWaitForDebugger = waitForDebugger;
            return this;
        }

        /**
         * Adds a custom RunListener
         * @param listener
         * @return
         */
        public Builder addRunListener(RunListener listener) {
            mListeners.add(listener);
            return this;
        }

        public TestExecutor build() {
            return new TestExecutor(this);
        }
    }
}
