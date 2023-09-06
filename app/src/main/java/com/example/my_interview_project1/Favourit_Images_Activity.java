package com.example.my_interview_project1;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ValueAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.airbnb.lottie.LottieAnimationView;

public class Favourit_Images_Activity extends AppCompatActivity {
    ImageView fav_img;
   ImageView icon;
   Button sbotton;
   LottieAnimationView lottie;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourit_images);
        fav_img=findViewById(R.id.fav_img);
        icon=findViewById(R.id.icon);
        sbotton=findViewById(R.id.sbutton);
        lottie=findViewById(R.id.lottie);


     lottie.animate().translationX(2000).setDuration(2000).setStartDelay(2900);


       new Handler().postDelayed(new Runnable() {
           @Override
           public void run() {
               int poss=getIntent().getIntExtra("position",0);


               icon.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       Intent intent=new Intent(Favourit_Images_Activity.this, Open_Fav_Img_Activity.class);
                       intent.putExtra("position",poss);
                       startActivity(intent);
                   }
               });


               if (poss==0)
               {
                   fav_img.setImageResource(Config.img[poss]);
               }
               if (poss==1)
               {
                   fav_img.setImageResource(Config.img[poss]);
               }
               if (poss==2)
               {
                   fav_img.setImageResource(Config.img[poss]);
               }
               if (poss==3)
               {
                   fav_img.setImageResource(Config.img[poss]);
               }
               if (poss==4)
               {
                   fav_img.setImageResource(Config.img[poss]);
               }
               if (poss==5)
               {
                   fav_img.setImageResource(Config.img[poss]);
               }
               if (poss==6)
               {
                   fav_img.setImageResource(Config.img[poss]);
               }
               if (poss==7)
               {
                   fav_img.setImageResource(Config.img[poss]);
               } if (poss==8)
               {
                   fav_img.setImageResource(Config.img[poss]);
               }


               sbotton.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View v) {
                       Intent intent=new Intent(Favourit_Images_Activity.this, Open_Fav_Img_Activity.class);
                       startActivity(intent);
                   }
               });


           }
       },3000);




    }
}