/*
 * Copyright (C) 2015 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package android.support.test.testapp;

import static android.support.test.espresso.Espresso.closeSoftKeyboard;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.clearText;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.web.assertion.WebViewAssertions.webMatches;
import static android.support.test.espresso.web.model.Atoms.castOrDie;
import static android.support.test.espresso.web.model.Atoms.getCurrentUrl;
import static android.support.test.espresso.web.model.Atoms.getTitle;
import static android.support.test.espresso.web.model.Atoms.script;
import static android.support.test.espresso.web.model.Atoms.scriptWithArgs;
import static android.support.test.espresso.web.model.Atoms.transform;
import static android.support.test.espresso.web.sugar.Web.onWebView;
import static android.support.test.espresso.web.webdriver.DriverAtoms.clearElement;
import static android.support.test.espresso.web.webdriver.DriverAtoms.findElement;
import static android.support.test.espresso.web.webdriver.DriverAtoms.getText;
import static android.support.test.espresso.web.webdriver.DriverAtoms.selectFrameByIdOrName;
import static android.support.test.espresso.web.webdriver.DriverAtoms.webClick;
import static android.support.test.espresso.web.webdriver.DriverAtoms.webKeys;
import static com.google.common.base.Preconditions.checkNotNull;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasEntry;
import static org.hamcrest.Matchers.is;

import android.support.test.espresso.web.model.JSONAble;
import android.support.test.espresso.web.model.ModelCodec;
import android.support.test.espresso.web.webdriver.Locator;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import android.os.Build;
import android.os.SystemClock;
import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.LargeTest;
import android.webkit.WebView;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.json.JSONException;
import org.json.JSONStringer;

import java.util.Map;

/**
 * Sample test that interacts with a {@link WebView}.
 */
@LargeTest
public class WebViewTest extends ActivityInstrumentationTestCase2<DynamicWebViewActivity> {

  public WebViewTest() {
    super(DynamicWebViewActivity.class);
  }

  @Override
  public void setUp() throws Exception {
    super.setUp();
    getActivity();
    // technically we do not need to do this - DynamicWebViewActivity has javascript turned on.
    // Other webviews in your app may have javascript turned off, however since the only way to
    // automate WebViews is thru javascript, it must be enabled.
    onWebView()
         .forceJavascriptEnabled();

    // For fun, throw 2 redirects and a 1 second delay on loading resources.
    onView(withId(R.id.redirect_increment))
        .perform(click())
        .perform(click());

    onView(withId(R.id.delay_increment))
        .perform(click());
  }

  private void goTo(String page) {
    onView(withId(R.id.dyn_url))
        .perform(clearText())
        .perform(typeText(String.format("http://localhost:%s/%s",
                getActivity().getServerPort(), page)));
    closeSoftKeyboard();
    onView(withId(R.id.go_dyn_url))
        .perform(click());
  }

  public void testForm() {
    goTo("samples/simple_form.html");
    // If your activity has multiple webviews, provide a matcher.
    // But be careful - a WebView is an expensive object, you really should only need one at any
    // given time.
    onWebView()
        // Lets point our interaction at a dom element with name short_name
        .withElement(findElement(Locator.NAME, "short_name"))
        // Lets type into that element
        .perform(clearElement())
        .perform(webKeys("Steve"))
        // Now lets find the submit button.
        .withElement(findElement(Locator.ID, "submit"))
        // and click on it.
        .perform(webClick())
        // Now there should be a new message on the screen at this xpath.
        .withElement(findElement(Locator.XPATH, "/html/body/div/p[@id='message']"))
        // Lets make sure it has the right message.
        .check(webMatches(getText(), containsString("Hello Steve!")));
  }

  public void testNavigation() {
    goTo("samples/navigation_1.html");

    onWebView(withId(R.id.dynamic_web_view))
        // Lets find the next link
        .withElement(findElement(Locator.ID, "link_2"))
        // And simulate a click via javascript.
        .perform(webClick())
        // Now we're on a new page, but our WebInteraction doesn't know that, you need to clear
        // its state or point it at a new Element or you'll get an exception.
        .reset()
        // lets make sure we're on the right page.
        .check(webMatches(getCurrentUrl(), containsString("navigation_2.html")))
        // lets find another link to go to.
        .withElement(findElement(Locator.ID, "link_3"))
        // simulate a click.
        .perform(webClick())
        // reset our state again.
        .reset()
        .check(webMatches(getCurrentUrl(), containsString("navigation_3.html")))
        .check(webMatches(getTitle(), is("The end of the line!")));
  }

