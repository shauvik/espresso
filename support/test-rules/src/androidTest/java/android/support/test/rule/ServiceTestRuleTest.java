/*
 * Copyright (C) 2015 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the Lice`nse is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package android.support.test.rule;

import android.app.ActivityManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.annotation.NonNull;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.Result;
import org.junit.runner.RunWith;

import java.util.concurrent.TimeoutException;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.junit.runner.JUnitCore.runClasses;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class ServiceTestRuleTest {

    public static class ServiceFixture extends Service {
        @Override
        public IBinder onBind(Intent intent) {
            // Don't provide binding, so return null
            return null;
        }
    }

    public static class StartedServiceLifecycleTest {
        private static StringBuilder log = new StringBuilder();

        @Rule
        public final ServiceTestRule mServiceRule = new ServiceTestRule() {

                    @Override
                    public void beforeService() {
                        log.append("beforeService ");
                    }

                    @Override
                    public void startService(@NonNull Intent intent) throws TimeoutException {
                        log.append("startService ");
                    }

                    @Override
                    public IBinder bindService(@NonNull Intent intent) throws TimeoutException {
                        log.append("bindService ");
                        return null;
                    }

                    @Override
                    public void afterService() {
                        log.append("afterService ");
                    }

                    @Override
                    void shutdownService() throws TimeoutException {
                        log.append("shutdownService ");
                    }
                };

        @Before
        public void before() {
            log.append("before ");
        }

        @After
        public void after() {
            log.append("after ");
        }

        @Test
        public void dummyTestToLaunchService() throws TimeoutException {
            log.append("test ");
            mServiceRule.startService(new Intent());
            fail("This is a dummy test to start a service");
        }
    }

    @Test
    public void checkLifecycleOfStartedService() {
        Result result = runClasses(StartedServiceLifecycleTest.class);
        assertEquals(1, result.getFailureCount());
        assertThat(result.getFailures().get(0).getMessage(),
                is("This is a dummy test to start a service"));
        assertThat(StartedServiceLifecycleTest.log.toString(),
                is("beforeService before test startService after shutdownService afterService "));
    }


    public static class BoundServiceLifecycleTest {
        private static StringBuilder log = new StringBuilder();

        @Rule
        public final ServiceTestRule mServiceRule = new ServiceTestRule() {

                    @Override
                    public void beforeService() {
                        log.append("beforeService ");
                    }

                    @Override
                    public void startService(@NonNull Intent intent) throws TimeoutException {
                        log.append("startService ");
                    }

                    @Override
                    public IBinder bindService(@NonNull Intent intent) throws TimeoutException {
                        log.append("bindService ");
                        return null;
                    }

                    @Override
                    public void afterService() {
                        log.append("afterService ");
                    }

                    @Override
                    public void shutdownService() {
                        log.append("shutdownService ");
                    }
                };

        @Before
        public void before() {
            log.append("before ");
        }

        @After
        public void after() {
            log.append("after ");
        }

        @Test
        public void dummyTestToLaunchService() throws TimeoutException {
            log.append("test ");
            mServiceRule.bindService(new Intent());
            fail("This is a dummy test to bind to a service");
        }
    }

    @Test
    public void checkLifecycleOfBoundService() {
        Result result = runClasses(BoundServiceLifecycleTest.class);
        assertEquals(1, result.getFailureCount());
        assertThat(result.getFailures().get(0).getMessage(),
                is("This is a dummy test to bind to a service"));
        assertThat(BoundServiceLifecycleTest.log.toString(),
                is("beforeService before test bindService after shutdownService afterService "));
    }

    public static class TimedOutServiceTest {

        @Rule
        public final ServiceTestRule mServiceRule = new ServiceTestRule() {
                    @Override
                    boolean bindServiceAndWait(Intent intent, final ServiceConnection conn, int flags) throws TimeoutException {
                        waitOnLatch(ProxyServiceConnection.mConnectedLatch, "connected");
                        return true;
                    }
                };

        @Rule
        public final ExpectedException thrown = ExpectedException.none();

        @Test
        public void verifyStartServiceTimeout() throws TimeoutException {
            thrown.expect(TimeoutException.class);
            thrown.expectMessage("Waited for 5 SECONDS, but service was never connected");
            // Since ServiceFixture is not a proper service no successful connection should occur
            mServiceRule.startService(new Intent());
        }

        @Test
        public void verifyBindServiceTimeout() throws TimeoutException {
            thrown.expect(TimeoutException.class);
            thrown.expectMessage("Waited for 5 SECONDS, but service was never connected");
            // Since ServiceFixture is not a proper service no successful connection should occur
            mServiceRule.bindService(new Intent());
        }
    }

    @Test
    public void checkServiceTimeoutLogic() {
        Result result = runClasses(TimedOutServiceTest.class);
        // since we're catching exception inside the test, nothing should report failure
        assertEquals(0, result.getFailureCount());
    }


    @Rule
    public final ServiceTestRule mServiceRule = new ServiceTestRule() {
                @Override
                boolean bindServiceAndWait(Intent intent, final ServiceConnection conn, int flags) {
                    return true;
                }

                @Override
                public void shutdownService() {
                    // ignore
                }
            };

    @Test
    public void verifySuccessfulServiceStart() throws TimeoutException {
        mServiceRule.startService(new Intent());
        assertTrue("The service was not started", mServiceRule.mServiceStarted);
        assertTrue("The service was not bound", mServiceRule.mServiceBound);
    }

    @Test
    public void verifySuccessfulServiceBind() throws TimeoutException {
        mServiceRule.bindService(new Intent());
        assertTrue("The service was not bound", mServiceRule.mServiceBound);
        assertFalse("The service started instead of bound", mServiceRule.mServiceStarted);
    }

    private boolean isMyServiceRunning(Class<?> serviceClass) {
        ActivityManager manager = (ActivityManager) InstrumentationRegistry.getTargetContext()
                .getSystemService(Context.ACTIVITY_SERVICE);
        for (ActivityManager.RunningServiceInfo service : manager.getRunningServices(Integer.MAX_VALUE)) {
            if (serviceClass.getName().equals(service.service.getClassName())) {
                return true;
            }
        }
        return false;
    }
}
