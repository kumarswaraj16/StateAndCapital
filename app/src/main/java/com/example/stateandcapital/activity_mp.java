package com.example.stateandcapital;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class activity_mp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mp);

        ArrayList<String> mp = new ArrayList<>();

        mp.add("Madhya Pradesh (MP) state is situated in central India. The state is bordered by different states – to its northeast lies Uttar Pradesh, to its southeast lies Chhattisgarh, to its south lies Maharashtra, to its west lies Gujarat and to its northwest lies Rajasthan.");
        mp.add("This state is popularly known as the Heart of India. ");
        mp.add("MP’s capital is Bhopal, and the largest city is Indore. Madhya Pradesh is the second biggest state in India when it comes to the area. ");
        mp.add("Forests & National Park in Madhya Pradesh\n" +
                "1. Wildlife Parks: Bandhavgarh, Kanha , Kanha, Madhav (Shivpuri), Indravati Bandhavgarh,\n" +
                "2. Wildlife Sanctuaries: Bori, Gangau, Indravati National Par, National Chambal (Gharial), Sanjay/Dubari, Noradehi, Barnawapara, Sitanadi, Achanakmar.\n");
        mp.add("Major Rivers in Madhya Pradesh:\n" +
                "1. Chambal\n" +
                "2. Betwa\n" +
                "3. Sindh\n" +
                "4. Narmada\n" +
                "5. Tapti\n" +
                "6. Mahanadi\n" +
                "7. Indravati\n" +
                "8. Son");
        mp.add("Famous Places in Madhya Pradesh:\n" +
                "1. Amarkantak\tSource of Narmada\n" +
                "2. Asirgarh\tFort of the Legendary Asa Ahir\n" +
                "3. Badoh-Pathari\tJain Temples, 9th cent\n" +
                "4. Bhilai\tSteel Plant\n" +
                "5. Bhimbaithaka\tRock Paintings, Prehistoric Cave Paintings\n" +
                "6. Bagh Caves\tBuddhist Caves like Ajanta\n" +
                "7. Bhojpur\tRaja Bhoj’s unfinished Temple\n" +
                "8. Burhanpur\tMumtaz Mahal was initially buried here\n" +
                "9. Panna\tHistorical Diamond Mines\n" +
                "10.Pawaya\tAncient Padmawati. Capital of Naga Kings");
        mp.add("The main rivers of MP are Chambal, Betwa, Sindh, Narmada, Tapti, Mahanadi and Indravati.");
        mp.add("The highcourt of MP is located in Jabalpur, with two benches at Gwalior and Indore.");
        mp.add("Kanha National park which is also a tiger reserve is the largest National Park of MP. The famous novel Jungle book by “Rudyard Kipling” draws its inspiration from the forests of Kanha National Park.");
        mp.add("Social and Cultural Facts about Madhya Pradesh:\n" +
                "1. Ujjain is one of the four places where Kumbh mela is organised in every 12 years. It is situated on the banks of Kshipra river. The other 3 places are Nashik, Allahabad and Haridwar.\n" +
                "2. Sanchi is famous for its Buddhist monuments.\n" +
                "3. 2 out of 12 Jyotirlings of Shiva are located in Madhya Pradesh. These are – Omkareshwar and Mahakaleshwar of Ujjain.\n" +
                "4. Kanha national park near Jabalpur is one of the most beautiful wild life sanctuaries.\n" +
                "5. Khajuraho once the capital of Chandel rulers was the epitome of great artistic activity between 9th and 12th centuries.\n" +
                "6. Kandariya Mahadev and Dulhadeo Temple of Khajuraho are the famous architectural majesty of Chandel rulers in Medieval period.\n" +
                "7. Khajuraho temples which are famous for its erotic sculptures are visited by tourists from all over the world.\n" +
                "8. Madhya Pradesh has largest strength of tribals among Indian States.\n" +
                "9. The main tribal groups are Gond, Bhil, Baiga, Korku, Bhadia , Kaul, Malto and Sahariya. Dhar, Jhabua and Mandla districts have more than 50 percent tribal population.\n" +
                "10.Popular Folk dances are – Matki, Gangaur, Badhai, Baredi, Naurata and Bhagoria.");
        mp.add(" Economic Facts about Madhya Pradesh:\n" +
                "1. The major industries of MP are BHEL at Bhopal, Security paper mills at Hoshangabad, Bank Note Press at Dewas, Newsprint mill at Nepanagar and Alkaloid factory at Neemuch.\n" +
                "2. Panna is the most famous diamond mine of Madhya Pradesh and India.\n" +
                "3. Balaghat is famous for Bauxite, Copper and Dolomite.\n" +
                "4. Betul and Chhatarpur are famous for fire clay, China clay and Coal reserves");
        mp.add("Famous persons of Madhya Pradesh:\n" +
                "1. Chandra Shekhar Azad – was the eminent freedom fighter who was born in present Alirajpur district of Madhya Pradesh. His actual name was Chandra Shekhar Tiwari. Azad was adopted surname.\n" +
                "2. Kailash Satyarthi – who is a famous children rights activist won the Noble Peace Prize in sharing with Malala Yousufzai of Pakistan. He was born in Vidisha of MP.\n" +
                "\n" +
                "3. Makhanlal Chaturvedi – was the eminent person who contributed in Hindi Literature. He was conferred with first Sahitya Akadmi Award in year 1955. He was born in Hoshangabad district.\n" +
                "\n" +
                "4. Sharad Joshi – was the famous Hindi poet, writer and essayist and scriptwriter. The serial Laptaganj which aired on Sab TV is based on his stories.\n" +
                "\n" +
                "5. Arjun Rampal – the hindi movie actor was born in Jabalpur in year 1972.\n" +
                "\n" +
                "6. Kishore Kumar – the famous legendry actor and playback singer of hindi films was born in Khandwa district of Madhya Pradesh.\n" +
                "\n" +
                "7. Lata Mangeshkar – the popular playback singer and Bharat Ratna Award winner was born in Indore of Madhya Pradesh.\n" +
                "\n" +
                "8. Johny Walker – whose actual name was Badruddin Jamaluddin Kazi worked as comedian in hindi films was born in Indore.\n" +
                "\n" +
                "9. Jaya Bachhan (Bhaduri) – the popular former actress and present member of parliament was born in Jabalpur of Madhya Pradesh.\n" +
                "\n" +
                "10. Mansoor ali Khan Pataudi, Amay Khurasia, Narendra Hirwani are the famous cricketers who are related to Madhya Pradesh.");



        ArrayAdapter<String> mpAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,mp);

        ListView listView = (ListView)findViewById(R.id.mpList);

        listView.setAdapter(mpAdapter);

    }
}
