package com.example.my_interview_project1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class Gridview_Adapter extends BaseAdapter {
    MainActivity mainActivity;
    int[] img;
    public Gridview_Adapter(MainActivity mainActivity, int[] img) {
        this.mainActivity=mainActivity;
        this.img=img;
    }

    @Override
    public int getCount() {
        return img.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View View, ViewGroup parent) {
        View view= LayoutInflater.from(mainActivity).inflate(R.layout.gridview_item_file,parent,false);
        ImageView imageView=view.findViewById(R.id.item_img);
        imageView.setImageResource(img[position]);
        return view;
    }
}
