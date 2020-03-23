package com.example.srmaio;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Cleanliness extends Activity {

    private WebView w1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cleanliness);

        w1 = (WebView) findViewById(R.id.w1);
        w1.setWebViewClient(new WebViewClient());
        w1.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSfVB6jXCGP3mXJLwY22bSl9ec24rFXKShrBrerJfka-mhCqIg/viewform");
        WebSettings webSettings = w1.getSettings();
        webSettings.setJavaScriptEnabled(true);

    }

}
