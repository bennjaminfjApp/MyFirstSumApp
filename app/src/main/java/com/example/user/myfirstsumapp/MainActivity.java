package com.example.user.myfirstsumapp;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addBtn = (Button) findViewById(R.id.AddBtn);
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText FirstNumTextView = (EditText) findViewById(R.id.FirstNumTextView);
                EditText SecondtNumTextView = (EditText) findViewById(R.id.SecondNumTextView);
                TextView ResultTextView = (TextView) findViewById(R.id.ResultTextView);

                int num1 = Integer.parseInt(FirstNumTextView.getText().toString()); // to take the string and make him num
                int num2 = Integer.parseInt(SecondtNumTextView.getText().toString()); // to take the string and make him num

                int result = num1 + num2;
                ResultTextView.setText(result + ""); // to show the result as a text on the screen
            }
        });

        Button secondActivityBtn = (Button) findViewById(R.id.SecondActivityBtn);
        secondActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), Screen2Activity.class);
                startIntent.putExtra("com.example.user.myfirstsumapp.exp", "Hello World");
                startActivity(startIntent);
            }

        });

        Button googleBtn = (Button) findViewById(R.id.GoogleBtn);
        googleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String google = "http://www.google.com" ;
                Uri webAddress = Uri.parse(google);

                Intent goToGoogle = new Intent(Intent.ACTION_VIEW,webAddress);
                if( goToGoogle.resolveActivity(getPackageManager()) != null ){
                    startActivity(goToGoogle);
                }
            }
        });

        Button goToBtn = (Button) findViewById(R.id.goToListBtn);
        goToBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(),productListActivity.class);
                startActivity(startIntent);
            }
        });

        Button CallBtn = (Button) findViewById(R.id.CallBtn);
        CallBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "5551234"));
                if (i.resolveActivity(getPackageManager()) != null) {
                    startActivity(i);
                }



            }
        });

    }
}
