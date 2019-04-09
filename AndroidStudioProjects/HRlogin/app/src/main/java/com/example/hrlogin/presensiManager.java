package com.example.hrlogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class presensiManager extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_presensi_manager);
    }

    public void back(View view) {
        Intent intent = new Intent(presensiManager.this,mainMenuManager.class);
        startActivity(intent);
    }
}
