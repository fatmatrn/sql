--CONSTRAINT

CREATE TABLE tedarikciler3
(
tedarikci_id char(10),
tedarikci_ismi varchar(50), 
iletisim_isim varchar(50),
CONSTRAINT pk_adi PRIMARY KEY (tedarikci_id)
	);
	
	
CREATE TABLE urunler 
(
tedarikci_id char(10), 
product_id char(10),
CONSTRAINT 	FK_ADI FOREIGN KEY (tedarikci_id) REFERENCES tedarikciler3(tedarikci_id));
drop table student
create table student
(
std_id smallint primary key,
stt_name varchar(50) unique,
std_age smallint  not null,
std_dob date
constraint stdyas check(std_age  between 0 and 30)	 
)
insert into student values (101,'Ali Can', 10 ,'10-Aug-2006');
insert into student(std_id,std_age) values (102,20)
insert into student values (103,'Ali Cancan', 15 ,'10-Aug-2007');
insert into student values (104,'Ali Canko', 20 ,'10-Aug-2009');
insert into student values (105,'Ali Canciger', 21 ,'10-Aug-20010');
 select * from student
 
 update student set std_age=15 where stt_name= 'Ali Can'
 update student set std_dob='22-12-2022' where std_id=102
 
 update student set std_age=( select max(std_age) from student ) 
 
 update student set std_dob=(select min(std_dob) from student)
 
 create table workers(
 worker_id smallint,
 worker_neme varchar(50),
 worker_salary smallint,
 constraint worker_id_pk primary key (worker_id) 
 )
 
 insert into workers values (101,'Ali Can',12000);
 insert into workers values (102,'Aliye Can',2000);
 insert into workers values (103,'Alinur Can',7000);
 insert into workers values (104,'Alihan Can',11000);
 
 update workers set worker_salary=(select max(worker_salary)*80/100 from workers) where worker_id=102
 
 update workers set worker_salary=(select worker_salary from workers)*130/100  where worker_id=101
 
 update workers set worker_salary= worker_salary+1000 where worker_salary< (select avg(worker_salary) from workers)
 
 update workers set worker_salary= (select avg(worker_salary) from workers) where worker_salary< (select avg(worker_salary) from workers)
 
 
delete from workers where worker_neme='Ali Can'

------------------------------------------------------------------------------------
CREATE TABLE calisanlar2 
(
id int, 
isim VARCHAR(50), 
sehir VARCHAR(50), 
maas int, 
isyeri VARCHAR(20)
);

INSERT INTO calisanlar2 VALUES(123456789, 'Ali Seker', 'Istanbul', 2500, 'Vakko');
INSERT INTO calisanlar2 VALUES(234567890, 'Ayse Gul', 'Istanbul', 1500, 'LCWaikiki');
INSERT INTO calisanlar2 VALUES(345678901, 'Veli Yilmaz', 'Ankara', 3000, 'Vakko');
INSERT INTO calisanlar2 VALUES(456789012, 'Veli Yilmaz', 'Izmir', 1000, 'Pierre Cardin');
INSERT INTO calisanlar2 VALUES(567890123, 'Veli Yilmaz', 'Ankara', 7000, 'Adidas');
INSERT INTO calisanlar2 VALUES(456789012, 'Ayse Gul', 'Ankara', 1500, 'Pierre Cardin');
INSERT INTO calisanlar2 VALUES(123456710, 'Fatma Yasa', 'Bursa', 2500, 'Vakko');
 
---------------------------------------------------------------------------------------------------
 CREATE TABLE markalar
(
marka_id int, 
marka_isim VARCHAR(20), 
calisan_sayisi int
);
INSERT INTO markalar VALUES(100, 'Vakko', 12000);
INSERT INTO markalar VALUES(101, 'Pierre Cardin', 18000);
INSERT INTO markalar VALUES(102, 'Adidas', 10000);
INSERT INTO markalar VALUES(103, 'LCWaikiki', 21000);
------------------------------------------------------------------------------------------------
 
 
 select * from markalar where  calisan_sayisi=(select min(calisan_sayisi) from markalar)
 
 select * from markalar where calisan_sayisi in ((select max(calisan_sayisi) from markalar),(select min(calisan_sayisi) from markalar))
 
 
 
 select calisan_sayisi from markalar where calisan_sayisi=(select max(calisan_sayisi) from markalar)
 
 select * from markalar where 
 select * from markalar order by calisan_sayisi desc offset 1 row fetch next 1 row only;
 
 select * from markalar order by calisan_sayisi offset 1 row fetch next 1 row only;
 
  select * from markalar   order by calisan_sayisi desc  offset 2 row fetch next 1 row only

 
 select * from markalar where calisan_sayisi = (select max(calisan_sayisi) from markalar where calisan_sayisi < (select max(calisan_sayisi) from markalar 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
