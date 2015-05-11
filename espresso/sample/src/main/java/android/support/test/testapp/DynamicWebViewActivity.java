package android.support.test.testapp;

import com.google.common.collect.Maps;

import android.app.Activity;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.NumberPicker;
import android.widget.TextView;

import fi.iki.elonen.NanoHTTPD;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

/**
 * An activity hosting a webview and a httpserver.
 */
public class DynamicWebViewActivity extends Activity {
  private static final String TAG = "DynaWeb";
  private TextView redirectValue;
  private Button redirectInc;
  private Button redirectDec;
  private NumberPicker delayPicker;
  private WebView webView;
  private CheckBox shouldOverride;
  private TextView overrideMessage;
  private MuckableFileServer muckableFileServer;
  private TextView pageChangeMessage;

  private class MuckableFileServer extends NanoHTTPD {
    private volatile int redirectCount = 0;
    private volatile int responseDelay = 0;
    private final AssetManager assetManager;
    private MuckableFileServer(int port, AssetManager assetManager) throws IOException {
      super(port);
      this.assetManager = assetManager;
      // FYI: NanoHTTPD 1.x started serving as soon as it was constructed.
      start();
    }

    @Override
    public Response serve(IHTTPSession session) {
      Log.i(TAG, "Serving: " + session.getUri());
      String uri = session.getUri();
      int reqRedirects = 0;
      if (session.getParms().containsKey("redir_count")) {
        reqRedirects = Integer.valueOf(session.getParms().get("redir_count"));
      }
      if (reqRedirects == 0 && reqRedirects < redirectCount) {
        SystemClock.sleep(responseDelay * 1000);
      }

      if (reqRedirects < redirectCount) {
        Uri.Builder redirUri = new Uri.Builder()
            .encodedPath(uri);
        Map<String, String> params = Maps.newHashMap(session.getParms());
        params.put("redir_count", String.valueOf(reqRedirects + 1));
        for (Map.Entry<String, String> paramKV : params.entrySet()) {
          redirUri.appendQueryParameter(paramKV.getKey(), paramKV.getValue());
        }

        Response resp = new Response(Response.Status.REDIRECT, "text/plain", "");
        Log.i(TAG, "Redirecting you to: " + redirUri.toString());
        resp.addHeader("Location", redirUri.toString());
        return resp;
      } else {
        SystemClock.sleep(responseDelay * 1000);
        try {
          if (uri.startsWith("/")) {
            uri = uri.substring(1, uri.length());
          }

          InputStream is = assetManager.open(uri);
          String mimeType = "application/octet-stream";
          if (uri.endsWith(".html") || uri.endsWith(".htm")) {
            mimeType = "text/html";
          } else if (uri.endsWith(".txt")) {
            mimeType = "text/plain";
          } else if (uri.endsWith(".jpg") || uri.endsWith(".jpeg")) {
            mimeType = "image/jpeg";
          } else if (uri.endsWith(".gif")) {
            mimeType = "image/gif";
          } else if (uri.endsWith(".png")) {
            mimeType = "image/png";
          }
          return new Response(Response.Status.OK, mimeType, is);
        } catch (IOException ioe) {
          return new Response(Response.Status.NOT_FOUND, MIME_PLAINTEXT, "Not there.");
        }

      }

    }
  }

  int getServerPort() {
    return muckableFileServer.getListeningPort();
  }

  @Override
  public void onDestroy() {
    super.onDestroy();
    muckableFileServer.stop();
  }

