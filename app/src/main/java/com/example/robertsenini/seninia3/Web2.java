 package com.example.robertsenini.seninia3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

 public class Web2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web2);

        WebView myWebView = (WebView) findViewById(R.id.webView2);
        myWebView.loadUrl("https://www.google.com");
    }
}
