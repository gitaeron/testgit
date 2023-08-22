package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText gname, gemail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gname = findViewById(R.id.editTextText);
        gemail = findViewById(R.id.editTextText2);
    }

    public void btn_submit(View view){
        Bundle bundle = new Bundle();

        bundle.putString("name", gname.getText().toString());
        bundle.putString("email", gemail.getText().toString());

        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}