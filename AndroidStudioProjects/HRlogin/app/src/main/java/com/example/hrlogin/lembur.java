package com.example.hrlogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class lembur extends AppCompatActivity {
    TextView jumlah;
    TextView kodeLembur;
    TextView tipeLembur;
    TextView niporNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lembur);
    }

    public void back(View view) {
        Intent intent = new Intent(lembur.this,mainMenuManager.class);
        startActivity(intent);
    }
    public void input(View view) {
        jumlah = findViewById(R.id.jumlahLembur);
        kodeLembur =findViewById(R.id.kodeLembur);
        tipeLembur = findViewById(R.id.kodeL);
        niporNama =findViewById(R.id.nipnamapeg);

        String jumlah1 = jumlah.getText().toString();
        String Kodelembur1 = kodeLembur.getText().toString();
        String tipeLembur1 = tipeLembur.getText().toString();
        String nipornama1 = niporNama.getText().toString();
        if(isnull(jumlah1,Kodelembur1,tipeLembur1,nipornama1)==true) {
            Intent intent = new Intent(lembur.this, mainMenuManager.class);
            startActivity(intent);
        }
    }
    public static Boolean isnull (String jumlah, String Kodelembur, String tipelembur, String nipOrnama ){
        if((jumlah.equals("")||Kodelembur.equals(""))||(tipelembur.equals("")||nipOrnama.equals(""))){
            return true;
        }else {
            return false;
        }
    }
}
