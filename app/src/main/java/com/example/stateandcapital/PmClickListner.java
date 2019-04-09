package com.example.stateandcapital;

import android.view.View;
import android.widget.Toast;

public class PmClickListner implements View.OnClickListener {
    @Override

    public void onClick(View view) {

        Toast.makeText(view.getContext(), "Open the list of PM of India", Toast.LENGTH_SHORT).show();

    }
}