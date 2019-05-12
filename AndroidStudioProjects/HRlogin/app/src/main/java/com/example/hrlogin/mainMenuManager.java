package com.example.hrlogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class mainMenuManager extends AppCompatActivity {
    FirebaseDatabase db;
    DatabaseReference dbRef;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        db = FirebaseDatabase.getInstance();
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
        Intent intent1 = getIntent();
        Bundle extras = intent1.getExtras();
        String data;
        if(extras != null){
            data= extras.getString("User");
            dbRef= db.getReference().child("absen");
            Log.e("select err", "Login: "+dbRef.toString() );
            String date = "12 agustus 2019";
            dbRef.child(data).child(date).setValue("hadir");
            Intent intent = new Intent(mainMenuManager.this,mainMenuManager.class);
            intent.putExtra("User",data);
            startActivity(intent);
        }



    }

    public void inputGaji(View view) {
        Intent intent = new Intent(mainMenuManager.this,inputGaji.class);
        startActivity(intent);
    }
}
