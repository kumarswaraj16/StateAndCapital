package com.example.stateandcapital;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class activity_up extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_up);

        ArrayList<String> up = new ArrayList<>();

        up.add(" The state of Uttar Pradesh lies in the northern part of India. Its official and widely spoken languages are Hindi and Urdu. It was created on 1st April 1937 as United Province and later renamed to 1 as Uttar Pradesh.");
        up.add("Lucknow is the capital city and Prayagraj(Earlier known as Allahabad) is the Judiciary Capital of the state. There are 75 districts in Uttar Pradesh, Kanpur being the largest city in the state.");
        up.add("The State’s official motto is ‘Protection of Good, Destruction of Bad.’ Agriculture and service Industries are the largest parts of the state’s economy. Wheat, rice, pulses, oilseeds and potatoes are the major agricultural products. Sugarcane is the most important cash crop throughout the state.");
        up.add("STATE SYMBOLS:\n" +
                "Dance\tKathak\n" +
                "Animal\tSwamp Deer\n" +
                "Bird\tSarus Crane\n" +
                "Tree\tAshoka\n" +
                "Flower\tBrahma Kalash\n" +
                "Sport\tHockey, Kabbadi");
        up.add("WILDLIFE SANCTUARIES:\n" +
                "1. Ishanpur Sanctuary\n" +
                "2. National Chambal Sanctuary\n" +
                "3. Bakhihastinapur Wildlife Sanctuary\n" +
                "4. Kra Wildlife Sanctuary\n" +
                "5. Katerniaghat Wildlife Sanctuary\n" +
                "6. Kishanpur Wildlife Sanctuary\n" +
                "7. Kaimoor Wildlife Sanctuary\n" +
                "8. Chandra Prabha Wildlife Sanctuary\n" +
                "9. Mahavir Swami Wildlife Sanctuary\n" +
                "10. Ranipur Wildlife Sanctuary\n");
        up.add("BIRD SANCTUARIES:\n" +
                "1. Vijai Sagar Sanctuary\n" +
                "2. Pavarti Agra Bird Sanctuary\n" +
                "3. Surha taal Bird Sanctuary\n" +
                "4. Sur Sarovar Bird Sanctuary\n" +
                "5. Bhimrao Ambedkar Bird Sanctuary");
        up.add("NATIONAL PARKS OF UTTAR PRADESH:\n" +
                "Dudhwa National Park");
        up.add("RIVERS OF UTTAR PRADESH:\n" +
                "Ganges, Yamuna, Gomti, Chambal, Ramganga, Sarayu, Son River, Tamsa River, Ken River, Betwa River, Karmanasa River, Sharda, and Karnali.\n" +
                "\n");
        up.add("FAMOUS PLACES IN UTTAR PRADESH\n" +
                "AGRA:\n" +
                "Taj Mahal\n" +
                "Agra Fort\n" +
                "Fatehpur Sikri\n" +
                "Aram Bagh\n" +
                "Khas Mahal\n" +
                "Panch Mahal\n" +
                "Musamman Burj\n" +
                "Agra Art Gallery\n" +
                "\n" +
                "LUCKNOW:\n" +
                "Bara Imambara\n" +
                "Constania House\n" +
                "Rumi Darwaza Chattar Manzil\n" +
                "Begum Hazrat Mahal Park\n" +
                "British Residency\n" +
                "Lucknow Museum\n" +
                "\n" +
                "VARANASI:\n" +
                "Kasha Vishwanath Temple\n" +
                "Sarnath\n" +
                "Banaras Ghats\n" +
                "Archaeological Museum\n" +
                "\n" +
                "ALLAHABAD:\n" +
                "Sangam\n" +
                "Khusro Bagh\n" +
                "Allahabad Fort\n" +
                "Anand Bhavan\n" +
                "\n" +
                "KANPUR:\n" +
                "Bithoor\n" +
                "Mecca Masjid\n" +
                "\n" +
                "MATHURA:\n" +
                "Krishna Janam Bhoomi Mandir\n" +
                "Jama Masjid\n" +
                "Dwarkadhish Temple\n" +
                "Govardhan Hill\n" +
                "Raha Bharatpuras Palace\n" +
                "\n" +
                "FATEHPUR:\n" +
                "Fatehpur Sikri");
        up.add("FAMOUS PERSONALITIES OF UTTAR PRADESH:\n" +
                "1. Mangal Pandey.\n" +
                "2. Chandra Shekhar Azad.\n" +
                "3. Jawaharlal Nehru, First Prime Minister and Bharat Ratna Awardee.\n" +
                "4. Lal Bahadur Shastri, Third Prime Minister and Bharat Ratna Awardee.\n" +
                "5. Atal Bihari Vajpayee, Eleventh Prime Minister and Bharat Ratna Awardee.\n" +
                "6. Ravi Shankar, Sitar Maestro.\n" +
                "7. Amitabh Bachchan.\n" +
                "8. Hamid Ansari, Vice President of India.\n" +
                "9. Yogiraj Bharat Bhushan, Only Padmashree Awardee Yogi.\n");
        up.add("Airports in Uttar Pradesh:\n" +
                "1. Chaudhary Charan Singh International Airport is situated at Amausi in Lucknow. It is the second busiest and largest airport in Central and Northern India after Indira Gandhi International Airport.\n" +
                "2. Lal Bahadur Shastri Airport is located in Babarpur in Varanasi.\n" +
                "3. Gorakhpur Airport, now known as Sri Mahayogi Gorakhnath Airport is located in the Airport Area, Gorakhpur District.\n " +
                "4. Agra Airport also is known as Kheria Airforce Station, is a military airbase and public airport serving in the city of Agra, synonymous with the Taj Mahal.");


        ArrayAdapter<String> upAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,up);

        ListView listView = (ListView)findViewById(R.id.upList);

        listView.setAdapter(upAdapter);
    }
}
