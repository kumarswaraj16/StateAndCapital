package com.example.stateandcapital;

import android.view.View;
import android.widget.Toast;

public class FactsClickListner implements View.OnClickListener {

    @Override

    public void onClick(View view) {

        Toast.makeText(view.getContext(), "Open the list of Facts of India", Toast.LENGTH_SHORT).show();

    }
}