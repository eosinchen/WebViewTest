package com.example.eosinchen.webviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View v) {

        String strURL = "http://www.android.com";
        String strUserURL;

        strUserURL = ((EditText) findViewById(R.id.editText)).getText().toString();

        if (strUserURL.isEmpty()) {
            strUserURL = strURL;
        }

        WebView myWebView = (WebView) findViewById(R.id.webView);
        myWebView.setWebViewClient(new WebViewClient());
        myWebView.loadUrl(strUserURL);

    }
}
