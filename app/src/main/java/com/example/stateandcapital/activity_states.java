package com.example.stateandcapital;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class activity_states extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_states);


        ArrayList<String> states = new ArrayList<>();

        states.add("Andhra Pradesh");
        states.add("Arunachal Pradesh");
        states.add("Assam");
        states.add("Bihar");
        states.add("Chhattisgarh");
        states.add("Goa");
        states.add("Gujarat");
        states.add("Haryana");
        states.add("Himachal Pradesh");
        states.add("Jammu & Kashmir");
        states.add("Jharkhand");
        states.add("Karnataka");
        states.add("Kerala");
        states.add("Madhya Pradesh");
        states.add("Maharashtra");
        states.add("Manipur");
        states.add("Meghalaya");
        states.add("Mizoram");
        states.add("Nagaland");
        states.add("Odisha");
        states.add("Punjab");
        states.add("Rajasthan");
        states.add("Sikkim");
        states.add("Tamil Nadu");
        states.add("Telangana");
        states.add("Tripura");
        states.add("Uttar Pradesh");
        states.add("Uttarakhand");
        states.add("West Bengal");

        ArrayAdapter<String> statesAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,states);

        ListView listView = (ListView)findViewById(R.id.stateslist);

        listView.setAdapter(statesAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(view.getContext(), "Position "+ position, Toast.LENGTH_SHORT).show();
                switch (position){
                    case 0:
                        Intent andhraIntent = new Intent(activity_states.this,activity_andhra.class);
                        startActivity(andhraIntent);
                        break;
                    case 1:
                        Intent arunachalIntent = new Intent(activity_states.this,activity_arunachal.class);
                        startActivity(arunachalIntent);
                        break;
                    case 2:
                        Intent assamIntent = new Intent(activity_states.this,activity_assam.class);
                        startActivity(assamIntent);
                        break;
                    case 3:
                        Intent biharIntent = new Intent(activity_states.this,activity_bihar.class);
                        startActivity(biharIntent);
                        break;
                    case 4:
                        Intent chhattisgarhIntent = new Intent(activity_states.this,activity_chhattisgarh.class);
                        startActivity(chhattisgarhIntent);
                        break;
                    case 5:
                        Intent goaIntent = new Intent(activity_states.this,activity_goa.class);
                        startActivity(goaIntent);
                        break;
                    case 6:
                        Intent gujaratIntent = new Intent(activity_states.this,activity_gujarat.class);
                        startActivity(gujaratIntent);
                        break;
                    case 7:
                        Intent haryanaIntent = new Intent(activity_states.this,activity_haryana.class);
                        startActivity(haryanaIntent);
                        break;
                    case 8:
                        Intent himachalIntent = new Intent(activity_states.this,activity_himachal.class);
                        startActivity(himachalIntent);
                        break;
                    case 9:
                        Intent jkIntent = new Intent(activity_states.this,activity_jk.class);
                        startActivity(jkIntent);
                        break;
                    case 10:
                        Intent jharkhandIntent = new Intent(activity_states.this,activity_jharkhand.class);
                        startActivity(jharkhandIntent);
                        break;
                    case 11:
                        Intent karnatakaIntent = new Intent(activity_states.this,activity_karnataka.class);
                        startActivity(karnatakaIntent);
                        break;
                    case 12:
                        Intent keralaIntent = new Intent(activity_states.this,activity_kerala.class);
                        startActivity(keralaIntent);
                        break;
                    case 13:
                        Intent mpIntent = new Intent(activity_states.this,activity_mp.class);
                        startActivity(mpIntent);
                        break;
                    case 14:
                        Intent manipurIntent = new Intent(activity_states.this,activity_manipur.class);
                        startActivity(manipurIntent);
                        break;
                    case 15:
                        Intent maharashtraIntent = new Intent(activity_states.this,activity_maharashtra.class);
                        startActivity(maharashtraIntent);
                        break;
                    case 16:
                        Intent meghalayaIntent = new Intent(activity_states.this,activity_meghalaya.class);
                        startActivity(meghalayaIntent);
                        break;
                    case 17:
                        Intent mizoramIntent = new Intent(activity_states.this,activity_mizoram.class);
                        startActivity(mizoramIntent);
                        break;
                    case 18:
                        Intent nagalandIntent = new Intent(activity_states.this,activity_nagaland.class);
                        startActivity(nagalandIntent);
                        break;
                    case 19:
                        Intent odishaIntent = new Intent(activity_states.this,activity_odisha.class);
                        startActivity(odishaIntent);
                        break;
                    case 20:
                        Intent punjabIntent = new Intent(activity_states.this,activity_punjab.class);
                        startActivity(punjabIntent);
                        break;
                    case 21:
                        Intent rajasthanIntent = new Intent(activity_states.this,activity_rajasthan.class);
                        startActivity(rajasthanIntent);
                        break;
                    case 22:
                        Intent sikkimIntent = new Intent(activity_states.this,activity_sikkim.class);
                        startActivity(sikkimIntent);
                        break;
                    case 23:
                        Intent tnIntent = new Intent(activity_states.this,activity_tn.class);
                        startActivity(tnIntent);
                        break;
                    case 24:
                        Intent telanganaIntent = new Intent(activity_states.this,activity_telangana.class);
                        startActivity(telanganaIntent);
                        break;
                    case 25:
                        Intent upIntent = new Intent(activity_states.this,activity_up.class);
                        startActivity(upIntent);
                        break;
                    case 27:
                        Intent ukIntent = new Intent(activity_states.this,activity_uk.class);
                        startActivity(ukIntent);
                        break;
                    case 26:
                        Intent tripuraIntent = new Intent(activity_states.this,activity_tripura.class);
                        startActivity(tripuraIntent);
                        break;
                    default:
                        Intent wbIntent = new Intent(activity_states.this,activity_wb.class);
                        startActivity(wbIntent);




                }
            }
        });


   //     AndhraClickListner andhraClickListner = new AndhraClickListner();
//        ListView andhra = (ListView) findViewById(R.id.);
//
//        andhra.setOnClickListener(new View.OnClickListener() {
//
//
//            @Override
//            public void onClick(View view) {
//                Intent andhraIntent = new Intent(activity_states.this,activity_andhra.class);
//                startActivity(andhraIntent);
//
//            }
//        });
//        Intent andhraIntent = new Intent(activity_states.this,activity_andhra.class);
//        startActivity(andhraIntent);
    }
}
