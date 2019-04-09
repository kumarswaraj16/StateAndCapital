package com.example.stateandcapital;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class activity_rajasthan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rajasthan);

        ArrayList<String> rajasthan = new ArrayList<>();

        rajasthan.add("Rajasthan is the largest state of India as per Census 2011. A major portion of the state is covered with the Thar Desert which is also known as The Great Indian Desert. It is a land of sand dunes, desert and rocks.");
        rajasthan.add("Jaipur is its Capital City.");
        rajasthan.add("Jaipur is also the largest city of the state. Jaipur is also known as the “Pink City”.");
        rajasthan.add("State Symbols of Rajasthan:\n" +
                "State animal\tCamel and chinkara\n" +
                "State bird\tIndian bustard (Ardeotis nigriceps)\n" +
                "State flower\tRohida (Tecomella undulata)\n" +
                "State tree\tKhejri (Prosopis cineraria)");
        rajasthan.add("National Parks in Rajasthan:\n" +
                "1. Desert National Park\n" +
                "2. Keoladeo Ghana National Park\n" +
                "3. Ranthambhore National Park\n" +
                "4. Sariska National Park\n");
        rajasthan.add("Famous Places in Rajasthan\n" +
                "Udaipur\n" +
                "The “City of Lakes”, the “Venice of the East”, – Udaipur is known by several names. It is also known as the “Kashmir of Rajasthan”. Udaipur is regarded as one of the most romantic cities of the World. Places to visit in the city are Pichola Lake, Fateh Sagar Lake, Jaisamand Lake, Udaisagar Lake, Lake Palace, City Palace, Sajjangarh Fort, Ranakpur Jain Temple, Ekling Ji Temple, Nathdwara Shri Nath Ji Temple, Jagmandir, Rishabhdeo Temple, Shilpgram etc.\n" +
                "\n" +
                "Nagaur\n" +
                "Nagaur is famous for its Ahhichatragarh Fort. Also inside the walls of the fort are palaces, Mughal gardens, mosques, temples, reservoirs, water systems, fountains, open terraces, etc dating to the time of Mughals. Places to visit in the city are Magnificent Fort Gateways, Meera Bai Temple, Amar Singh Mahal (Palace), Nagaur Fort etc.\n" +
                "\n" +
                "Mount Abu\n" +
                "Mount Abu is the most famous “hill station” in India. It is in Sirohi district. Places to visit in the city are Nakki Lake, Delwara Jain Temples, Brahma Kumaris Spiritual University and Museum, Achalgarh Fort etc.\n" +
                "\n" +
                "Kota\n" +
                "Kota lies along the banks of the Chambal river. The commanding fort stands to overlook the modern Chambal Valley Project with its many dams – Kota Barrage, Gandhi Sagar, Rana Pratap Sagar and Jawahar Sagar. Other noteworthy edifices of the bygone era are the Brij Raj Bhawan Palace, Jag Mandir-and island Palace, a splendid haveli (mansion) with beautiful frescoes and the royal cenotaphs. It also famous as an educational city in India because of so many educational institutes and training centres.\n" +
                "\n" +
                "Jodhpur\n" +
                "Jodhpur is known as the “Sun City” because of its bright and sunny weather throughout the year. It is divided into two parts – the old city and the new city. Jodhpur city has many beautiful palaces and forts such as Mehrangarh Fort, Jaswant Thada, Umaid Bhavan Palace and Rai ka Bag Palace. Other charms of Jodhpur include Government museum and it’s a beautiful Umed garden.\n" +
                "\n" +
                "Jhalawar\n" +
                "Jhalawar, also known as Patan or Jhalrapatan. It was the centre of trade for the eponymous princely state, the chief exports of the which were opium, oil-seeds and cotton. Places to visit in the city are Jhalawar Fort, Government Museum, Bhawani Natya Shala, Ren Basera, Gagron Fort, Atishay Jain Temple at Chandkheri etc.\n" +
                "\n" +
                "Jaisalmer\n" +
                "Jaisalmer is also called the Golden city of India because the yellow and gives a yellowish-golden touch to the city and its surrounding area. It means “the Hill Fort of Jaisal”.The Jaisalmer city is known for its old mansions, better known as Havelis. Places to visit in the city are Jaisalmer Fort, Camel Safari, Desert National Park, Pokran, Desert Cultural Center, Patwon ki Haveli etc. To come to Jaisalmer and enjoy the traditional rhetoric of ‘padharomahare desh’ (welcome to our lands).\n" +
                "\n" +
                "Jaipur\n" +
                "Jaipur is also popularly known as the “Pink City”, is the capital of the state. The Amber Fort, Jantar Mantar – the observatory, Hawa Mahal, Sisodia Rani Ka Bagh, the City Palace, Albert Hall, the Jal Mahal, the Amer Fort, B M Birla Planetarium, Galtaji, the Laxmi Narayan Temple, are some of the architectural splendours of Jaipur. Tourists stack their bags with wonderful Jaipuri textiles and artefacts as well.\n" +
                "\n" +
                "Bikaner\n" +
                "Bikaner houses the celebrated Deshnokh Temple, the abode of the sacred white mouse, that ushers good fortune. It is dotted with relics of the glorious yesteryears and is also the seat of several holy shrines. The Junagarh Fort, the Raj Ratan Bihari and Rasik Shiromani Temple, the Laxminath Temple, the Bhandasar Jain Temple and the Ganga Golden Jubilee Museum, are among the famed tourist destinations.\n" +
                "\n" +
                "Ajmer\n" +
                "Ajmer is most famous for Khwaja Mu’in-ud-Din Chisti Dargah. Other places are Adhai Din Ka Jhonpra, Lake Foy Sagar, Mayo College, Ana Sagar Lake, etc. Pushkar – Located at a distance of 14 kilometres from Ajmer, draws tourists in hordes during the famous Pushkar Fair. The Brahma Temple is yet another tourist haunt of Pushkar.");
        rajasthan.add("Famous Personalities of Rajasthan:\n" +
                "1. Gulabo (Kalbelia dancer) \n" +
                "2. Jagjit Singh\n" +
                "3. Shreya Ghoshal\n" +
                "4. Ghanshyam Das Birla\n" +
                "5. Lakshmi Mittal\n" +
                "6. Jamnalal Bajaj\n" +
                "7. Ramkrishna Dalmia\n" +
                "8. Savitri Jindal\n" +
                "9. Sunil Mittal\n" +
                "10. Rakesh Jhunjhunwala\n" +
                "11. Chanda Kochhar\n" +
                "12. Kishore Biyani of Future Group\n" +
                "13. Rajendra Mal Lodha, Chief Justice of India");
        rajasthan.add("Almost every city in Rajasthan is colour coordinated. Jaipur is pink, Udaipur is white, Jodhpur is blue and Jhalawar is purple!");
        rajasthan.add("Airports In Rajasthan:\n" +
                "Sanganer Airport (Jaipur)\n" +
                "The only international airport in Rajasthan cities is the Sanganer airport in Jaipur. It is approximately 10 km from the main city.\n" +
                "\n" +
                "Nal (Bikaner) Airport (Bikaner)\n" +
                "This is a domestic airport in the city of Bikaner. It is situated approximately 8 km from the main city. \n" +
                "\n" +
                "Kota Airport (Kota)\n" +
                "Another domestic airport in Rajasthan, it is approximately 10 km from the main city.\n" +
                "\n" +
                "Jodhpur Airport (Jodhpur)\n" +
                "Jodhpur also has a domestic airport. It is approximately 5 km away from the city center and has daily flights to Delhi, Mumbai, Udaipur and Jaipur.\n" +
                "\n" +
                "Maharana Pratap Airport (Udaipur)\n" +
                "Udaipur has the domestic Maharana Pratap airport. It is situated approximately 22 km to the south of Udaipur.\n" +
                "\n" +
                "Jaisalmer Airport (Jaisalmer)\n" +
                "The Jaisalmer domestic airport is open only from 1st October to 31st March.\n");
        rajasthan.add("The Rajasthan High Court is the High Court of the state of Rajasthan. It was established on 21 June 1949 under the Rajasthan High Court Ordinance, 1949. The seat of the court is at Jodhpur.");


        ArrayAdapter<String> rajasthanAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,rajasthan);

        ListView listView = (ListView)findViewById(R.id.rajasthanList);

        listView.setAdapter(rajasthanAdapter);
    }
}
