package com.example.androidintentandintentfilter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity1 extends AppCompatActivity {
    EditText firstName;
    EditText lastName;
    EditText Age;
    Button Next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
        initView();
        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Activity1.this,Activity2.class);
                intent.putExtra("name",firstName.getText().toString());
                intent.putExtra("lastname",lastName.getText().toString());
                intent.putExtra("age",Age.getText().toString());
                startActivity(intent);

            }
        });

        
    }

    private void initView() {
        firstName=findViewById(R.id.FirstName);
        lastName=findViewById(R.id.LastName);
        Age=findViewById(R.id.etAge);
        Next=findViewById(R.id.next);

    }
}