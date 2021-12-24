package com.example.myfoodapprestuarant.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.example.myfoodapprestuarant.R;
import com.example.myfoodapprestuarant.databinding.ActivityWelcomeBinding;

public class WelcomeActivity extends AppCompatActivity {
    ActivityWelcomeBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
   binding= DataBindingUtil. setContentView(this, R.layout.activity_welcome);

        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_welcome);
    }

    public void register(View view) {
        Intent intent=new Intent(WelcomeActivity.this, RegisterActivity.class);
        startActivity(intent);

    }

    public void singIn(View view) {
        Intent intent=new Intent(WelcomeActivity.this, LoginActivity.class);
        startActivity(intent);

    }
}