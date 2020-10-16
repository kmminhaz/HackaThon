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
    private int[] image={R.drawable.d1,R.drawable.d2, R.drawable.d3,R.drawable.d4,R.drawable.d5,R.drawable.logo,R.drawable.login1};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor__list_);
        listView = findViewById(R.id.listViewId);
        String str = getIntent().getStringExtra("Department");
        if(str.equals("Dr1")) {
            doctorName = getResources().getStringArray(R.array.Dr1);
            doctorType = getResources().getStringArray(R.array.doctor_type1);
            adapter = new MyAdapter(doctorName, doctorType, image, Doctor_List_Activity.this);
            listView.setAdapter(adapter);
        }
        else if(str.equals("Dr2")) {
            doctorName = getResources().getStringArray(R.array.Dr2);
            doctorType = getResources().getStringArray(R.array.doctor_type2);
            adapter = new MyAdapter(doctorName, doctorType, image, Doctor_List_Activity.this);
            listView.setAdapter(adapter);
        }
        else if(str.equals("Dr3")) {
            doctorName = getResources().getStringArray(R.array.Dr3);
            doctorType = getResources().getStringArray(R.array.doctor_type3);
            adapter = new MyAdapter(doctorName, doctorType, image, Doctor_List_Activity.this);
            listView.setAdapter(adapter);
        }
        else if(str.equals("Dr4")) {
            doctorName = getResources().getStringArray(R.array.Dr4);
            doctorType = getResources().getStringArray(R.array.doctor_type4);
            adapter = new MyAdapter(doctorName, doctorType, image, Doctor_List_Activity.this);
            listView.setAdapter(adapter);
        }
        else if(str.equals("Dr5")) {
            doctorName = getResources().getStringArray(R.array.Dr5);
            doctorType = getResources().getStringArray(R.array.doctor_type5);
            adapter = new MyAdapter(doctorName, doctorType, image, Doctor_List_Activity.this);
            listView.setAdapter(adapter);
        }
        else if(str.equals("Dr6")) {
            doctorName = getResources().getStringArray(R.array.Dr6);
            doctorType = getResources().getStringArray(R.array.doctor_type6);
            adapter = new MyAdapter(doctorName, doctorType, image, Doctor_List_Activity.this);
            listView.setAdapter(adapter);
        }
        else if(str.equals("Dr7")) {
            doctorName = getResources().getStringArray(R.array.Dr7);
            doctorType = getResources().getStringArray(R.array.doctor_type7);
            adapter = new MyAdapter(doctorName, doctorType, image, Doctor_List_Activity.this);
            listView.setAdapter(adapter);
        }
        else if(str.equals("Dr8")) {
            doctorName = getResources().getStringArray(R.array.Dr8);
            doctorType = getResources().getStringArray(R.array.doctor_type8);
            adapter = new MyAdapter(doctorName, doctorType, image, Doctor_List_Activity.this);
            listView.setAdapter(adapter);
        }
        else if(str.equals("Dr9")) {
            doctorName = getResources().getStringArray(R.array.Dr9);
            doctorType = getResources().getStringArray(R.array.doctor_type9);
            adapter = new MyAdapter(doctorName, doctorType, image, Doctor_List_Activity.this);
            listView.setAdapter(adapter);
        }

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                String value= doctorName[position];
                Toast.makeText(Doctor_List_Activity.this, ""+value, Toast.LENGTH_SHORT).show();

                Intent intent= new Intent(Doctor_List_Activity.this,Profile_Activity.class);
                intent.putExtra (value, image);
                startActivity (intent);

                intent.putExtra ("Dr", value);
                startActivity (intent);
            }
        });
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