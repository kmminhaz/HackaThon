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

import com.smarteist.autoimageslider.DefaultSliderView;
import com.smarteist.autoimageslider.IndicatorAnimations;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderLayout;

import org.w3c.dom.Text;

public class Department_Activity extends AppCompatActivity implements View.OnClickListener {

    private SliderLayout sliderLayout;
    private Button Eye,Liver,Breast_Cancer,Diabetes_and_Endocrinologi,Dermatology,Cardiology_Heart,ENT_Head_and_Neck,Forensic,Neurology;
    private Animation scaleUp,scaleDown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_department_);

        scaleUp = AnimationUtils.loadAnimation(this,R.anim.scal_up);
        scaleDown = AnimationUtils.loadAnimation(this,R.anim.scale_down);

        Eye = findViewById(R.id.EyeBtnId);
        Liver = findViewById(R.id.LiverBtnId);
        Breast_Cancer = findViewById(R.id.BreastBtnId);
        Diabetes_and_Endocrinologi = findViewById(R.id.Diabetes_EndocrinologiBtnId);
        Dermatology = findViewById(R.id.DarmatologyBtnId);
        Cardiology_Heart = findViewById(R.id.CardiologyBtnId);
        ENT_Head_and_Neck = findViewById(R.id.ENT_Head_NeckBtnId);
        Neurology = findViewById(R.id.NeurologyBtnId);
        Forensic = findViewById(R.id.ForensicBtnId);

        Eye.setOnClickListener(this);
        Liver.setOnClickListener(this);
        Breast_Cancer.setOnClickListener(this);
        Diabetes_and_Endocrinologi.setOnClickListener(this);
        Dermatology.setOnClickListener(this);
        Cardiology_Heart.setOnClickListener(this);
        ENT_Head_and_Neck.setOnClickListener(this);
        Neurology.setOnClickListener(this);
        Forensic.setOnClickListener(this);

        sliderLayout = findViewById(R.id.slider);
        sliderLayout.setIndicatorAnimation(IndicatorAnimations.FILL);
        sliderLayout.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        sliderLayout.setScrollTimeInSec(2);

        setSliderViews();
    }

    private void setSliderViews() {
        for (int i = 0; i<13; i++){
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

            }
            sliderView.setImageScaleType(ImageView.ScaleType.FIT_CENTER);
            sliderLayout.addSliderView(sliderView);
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.EyeBtnId:
                Eye.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        if(motionEvent.getAction()==MotionEvent.ACTION_DOWN)
                            Eye.startAnimation(scaleUp);
                        else if(motionEvent.getAction()==MotionEvent.ACTION_UP)
                            Eye.startAnimation(scaleDown);
                        return false;
                    }
                });
                Intent intent1 = new Intent(Department_Activity.this,Doctor_List_Activity.class);
                intent1.putExtra("Department","Dr1");
                startActivity(intent1);
                break;
            case R.id.LiverBtnId:
                Liver.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        if(motionEvent.getAction()==MotionEvent.ACTION_DOWN)
                            Liver.startAnimation(scaleUp);
                        else if(motionEvent.getAction()==MotionEvent.ACTION_UP)
                            Liver.startAnimation(scaleDown);
                        return false;
                    }
                });
                Intent intent2 = new Intent(Department_Activity.this,Doctor_List_Activity.class);
                intent2.putExtra("Department","Dr2");
                startActivity(intent2);
                break;
            case R.id.BreastBtnId:
                Breast_Cancer.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        if(motionEvent.getAction()==MotionEvent.ACTION_DOWN)
                            Breast_Cancer.startAnimation(scaleUp);
                        else if(motionEvent.getAction()==MotionEvent.ACTION_UP)
                            Breast_Cancer.startAnimation(scaleDown);
                        return false;
                    }
                });
                Intent intent3 = new Intent(Department_Activity.this,Doctor_List_Activity.class);
                intent3.putExtra("Department","Dr3");
                startActivity(intent3);
                break;
            case R.id.Diabetes_EndocrinologiBtnId:
                Diabetes_and_Endocrinologi.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        if(motionEvent.getAction()==MotionEvent.ACTION_DOWN)
                            Diabetes_and_Endocrinologi.startAnimation(scaleUp);
                        else if(motionEvent.getAction()==MotionEvent.ACTION_UP)
                            Diabetes_and_Endocrinologi.startAnimation(scaleDown);
                        return false;
                    }
                });
                Intent intent4 = new Intent(Department_Activity.this,Doctor_List_Activity.class);
                intent4.putExtra("Department","Dr4");
                startActivity(intent4);
                break;
            case R.id.DarmatologyBtnId:
                Dermatology.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        if(motionEvent.getAction()==MotionEvent.ACTION_DOWN)
                            Dermatology.startAnimation(scaleUp);
                        else if(motionEvent.getAction()==MotionEvent.ACTION_UP)
                            Dermatology.startAnimation(scaleDown);
                        return false;
                    }
                });
                Intent intent5 = new Intent(Department_Activity.this,Doctor_List_Activity.class);
                intent5.putExtra("Department","Dr5");
                startActivity(intent5);
                break;
            case R.id.CardiologyBtnId:
                Cardiology_Heart.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        if(motionEvent.getAction()==MotionEvent.ACTION_DOWN)
                            Cardiology_Heart.startAnimation(scaleUp);
                        else if(motionEvent.getAction()==MotionEvent.ACTION_UP)
                            Cardiology_Heart.startAnimation(scaleDown);
                        return false;
                    }
                });
                Intent intent6 = new Intent(Department_Activity.this,Doctor_List_Activity.class);
                intent6.putExtra("Department","Dr6");
                startActivity(intent6);
                break;
            case R.id.ENT_Head_NeckBtnId:
                ENT_Head_and_Neck.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        if(motionEvent.getAction()==MotionEvent.ACTION_DOWN)
                            ENT_Head_and_Neck.startAnimation(scaleUp);
                        else if(motionEvent.getAction()==MotionEvent.ACTION_UP)
                            ENT_Head_and_Neck.startAnimation(scaleDown);
                        return false;
                    }
                });
                Intent intent7 = new Intent(Department_Activity.this,Doctor_List_Activity.class);
                intent7.putExtra("Department","Dr7");
                startActivity(intent7);
                break;
            case R.id.NeurologyBtnId:
                Neurology.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        if(motionEvent.getAction()==MotionEvent.ACTION_DOWN)
                            Neurology.startAnimation(scaleUp);
                        else if(motionEvent.getAction()==MotionEvent.ACTION_UP)
                            Neurology.startAnimation(scaleDown);
                        return false;
                    }
                });
                Intent intent8 = new Intent(Department_Activity.this,Doctor_List_Activity.class);
                intent8.putExtra("Department","Dr8");
                startActivity(intent8);
                break;
            case R.id.ForensicBtnId:
                Forensic.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        if(motionEvent.getAction()==MotionEvent.ACTION_DOWN)
                            Forensic.startAnimation(scaleUp);
                        else if(motionEvent.getAction()==MotionEvent.ACTION_UP)
                            Forensic.startAnimation(scaleDown);
                        return false;
                    }
                });
                Intent intent9 = new Intent(Department_Activity.this,Doctor_List_Activity.class);
                intent9.putExtra("Department","Dr9");
                startActivity(intent9);
                break;
        }
    }
}