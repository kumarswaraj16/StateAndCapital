package com.example.stateandcapital;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class activity_meghalaya extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meghalaya);

        ArrayList<String> meghalaya = new ArrayList<>();

        meghalaya.add("Meghalaya, a hilly strip in eastern India, covers a total area of just 22,429 sq km. It was originally a part of Assam, but on 21 January 1972, the districts of Khasi, Garo and Jaintia hills became a part of this beautiful northeastern state. Shillong, the capital of the state is a popular hill station. There are several falls in and around Shillong. The Shillong peak is highest in the state and is good for trekking. It is also known as the ‘abode of the gods’ and has excellent views.");
        meghalaya.add("State Symbols of Meghalaya:\n" +
                "1. State Animal\tClouded Leopard\n" +
                "2. State Bird\tHill Myna\n" +
                "3. State Flower\tLady Slipper Orchid\n" +
                "4. State Tree\tGamhar\n" +
                "5. Major Crops\tPotato, Cotton, Pineapple, Orange\n" +
                "6. Languages\tKhasi, Garo, Jaintia, Bengali, Assamese, English");
        meghalaya.add("National Parks and Wildlife Sanctuaries in Meghalaya:\n" +
                "1. Nokrek National Park\n" +
                "2. Balpakram National Park\n" +
                "3. Nongkhyllem Wildlife sanctuary\n" +
                "4. Nokrek Biosphere Reserve\n" +
                "5. Siju Bird Sanctuary");
        meghalaya.add("Rivers in Meghalaya:\n" +
                "1. Simsang\n" +
                "2. Manda\n" +
                "3. Darming\n" +
                "4. Ringge\n" +
                "5. Gamol\n" +
                "6. Bugi");
        meghalaya.add("Major Dance and Music forms:\n" +
                "1. Shad Sukmynsiem\n" +
                "2. Shad Nongkrem\n" +
                "3. Doregata dances\n");
        meghalaya.add("Famous Places in Meghalaya:\n" +
                "1. Shillong: The capital of this state, Shillong is also known as Scotland of the East. It is a hill station and has rolling hills and narrow lanes that remind you of Scotland.\n" +
                "2. Don Bosco Museum of Indigenous Cultures: The Don Bosco Museum situated in Shillong is one of the major tourist destinations of Meghalaya. A visit to this place will make you privy to the rich, multi-cultural lifestyle of the indigenous people of the entire north-eastern states of India.\n" +
                "3. Mawsmai Cave: Mawsmai Cave located in Cherrapunji is an experience of a lifetime that every traveller should have. There are narrow paths that are entwined with each other.\n" +
                "4. Garo Hills: Garo Hills is situated in the western part of Meghalaya. Garo Hills are home to Nokrek Biosphere Reserve (pictured above), Balpakram National Park and also the Siju Wildlife Sanctuary.\n" +
                "5. Elephant Falls: The structure on the black rocks resembles an elephant and hence the name. The rock structure was destroyed during an earthquake.\n" +
                "6. Nohkalikai Falls: Located near Cherrapunji in Meghalaya, Nohkalikai Falls are the tallest in India flowing from a height of 1115 feet (340 mt). The force of the water is so strong that there is a waterhole that has been carved.");
        meghalaya.add("Famous Personalities of Meghalaya\n" +
                "1. Arundhati Roy (Shillong) – The author of the novel The God of Small Things:\n" +
                "2. Patricia Mukhim – A renowned journalist and social activist, Patricia Mukhim has become one of the credible voices of the society.\n" +
                "3. James Micheal Lyngdoh  – was the Chief Election Commissioner of India from 2001 to 2004.\n" +
                "4. Tipriti Kharbangar, an integral member of the blues band Soulmate, is regarded as one of the finest blues singers to have emerged from this part of the country.\n" +
                "5. Rudy Wallang plays, sings and also writes the songs. Along with Tipriti, he is regarded as one of the best Blues singers in the country.\n" +
                "6. Ronnie Lahiri is one of the note-worthy producers in the Hindi film industry. Ronnie is one of the many unknown Shillongites who is slowly but surely making their mark in the competitive industry.\n" +
                "7. Manas Chaudhuri is a former MLA who was also the editor of the most widely circulated English daily of Meghalaya, The Shillong Times.");
        meghalaya.add("On January 21, 1972, the new state of Meghalaya was formed. The districts included were Khasi hills, Jaintia hills and Garo hills.");
        meghalaya.add("The literal meaning of the term “Meghalaya” is “Abode of Clouds”.");
        meghalaya.add("Shillong Airport, (IATA: SHL, ICAO: VEBI) also known as Umroi Airport, is a civilian airport located at Umroi, 30 km (19 mi) from Shillong, Meghalaya, India. The airport was constructed in the mid-1960s and became operational in the mid-1970s.");


        ArrayAdapter<String> meghalayaAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,meghalaya);

        ListView listView = (ListView)findViewById(R.id.meghalayaList);

        listView.setAdapter(meghalayaAdapter);
    }
}
