package com.something.technicalrishi.iatandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class giveawayresult extends AppCompatActivity {
    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giveawayresult);
        webView = (WebView) findViewById(R.id.webview1);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://resultiatandroid.blogspot.com/");

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

    }
}
