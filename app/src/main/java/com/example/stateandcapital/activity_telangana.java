package com.example.stateandcapital;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class activity_telangana extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telangana);

        ArrayList<String> telangana = new ArrayList<>();

        telangana.add("Telangana is one of the 29 states in India, located in southern India. Telangana is bordered by the states of Maharashtra to the north and north-west, Chhattisgarh to the north, Karnataka to the west and Andhra Pradesh to the east and south.  Following a movement for separation, it was awarded separate statehood on 2 June 2014. ");
        telangana.add("Hyderabad will continue to serve as the joint capital city for Andhra Pradesh and Telangana for a period of not more than ten years.");
        telangana.add("National parks and wildlife sanctuaries:\n" +
                "1. Kawal Wildlife Sanctuary Tiger Reserve\n" +
                "2. Mrugavani National Park\n" +
                "3. KBR National Park\n" +
                "4. Mahavir Harina Vanasthali National Park\n");
        telangana.add("Rivers:\n" +
                "Godavari");
        telangana.add("Official Languages:\n" +
                "1. Telugu\n" +
                "2. Urdu\n");
        telangana.add("Major dance and music forms\n" +
                "1. Perini Sivatandavam or Perini Thandavam");
        telangana.add("Famous places in Telangana:\n" +
                "1. Bhadrachalam Temple is a Lord Sree Sita Ramachandra Swamy Temple in Bhadrachalam, Bhadradri District. Bhadrachalam-The name derived from Bhadragiri (Mountain of Bhadra-a boon child of Meru and Menaka).\n" +
                "2. Charminar-The Charminar, constructed in 1591, is a monument and mosque located in Hyderabad, Telangana, India. The landmark has become a global icon of Hyderabad, listed among the most recognized structures of India.\n" +
                "3. Golkonda, also known as Golconda, Gol konda, or Golla konda, is a citadel and fort in Southern India and was the capital of the medieval sultanate of the Qutb Shahi dynasty, is situated 11 kilometres west of Hyderabad.\n" +
                "4. Hussain Sagar is a heart-shaped lake in Hyderabad built by Ibrahim Quli Qutub Shah in 1563, during the rule of Ibrahim Quli Qutub Shah. It is spread across an area of 5.7 square kilometres and is fed by River Musi.\n" +
                "5. Birla Mandir, Hyderabad: Built on a 280 feet (85 m) high hillock called Naubath Pahad on a 13 acres (53,000 m2) plot in Hyderabad.\n" +
                "6. Basara: Gnana Saraswati Temple (Goddess of Knowledge) is located on the banks of the river Godavari in Adilabad District\n" +
                "7. Mecca Masjid, is one of the oldest mosques in Hyderabad, Telangana in India, And it is one of the largest Mosques in India.\n" +
                "8. Kuntala waterfall of Adilabad is the famous tourist spot.");
        telangana.add("Famous Personalities of Telangana:\n" +
                "1. Zakir Husain – India’s first Muslim President and famous politician was born in Hyderabad (now in Telangana)\n" +
                "2. P V Narasimha Rao – The great politician and 9th Prime Minister of India was born in Karimnagar district of the then Hyderabad state.\n" +
                "3. Ali Yavar Jung – Famous Indian diplomat to many European and Arabian countries. He also served as Governor of Maharashtra. He was born in Hyderabad.\n" +
                "4. Dia Mirza – Popular actress and winner of Miss Asia Pacific (the year 2000) was born in Hyderabad on 9 Dec 1981.\n" +
                "5. Shabana Azmi – Popular actress, theatre and TV artist were born in Hyderabad city of the then Hyderabad state on 18 Sept 1950.\n" +
                "6. Mohammad Azharuddin – Famous cricketer and captain of Indian Cricket team were born in Hyderabad on 8 Feb 1963.\n" +
                "7. V V S Laxman – Famous test cricketer of the Indian team was born in Hyderabad on 1 Nov 1974.\n" +
                "8. Sania Mirza – Popular Tennis player although born in Mumbai on 15 Nov 1986, resides in Hyderabad. She was the first Indian woman to win WTA title.\n" +
                "9. P V Sindhu – Famous badminton player who won a silver medal in Rio Olympics 2016 was born in Hyderabad.\n" +
                "10. Saina Nehwal – Famous Badminton player who won a bronze medal in badminton in London Olympics 2012 was born in Hisar of Haryana but resides in Hyderabad. She was also the first Indian to win Olympic medal in Badminton.\n" +
                "11. Film Producer Ram Gopal Verma and actresses  Sushmita Sen, Tabu and Farah were born in Hyderabad.\n");
        telangana.add("Warangal has a domestic airport which was established in the year 1930 during Nizam period.");
        telangana.add("Kuntala waterfall which is in Adilabad district is the biggest waterfall of the state.");
        telangana.add("The economy is mainly driven by agriculture. Rice is the major and staple food crop of the state.");

        ArrayAdapter<String> telanganaAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,telangana);

        ListView listView = (ListView)findViewById(R.id.telanganaList);

        listView.setAdapter(telanganaAdapter);

    }
}
