package net.smallacademy.authenticatorapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.FirebaseFirestore;

public class Donate extends AppCompatActivity {
    EditText Fullname,Phone,Age,Hosi,loc,cdtn,addinfo;
    Button publish;
    CheckBox male,female;
    Spinner bldgrp;
    FirebaseUser donor;
    ProgressBar progressBar;
    FirebaseFirestore fStore;
    FirebaseAuth fAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donate);

        fStore = FirebaseFirestore.getInstance();
        donor = fAuth.getCurrentUser();
        Fullname = findViewById(R.id.Fullname);
        Phone = findViewById(R.id.phone);
        Age = findViewById(R.id.age);
        publish = findViewById(R.id.Publish);
        male = findViewById(R.id.male);
        female = findViewById(R.id.female);
        bldgrp = findViewById(R.id.Spinner);
        Hosi = findViewById(R.id.Hosi);
        loc = findViewById(R.id.Lctn);
        cdtn = findViewById(R.id.Cond);
        addinfo = findViewById(R.id.Addinfo);
        progressBar = findViewById(R.id.progressBar);
        publish = findViewById(R.id.Publish);
        fAuth = FirebaseAuth.getInstance();




            }
        }
