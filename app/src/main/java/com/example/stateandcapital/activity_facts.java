package com.example.stateandcapital;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class activity_facts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facts);

        ArrayList<String> facts = new ArrayList<>();

        facts.add(".......................KNOW ABOUT INDIA.......................");
        facts.add("1. THE CAPITAL OF INDIA IS NEW DELHI");
        facts.add("2. INDIA IS THE 2nd MOST POPULOUS AND THE 7th MOSTEXTENSIVE COUNTRY OF THE WORLD");
        facts.add("3. IT HAS SIX(6) BOARDING COUNTRIES THAT INCLUDE PAKISTAN,CHINA,NEPAL,BHUTAN,BANGLADESH,and MYANMAR");
        facts.add("4. THE INDIAN CURRENCY IS KNOWN AS INDIAN RUPEE");
        facts.add("5. THE NAME INDIA IS DERIVED FROM THE RIVER INDUS");
        facts.add("6. INDIA IS THE WORLD'S LARGEST,OLDEST AND CONTINUOUS CIVILIZATION - THE INDUS VALLEY CIVILIZATION");
        facts.add("7. THE HIGHEST AWARD IN THE COUNTRY IS 'BHARAT RATNA'");
        facts.add("8. 'ZERO' IN THE NUMBER SYSTEM AND THE GAME 'CHESS' WERE INVENTED IN INDIA");
        facts.add("9. TAKSHILA, THE FIRST EVER UNIVERSITY IN THE WORLD STARTED AROUND 700 BC IN INDIA");
        facts.add("10. THE BRITISH RAJ, OR BRITISH RULE, LASTED FROM 1858 TO 1947");
        facts.add("11. VANDE MATARAM IS INDIA'S NATIONAL SONG AND JANA GANA MANA IS ITS NATIONAL ANTHEM");
        facts.add("12. THE FIRST MINING OF DIAMONDS WAS DONE IN INDIA");
        facts.add("13. THE TAJ MAHAL, ONE OF THE SEVEN WONDERS OF THE WORLD, IS IN INDIA");
        facts.add("14. IT IS ILLEGAL TO CARRY INDIAN CURRENCY, RUPEE, OUTSIDE OF INDIA");
        facts.add("15. MUMBAI IS THE LARGEST CITY OF INDIA");
        facts.add("16. HINDI IS THE OFFICIAL LANGUAGE OF INDIA");
        facts.add("17. INTERNET COUNTRY CODE OF INDIA IS .in");
        facts.add("18. CALLING CODE OF INDIA IS +91");
        facts.add("19. LOTUS,MANGO,PEACOCK,TIGER IS THE NATIONAL FLOWER,FRUIT,BIRD,ANIMAL OF INDIA");
        facts.add("20. THE LOK SABHA,THE LOWER HOUSE OF THE PARLIAMENT OF INDIA,IS MADE UP OF MEMBERS OF PARLIAMENT(MPs)");
        facts.add("21. THE RAJYA SABHA OR COUNCIL OF STATES IS THE UPPER HOUSE OF THE PARLIAMENT OF INDIA");
        facts.add("22. EACH MP,REPRESENTS A SINGLE GEOGRAPHIC CONSTITUENCY.THERE ARE CURRENTLY 543 CONSTITUENCIES");
        facts.add("23. IN INDIA, ELECTION IS HELD AFTER EVERY FIVE YEARS");
        facts.add("24. EVERY YEAR,15th AUGUST IS CELEBRATED AS INDEPENDENCE DAY IN INDIA ");
        facts.add("25. EVERY YEAR,26th JANUARY IS CELEBRATED AS REPUBLIC DAY IN INDIA");

        ArrayAdapter<String> factsAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,facts);

        ListView listView = (ListView)findViewById(R.id.factslist);

        listView.setAdapter(factsAdapter);

    }
}
