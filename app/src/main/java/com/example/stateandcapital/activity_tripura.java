package com.example.stateandcapital;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class activity_tripura extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tripura);

        ArrayList<String> tripura = new ArrayList<>();

        tripura.add("");
        tripura.add("");
        tripura.add("");
        tripura.add("");
        tripura.add("");
        tripura.add("");
        tripura.add("");
        tripura.add("");
        tripura.add("");
        tripura.add("");
        tripura.add("");

        ArrayAdapter<String> tripuraAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,tripura);

        ListView listView = (ListView)findViewById(R.id.tripuraList);

        listView.setAdapter(tripuraAdapter);

    }
}
