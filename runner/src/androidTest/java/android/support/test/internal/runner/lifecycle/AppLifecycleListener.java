package android.support.test.internal.runner.lifecycle;

import android.app.Application;
import android.support.test.MyApplication;
import android.support.test.runner.lifecycle.ApplicationLifecycleCallback;
import android.support.test.runner.lifecycle.ApplicationStage;
import android.test.suitebuilder.annotation.SmallTest;
import android.util.Pair;

import java.util.ArrayList;
import java.util.List;

/**
 * A {@link ApplicationLifecycleCallback} fixture used to ensure ApplicationLifecycleCallback
 * callbacks happen appropriately
 */
@SmallTest
public class AppLifecycleListener implements ApplicationLifecycleCallback {

    /**
     * List of ApplicationStage received from ApplicationLifecycleCallback, vs ApplicationStage
     * via MyApplication. They should always match
     */
    static List<Pair<ApplicationStage, ApplicationStage>> sStages =
            new ArrayList<Pair<ApplicationStage, ApplicationStage>>();

    @Override
    public void onApplicationLifecycleChanged(Application app, ApplicationStage stage) {
        sStages.add(new Pair(stage, MyApplication.getStage()));
    }
}
