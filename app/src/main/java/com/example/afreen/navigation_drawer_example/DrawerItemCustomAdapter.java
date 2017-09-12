package com.example.afreen.navigation_drawer_example;


import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import static android.R.attr.resource;

public class DrawerItemCustomAdapter extends ArrayAdapter<DataModel> {

    Context mContext;
    int layoutResourceId;
    DataModel data[]=null;


    public DrawerItemCustomAdapter(Context mContext, int layoutResourceId,DataModel[] data) {
        super(mContext,layoutResourceId,data);
        this.layoutResourceId=layoutResourceId;
        this.mContext=mContext;
        this.data=data;
    }

    public View getView(int position,View convertView,ViewGroup parent)
    {
        View listItem=convertView;
        LayoutInflater inflater=((Activity) mContext).getLayoutInflater();
        listItem=inflater.inflate(layoutResourceId,parent,false);
        ImageView imageViewIcon= (ImageView) listItem.findViewById(R.id.imageViewIcon);
        TextView textViewName= (TextView) listItem.findViewById(R.id.textViewName);

        DataModel folder=data[position];

        imageViewIcon.setImageResource(folder.icon);
        textViewName.setText(folder.name);
        return listItem;
    }
}
