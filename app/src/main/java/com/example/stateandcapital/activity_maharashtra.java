package com.example.stateandcapital;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class activity_maharashtra extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maharashtra);

        ArrayList<String> maharashtra = new ArrayList<>();

        maharashtra.add("Manipur is situated in the Northeast region of India. Imphal is the capital of Manipur. It literally means “The Jeweled Land”. Manipur is richly endowed with natural beauty and splendour.");
        maharashtra.add("Manipur is bordered by the Indian states of Nagaland to its north, Mizoram to its south, Assam to its west, and shares an international border with Myanmar to its east.");
        maharashtra.add("Manipur is bordered by the Indian states of Nagaland to its north, Mizoram to its south, Assam to its west, and shares an international border with Myanmar to its east.");
        maharashtra.add(" Manipur has four major river basins: the Barak River Basin (Barak Valley) to the west, the Manipur River Basin in central Manipur, the Yu River Basin in the east, and a portion of the Lanye River Basin in the north. ");
        maharashtra.add("The Barak River, the largest of Manipur, originates in the Manipur Hills and is joined by tributaries, such as the Irang, Maku, and Tuivai.");
        maharashtra.add("National parks and wildlife sanctuaries:\n" +
                "1. Keibul Lamjao National Park\n" +
                "2. Shirui National Park");
        maharashtra.add("Rivers:\n" +
                "1. Barak\n" +
                "2. Imphal\n" +
                "3. Iril\n");
        maharashtra.add("Major dance: \n" +
                "1. Ningol Chakouba\n" +
                "2. Khamba Thoibi dance\n");
        maharashtra.add("Famous places in Manipur:\n" +
                "1. Govindajee Temple: This is a Vaishnavite temple built by the former kings of Manipur. The simple but beautiful structure consists of two domes and a large congregation hall.\n" +
                "2. War Cemetery: The Commonwealth War Graves Commission maintains the graveyard. Little stone markers with bronze plaques on them commemorate the dead British and Indian soldiers of World War II.\n" +
                "3. Khonghampat Orchidarium: The sprawling land of 200 acres boasts over 110 rare varieties of orchids including a dozen endemic species.\n" +
                "4. Loktak Lake: The biggest natural freshwater lake of the northeastern region of India is the Loktak Lake. The Sendra island is situated on the lake itself and has a tourist bungalow that provides a captivating view of the lake waters.\n" +
                "5. Zoological Gardens: It houses the Sangai (the graceful brow-antlered deer) at the base of pine-clad hillocks.\n" +
                "6. Bishnupur: The place features a Vishnu temple with peculiar Chinese influence besides the Loktak Lake and also the Red Hill, where a fierce battle between the British and the Japanese took place during the World War II.\n" +
                "7. Shaheed Minar: This tall seminar at the heart of Imphal city is to commemorate the indomitable spirit of the patriotic Meitei and tribal martyrs who sacrificed their lives while fighting the British in 1891.\n" +
                "8. Keibul Lamjao National Park: Keibul Lamjao National Park is the only floating National Park in the world. It is on the Loktak Lake and is the last natural habitat of the Sangai deer of Manipur.");
        maharashtra.add("Famous Personalities of Manipur:\n" +
                "1. Hangmila Shaiza: First Woman MLA in Manipur\n" +
                "2. Laisram Birendra Kumar Singh: an eminent musicologist\n" +
                "3. Moirangthem Rajen: Sahitya Akademi Award 2016 Winner\n" +
                "4. Diana Khumanthem: highest ever  IAS ranked holder (Female) from Manipur\n" +
                "5. Haobam Paban Kumar: Award Winning Film Director\n" +
                "6. Kshetri Rajen: Awardee of Sahitya Akademi Award 2015\n" +
                "7. Samjetsabam Sarjubala: International Boxing Champion\n" +
                "8. Laishram Mema: The Melody Queen of Manipur");
        maharashtra.add(" Imphal International Airport is the only airport in India");


        ArrayAdapter<String> maharashtraAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,maharashtra);

        ListView listView = (ListView)findViewById(R.id.maharashtraList);

        listView.setAdapter(maharashtraAdapter);

    }
}
