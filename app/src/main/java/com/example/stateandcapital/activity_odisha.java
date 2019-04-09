package com.example.stateandcapital;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class activity_odisha extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_odisha);

        ArrayList<String> odisha = new ArrayList<>();

        odisha.add("Odisha is located on the east coast of India facing the Bay of Bengal. It was created on 1st April 1936 during the British Period. The foundation day of Odisha, also known as Utkala Dibasa, is celebrated every year on the first day of April. The term “Utkala” that appears in our National Anthem denotes this region.");
        odisha.add("Odisha is surrounded by West Bengal, Jharkhand, Chhattisgarh and Andhra Pradesh. ");
        odisha.add("The Capital city, Bhubaneshwar, is the largest city. ");
        odisha.add("Odisha High Court is in Cuttack");
        odisha.add("State symbols of Odisha:\n" +
                "Music\tBande Utkala Janani\n" +
                "Dance\tOdissi\n" +
                "Animal\tSambar\n" +
                "Bird\tIndian Roller\n" +
                "Flower\tAshoka\n" +
                "Tree\tSacred fig");
        odisha.add("National Parks in Odisha:\n" +
                "1. Bhitarkanika National Park\n" +
                "2. Simlipal National Park\n");
        odisha.add("");
        odisha.add("Famous Places:\n" +
                "1. BHUBANESWAR\n" +
                "2. PURI\n" +
                "3. KONARK\n");
        odisha.add("Famous Personalities of Odisha:\n" +
                "1. Sam Pitroda\n" +
                "2. Nandita Das\n" +
                "3. Sudarshan Patnaik\n" +
                "4. Subhas Chandra Bose\n");
        odisha.add("Biju Patnaik International Airport is located in Bhubaneshwar");

        ArrayAdapter<String> odishaAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,odisha);

        ListView listView = (ListView)findViewById(R.id.odishaList);

        listView.setAdapter(odishaAdapter);


    }
}
