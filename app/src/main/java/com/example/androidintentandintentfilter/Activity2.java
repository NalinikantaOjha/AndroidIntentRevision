package com.example.androidintentandintentfilter;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

TextView FirstName;
TextView LastName;

   TextView Age;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        initView();

        getintent();


     }

    private void getintent() {
        Intent intent=getIntent();
        String name=intent.getStringExtra("name");
        FirstName.setText(name);
        String lastname=intent.getStringExtra("lastname");
        LastName.setText(lastname);
        String age=intent.getStringExtra("age");
        Age.setText(age);
    }

    private void initView() {
        FirstName=findViewById(R.id.textFirstName);
        LastName=findViewById(R.id.textLastName);
        Age=findViewById(R.id.textAge);

    }
}