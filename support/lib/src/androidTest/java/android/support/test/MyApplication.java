package android.support.test;

import android.app.Application;
import android.support.test.runner.lifecycle.ApplicationStage;

/**
 * Application fixture used to verify
 * {@link android.support.test.runner.lifecycle.ApplicationLifecycleCallback}
 */
public class MyApplication extends Application {
    private static volatile ApplicationStage sStage = ApplicationStage.PRE_ON_CREATE;

    @Override
    public void onCreate() {
        super.onCreate();
        sStage = ApplicationStage.CREATED;
    }

    public static ApplicationStage getStage() {
        return sStage;
    }
}
