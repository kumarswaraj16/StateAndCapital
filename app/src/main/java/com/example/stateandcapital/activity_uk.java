package com.example.stateandcapital;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class activity_uk extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uk);

        ArrayList<String> uk = new ArrayList<>();

        uk.add("Uttarakhand, earlier known as Uttaranchal, referred to the “Land of the Gods”. Uttarakhand is a great pilgrimage centre and it is a major destination for Hindu Temples. It came into existence 9th November 2000.");
        uk.add(" Its Official Languages are Hindi and Sanskrit whereas Garhwali, Kumaoni also can be heard in Uttarakhand.");
        uk.add(" Its Capital City is Dehradun. Its largest city is also Dehradun. Located in the foothills of the Himalayas, the State has international boundaries with China (Tibet) in the north and Nepal in the east. On its north-west lies Himachal Pradesh while on the south is Uttar Pradesh.");
        uk.add("State Symbols of Uttarakhand:\n" +
                "Animal\tAlpine Musk Deer\n" +
                "Bird\tHimalayan Monal\n" +
                "Flower\tBrahma Kamal\n" +
                "Tree\tBurans");
        uk.add("Wildlife Sanctuaries in Uttarakhand:\n" +
                "1. Askot Musk Deer Wildlife Sanctuary\n" +
                "2. Nandhaur Wildlife Sanctuary\n" +
                "3. Binsar Wildlife Sanctuary\n" +
                "4. Govind Pashu Vihar Wildlife Sanctuary\n" +
                "5. Kedarnath Wildlife Sanctuary\n" +
                "6. Mussoorie Wildlife Sanctuary\n" +
                "7. Sonanadi Wildlife Sanctuary\n");
        uk.add("National Parks in Uttarakhand:\n" +
                "1. Corbett National Park\n" +
                "2. Gangotri National Parkimages\n" +
                "3. Govind National Park\n" +
                "4. Nanda Devi National Park\n" +
                "5. Rajaji National Park\n" +
                "6. Valley of Flowers National Park");
        uk.add("Rivers of Uttarakhand:\n" +
                "1. Alaknanda River\n" +
                "2. Asan Barrage\n" +
                "3. Baur River\n" +
                "4. Bhagirathi River\n" +
                "5. Bhilangna River\n" +
                "6. Darma River\n" +
                "6. Gola River\n" +
                "7. Gori Ganga\n" +
                "8. Jahnavi River\n" +
                "9. River Pushpawati\n" +
                "10. Saraswati River (Uttarakhand)\n" +
                "11. Sharda River\n" +
                "12. Song river (Dehradun)\n" +
                "13. Tons River\n" +
                "14. Vasukiganga River\n" +
                "15. Yamuna");
        uk.add("Famous places in Uttarakhand:\n" +
                "1. Dehradun\n " +
                "2. Nainital\n" +
                "3. Mussoorie\n" +
                "4. Rishikesh \n" +
                "5. Haridwar\n" +
                "6. Kedarnath \n" +
                "7. Badrinath");
        uk.add("Famous personalities of Uttarakhand:\n" +
                "1. Govind Ballabh Pant, recipient of Bharat Ratna India’s highest civilian award, Pantnagar University on his name.\n" +
                "2. Anushka Sharma, Film actress\n" +
                "3. Ruskin Bond, English writer\n" +
                "4. Abhinav Bindra – Shooter and won Olympic gold in the 10 m Air Rifle event in 2008.\n" +
                "5. Bachendri Pal – Mountaineer who in 1984 became the first Indian woman to reach the summit of Mount Everest.");
        uk.add("The only state where forest cover is increasing. It is mainly due to the huge success of Chipko (to stick) movement. People, in response to the reckless deforestation, would hug the trees, not allowing them to be cut");
        uk.add("Airports in Uttarakhand are:\n" +
                "1. The Jolly Grant Airport, also known as Dehradun Airport is the major airport in Uttarakhand. Located about 25 km east of the city of Dehradun, the airport is situated at the foothills of the Himalayas.\n " +
                "2. The Pant Nagar Airport is a domestic airport located in Pant Nagar, Uttarakhand.  It is the only airport in the Kumaon region of the state and is quite important for tourists as it connects them to popular travel destinations like Nainital, Ranikhet, Jim Corbett National Park, Bhimtal and Almora.\n" +
                "3. Bharkot Airport (Chinyalisaur Airstrip), Uttarkashi\n" +
                "4. Gauchar Airport, Chamoli which is located on the Badrinath Highway of the Chamoli District, Uttarakhand\n "+
                "5. Naini Saini Airport, Pithoragarh which is located in the beautiful city of Pithoragarh of the Kumaon Region of Uttarakhand");


        ArrayAdapter<String> ukAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,uk);

        ListView listView = (ListView)findViewById(R.id.ukList);

        listView.setAdapter(ukAdapter);


    }
}
