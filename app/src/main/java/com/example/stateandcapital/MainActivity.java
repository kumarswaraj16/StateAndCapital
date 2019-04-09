package com.example.stateandcapital;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        StatesClickListner clickListner = new StatesClickListner();
        TextView states = (TextView)findViewById(R.id.states);
        states.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View view){
                Intent statesIntent = new Intent(MainActivity.this, activity_states.class);
                startActivity(statesIntent);
            }
        });

        UnionClickListner unionClickListner = new UnionClickListner();
        TextView union = (TextView)findViewById(R.id.unionteroteries);
        union.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View view){
                Intent unionIntent = new Intent(MainActivity.this,activity_union.class);
                startActivity(unionIntent);
            }
        });

        FactsClickListner factsClickListner = new FactsClickListner();
        TextView facts = (TextView)findViewById(R.id.facts);
        facts.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View view){
                Intent factsIntent = new Intent(MainActivity.this,activity_facts.class);
                startActivity(factsIntent);
            }
        });

        PmClickListner pmClickListner = new PmClickListner();
        TextView pm = (TextView)findViewById(R.id.primeMinister);

        pm.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View view){
                Intent pmIntent = new Intent(MainActivity.this,activity_pm.class);
                startActivity(pmIntent);
            }
        });

        PresidentClickListner presidentClickListner = new PresidentClickListner();
        TextView president = (TextView)findViewById(R.id.presidentOfIndia);

        president.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent presidentIntent = new Intent(MainActivity.this,activity_president.class);
                startActivity(presidentIntent);
            }
        });



    }
}

