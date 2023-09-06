package com.example.my_interview_project1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class Open_Fav_Img_Activity extends AppCompatActivity {
    ImageView fimg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_fav_img);
        fimg=findViewById(R.id.fimg);

        int poss1=getIntent().getIntExtra("position",0);
        if (poss1==0)
        {
            fimg.setImageResource(Config.img[poss1]);
        }
        if (poss1==1)
        {
            fimg.setImageResource(Config.img[poss1]);
        }
        if (poss1==2)
        {
            fimg.setImageResource(Config.img[poss1]);
        }
        if (poss1==3)
        {
            fimg.setImageResource(Config.img[poss1]);
        }
        if (poss1==4)
        {
            fimg.setImageResource(Config.img[poss1]);
        }
        if (poss1==5)
        {
            fimg.setImageResource(Config.img[poss1]);
        }
        if (poss1==6)
        {
            fimg.setImageResource(Config.img[poss1]);
        }
        if (poss1==7)
        {
            fimg.setImageResource(Config.img[poss1]);
        }
        if (poss1==8)
        {
            fimg.setImageResource(Config.img[poss1]);
        }
    }
}