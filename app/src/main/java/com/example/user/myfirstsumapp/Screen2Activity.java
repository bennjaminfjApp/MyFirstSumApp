package com.example.user.myfirstsumapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Screen2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);

        if( getIntent().hasExtra("com.example.user.myfirstsumapp.exp" )){
            TextView tv = (TextView) findViewById(R.id.textView);
            String text = getIntent().getExtras().getString("com.example.user.myfirstsumapp.exp");
            tv.setText(text);
        }

    }
}
