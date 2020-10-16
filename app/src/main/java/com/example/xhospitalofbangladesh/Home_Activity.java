package com.example.xhospitalofbangladesh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.smarteist.autoimageslider.DefaultSliderView;
import com.smarteist.autoimageslider.IndicatorAnimations;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderLayout;

public class Home_Activity extends AppCompatActivity {

    private SliderLayout sliderLayout;
    private Button Admin,Patient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_);

        Admin = findViewById(R.id.AdminBtn);
        Patient = findViewById(R.id.PatientBtn);

        Patient.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Patient_intent = new Intent(Home_Activity.this, Department_Activity.class);
                startActivity(Patient_intent);
            }
        });

        Admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Admin_intent = new Intent(Home_Activity.this, Admin_Login_Activity.class);
                startActivity(Admin_intent);
            }
        });

        sliderLayout = findViewById(R.id.slider);
        sliderLayout.setIndicatorAnimation(IndicatorAnimations.FILL);
        sliderLayout.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        sliderLayout.setScrollTimeInSec(2);

        setSliderViews();
    }

    private void setSliderViews(){
        for (int i = 0; i<5; i++){
            DefaultSliderView sliderView =new DefaultSliderView(this);

            switch(i) {
                case 0:
                    sliderView.setImageDrawable(R.drawable.d1);
                    break;
                case 1:
                    sliderView.setImageDrawable(R.drawable.d2);
                    break;
                case 2:
                    sliderView.setImageDrawable(R.drawable.d3);
                    break;
                case 3:
                    sliderView.setImageDrawable(R.drawable.d4);
                    break;
                case 4:
                    sliderView.setImageDrawable(R.drawable.d5);
                    break;
            }
            sliderView.setImageScaleType(ImageView.ScaleType.CENTER);
            sliderLayout.addSliderView(sliderView);
        }
    }
}