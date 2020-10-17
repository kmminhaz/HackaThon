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
import android.widget.TextView;

public class Profile_Activity extends AppCompatActivity {
    private TextView heading,details;
    private ImageView imageView;
    private Button appointment;

    private Animation scaleUp,scaleDown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_);

        appointment = findViewById(R.id.appointmentId);
        heading = findViewById(R.id.HeadingId);
        details = findViewById(R.id.DetailsId);
        imageView = findViewById(R.id.ImageId);

        scaleUp = AnimationUtils.loadAnimation(this,R.anim.scal_up);
        scaleDown = AnimationUtils.loadAnimation(this,R.anim.scale_down);

        appointment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                appointment.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        if(motionEvent.getAction()==MotionEvent.ACTION_DOWN)
                            appointment.startAnimation(scaleUp);
                        else if(motionEvent.getAction()==MotionEvent.ACTION_UP)
                            appointment.startAnimation(scaleDown);
                        return false;
                    }
                });
                Intent appoint_intent = new Intent(Profile_Activity.this, Add_Info.class);
                startActivity(appoint_intent);
            }
        });

        String value = getIntent().getStringExtra("Dr");

        if(value.equals("Dr. AKM Mamunur Rashid")){
            setTitle("Dr. AKM Mamunur Rashid");
            imageView.setImageResource (R.drawable.dr_akm_mahmunur_rashid);
            heading.setText("Dr. AKM Mamunur Rashid Details:");
            details.setText(R.string.Dr_AKM_Mamunur_Rashid);
        }
        else if(value.equals("Professor Dr. A.H.M. Enayet Hussain")){
            setTitle("Professor Dr. A.H.M. Enayet Hussain");
            imageView.setImageResource (R.drawable.dr_ahm_enayet_hussain);
            heading.setText("Professor Dr. A.H.M. Enayet Hussain Details:");
            details.setText(R.string.Professor_Dr__A_H_M__Enayet_Hussain);
        }
        else if(value.equals("Professor Dr. Deen Mohd. Noorul Huq")){
            setTitle("Professor Dr. Deen Mohd. Noorul Huq");
            imageView.setImageResource (R.drawable.dr_deen_mohd_noorul_huq);
            heading.setText("Professor Dr. Deen Mohd. Noorul Huq Details:");
            details.setText(R.string.Professor_Dr__Deen_Mohd__Noorul_Huq);
        }
        else if(value.equals("Professor Dr. Shah Alam")){
            setTitle("Professor Dr. Shah Alam");
            imageView.setImageResource (R.drawable.dr_shah_alam);
            heading.setText("Professor Dr. Shah Alam Details:");
            details.setText(R.string.Professor_Dr__Shah_Alam);
        }
        else if(value.equals("Professor Dr. Md. Saleh Uddin")){
            setTitle("Professor Dr. Md. Saleh Uddin ");
            imageView.setImageResource (R.drawable.dr_md_saleh_uddin);
            heading.setText("Professor Dr. Md. Saleh Uddin Details:");
            details.setText(R.string.Professor_Dr__Md__Saleh_Uddin);
        }

        else if(value.equals("Professor Dr. Jalal Ahmed")){
            setTitle("Professor Dr. Jalal Ahmed");
            imageView.setImageResource (R.drawable.dr_jalal_ahmed);
            heading.setText("Professor Dr. Jalal Ahmed Details:");
            details.setText(R.string.Professor_Dr__alal_Ahmed);
        }

        else if(value.equals("Dr. A.K.M. Nazmus Saquib")){
            setTitle("Dr. A.K.M. Nazmus Saquib");
            imageView.setImageResource (R.drawable.dr_akm_nazmus_saquib);
            heading.setText("Dr. A.K.M. Nazmus Saquib Details:");
            details.setText(R.string.Dr__A_K_M__Nazmus_Saquib);
        }else if(value.equals("Dr. A.K.M. Shamsul kabir")){
            setTitle("Dr. A.K.M. Shamsul kabir");
            imageView.setImageResource (R.drawable.dr_akm_shamsul_kabir);
            heading.setText("Dr. A.K.M. Shamsul kabir Details:");
            details.setText(R.string.Dr__A_K_M__Shamsul_kabir);
        }
        else if(value.equals("Professor Dr. A H M Rowshon")){
            setTitle("Professor Dr. A H M Rowshon");
            imageView.setImageResource (R.drawable.dr_a_h_m_rowshon);
            heading.setText("Professor Dr. A H M Rowshon Details:");
            details.setText(R.string.Professor_Dr__A_H_M_Rowshon);

        }
        else if(value.equals("Dr.Minhaz")){
            setTitle("K M Minhaz");
            imageView.setImageResource (R.drawable.d3);
            heading.setText("Dr.Minhaz's Details:");
            details.setText(R.string.Dr_Minhaz);

        }
        else if(value.equals("Professor Dr. A. K. M. Khorshed Alam")){
            setTitle("Professor Dr. A. K. M. Khorshed Alam");
            imageView.setImageResource (R.drawable.dr_a_k_m_khorshed_alam);
            heading.setText("Professor Dr. A. K. M. Khorshed Alam Details:");
            details.setText(R.string.Professor_Dr__A__K__M__Khorshed_Alam);

        }
        else if(value.equals("DProfessor Dr. Mobin Khan")){
            setTitle("Professor Dr. Mobin Khan");
            imageView.setImageResource (R.drawable.dr_mobin_khan);
            heading.setText("Professor Dr. Mobin Khan Details:");
            details.setText(R.string.Professor_Dr__Mobin_Khan);

        }
        else if(value.equals("Professor Dr. Mahbub H Khan")){
            setTitle("Professor Dr. Mahbub H Khan");
            imageView.setImageResource (R.drawable.dr_mahbub_h_khan);
            heading.setText("Professor Dr. Mahbub H Khan Details:");
            details.setText(R.string.Professor_Dr__Mahbub_H_Khan);

        }
        else if(value.equals("Professor Dr. M. T. Rahman")){
            setTitle("Professor Dr. M. T. Rahman");
            imageView.setImageResource (R.drawable.dr_mt_rahman);
            heading.setText("Professor Dr. M. T. Rahman Details:");
            details.setText(R.string.Professor_Dr__M__T__Rahman);

        }
        else if(value.equals("Professor Dr. Md. Muzibur Rahman Bhuiyan")){
            setTitle("Professor Dr. Md. Muzibur Rahman Bhuiyan");
            imageView.setImageResource (R.drawable.dr_md_muzibur_rahman_bhuiyan);
            heading.setText("Professor Dr. Md. Muzibur Rahman Bhuiyan Details:");
            details.setText(R.string.Professor_Dr__Md__Muzibur_Rahman_Bhuiyan);

        }
        else if(value.equals("Dr. Tasmia Tahmid")){
            setTitle("Dr. Tasmia Tahmid");
            imageView.setImageResource (R.drawable.dr_tasmia_tahmid);
            heading.setText("Dr. Tasmia Tahmid Details:");
            details.setText(R.string.Dr__Tasmia_Tahmid);

        }
        else if(value.equals("Dr. Salma Sultana")){
            setTitle("Dr. Salma Sultana");
            imageView.setImageResource (R.drawable.dr_salma_sultana);
            heading.setText("Dr. Salma Sultana Details:");
            details.setText(R.string.Dr__Salma_Sultana);

        }

        else if(value.equals("Dr. Abdul Ali")){
            setTitle("Dr. Abdul Ali");
            imageView.setImageResource (R.drawable.dr_abdul_ali);
            heading.setText("Dr. Abdul Ali Details:");
            details.setText(R.string.Dr__Abdul_Ali);

        }

        else if(value.equals("Dr. Md. Mohiuddin")){
            setTitle("Dr. Md. Mohiuddin");
            imageView.setImageResource (R.drawable.dr_md_mohiuddin);
            heading.setText("Dr. Md. Mohiuddin Details:");
            details.setText(R.string.Dr__Md__Mohiuddin);

        }else if(value.equals("Dr. Raihana Awal Sumi")){
            setTitle("Dr. Raihana Awal Sumi");
            imageView.setImageResource (R.drawable.dr_raihana_awal_sumi);
            heading.setText("Dr. Raihana Awal Sumi Details:");
            details.setText(R.string.Dr__Raihana_Awal_Sumi);

        }
        else if(value.equals("Professor Dr. Nishat Begum")){
            setTitle("Professor Dr. Nishat Begum");
            imageView.setImageResource (R.drawable.dr_nishat_begum);
            heading.setText("Professor Dr. Nishat Begum Details:");
            details.setText(R.string.Professor_Dr__Nishat_Begum);

        }
        else if(value.equals("Dr. S.K. Basu")){
            setTitle("Dr. S.K. Basu");
            imageView.setImageResource (R.drawable.dr_sk_basu);
            heading.setText("Dr. S.K. Basu Details:");
            details.setText(R.string.Dr__S_K__Basu);

        }
        else if(value.equals("Prof. Dr. Anisur Rahman")){
            setTitle("Prof. Dr. Anisur Rahman");
            imageView.setImageResource (R.drawable.dr_anisur_rahman);
            heading.setText("Prof. Dr. Anisur Rahman Details:");
            details.setText(R.string.Prof__Dr__Anisur_Rahman);

        }
        else if(value.equals("Professor Dr. Zafar A. Latif")){
            setTitle("Professor Dr. Zafar A. Latif");
            imageView.setImageResource (R.drawable.dr_zafar_a_latif);
            heading.setText("Professor Dr. Zafar A. Latif Details:");
            details.setText(R.string.Professor_Dr__Zafar_A__Latif);

        }
        else if(value.equals("Dr. Indrajit Prasad")){
            setTitle("Dr. Indrajit Prasad");
            imageView.setImageResource (R.drawable.dr_indrajit_prasad);
            heading.setText("Dr. Indrajit Prasad Details:");
            details.setText(R.string.Dr__Indrajit_Prasad);

        }
        else if(value.equals("Dr. Ahsanul Haq Amin")){
            setTitle("Dr. Ahsanul Haq Amin");
            imageView.setImageResource (R.drawable.dr_ahsanul_haq_amin);
            heading.setText("Dr. Ahsanul Haq Amin Details:");
            details.setText(R.string.Dr__Ahsanul_Haq_Amin);

        }
        else if(value.equals("Dr. Md. Feroz Amin")){
            setTitle("Dr. Md. Feroz Amin");
            imageView.setImageResource (R.drawable.dr_md_feroz_amin);
            heading.setText("Dr. Md. Feroz Amin Details:");
            details.setText(R.string.Dr__Md__Feroz_Amin);

        }
        else if(value.equals("Dr. ( Capt. Rtd. ) H.S Ferdous")){
            setTitle("Dr. ( Capt. Rtd. ) H.S Ferdous");
            imageView.setImageResource (R.drawable.dr_capt_rtd_hs_ferdous);
            heading.setText("Dr. ( Capt. Rtd. ) H.S Ferdous Details:");
            details.setText(R.string.Dr__Capt_Rtd__H_S_Ferdous);

        }
        else if(value.equals("Dr. Abdul Mannan Sarker")){
            setTitle("Dr. Abdul Mannan Sarker");
            imageView.setImageResource (R.drawable.dr_abdul_mannan_sarker);
            heading.setText("Dr. Abdul Mannan Sarker Details:");
            details.setText(R.string.Dr__Abdul_Mannan_Sarker);

        }

        else if(value.equals("PROF. COLONEL DR MD SHIRAJUL ISLAM KHAN")){
            setTitle("PROF. COLONEL DR MD SHIRAJUL ISLAM KHAN");
            imageView.setImageResource (R.drawable.dr_md_shirajul_islam_khan);
            heading.setText("PROF. COLONEL DR MD SHIRAJUL ISLAM KHAN Details:");
            details.setText(R.string.PROF__COLONEL_DR_MD_SHIRAJUL_ISLAM_KHAN);

        }

        else if(value.equals("Dr Lubna Khondker")){
            setTitle("Dr Lubna Khondker");
            imageView.setImageResource (R.drawable.dr_lubna_khondker);
            heading.setText("Dr Lubna Khondker Details:");
            details.setText(R.string.Dr_Lubna_Khondker);

        }else if(value.equals("Associate Prof. Dr. Hosne Ara Begum")){
            setTitle("Associate Prof. Dr. Hosne Ara Begum");
            imageView.setImageResource (R.drawable.dr_hosne_ara_begum);
            heading.setText("Associate Prof. Dr. Hosne Ara Begum Details:");
            details.setText(R.string.Associate_Prof__Dr__Hosne_Ara_Begum);

        }
        else if(value.equals("Dr. A.S. Mofrehuddin")){
            setTitle("Dr. A.S. Mofrehuddin");
            imageView.setImageResource (R.drawable.dr_as_mofrehuddin_ahmed);
            heading.setText("Dr. A.S. Mofrehuddin Details:");
            details.setText(R.string.Dr__A_S__Mofrehuddin_Ahmed);

        }
        else if(value.equals("Dr. A.S.M. Zakariya")){
            setTitle("Dr. A.S.M. Zakariya");
            imageView.setImageResource (R.drawable.dr_asm_zakariya);
            heading.setText("Dr. A.S.M. Zakariya Details:");
            details.setText(R.string.Dr__A_S_M__Zakariya);

        }
        else if(value.equals("Dr. A.T.M. Asaduzzaman")){
            setTitle("Dr. A.T.M. Asaduzzaman");
            imageView.setImageResource (R.drawable.dr_atm_asaduzzaman);
            heading.setText("Dr. A.T.M. Asaduzzaman Details:");
            details.setText(R.string.Dr__A_T_M__Asaduzzaman);

        }
        else if(value.equals("Dr. Abdul Quaium Chowdhury")){
            setTitle("Dr. Abdul Quaium Chowdhury");
            imageView.setImageResource (R.drawable.dr_abdul_quaium_chowdhury);
            heading.setText("Dr. Abdul Quaium Chowdhury Details:");
            details.setText(R.string.Dr__Abdul_Quaium_Chowdhury);

        }
        else if(value.equals("Professor Dr. Abdullah-Al-Safi Majumder")){
            setTitle("Professor Dr. Abdullah-Al-Safi Majumder");
            imageView.setImageResource (R.drawable.dr_abdullah_al_safi_majumder);
            heading.setText("Professor Dr. Abdullah-Al-Safi Majumder Details:");
            details.setText(R.string.Professor_Dr__Abdullah_Al_Safi_Majumder);

        }
        else if(value.equals("Professor (Dr.) Md. Fakhrul Islam")){
            setTitle("Professor (Dr.) Md. Fakhrul Islam");
            imageView.setImageResource (R.drawable.dr_md_fakhrul_islam);
            heading.setText("Professor (Dr.) Md. Fakhrul Islam Details:");
            details.setText(R.string.Professor_Dr__Md__Fakhrul_Islam);

        }
        else if(value.equals("Dr. H. I. Lutfor Rahman Khan")){
            setTitle("Dr. H. I. Lutfor Rahman Khan");
            imageView.setImageResource (R.drawable.dr_hi_lutfor_rahman_khan);
            heading.setText("Dr. H. I. Lutfor Rahman Khan Details:");
            details.setText(R.string.Dr__H__I__Lutfor_Rahman_Khan);

        }
        else if(value.equals("Professor Dr. Md. Afjalur Rahman")){
            setTitle("Professor Dr. Md. Afjalur Rahman");
            imageView.setImageResource (R.drawable.dr_md_afjalur_rahman);
            heading.setText("Professor Dr. Md. Afjalur Rahman Details:");
            details.setText(R.string.Professor_Dr__Md__Afjalur_Rahman);

        }
        else if(value.equals("Professor Dr. Abduz Zaher")){
            setTitle("Professor Dr. Abduz Zaher");
            imageView.setImageResource (R.drawable.dr_abduz_zaher);
            heading.setText("Professor Dr. Abduz Zaher Details:");
            details.setText(R.string.Professor_Dr__Abduz_Zaher);

        }

        else if(value.equals("Professor Dr. Abu Zafar")){
            setTitle("Professor Dr. Abu Zafar");
            imageView.setImageResource (R.drawable.dr_abu_safar);
            heading.setText("Professor Dr. Abu Zafar Details:");
            details.setText(R.string.Professor_Dr__Abu_Zafar);

        }

        else if(value.equals("Professor Hasina Banoo")){
            setTitle("Professor Hasina Banoo");
            imageView.setImageResource (R.drawable.dr_hasina_banoo);
            heading.setText("Professor Hasina Banoo Details:");
            details.setText(R.string.Professor_Hasina_Banoo);

        }else if(value.equals("Prof. Dr. Pran Gopal Datta")){
            setTitle("Prof. Dr. Pran Gopal Datta");
            imageView.setImageResource (R.drawable.dr_pran_gopal_datta);
            heading.setText("Prof. Dr. Pran Gopal Datta Details:");
            details.setText(R.string.Prof__Dr__Pran_Gopal_Datta);

        }
        else if(value.equals("Prof. Dr. Md. Kamrul Hassan Tarafder")){
            setTitle("Prof. Dr. Md. Kamrul Hassan Tarafder");
            imageView.setImageResource (R.drawable.dr_md_kamrul_hassan_tarafder);
            heading.setText("Dr.Ria's Details:");
            details.setText(R.string.Prof__Dr__Md__Kamrul_Hassan_Tarafder);

        }
        else if(value.equals("Prof. Dr. Belayet Hossain Siddiquee")){
            setTitle("Prof. Dr. Belayet Hossain Siddiquee");
            imageView.setImageResource (R.drawable.dr_belayet_hossain_siddiquee);
            heading.setText("Prof. Dr. Belayet Hossain Siddiquee Details:");
            details.setText(R.string.Prof__Dr__Belayet_Hossain_Siddiquee);

        }
        else if(value.equals("Prof. Dr. Zahurul Huq")){
            setTitle("Prof. Dr. Zahurul Huq");
            imageView.setImageResource (R.drawable.dr_zahurul_huq);
            heading.setText("Prof. Dr. Zahurul Huq Details:");
            details.setText(R.string.Prof_Dr__Zahurul_Huq);

        }
        else if(value.equals("DProf. Dr. M. A. Matin")){
            setTitle("Prof. Dr. M. A. Matin");
            imageView.setImageResource (R.drawable.dr_ma_matin);
            heading.setText("Prof. Dr. M. A. Matin Details:");
            details.setText(R.string.Prof__Dr__M__A__Matin);

        }
        else if(value.equals("Prof. Dr. Md. Monjurul Alam")){
            setTitle("Prof. Dr. Md. Monjurul Alam");
            imageView.setImageResource (R.drawable.dr_md_monjurul_alam);
            heading.setText("Prof. Dr. Md. Monjurul Alam Details:");
            details.setText(R.string.Prof__Dr__Md__Monjurul_Alam);

        }
        else if(value.equals("Prof. Dr. Delwar Hossain")){
            setTitle("Prof. Dr. Delwar Hossain");
            imageView.setImageResource (R.drawable.dr_delwar_hossain);
            heading.setText("Prof. Dr. Delwar Hossain Details:");
            details.setText(R.string.Prof__Dr__Delwar_Hossain);

        }
        else if(value.equals("Dr.Ria")){
            setTitle("Ria Ahasan");
            imageView.setImageResource (R.drawable.d2);
            heading.setText("Dr.Ria's Details:");
            details.setText(R.string.Dr_Ria);

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