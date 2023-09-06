package com.example.my_interview_project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  {
    GridView gridView;
    Gridview_Adapter adapter;
    Button btn1,btn2;
    int position;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView=findViewById(R.id.gridview);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);


        adapter=new Gridview_Adapter(MainActivity.this,Config.img);
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(MainActivity.this, Favourit_Images_Activity.class);
                intent.putExtra("position",position);
                startActivity(intent);
            }
        });

                btn2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(MainActivity.this, Open_Fav_Img_Activity.class);
                        intent.putExtra("position",position);
                        startActivity(intent);
                        finish();
                    }
                });
                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent=new Intent(MainActivity.this, MainActivity.class);
                        startActivity(intent);

                    }
                });







    }


}