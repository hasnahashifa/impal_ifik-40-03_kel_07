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



public class denda extends AppCompatActivity {
    TextView jumlah;
    TextView kodedenda;
    TextView tipedenda;
    TextView niporNama;


    FirebaseDatabase db;
    DatabaseReference dbRef;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        db = FirebaseDatabase.getInstance();


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_denda);
    }

    public void back(View view) {
        Intent intent = new Intent(denda.this,mainMenuManager.class);
        startActivity(intent);
    }
    public void input(View view) {
        jumlah = findViewById(R.id.jumlahLembur);
        kodedenda =findViewById(R.id.kodeL);
        tipedenda = findViewById(R.id.keterangan);
        niporNama =findViewById(R.id.nipnamapeg);
        dbRef= db.getReference().child("Denda");

        Log.e("select err", "Login: "+dbRef.toString() );
        String jumlah1 = jumlah.getText().toString();
        String Kodedenda1 = kodedenda.getText().toString();
        String tipedenda1 = tipedenda.getText().toString();
        String nipornama1 = niporNama.getText().toString();
        if(isnull(jumlah1, Kodedenda1, tipedenda1, nipornama1)) {
            Intent intent = new Intent(denda.this, mainMenuManager.class);
            startActivity(intent);
            String key = dbRef.push().getKey();
            dbRef.child(nipornama1);
            dbRef.child(nipornama1).child("kode").setValue(Kodedenda1);
            dbRef.child(nipornama1).child("jumlah").setValue(jumlah1);
            dbRef.child(nipornama1).child("tipe").setValue(tipedenda1);
        }else{

        }
    }
    public static Boolean isnull(String jumlah, String Kodedenda, String tipedenda, String nipOrnama ){
        if((jumlah.equals("")||Kodedenda.equals(""))||(tipedenda.equals("")||nipOrnama.equals(""))){
            return false;
        }else {
            return true;
        }
    }
}
