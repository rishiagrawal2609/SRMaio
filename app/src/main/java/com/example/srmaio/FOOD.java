package com.example.srmaio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class FOOD extends AppCompatActivity {
    private WebView w1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
        w1 = (WebView) findViewById(R.id.w1);
        w1.setWebViewClient(new WebViewClient());
        w1.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLScDmEYXaT5F3Qj2bhs1_oAWjKK4teDkQDzn8RsbWyGFBUAXKA/viewform?usp=sf_link");
        WebSettings webSettings = w1.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}
