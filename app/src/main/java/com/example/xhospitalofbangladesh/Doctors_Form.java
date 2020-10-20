package com.example.xhospitalofbangladesh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Doctors_Form extends AppCompatActivity {

    EditText Name,Speciality,Number,Details;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctors__form);

        Name = findViewById(R.id.DrNameEtId);
        Speciality = findViewById(R.id.DrSpecialityEtId);
        Number = findViewById(R.id.DrNumberEtId);
        Details = findViewById(R.id.DrDetailsEtId);

        submit = findViewById(R.id.AddBtnId);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = Name.getText().toString().trim();
                String speciality = Speciality.getText().toString().trim();
                String number = Number.getText().toString().trim();
                String details = Details.getText().toString().trim();

                Doctor_info_Holder holder = new Doctor_info_Holder(name,speciality,number,details);

                FirebaseDatabase fd = FirebaseDatabase.getInstance();
                DatabaseReference df = fd.getReference();

                df.child(speciality).child(name).setValue(holder);

                Name.setText("");
                Speciality.setText("");
                Number.setText("");
                Details.setText("");

                Toast.makeText(Doctors_Form.this,"Check The Database",Toast.LENGTH_LONG).show();
            }
        });
    }
}