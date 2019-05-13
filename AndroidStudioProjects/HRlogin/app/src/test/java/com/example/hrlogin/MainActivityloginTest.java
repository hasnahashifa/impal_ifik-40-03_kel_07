package com.example.hrlogin;

import android.content.Intent;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainActivityloginTest {
    String user="";
    String pass="";

    @Test
    public void login() {
        assertFalse(MainActivity.Notnull(user,pass));

    }


}