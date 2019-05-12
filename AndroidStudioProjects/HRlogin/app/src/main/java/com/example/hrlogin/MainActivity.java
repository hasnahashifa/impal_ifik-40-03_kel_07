package com.example.hrlogin;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import java.text.SimpleDateFormat;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


public class MainActivity extends AppCompatActivity {
    TextView username1;

    TextView pass1;
    FirebaseDatabase db;
    DatabaseReference dbRef,dbRef1;
    public boolean DbUser;
    public boolean Dbpass;
    public boolean Dbjabatan;
    public String user;
    public String pass;
    public String tampung1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        db = FirebaseDatabase.getInstance();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public static Boolean Notnull(String username, String pass){
        Boolean bool;
        if(username.equals("")||pass.equals("")){
            bool=false;
            return bool;
        }else{
            bool=true;
            return bool;

        }
    }

    public void Login(View view) {
        username1 = findViewById(R.id.username);
        pass1 =findViewById(R.id.pass);
        user = username1.getText().toString();
        pass = pass1.getText().toString();
        dbRef = db.getReference().child("pegawai").child(user);
        String tampung2;
        Log.e("select err", "Login: "+dbRef.toString() );
        dbRef1=db.getReference().child("absen");
        if(Notnull(user,pass)) {


            dbRef.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                    if (dataSnapshot.getKey().equals(user) && dataSnapshot.getValue() != null) {
                        DbUser = true;
                        DataSnapshot dataSnapshot1 = dataSnapshot.child("pass");
                        Log.e("datasnap", "onDataChange: " + dataSnapshot1.toString());
                        String tampung1 = dataSnapshot1.getValue().toString();
                        if (pass.equals(tampung1)) {
                            Dbpass = true;
                            dataSnapshot1 = dataSnapshot.child("jabatan");
                            tampung1 = dataSnapshot1.getValue().toString();
                            if (("manager").equals(tampung1)) {
                                Dbjabatan = true;
                            }
                        }


                    }
                    Log.e("show err", "onDataChange: " + dataSnapshot.toString());
                    if (DbUser && Dbpass && Dbjabatan) {

                        Intent intent = new Intent(MainActivity.this, mainMenuManager.class);
                        intent.putExtra("User",user);
                        startActivity(intent);
                    } else if (DbUser && Dbpass) {

                        Intent intent = new Intent(MainActivity.this, mainmenuPegawai.class);
                        intent.putExtra("User",user);
                        startActivity(intent);
                    } else {
                        Intent intent = new Intent(MainActivity.this, MainActivity.class);
                        startActivity(intent);
                    }



                }

                @Override
                public void onCancelled(@NonNull DatabaseError databaseError) {

                }
            });
        }



        }

    }



