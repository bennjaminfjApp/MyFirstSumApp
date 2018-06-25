package com.example.user.myfirstsumapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by user on 11/11/2017.
 */

public class itemAdapter extends BaseAdapter {
    LayoutInflater mInflator;
    String [] items ;
    String [] price ;
    String [] description ;
    //////////////////////


    public itemAdapter(Context c , String[] i , String [] p , String [] d){
        items = i ;
        price = p ;
        description = d ;
        mInflator = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    /////////////////////////////////////////////////////////////////////////////////////


    @Override
    public int getCount() {
        return items.length;
    }

    @Override
    public Object getItem(int i) {
        return items[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View v = mInflator.inflate(R.layout.my_listview_detail , null);
        TextView nameTextView = (TextView) v.findViewById(R.id.nameTextView);
        TextView pricTextView = (TextView) v.findViewById(R.id.priceTextView);
        TextView descriptionTextView = (TextView) v.findViewById(R.id.descriptionTextView);

        String name = items[i];
        String desc = description[i];
        String cost = price[i];

        nameTextView.setText(name);
        descriptionTextView.setText(desc);
        pricTextView.setText(cost);

        return v;
    }
}



