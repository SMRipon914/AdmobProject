package com.example.easysocialmedia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class ShowActivity extends AppCompatActivity {

    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        webView=findViewById(R.id.webView);
        webView.setWebViewClient(new WebViewClient());
        WebSettings webSettings=webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setLoadWithOverviewMode(true);

        Bundle bundle=getIntent().getExtras();
        String f=bundle.getString("social_name");
        if (f.equals("ourfacebook")){
            webView.loadUrl("https://www.facebook.com/freelancingaidbd");
        }
        else if (f.equals("ourtwotter")){
            Toast.makeText(getApplicationContext(),"ttt",Toast.LENGTH_SHORT).show();
        } else if (f.equals("ourlinkedin")) {
            Toast.makeText(getApplicationContext(),"llll",Toast.LENGTH_SHORT).show();
        }
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
