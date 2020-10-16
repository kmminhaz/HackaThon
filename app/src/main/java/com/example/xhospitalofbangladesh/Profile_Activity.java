package com.example.xhospitalofbangladesh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Profile_Activity extends AppCompatActivity {
    private TextView heading,details;
    private ImageView imageView;
    private Button appointment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_);

        appointment = findViewById(R.id.appointmentId);
        heading = findViewById(R.id.HeadingId);
        details = findViewById(R.id.DetailsId);
        imageView = findViewById(R.id.ImageId);

        appointment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent appoint_intent = new Intent(Profile_Activity.this, Add_Info.class);
                startActivity(appoint_intent);
            }
        });

        String value = getIntent().getStringExtra("Dr");

        if(value.equals("Dr.Rifat")){
            setTitle("Rifat Ahasan");
            imageView.setImageResource (R.drawable.d1);
            heading.setText("Dr.Rifat's Details:");
            details.setText(R.string.Dr_Rifat);
        }


        else if(value.equals("Dr.Ria")){
            setTitle("Ria Ahasan");
            imageView.setImageResource (R.drawable.d2);
            heading.setText("Dr.Ria's Details:");
            details.setText(R.string.Dr_Ria);

        }
        else if(value.equals("Dr.Minhaz")){
            setTitle("K M Minhaz");
            imageView.setImageResource (R.drawable.d3);
            heading.setText("Dr.Minhaz's Details:");
            details.setText(R.string.Dr_Minhaz);

        }
        else if(value.equals("Dr.Monisha")){
            setTitle("Tamanna Monisha ");
            imageView.setImageResource (R.drawable.d6);
            heading.setText("Dr.Monisha's Details:");
            details.setText(R.string.Dr_Monisha);

        }

        else if(value.equals("Dr.Arif")){
            setTitle("Mohammad Arif");
            imageView.setImageResource (R.drawable.d4);
            heading.setText("Dr.Arif's Details:");
            details.setText(R.string.Dr_Arif);

        }

        else if(value.equals("Dr.Rahim")){
            setTitle("Azizur Rahim");
            imageView.setImageResource (R.drawable.d5);
            heading.setText("Dr.Azizur Rahim Details:");
            details.setText(R.string.Dr_Rahim);

        }else if(value.equals("Dr.Atik")){
            setTitle("Eftekharul Atik");
            imageView.setImageResource (R.drawable.d5);
            heading.setText("Dr.Eftekharul Atik Details:");
            details.setText(R.string.Dr_Atik);

        }
    }
}