package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView tname, temail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tname = findViewById(R.id.the_name);
        temail = findViewById(R.id.the_email);

        Bundle bundle = getIntent().getExtras();
        tname.setText(bundle.getString("name"));
        temail.setText(bundle.getString("email"));
    }


}