package com.example.stateandcapital;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class activity_pm extends AppCompatActivity {

ListView mListView;

int[] images = {R.drawable.jln,
                R.drawable.gn,
                R.drawable.lbs,
                R.drawable.ig,
                R.drawable.md,
                R.drawable.ccs,
                R.drawable.rg,
                R.drawable.vps,
                R.drawable.cs,
                R.drawable.pvnr,
                R.drawable.abv,
                R.drawable.hddg,
                R.drawable.ikg,
                R.drawable.mms,
                R.drawable.nm

                };
String[] Names = {"Jawaharlal Nehru\n(15 August,1947 - 27 May,1964)",
                  "Gulzarilal Nanda\n(27 May,1964 - 9 June,1964)\n(11 January,1966 - 24 January,1966)",
                  "Lal Bahadur Shastri\n(9 June,1964 - 11 January,1966)",
                  "Indra Gandhi\n(24January,1966 - 24 March,1977)\n(14 January,1980 - 31 0ctober,1984)",
                  "Morarji Desai\n(24 March,1977 - 28 July,1979)",
                  "Charan Singh\n(28 July,1979 - 14 January1980)",
                  "Rajiv Gandhi\n(31 October,1984 - 2 December, 1989)",
                  "Vishwanath Pratap Singh\n(2 December,1989 - 10 November,1990)",
                  "Chandra Shekhar\n(10 November,1990 - 21 June,1991)",
                  "P.V.Narasimha Rao\n(21 June,1991 - 16 May,1996)",
                  "Atal Bihari Vajpayee\n(16 May,1996 - 1 June,1996)\n(19 March,1998 - 22 May,2004)",
                  "H.D.Deve Gowda\n(1 June,1996 - 21 April,1997)",
                  "Inder Kumar Gujral\n(21 April,1997 - 19 March,1998)",
                  "Manmohan Singh\n(22 May,2004 - 26 May,2014)",
                  "Narendra Modi\n(26 May,2014 - Present)"
};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pm);

        mListView = (ListView)findViewById(R.id.pmlist);
        CustomAdapter customAdapter = new CustomAdapter();
        mListView.setAdapter(customAdapter);
    }

    class CustomAdapter extends BaseAdapter{

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

            View view = getLayoutInflater().inflate(R.layout.customlayout,null);

            ImageView mImageView = (ImageView) view.findViewById(R.id.imageview);

            TextView mTextView = (TextView) view.findViewById(R.id.textview1);

            mImageView.setImageResource(images[position]);
            mTextView.setText(Names[position]);
            return view;
        }
    }
}
