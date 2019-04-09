package com.example.stateandcapital;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class activity_punjab extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_punjab);

        ArrayList<String> punjab = new ArrayList<>();

        punjab.add("Punjab State, the Land of Five Rivers, is situated in the North Western region of India. It is the only state in India with a majority of Sikh people. The land of Punjab is very fertile. It is also known as Golden Harvests.");
        punjab.add("It is surrounded by Haryana, Rajasthan, Himachal Pradesh and Jammu & Kashmir. The Punjab province in Pakistan also surrounds Punjab.");
        punjab.add("Its Official Language is Punjabi.");
        punjab.add("Chandigarh is the Capital of both the States of Punjab and Haryana. Chandigarh is a Union Territory. ");
        punjab.add("The largest city in Punjab is Ludhiana. ");
        punjab.add("State Symbols of Punjab:\n" +
                "Emblem\tLion Capital of Ashoka with Wheat stem (above) and Crossed Swords (below)\n" +
                "Language\tPunjabi, English, Hindi.\n" +
                "Dance\tBhangra, Giddha\n" +
                "Animal\tBlackbuck\n" +
                "Bird\tBaaz\n" +
                "Tree\tTahli\n" +
                "River\tIndus\n" +
                "Sport\tKabaddi (Circle Style)");
        punjab.add("Wildlife Sanctuaries in Punjab:\n" +
                "1. Abohar Wildlife Sanctuary\n" +
                "2. Bir Aishvan Wildlife Sanctuary\n" +
                "3. Bir Bhadson Wildlife Sanctuary\n" +
                "4. Bir Bunerheri Wildlife Sanctuary\n" +
                "5. Bir Dosanjh Wildlife Sanctuary\n" +
                "6. Bir Gurdialpura Wildlife Sanctuary\n" +
                "7. Bir Mehaswala Wildlife Sanctuary\n" +
                "8. Bir Motibagh Wildlife Sanctuary\n" +
                "9. Harike Lake Wildlife Sanctuary\n" +
                "10. Jhajjar Bacholi Wildlife Sanctuary\n" +
                "11. Kathlaur Kushlan Wildlife Sanctuary\n" +
                "12. Takhni-Rehampur Wildlife Sanctuary\n" +
                "13. Nangal Wildlife Sanctuary");
        punjab.add("Rivers of Punjab:\n" +
                "1. Punjab literally means “(The Land of) Five Waters” referring to the following rivers: the Jhelum, Chenab, Ravi, Sutlej, and Beas.\n" +
                "2. All are tributaries of the Indus River, the Chenab being the largest.\n");
        punjab.add("Famous places in Punjab\n" +
                "1. Amritsar:\n" +
                "     a. Golden Templeimages\n" +
                "     b. Jallianwala Bagh\n" +
                "     c. Akal Takht\n" +
                "     d. Tara Taran Sahib\n" +
                "     e. Maharaja Ranjit Singh Panorama\n" +
                "     f. Wagah Border\n" +
                "     g. Maharaja Ranjit Singh Museum\n" +
                "     h. Rambagh Garden\n" +
                "     i. Summer Palace of Maharaja Ranjit Singh\n" +
                "     j. Harike Wetland and Bird Sanctuary\n" +
                "     k. Khalsa College\n" +
                "     l. Durgiana Temple\n" +
                "     m. Bathinda Fort\n" +
                "     n. Kaiser Bagh Park\n" +
                "2. Chandigarh:\n" +
                "     a. The Rock GardenClock_Tower_Faisalabad_by_Usman_Nadeem\n" +
                "     b. Sukhna Lake\n" +
                "     c. Leisure Valley\n" +
                "     d. Shanti Kunj\n" +
                "     e. Morni Hills\n" +
                "     f. Chhatbir Zoo\n" +
                "     g. Rose Garden\n" +
                "     h. Le Corbusier Centre\n" +
                "     i. Government Museum and Art Gallery\n" +
                "     j. Sarkaria Cactus Garden\n" +
                "     k. Timber Trail\n" +
                "     l. Butterfly Park\n" +
                "     m. Yadvinder Garden\n" +
                "     n. Garden of Fragrance\n" +
                "     o. Chandigarh Botanical Garden and Nature Park\n" +
                "     p. Mahendra Chaudhary Zoological Park\n" +
                "     q. Chhatbir Zoo\n" +
                "     r. Terraced Garden\n" +
                "     s. International Dolls Museum\n" +
                "3. Ludhiana:\n" +
                "    a. Lodhi Fort\n" +
                "    b. Rural Heritage Museum\n" +
                "    c. Tiger Zoo\n" +
                "    d. Punjab Agricultural University Museum\n" +
                "    e. Gurudwara Charan Kamal\n" +
                "    f. Maharaja Ranjit Singh War Museum\n" +
                "    g. Phillaur Fort\n" +
                "    h. Nehru Rose Garden\n" +
                "    i. Deer Park\n" +
                "4. Patiala:\n" +
                "    a. Qila Mubarak Complexdownload\n" +
                "    b. Moti Bagh Palace\n" +
                "    c. Banur\n" +
                "    d. Samana\n" +
                "    e. Baradari Garden\n" +
                "    f. Sheesh Mahal\n" +
                "    g. Darbar Hall\n" +
                "    h. Bir Moti Bagh Sanctuary\n" +
                "    i. Lachman Jhoola\n" +
                "    j. Kali Temple\n" +
                "5. Pathankot:\n" +
                "    a. Mukteshwar Temple\n" +
                "    b. Ashapurni Mandir\n" +
                "    c. Kathgarh Temple\n" +
                "    d. Nurpur Fort\n" +
                "    e. Ranjit Sagar Dam\n" +
                "    f. Hydraulic Research Station\n" +
                "    g. Shahpurkandi Fort\n" +
                "    h. Kali Mata Ka Mandir\n" +
                "6. Mohali:\n" +
                "    a. Rose Garden\n" +
                "    b. Silvi Park\n" +
                "    c. Mataur Lakeimages (2)\n" +
                "    d. Rock Garden\n" +
                "    e. Sukhna Lake\n" +
                "    f. Sukhna Wildlife Sanctuary\n" +
                "    g. Gurdwara Amb Sahib\n" +
                "    h. Mansa Devi Temple\n" +
                "    i. Gurudwara Nada Sahib\n" +
                "    j. Punjab Cricket Association Stadium");
        punjab.add("Famous Personalities of Punjab:\n" +
                "Rana Kapoor, founder and managing director of Yes Bank\n" +
                "Sunil Mittal, owner of Bharti Airtel\n" +
                "1. Astronauts:\n" +
                "    a. Kalpana Chawla\n" +
                "    b. Rakesh Sharma, first Indian in space\n" +
                "2. Cricketers:\n" +
                "    a. Harbhajan Singh\n" +
                "    b. Virat Kohli\n" +
                "    c. Yuvraj Singh\n" +
                "    d. Gautam Gambhir\n" +
                "    e. Kapil Dev\n" +
                "    f. Shikhar Dhawan\n" +
                "3. Politicians:\n" +
                "    a. Arun Jaitley\n" +
                "    b. Manmohan Singh\n" +
                "    c. Parkash Singh Badal\n" +
                "    d. Sheila Dikshit\n" +
                "4. Artists:\n" +
                "    a. Rani Mukerji\n" +
                "    b. Parineeti Chopra\n" +
                "    c. Hrithik Roshan\n" +
                "    d. Twinkle Khanna\n" +
                "    e. Shahid Kapoor\n" +
                "    f. Kareena Kapoor\n" +
                "    g. Ranbir Kapoor\n" +
                "    h. Ajay Devgan\n" +
                "    i. Vivek Oberoi\n" +
                "    j. Sunny Leone\n" +
                "    k. Musicians:\n" +
                "    l. Zakir Hussain\n" +
                "    m. Honey Singh (Punjabi rapper)\n" +
                "    n. Ustad Nusrat Fateh Ali Khan\n" +
                "5. Shooting:\n" +
                "    a. Abhinav Bindra, 1st individual Olympic Gold Medalist\n" +
                "    b. Gagan Narang, the only Indian to win two medals at a World championship");
        punjab.add("Listed below is the airports in Punjab:\n" +
                "\n" +
                " \t  Airport Name\t  City Served\t  Category\n" +
                "  Sri Guru Ram Dass Jee International Airport\t  Amritsar\t  International\n" +
                " \t  Bathinda Airport\t  Bathinda\t  Domestic\n" +
                " \t  Sahnewal Airport\t  Ludhiana\t  Domestic\n" +
                "  Pathankot Airport\t  Pathankot\t  Domestic\n" +
                "  Patiala Airport\t  Patiala\t  Domestic");

        ArrayAdapter<String> punjabAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,punjab);

        ListView listView = (ListView)findViewById(R.id.punjabList);

        listView.setAdapter(punjabAdapter);

    }
}
