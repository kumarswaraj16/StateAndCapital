package com.example.stateandcapital;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class activity_kerala extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kerala);

        ArrayList<String> kerala = new ArrayList<>();

        kerala.add("Kerala God’s Own Country is socially the most advanced state in India.  Kerala is the land of beauty with long beaches, rivers with charming mountains.  The health care system is highly advanced. Modern hospitals here match facilities available in developed countries. Everyone is literate here and most are High School educated.");
        kerala.add("The Capital of Kerala is Thiruvananthapuram");
        kerala.add("Nick Names of Kerala:\n" +
                "1. God’s Own Country\n" +
                "2. Spice Garden of India\n" +
                "3. Land of Coconut Trees\n");
        kerala.add("Kerala High Court\tHeadquartered at Kochi, Ernakulam. It is also the highest court in the Union Territory of Lakshadweep");
        kerala.add("Wildlife Sanctuaries in Kerala:\n" +
                "1. Aralam Wildlife Sanctuary\n" +
                "2. Chimmony Wildlife Sanctuary\n" +
                "3. Chinnar Wildlife Sanctuary\n" +
                "4. Chulannur Peafowl Wildlife Sanctuary\n" +
                "5. Idukki Wildlife Sanctuary\n" +
                "6. Kottiyoor Wildlife Sanctuary\n" +
                "7. Kurinjimala Wildlife Sanctuary\n" +
                "8. Malabar Wildlife Sanctuary\n" +
                "9. Mangalavanam Bird Wildlife Sanctuary\n" +
                "10. Neyyar Wildlife Sanctuary\n" +
                "11. Parambikulam Wildlife Sanctuary\n" +
                "12. Peechi-Vazhani Wildlife Sanctuary\n" +
                "13. Peppara Wildlife Sanctuary\n" +
                "14. Periyar Wildlife Sanctuary\n" +
                "15. Shendurney Wildlife Sanctuary\n" +
                "16. Thattekad Bird Wildlife Sanctuary\n" +
                "17. Wayanad Wildlife Sanctuary");
        kerala.add("National Parks in Kerala:\n" +
                "1. Anamudi Shola National Park\n" +
                "2. Eravikulam National Park\n" +
                "3. Mathikettan Shola National Park\n" +
                "4. Pambadum Shola National Park\n" +
                "5. Periyar National Park\n" +
                "6. Silent Valley National Park");
        kerala.add(" Famous Sites:\n" +
                "1. Pallakad Fort\n" +
                "2. Napier Museum\n" +
                "3. Koyikkal Palace\n" +
                "4. Koder House\n" +
                "5. Krishna Menon Museum\n" +
                "6. Thalassery Fort");
        kerala.add("Major Cities of Kerala:\n" +
                "1. Thiruvananthapuram\n" +
                "2. Kollam\n" +
                "3. Kochi\n" +
                "4. Thrissur\n" +
                "5. Kozhikode\n");
        kerala.add("Seats:\n" +
                "1. Assembly Seats: 140+ 1 Anglo Indian Nominee\n" +
                "2. Lok Sabha Seats: 20+ 1 Anglo Indian Nominee\n" +
                "3. Rajya Sabha seats: 9");
        kerala.add("Major Dances of Kerala:\n" +
                "1. Kathakali\n" +
                "2. Mohiniattam\n" +
                "3. Theyyam\n" +
                "4. Thullal");
        kerala.add("Main Festivals of Kerala:\n" +
                "1. Onam\n" +
                "2. Vishu");
        kerala.add("Famous Waterfalls:\n" +
                "1. Athirrapally\n" +
                "2. Vazhachal\n" +
                "3. Palaruvi\n");
        kerala.add("Lakes: \n" +
                "1. Vembanad\n" +
                "2. Kayamakulam\n" +
                "3. Ashtamudi");
        kerala.add("Major Rivers:\n" +
                "1. Bharathapuzha\n" +
                "2. Chalakkudy\n" +
                "3. Kallada\n" +
                "4. Karaman\n" +
                "5. Karuvanoor\n" +
                "6. Keecheri\n" +
                "7. Kuttiadi\n" +
                "8. Neyyar\n" +
                "9. Pamba\n" +
                "10. Periyar\n" +
                "11. Thodupuzha\n");
        kerala.add("Famous Personalities of Kerala:\n" +
                "1. Sree Narayana Guru\tGreat Saint of India\n" +
                "2. Vaikom Mohammed Basheer\tFamous Writer\n" +
                "3. V K Krishna Menon\tFormer Defence Minister of India and renowned Statesman\n" +
                "4. Kumaran Asan\tFamous poet of Kerala\n" +
                "5. Kocheril Raman Narayanan\tFormer President of India\n" +
                "6. Adoor Gopalakrishnan\tOne of the leading lights of the New Indian Cinema\n" +
                "7. PT Usha\tAthlete\n" +
                "8. Dr Verghese Kurien\tFather of the white revolution\n" +
                "9. P. Krishna Pillai\tOne of the first freedom fighters of Kerala\n" +
                "10.Arundhati Roy\twriter awarded the Booker Prize in 1997 for The God of Small Things, located in Kerala. Born in Kerala");
        kerala.add("Airports In Kerala:\n" +
                "1. Trivandrum International Airport \n" +
                "2. Cochin International Airport\n" +
                "3. Calicut International Airport\n" +
                "4. Kannur International Airport");
        ArrayAdapter<String> keralaAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,kerala);

        ListView listView = (ListView)findViewById(R.id.keralaList);

        listView.setAdapter(keralaAdapter);
    }
}
