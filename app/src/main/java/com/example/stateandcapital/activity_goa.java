package com.example.stateandcapital;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class activity_goa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goa);

        ArrayList<String> goa = new ArrayList<>();

        goa.add(" Goa is a state in India within the coastal region known as the Konkan in western India. It is bounded by Maharashtra to the north and Karnataka to the east and south, with the Arabian Sea forming its western coast");
        goa.add(" Goa is India’s richest state, with a GDP per capita two and a half times that of the country.");
        goa.add("Capital\tPanaji\n" +
                "Date of formation\t30 May 1987");
        goa.add(" State Symbols of Goa:\n" +
                "1. State animal\tGaur\n" +
                "2. State bird\tFlame-throated bulbul\n" +
                "3. State tree\tAsna\n" +
                "4. Major Crops\tPaddy, ragi, maize, cashew\n" +
                "5. Factoids\tGoa, Daman, and Diu were liberated in 1961 and officially became a part of India in 1962.\n" +
                "6. No. of District\t2");
        goa.add("Festivals:\n" +
                "1. Carnival\n" +
                "2. Feast of St. Francis Xavier\n" +
                "3. Shigmotsav\n" +
                "4. Bonderam Festival\n");
        goa.add("Dance:\n" +
                "1. Shigmo dance\n" +
                "2. Manddo\n" +
                "3. Durpod");
        goa.add("Official Languages:\n" +
                "1. Konkani\n" +
                "2. Marathi");
        goa.add("Rivers:\n" +
                "1. Mandovi\n" +
                "2. Zuari\n" +
                "3. Tereldiol\n" +
                "4. Chapora\n" +
                "5. Sal\n" +
                "6. Talpona");
        goa.add("Wildlife sanctuaries:\n" +
                "1. Bondla wildlife sanctuaries\n" +
                "2. Modem National Park\n" +
                "3. Dr.Salim Ali Bird Sanctuary\n" +
                "4. Cotigoa wildlife sanctuaries\n" +
                "5. Bhagwan Mahavir wildlife sanctuaries");
        goa.add("Famous Personalities of Goa:\n" +
                "1. Musicians:\n" +
                "\n" +
                "    a. The nightingale of India – Lata Mangeshkar and her sister Asha Bhosale.\n" +
                "    b. Goa pop star and Bollywood playback singer – Remo Fernandes.\n" +
                "    c. Popular Indian classical singer – Kishori Amonkar\n" +
                "    d. The eminent Musician and violinist of 1950s – Anthony Gonsalves\n" +
                "2. Sports:\n" +
                "\n" +
                "    a. International tennis player – Leander Paes\n" +
                "    b. Indian footballer and Arjuna awardee – Bruno Coutinho.\n" +
                "    c. Cricketer – Dilip Sardesai.\n" +
                "3. Science:\n" +
                "\n" +
                "    a. The writer of the first major book on Indian drugs and remedies – Garcia de Orta.\n" +
                "    b. Nuclear scientist and Chairman of the Atomic Energy Commission – Anil Kakodkar.\n" +
                "    c. Head of the prestigious Council of Scientific and Industrial Research – Raghunath Mashelkar.");
        goa.add("Dabolim Airport or Goa Airport is the sole international airport in Goa. It is located in Dabolim and operates as a civil enclave in a military airbase named INS Hansa. It is 4 km from the nearest city Vasco da Gama, 23 km from Margao, and about 30 km from the state capital Panji");
        goa.add("The High Court of Goa is located in Mumbai, Maharashtra. Its jurisdiction covers the states of Maharashtra and Goa, and the Union Territories of Daman and Diu and Dadra and Nagar Haveli. The High Court has regional branches at Nagpur and Aurangabad in Maharashtra and Panaji, the capital of Goa.");

        ArrayAdapter<String> goaAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,goa);

        ListView listView = (ListView)findViewById(R.id.goaList);

        listView.setAdapter(goaAdapter);
    }
}
