package com.example.hrlogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class inputGaji extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_gaji);
    }

    public void back(View view) {
        Intent intent = new Intent(inputGaji.this,mainMenuManager.class);
        startActivity(intent);
    }
}
