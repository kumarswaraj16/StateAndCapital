package com.example.stateandcapital;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class activity_manipur extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manipur);

        ArrayList<String> manipur = new ArrayList<>();

        manipur.add("Maharashtra is a state in the western region of India and is the nation’s third largest state by area and is also the world’s second-most populous sub-national entity.");
        manipur.add("High Court\tBombay High Court\n" +
                "Chief Justice\tJustice Mohit Shah\n" +
                "Capital Mumbai\t(Winter Capital – Nagpur)\n" +
                "Number of Districts\t36");
        manipur.add("Maharashtra After Independence:\n" +
                "1. The British governed western Maharashtra as part of the Bombay Presidency. After India’s independence, the Bombay Presidency was formed in 1950.\n" +
                "2. In 1956, the States Reorganisation Act reorganized the Indian states along linguistic lines and Bombay Presidency State was enlarged.\n" +
                "3. The present state of Maharashtra was formed on May 1, 1960.\n" +
                "4. The word “Maharashtra” was derived from Sanskrit words Maha (“great”) and Rashtra (“nation/dominion”) formally known as “Great Nation”.\n");
        manipur.add("State Symbols of Maharashtra:\n" +
                "1. Language\tMarathi\n" +
                "2. Song\tJai Maharashtra Majha\n" +
                "3. Dance\tLavani\n" +
                "4. Animal\tIndian giant squirrel\n" +
                "5. Bird\tGreen Imperial Pigeon\n" +
                "6. Flower\tLagerstroemia speciosa\n" +
                "7. Tree\tMango\n" +
                "8. Sports\tKabaddi");
        manipur.add("Seats:\n" +
                "1. Legislature Bicameral\t(288 + 78)\n" +
                "2. Loksabha\t48\n" +
                "3. Rajyasabha\t19");
        manipur.add("National Parks in Maharashtra:\n" +
                "1. Chandoli National Park\n" +
                "2. Gugamal National Park\n" +
                "3. Nawegaon National Park\n" +
                "4. Pench National Park\n" +
                "5. Sanjay Gandhi (Borivilli) National Park\n" +
                "6. Tadoba National Park");
        manipur.add("UNESCO Heritage Sites:\n" +
                "1. Chhatrapati Shivaji Terminus\n" +
                "2. Ajanta Caves\n" +
                "3. Ellora Caves\n" +
                "4. Elephanta Caves");
        manipur.add("Famous Temples in Maharashtra:\n" +
                "1. Siddhivinayak Temple, Mumbai\n" +
                "2. Mahalakshmi Temple, Mumbai\n" +
                "3. Bhimashankar Temple, Pune\n" +
                "4. Trimbhakeshwar Temple, Nashik\n" +
                "5. Kailash Temple, Ellora\n" +
                "6. Walkeshwar Temple, Mumbai\n" +
                "7. Mumbadevi Temple, Mumbai\n");
        manipur.add("Other Heritage Sites:\n" +
                "1. The Marvelous Fort of Pune – Shaniwar Wada\n" +
                "2. Mastani Mahal recreated at Raja Dinkar Kelkar Museum\n" +
                "3. The Lion’s Fort – Sinhagad Fort\n" +
                "4. Shivaji’s Childhood Palace – Lal Mahal\n" +
                "5. Kesari Wada\n" +
                "6. Vasai Fort – The Portuguese Heritage\n" +
                "7. Raigad Fort\n" +
                "8. Bibi Ka Maqbara – Deccan’s own Taj Mahal\n" +
                "9. Gateway of India");
        manipur.add("Hill Stations in Maharashtra:\n" +
                "1. Amboli\n" +
                "2. Bhandardara\n" +
                "3. Chikhaldara\n" +
                "4. Igatpuri\n" +
                "5. Jawhar\n" +
                "6. Karjat\n" +
                "7. Khandala\n" +
                "8. Lavasa\n" +
                "9. Lonavala\n" +
                "10. Mahabaleshwar\n" +
                "11. Malshej Ghat\n" +
                "12. Matheran\n" +
                "13. Mhaismal\n" +
                "14. Panchgani\n" +
                "15. Panhala\n" +
                "16. Shahapur Harshgiri\n" +
                "17. Toranmal");
        manipur.add("Festivals of Maharashtra:\n" +
                "Diwali, Makar Sankranti, Nag Panchami, Gudhi Padwa, Pola, Narali Pournima, Gokul Ashtami, Ganesh Chaturthi, Dussehra, Holi/Vasant Panchami are famous festivals of the state. The Modern Festivals include Banganga Festival, The Elephant Festival, and The Ellora Festival.");
        manipur.add("Famous Dances:\n" +
                "1. Lavani\n" +
                "2. Kala\n" +
                "3. Tamasha\n" +
                "4. Koli\n" +
                "5. Povadas\n" +
                "6. Dhangari Gaja");
        manipur.add("Some Famous Personalities:\n" +
                "1. Azim Premji – Wipro founder\n" +
                "2. Nanasaheb Parulekar, Founder Editor of Sakal\n" +
                "3. Lokmanya Bal Gangadhar Tilak, great freedom fighter Indian National Congress\n" +
                "4. B. R. Ambedkar, Drafted the constitution of India\n" +
                "5. Gopal Krishna Gokhale, Guru of Mahatma Gandhi\n" +
                "6. Anna Hazare(Kisan baburao Hazare)\n" +
                "7. Sachin Tendulkar (Cricketer)\n" +
                "8. Vikram Gokhale (Actor)\n" +
                "9. Asha Bhosle (singer)\n" +
                "10. Lata Mangeshkar (singer)\n" +
                "11. Usha Mangeshkar (singer)\n" +
                "12. Madhuri Dixit (Actress)");

        ArrayAdapter<String> manipurAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,manipur);

        ListView listView = (ListView)findViewById(R.id.manipurList);

        listView.setAdapter(manipurAdapter);

    }
}
