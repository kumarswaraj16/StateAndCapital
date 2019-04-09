package com.example.stateandcapital;

import android.view.View;
import android.widget.Toast;

class AndhraClickListner implements View.OnClickListener {

    @Override

    public void onClick(View view) {

        Toast.makeText(view.getContext(), "Open the list of Andhra Pradesh", Toast.LENGTH_SHORT).show();

    }
}
