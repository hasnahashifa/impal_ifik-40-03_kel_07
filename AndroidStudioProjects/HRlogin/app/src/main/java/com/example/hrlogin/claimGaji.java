package com.example.hrlogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class claimGaji extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_claim_gaji);
    }

    public void back(View view) {
        Intent intent = new Intent(claimGaji.this,mainmenuPegawai.class);
        startActivity(intent);
    }
}
