package com.example.stateandcapital;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class activity_jk extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jk);

        ArrayList<String> jk = new ArrayList<>();

        jk.add("Jammu and Kashmir is a state in northern India. It is located mostly in the Himalayan mountains. It shares a border with the states of Himachal Pradesh and Punjab to the south. Jammu and Kashmir have an international border with China in the north and east.");
        jk.add("The Line of Control separates it from the Pakistan-controlled territories of Azad Kashmir and Gilgit-Baltistan in the west and northwest respectively. The state has special autonomy under Article 370 of the Constitution of India.");
        jk.add("");
        jk.add("Present Day Facts about Jammu and Kashmir:\n" +
                "1. Jammu and Kashmir consisting of three regions: Jammu(25.93%), the Kashmir Valley(15.73%) and Ladakh(58.33%). The Kashmir valley is famous for its beautiful mountainous landscape, and Jammu’s numerous shrines attract tens of thousands of Hindu pilgrims every year.\n" +
                "2. Ladakh, also known as “Little Tibet”, is renowned for its remote mountain beauty and Buddhist culture.\n" +
                "3. Jammu and Kashmir is home to several valleys such as the Kashmir Valley, Tawi Valley, Chenab Valley, Poonch Valley, Sind Valley and Lidder Valley. Because of Jammu and Kashmir’s wide range of elevations, its biogeography is diverse.\n" +
                "4. The Jhelum River is the only major Himalayan river which flows through the Kashmir valley. The Indus, Tawi, Ravi and Chenab are the major rivers flowing through the state. Jammu and Kashmir is home to several Himalayan glaciers.");
        jk.add("Major Cities:\n" +
                "1. Municipal corporations: 2 – Srinagar, Jammu\n" +
                "2. Municipal councils: 6 – Udhampur, Kathua, Poonch, Anantnag, Baramulla, Sopore\n" +
                "3. Municipal boards: 21 – Samba, Ranbirsinghpora, Akhnoor, Reasi, Ramban, Doda, Bhaderwah, Kishtwar, Kargil, Dooru-Verinag, Bijbehara, Pulwama, Tral, Badgam, Kulgam, Shopian, Ganderbal, Pattan, Sumbal, Kupwara, Handwara");
        jk.add("The High Court of Jammu and Kashmir is located in Jammu and Kashmir");
        jk.add("Srinagar is the Summer capital and Jammu is the winter capital of Jammu and Kashmir.");
        jk.add("State Symbols:\n" +
                "1. State animal\tKashmir stag\n" +
                "2. State bird\tBlack-necked crane(Hangul)\n" +
                "3. State flower\tLotus\n" +
                "4. State tree\tChinar");
        jk.add("Seats:\n" +
                "1. Assembly Seats\t89 (87 elected; 2 nominated)\n" +
                "2. Lok Sabha Seats\t6\n" +
                "3. Rajya Sabha Seats\t4");
        jk.add("Wildlife Sanctuaries:\n" +
                "1. Baltal-Thajwas  Wildlife Sanctuary\n" +
                "2. Changthang Cold Desert  Wildlife Sanctuary\n" +
                "3. Gulmarg  Wildlife Sanctuary\n" +
                "4. Hirapora  Wildlife Sanctuary\n" +
                "5. Hokersar  Wildlife Sanctuary\n" +
                "6. Jasrota  Wildlife Sanctuary\n" +
                "7. Karakoram (Nubra Shyok)  Wildlife Sanctuary\n" +
                "8. Lachipora  Wildlife Sanctuary\n" +
                "9. Limber  Wildlife Sanctuary\n" +
                "10. Nandini  Wildlife Sanctuary\n" +
                "11. Overa Aru  Wildlife Sanctuary\n" +
                "12. Rajparian  Wildlife Sanctuary\n" +
                "13. Ramnagar Rakha  Wildlife Sanctuary\n" +
                "14. Surinsar Mansar  Wildlife Sanctuary\n" +
                "15. Trikuta  Wildlife Sanctuary");
        jk.add("National Parks:\n" +
                "1. City Forest (Salim Ali) National Park\n" +
                "2. Dachigam National Park\n" +
                "3. Hemis National Park\n" +
                "4. Kishtwar National Park");
        jk.add("Famous Temples in Jammu and Kashmir:\n" +
                "1. Shankaracharya Temple\n" +
                "2. Hari Parbat Fort & Temple of Sharika Devi\n" +
                "3. Kheer Bhawani\n" +
                "4. Martand\n" +
                "5. Awantipur\n" +
                "6. Chhatti Padshahi Gurudwara");
        jk.add("Main Festivals:\n" +
                "1. Baisakhi(Sikh festival)\n" +
                "2. Eid-ul-Fitr and Eid-ul-Azha, Urs (Muslim festivals)\n" +
                "3. Hemis Festival(Buddhist festival)\n" +
                "4. Dussehra\n" +
                "5. Diwali\n" +
                "6. Vaishno Devi");
        jk.add("Dances:\n" +
                "1. Dumhal\n" +
                "2. Rouff");
        jk.add("Major Airports in Jammu and Kashmir:\n" +
                "1. Srinagar International Airport\n" +
                "2. Jammu Airport\n" +
                "3. Poonch Airport\n" +
                "4. Kargil Airport\n" +
                "5. Kushok Bakula Rimpochee Airport");
        jk.add("Some Famous Personalities:\n" +
                "1. Suresh Raina, Indian International Cricket Team\n" +
                "2. Chain Singh, Indian national shooting team\n" +
                "3. Anupam Kher, actor\n" +
                "4. N. Kaul, Comptroller and Auditor General of India, Padma Bhushan\n" +
                "5. Omar Abdullah, Chief Minister of Jammu & Kashmir\n" +
                "6. T.S. Thakur, incumbent Chief Justice of India\n" +
                "7. Sheikh Abdullah, Former Chief Minister of Jammu & Kashmir\n" +
                "8. Jitendra Singh, BJP’s National Executive member and Chief Spokesperson for the state of Jammu and Kashmir\n" +
                "9. Bansi Kaul, Hindi theatre director and founder of Rang Vidushak who was awarded Padma Shri\n" +
                "10. Vikrant Mahajan, Former Mr India, motivational speaker, bestselling author and film producer\n");

        ArrayAdapter<String> jkAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,jk);

        ListView listView = (ListView)findViewById(R.id.jkList);

        listView.setAdapter(jkAdapter);
    }
}
