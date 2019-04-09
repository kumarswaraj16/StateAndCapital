package com.example.stateandcapital;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class activity_wb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wb);

        ArrayList<String> wb = new ArrayList<>();

        wb.add(" West Bengal is a state in eastern India. It is the nation’s fourth-most populous state, with over 91 million inhabitants.");
        wb.add("The capital of West Bengal is Kolkata");
        wb.add("State Symbols:\n" +
                "State Animal\tFishing Cat\n" +
                "State River\tHooghly and Damodar\n" +
                "State Bird\tWhite-Throated Kingfisher\n" +
                "State Sport\tFootball\n" +
                "State Flower\tNight Flowering Jasmine\n" +
                "State Tree\tDevil Tree\n" +
                "State Dance\tGaudiya Nritya");
        wb.add("Seats:\n" +
                "Assembly Seats\t295 Members(unicameral)\n" +
                "Lok Sabha Seats\t42\n" +
                "Rajya Sabha Seats\t16\n");
        wb.add("Wildlife Sanctuaries:\n" +
                "1. Ballavpur WLS\n" +
                "2. Bethuadahari WLS\n" +
                "3. Bibhuti Bhusan WLS\n" +
                "4. Buxa WLS\n" +
                "5. Chapramari WLS\n" +
                "6. Chintamani Kar Bird Sanctuary\n" +
                "7. Haliday Island WLS\n" +
                "8. Jorepokhri SalamanderWLS\n" +
                "9. Lothian Island WLS\n" +
                "10. Mahananda WLS\n" +
                "11. Raiganj WLS\n" +
                "12. Ramnabagan WLS\n" +
                "13. Sajnakhali WLS\n" +
                "14. Senchal WLS\n" +
                "15. West Sunderban WLS");
        wb.add("National Park:\n" +
                "1. Buxa National Park\n" +
                "2. Gorumara National Park\n" +
                "3. Neora Valley National Park\n" +
                "4. Singalila National Park\n" +
                "5. Sunderban National Park\n" +
                "6. Jaldapara National Park");
        wb.add("Famous Temples in West Bengal:\n" +
                "1. Dakshineswar Temple\n" +
                "2. Kalighat Kali Temple\n" +
                "3. Mayapur\n" +
                "4. Tarakeshwar\n");
        wb.add("Main Festivals:\n" +
                "1. Kalpataru Utsab – January 1 of every year is celebrated as Kalpataru Day at Dakshineshwar and kossipore uddyanbati.\n" +
                "2. 21 February – Bengali language Day.\n" +
                "3. Bengali New Year.\n" +
                "4. Bhai Phonta.\n" +
                "5. Kali Puja/Lakshmi Puja.\n" +
                "6. Durga Puja: The Durga Puja is the main festival which is celebrated in West Bengal. Durga Puja is the most important hindu festival of Bengalis. This festival is celebrated with musuc, dance and drama for 10 days. During these days, the devotees worship the ten-armed goddesses Durga in various beautifully illuminated and decorated pandals. On the last day, the clay figures of the goddess Durga are carried out in procession to be immersed in the river Ganges.\n" +
                "7. Ganga Sagar Mela, Mahesh YATRA, Id, Muharram, Holi, Diwali are the other festivals which are celebrated in West Bengal.\n");
        wb.add("Dance:\n" +
                "1. Chau dance of Purulia is a rare form of mask dance.\n" +
                "2. Gambhira Dance\n" +
                "3. Brita Dance\n" +
                "4. Santhal Dance\n" +
                "5. Tusu Dance\n" +
                "6. Lathi Dance\n");
        wb.add("Major Airports in West Bengal:\n" +
                "Netaji Subhash Chandra Bose International Airport");
        wb.add("Some Famous Personalities:\n" +
                "1. Rabindranath Tagore Nobel Prize in Literature, 1913\n" +
                "2. Bankim Chandra Chatterjee\n" +
                "3. Swami Vivekananda\n" +
                "4. Amitav Ghosh\n" +
                "5. Jhumpa Lahiri\n" +
                "6. Amartya Sen, Nobel Prize Awardee in Economics\n" +
                "7. Sushmita Sen\n" +
                "8. Pranab Mukherjee\n" +
                "9. Sourav Ganguly, Former Indian Captain, Athletico de Kolkatta Co-Owner\n" +
                "10. Leander Paes noted Lawn tennis player of India\n" +
                "11. Saurav Ghosal, currently highest ranked Indian player.\n" +
                "12. Anirban Lahiri, Indian Golfer");
        wb.add("Calcutta High Court is the High Court of West Bengal");

        ArrayAdapter<String> wbAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,wb);

        ListView listView = (ListView)findViewById(R.id.wbList);

        listView.setAdapter(wbAdapter);

    }
}
