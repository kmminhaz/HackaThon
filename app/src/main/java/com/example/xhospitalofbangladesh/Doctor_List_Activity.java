package com.example.xhospitalofbangladesh;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.icu.text.Transliterator;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class Doctor_List_Activity extends AppCompatActivity {

    private ListView listView;
    private String[] doctorName;
    private String[] doctorType;
    private MyAdapter adapter;
    private int[] image1={R.drawable.dr_akm_mahmunur_rashid,R.drawable.dr_ahm_enayet_hussain,R.drawable.dr_deen_mohd_noorul_huq,R.drawable.dr_shah_alam,R.drawable.dr_md_saleh_uddin,R.drawable.dr_jalal_ahmed,R.drawable.dr_akm_nazmus_saquib};
    private int[] image2={R.drawable.dr_akm_shamsul_kabir,R.drawable.dr_a_h_m_rowshon,R.drawable.dr_a_k_m_khorshed_alam,R.drawable.dr_mobin_khan,R.drawable.dr_mahbub_h_khan,R.drawable.dr_mt_rahman,R.drawable.dr_md_muzibur_rahman_bhuiyan};
    private int[] image3={R.drawable.dr_tasmia_tahmid,R.drawable.dr_salma_sultana,R.drawable.dr_md_mohiuddin,R.drawable.dr_raihana_awal_sumi,R.drawable.dr_nishat_begum,R.drawable.dr_sk_basu,R.drawable.dr_anisur_rahman};
    private int[] image4={R.drawable.dr_abdul_ali,R.drawable.dr_zafar_a_latif,R.drawable.dr_indrajit_prasad,R.drawable.dr_ahsanul_haq_amin,R.drawable.dr_md_feroz_amin,R.drawable.dr_abdul_mannan_sarker,R.drawable.dr_capt_rtd_hs_ferdous};
    private int[] image5={R.drawable.dr_md_shirajul_islam_khan,R.drawable.dr_lubna_khondker,R.drawable.dr_hosne_ara_begum,R.drawable.dr_as_mofrehuddin_ahmed,R.drawable.dr_asm_zakariya,R.drawable.dr_atm_asaduzzaman,R.drawable.dr_abdul_quaium_chowdhury};
    private int[] image6={R.drawable.dr_abdullah_al_safi_majumder,R.drawable.dr_md_fakhrul_islam,R.drawable.dr_hi_lutfor_rahman_khan,R.drawable.dr_md_afjalur_rahman,R.drawable.dr_abduz_zaher,R.drawable.dr_abu_safar,R.drawable.dr_hasina_banoo};
    private int[] image7={R.drawable.dr_pran_gopal_datta,R.drawable.dr_md_kamrul_hassan_tarafder,R.drawable.dr_belayet_hossain_siddiquee,R.drawable.dr_zahurul_huq,R.drawable.dr_ma_matin,R.drawable.dr_md_monjurul_alam,R.drawable.dr_delwar_hossain};
    private int[] image8={R.drawable.d1,R.drawable.d2, R.drawable.d3,R.drawable.d4,R.drawable.d5,R.drawable.logo,R.drawable.login1};
    private int[] image9={R.drawable.d1,R.drawable.d2, R.drawable.d3,R.drawable.d4,R.drawable.d5,R.drawable.logo,R.drawable.login1};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor__list_);
        listView = findViewById(R.id.listViewId);
        String str = getIntent().getStringExtra("Department");
        if(str.equals("Dr1")) {
            doctorName = getResources().getStringArray(R.array.Dr1);
            doctorType = getResources().getStringArray(R.array.doctor_type1);
            adapter = new MyAdapter(doctorName, doctorType, image1, Doctor_List_Activity.this);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                    String value= doctorName[position];
                    Toast.makeText(Doctor_List_Activity.this, ""+value, Toast.LENGTH_SHORT).show();

                    Intent intent= new Intent(Doctor_List_Activity.this,Profile_Activity.class);
                    intent.putExtra (value, image1);
                    startActivity (intent);

                    intent.putExtra ("Dr", value);
                    startActivity (intent);
                }
            });
        }
        else if(str.equals("Dr2")) {
            doctorName = getResources().getStringArray(R.array.Dr2);
            doctorType = getResources().getStringArray(R.array.doctor_type2);
            adapter = new MyAdapter(doctorName, doctorType, image2, Doctor_List_Activity.this);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                    String value= doctorName[position];
                    Toast.makeText(Doctor_List_Activity.this, ""+value, Toast.LENGTH_SHORT).show();

                    Intent intent= new Intent(Doctor_List_Activity.this,Profile_Activity.class);
                    intent.putExtra (value, image2);
                    startActivity (intent);

                    intent.putExtra ("Dr", value);
                    startActivity (intent);
                }
            });
        }
        else if(str.equals("Dr3")) {
            doctorName = getResources().getStringArray(R.array.Dr3);
            doctorType = getResources().getStringArray(R.array.doctor_type3);
            adapter = new MyAdapter(doctorName, doctorType, image3, Doctor_List_Activity.this);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                    String value= doctorName[position];
                    Toast.makeText(Doctor_List_Activity.this, ""+value, Toast.LENGTH_SHORT).show();

                    Intent intent= new Intent(Doctor_List_Activity.this,Profile_Activity.class);
                    intent.putExtra (value, image3);
                    startActivity (intent);

                    intent.putExtra ("Dr", value);
                    startActivity (intent);
                }
            });
        }
        else if(str.equals("Dr4")) {
            doctorName = getResources().getStringArray(R.array.Dr4);
            doctorType = getResources().getStringArray(R.array.doctor_type4);
            adapter = new MyAdapter(doctorName, doctorType, image4, Doctor_List_Activity.this);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                    String value= doctorName[position];
                    Toast.makeText(Doctor_List_Activity.this, ""+value, Toast.LENGTH_SHORT).show();

                    Intent intent= new Intent(Doctor_List_Activity.this,Profile_Activity.class);
                    intent.putExtra (value, image4);
                    startActivity (intent);

                    intent.putExtra ("Dr", value);
                    startActivity (intent);
                }
            });
        }
        else if(str.equals("Dr5")) {
            doctorName = getResources().getStringArray(R.array.Dr5);
            doctorType = getResources().getStringArray(R.array.doctor_type5);
            adapter = new MyAdapter(doctorName, doctorType, image5, Doctor_List_Activity.this);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                    String value= doctorName[position];
                    Toast.makeText(Doctor_List_Activity.this, ""+value, Toast.LENGTH_SHORT).show();

                    Intent intent= new Intent(Doctor_List_Activity.this,Profile_Activity.class);
                    intent.putExtra (value, image5);
                    startActivity (intent);

                    intent.putExtra ("Dr", value);
                    startActivity (intent);
                }
            });
        }
        else if(str.equals("Dr6")) {
            doctorName = getResources().getStringArray(R.array.Dr6);
            doctorType = getResources().getStringArray(R.array.doctor_type6);
            adapter = new MyAdapter(doctorName, doctorType, image6, Doctor_List_Activity.this);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                    String value= doctorName[position];
                    Toast.makeText(Doctor_List_Activity.this, ""+value, Toast.LENGTH_SHORT).show();

                    Intent intent= new Intent(Doctor_List_Activity.this,Profile_Activity.class);
                    intent.putExtra (value, image6);
                    startActivity (intent);

                    intent.putExtra ("Dr", value);
                    startActivity (intent);
                }
            });
        }
        else if(str.equals("Dr7")) {
            doctorName = getResources().getStringArray(R.array.Dr7);
            doctorType = getResources().getStringArray(R.array.doctor_type7);
            adapter = new MyAdapter(doctorName, doctorType, image7, Doctor_List_Activity.this);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                    String value= doctorName[position];
                    Toast.makeText(Doctor_List_Activity.this, ""+value, Toast.LENGTH_SHORT).show();

                    Intent intent= new Intent(Doctor_List_Activity.this,Profile_Activity.class);
                    intent.putExtra (value, image7);
                    startActivity (intent);

                    intent.putExtra ("Dr", value);
                    startActivity (intent);
                }
            });
        }
        else if(str.equals("Dr8")) {
            doctorName = getResources().getStringArray(R.array.Dr8);
            doctorType = getResources().getStringArray(R.array.doctor_type8);
            adapter = new MyAdapter(doctorName, doctorType, image8, Doctor_List_Activity.this);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                    String value= doctorName[position];
                    Toast.makeText(Doctor_List_Activity.this, ""+value, Toast.LENGTH_SHORT).show();

                    Intent intent= new Intent(Doctor_List_Activity.this,Profile_Activity.class);
                    intent.putExtra (value, image8);
                    startActivity (intent);

                    intent.putExtra ("Dr", value);
                    startActivity (intent);
                }
            });
        }
        else if(str.equals("Dr9")) {
            doctorName = getResources().getStringArray(R.array.Dr9);
            doctorType = getResources().getStringArray(R.array.doctor_type9);
            adapter = new MyAdapter(doctorName, doctorType, image9, Doctor_List_Activity.this);
            listView.setAdapter(adapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                    String value= doctorName[position];
                    Toast.makeText(Doctor_List_Activity.this, ""+value, Toast.LENGTH_SHORT).show();

                    Intent intent= new Intent(Doctor_List_Activity.this,Profile_Activity.class);
                    intent.putExtra (value, image9);
                    startActivity (intent);

                    intent.putExtra ("Dr", value);
                    startActivity (intent);
                }
            });
        }

        /*listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, final int position, long id) {
                AlertDialog.Builder builder= new AlertDialog.Builder(Doctor_List_Activity.this);
                builder.setTitle("Delete").setIcon(R.drawable.ic_delete).setMessage("Do you want to delete ?")
                        .setCancelable(true).setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                }).setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String value= doctorName[position];
                        Toast.makeText(Doctor_List_Activity.this, "Delete: "+value, Toast.LENGTH_SHORT).show();
                    }
                }).create().show();

                return true;
            }
        });*/

    }
}