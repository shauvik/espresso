package android.support.test.espresso;

import android.support.test.espresso.base.ActiveRootLister;
import android.support.test.espresso.base.BaseLayerModule;
import android.support.test.espresso.base.IdlingResourceRegistry;

import dagger.Component;

import javax.inject.Singleton;

/**
 * Dagger component for base classes.
 */
@Component(modules = BaseLayerModule.class)
@Singleton
public interface BaseLayerComponent {
  BaseLayerModule.FailureHandlerHolder failureHolder();
  FailureHandler failureHandler();
  ActiveRootLister activeRootLister();
  IdlingResourceRegistry idlingResourceRegistry();
  ViewInteractionComponent plus(ViewInteractionModule module);
}
