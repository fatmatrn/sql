CREATE TABLE ogrenciler3
(
id int,
isim VARCHAR(50),
veli_isim VARCHAR(50),
yazili_notu int 
);

INSERT INTO ogrenciler3 VALUES(123, 'Ali Can', 'Hasan',75);
INSERT INTO ogrenciler3 VALUES(124, 'Merve Gul', 'Ayse',85);
INSERT INTO ogrenciler3 VALUES(125, 'Kemal Yasa', 'Hasan',85);
INSERT INTO ogrenciler3 VALUES(126, 'Nesibe Yilmaz', 'Ayse',95);
INSERT INTO ogrenciler3 VALUES(127, 'Mustafa Bak', 'Can',99);
INSERT INTO ogrenciler3 VALUES(127, 'Mustafa Bak', 'Ali', 99);

-- id'si 124 olan ogrenciyi siliniz.
-- ismi Kemal Yasa olan satırını siliniz
-- ismi Nesibe Yilmaz veya Mustafa Bak olan kayıtları silelim.

select * from ogrenciler3;
DELETE FROM OGRENCILER3 WHERE id=124;
DELETE FROM OGRENCILER3 WHERE ISIM='Kemal Yasa';
DELETE FROM ogrenciler3 WHERE isim='Nesibe Yilmaz' or isim='Mustafa Bak';
DELETE FROM ogrenciler3 WHERE VELI_ISIM = 'Hasan';

TRUNCATE TABLE ogrenciler3;

--ON DELETE CASCADE
Drop table adresler ;

CREATE TABLE talebeler
(
id CHAR(3) primary key, 
isim VARCHAR(50),
veli_isim VARCHAR(50),
yazili_notu int
);

CREATE TABLE notlar( 
talebe_id char(3),
ders_adi varchar(30),
yazili_notu int,
CONSTRAINT notlar_fk FOREIGN KEY (talebe_id) 
REFERENCES talebeler(id)
on delete cascade
);
INSERT INTO talebeler VALUES(123, 'Ali Can', 'Hasan',75);
INSERT INTO talebeler VALUES(124, 'Merve Gul', 'Ayse',85);
INSERT INTO talebeler VALUES(125, 'Kemal Yasa', 'Hasan',85);
INSERT INTO talebeler VALUES(126, 'Nesibe Yılmaz', 'Ayse',95);
INSERT INTO talebeler VALUES(127, 'Mustafa Bak', 'Can',99);


INSERT INTO notlar VALUES ('123','kimya',75);
INSERT INTO notlar VALUES ('124', 'fizik',65);
INSERT INTO notlar VALUES ('125', 'tarih',90);
INSERT INTO notlar VALUES ('126', 'Matematik',90);

select * from talebeler;
select * from notlar;
DELETE FROM notlar where talebe_id='123';
DELETE from talebeler where id='126';-- parent

CREATE TABLE talebeler2
(
id CHAR(3) primary key, 
isim VARCHAR(50),
veli_isim VARCHAR(50),
yazili_notu int
);

CREATE TABLE notlar2( 
talebe_id char(3),
ders_adi varchar(30),
yazili_notu int,
CONSTRAINT notlar2_fk FOREIGN KEY (talebe_id) 
REFERENCES talebeler2(id)
on delete cascade
);
INSERT INTO talebeler2 VALUES(123, 'Ali Can', 'Hasan',75);
INSERT INTO talebeler2 VALUES(125, 'Kemal Yasa', 'Hasan',85);
INSERT INTO talebeler2 VALUES(126, 'Nesibe Yılmaz', 'Ayse',95);
INSERT INTO talebeler2 VALUES(127, 'Mustafa Bak', 'Can',99);


INSERT INTO notlar2 VALUES ('123','kimya',75);
INSERT INTO notlar2 VALUES ('127', 'fizik',65);
INSERT INTO notlar2 VALUES ('125', 'tarih',90);
INSERT INTO notlar2 VALUES ('126', 'Matematik',90);


select * from talebeler2;
select * from notlar2;

DELETE from talebeler2 where id='126';

