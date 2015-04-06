package android.support.test.runner.intent;

import android.app.Instrumentation.ActivityResult;
import android.content.Intent;
import android.test.InstrumentationTestCase;
import android.test.UiThreadTest;
import android.test.suitebuilder.annotation.SmallTest;

/**
 * {@link IntentStubberRegistry} tests.
 */
@SmallTest
public class IntentStubberRegistryTest extends InstrumentationTestCase {

    private IntentStubber mIntentStubber;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        mIntentStubber = new IntentStubber() {
            @Override
            public ActivityResult getActivityResultForIntent(Intent intent) {
                return null;
            }
        };
    }

    @Override
    protected void tearDown() throws Exception {
        IntentStubberRegistry.reset();
        assertFalse(IntentStubberRegistry.isLoaded());
        super.tearDown();
    }

    @UiThreadTest
    public void testIntentStubberLoading() {
        IntentStubberRegistry.load(mIntentStubber);
        assertTrue(IntentStubberRegistry.isLoaded());

        assertNotNull(IntentStubberRegistry.getInstance());
    }

    public void testLoadCanOnlyBeCalledOnce() {
        try {
            IntentStubberRegistry.load(mIntentStubber);
            IntentStubberRegistry.load(mIntentStubber);
            fail("IllegalStateException expected. An Intent Stubber can only be stubbed once!");

        } catch (IllegalStateException expected) {
        }
    }

    public void testLoadPassingNullThrows() {
        try {
            IntentStubberRegistry.load(null);
            fail("NullPointerException expected. Intent Stubber cannot be null!");
        } catch (NullPointerException expected) {
        }
    }

    public void testGetInstanceCanOnlyBeCalledOnMainThread() {
        IntentStubberRegistry.load(mIntentStubber);
        try {
            IntentStubberRegistry.getInstance();
            fail("IllegalStateException expected. getInstance() should only be allowed on main"
                    + "thread!");
        } catch (IllegalStateException expected) {
        }
    }

    public void testNoInstanceLoadedThrows() {
        try {
            IntentStubberRegistry.getInstance();
            fail("IllegalStateException expected. No instance available, load must be called"
                    + "first");
        } catch (IllegalStateException expected) {
        }
    }

}
