package com.example.stateandcapital;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class activity_arunachal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arunachal);

        ArrayList<String> arunachal = new ArrayList<>();

        arunachal.add("The capital of Arunachal Pradesh is 'Itanagar'");
        arunachal.add("Arunachal Pradesh, also called “the land of rising sun”, lies in northeast India.");
        arunachal.add("Arunachal Pradesh became an independent state on 20th February 1987. It is bounded by independent countries on the three sides and by Assam and Nagaland in the south.");
        arunachal.add("The High Court of Arunachal Pradesh is at Guwahati");
        arunachal.add("Seats in Arunachal Pradesh:\n" +
                "1. Assembly Seats: Unicameral (60 seats)\n" +
                "2. Lok Sabha Seats: 2\n" +
                "3. Rajya Sabha Seats: 1");
        arunachal.add("Wildlife Sanctuaries in Arunachal Pradesh:\n" +
                "1. D’Ering Memorial (Lali) Wild Life Sanctuary\n" +
                "2. Dibang Wild Life Sanctuary\n" +
                "3. Eaglenest Wild Life Sanctuary\n" +
                "4. Itanagar Wild Life Sanctuary\n" +
                "5. Kamlang Wild Life Sanctuary\n" +
                "6. Kane Wild Life Sanctuary\n" +
                "7. Mehao Wild Life Sanctuary\n" +
                "8. Pakhui/ Pakke Wild Life Sanctuary\n" +
                "9. Sessa Orchid Wild Life Sanctuary\n" +
                "10.Tale Valley Wild Life Sanctuary\n" +
                "11.Yordi-Rabe Supse Wild Life Sanctuary");
        arunachal.add("National Park in Arunachal Pradesh:\n" +
                "1. Mouling National Park\n" +
                "2. Namdapha National Park");
        arunachal.add("Tawang Monastery of Arunachal Pradesh – This is the second largest monastery in the world after the Potala Palace in Lhasa, Tibet.");
        arunachal.add("Main Festivals in Arunachal Pradesh:\n" +
                "1. Losar\n" +
                "2. Dree\n" +
                "3. Solung\n" +
                "4. Reh");
        arunachal.add("Major Dances in Arunachal Pradesh:\n" +
                "1. Aji Lamu (Monpa Tribe)\n" +
                "2. Chalo (Nocte Tribe)\n" +
                "3. Hiirii Khaniing (Apatani Tribe)\n" +
                "4. Lion and Peacock dance (Monpa)\n" +
                "5. Pasi Kongki (Adi)\n" +
                "6. Ponung (Adi Tribe)\n" +
                "7. Popir (Adi Tribe)");
        arunachal.add("Major Airports in Arunachal Pradesh:\n" +
                "1. Along Airport\n" +
                "2. Daporijo Airport\n" +
                "3. Itanagar Airport\n" +
                "4. Pasighat Airport\n" +
                "5. Tezu Airport\n" +
                "6. Zero Airport");
        arunachal.add("Some Famous Personalities in Arunachal Pradesh:\n" +
                "1. Tapi Mra- mountaineer from India and the first person from Arunachal Pradesh to scale Everest\n" +
                "2. Kiren Rijiju- BJP Member of Parliament; Union minister\n" +
                "3. Nabam Tuki- ex CM of Arunachal Pradesh\n");

        ArrayAdapter<String> arunachalAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,arunachal);

        ListView listView = (ListView)findViewById(R.id.arunachalList);

        listView.setAdapter(arunachalAdapter);

    }
}
