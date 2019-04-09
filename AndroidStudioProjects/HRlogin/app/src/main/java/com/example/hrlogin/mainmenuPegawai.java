package com.example.hrlogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class mainmenuPegawai extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu_p);
    }

    public void logout(View view) {
        Intent intent = new Intent(mainmenuPegawai.this,MainActivity.class);
        startActivity(intent);
    }


    public void claimgaji(View view) {
        Intent intent = new Intent(mainmenuPegawai.this,claimGaji.class);
        startActivity(intent);
    }
    public void View(View view) {
        Intent intent = new Intent(mainmenuPegawai.this,viewPresensi.class);
        startActivity(intent);
    }
    public void ViewGaji(View view) {
        Intent intent = new Intent(mainmenuPegawai.this,viewGaji.class);
        startActivity(intent);
    }
}
