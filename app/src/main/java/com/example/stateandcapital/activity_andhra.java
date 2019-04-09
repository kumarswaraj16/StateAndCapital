package com.example.stateandcapital;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class activity_andhra extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_andhra);

        ArrayList<String> andhra = new ArrayList<>();

        andhra.add("The Capital of Andhra Pradesh is Hyderabad");
        andhra.add("In February 2014,the Andhra Pradesh Reorganisation Act, 2014 bill was passed by the Parliament of for the formation of Telangana State comprising ten districs");
        andhra.add("High Court of judicature at Hyderabad for the states of Telangana and Andhra Pradesh");
        andhra.add("Seats of Andhra Pradesh\n" +
                "Assembly Sears – 175 + 58 (Bicameral Constituency)\n" +
                "Lok Sabha Seats – 25\n" +
                "Rajya Sabha Seats – 11");
        andhra.add("Wildlife Sanctuaries in Andhra Pradesh\n" +
                "Coringa WLS\n" +
                "Kawal WLS\n" +
                "Kolleru WLS\n" +
                "Nellapattu WLS\n" +
                "Pulicat Lake WLS\n" +
                "Rajiv Gandhi (Nagarjuna Sagar-Srisailam) WLS\n" +
                "Rollapadu WLS");
        andhra.add("National Parks in Andhra Pradesh\n" +
                "Sri Venkateswara National Park\n" +
                "Mahavir Harina Vanasthali National Park\n" +
                "Mrugavani National Park\n" +
                "Rajiv Gandhi National Park\n" +
                "Namdapha National Park\n" +
                "Mouling National Park");
        andhra.add("World Heritage Sites \n" +
                "Tirumala Venkateswara temple in the town of Tirupati in Chittoor district\n" +
                "Penchalakona Lakshmi Narasimha Swami Temple in Nellore district\n" +
                "Kanaka Durga temple in the city of Vijayawada\n" +
                "Mallikarjuna Swamy temple in srisailam of Kurnool district\n" +
                "Sri kalahasthi temple in Chittoor district");
        andhra.add("Famous places in Andhra Pradesh\n" +
                "Rajahmundry city, located on the banks of Godavari River is one of the main attraction of the state.\n" +
                "Sriharikota, located in the Nellore District is one of the main attractions of the state.\n" +
                "Satish Dhawan Space Centre, located on the banks of Sriharikota in the Nellore District is one of the main attractions of the state.\n" +
                "Mahanandi, located on the banks of Kurnool District is one of the main attractions of the state.\n" +
                "Talakona city, located on the banks of Chittoor District is one of the main attractions of the state.\n" +
                "Mypadu beach in Nellore.\n" +
                "Borra caves in Ananthagari hills near Vishakapatnam.\n" +
                "Belum caves in Kurnool district-second largest natural caves on the Indian subcontinent.\n");
        andhra.add("Famous personalities in Andhra Pradesh\n" +
                "Sarvepalli Radhakrishnan second president of India and Bharat Ratna Award Winner.\n" +
                "Sarojini Naidu – freedom fighter and poet; Bengali, married to a Telugu person.\n" +
                "Tanguturi Prakasam – known as “Andhra Kesari”\n" +
                "Alluri Sita Rama Raju – revolutionary, freedom fighter, led the Rampa Rebellion, Viplava Jyoti.\n" +
                "Potti Sreeramulu – a revolutionary, fasted to death in protest for separate Andhra Pradesh\n" +
                "Pingali Venkayya – designed the Indian national flag\n" +
                "Puchalapalli Sundaraiah – a founding member of Communist Party in India.\n" +
                "Dr D. Subbarao -(IAS) officer of Andhra Pradesh cadre. He was appointed the 22nd Governor of Reserve Bank of India (RBI).\n");
        andhra.add("Famous dances  of Andhra Pradesh\n" +
                "Changu- Andhra Pradesh\n" +
                "Classical Dance – Kuchipudi: Andhra Pradesh.");
        andhra.add("Cultural Landmarks of Andhra Pradesh\n" +
                "Major cultural landmarks include Tirumala Venkateswara Temple, an ornate hilltop shrine to Hindu’s Vishnu, in the southern part of the state. It’s visited by tens of millions of pilgrims annually.");

        ArrayAdapter<String> andhraAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,andhra);

        ListView listView = (ListView)findViewById(R.id.andhraList);

        listView.setAdapter(andhraAdapter);


    }
}
