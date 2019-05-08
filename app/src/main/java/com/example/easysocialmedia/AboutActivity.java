package com.example.easysocialmedia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AboutActivity extends AppCompatActivity {

    WebView aboutWev;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        this.setTitle("About us");
        aboutWev=findViewById(R.id.aboutWeb);
        aboutWev.setWebViewClient(new WebViewClient());
        WebSettings s=aboutWev.getSettings();
        s.setJavaScriptEnabled(true);
        s.setLoadWithOverviewMode(true);
        aboutWev.loadUrl("https://freelancingaid.business.site/");

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.web_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==R.id.web_menu){
            startActivity(new Intent(getApplicationContext(),DisplayActivity.class));
        }
        return true;
    }
}
