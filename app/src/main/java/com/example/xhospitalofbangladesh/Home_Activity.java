package com.example.xhospitalofbangladesh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.smarteist.autoimageslider.DefaultSliderView;
import com.smarteist.autoimageslider.IndicatorAnimations;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderLayout;

public class Home_Activity extends AppCompatActivity {

    private SliderLayout sliderLayout;
    private Button Admin,Patient;
    private Animation scaleUp,scaleDown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_);

        scaleUp = AnimationUtils.loadAnimation(this,R.anim.scal_up);
        scaleDown = AnimationUtils.loadAnimation(this,R.anim.scale_down);

        Admin = findViewById(R.id.AdminBtn);
        Patient = findViewById(R.id.PatientBtn);


        Patient.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Patient.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        if(motionEvent.getAction()==MotionEvent.ACTION_DOWN)
                            Patient.startAnimation(scaleUp);
                        else if(motionEvent.getAction()==MotionEvent.ACTION_UP)
                            Patient.startAnimation(scaleDown);
                        return false;
                    }
                });
                Intent Patient_intent = new Intent(Home_Activity.this, Department_Activity.class);
                startActivity(Patient_intent);
            }
        });

        Admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Admin.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        if(motionEvent.getAction()==MotionEvent.ACTION_DOWN)
                            Admin.startAnimation(scaleUp);
                        else if(motionEvent.getAction()==MotionEvent.ACTION_UP)
                            Admin.startAnimation(scaleDown);
                        return false;
                    }
                });
                /*FirebaseDatabase fd = FirebaseDatabase.getInstance();
                DatabaseReference df = fd.getReference();

                df.setValue("hi");*/
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
        for (int i = 0; i<14; i++){
            DefaultSliderView sliderView =new DefaultSliderView(this);

            switch(i) {
                case 0:
                    sliderView.setImageDrawable(R.drawable.eye);
                    break;
                case 1:
                    sliderView.setImageDrawable(R.drawable.liver_patient);
                    break;
                case 2:
                    sliderView.setImageDrawable(R.drawable.breast_cancer);
                    break;
                case 3:
                    sliderView.setImageDrawable(R.drawable.diabetes_endocrinologi);
                    break;
                case 4:
                    sliderView.setImageDrawable(R.drawable.cardiology);
                    break;
                case 5:
                    sliderView.setImageDrawable(R.drawable.darmatology);
                    break;
                case 6:
                    sliderView.setImageDrawable(R.drawable.neurology);
                    break;
                case 7:
                    sliderView.setImageDrawable(R.drawable.neurology1);
                    break;
                case 8:
                    sliderView.setImageDrawable(R.drawable.ent_head_neck);
                    break;
                case 9:
                    sliderView.setImageDrawable(R.drawable.ent_head_neck1);
                    break;
                case 10:
                    sliderView.setImageDrawable(R.drawable.forensic);
                    break;
                case 11:
                    sliderView.setImageDrawable(R.drawable.forensic1);
                    break;
                case 12:
                    sliderView.setImageDrawable(R.drawable.dr_akm_mahmunur_rashid);
                    break;
                case 13:
                    sliderView.setImageDrawable(R.drawable.operative_room);
                    break;
            }
            sliderView.setImageScaleType(ImageView.ScaleType.FIT_CENTER);
            sliderLayout.addSliderView(sliderView);
        }
    }
}