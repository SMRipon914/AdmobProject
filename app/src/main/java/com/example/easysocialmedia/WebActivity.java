package com.example.easysocialmedia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class WebActivity extends AppCompatActivity {

    WebView webView_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        webView_main = findViewById(R.id.webView_main);
        //webView_main=findViewById(R.id.webView);
        webView_main.setWebViewClient(new WebViewClient());
        WebSettings webSettings = webView_main.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setLoadWithOverviewMode(true);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String item = bundle.getString("name");
            Log.d("ppp", "onCreate: " + item);
            itemList(item);
        }

    }

    public void itemList(String item) {
        if (item.equals("Pinterest.com")) {
            webView_main.loadUrl("https://www.pinterest.com/");
        } else if (item.equals("Facebook.com")) {
            webView_main.loadUrl("https://web.facebook.com/login/device-based/regular/login/?login_attempt=1&lwv=110");
        } else if (item.equals("Reddit.com")) {
            webView_main.loadUrl("https://www.reddit.com/");
        } else if (item.equals("linkedin.com")) {
            webView_main.loadUrl("https://www.linkedin.com/uas/login?trk=guest_homepage-basic_nav-header-signin");
        } else if (item.equals("Tumblr.com")) {
            webView_main.loadUrl("https://www.tumblr.com/login");
        } else if (item.equals("Myspace.com")) {
            webView_main.loadUrl("https://myspace.com/signin");
        } else if (item.equals("Disqus.com")) {
            webView_main.loadUrl("https://disqus.com/profile/login/");
        } else if (item.equals("weebly.com")) {
            webView_main.loadUrl("https://www.weebly.com/#login");
        } else if (item.equals("en.gravatar.com")) {
            webView_main.loadUrl("http://en.gravatar.com/");
        } else if (item.equals("github.com")) {
            webView_main.loadUrl("https://github.com/login");
        } else if (item.equals("issuu.com")) {
            webView_main.loadUrl("https://issuu.com/signin?onLogin=%2F&issuu_product=header&issuu_subproduct=anon-landing-page&issuu_context=signin&issuu_cta=log_up");
        } else if (item.equals("soundcloud.com")) {
            webView_main.loadUrl("https://soundcloud.com/signin");
        } else if (item.equals("medium.com")) {
            webView_main.loadUrl("https://medium.com/");
        } else if (item.equals("deviantart.com")) {
            webView_main.loadUrl("https://www.deviantart.com/users/login");
        } else if (item.equals("last.fm")) {
            webView_main.loadUrl("https://secure.last.fm/login");
        } else if (item.equals("scribd.com")) {
            webView_main.loadUrl("https://www.scribd.com/login");
        } else if (item.equals("behance.net")) {
            webView_main.loadUrl("https://adobeid-na1.services.adobe.com/renga-idprovider/pages/login?callback=https%3A%2F%2Fims-na1.adobelogin.com%2Fims%2Fadobeid%2FBehanceWebSusi1%2FAdobeID%2Ftoken%3Fredirect_uri%3Dhttps%253A%252F%252Fwww.behance.net%252F%253Fisa0%253D1%2523from_ims%253Dtrue%2526old_hash%253D%2526api%253Dauthorize%26state%3D%257B%2522ac%2522%253A%2522behance.net%2522%257D&client_id=BehanceWebSusi1&scope=AdobeID%2Copenid%2Cgnav%2Csao.cce_private%2Ccreative_cloud%2Ccreative_sdk%2Cbe.pro2.external_client%2Cadditional_info.roles&denied_callback=https%3A%2F%2Fims-na1.adobelogin.com%2Fims%2Fdenied%2FBehanceWebSusi1%3Fredirect_uri%3Dhttps%253A%252F%252Fwww.behance.net%252F%253Fisa0%253D1%2523from_ims%253Dtrue%2526old_hash%253D%2526api%253Dauthorize%26response_type%3Dtoken%26state%3D%257B%2522ac%2522%253A%2522behance.net%2522%257D&display=web_v2&state=%7B%22ac%22%3A%22behance.net%22%7D&relay=0f2c0905-45e7-4d6d-92d9-50562a056dc4&locale=en_US&flow_type=token&idp_flow_type=login");
        } else if (item.equals("evernote.com")) {
            webView_main.loadUrl("https://www.evernote.com/Login.action");
        } else if (item.equals("bitly.com")) {
            webView_main.loadUrl("https://bitly.com/a/sign_in");
        } else if (item.equals("blogtalkradio.com")) {
            webView_main.loadUrl("https://secure.blogtalkradio.com/login.aspx?f=h&ReturnUrl=http://www.blogtalkradio.com/");
        } else if (item.equals("scoop.it")) {
            webView_main.loadUrl("https://www.scoop.it/");
        } else if (item.equals("slack.com")) {
            webView_main.loadUrl("https://slack.com/signin");
        } else if (item.equals("quora.com")) {
            webView_main.loadUrl("https://www.evernote.com/Login.action");
        } else if (item.equals("twitter.com")) {
            webView_main.loadUrl("https://twitter.com/login");
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