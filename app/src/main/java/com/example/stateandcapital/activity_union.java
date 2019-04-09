package com.example.stateandcapital;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class activity_union extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_union);

        ArrayList<String> uniont = new ArrayList<>();

        uniont.add("Andaman and Nicobar Islands");
        uniont.add("Chandigarh");
        uniont.add("Dadar and Nagar Haveli");
        uniont.add("Daman and Diu");
        uniont.add("Delhi");
        uniont.add("Lakshadweep");
        uniont.add("Puducherry");

        ArrayAdapter<String> uniontAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,uniont);

        ListView listView = (ListView) findViewById(R.id.uniont);

        listView.setAdapter(uniontAdapter);
    }
}
