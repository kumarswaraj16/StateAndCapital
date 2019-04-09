package com.example.stateandcapital;

import android.view.View;
import android.widget.Toast;

public class PresidentClickListner implements View.OnClickListener {

    @Override

    public void onClick(View view) {

        Toast.makeText(view.getContext(), "Open the list of President of India", Toast.LENGTH_SHORT).show();

    }
}
