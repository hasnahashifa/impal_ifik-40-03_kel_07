package com.example.hrlogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class claimGaji extends AppCompatActivity {
    FirebaseDatabase db;
    DatabaseReference dbRef;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        db = FirebaseDatabase.getInstance();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_claim_gaji);
    }

    public void back(View view) {
        Intent intent = new Intent(claimGaji.this,mainmenuPegawai.class);
        startActivity(intent);

    }
    public void claim(View view) {
        TextView rekening = findViewById(R.id.no_rek);
        String rek = rekening.getText().toString();
        Intent intent1 = getIntent();
        Bundle extras = intent1.getExtras();
        dbRef= db.getReference().child("Gaji");
        String data;
        if(extras != null) {
            data = extras.getString("User");
            dbRef.child(data).child("status").setValue("terclaim");
            dbRef.child(data).child("no rek").setValue(rek);
        }
        Intent intent = new Intent(claimGaji.this,mainmenuPegawai.class);
        startActivity(intent);

    }
}
