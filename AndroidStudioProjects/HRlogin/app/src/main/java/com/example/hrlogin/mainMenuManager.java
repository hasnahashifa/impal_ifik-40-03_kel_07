package com.example.hrlogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class mainMenuManager extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu_m);
    }
    public void logout(View view) {
        Intent intent = new Intent(mainMenuManager.this,MainActivity.class);
        startActivity(intent);
    }
    public void openbayar(View view) {
        Intent intent = new Intent(mainMenuManager.this,bayarGaji.class);
        startActivity(intent);
    }


    public void denda(View view) {
        Intent intent = new Intent(mainMenuManager.this,denda.class);
        startActivity(intent);
    }

    public void Lembur(View view) {
        Intent intent = new Intent(mainMenuManager.this,lembur.class);
        startActivity(intent);
    }
    public void View(View view) {
        Intent intent = new Intent(mainMenuManager.this,presensiManager.class);
        startActivity(intent);
    }

    public void inputGaji(View view) {
        Intent intent = new Intent(mainMenuManager.this,inputGaji.class);
        startActivity(intent);
    }
}
