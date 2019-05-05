package com.example.easysocialmedia;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    Context context;
    String name[];
    int image[];

    public MyAdapter(Context context, String[] name, int[] image) {
        this.context = context;
        this.name = name;
        this.image = image;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater=LayoutInflater.from(context);
       View view= layoutInflater.inflate(R.layout.simple_view,viewGroup,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final MyViewHolder myViewHolder, final int i) {
        myViewHolder.textView.setText(name[i]);
        myViewHolder.imageView.setImageResource(image[i]);
        myViewHolder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value=myViewHolder.textView.getText().toString();

                if (value.equals("Pinterest.com")){
                    Intent intent=new Intent(context,WebActivity.class);
                    intent.putExtra("name","Pinterest.com");
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    context.startActivity(intent);

                }
                else if (value.equals("Facebook.com")){
                    Intent intent=new Intent(context,WebActivity.class);
                    intent.putExtra("name","Facebook.com");
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    context.startActivity(intent);
                }else if (value.equals("Reddit.com")){
                    Intent intent=new Intent(context,WebActivity.class);
                    intent.putExtra("name","Reddit.com");
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    context.startActivity(intent);
                }else if (value.equals("linkedin.com")){
                    Intent intent=new Intent(context,WebActivity.class);
                    intent.putExtra("name","linkedin.com");
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    context.startActivity(intent);
                }else if (value.equals("Tumblr.com")){
                    Intent intent=new Intent(context,WebActivity.class);
                    intent.putExtra("name","Tumblr.com");
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    context.startActivity(intent);
                }else if (value.equals("Myspace.com")){
                    Intent intent=new Intent(context,WebActivity.class);
                    intent.putExtra("name","Myspace.com");
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    context.startActivity(intent);
                }else if (value.equals("Disqus.com")){
                    Intent intent=new Intent(context,WebActivity.class);
                    intent.putExtra("name","Disqus.com");
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    context.startActivity(intent);
                }else if (value.equals("weebly.com")){
                    Intent intent=new Intent(context,WebActivity.class);
                    intent.putExtra("name","weebly.com");
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    context.startActivity(intent);
                }else if (value.equals("en.gravatar.com")){
                    Intent intent=new Intent(context,WebActivity.class);
                    intent.putExtra("name","en.gravatar.com");
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    context.startActivity(intent);
                }else if (value.equals("github.com")){
                    Intent intent=new Intent(context,WebActivity.class);
                    intent.putExtra("name","github.com");
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    context.startActivity(intent);
                }else if (value.equals("issuu.com")){
                    Intent intent=new Intent(context,WebActivity.class);
                    intent.putExtra("name","issuu.com");
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    context.startActivity(intent);
                }else if (value.equals("soundcloud.com")){
                    Intent intent=new Intent(context,WebActivity.class);
                    intent.putExtra("name","soundcloud.com");
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    context.startActivity(intent);
                }else if (value.equals("medium.com")){
                    Intent intent=new Intent(context,WebActivity.class);
                    intent.putExtra("name","medium.com");
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    context.startActivity(intent);
                }else if (value.equals("deviantart.com")){
                    Intent intent=new Intent(context,WebActivity.class);
                    intent.putExtra("name","deviantart.com");
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    context.startActivity(intent);
                }else if (value.equals("last.fm")){
                    Intent intent=new Intent(context,WebActivity.class);
                    intent.putExtra("name","last.fm");
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    context.startActivity(intent);
                }else if (value.equals("scribd.com")){
                    Intent intent=new Intent(context,WebActivity.class);
                    intent.putExtra("name","scribd.com");
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    context.startActivity(intent);
                }else if (value.equals("behance.net")){
                    Intent intent=new Intent(context,WebActivity.class);
                    intent.putExtra("name","behance.net");
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    context.startActivity(intent);
                }else if (value.equals("evernote.com")){
                    Intent intent=new Intent(context,WebActivity.class);
                    intent.putExtra("name","evernote.com");
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    context.startActivity(intent);
                }else if (value.equals("bitly.com")){
                    Intent intent=new Intent(context,WebActivity.class);
                    intent.putExtra("name","bitly.com");
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    context.startActivity(intent);
                }else if (value.equals("blogtalkradio.com")){
                    Intent intent=new Intent(context,WebActivity.class);
                    intent.putExtra("name","blogtalkradio.com");
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    context.startActivity(intent);
                }else if (value.equals("scoop.it")){
                    Intent intent=new Intent(context,WebActivity.class);
                    intent.putExtra("name","scoop.it");
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    context.startActivity(intent);
                }else if (value.equals("slack.com")){
                    Intent intent=new Intent(context,WebActivity.class);
                    intent.putExtra("name","slack.com");
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    context.startActivity(intent);
                }else if (value.equals("quora.com")){
                    Intent intent=new Intent(context,WebActivity.class);
                    intent.putExtra("name","quora.com");
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    context.startActivity(intent);
                }else if (value.equals("twitter.com")){
                    Intent intent=new Intent(context,WebActivity.class);
                    intent.putExtra("name","twitter.com");
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    context.startActivity(intent);
                }

            }
        });

    }

    @Override
    public int getItemCount() {
        return name.length;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        TextView textView;
        ImageView imageView;
        CardView cardView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            textView=itemView.findViewById(R.id.textView);
            imageView=itemView.findViewById(R.id.imageView);
            cardView=itemView.findViewById(R.id.cardView);
        }

    }
}
