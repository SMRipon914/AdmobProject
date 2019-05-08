package com.example.easysocialmedia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MyActivity extends AppCompatActivity {


    TextView cText;
    String[]name;
    RecyclerView myRecyclerView;
    AdapterMain adapterMain;
    int image[]={R.drawable.pinterest_ic,R.drawable.facebook_ic,R.drawable.reddit_lc,R.drawable.linkedin_ic,R.drawable.tumblr_ic,
            R.drawable.myspace_ic,R.drawable.disqus,R.drawable.weebly,R.drawable.gravatar_ic,
            R.drawable.github,R.drawable.issuu,R.drawable.soundcloud,R.drawable.medium,R.drawable.deviantart,R.drawable.last,
            R.drawable.scribd,R.drawable.behance,R.drawable.evernote,R.drawable.bitly,
            R.drawable.blogtalkradio,R.drawable.scoopit,R.drawable.slack,R.drawable.quora,
            R.drawable.twitter};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        myRecyclerView=findViewById(R.id.myRecyclerView);

        name=getResources().getStringArray(R.array.name);
        adapterMain =new AdapterMain(getApplicationContext(),name,image);
        myRecyclerView.setAdapter(adapterMain);
        myRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.save_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==R.id.save_menu){
            startActivity(new Intent(getApplicationContext(),DisplayActivity.class));
        }
        return true;
    }
}
