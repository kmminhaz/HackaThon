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

import org.w3c.dom.Text;

public class Department_Activity extends AppCompatActivity implements View.OnClickListener {

    private SliderLayout sliderLayout;
    Text txt;
    String Dr;
    Button Anesthetics,Burn_Unit,Cardiology,Discharge_Lounge,
            Elderly_Services,Finance_Department,Health_And_Safety,Neurology,Sexual_Health;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_department_);

        Anesthetics = findViewById(R.id.AnestheticsBtnId);
        Burn_Unit = findViewById(R.id.Burn_UnitBtnId);
        Cardiology = findViewById(R.id.CardiologyBtnId);
        Discharge_Lounge = findViewById(R.id.Discharge_LoungeBtnId);
        Elderly_Services = findViewById(R.id.Elderly_ServicesBtnId);
        Finance_Department = findViewById(R.id.Finance_DepartmentBtnId);
        Health_And_Safety = findViewById(R.id.Health_And_SafetyBtnId);
        Neurology = findViewById(R.id.NeurologyBtnId);
        Sexual_Health = findViewById(R.id.Sexual_HealthBtnId);

        Anesthetics.setOnClickListener(this);
        Burn_Unit.setOnClickListener(this);
        Cardiology.setOnClickListener(this);
        Discharge_Lounge.setOnClickListener(this);
        Elderly_Services.setOnClickListener(this);
        Finance_Department.setOnClickListener(this);
        Health_And_Safety.setOnClickListener(this);
        Neurology.setOnClickListener(this);
        Sexual_Health.setOnClickListener(this);

        sliderLayout = findViewById(R.id.slider);
        sliderLayout.setIndicatorAnimation(IndicatorAnimations.FILL);
        sliderLayout.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        sliderLayout.setScrollTimeInSec(2);

        setSliderViews();
    }

    private void setSliderViews() {
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

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.AnestheticsBtnId:
                Intent intent1 = new Intent(Department_Activity.this,Doctor_List_Activity.class);
                intent1.putExtra("Department","Dr1");
                startActivity(intent1);
                break;
            case R.id.Burn_UnitBtnId:
                Intent intent2 = new Intent(Department_Activity.this,Doctor_List_Activity.class);
                intent2.putExtra("Department","Dr2");
                startActivity(intent2);
                break;
            case R.id.CardiologyBtnId:
                Intent intent3 = new Intent(Department_Activity.this,Doctor_List_Activity.class);
                intent3.putExtra("Department","Dr3");
                startActivity(intent3);
                break;
            case R.id.Discharge_LoungeBtnId:
                Intent intent4 = new Intent(Department_Activity.this,Doctor_List_Activity.class);
                intent4.putExtra("Department","Dr4");
                startActivity(intent4);
                break;
            case R.id.Elderly_ServicesBtnId:
                Intent intent5 = new Intent(Department_Activity.this,Doctor_List_Activity.class);
                intent5.putExtra("Department","Dr5");
                startActivity(intent5);
                break;
            case R.id.Finance_DepartmentBtnId:
                Intent intent6 = new Intent(Department_Activity.this,Doctor_List_Activity.class);
                intent6.putExtra("Department","Dr6");
                startActivity(intent6);
                break;
            case R.id.Health_And_SafetyBtnId:
                Intent intent7 = new Intent(Department_Activity.this,Doctor_List_Activity.class);
                intent7.putExtra("Dr","Dr7");
                startActivity(intent7);
                break;
            case R.id.NeurologyBtnId:
                Intent intent8 = new Intent(Department_Activity.this,Doctor_List_Activity.class);
                intent8.putExtra("Department","Dr8");
                startActivity(intent8);
                break;
            case R.id.Sexual_HealthBtnId:
                Intent intent9 = new Intent(Department_Activity.this,Doctor_List_Activity.class);
                intent9.putExtra("Department","Dr9");
                startActivity(intent9);
                break;

        }
    }
}