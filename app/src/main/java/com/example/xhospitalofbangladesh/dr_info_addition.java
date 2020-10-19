package com.example.xhospitalofbangladesh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class dr_info_addition extends AppCompatActivity {

    EditText DrName,DrSpeciality,DrNumber,DrDetails;
    Button submit;

    FirebaseDatabase rootNode;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dr_info_addition);

        DrName = findViewById(R.id.DrNameId);
        DrSpeciality = findViewById(R.id.DrSpecialityId);
        DrNumber = findViewById(R.id.DrNumberId);
        DrDetails = findViewById(R.id.DrDetailsId);

        submit = findViewById(R.id.DrSubmitBtnId);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                rootNode = FirebaseDatabase.getInstance();
                reference = rootNode.getReference("doctors");

                reference.setValue("Hi Rifat");
            }
        });
    }
}