package com.example.hrlogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    TextView username1;
    TextView pass1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public static Boolean Notnull(String username, String pass){
        Boolean bool;
        if(username.equals("")||pass.equals("")){
            bool=true;
            return bool;
        }else{
            bool=false;
            return bool;

        }
    }

    public void Login(View view) {
        username1 = findViewById(R.id.username);
        pass1 =findViewById(R.id.pass);

        String user = username1.getText().toString();
        String pass = pass1.getText().toString();
        if(Notnull(user,pass)==false){
            Intent intent1 = new Intent(MainActivity.this,mainmenuPegawai.class);
            Intent intent = new Intent(MainActivity.this,mainMenuManager.class);
            if(konfirm(pass,user)==true){
                startActivity(intent1);
            }else{
                startActivity(intent);
            }
        }
    }
    public static Boolean konfirm(String password, String username){

        if(password.equals("2")&& username.equals("1")){
            return true;
        }else {
           return false;

        }
    }
}
