package com.example.stateandcapital;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class activity_mizoram extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mizoram);

        ArrayList<String> mizoram = new ArrayList<>();

        mizoram.add("Mizoram is one of the seven sisters of Northeast India, bordered by Myanmar (formerly known as Burma) to its east and south, Bangladesh to its west, and the states of Manipur, Assam, and Tripura to its north. Mizoram means ‘Land of the Highlanders’. ");
        mizoram.add("The capital Mizoram is Aizwal");
        mizoram.add("State Symbols of Mizoram:\n" +
                "1. Date of Formation\tFeb 20, 1987\n" +
                "2. Languages\tMizo, Hindi, English\n" +
                "3. Neighbours State\tTripura, Assam, Manipur\n" +
                "4. State Animal\tHillock Gibbon\n" +
                "5. State Bird\tMrs Hume’s Pheasant\n" +
                "6. State Tree\tIron Wood\n" +
                "7. State Flower\tThar Senhri");
        mizoram.add("National Parks and Wildlife Sanctuaries:\n" +
                "1. Phawngpui Blue Mountain National Park\n" +
                "2. Murlen National Park\n" +
                "3. Dampa Tiger Reserve\n" +
                "4. Tawi Wildlife Sanctuary");
        mizoram.add("Rivers:\n" +
                "1. Chimtuipui River\n" +
                "2. Tlawng\n" +
                "3. Talu\n" +
                "4. Tuirial");
        mizoram.add("Major Dance: \n" +
                "1. Khuallam\n" +
                "2. Chheih Lam\n" +
                "3. Cheraw");
        mizoram.add("Popular Cultural Festivals in Mizoram:\n" +
                "1. Mim Kut: The Mim Kut festival is normally observed in the months of August and September, following the cultivation of maize. People observe this festival by dancing, singing, drinking, and eating.\n" +
                "2. Pawl Kut:  The Pawl Kut festival refers to a straw harvesting festival since the word Paul stands for straw. The festival is normally held in the month of December every year.\n" +
                "3. Chapchar Kut: The Chapchar Kut is one more important festival which is observed in the month of March, following the conclusion of their most difficult job of Jhum manoeuvre, that is, forest-clearing (removal of the leftovers of burning).");
        mizoram.add("Famous Places in Mizoram:\n" +
                "1. Tualchang is the biggest monolith in Mizoram. Tualchang is situated near Tualchang village in the Aizawl district. Tualchang is a line of stone blocks.\n" +
                "2. Sibuta LungSibuta Lung is one of the most popular sites in Mizoram. Sibuta Lung is a memorial stone that was erected about 300 years by the Palian chief. The memorial Sibuta Lung offers a story of jilted love and lust for revenge.\n" +
                "3. Tomb of Vanhimailan was built in the memory of Vanhimailan Sailor. Vanhimailian Sailo was a great chief who ruled over Champhai. It overlooks the vast Champhai plain.\n" +
                "4. Phawngui, also known as the Blue Mountain, is the highest peak of Mizoram and is considered to be the abode of Gods. Phawngpui located in the Chhimtuipui district is famous for rhododendron and orchids.\n" +
                "5. Mangkahia Lung is a memorial stone which was erected in the memory of Mangkhaia in 1700 AD. It is a very large memorial stone also called Mangkhaia’s stone.\n" +
                "6. Mizoram State Museum has wildlife specimen as well as tribal artefacts and weapons, musical instruments and clothing from various tribes. It reflects the historical and cultural journey of Mizoram.");
        mizoram.add("Lengpui Airport is the only airport in India");
        mizoram.add("The name is derived from Mi (individuals), Zo (lofty place, for example, a slope) and Ram (land), and thus ‘Mizoram’ implies “land of the hill people”.");
        mizoram.add("\n" +
                "The Palak lake is the biggest in Mizoram and covers 30 hectares (74 acres). The lake is situated in Saiha district of southern Mizoram. It is believed that the lake was created as a result of an earthquake or a flood.");

        ArrayAdapter<String> mizoramAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,mizoram);

        ListView listView = (ListView)findViewById(R.id.mizoramList);

        listView.setAdapter(mizoramAdapter);
    }
}
