package com.magdy.listapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by engma on 9/21/2017.
 */

class MyRecyclerAdapter extends RecyclerView.Adapter<MyRecyclerAdapter.Holder>{

    private Context context ;
    private List<String> links ;

    MyRecyclerAdapter(Context context , List<String>links)
    {
        this.context = context ;
        this.links  = links ;
    }
    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        final View view = LayoutInflater.from(context).inflate(R.layout.recycler_item, parent, false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(Holder holder, final int position) {
        Picasso.with(context).load(links.get(position)).into(holder.imageView);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,position,Toast.LENGTH_SHORT).show();
            }
        });
        //holder.textView.setText(links.get(position));
    }

    @Override
    public int getItemCount() {
        return links.size();
    }

    class Holder extends RecyclerView.ViewHolder{
        ImageView imageView ;

        public Holder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image);

        }
    }

}
