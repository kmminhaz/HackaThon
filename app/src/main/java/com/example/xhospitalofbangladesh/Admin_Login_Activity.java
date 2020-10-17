package com.example.xhospitalofbangladesh;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Admin_Login_Activity extends AppCompatActivity {
    private EditText username,password;
    private Button login;
    private FirebaseAuth firebaseAuth;
    private Animation scaleUp,scaleDown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin__login_);

        firebaseAuth = FirebaseAuth.getInstance();

        scaleUp = AnimationUtils.loadAnimation(this,R.anim.scal_up);
        scaleDown = AnimationUtils.loadAnimation(this,R.anim.scale_down);

        login = findViewById(R.id.LoginBtn);
        username = findViewById(R.id.UsernameEt);
        password = findViewById(R.id.PasswordEt);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        if(motionEvent.getAction()==MotionEvent.ACTION_DOWN)
                            login.startAnimation(scaleUp);
                        else if(motionEvent.getAction()==MotionEvent.ACTION_UP)
                            login.startAnimation(scaleDown);
                        return false;
                    }
                });
                validate(username.getText().toString(),password.getText().toString());
            }
        });
    }
    private void validate(String userName, String passWord) {

        firebaseAuth.signInWithEmailAndPassword(userName, passWord).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    startActivity(new Intent(Admin_Login_Activity.this, Department_Activity.class));
                    Toast.makeText(Admin_Login_Activity.this,"Login Successful",Toast.LENGTH_LONG);
                }else{
                    Toast.makeText(Admin_Login_Activity.this,"Login Failed",Toast.LENGTH_LONG);
                }
            }
        });
    }
}