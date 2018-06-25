package com.example.user.myfirstsumapp;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.MenuBuilder;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class productListActivity extends AppCompatActivity {

    ListView myListView ;
    String [] items ;
    String [] price ;
    String [] description ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_list);

        Resources res = getResources();
        myListView = (ListView) findViewById(R.id.myListView); // how the listview looks
        items = res.getStringArray(R.array.items);
        price = res.getStringArray(R.array.price);
        description = res.getStringArray(R.array.description);

        itemAdapter itemAdapter = new itemAdapter(this,items,price,description);
        myListView.setAdapter(itemAdapter);

        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                Intent showDetailsActivity = new Intent(getApplicationContext(), detailActivity.class);
                showDetailsActivity.putExtra("cINom.example.user.myfirstsumapp.exp.ITEM_DEX",i);
                startActivity(showDetailsActivity);
            }
        });

    }
}