  public void testFrames() {
    goTo("samples/frames.html");
    if (Build.VERSION.SDK_INT == 19) {
      api19TestFrames();
      return;
    }

    // If your activity has multiple webviews, provide a matcher.
    // But be careful - a WebView is an expensive object, you really should only need one at any
    // given time.
    onWebView()
        // We're in the main frame.
        .check(webMatches(getCurrentUrl(), containsString("frames.html"))) // the main frame
        // Now lets switch to a sub frame named bar.
        .inWindow(selectFrameByIdOrName("bar"))
        // Now the URL of the frame should change.
        .check(webMatches(getCurrentUrl(), containsString("bar.html")))
        // Now lets switch to another subframe (of the MAIN frame).
        .inWindow(selectFrameByIdOrName("form"))
        // And interact with it's content.
        .withElement(findElement(Locator.NAME, "short_name"))
        .perform(clearElement())
        .perform(webKeys("Steve"))
        .withElement(findElement(Locator.ID, "submit"))
        .perform(webClick())
        .withElement(findElement(Locator.ID, "message"))
        .check(webMatches(getText(), containsString("Hello Steve!")));
  }


  public void api19TestFrames() {
    // Sadly API 19 does not report progress changes when an iframe is loading new content (eg: a
    // user has clicked on a form submit button in an iframe.) It only reports progress changes once
    // all the new content is loaded. In this case we have to sleep after performing the click on
    // the submit button.
    //
    // At least API 19 does block the initial page load (caused by webview.loadURL()) until all the
    // content in each iframe is fully loaded.
    onWebView()
        // We're in the main frame.
        .check(webMatches(getCurrentUrl(), containsString("frames.html"))) // the main frame
        // Now lets switch to a sub frame named bar.
        .inWindow(selectFrameByIdOrName("bar"))
        // Now the URL of the frame should change.
        .check(webMatches(getCurrentUrl(), containsString("bar.html")))
        // Now lets switch to another subframe (of the MAIN frame).
        .inWindow(selectFrameByIdOrName("form"))
        // And interact with it's content.
        .withElement(findElement(Locator.NAME, "short_name"))
        .perform(clearElement())
        .perform(webKeys("Steve"))
        .withElement(findElement(Locator.ID, "submit"))
        .perform(webClick());
    SystemClock.sleep(3000);

    onWebView()
        .inWindow(selectFrameByIdOrName("form"))
        .withElement(findElement(Locator.ID, "message"))
        .check(webMatches(getText(), containsString("Hello Steve!")));
  }

  public void testJavascriptEvaluation() {
    goTo("samples/js.html");

    // Writing using functions is nice for re-usable snippits of logic that vary by their
    // arguments.
    String accumulateFn = "function() {"
        + "  var initial = arguments[0];"
        + "  for (var i = 1; i < arguments.length; i++) { "
        + "    initial += arguments[i];"
        + "  }"
        + "  return initial;"
        + "}";

    onWebView()
        .check(webMatches(transform(scriptWithArgs(accumulateFn,
                                Lists.newArrayList(1, 2, 42, 7)),
                        castOrDie(Integer.class)),
                is(52)));

    // you can also omit the function wrapper for one-off evaluations.
    onWebView()
        .check(webMatches(script("return document != null;", castOrDie(Boolean.class)),
            is(true)));

  }

