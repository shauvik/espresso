package android.support.test.espresso;

import dagger.Subcomponent;

import javax.inject.Singleton;

/**
 * Dagger component for view interaction classes.
 */
@Subcomponent(modules = ViewInteractionModule.class)
@Singleton
public interface ViewInteractionComponent {
  ViewInteraction viewInteraction();
}
