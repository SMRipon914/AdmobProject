package com.example.easysocialmedia;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.webkit.WebView;

public class DisplayActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    RecyclerView recyclerView;
    String[]name;
    MyAdapter myAdapter;
    int image[]={R.drawable.pinterest_ic,R.drawable.facebook_ic,R.drawable.reddit_lc,R.drawable.linkedin_ic,R.drawable.tumblr_ic,
            R.drawable.myspace_ic,R.drawable.disqus,R.drawable.weebly,R.drawable.gravatar_ic,
            R.drawable.github,R.drawable.issuu,R.drawable.soundcloud,R.drawable.medium,R.drawable.deviantart,R.drawable.last,
            R.drawable.scribd,R.drawable.behance,R.drawable.evernote,R.drawable.bitly,
            R.drawable.blogtalkradio,R.drawable.scoopit,R.drawable.slack,R.drawable.quora,
            R.drawable.twitter};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        recyclerView=findViewById(R.id.recyclerView);

        name=getResources().getStringArray(R.array.name);
        myAdapter =new MyAdapter(getApplicationContext(),name,image);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this,3));

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.display, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.aboutId) {
            return true;
        }else if (id==R.id.rateId){


        }else if (id==R.id.feedbackId){
            startActivity(new Intent(getApplicationContext(),Feedback.class));
        }else if (id==R.id.exitId){
            finish();
            moveTaskToBack(true);
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.facebookActivityId) {
           Intent intent=new Intent(getApplicationContext(),ShowActivity.class);
           intent.putExtra("social_name","ourfacebook");
           startActivity(intent);
        }else if (id == R.id.twitterActivityId) {
           Intent intent=new Intent(getApplicationContext(),ShowActivity.class);
           intent.putExtra("social_name","ourtwotter");
           startActivity(intent);
        }else if (id == R.id.linkedinActivityId) {
           Intent intent=new Intent(getApplicationContext(),ShowActivity.class);
           intent.putExtra("social_name","ourlinkedin");
           startActivity(intent);
        }
         else if (id == R.id.nav_share) {
          shareOption();
        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    public void shareOption(){
        Intent intent=new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        String subject="This is very helpfull apps\n";
        String body="https://l.facebook.com/l.php?u=https%3A%2F%2Fplay.google.com%2Fstore%2Fapps%2Fdetails%3Fid%3Dcom.amar.socialmedianetwork%26hl%3Den%26fbclid%3DIwAR1Z9H1CS9sXnpU2qvsUk900FcsYNQfSwGbyR4sEyRl-NKKyqxgMZTMYN8Y&h=AT0Ordj5pX2rOumFRTMnFI5-2IEIlB-sZCNBMlhZ_2wU7G_Io-HUV7fwiPCkxu5sXe_Gp0E7gG3-pWrH0jXqvu2nbkkB6EKFXSkNUcUkTRb2ZN8ActzHSmMF7JbbmxZL9XcT6A.\n";
        intent.putExtra(Intent.EXTRA_SUBJECT,subject);
        intent.putExtra(Intent.EXTRA_TEXT,body);
        startActivity(Intent.createChooser(intent,"share with"));

    }


}