  @SuppressWarnings("unchecked")
  public void testJavascriptSerialization() {
    goTo("samples/js.html");

    // onWebView() allows you to retrieve the result of your last check/perform call.
    Map oceans = onWebView()
            .check(webMatches(script("return document.oceans;", castOrDie(Map.class)),
                    hasOcean(equalTo("Pacific"), equalTo("Pretty Big"))))
    .get();

    // You probably should keep your assertions in webMatches.
    assertEquals(oceans.get("Antarctic"), "It's cold");

    // but you couldn't do this with web matches.
    oceans.put("plastic_trash", "this shouldn't be here");

    // however, you're working with a copy of the javascript object, lets go and update
    // the object in the webview world.
    onWebView()
        .perform(
            scriptWithArgs(
                "document.oceans = arguments[0];",
                Lists.newArrayList(oceans)));

    // and our update is present... unfortunately.
    onWebView()
        .check(webMatches(
            script("return 'plastic_trash' in document.oceans;", castOrDie(Boolean.class)),
            is(true)));
  }

  public void testJavascriptComplexSerialization() {
    goTo("samples/js.html");

    // By default Espresso can only convert back and forth between:
    // Numbers, Strings, Maps, Lists, ElementReferences, and WindowReferences.

    // However if you have a type which implements JSONAble and has a DeJSONFactory espresso
    // will convert back and forth between JSON and that specific Java Type.
    ModelCodec.addDeJSONFactory(SolarSystem.DEJSONIZER);


    SolarSystem theSolarSystem = onWebView()
        .perform(script("return document.planets;", castOrDie(SolarSystem.class)))
        .get();

    theSolarSystem.addPlanet("Pluto", "Argue about technicalities all you want");

    onWebView()
        .perform(
            scriptWithArgs(
                "document.planets = arguments[0];",
                Lists.newArrayList(theSolarSystem)));

    onWebView()
        .check(webMatches(
            script("return 'Pluto' in document.planets;", castOrDie(Boolean.class)),
            is(true)));
  }

  public void testContextualElements() {
    goTo("samples/simple_form.html");
    onWebView()
        // Lets point our interaction at a dom element with id teacher
        .withElement(findElement(Locator.ID, "teacher"))
        // And if we consider the above element as the root of the dom tree, find
        // another element beneath it.
        .withContextualElement(findElement(Locator.ID, "display_name"))
        .check(webMatches(getText(), containsString("Socrates")));

    // Simply searching by display_name would fail, because it is ambigious.
    // We could have used an XPath, but sometimes that is not natural.
  }

  public static class SolarSystem implements JSONAble {
    private final Map<String, String> planetAndDescription;

    private SolarSystem(Map<String, String> planetAndDescription) {
      this.planetAndDescription = planetAndDescription;
    }

    public String describePlanet(String name) {
      String desc = planetAndDescription.get(name);
      if (null == desc) {
        throw new RuntimeException("You missed!");
      }
      return desc;
    }

    public void addPlanet(String name, String description) {
      planetAndDescription.put(name, description);
    }

    @Override
    public String toJSONString() {
      try {
        JSONStringer stringer = new JSONStringer()
            .object()
            .key("solar_system")
            .value("thats_me");
        for (Map.Entry<String, String> planet : planetAndDescription.entrySet()) {
          stringer.key(planet.getKey())
              .value(planet.getValue());
        }

        return stringer.endObject().toString();
      } catch (JSONException je) {
        throw new RuntimeException(je);
      }
    }

    private static final JSONAble.DeJSONFactory DEJSONIZER =
      new JSONAble.DeJSONFactory() {
        @Override
        public Object attemptDeJSONize(Map<String, Object> map) {
          if ("thats_me".equals(map.get("solar_system"))) {
            Map<String, String> planetsAndDescriptions  = Maps.newHashMap();
            for (Map.Entry<String, Object> ent : map.entrySet()) {
              if (ent.getValue() instanceof String) {
                planetsAndDescriptions.put(ent.getKey(), (String) ent.getValue());
              } else {
                // not a solar system - they only have strings in them!
                return null;
              }
            }
            return new SolarSystem(planetsAndDescriptions);
          }
          return null;
        }
      };
  }

  private static Matcher<Map> hasOcean(final Matcher<String> key, final Matcher<String> value){
    checkNotNull(key);
    checkNotNull(value);
    return new TypeSafeMatcher<Map>(Map.class) {
      @Override
      public boolean matchesSafely(Map map) {
        return hasEntry(key, value).matches(map);
      }

      @Override
      public void describeTo(Description description) {
        description.appendText("with key: " + key);
        description.appendText("with key: " + value);
      }
    };
  }

}
