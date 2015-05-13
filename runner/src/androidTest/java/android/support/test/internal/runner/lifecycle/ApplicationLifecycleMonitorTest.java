package android.support.test.internal.runner.lifecycle;

import android.support.test.runner.lifecycle.ApplicationStage;
import android.test.suitebuilder.annotation.SmallTest;
import android.util.Pair;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Simple test to check that registered ApplicationLifecycleCallbacks are performed
 */
@SmallTest
public class ApplicationLifecycleMonitorTest {

    @Test
    public void testCallbacks() {
        assertEquals(2, AppLifecycleListener.sStages.size());
        Pair<ApplicationStage, ApplicationStage> firstStagePair =
                AppLifecycleListener.sStages.get(0);
        assertEquals(ApplicationStage.PRE_ON_CREATE, firstStagePair.first);
        assertEquals(ApplicationStage.PRE_ON_CREATE, firstStagePair.second);

        Pair<ApplicationStage, ApplicationStage> secondStagePair =
                AppLifecycleListener.sStages.get(1);
        assertEquals(ApplicationStage.CREATED, secondStagePair.first);
        assertEquals(ApplicationStage.CREATED, secondStagePair.second);
    }
}
