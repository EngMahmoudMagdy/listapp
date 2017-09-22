package com.magdy.listapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by engma on 9/11/2017.
 */

public class GridAdapter extends BaseAdapter {
    Context context  ;
    List<String>images;
    GridAdapter(Context context , List<String>images)
    {
        this.context = context ;
        this.images = images;
    }
    @Override
    public int getCount() {
        return images.size();
    }

    @Override
    public Object getItem(int i) {
        return images.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater  = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(R.layout.grid_item,viewGroup,false);
        Picasso.with(context).load(images.get(i)).into((ImageView) view.findViewById(R.id.image));
        return view;
    }
}