/*
    Her defasında önce child tablodaki verileri silmek yerine ON DELETE CASCADE silme özelliği ile
parent tablo dan da veri silebiliriz. Yanlız ON DELETE CASCADE komutu kullanımında parent tablodan sildiğimiz
data child tablo dan da silinir
*/

                         
DROP TABLE if exists musteriler						 
						 
CREATE TABLE musteriler 
(
urun_id int, 
musteri_isim varchar(50), 
urun_isim varchar(50)
);

INSERT INTO musteriler VALUES (10, 'Mark', 'Orange'); 
INSERT INTO musteriler VALUES (10, 'Mark', 'Orange'); 
INSERT INTO musteriler VALUES (20, 'John', 'Apple'); 
INSERT INTO musteriler VALUES (30, 'Amy', 'Palm'); 
INSERT INTO musteriler VALUES (20, 'Mark', 'Apple'); 
INSERT INTO musteriler VALUES (10, 'Adem', 'Orange'); 
INSERT INTO musteriler VALUES (40, 'John', 'Apricot'); 
INSERT INTO musteriler VALUES (20, 'Eddie', 'Apple');

select * from musteriler;

--musteriler tablosundan urun ismi orange apple veya apticot olan tum datalari listeleyiniz

select * from musteriler where urun_isim='Orange' or urun_isim='Apple' or urun_isim='Apricot';

--IN CONDITION

select * from musteriler where urun_isim in ('Orange','Apple','Apricot');

--NOT IN CONDITION

select * from musteriler where urun_isim not in ('Orange','Apple','Apricot');

--BETWEEN CONDITION

--MUSTERILER TABLOSUNDAN ID SI 20 VE 40 ARASINDA OLAN VERILERI LISTELEYINIZ

SELECT * FROM musteriler  where urun_id>=20 and urun_id<=40; 

SELECT * FROM musteriler  where urun_id BETWEEN 20 and 40;--20 ve 40 dahili verir

--) Urun_id 20 ile 40 arasinda olmayan urunlerin tum bilgilerini listeleyiniz

select * from musteriler where urun_id not between 20 and 40;

CREATE table personel
(
id char(4),
isim varchar(50),
maas int
);
insert into personel values('1001', 'Ali Can', 70000);
insert into personel values('1002', 'Veli Mert', 85000);
insert into personel values('1003', 'Ayşe Tan', 65000);
insert into personel values('1004', 'Derya Soylu', 95000);
insert into personel values('1005', 'Yavuz Bal', 80000);
insert into personel values('1006', 'Sena Beyaz', 100000);

/*
Practice 6
- id'si 1003 ile 1005 arasında olan personel bilgilerini listeleyiniz
- D ile Y arasındaki personel bilgilerini listeleyiniz
- D ile Y arasında olmayan personel bilgilerini listeleyiniz
- Maaşı 70000 ve ismi Sena olan personeli listeleyiniz
*/
select * from personel;
SELECT * FROM personel  where id BETWEEN '1003' and '1005';

SELECT * FROM personel  where isim BETWEEN 'D' and 'Y';

SELECT * FROM personel  where isim NOT BETWEEN 'D' and 'Y';

SELECT * FROM personel  where  isim='Sena ' and maas=70000;

DROP TABLE if exists calisanlar2 ;

CREATE TABLE calisanlar2 
(
id int, 
isim VARCHAR(50), 
sehir VARCHAR(50), 
maas int, 
isyeri VARCHAR(20)
);
DROP TABLE if exists markalar ;
CREATE TABLE markalar
(
marka_id int, 
marka_isim VARCHAR(20), 
calisan_sayisi int
);

INSERT INTO calisanlar2 VALUES(123456789, 'Ali Seker', 'Istanbul', 2500, 'Vakko');
INSERT INTO calisanlar2 VALUES(234567890, 'Ayse Gul', 'Istanbul', 1500, 'LCWaikiki');
INSERT INTO calisanlar2 VALUES(345678901, 'Veli Yilmaz', 'Ankara', 3000, 'Vakko');
INSERT INTO calisanlar2 VALUES(456789012, 'Veli Yilmaz', 'Izmir', 1000, 'Pierre Cardin');
INSERT INTO calisanlar2 VALUES(567890123, 'Veli Yilmaz', 'Ankara', 7000, 'Adidas');
INSERT INTO calisanlar2 VALUES(456789012, 'Ayse Gul', 'Ankara', 1500, 'Pierre Cardin');
INSERT INTO calisanlar2 VALUES(123456710, 'Fatma Yasa', 'Bursa', 2500, 'Vakko');
INSERT INTO calisanlar2 VALUES(123456710, 'Fatma Yasaa', 'Bursa', null, 'Vakko');

