package com.example.stateandcapital;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class activity_tn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tn);

        ArrayList<String> tn = new ArrayList<>();

        tn.add("The State of Tamil Nadu lies in the southern most part of India. Its official and widely spoken language is Tamil. There are 32 districts present in Tamil Nadu.");
        tn.add("Chennai formerly known as Madras is the Capital City of Tamil Nadu. Also, Chennai is the largest city in the state. ");
        tn.add(" The motto of the State is ‘Truth alone Triumph’");
        tn.add("High Court of Tamil Nadu is Madras High Court");
        tn.add("State Symbols\n" +
                "Dance\n" +
                "\n" +
                "Bharathanatiyam\n" +
                "\n" +
                "Animal\n" +
                "\n" +
                "Nilgiri Tahr\n" +
                "\n" +
                "Bird\n" +
                "\n" +
                "Emerald Dove\n" +
                "\n" +
                "Tree\n" +
                "\n" +
                "Palm Tree\n" +
                "\n" +
                "Flower\n" +
                "\n" +
                "Gloriosa Lily\n" +
                "\n" +
                "Sport\n" +
                "\n" +
                "Kabbadi");
        tn.add("Wildlife Sanctuaries\n" +
                "Grizzled Squirrel Wildlife Sanctuary\n" +
                "\n" +
                "Indira Gandhi Wildlife Sanctuary\n" +
                "\n" +
                "Kalakaadu Mudanthurai Wildlife Sanctuary\n" +
                "\n" +
                "Mudumalai Wildlife Sanctuary\n" +
                "\n" +
                "Kanyakumari Wildlife Sanctuary\n" +
                "\n" +
                "Sathyamangalam Wildlife Sanctuary\n" +
                "\n");
        tn.add("National Parks\n" +
                "Indira Gandhi National Park\n" +
                "\n" +
                "Mudumalai National Park\n" +
                "\n" +
                "Mukurthi National Park\n" +
                "\n" +
                "Gulf of Mannar Marine National Park\n" +
                "\n" +
                "Guindy National Park\n" +
                "\n" +
                "Kodaikanal Wildlife Sanctuary");
        tn.add("World Heritage Sites in Tamil Nadu\n" +
                "Brihdeeswarar Temple at Thanjavur\n" +
                "\n" +
                "Gangaikonda Cholapuram Temple at Jayakondam\n" +
                "\n" +
                "Airavateswara Temple at Darasuram\n" +
                "\n" +
                "Monuments of Mahabalipuram at Chennai\n" +
                "\n");
        tn.add("Famous Dances\n" +
                "Bharat Natyam is the popular traditional dance of the state.\n" +
                "\n" +
                "Kolattam, Karagam, and Mayilattam are famous folk dances.");
        tn.add("Famous Personalities of  Tamil Nadu\n" +
                "Dr APJ. Abdul Kalam, 11th President of India was born and raised in Tamil Nadu.\n" +
                "\n" +
                "Sir C.V Raman was a known Indian Physicist, won Nobel prize in Physics.\n" +
                "\n" +
                "The Great Indian Mathematician Srinivasa Ramanujan who made significant contributions to mathematical analysis, number theory, and continued fractions was born in Erode, Tamil Nadu.\n" +
                "\n" +
                "M.S. Subbulakshmi was a famous Carnatic vocalist belongs to Tamil Nadu. She was the first musician to be awarded the Bharat Ratna, India’s highest civilian honour.\n" +
                "\n" +
                "Viswanathan Anand origin of Tamil Nadu is an Indian chess Grandmaster and former World Chess Champion.\n" +
                "\n" +
                "Venkatraman Ramakrishnan is an Indian structural biologist, who won the Nobel Prize in Chemistry\n" +
                "\n" +
                "MS Swaminathan, Father of Green Revolution in India, belonged to Tamil Nadu.\n" +
                "\n" +
                "AR Rahman or the Mozart of Madras, the Academy Award Winner, is also from Tamil Nadu.\n" +
                "\n");
        tn.add("The World’s First Granite Temple is the Brihadeswara temple at Tanjavur in Tamil Nadu.");
        tn.add("The M. A. Chidambaram Stadium or Chepauk Stadium is a cricket stadium in Chennai. The stadium was established in 1916 and it the oldest continuously used cricket stadium in the country.");
        tn.add("Airports in Tamil Nadu:\n" +
                "1. Chennai International Airport\n" +
                "2. Coimbatore International Airport\n" +
                "3. Madurai International Airport\n " +
                "4. Tiruchirappalli International Airport \n" +
                "5. Tuticorin Airport\n" +
                "6. Salem Airport");

        ArrayAdapter<String> tnAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,tn);

        ListView listView = (ListView)findViewById(R.id.tnList);

        listView.setAdapter(tnAdapter);
    }
}
