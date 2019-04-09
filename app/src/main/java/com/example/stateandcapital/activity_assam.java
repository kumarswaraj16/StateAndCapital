package com.example.stateandcapital;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class activity_assam extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assam);

        ArrayList<String> assam = new ArrayList<>();

        assam.add("The capital of Assam is 'Dispur'");
        assam.add("Neighbours States of Assam:\n" +
                "1. Meghalaya,\n" +
                "2. Arunachal Pradesh,\n" +
                "3. Nagaland,\n" +
                "4. Manipur,\n" +
                "5. Tripura,\n" +
                "6. Mizoram,\n" +
                "7. West Bengal");
        assam.add("The High Court of Assam is at Gauhati");
        assam.add(" National Parks In Assam:\n" +
                "1. Kaziranga National Parks,\n" +
                "2. Manas National Parks,\n" +
                "3. Rajiv Gandhi National Parks\n" +
                "4. Orang National Parks\n" +
                "5, Dibru National Park\n" +
                "6. Nameri National Park");
        assam.add("Wildlife Sanctuaries And National Parks in Assam:\n" +
                "1. Kopou phul\n" +
                "2. Bura Chapori Wildlife Sanctuary-Sonitpur\n" +
                "3. Bornadi Wildlife Sanctuary- Darrang\n" +
                "4. Sonai Rupai Wildlife Sanctuary-Sonitpur\n" +
                "5. Pobitora Wildlife Sanctuary -Marigaon\n" +
                "6. Chakrashila Wildlife Sanctuar");
        assam.add("Famous places in Assam:\n" +
                "1. Majuli\n" +
                "2. Kamakhya Temple\n" +
                "3. Umananda Temple\n" +
                "4. Srimanta Sankardev Kalakshetra\n" +
                "5. Assam State Zoo cum Botanical Garden\n" +
                "6. Agnigarh is a hillock located in Tezpur, Assam, India\n" +
                "7. Basistha temple, located in the south-east corner of Guwahati city is a Shiva mandir constructed by Ahom King Rajeswar Singha in 1764\n" +
                "8. The ancient Mahabhairav Temple is located at a hillock on the northern part of Tezpur town, Assam");
        assam.add("Famous Personalities of Assam-\n" +
                "1. Freedom fighters:\n" +
                "        a. Jyoti Prasad Agarwala\n" +
                "        b. Fakaruddin Ali Ahmed\n" +
                "        c.Kanaklata Barua\n" +
                "        d. Gopinath Bordoloi\n" +
                "2. Academicians and Scholars:\n" +
                "        a. Nabakanta Barua\n" +
                "        b.Amalendu Guha\n" +
                "        c. Mamoni Raisom Goswami\n" +
                "        d. Bhabendra Nath Saikia\n" +
                "        e. Mrinal Miri\n" +
                "3. Sportsperson:\n" +
                "        a. Shiva Thapa, boxer\n" +
                "        b. Abu Nechim, cricketer\n" +
                "        c. Anupam Sharma, international arm wrestler\n" +
                "        d. Jayanta Talukdar, archer");
        assam.add("Some famous dance and dramas include Ankia Naat, Bihu dance, Kushan nritra, Bagurumba, Bordoicikhla, Sattriya, Banjar Kekan, Mishing Bihu, etc.\n" +
                "Music is also a tradition in the state with folk songs like Borgeet, etc.");
        assam.add("Languages in Assam:\n" +
                "1. Assamese,\n" +
                "2. Bodo,\n" +
                "3. Karbi,\n" +
                "4. Bengali\n");
        assam.add("Airports in Assam:\n" +
                "1. Lokpriya Gopinath Bordoloi International Airport, Guwahati(GAU)\n" +
                "2. Dibrugarh Airport\n" +
                "3. Jorhat Airport\n" +
                "4. Silchar Airport\n" +
                "5. Lilabari Airport, Lakhimpur\n" +
                "6. Tezpur Airport");

        ArrayAdapter<String> assamAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,assam);

        ListView listView = (ListView)findViewById(R.id.assamList);

        listView.setAdapter(assamAdapter);



    }
}
