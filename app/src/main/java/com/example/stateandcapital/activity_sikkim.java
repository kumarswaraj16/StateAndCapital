package com.example.stateandcapital;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class activity_sikkim extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sikkim);

        ArrayList<String> sikkim = new ArrayList<>();

        sikkim.add("Sikkim is the 22nd state of India came into existence with effect from 26th April 1975. ");
        sikkim.add("The capital of Sikkim is Gangtok");
        sikkim.add("State Symbols of Sikkim:\n" +
                "1. Date of Formation\t16. May. 1975\n" +
                "2. State Animal\tRed Panda\n" +
                "3. State Bird\tBlood Pheasant\n" +
                "4. State Tree\tRhododendron\n" +
                "5. State Flower\tNobile Orchid\n" +
                "6. Literacy Rate (2011)\t87.75%\n" +
                "7. Females per 1000 Males\t889\n" +
                "8. Assembly Constituency\t32\n" +
                "9. Parliamentary Constituency\t1\n" +
                "10. Major Crops\tMaize, Paddy, Wheat, Barley");
        sikkim.add("Rivers in Sikkim:\n" +
                "1. Teesta\n" +
                "2. Rangit");
        sikkim.add("Festivals in Sikkim:\n" +
                " Kanchendzonga, Lossing");
        sikkim.add("Major Dance and Music forms:\n" +
                "Khanchendzonga, Kali Topi Hat");
        sikkim.add("Famous Places in Sikkim\n" +
                "Rabdentse: Rabdentse was the erstwhile royal capital of Sikkim. About 107 km west of Gangtok, the town was first established in 1670 by Chadok Namgyal.\n" +
                "\n" +
                "Yuksom: Yuksom is an old historic town in west Sikkim bestowed with natural beauty and uninterrupted trail for trekkers. If you are looking forward to spending some quiet moments in the shadow of nature away from the hustle bustle of the city.\n" +
                "\n" +
                "Nathula Pass: Nathula pass, located in the Himalayas, connects India with Tibet. The pass, at 4,310 m above sea level forms a part of a side-shoot of the prehistoric Silk Road. Definitely one of the places to visit in Sikkim without fail\n" +
                "\n" +
                "Lachung, Lachen and Yumthang Valley:  Lachen is a distant village in North Sikkim and the winter home for Tibetan nomadic tribes. Lachung is also a high altitude village of Tibetan and Bhutia people in North Sikkim. And Yumthang is a beautiful valley bounded by snowcapped mountains. All three are extremely beautiful tourist places in Sikkim.\n" +
                "\n" +
                "Ravangla: Furrowed by dense forests and outstandingly balanced on a ridge superintending an extensive swish of western Sikkim, Ravangla assures one of the most beautiful mountain views. It is a popular tourist place in Sikkim and draws many nature lovers every year.\n" +
                "\n" +
                "Namchi: Namchi is blessed with fresh air which is fragmented with the aroma of lush flora. The beautiful sight of snowcapped mountains and the woodland mountain valleys adds to the scenery and makes it an important one among the places to see in Sikkim.\n" +
                "\n" +
                "Zuluk: Zuluk is a small village located at a high altitude and has a very empowering history due to its connection with the Silk Route. It promises great views of the snowcapped mountain ranges, especially during winter.\n" +
                "\n" +
                "Teesta River: A different one among places to visit in Sikkim, Teesta River is stunning to look at when it is frozen in winters. During spring, however, the river is shimmering in the sun rays and displays a perfect habitat for blooming flowers.\n" +
                "Gangtok: Gangtok is the capital city of Sikkim and has loads of gems in its kitty; you would be awestruck by the never-ending walking trails, gorgeous silver-fir trees and most importantly the hospitality by the locals. Make sure it is on your list of places to visit in Sikkim.");
        sikkim.add("Famous Personalities of Sikkim:\n" +
                "1. Baichung Bhutia is an Indian footballer, who is currently contracted by the club he owns, United Sikkim, which he also plays for. Bhutia is considered to be the torchbearer of Indian football in the international arena.\n" +
                "2. Danny Denzongpa Tshering Phintso “Danny” Denzongpa is an Indian actor working in Bollywood films. He is of Sikkimese ancestry. Denzongpa was born in the state of Sikkim, at that time an independent monarchy.\n" +
                "\n" +
                "Pawan Kumar Chamling is the charismatic leader and present serving Chief Minister of Sikkim. He served for five successive times as CM of Sikkim.\n" +
                "Omi Gurung is a famous fashion designer who was born and brought up in Sikkim.");
        sikkim.add("It shares a border with only 1 state – West Bengal in the south. It also shares an international boundary with 3 countries i.e. Bhutan in the east, Nepal in the west and China in the north which also happens to be a maximum number of international borders shared by any Indian State. Note – there is only one more state which has maximum ( 3 nos.) number of international borders: Arunachal Pradesh.");
        sikkim.add("Kangchenjunga the world’s third highest and India’s highest peak (on actual grounds Mount K2 doesn’t come in India’s control as it lies in POK) starts from this region and is located on its border with Nepal.");
        sikkim.add("Pakyong Airport is a greenfield airport near Gangtok, the state capital of Sikkim, India. The airport, spread over 400 ha, is located at Pakyong town about 35km south of Gangtok. At 4500 ft, Pakyong Airport is one of the five highest airports in India. ");
        sikkim.add("The Sikkim High Court is the High Court of the Indian state of Sikkim. The history of the court can be traced back to 1955, when the High Court of Judicature Proclamation, 1955 was issued to establish a High Court in Sikkim.");

        ArrayAdapter<String> sikkimAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,sikkim);

        ListView listView = (ListView)findViewById(R.id.sikkimList);

        listView.setAdapter(sikkimAdapter);

    }
}
