package com.example.diptamahardhika.demolistview;
//source: https://guides.codepath.com/android/Using-an-ArrayAdapter-with-ListView


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;

import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private LemaAdapter adapter;


    //Array of options --> array adapter --> ListView

    //List view: {view: da_items.xml}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        populateListView();
//        registerClickCallback();
    }

//    private void registerClickCallback() {
//        RecyclerView list = (RecyclerView) findViewById(R.id.dictList);
//        list.setOn(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View viewClicked, int position, long id) {
//
//                String message = "You clicked #" + position ;
//                Toast.makeText(MainActivity.this,message, Toast.LENGTH_LONG).show();
//            }
//        });
//    }

    private void populateListView() {
        // Create list of items
       Lema satu = new Lema("blue", "biru", "laut");
       Lema dua = new Lema("red", "merah", "darah");
       Lema tiga = new Lema("green", "hijau", "daun");
        Lema empat = new Lema("green1", "hijau", "daun");
        Lema lima = new Lema("green2", "hijau", "daun");
        Lema enam = new Lema("green3", "hijau", "daun");


        //build adapter
       List<Lema> data = new ArrayList<>();


        data.add(satu);
        data.add(dua);
       data.add(tiga);
        data.add(empat);
        data.add(lima);
        data.add(enam);


        //configure list view
      //  ListView list = (ListView) findViewById(R.id.dictList);
        recyclerView = (RecyclerView) findViewById(R.id.dictList);
        adapter = new LemaAdapter(this,data);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
