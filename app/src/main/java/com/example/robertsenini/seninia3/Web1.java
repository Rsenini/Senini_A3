package com.example.robertsenini.seninia3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class Web1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web1);

        WebView myWebView = (WebView) findViewById(R.id.webView);
        myWebView.loadUrl("http://www.sdmesa.edu");
    }
}
