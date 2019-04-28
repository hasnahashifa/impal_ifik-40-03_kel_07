package com.example.hrlogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class bayarGaji extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bayar_gaji);
    }

    public void back(View view) {
        Intent intent = new Intent(bayarGaji.this,mainMenuManager.class);
        startActivity(intent);
    }
}
