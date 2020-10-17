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
        for (int i = 0; i<51; i++){
            DefaultSliderView sliderView =new DefaultSliderView(this);

            switch(i) {
                case 0:
                    sliderView.setImageDrawable(R.drawable.dr_akm_mahmunur_rashid);
                    break;
                case 1:
                    sliderView.setImageDrawable(R.drawable.dr_a_h_m_rowshon);
                    break;
                case 2:
                    sliderView.setImageDrawable(R.drawable.dr_a_k_m_khorshed_alam);
                    break;
                case 3:
                    sliderView.setImageDrawable(R.drawable.dr_abdul_ali);
                    break;
                case 4:
                    sliderView.setImageDrawable(R.drawable.dr_abdul_mannan_sarker);
                    break;
                case 5:
                    sliderView.setImageDrawable(R.drawable.dr_abdul_quaium_chowdhury);
                    break;
                case 6:
                    sliderView.setImageDrawable(R.drawable.dr_abdullah_al_safi_majumder);
                    break;
                case 7:
                    sliderView.setImageDrawable(R.drawable.dr_abduz_zaher);
                    break;
                case 8:
                    sliderView.setImageDrawable(R.drawable.dr_abu_safar);
                    break;
                case 9:
                    sliderView.setImageDrawable(R.drawable.dr_ahm_enayet_hussain);
                    break;
                case 10:
                    sliderView.setImageDrawable(R.drawable.dr_ahsanul_haq_amin);
                    break;
                case 11:
                    sliderView.setImageDrawable(R.drawable.dr_akm_nazmus_saquib);
                    break;
                case 12:
                    sliderView.setImageDrawable(R.drawable.dr_akm_shamsul_kabir);
                    break;
                case 13:
                    sliderView.setImageDrawable(R.drawable.dr_anisur_rahman);
                    break;
                case 14:
                    sliderView.setImageDrawable(R.drawable.dr_as_mofrehuddin_ahmed);
                    break;
                case 15:
                    sliderView.setImageDrawable(R.drawable.dr_asm_zakariya);
                    break;
                case 16:
                    sliderView.setImageDrawable(R.drawable.dr_atm_asaduzzaman);
                    break;
                case 17:
                    sliderView.setImageDrawable(R.drawable.dr_abdullah_al_safi_majumder);
                    break;
                case 18:
                    sliderView.setImageDrawable(R.drawable.dr_belayet_hossain_siddiquee);
                    break;
                case 19:
                    sliderView.setImageDrawable(R.drawable.dr_capt_rtd_hs_ferdous);
                    break;
                case 20:
                    sliderView.setImageDrawable(R.drawable.dr_deen_mohd_noorul_huq);
                    break;
                case 21:
                    sliderView.setImageDrawable(R.drawable.dr_deen_mohd_noorul_huq);
                    break;
                case 22:
                    sliderView.setImageDrawable(R.drawable.dr_delwar_hossain);
                    break;
                case 23:
                    sliderView.setImageDrawable(R.drawable.dr_lubna_khondker);
                    break;
                case 24:
                    sliderView.setImageDrawable(R.drawable.dr_hasina_banoo);
                    break;
                case 25:
                    sliderView.setImageDrawable(R.drawable.dr_hi_lutfor_rahman_khan);
                    break;
                case 26:
                    sliderView.setImageDrawable(R.drawable.dr_ma_matin);
                    break;
                case 27:
                    sliderView.setImageDrawable(R.drawable.dr_mahbub_h_khan);
                    break;
                case 28:
                    sliderView.setImageDrawable(R.drawable.dr_salma_sultana);
                    break;
                case 29:
                    sliderView.setImageDrawable(R.drawable.dr_indrajit_prasad);
                    break;
                case 30:
                    sliderView.setImageDrawable(R.drawable.dr_hosne_ara_begum);
                    break;
                case 31:
                    sliderView.setImageDrawable(R.drawable.dr_md_fakhrul_islam);
                    break;
                case 32:
                    sliderView.setImageDrawable(R.drawable.dr_jalal_ahmed);
                    break;
                case 33:
                    sliderView.setImageDrawable(R.drawable.dr_mohammad_safiuddin);
                    break;
                case 34:
                    sliderView.setImageDrawable(R.drawable.dr_md_muzibur_rahman_bhuiyan);
                    break;
                case 35:
                    sliderView.setImageDrawable(R.drawable.dr_mt_rahman);
                    break;
                case 36:
                    sliderView.setImageDrawable(R.drawable.dr_mobin_khan);
                    break;
                case 37:
                    sliderView.setImageDrawable(R.drawable.dr_sk_basu);
                    break;
                case 38:
                    sliderView.setImageDrawable(R.drawable.dr_zahurul_huq);
                    break;
                case 39:
                    sliderView.setImageDrawable(R.drawable.dr_zafar_a_latif);
                    break;
                case 40:
                    sliderView.setImageDrawable(R.drawable.dr_tasmia_tahmid);
                    break;
                case 41:
                    sliderView.setImageDrawable(R.drawable.dr_nishat_begum);
                    break;
                case 42:
                    sliderView.setImageDrawable(R.drawable.dr_md_shirajul_islam_khan);
                    break;
                case 43:
                    sliderView.setImageDrawable(R.drawable.dr_raihana_awal_sumi);
                    break;
                case 44:
                    sliderView.setImageDrawable(R.drawable.dr_md_mohiuddin);
                    break;
                case 45:
                    sliderView.setImageDrawable(R.drawable.dr_md_kamrul_hassan_tarafder);
                    break;
                case 46:
                    sliderView.setImageDrawable(R.drawable.dr_shah_alam);
                    break;
                case 47:
                    sliderView.setImageDrawable(R.drawable.dr_mohammad_safiuddin);
                    break;
                case 48:
                    sliderView.setImageDrawable(R.drawable.dr_md_saleh_uddin);
                    break;
                case 49:
                    sliderView.setImageDrawable(R.drawable.dr_mahbub_h_khan);
                    break;
                case 50:
                    sliderView.setImageDrawable(R.drawable.dr_md_fakhrul_islam);
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