CREATE TABLE Pegawai2 (NIP Varchar2(10),nama Varchar2(30),divisi Varchar2(15), pass Varchar2(12), CONSTRAINT pegawai2_pk PRIMARY KEY (NIP) );
insert into Pegawai2 (NIP,NAMA,DIVISI,PASS) values ('13011078','satrio','IT developer','a0b9c8d');
insert into Pegawai2 (NIP,NAMA,DIVISI,PASS) values ('13011079','wibowo','IT developer','a0b9c8d7');
insert into Pegawai2 (NIP,NAMA,DIVISI,PASS) values ('13011068','candra','IT developer','a0b9c8d7e');
insert into Pegawai2 (NIP,NAMA,DIVISI,PASS) values ('13011077','riri R','IT developer','a0b9c8d7e6');
insert into Pegawai2 (NIP,NAMA,DIVISI,PASS) values ('13011058','haikal','IT developer','a0b9c8');

CREATE TABLE Gaji2 (id_gaji Varchar2(10),status Varchar2(30),tanggal Varchar2(15),jumlah numeric(12), CONSTRAINT gaji2_pk PRIMARY KEY (id_gaji) );

insert into Gaji2 (id_gaji,status,tanggal,jumlah) values ('Px22','belum terklaim','1 desember','15000000');
insert into Gaji2 (id_gaji,status,tanggal,jumlah) values ('Px33','belum terklaim','1 november','13000000');
insert into Gaji2 (id_gaji,status,tanggal,jumlah) values ('Px36','belum terklaim','1 september','15000000');