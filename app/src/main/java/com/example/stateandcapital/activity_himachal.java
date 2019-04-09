package com.example.stateandcapital;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class activity_himachal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_himachal);

        ArrayList<String> himachal = new ArrayList<>();

        himachal.add("Himachal Pradesh (literally “Snow-laden Region”) is a state in North India, forming part of the larger Punjab region.Hima means snow in Sanskrit, and the literal meaning of the state’s name is “In the lap of Himalayas”. It was named by Acharya Diwakar Datt Sharma, one of the great Sanskrit scholars of Himachal Pradesh." );
        himachal.add("The Capital Himachal Pradesh is Shimla");
        himachal.add("State Symbols of Himachal Pradesh:\n" +
                "1. State animal\tSnow leopard (Uncia uncia)\n" +
                "2. State bird\tWestern Tragopan (Tragopan melanocephalus)\n" +
                "3. State flower\tPink rhododendron\n" +
                "4. State tree\tDeodar cedar (Cedrus deodara)\n" +
                "5. State Dance\tNaati");
        himachal.add("Seats:\n" +
                "1. Assembly Seats\t68\n" +
                "2. Lok Sabha Seats\t4 (Kangra, Mandi, Hamirpur, Shimla)\n" +
                "3. Rajya Sabha Seats\t3 (BJP – 2, INC – 1)");
        himachal.add("National Parks in Himachal Pradesh:\n" +
                "1. Great Himalayan National Park\n" +
                "2. Pin Valley National Park\n" +
                "3. Inderkilla National Park\n" +
                "4. Khirganga National Park\n" +
                "5. Simbalbara National Park");
        himachal.add("UNESCO Heritage Sites:\n" +
                "1. Great Himalayan National Park\n" +
                "2. Mountain Railways Kalka – Shimla");
        himachal.add("Famous Temples in Himachal Pradesh:\n" +
                "1. Hadimba Devi Mandir in Manali\n" +
                "2. Tara Devi\n" +
                "3. Jakhoo\n" +
                "4. Hadimba\n" +
                "5. Naina Devi\n" +
                "6. Baba Balak Nath\n" +
                "7. Jawala Devi\n" +
                "8. Chintpurni\n" +
                "9. Chamunda Devi.");
        himachal.add("Main Festivals of Himachal Pradesh:\n" +
                "1. Chet (Dholru)\n" +
                "2. Naratas\n" +
                "3. Baisakhi\n" +
                "4. Haryali (Shegtsum in Lahaul, Dhakhrain in Jubbal and Kinnaur)\n" +
                "5. Grewal\n" +
                "6. Phulech (in Kinnaur)\n" +
                "7. Sair\n" +
                "8. Lohri\n" +
                "9. Nawala");
        himachal.add("Famous Fairs in Himachal Pradesh:\n" +
                "1. Baisakhi\n" +
                "2. Kullu Dussehra\n" +
                "3. Nati Dance\n" +
                "4. Lavi (Oct-Nov)\n" +
                "5. Holi Fair (in Sujanpur)");
        himachal.add("Dance of Himachal Pradesh: \n" +
                "1. The Gugga Dance\n" +
                "2. The Losar Shona Chuksam\n" +
                "3. The Ghurehi\n" +
                "4. The Kullu Naati");
        himachal.add("Major Airports in Himachal Pradesh:\n" +
                "1. Kullu Manali (Bhuntaar Airport)\n" +
                "2. Shimla (Jubbarhatti Airport)\n" +
                "3. Kangra (Gaggal Airport)");
        himachal.add("Famous Personalities of Himachal Pradesh:\n" +
                "1. Captain Vikram Batra\n" +
                "2. Anupam Kher\n" +
                "3. The Great Khali\n" +
                "4. Tenzin Gyatso\n" +
                "5. Mohit Chauhan\n" +
                "6. Charanjit Singh (Captain of Indian Hockey Team 1964. India won Gold.)\n" +
                "7. Ruskin Bond\n" +
                "8. Kangana Ranaut");

        ArrayAdapter<String> himachalAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,himachal);

        ListView listView = (ListView)findViewById(R.id.biharList);

        listView.setAdapter(himachalAdapter);
    }
}
