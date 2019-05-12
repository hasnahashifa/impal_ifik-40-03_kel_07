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
        String Nama = nama.getText().toString();
        String Kodegaji = kodegaji.getText().toString();
        String Keterangan = keterangan.getText().toString();
        if(isnull(Nama, Kodegaji, Keterangan )) {
            Intent intent = new Intent(inputGaji.this, mainMenuManager.class);
            startActivity(intent);
            String key = dbRef.push().getKey();
            dbRef.child(Kodegaji);
            dbRef.child(Kodegaji).child("namaornip").setValue(Nama);
            dbRef.child(Kodegaji).child("keterangan").setValue(Keterangan);
            dbRef.child(Kodegaji).child("status").setValue("tersedia");
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
