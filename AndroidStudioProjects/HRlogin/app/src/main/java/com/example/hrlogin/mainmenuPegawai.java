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

public class mainmenuPegawai extends AppCompatActivity {
    FirebaseDatabase db;
    DatabaseReference dbRef;
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
        Intent intent1 = getIntent();
        Bundle extras = intent1.getExtras();
        String data;
        if(extras != null){
            data= extras.getString("User");
            dbRef= db.getReference().child("absen");
            Log.e("select err", "Login: "+dbRef.toString() );
            String date = "12 agustus 2019";
            dbRef.child(data).child(date).setValue("hadir");
        }

        Intent intent = new Intent(mainmenuPegawai.this,viewPresensi.class);
        startActivity(intent);
    }
    public void ViewGaji(View view) {
        Intent intent = new Intent(mainmenuPegawai.this,viewGaji.class);
        startActivity(intent);
    }
}
