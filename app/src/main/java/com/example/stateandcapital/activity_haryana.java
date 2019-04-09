package com.example.stateandcapital;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class activity_haryana extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_haryana);

        ArrayList<String> haryana = new ArrayList<>();

        haryana.add("Haryana is considered one of the wealthier states of India. Much agriculture, automobile and other industries are located in Haryana. Due to the number of industries located in this state, Haryana helped sufficiently in food production in the 1960s during the Green Revolution. The word “Haryana” literary means “the Forest Land of Hari.”");
        haryana.add("The capital of Haryana is Chandigarh.");
        haryana.add("The High Court of Haryana is located in Haryana.");
        haryana.add("Parliamentary Constituency:\n" +
                "1. Rajya Sabha 5\n" +
                "2. Lok Sabha 10");
        haryana.add("State Symbols:\n" +
                "1. Language\tHaryanvi\n" +
                "2. Animal\tBlackbuck\n" +
                "3. Bird\tBlack francolin\n" +
                "4. Flower\tLotus\n" +
                "5. Tree\tPeepal");
        haryana.add("Wildlife Sanctuaries:\n" +
                "1. Abubshehar  Wildlife Sanctuary\n" +
                "2. Bhindawas  Wildlife Sanctuary\n" +
                "3. Bir Shikargarh  Wildlife Sanctuary\n" +
                "4. Chinchilla  Wildlife Sanctuary\n" +
                "5. Kalesar  Wildlife Sanctuary\n" +
                "6. Khaparwas  Wildlife Sanctuary\n" +
                "7. Morni Hills (Khol-Hi-Raritan) Wildlife Sanctuary\n" +
                "8. Nahar  Wildlife Sanctuary");
        haryana.add("National Parks of Haryana:\n" +
                "1. Sultanpur National Park\n" +
                "2. Kalesar National Park");
        haryana.add("Rivers of Haryana:\n" +
                "1. The Yamuna flows along the state’s eastern boundary.\n" +
                "2. Haryana’s main seasonal river, the Ghaggar rises in the outer Himalayas.\n" +
                "3. The seasonal Markanda River is a stream, which in ancient times was known as the Aruna.\n" +
                "4. Three other rivulets the Indori, Dohan and Kasavati all flow from East to West.");
        haryana.add("Famous places in Haryana:\n" +
                "1. Cantonment Church Tower\n" +
                "2. Dargah Noori\n" +
                "3. European Soldiers Grave\n" +
                "4. Gateway of Old Mughal Sarai\n" +
                "5. Kalander Shah Tomb\n" +
                "6. Karna Tank\n" +
                "7. Kushan Stupa\n" +
                "8. Old Badshahi Bridge\n" +
                "9. Sita Mai Temple\n" +
                "10. Taraori Sarai\n" +
                "11. Miran Sahib Tomb\n");
        haryana.add("Famous Personalities of Haryana:\n" +
                "1. Parineeti Chopra, born in Ambala\n" +
                "2. Juhi Chawla, born in Ambala is an Indian actress who appears mainly in Bollywood films.\n" +
                "3. Om Puri, born in Ambala.\n" +
                "4. Sonu Nigam, born in Faridabad.\n" +
                "5. Baba Ramdev, born in Mahendragarh.\n" +
                "6. O.P. Jindal, Former Member of Parliament, Haryana Power Minister, Founder — Jindal Group of Companies, hailing from Hissar.\n" +
                "7. Arvind Kejriwal, from Hisar, Haryana, the Chief Minister of Delhi.\n" +
                "8. Piyush Goyal (born 1964, Mumbai), From Uklana Mandi, Non-resident Haryanvi politician, Power Minister in Modi Govt.\n" +
                "9. Saina Nehwal, born in Hisar (city).\n" +
                "10. Kapil Dev, born in Haryana.\n" +
                "11. Mohit Sharma\n" +
                "12. Yogeshwar Dutt");
        haryana.add("Other Facts about Haryana:\n" +
                "1. Haryana is the largest producer of passenger cars, tractors, motorcycles, bicycles, refrigerators, scientific instruments, etc.\n" +
                "2. Haryana is the largest exporter of Basmati rice to the overseas market.\n" +
                "3. Panipat handlooms and carpets are known all over the world besides its famous Pachranga Aachar (pickles).\n" +
                "4. HARYANA, the first Indian state who achieved full rural electrification.\n" +
                "5. More than 75 % population, rely on the Agriculture sector. Haryana is the second largest producer of food grains in India after Punjab.");
        haryana.add("Listed below is the airports in Haryana:\n" +
                "\n" +
                " \t  Airport Name\t  City Served\t  Category\n" +
                " \t  Chandigarh International Airport\t Chandigarh\t  International\n" +
                "  Hisar Airport\t  Hisar\t  Flying School & Club\n" +
                " \t  Karnal Airport\t  Karnal\t  Flying School");

        ArrayAdapter<String> haryanaAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,haryana);

        ListView listView = (ListView)findViewById(R.id.haryanaList);

        listView.setAdapter(haryanaAdapter);

    }
}
