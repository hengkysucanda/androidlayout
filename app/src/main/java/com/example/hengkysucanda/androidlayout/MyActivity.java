package com.example.hengkysucanda.androidlayout;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;


public class MyActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        ArrayList<Data> arrayList = new ArrayList<Data>();


        for (int i=0; i< 10;i++) {
            Data data = new Data();
            data.setTitle("Tes"+i);
            data.setImageURL("tes/tes"+i);
            data.setDescription("Ini pertama"+i);
            arrayList.add(data);
        }
        ListView myList = (ListView) findViewById(R.id.listView_something);
         MyAdapter adapter = new MyAdapter(this, arrayList);
        myList.setAdapter(adapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
