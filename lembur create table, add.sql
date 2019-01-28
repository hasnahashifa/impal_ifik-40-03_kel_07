CREATE TABLE Lembur (overtimecode Varchar2(10), duration Varchar2(10), paymentperday Varchar2(20), CONSTRAINT overtime_pk PRIMARY KEY (overtimecode) );

insert into Lembur (OVERTIMECODE,DURATION,PAYMENTPERDAY) values ('2019012001','3 days','IDR 500000');
insert into Lembur (OVERTIMECODE,DURATION,PAYMENTPERDAY) values ('2019012002','2 days','IDR 700000');
insert into Lembur (OVERTIMECODE,DURATION,PAYMENTPERDAY) values ('2019012101','1 day','IDR 1000000');
insert into Lembur (OVERTIMECODE,DURATION,PAYMENTPERDAY) values ('2019012201','5 days','IDR 100000');
insert into Lembur (OVERTIMECODE,DURATION,PAYMENTPERDAY) values ('2019012301','4 days','IDR 250000');