INSERT INTO markalar VALUES(100, 'Vakko', 12000);
INSERT INTO markalar VALUES(101, 'Pierre Cardin', 18000);
INSERT INTO markalar VALUES(102, 'Adidas', 10000);
INSERT INTO markalar VALUES(103, 'LCWaikiki', 21000);

select * from calisanlar2;
select * from markalar;

---- Çalisan sayisi 15.000’den cok olan markalarin isimlerini ve bu markada calisanlarin isimlerini ve 
maaşlarini listeleyin.
select isim,maas,isyeri from calisanlar2 
where isyeri in (select marka_isim from markalar
where calisan_sayisi>15000 );

---- marka_id’si 101’den büyük olan marka çalişanlarinin isim, maaş ve şehirlerini listeleyiniz.

select isim,maas,sehir from calisanlar2 where isyeri in (select marka_isim from markalar where marka_id>101);


-- Ankara’da calisani olan markalarin marka id'lerini ve calisan sayilarini listeleyiniz

select calisan_sayisi from markalar where marka_isim in (select isyeri from calisanlar2 where sehir='Ankara');

--calisanlar tablosundaki en yuksek maas

select max(maas)  from calisanlar2;

select max(maas) as maxmaas from calisanlar2; --bir sutuna gecici olarak as komutu ile isim verebiliriz

--calisanlar tablosundaki en dusuk maas

select min(maas)  from calisanlar2;
select max(maas)  as minmaas from calisanlar2;

--calisanlar tablosundaki maaslari toplami
select sum(maas)  from calisanlar2;

--calisanlar tablosundaki maaslari ortalamasi
select avg(maas)  from calisanlar2;

select round(avg(maas))  from calisanlar2;  --yuvarlama yapar

select count(maas)  from calisanlar2;  --maas sayisini verir
select count(*)  from calisanlar2;--satir sayisini verir/ null degerde olsa satiri sayar

--AGGREGATE METHODLARDA SUBQUERY
-- Her markanin id’sini, ismini ve toplam kaç şehirde bulunduğunu listeleyen bir SORGU yaziniz.
select marka_id,marka_isim,(select count(sehir) as sehirsayisi from calisanlar2 where marka_isim=isyeri ) from markalar;

-- Her markanin ismini, calisan sayisini ve o markaya ait calisanlarin toplam maaşini listeleyiniz
select marka_isim,calisan_sayisi,(select sum(maas) as topmaas from calisanlar2 where marka_isim=isyeri)    from markalar;

-- Her markanin ismini, calisan sayisini ve o markaya ait calisanlarin maksimum ve minumum maaşini listeleyen bir Sorgu yaziniz.

select marka_isim,calisan_sayisi,(select max(maas) as maxmaaas from calisanlar2 where marka_isim=isyeri),
(select min(maas) as minmaaas from calisanlar2 where marka_isim=isyeri)    from markalar;

SELECT marka_isim, calisan_sayisi, (SELECT max(maas) FROM calisanlar2 WHERE marka_isim = isyeri) as max_maas,
(SELECT min(maas) FROM calisanlar2 WHERE marka_isim = isyeri) as min_maas
FROM markalar;

