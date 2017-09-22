package com.magdy.listapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class GridActivity extends AppCompatActivity {

    List<String> images ;
    GridAdapter adapter ;
    GridView gridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);
        images= new ArrayList<>();
        for (int i = 0 ; i < 20; i++)
        {
            images.add("https://upload.wikimedia.org/wikipedia/commons/3/30/Googlelogo.png");
        }
        gridView = (GridView) findViewById(R.id.grid);
        adapter = new GridAdapter(this , images);
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getBaseContext(), "Hello "+i , Toast.LENGTH_SHORT).show();
            }
        });

    }
}
