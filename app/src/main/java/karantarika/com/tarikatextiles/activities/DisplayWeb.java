package karantarika.com.tarikatextiles.activities;


import android.app.Activity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import karantarika.com.tarikatextiles.R;



public class DisplayWeb extends Activity {
WebView webView;
    WebSettings webSettings;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_web);
        webView= (WebView) findViewById(R.id.web_view);
        webView.canGoBack();
        webSettings=webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView.loadUrl("http://www.tarikatextiles.com/");
        webView.setWebViewClient(new WebViewClient(){
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return false;
            }
        });

    }
}
