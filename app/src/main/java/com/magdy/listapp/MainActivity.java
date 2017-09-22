package com.magdy.listapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button listbut = (Button) findViewById(R.id.list);
        Button gridbut = (Button) findViewById(R.id.grid);
        Button rec = (Button) findViewById(R.id.rec);
        listbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(),TheListActivity.class);
                startActivity(intent);
            }
        });
        gridbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(),GridActivity.class);
                startActivity(intent);
            }
        });
        rec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(),RecyclerActivity.class);
                startActivity(intent);
            }
        });

    }
}
