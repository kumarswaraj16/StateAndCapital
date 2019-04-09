package com.example.stateandcapital;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class activity_chhattisgarh extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chhattisgarh);

        ArrayList<String> chhattisgarh = new ArrayList<>();

        chhattisgarh.add("Chhattisgarh is the 10th largest state in the country. On 1 November 2000, India gave birth to a new state called Chhattisgarh which was carved out of Madhya Pradesh.");
        chhattisgarh.add("The capital of Chhattisgarh is Raipur");
        chhattisgarh.add("The High Court of Chhattisgarh is in Raipur");
        chhattisgarh.add("State Symbols of Chhattisgarh\n" +
                "Capital\tRaipur\n" +
                "Date of formation\t01 / 11 / 2000\n" +
                "Languages\tHindi, Oriya, Marathi, Chhattisgarhi, Gondi, Korku\n" +
                "State Animal\tWild Water Buffalo\n" +
                "State bird\tHill Myna\n" +
                "State tree\tSal\n" +
                "Major Crops\tRice, Wheat, Niger\n" +
                "Tourist attractions\tBastar, Chitrakote Falls, Kailash and Kotamsar Caves, Mahamaya Temple\n" +
                "Net State Domestic Product (2011)\t41167\n" +
                "Literacy Rate (2011)\t71.04%\n" +
                "Females per 1000 males\t991\n" +
                "Assembly constituency\t90\n" +
                "Parliamentary constituency\t11"
               );
        chhattisgarh.add("Forests and Wildlife Sanctuaries:\n" +
                "1. Kanker Ghati National Park\n" +
                "2. Indravati National Park\n" +
                "3. Kanger Valley National Park\n");
        chhattisgarh.add("Festivals:\n" +
                "1. Pola\n" +
                "2. Nawakhai\n" +
                "3. Dussehra\n" +
                "4. Deepavali\n" +
                "5. Holi\n" +
                "6. Govardhan Pooja");
        chhattisgarh.add("Rivers:\n" +
                "1. Mahanadi\n" +
                "2. Indravati\n" +
                "3. Son\n" +
                "4. Pain\n" +
                "5. Hasdo\n" +
                "6. Sabari");
        chhattisgarh.add("Major Dance and Music Forms:\n" +
                "1. Panthi\n" +
                "2. Raut Nacha and Soowa dances\n" +
                "3. Sohar\n" +
                "4. Behav and Pathoni songs\n");
        chhattisgarh.add("Famous Places:\n" +
                "1.  Bhoramdeo Temple: Bhoramdeo Temple is a complex of Hindu temples dedicated to the god Shiva in Bhoramdeo, in the Indian state of Chhattisgarh. It comprises a group of four temples of which the earliest is a brick-temple.\n" +
                "2.  Palace Kawardha: Kawardha is a Treasure Trove of breathtaking scenery & fascinating reminders of India’s rich cultural heritage. This lovely property was built in the 1930s by Maharaj Dharamraj Singh using the best Italian marble and stone, stands out in the 11 acres of lush green garden. ");
        chhattisgarh.add("Chhattisgarh is known as “Dhan Ka Katora” means “Rice Bowl of India”.");
        chhattisgarh.add("India’s biggest waterfall is situated in Bastar, Chhattisgarh.");
        chhattisgarh.add("List of Airports in Chhattisgarh\n" +
                "The airport list includes commercially used (domestic and international), privately used, military and flying schools.\n" +
                "\n" +
                "Listed below is the airports in Chhattisgarh:\n" +
                "\n" +
                " \t  Airport Name\t  City Served\t  Category\n" +
                "  Bilaspur Airport\t  Bilaspur\t  Flying School\n" +
                " \t  Raigarh Airport\t  Raigarh\t  Domestic\n" +
                " \t  OP Jindal Airport\t  Raigarh\t  Private\n" +
                "  Jagdalpur Airport\t  Jagdalpur\t  Domestic\n" +
                "  Swami Vivekananda Airport\t  Raipur\t  Domestic");

        ArrayAdapter<String> chhattisgarhAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,chhattisgarh);

        ListView listView = (ListView)findViewById(R.id.biharList);

        listView.setAdapter(chhattisgarhAdapter);

    }
}
