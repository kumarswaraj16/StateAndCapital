package com.example.stateandcapital;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class activity_nagaland extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nagaland);

        ArrayList<String> nagaland = new ArrayList<>();

        nagaland.add("Nagaland is a vibrant hill state Located in the extreme North East of India, bounded by Myanmar in the East; Assam in the West; Arunachal Pradesh and a part of Assam in the North with Manipur in the south.");
        nagaland.add("The Capital of Nagaland is Kohima");
        nagaland.add("State Symbols of Nagaland\n" +
                "Date of Formation\tDec. 1, 1963\n" +
                "State Animal\tMithun\n" +
                "State Bird\tBlyth’s Tragopan\n" +
                "State Flower\t Rhododendron\n" +
                "State Tree\tAlder\n" +
                "Major Crops\tRice, Maize, Millet, Rubber\n" +
                "Languages\tAo, Sema, Konyak, Angami, Chakhesang, Chang, Khiamniungan, Kuki\n" +
                "Official Language\tEnglish\n" +
                "Literacy\t80.11 %\n" +
                "Literacy Rank\t9th\n" +
                "Sex Ratio\t931 Females per 1000 Male\n" +
                "Sex Ratio Rank\t17th\n" +
                "No of Districts\t11");
        nagaland.add("National Parks and Wildlife Sanctuaries:\n" +
                "1. Intanki National Park\n" +
                "2. Fakim Wildlife Sanctuary\n" +
                "3. Puliebadze Wildlife Sanctuary\n" +
                "4. Rangapahar Wildlife Sanctuary\n");
        nagaland.add("Rivers:\n" +
                "1. Milak\n" +
                "2. Barak\n" +
                "3. Dhansiri\n" +
                "4. oyang\n" +
                "5. Dikhu\n" +
                "6. Zungki\n" +
                "7. Tizu");
        nagaland.add("Major Dance and Music forms:\n" +
                "1. Nruirolians (Cock dance)\n" +
                "2. Temangnetin (Fly dance)");
        nagaland.add("Festivals:\n" +
                "1. Moatsu harvest festival\n" +
                "2. Selu-enyi\n" +
                "3. Sankarni");
        nagaland.add("Famous Places in Nagaland:\n" +
                "1. Kohima War Cemetery – Kohima war cemetery is a memorial dedicated to soldiers of the 2nd British Division of the Allied Forces who died in the Second World War at Kohima, the capital of Nagaland, India, in April 1944.\n" +
                "2. Mokokchung\n" +
                "– The Mokokchung district of Nagaland is where the famous Moatsu festival is celebrated. It takes place in the month of May every year and is organized by the Ao tribe.\n" +
                "\n" +
                "3. Mount Pauna\n" +
                "– Mount Pauna is the third highest peak of Nagaland. It belongs to the Benreu range and offers you some of the most breathtaking and picturesque views you have ever witnessed.\n" +
                "\n" +
                "4. Kachari ruins –  located in Dimapur, Nagaland are the set of dome shaped pillars. These pillars were constructed in the 10th century during the Kachari civilization.\n");
        nagaland.add("Famous Personalities of Nagaland: \n" +
                "1. Neiphiu Rio\n" +
                "He is the present member of parliament from Nagaland. He served thrice as Chief Minister of Nagaland. He is also the recipient of the Mother Teresa Millenium Award (the year 2007) for his remarkable contribution to politics.\n" +
                "\n" +
                "2. K. Sankaranarayanan  A man who has to his name the tenure of serving not just one or two but three major states of India\n" +
                "3. Dr Talimeran Ao\n" +
                "the legendary sports persona was the first captain of Independent India’s Olympic Football team.");
        nagaland.add("Dimapur Airport is the only airport in Nagaland");
        nagaland.add("Nagaland is also referred to as “Falcon capital of the world”.");

        ArrayAdapter<String> nagalandAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,nagaland);

        ListView listView = (ListView)findViewById(R.id.nagalandList);

        listView.setAdapter(nagalandAdapter);
    }
}
