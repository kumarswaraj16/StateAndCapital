package com.example.stateandcapital;

import android.view.View;
import android.widget.Toast;

public class StatesClickListner implements View.OnClickListener {

    @Override
    public void onClick(View view){

        Toast.makeText(view.getContext(),"Open the list of States",Toast.LENGTH_SHORT).show();

    }


}
