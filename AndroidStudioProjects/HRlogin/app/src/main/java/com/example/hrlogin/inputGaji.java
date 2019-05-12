package com.example.hrlogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


public class inputGaji extends AppCompatActivity {
    TextView nama;
    TextView kodegaji;
    TextView keterangan;


    FirebaseDatabase db;
    DatabaseReference dbRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        db = FirebaseDatabase.getInstance();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_gaji);
    }

    public void back(View view) {
        Intent intent = new Intent(inputGaji.this,mainMenuManager.class);
        startActivity(intent);
    }

    public void input(View view) {
        nama = findViewById(R.id.nipnamapeg);
        kodegaji =findViewById(R.id.kodeL);
        keterangan = findViewById(R.id.keterangan);
        dbRef= db.getReference().child("Gaji");

        Log.e("select err", "Login: "+dbRef.toString() );
        String Nama1 = nama.getText().toString();
        String Kodegaji1 = kodegaji.getText().toString();
        String Keterangan1 = keterangan.getText().toString();
        String jumlah;
        if(isnull(Nama1, Kodegaji1, Keterangan1 )) {
            if (Keterangan1.equals("gaji bulanan")){
                jumlah="3500000";
            }else if(Keterangan1.equals("THR")||Keterangan1.equals("thr")){
                jumlah="4500000";
            }else {
                jumlah="500000";
            }


            dbRef.child(Nama1);
            dbRef.child(Nama1).child(Kodegaji1);
            dbRef.child(Nama1).child(Kodegaji1).child("keterangan").setValue(Keterangan1);
            dbRef.child(Nama1).child(Kodegaji1).child("status").setValue("tersedia");
            dbRef.child(Nama1).child(Kodegaji1).child("jumlah").setValue(jumlah);
            Intent intent = new Intent(inputGaji.this, mainMenuManager.class);
            startActivity(intent);
        }else{

        }
    }
    public static Boolean isnull(String Nama, String Kodegaji, String Keterangan ){
        if((Nama.equals("")||Kodegaji.equals(""))||(Keterangan.equals(""))){
            return false;
        }else {
            return true;
        }
    }
}
