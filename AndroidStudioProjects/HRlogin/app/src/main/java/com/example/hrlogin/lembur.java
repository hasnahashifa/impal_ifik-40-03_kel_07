package com.example.hrlogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class lembur extends AppCompatActivity {
    TextView jumlah;
    TextView kodeLembur;
    TextView tipeLembur;
    TextView niporNama;

    FirebaseDatabase db;
    DatabaseReference dbRef;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        db = FirebaseDatabase.getInstance();

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
        tipeLembur = findViewById(R.id.TipeL);
        niporNama =findViewById(R.id.nipnamapeg);
        dbRef= db.getReference().child("Lembur");
        Log.e("select err", "Login: "+dbRef.toString() );

        String jumlah1 = jumlah.getText().toString();
        String Kodelembur1 = kodeLembur.getText().toString();
        String tipeLembur1 = tipeLembur.getText().toString();
        String nipornama1 = niporNama.getText().toString();
        if(isnull(jumlah1,Kodelembur1,tipeLembur1,nipornama1)==true) {
            Intent intent = new Intent(lembur.this, mainMenuManager.class);
            startActivity(intent);
            String key = dbRef.push().getKey();
            dbRef.child(nipornama1);
            dbRef.child(nipornama1).child("kode").setValue(Kodelembur1);
            dbRef.child(nipornama1).child("jumlah").setValue(jumlah1);
            dbRef.child(nipornama1).child("tipe").setValue(tipeLembur1);
        }else{

        }
    }
    public static Boolean isnull (String jumlah, String Kodelembur, String tipelembur, String nipornama ){
        if((jumlah.equals("")||Kodelembur.equals(""))||(tipelembur.equals("")||nipornama.equals(""))){
            return false;
        }else {
            return true;
        }
    }
}
