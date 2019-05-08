package com.example.easysocialmedia;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

public class AdapterMain extends RecyclerView.Adapter<AdapterMain.MViewHolder> {

    Context context;
    String name[];
    int image[];

    public AdapterMain(Context context, String[] name, int[] image) {
        this.context = context;
        this.name = name;
        this.image = image;
    }

    @NonNull
    @Override
    public MViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater=LayoutInflater.from(context);
        View view=layoutInflater.inflate(R.layout.click_view,viewGroup,false);
        return new MViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MViewHolder mViewHolder, int i) {
        mViewHolder.checkImage.setImageResource(image[i]);
        mViewHolder.checkText.setText(name[i]);


        mViewHolder.checkText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

    @Override
    public int getItemCount() {
        return name.length;
    }

    public static class MViewHolder extends RecyclerView.ViewHolder{

        CheckBox checkBox;
        TextView checkText;
        ImageView checkImage;
        public MViewHolder(@NonNull View itemView) {
            super(itemView);
            checkBox=itemView.findViewById(R.id.clickCheckbox);
            checkText=itemView.findViewById(R.id.clickText);
            checkImage=itemView.findViewById(R.id.clickImage);


        }
    }
}
