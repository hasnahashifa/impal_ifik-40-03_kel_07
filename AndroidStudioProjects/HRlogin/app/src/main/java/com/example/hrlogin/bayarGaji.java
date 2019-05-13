package com.example.hrlogin;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class bayarGaji extends AppCompatActivity {
    FirebaseDatabase db;
    DatabaseReference dbRef;
    public String tampung;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        db = FirebaseDatabase.getInstance();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bayar_gaji);
    }

    public void back(View view) {

        Intent intent = new Intent(bayarGaji.this,mainMenuManager.class);
        startActivity(intent);
    }

    public void delete(String Nip ) {
        DatabaseReference dbRef=db.getReference().child("Gaji").child(Nip);
        dbRef.removeValue();






    }

    public void search(View view) {
        final TextView norek= findViewById(R.id.noRek);
        TextView nip= findViewById(R.id.username);
        final String Nip= nip.getText().toString();

        dbRef = db.getReference().child("Gaji");
        Log.e("bayarerr", "bayar: "+dbRef.getKey() );
        dbRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if(dataSnapshot.child(Nip).child("no rek").getValue() != null){
                    String data = dataSnapshot.child(Nip).child("no rek").getValue().toString();
                    tampung=data;
                    norek.setText(tampung);
                    delete(Nip);


                }else{
                    Intent intent = new Intent(bayarGaji.this,bayarGaji.class);
                    startActivity(intent);

                }





            }



            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });


        }


    }


