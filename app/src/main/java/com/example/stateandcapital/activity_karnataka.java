package com.example.stateandcapital;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class activity_karnataka extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_karnataka);

        ArrayList<String> karnataka = new ArrayList<>();

        karnataka.add(" The modern state of Karnataka was created on 1 November 1956, with the passage of the States Re-organisation Act. Earlier the state was known as the State of Mysore, it was renamed Karnataka in 1973. ");
        karnataka.add("Karnataka is the place where the two main river systems of India flow out to the Bay of Bengal. These are river Krishna and Kaveri.");
        karnataka.add("Karnataka Formation Day is Celebrated on 1 November every year and in 1956 all the Kannada language speaking- regions of south India were merged to form the state of Karnataka. Know more information about Foundation Day of Indian States.");
        karnataka.add("The capital of Karnataka is Bengaluru");
        karnataka.add("State Symbols of Karnataka:\n" +
                "1. Emblem\tGandaberunda\n" +
                "2. Language\tKannada\n" +
                "3. Song\tJaya Bharata Jananiya Tanujate\n" +
                "4. Dance\tYakshagana\n" +
                "5. Animal\tAsian elephant\n" +
                "6. Bird\tIndian Roller\n" +
                "7. Flower\tLotus\n" +
                "8. Tree\tSandalwood\n");
        karnataka.add("Seats of Karnataka State:\n" +
                "1. Legislature\tBicameral (224 + 75 seats)\n" +
                "2. Lok Sabha\t28 Seats\n" +
                "3. Rajya Sabha\t12 Seats\n");
        karnataka.add("Wildlife Sanctuaries of Karnataka:\n" +
                "1. Adichunchunagiri Wild Life Sanctuary\n" +
                "2. Arabithittu Wild Life Sanctuary\n" +
                "3. Attiveri Wild Life Sanctuary\n" +
                "4. Bhadra Wild Life Sanctuary\n" +
                "5. Bhimgad Wild Life Sanctuary\n" +
                "6. Biligiri Rangaswamy Temple Wild Life Sanctuary\n" +
                "7. Chincholi Wild Life Sanctuary\n" +
                "8. Dandeli Wild Life Sanctuary\n" +
                "9. Daroji Bear Wild Life Sanctuary\n" +
                "10. Ghataprabha Bird Wild Life Sanctuary\n" +
                "11. Gudavi Wild Life Sanctuary\n" +
                "12. Gudekote Sloth Bear Wild Life Sanctuary\n" +
                "13. Malai Mahadeshwara Wild Life Sanctuary\n" +
                "14. Melkote Temple Wild Life Sanctuary\n" +
                "15. Mookambika Wild Life Sanctuary\n" +
                "16. Nugu Wild Life Sanctuary\n" +
                "17. Pushpagiri Wild Life Sanctuary\n" +
                "18. Ranebennur Black Buck Wild Life Sanctuary\n" +
                "19. Ranganathittu Bird Wild Life Sanctuary\n" +
                "20. Ramadevara Betta Vulture Wild Life Sanctuary\n" +
                "21. Rangayyanadurga Four-horned antelope\n" +
                "22. Sharavathi Valley Wild Life Sanctuary\n" +
                "23. Shettihalli Wild Life Sanctuary\n" +
                "24. Someshwara Wild Life Sanctuary\n" +
                "25. Talakaveri Wild Life Sanctuary\n");
        karnataka.add("National Parks of Karnataka:\n" +
                "1. Anshi National Park\n" +
                "2. Bandipur National Park\n" +
                "3. Bannerghatta National Park\n" +
                "4. Kudremukh National Park\n" +
                "5. Nagarhole National Park");
        karnataka.add("UNESCO Heritage Sites of Karnataka:\n" +
                "1. Group of Monuments at Hampi\n" +
                "2. Group of Monuments at Pattadakal\n" +
                "3. Western Ghats (Shared Site)\n");
        karnataka.add("Famous Temples in Karnataka:\n" +
                "1. Udupi Sri Krishna Matha\n" +
                "2. The Marikamba Temple at Sirsi\n" +
                "3. The Sri Manjunatha Temple at Dharmasthala\n" +
                "4. Kukke Subramanya Temple and Sharadamba Temple at Shringeri\n" +
                "5. Shravanabelagola, Mudabidri and Karkala are famous for Jain history and monuments.\n" +
                "6. Kudalasangama and Basavana Bagewadi are holy sites of Lingayats.");
        karnataka.add("Other Heritage Sites of Karnataka:\n" +
                "1. The Amruteshwara Temple in Chikmagalur district\n" +
                "2. Vatapi (famous for cave temples) in Bagalkot district\n" +
                "3. Belur Temple in Hassan district\n" +
                "4. Halebidu Temple (Hoysala Temples) in Hassan district\n" +
                "5. Mysore Palace\n" +
                "6. Bhoga Nandeeshwara Temple in Nandi village\n" +
                "7. The Kempegowda Fort located in Magadi\n" +
                "8. The Golden Temple or Namdroling Monastery (Beautiful Buddhist Monastery) situated at Bylakuppe\n" +
                "9. Mirjan Fort in Uttara Kannada district\n" +
                "10. Sri Veera Narayana Temple in Belavadi village of Chikmagalur district.");
        karnataka.add("Hill Stations of Karnataka:\n" +
                "1. Nandi Hills\n" +
                "2. Kermana Gundi(Chikmagalur)\n" +
                "3. Gangamoola\n" +
                "4. Madikeri\n" +
                "5. Kudremukh\n" +
                "6. Biligiri Hills\n");
        karnataka.add("Festivals celebrated in Karnataka\n" +
                "Ganesh Chaturthi, Basava Jayanthi, Deepavali, Ramzan, Ugadi, etc. are some of the important festivals celebrated in Karnataka.");
        karnataka.add("Famous Dances of Karnataka:\n" +
                "1. Veeragase\n" +
                "2. Kamsale\n" +
                "3. Kolata\n" +
                "4. Dollu Kunitha\n" +
                "5. Yakshagana – Classical Dance Drama");
        karnataka.add("Famous Personalities: \n" +
                "1. Shakuntala Devi – Famously known as Human-Computer\n" +
                "2. Aishwarya Rai Bachchan\n" +
                "3. RK Laxman – Cartoonist\n" +
                "4. Basavaraj Rajaguru – The King of Hindustani Music\n" +
                "5. H D Devegouda – Former Prime Minister of India\n" +
                "6. Bhimsen Joshi – Khayal Singer\n" +
                "7. KV Puttappa – Greatest poet of Kannada literature\n" +
                "8. Purandara Dasa (1484-1564) – Known as the “Father of Carnatic Music”, he was born near Tirthahalli in Shivamogga (Shimoga) district.");


        ArrayAdapter<String> karnatakaAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,karnataka);

        ListView listView = (ListView)findViewById(R.id.biharList);

        listView.setAdapter(karnatakaAdapter);



    }
}
