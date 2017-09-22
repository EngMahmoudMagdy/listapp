package com.magdy.listapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by engma on 9/11/2017.
 */

public class MyListAdapter extends BaseAdapter {

    Context context ;
    List<Person> persons ;
    MyListAdapter(Context context, List<Person>persons)
    {
        this.context = context ;
        this.persons = persons;

    }
    @Override
    public int getCount() {
        return persons.size();
    }

    @Override
    public Object getItem(int i) {
        return persons.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View v, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
         v= inflater.inflate(R.layout.list_item, viewGroup, false);
        TextView name = v.findViewById(R.id.name);
        TextView num = v.findViewById(R.id.num);
        name.setText(persons.get(i).getName());
        num.setText(persons.get(i).getNumber());
        ImageView imageView = v.findViewById(R.id.image);
        Picasso.with(context).load("https://upload.wikimedia.org/wikipedia/commons/3/30/Googlelogo.png").into(imageView);
        return v;
    }
}
