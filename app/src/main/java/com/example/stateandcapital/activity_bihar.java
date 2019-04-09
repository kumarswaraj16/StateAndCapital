package com.example.stateandcapital;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class activity_bihar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bihar);

        ArrayList<String> bihar = new ArrayList<>();

        bihar.add("Bihar is a state in East India. It is the 13th largest state in India. The third largest state of India by population, it is also contiguous with Uttar Pradesh to its west, Nepal to the north, the northern part of West Bengal to the east, with Jharkhand to the south");
        bihar.add("The name Bihar is derived from the Sanskrit and Pali word, Vihara (Devanagari: विहार), which means “abode”. ");
        bihar.add("The capital of Bihar is Patna");
        bihar.add("The High Court of Bihar is in Patna");
        bihar.add("Seats on Politics:\n" +
                "1. Number of Districts\t38\n" +
                "2. Assembly and Council Seats\t243 + 75 (Bicameral)\n" +
                "3. Lok Sabha Seats\t40\n" +
                "4. Rajya Sabha Seats\t16\n" +
                "5. Date of Creation\tApril 1, 1936 \n" +
                "6. First Chief Minister\tKrishna Singh\n" +
                "7. First Governor\tJames Sifton");
        bihar.add("Culture of Bihar:\n" +
                "1. Main Fairs of Bihar: Sonepur Cattle Fair, Gaya-Pitrapaksha Mela, Chatth Puja, Holi Mela.\n" +
                "2. Main Festivals of Bihar: Chattha, Sarhul, Karma etc.\n" +
                "3. Main Music of Bihar: Sohar, Sumangali, Ropnigeet, Katnigeet.\n" +
                "4. Paintings of Bihar: Patna Kalam, Madhubani Painting, Traditional wall painting of Mithiliya.\n" +
                "5. Dances of Bihar : Jatra, Karma, Natua, Jadur.");
        bihar.add("National Park:\n" +
                "1. Valmiki National Park");
        bihar.add("Wild Life Sanctuaries in Bihar:\n" +
                "1. Barela Jheel Salim Ali Bird Wild Life Sanctuary\n" +
                "2. Bhimbandh Wild Life Sanctuary\n" +
                "3. Gautam Budha Wild Life Sanctuary\n" +
                "4. Kanwarjheel Wild Life Sanctuary\n" +
                "5. Kaimur Wild Life Sanctuary\n" +
                "6. Kusheshwar Asthan Bird Wild Life Sanctuary\n" +
                "7. Nagi Dam Wild Life Sanctuary\n" +
                "8. Nakti Dam Wild Life Sanctuary\n" +
                "9. Pant (Rajgir) Wild Life Sanctuary\n" +
                "10.Udaipur Wild Life Sanctuary\n" +
                "11.Valmiki Wild Life Sanctuary\n" +
                "12.Vikramshila Gangetic Dolphin Wild Life Sanctuary");
        bihar.add("There is only one World Heritage site in Bihar and that is Mahabodhi Temple Complex at BODHGAYA: Mahabodhi Temple Complex at Bodh Gaya (Buddha Gaya), spread over an area of 4.86 hectares (12.0 acres) was inscribed in the UNESCO World Heritage List as a unique property of cultural and archaeological importance.");
        bihar.add("Some Famous Personalities of Bihar: \n" +
                "1. Aryabhatta\n" +
                "2. Chanakya\n" +
                "3. Ashoka\n" +
                "4. Guru Gobind Singh\n" +
                "5. Rajendra Prasad (First President of India)\n" +
                "6. Jai Prakash Narayan\n" +
                "7. Ramdhari Singh Dinkar (Hindi Poet)\n" +
                "8. Bismillah Khan (Shehnaai Maestro)\n" +
                "9. Girija Prasad Koirala (4 times Nepal’s PM)\n" +
                "10.Ashok Kumar (Legendary veteran Actor)");
        bihar.add("Bihar was an epicentre of knowledge, culture, power, and learning. The city Pataliputra, now Patna is the oldest continuously inhabited city in India. It is also the home of the world’s oldest university- Nalanda University, which attracts students from all over the world.");
        bihar.add("List of Airports in Bihar\n" +
                "The airport list includes commercially used (domestic and international), privately used, military and flying schools.\n" +
                "\n" +
                "Listed below is the airports in Bihar:\n" +
                "\n" +
                " \t  Airport Name\t  City Served\t  Category\n" +
                "  Darbhanga Airport\t  Darbhanga\t  Defence\n" +
                " \t  Gaya International Airport\t  Gaya\t  International\n" +
                " \t  Jogbani Airport\t  Jogbani\t  Domestic\n" +
                "  Munger Airport\t  Munger\t  Domestic\n" +
                "  Muzaffarpur Airport\t  Muzaffarpur\t  Domestic\n" +
                "  Lok Nayak Jayaprakash Airport\t  Patna\t  Domestic\n" +
                "  Purnea Airport\t  Purnea\t  Defence\n" +
                "  Raxaul Airport\t  Raxaul\t  Domestic");

        ArrayAdapter<String> biharAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,bihar);

        ListView listView = (ListView)findViewById(R.id.biharList);

        listView.setAdapter(biharAdapter);
    }
}
