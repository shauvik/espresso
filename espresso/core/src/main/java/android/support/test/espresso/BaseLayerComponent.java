package android.support.test.espresso;

import android.support.test.espresso.base.ActiveRootLister;
import android.support.test.espresso.base.BaseLayerModule;
import android.support.test.espresso.base.IdlingResourceRegistry;
import android.support.test.espresso.base.UiControllerModule;

import dagger.Component;

import javax.inject.Singleton;

/**
 * Dagger component for base classes.
 */
@Component(modules = {BaseLayerModule.class, UiControllerModule.class})
@Singleton
public interface BaseLayerComponent {
  BaseLayerModule.FailureHandlerHolder failureHolder();
  FailureHandler failureHandler();
  ActiveRootLister activeRootLister();
  IdlingResourceRegistry idlingResourceRegistry();
  ViewInteractionComponent plus(ViewInteractionModule module);
}
