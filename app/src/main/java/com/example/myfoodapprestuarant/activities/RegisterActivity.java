package com.example.myfoodapprestuarant.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.myfoodapprestuarant.R;
import com.example.myfoodapprestuarant.databinding.ActivityRegisterBinding;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class RegisterActivity extends AppCompatActivity {
    ActivityRegisterBinding binding;
    FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_register);
    }


    public void register(View view) {

        String name = binding.etRegisterName.getText().toString();
        if (name.isEmpty()) {
            Toast.makeText(RegisterActivity.this, "Name required", Toast.LENGTH_SHORT).show();
            return;
        }
        String email = binding.etRegisterEmail.getText().toString();
        if (email.isEmpty()) {
            Toast.makeText(RegisterActivity.this, "email required", Toast.LENGTH_SHORT).show();
            return;
        }
        String password = binding.etRegisterPassword.getText().toString();
        if (password.isEmpty()) {
            Toast.makeText(RegisterActivity.this, "password required", Toast.LENGTH_SHORT).show();
            return;
        }
        firebaseAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
           if(task.isSuccessful()){
               Toast.makeText(RegisterActivity.this, "Account Created", Toast.LENGTH_SHORT).show();
               finish();
           }else {
               String errorMessage=task.getException().getLocalizedMessage();
               Toast.makeText(RegisterActivity.this, errorMessage, Toast.LENGTH_SHORT).show();
           }
            }
        });

    }

    public void Login(View view) {
        Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
        startActivity(intent);
        finish();

    }
}