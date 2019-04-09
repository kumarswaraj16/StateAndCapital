package com.example.stateandcapital;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class activity_gujarat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gujarat);

        ArrayList<String> gujarat = new ArrayList<>();

        gujarat.add(" The Land of the Legends, stands bordered by Pakistan and Rajasthan in the northeast, Madhya Pradesh in the east, and Maharashtra and the Union territories of Diu, Daman, Dadra and Nagar Haveli in the south. The Arabian Sea borders the state both to the west and the south-west.");
        gujarat.add("State Symbols of Gujarat:\n" +
                "1. Capital\tGandhinagar\n" +
                "2. Date of formation\t1. May. 1960\n" +
                "3. Governor\tShri Om Prakash Kohli\n" +
                "4. Chief Minister\tAnandiben Patel\n" +
                "5. Tourist attractions\tGir NP, Somnath Temple, Dwarka, Palitana\n" +
                "6. Festivals\tNavratri, Kite Festival, Kutch Utsav\n" +
                "7. Major dance & music forms\tBhavai\n" +
                "8. Languages\tGujarati\n" +
                "9. State Animal\tAsiatic Lion\n" +
                "10. State Bird\tGreater Flamingo\n" +
                "11. State Tree\tMango\n" +
                "12. State Flower\tGolgotha\n" +
                "13. Major Crops\tGroundnuts, cotton, tobacco\n" +
                "14. Neighbours State\tMaharashtra, Madhya Pradesh, Rajasthan\n" +
                "15. No. of Districts\t33");
        gujarat.add("Forests & National Park in Gujarat:\n" +
                "1. Gujarat has 4 national parks and 21 Sanctuaries\n" +
                "2. Asiatic Lions in Gir forest, Wild Ass in the Rann of Kutchh, Indian bustards in bird reserves, four horned Antelope and Black Buck are among many animals and birds protected in Gujarat\n" +
                "3. The Whale Shark breed on the coasts of Gujarat\n" +
                "4. Okha is a place where dugong is found\n" +
                "5. Gulf of Kutchh is India’s first Marine National Park\n" +
                "6. Dry deciduous forests Gir\n" +
                "7. Majestic grasslands Velavadar\n" +
                "8. Vast landscapes Little Rann of Kutch\n" +
                "9. Wetland habitats Nalsarovar\n" +
                "10. Marine ecosystems Pirotan Islands\n" +
                "11. Rich moist deciduous forests Dense forests of the Dangs");
        gujarat.add("Major Rivers in Gujarat:\n" +
                "1. Sabarmati\n" +
                "2. Tapi\n" +
                "3. Narmada\n" +
                "4. Daman Ganga\n" +
                "5. Dhadhar\n" +
                "6. Gomati");
        gujarat.add("Famous places in Gujarat:\n" +
                "1. Somnath temple: The Somnath temple located in Prabhas Patan near Veraval in Saurashtra on the western coast of Gujarat, India, is believed to be the first among the twelve Jyotirlinga shrines of Shiva.\n" +
                "2. Dwarkadhish Temple: Landmark Hindu temple to Krishna known for its elaborate tiered main shrine and dating from 400 BC.\n" +
                "3. Sabarmati Ashram: Sabarmati Ashram (also known as Gandhi Ashram, Harijan Ashram, or Satyagraha Ashram) is located in the Sabarmati suburb of Ahmedabad, Gujarat, adjoining the Ashram Road, on the banks of the River Sabarmati, four miles from the town hall.\n" +
                "4. Laxmi Vilas Palace, Vadodara: The term Maharaja Palace actually refers to a series of palaces in Vadodara, Gujarat, India, constructed since the Gaekwad, a prominent Maratha family.\n" +
                "5. Akshardham: Modern 10-story Hindu temple with an elaborately carved sandstone facade & nightly water/laser show.\n" +
                "6. Rani Ki Vav: Rani ki Vav is an intricately constructed stepwell situated in the town of Patan in Gujarat, India. It is located on the banks of Saraswati River.\n" +
                "7. Jama Mosque, Ahmedabad: the Iconic yellow-sandstone mosque built in 1424 by Sultan Ahmed Shah I, whose tomb lies nearby.\n" +
                "8. Science Centre, Surat: Science Centre, Surat is a multi-facility complex in Surat, Gujarat, India built by the Surat Municipal Corporation in 2009, the first of its type in western India.");
        gujarat.add("Famous Personalities of Gujarat:\n" +
                "1. Mahatma Gandhi. Mohandas Karamchand Gandhi, “Father of Our Nation” Sardar Vallabhbhai Patel.\n" +
                "2. Morarji Desai.\n" +
                "3. Narsinh Mehta.\n" +
                "4. Govardhanram Tripathi.\n" +
                "5. Vikram Sarabhai.\n" +
                "6. Jamshedji Tata.\n" +
                "7. Narendra Modi. (Current PM of India)\n" +
                "8. Dhirubhai Ambani\n" +
                "9. Uday Kotak\n" +
                "10. Pranav Mistry\n" +
                "11. Swami Dayananda Saraswati\n" +
                "12. Muhammad Ali Jinnah");
        gujarat.add("Surat is considered as the hub of diamond business in the world after Antwerp, Belgium.\n" +
                "More than 8 out of the 10 of the world’s diamonds are processed in the city Surat in Gujarat.");
        gujarat.add("Gujarat is the largest producer of milk in India.");
        gujarat.add("The first capital of Gujarat was Ahmedabad; the capital was moved to Gandhinagar in 1970.");
        gujarat.add("Gujarat has seventeen airports, which makes it the state with the highest number of operating airports in India.\n" +
                " Airport Name\t  City Served\t  Category\n" +
                "  Sardar Vallabhbhai Patel International Airport\t  Ahmedabad\t  International\n" +
                " \t  Bhavnagar Airport\t  Bhavnagar\t  Domestic\n" +
                " \t  Bhuj Airport\t  Bhuj\t  Domestic\n" +
                "  Jamnagar Airport\t  Jamnagar\t  Domestic\n" +
                "  Kandla Airport\t  Kandla\t  Domestic\n" +
                "  Keshod Airport\t  Keshod\t  Domestic\n" +
                "  Deesa Airport (Palanpur Airport)\t  Palanpur\t  Domestic\n" +
                "  Porbandar Airport\t  Porbandar\t  Domestic\n" +
                "  Rajkot Airport\t  Rajkot\t  Domestic\n" +
                "  Surat Airport\t  Surat\t  Domestic\n" +
                "  Mehsana Airport\t  Mehsana\t  Flying School\n" +
                "  Vadodara Airport\t  Vadodara\t  Domestic");
        gujarat.add("The Gujarat High Court is located in Ahmedabad. It was established on 1 May 1960 under the Bombay State Re-organisation Act, 1960 after the state of Gujarat split from Bombay State. The seat of the court is Ahmedabad.");
        gujarat.add("The world’s third largest denim manufacturer is Ahmedabad’s, Arvind Mills.");

        ArrayAdapter<String> gujaratAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,gujarat);

        ListView listView = (ListView)findViewById(R.id.gujaratList);

        listView.setAdapter(gujaratAdapter);
    }
}
