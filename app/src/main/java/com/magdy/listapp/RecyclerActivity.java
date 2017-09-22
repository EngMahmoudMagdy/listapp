package com.magdy.listapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;

public class RecyclerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler);
        List<String> links = new ArrayList<>();
        MyRecyclerAdapter adapter = new MyRecyclerAdapter(this,links);
        StaggeredGridLayoutManager layoutManager =  new StaggeredGridLayoutManager(2,1);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
        for(int i = 0 ; i < 20 ; i++)
        {
            links.add("https://upload.wikimedia.org/wikipedia/commons/3/30/Googlelogo.png");
        }
        adapter.notifyDataSetChanged();
    }
}