  @Override
  public void onCreate(Bundle args) {
    super.onCreate(args);
    for (int port = 10000; muckableFileServer == null && port < 30000; port++) {

      try {
        muckableFileServer = new MuckableFileServer(port, getAssets());
      } catch (IOException ioe) {
        Log.i(TAG, "Port: " + port + " in use...", ioe);
      }
    }
    if (null == muckableFileServer) {
      finish();
      return;
    }

    setContentView(R.layout.dynamic_web_view_activity);

    setupIncDecCounter((TextView) findViewById(R.id.redirect_val),
        (Button) findViewById(R.id.redirect_increment),
        (Button) findViewById(R.id.redirect_decrement),
        0, 10, new ValueListener() {
          @Override
          public void onValueChanged(int value) {
            muckableFileServer.redirectCount = value;
          }
        });

    setupIncDecCounter((TextView) findViewById(R.id.delay_val),
        (Button) findViewById(R.id.delay_increment),
        (Button) findViewById(R.id.delay_decrement),
        0, 100, new ValueListener() {
          @Override
          public void onValueChanged(int value) {
            muckableFileServer.responseDelay = value;
          }
        });

    pageChangeMessage = (TextView) findViewById(R.id.page_change_message);
    overrideMessage = (TextView) findViewById(R.id.override_message);
    shouldOverride = (CheckBox) findViewById(R.id.naive_override);
    final TextView progressValue = (TextView) findViewById(R.id.progress_value);
    progressValue.setText("Progress: 0");
    webView = (WebView) findViewById(R.id.dynamic_web_view);
    webView.getSettings().setJavaScriptEnabled(true);
    webView.setWebChromeClient(new WebChromeClient() {
      @Override
      public void onProgressChanged(WebView unuesed, int value) {
        Log.i(TAG, "progress change: " + value + " webview says: " + unuesed.getProgress());
        progressValue.setText("Progress: " + value);
      }
    });
    webView.setWebViewClient(new WebViewClient() {
      @Override
      public boolean shouldOverrideUrlLoading(WebView view, String url) {
        Log.i(TAG, "shouldOverrideURLLoading: " + url + " progress: " + view.getProgress());
        if (shouldOverride.isChecked()) {
          overrideMessage.setText("Overrided: " + url);
          return true;
        } else {
          overrideMessage.setText("Passed: " + url);
          return false;
        }
      }
      @Override
      public void onPageStarted(WebView wv, String url, Bitmap favicon) {
        Log.i(TAG, "onPageStarted: " + url + " progress: " + wv.getProgress());
        pageChangeMessage.setText("OnPageStarted: " + url);

      }
      @Override
      public void onPageFinished(WebView wv, String url) {
        Log.i(TAG, "onPageFinished: " + url + " progress: " + wv.getProgress());
        pageChangeMessage.setText("OnPageFinished: " + url);
      }
    });
    String destPage = getIntent().getStringExtra("dest");
    if (null == destPage) {
      destPage = "";
    }

    final TextView dynUrl = (TextView) findViewById(R.id.dyn_url);
    dynUrl.setText("http://localhost:" + muckableFileServer.getListeningPort() + "/" + destPage);
    findViewById(R.id.go_dyn_url).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View unused) {
        webView.loadUrl(dynUrl.getText().toString());
        webView.requestFocus();
      }
    });
  }

  public void onOverrideClicked(View view) {
    if (shouldOverride.isChecked()) {
      overrideMessage.setText("Waiting for shouldOverride call...");
    } else {
      overrideMessage.setText("Disabled");
    }
  }

  private void setupIncDecCounter(final TextView val, final Button increment,
      final Button decrement, final int min, final int max, final ValueListener listener) {
    View.OnClickListener onClick = new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        int currentVal = Integer.valueOf(val.getText().toString());
        if (v == increment) {
          currentVal++;
        } else {
          currentVal--;
        }
        if (currentVal < min) {
          currentVal = min;
        } else if (currentVal > max) {
          currentVal = max;
        }
        increment.setEnabled(currentVal != max);
        decrement.setEnabled(currentVal != min);
        val.setText(String.valueOf(currentVal));
        listener.onValueChanged(currentVal);
      }
    };
    increment.setOnClickListener(onClick);
    decrement.setOnClickListener(onClick);
  }

  private interface ValueListener {
    public void onValueChanged(int val);
  }

}