-- VIEW Kullanımı
/*
Yaptığımız sorguları hafızaya alır ve tekrar bizden isten sorgulama yenine
view'e atadığımız ismi SELECT komutuyla çağırırız
*/
CREATE VIEW maxminmaas
AS
SELECT marka_isim,calisan_sayisi,
(SELECT max(maas) FROM calisanlar2 WHERE isyeri=marka_isim) as enyuksekmaas,
(SELECT min(maas) FROM calisanlar2 WHERE isyeri=marka_isim) as endusukmaas
From markalar;
SELECT * FROM maxminmaas;
SELECT * FROM summaas;
-- EXİSTS CONDITION
CREATE TABLE mart
(   
urun_id int,    
musteri_isim varchar(50), 
urun_isim varchar(50)
);
INSERT INTO mart VALUES (10, 'Mark', 'Honda');
INSERT INTO mart VALUES (20, 'John', 'Toyota');
INSERT INTO mart VALUES (30, 'Amy', 'Ford');
INSERT INTO mart VALUES (20, 'Mark', 'Toyota');
INSERT INTO mart VALUES (10, 'Adam', 'Honda');
INSERT INTO mart VALUES (40, 'John', 'Hyundai');
INSERT INTO mart VALUES (20, 'Eddie', 'Toyota');
CREATE TABLE nisan 
(   
urun_id int ,
musteri_isim varchar(50), 
urun_isim varchar(50)
);
INSERT INTO nisan VALUES (10, 'Hasan', 'Honda');
INSERT INTO nisan VALUES (10, 'Kemal', 'Honda');
INSERT INTO nisan VALUES (20, 'Ayse', 'Toyota');
INSERT INTO nisan VALUES (50, 'Yasar', 'Volvo');
INSERT INTO nisan VALUES (20, 'Mine', 'Toyota');
select * from mart
select * from nisan

/*
--MART VE NİSAN aylarında aynı URUN_ID ile satılan ürünlerin
  URUN_ID’lerini listeleyen ve aynı zamanda bu ürünleri MART ayında alan
  MUSTERI_ISIM 'lerini listeleyen bir sorgu yazınız. 
*/

SELECT urun_id,musteri_isim FROM mart WHERE exists (SELECT urun_id FROM nisan WHERE mart.urun_id=nisan.urun_id);

--Her iki ayda birden satılan ürünlerin URUN_ISIM'lerini ve bu ürünleri
--NİSAN ayında satın alan MUSTERI_ISIM'lerini listeleyen bir sorgu yazınız.

select urun_isim,musteri_isim from nisan where exists (SELECT urun_isim FROM mart WHERE mart.urun_isim=nisan.urun_isim)

--Her iki ayda ortak satilmayan ürünlerin URUN_ISIM'lerini ve bu ürünleri
--NİSAN ayında satın alan MUSTERI_ISIM'lerini listeleyen bir sorgu yazınız.

select urun_isim,musteri_isim from nisan where not exists (select urun_isim from nisan where mart.urun_isim=nisan.urun_isim)
    --UPDATE
CREATE TABLE tedarikciler -- parent
(
vergi_no int PRIMARY KEY,
firma_ismi VARCHAR(50),
irtibat_ismi VARCHAR(50)
);
CREATE TABLE urunler -- child
(
ted_vergino int, 
urun_id int, 
urun_isim VARCHAR(50), 
musteri_isim VARCHAR(50),
CONSTRAINT fk_urunler FOREIGN KEY(ted_vergino) 
REFERENCES tedarikciler(vergi_no)
on delete cascade
); 

INSERT INTO tedarikciler VALUES (101, 'IBM', 'Kim Yon');
INSERT INTO tedarikciler VALUES (102, 'Huawei', 'Çin Li');
INSERT INTO tedarikciler VALUES (103, 'Erikson', 'Maki Tammen');
INSERT INTO tedarikciler VALUES (104, 'Apple', 'Adam Eve');

INSERT INTO urunler VALUES(101, 1001,'Laptop', 'Ayşe Can');
INSERT INTO urunler VALUES(102, 1002,'Phone', 'Fatma Aka');
INSERT INTO urunler VALUES(102, 1003,'TV', 'Ramazan Öz');
INSERT INTO urunler VALUES(102, 1004,'Laptop', 'Veli Han');
INSERT INTO urunler VALUES(103, 1005,'Phone', 'Canan Ak');
INSERT INTO urunler VALUES(104, 1006,'TV', 'Ali Bak');
INSERT INTO urunler VALUES(104, 1007,'Phone', 'Aslan Yılmaz');

















