package com.example.xhospitalofbangladesh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Add_Info extends AppCompatActivity {

    private EditText name,number,time;
    private Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add__info);

        name = findViewById(R.id.NameId);
        number = findViewById(R.id.NumberId);
        submit = findViewById(R.id.SubmitBtnId);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Add_Info.this,"Your Appointment has been taken",Toast.LENGTH_LONG);
            }
        });
    }
}