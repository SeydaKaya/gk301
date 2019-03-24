package com.example.gk301;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        WebView wv=(WebView)findViewById(R.id.webView);
        wv.getSettings().getJavaScriptEnabled();
        wv.loadUrl("https://gelecegiyazanlar.turkcell.com.tr");

    }
}
