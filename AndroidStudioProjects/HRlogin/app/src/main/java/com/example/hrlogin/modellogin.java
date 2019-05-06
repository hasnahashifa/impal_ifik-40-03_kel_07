package com.example.hrlogin;

public class modellogin {
    public String divisi;
    public String jabatan;
    public String nama;
    public String pass;

    public modellogin(String jabatan, String pass,String divisi, String nama) {
        this.jabatan = jabatan;
        this.pass = pass;
        this.divisi=divisi;
        this.nama=nama;
    }
}
