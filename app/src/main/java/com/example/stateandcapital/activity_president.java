package com.example.stateandcapital;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class activity_president extends AppCompatActivity {

    ListView mListView;
    int[] images = {R.drawable.rp,
                    R.drawable.sprk,
                    R.drawable.zh,
                    R.drawable.vvg,
                    R.drawable.fakhrudin,
                    R.drawable.nsr,
                    R.drawable.zs,
                    R.drawable.rvr,
                    R.drawable.dsds,
                    R.drawable.krn,
                    R.drawable.apjak,
                    R.drawable.pp,
                    R.drawable.pmj,
                    R.drawable.gnk,
    };
    String Names[] = {"Rajendra Prasad\n(1950-1962)",
            "Sarvepalli Radhakrishnan\n(1962-1967)",
            "Zakir Hussain\n(1967-1969)",
            "V.V Giri\n(1969-1974)",
            "Fakhruddin Ali Ahmad\n(1974-1977)",
            "Neelam Sanjiva Reddy\n(1977-1982)",
            "Zail Singh\n(1982-1987)",
            "R.Venkataraman\n(1987-1992)",
            "Shankar Dayal Sharma\n(1992-1997)",
            "K.R.Narayan\n(1997-2002)",
            "A.P.J Abdul Kalam\n(2002-2007)",
            "Pratibha Patil\n(2007-2012)",
            "Pranab Mukharjee\n(2012-2017)",
            "Ram Nath Kovind\n(2017-Present)"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_president);

        mListView = (ListView) findViewById(R.id.presidentList);
        CustomAdapter customAdapter = new CustomAdapter();
        mListView.setAdapter(customAdapter);
    }

    class CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            View view = getLayoutInflater().inflate(R.layout.custom2layout, null);

            ImageView mImageView = (ImageView) view.findViewById(R.id.imageview2);

            TextView mTextView = (TextView) view.findViewById(R.id.textview2);

            mImageView.setImageResource(images[position]);
            mTextView.setText(Names[position]);
            return view;

        }
    }
}