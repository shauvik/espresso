package android.support.test.internal.runner;

import android.os.Bundle;
import android.support.test.internal.runner.listener.InstrumentationRunListener;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.Result;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.io.PrintStream;

import static android.support.test.InstrumentationRegistry.getInstrumentation;

/**
 * Unit tests for TestExecutor
 */
public class TestExecutorTest {

    @Mock
    private TestRequest mMockRequest;
    @Mock
    private InstrumentationRunListener mMockListener;

    private TestExecutor mExecutor;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        mExecutor = new TestExecutor.Builder(getInstrumentation())
                .addRunListener(mMockListener)
                .build();
    }

    /**
     * Simple normal case execution
     */
    @Test
    public void testExecute() {
        mExecutor.execute(mMockRequest);
        Mockito.verify(mMockListener).instrumentationRunFinished(
                (PrintStream) Mockito.anyObject(),
                (Bundle) Mockito.anyObject(),
                (Result) Mockito.anyObject());
    }
}
