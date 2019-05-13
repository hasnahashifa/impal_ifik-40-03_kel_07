package com.example.hrlogin;

import android.support.annotation.NonNull;

import org.junit.Test;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import static org.junit.Assert.*;


public class inputGajiTest {
    DatabaseReference dbRef;
    FirebaseDatabase db;
    public String test;

    @Test
    public void back() {
    }

    @Test
    public void input() {
        String a="";
        String b="";
        String c="";

       



        assertFalse(inputGaji.isnull(a,b,c));

    }

    @Test
    public void isnull() {

    }
}