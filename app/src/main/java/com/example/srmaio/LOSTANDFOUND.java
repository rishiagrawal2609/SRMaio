package com.example.srmaio;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class LOSTANDFOUND extends Activity {

    private WebView w1;
    private Button HOME;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lostandfound);

        w1 = (WebView) findViewById(R.id.w1);
        w1.setWebViewClient(new WebViewClient());
        w1.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSeOV4chDrXiCDrNfMeZ0HJIEFj-l-rcPCgVl6nZNhvUm4unxA/viewform?usp=sf_link");
        WebSettings webSettings = w1.getSettings();
        webSettings.setJavaScriptEnabled(true);


}
    }
