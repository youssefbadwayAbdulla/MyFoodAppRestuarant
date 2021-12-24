package com.example.myfoodapprestuarant.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.myfoodapprestuarant.MainActivity;
import com.example.myfoodapprestuarant.R;
import com.example.myfoodapprestuarant.databinding.ActivityLoginBinding;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LoginActivity extends AppCompatActivity {
ActivityLoginBinding binding;
FirebaseAuth firebaseAuth=FirebaseAuth.getInstance();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_login);
    }

    public void registerToLogin(View view) {
        Intent intent=new Intent(LoginActivity.this, RegisterActivity.class);
        startActivity(intent);
        finish();

    }

    public void MainActivity(View view) {

        String email = binding.etRegisterEmail.getText().toString();
        if (email.isEmpty()) {
            Toast.makeText(LoginActivity.this, "email required", Toast.LENGTH_SHORT).show();
            return;
        }
        String password = binding.etRegisterPassword.getText().toString();
        if (password.isEmpty()) {
            Toast.makeText(LoginActivity.this, "password required", Toast.LENGTH_SHORT).show();
            return;
        }

        firebaseAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
           if(task.isSuccessful()){
               Toast.makeText(LoginActivity.this, "Login Success", Toast.LENGTH_SHORT).show();
               Intent intent=new Intent(LoginActivity.this, MainActivity.class);
               startActivity(intent);
               finish();

           } else{
               String errorMessage=task.getException().getLocalizedMessage();
               Toast.makeText(LoginActivity.this, errorMessage, Toast.LENGTH_SHORT).show();

           }
            }
        });
    }
}