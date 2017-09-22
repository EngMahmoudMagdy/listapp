package com.magdy.listapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class TheListActivity extends AppCompatActivity {

    ListView listView ;
    String[] arr = {"Mahmoud","Ahemd","Amr","Sayed","Ahmed","Jemmy","Mena","Peter","Dexter"};
    List<Person> persons ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_list);
        listView = (ListView) findViewById(R.id.list);
        persons =new ArrayList<>();
        int y = 1 ;
        for (String i :arr)
        {
            Person person = new Person();
            person.setName(i);
            person.setNumber(String.format(Locale.getDefault(),"%d",y*2));
            y++;
            persons.add(person);
        }

        MyListAdapter adapter = new MyListAdapter(this,persons);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getBaseContext(),String.format(Locale.getDefault(),"Name: %s\nNumber: %s",persons.get(i).getName(),persons.get(i).getNumber()), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
