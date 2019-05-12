package com.example.hrlogin;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class presensiManager extends AppCompatActivity {
    FirebaseDatabase db;
    DatabaseReference dbRef;
    ListView absen ;
    List<String> absenlist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        absen =findViewById(R.id.listAbsen);
        db = FirebaseDatabase.getInstance();
        Intent intent1 = getIntent();
        Bundle extras = intent1.getExtras();
        absenlist = new ArrayList<>();
        String data;
        if(extras != null){
            data= extras.getString("User");
            dbRef= db.getReference().child("absen").child(data);
            dbRef.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    for (DataSnapshot absensnapshot:dataSnapshot.getChildren()){
                        String data = absensnapshot.getKey();
                        absenlist.add(data);

                    }
                    ListAdapter absensadapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,absenlist);
                    absen.setAdapter(absensadapter);




                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });

        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_presensi_manager);

    }

    public void back(View view) {
        Intent intent1 = getIntent();
        Bundle extras = intent1.getExtras();
        absenlist = new ArrayList<>();
        String data;
        if(extras != null){
            data= extras.getString("User");}
        Intent intent = new Intent(presensiManager.this,mainMenuManager.class);
        intent.putExtra("User",data);

        startActivity(intent);
    }



}
