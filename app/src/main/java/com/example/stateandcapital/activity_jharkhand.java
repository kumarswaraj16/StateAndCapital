package com.example.stateandcapital;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class activity_jharkhand extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jharkhand);

        ArrayList<String> jharkhand = new ArrayList<>();

        jharkhand.add("Jharkhand is the 28th state of Indian union which came to existence on 15 Nov 2000. Jharkhand shares its border with 5 states – Bihar in the north, Uttar Pradesh and Chhattisgarh in West, Odisha in the south and West Bengal in the east. Jharkhand, famously known as ‘The Land of Forests’ is an ultimate destination for nature lovers and wildlife enthusiasts.");
        jharkhand.add("The Capital of Jharkhand is Ranchi");
        jharkhand.add("State Symbols of Jharkhand:\n" +
                "1. Date of formation\t15. Nov. 2000\n" +
                "2. Languages\tHindi, Urdu, Santhali\n" +
                "3. State animal\tElephant\n" +
                "4. State bird\t Asian Koel\n" +
                "5. State flower\tPalash\n" +
                "6. State tree\tSal\n" +
                "7. Major Crops\tPaddy, wheat, maize");
        jharkhand.add("National Parks and Wildlife Sanctuaries:\n" +
                "1. Betla (Palma) National Park\n" +
                "2. Hazaribagh Wildlife Sanctuary");
        jharkhand.add("Rivers:\n" +
                "1. Aon\n" +
                "2. Kosi\n" +
                "3. Ghagra\n" +
                "4. Damodar\n" +
                "5. Mayurakshi\n" +
                "6. Barakar\n");
        jharkhand.add("Major Dance and Music Forms:\n" +
                "1. Agni and Jhumar dances\n");
        jharkhand.add("Famous Places in Jharkhand:\n" +
                "1. Baidyanath Jyotirlinga, Deoghar – is also known as Baba Dham and Baidyanath Dham is one of the twelve Jyotirlingas of Lord Shiva There are 22 temples in the campus of different Gods and Goddesses and Shravan Mela during the holy month of Shravan celebrate here every year.\n" +
                "\n" +
                "2. Jubilee Park of Jamshedpur is one of the major attractions for tourists all across the state. The Park is spread at 200 acres and has a zoo, amusement park, garden and fountains.\n" +
                "\n" +
                "3. Shikharji Mountain Peak, Giridih  Shikharji is the highest mountain of the Parasnath Range in Giridih district of Jharkhand and a famous Jain pilgrimage site with many Jain Temples.\n" +
                "\n" +
                "4. Maithon Dam is one of the top 10 tallest dams in India and first of its kind in the whole of South East Asia with the underground power station, designed for flood control on the Barakar River near Dhanbad. The biggest reservoir in Damodar Valley has a unique underground power station, spread over an area of 65 square kilometres.\n" +
                "\n" +
                "5. Rock Garden of Ranchi is situated at a distance of about 4 km from Ranchi town. Ranchi Rock Garden is one of the top 5 fabulous rock gardens of India.\n" +
                "\n" +
                "6. Naulakha Temple of Deoghar after Baidyanath Jyotirlinga temple, situated 1.5 km away from the Baba Baidyanath Temple. This temple is similar in architecture to the temple of Ramakrishna in Belur Math and the construction cost around 9 lakhs, hence known as the Naulakha Temple.\n" +
                "\n" +
                "7. The Hundru waterfall in Ranchi is the  34th highest waterfall in India with a total height of 98 metres (322 ft). Hundru Falls is created by Subarnarekha River and the fall is one of the highest waterfalls in the state of Jharkhand.\n" +
                "\n" +
                "8. Tata Steel Zoological Park also known as Tata Zoo is situated near the area of Jubilee Park and known for a number of wild animals. Tata Zoo and Ranchi Zoo are two most famous wild animal parks in Jharkhand.\n" +
                "9. Betla National Park is located in the Chota Nagpur Plateau in Latehar district and home to a wide variety of wildlife. The protected area of Betla Park was one of the first wildlife parks to become a tiger reserve under Project Tiger in India.");
        jharkhand.add("Famous Personalities from Jharkhand:\n" +
                "1. Mahendra Singh Dhoni – The famous cricketer and captain of the Indian team in ODIs were born in Ranchi.\n" +
                "2. Meenakshi Sheshadri – Popular actress of Hindi films and winner of Miss India in the year 1981 was born in Sindri.\n" +
                "3. Priyanka Chopra – Famous Bollywood actress and winner of Miss World title in the year 2000 was born in Jamshedpur.\n" +
                "4. Tanushree Dutta – Famous Bollywood actress and winner of Miss India title in the year 2004 was born in Jamshedpur.\n" +
                "5. Famous politicians like Subodh Kant Sahay, Arjun Munda, Shibu Soren, Madhu Koda, Raghuvar Das were born in Jharkhand (the then Bihar State).\n");
        jharkhand.add("Jamshedpur city along with Tata Steel Plant was established in the year 1907 by Jamshetji Tata. Tata Steel Ltd which was formerly known as Tata Iron and Steel Company Ltd (TISCO) is the first private Iron and Steel company of India.");
        jharkhand.add("The state is rich in mineral resources such as iron ore, coal, mica, limestone, graphite, asbestos, dolomite etc. and accounts for 40 % of the total mineral resources of India.\n");
        jharkhand.add("Listed below is the airports in Jharkhand:\n" +
                "\n" +
                " \t  Airport Name\t  City Served\t  Category\n" +
                "  Chakulia Airport\t  Chakulia\t  Domestic\n" +
                " \t  Deoghar Airport\t  Deoghar\t  International\n" +
                " \t  Birsa Munda Airport\t  Ranchi\t  International\n" +
                "  Dhanbad Airport\t  Dhanbad\t  Domestic\n" +
                "  Bokaro Airport\t  Bokaro\t  Private\n" +
                "  Sonari Airport\t  Jamshedpur\t  Domestic");


        ArrayAdapter<String> jharkhandAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,jharkhand);

        ListView listView = (ListView)findViewById(R.id.jharkhandList);

        listView.setAdapter(jharkhandAdapter);

    }
}
