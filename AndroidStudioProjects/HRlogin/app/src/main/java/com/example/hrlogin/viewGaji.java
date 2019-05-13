package com.example.hrlogin;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;



public class viewGaji extends AppCompatActivity {
    FirebaseDatabase db;
    DatabaseReference dbRef;
    public String data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        db = FirebaseDatabase.getInstance();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_gaji);




    }



    public void back(View view) {
        Intent intent =new Intent(viewGaji.this,mainmenuPegawai.class);
        startActivity(intent);
    }
    public void show(View view) {
        Intent intent1 = getIntent();
        final TextView Gaji= findViewById(R.id.gaji);
        final TextView denda= findViewById(R.id.denda);
        final TextView lembur= findViewById(R.id.lembur);




        dbRef=db.getReference().child("Gaji").child("1B23A");
        Log.e("bayarerr", "bayar: " + dbRef.getKey());

            dbRef.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    String data1 = dataSnapshot.child("jumlah").getValue().toString();
                    Gaji.setText(data1);


                }


                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

    }
}
