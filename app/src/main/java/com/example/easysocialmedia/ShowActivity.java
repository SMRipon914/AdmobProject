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
        else if (f.equals("map")){
            webView.loadUrl("https://www.google.com/maps/place/%E0%A6%AB%E0%A7%8D%E0%A6%B0%E0%A6%BF%E0%A6%B2%E0%A6%BE%E0%A6%A8%E0%A7%8D%E0%A6%B8%E0%A6%BF%E0%A6%82+%E0%A6%8F%E0%A6%87%E0%A6%A1/@23.8698359,90.3847347,17z/data=!3m1!4b1!4m5!3m4!1s0x3755c4107872706f:0x548b9c20be57c3f5!8m2!3d23.8698359!4d90.3869234");
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
    @Override
    public void onBackPressed() {
        if (webView.canGoBack()){
            webView.goBack();
        }
        else{
            Intent intent = new Intent(this, DisplayActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            intent.putExtra("Exit me", true);
            startActivity(intent);
            finish();
        }
    }
}
