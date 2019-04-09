package com.example.hrlogin;

import android.content.Intent;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainActivityloginTest {
    String user="1";
    String pass="2";

    @Test
    public void login() {
        assertFalse(MainActivity.Notnull(user,pass));

    }

    @Test
    public void konfirmresr() {
        assertTrue(MainActivity.konfirm(pass,user));
    }
}