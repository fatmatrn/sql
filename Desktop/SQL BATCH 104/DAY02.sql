CREATE TABLE ogrenciler5
(
ogrenci_no char(7),-- Uzunluğunu bildiğimiz stringler için CHAR kullanılır
isim varchar(20), -- Uzunluğunu bilmediğimiz stringler için VARCHAR kullanırız
soyisim varchar(25),
not_ort real,-- Ondalıklı sayılar için kullanılır(Double gibi)
kayit_tarih date);
-- VAROLAN BİR TABLODAN YENİ BİR TABLO OLUŞTURMA
CREATE TABLE NOTLAR
AS
SELECT isim,not_ort FROM ogrenciler5;
select * from notlar;
--INSERT- TABLO İÇİNE VERİ EKLEME
INSERT INTO notlar VALUES ('Osman',95.5);
INSERT INTO notlar VALUES ('Sumeyye',95.5);
INSERT INTO notlar VALUES ('Salih',95.5);
INSERT INTO notlar VALUES ('Hakan',95.5);
INSERT INTO notlar VALUES ('Adem',95.5);
select * from notlar;
select isim from notlar;
-- CONSTRAINT
--UNIQUE
--NOT NULL
CREATE TABLE ogrenciler7
(
ogrenci_no char(7) unique,
isim varchar(20) NOT NULL, 
soyisim varchar(25),
not_ort real,
kayit_tarih date
);
select * from ogrenciler7;
INSERT INTO ogrenciler7 VALUES ('1234567','Erol','Evren',75.5,now());
INSERT INTO ogrenciler7 VALUES ('1234568','Ali','Veli',75.5,now());
INSERT INTO ogrenciler7 (ogrenci_no,soyisim,not_ort) VALUES ('1234569','Evren',85.5);-- NOT NULL kısıtlaması olduğu için bu veri eklenemez
-- PRIMARY KEY ataması
CREATE TABLE ogrenciler8
(
ogrenci_no char(7) PRIMARY KEY,
isim varchar(20), 
soyisim varchar(25),
not_ort real,
kayit_tarih date
);
-- PRIMARY KEY ataması 2. yol
-- Eğer CONSTRAINT ismini kendimiz vermek istersek bu yolu kullanabiliriz
CREATE TABLE ogrenciler9
(
ogrenci_no char(7),
isim varchar(20), 
soyisim varchar(25),
not_ort real,
kayit_tarih date,
CONSTRAINT ogr PRIMARY KEY(ogrenci_no)    
);
CREATE TABLE ogrenciler10
(
ogrenci_no char(7),
isim varchar(20), 
soyisim varchar(25),
not_ort real,
kayit_tarih date,
PRIMARY KEY(ogrenci_no)    
);
-- FOREIGN KEY 
/*
“tedarikciler3” isimli bir tablo olusturun. Tabloda “tedarikci_id”, “tedarikci_ismi”,  
“iletisim_isim” field’lari olsun ve “tedarikci_id” yi Primary Key yapin.
“urunler” isminde baska bir tablo olusturun “tedarikci_id” ve “urun_id” field’lari olsun ve
“tedarikci_id” yi Foreign Key yapin.
*/

CREATE TABLE tedarikciler3
(
tedarikci_id char(5)PRIMARY KEY,
tedarikci_ismi varchar(20),
iletisim_isim varchar(20) 
);
CREATE TABLE URUNLER 
(
tedarikci_id char(5),
urun_id char(5),
FOREIGN KEY	(tedarikci_id) REFERENCES tedarikciler3(tadarikci_id)
);
CREATE TABLE URUNLER 
(
tedarikci_id char(5),
urun_id char(5),
CONSTRAINT urun_fk FOREIGN KEY (tedarikci_id) REFERENCES tedarikciler3(tedarikci_id)
);

/*
“calisanlar” isimli bir Tablo olusturun. Icinde “id”, “isim”, “maas”
, “ise_baslama” field’lari 
olsun. “id” yi Primary Key yapin, “isim” i Unique, “maas” i Not Null yapın.
“adresler” isminde baska bir tablo olusturun.Icinde “adres_id”
,“sokak”, “cadde” ve “sehir”fieldlari olsun. “adres_id” field‘i ile Foreign Key oluşturun.
*/

CREATE TABLE calisanlar
(
id char(5) PRIMARY KEY,
isim varchar(20) UNIQUE,
maas int NOT NULL,
ise_baslama date	
);

CREATE TABLE adresler
(
adres_id char(5),
sokak varchar(15),
cadde varchar(15),
sehir varchar(15),
FOREIGN adres_id  REFERENCES calisanlar(id)	
);

INSERT INTO calisanlar VALUES('10002', 'Mehmet Yılmaz' ,12000, '2018-04-14');                 
INSERT INTO calisanlar VALUES('10008', null, 5000, '2018-04-14');
INSERT INTO calisanlar VALUES('10010', 'Mehmet Yılmaz', 5000, '2018-04-14'); 
INSERT INTO calisanlar VALUES('10004', 'Veli Han', 5000, '2018-04-14');
INSERT INTO calisanlar VALUES('10005', 'Mustafa Ali', 5000, '2018-04-14');
INSERT INTO calisanlar VALUES('10006', 'Canan Yaş', NULL, '2019-04-12'); 
INSERT INTO calisanlar VALUES('10003', 'CAN', 5000, '2018-04-14');
INSERT INTO calisanlar VALUES('10007', 'CAN', 5000, '2018-04-14'); 
INSERT INTO calisanlar VALUES('10009', 'cem', '', '2018-04-14'); 
INSERT INTO calisanlar VALUES('', 'osman', 2000, '2018-04-14');
INSERT INTO calisanlar VALUES('', 'osman can', 2000, '2018-04-14');
INSERT INTO calisanlar VALUES( '10002', 'ayse Yılmaz' ,12000, '2018-04-14'); 
INSERT INTO calisanlar VALUES( null, 'filiz ' ,12000, '2018-04-14');

INSERT INTO adresler VALUES('10003','Mutlu Sok', '40.Cad.','IST');
INSERT INTO adresler VALUES('10003','Can Sok', '50.Cad.','Ankara');
INSERT INTO adresler VALUES('10002','Ağa Sok', '30.Cad.','Antep');
-- Parent tabloda olmayan id ile child a ekleme yapamayiz
INSERT INTO adresler VALUES('10012','Ağa Sok', '30.Cad.','Antep');
-- FK'ye null değeri atanabilir.
INSERT INTO adresler VALUES(NULL,'Ağa Sok', '30.Cad.','Antep');
INSERT INTO adresler VALUES(NULL,'Ağa Sok', '30.Cad.','Maraş');

SELECT * FROM CALISANLAR;
SELECT * FROM ADRESLER;


CREATE TABLE calisanlar1
(
id char(5) PRIMARY KEY,
isim varchar(20) UNIQUE,
maas int CHECK (maas>10000),
ise_baslama date	
);

INSERT INTO calisanlar1 VALUES( 1000, 'filiz ' ,19000, '2018-04-14');

--   DQL   --   WHERE KULLANIMI

SELECT * FROM CALISANLAR;
SELECT ISIM FROM CALISANLAR;

--Calisanlar tablosundan maasi 5000 den buyuk olanlari listeleyiniz

Select isim from calisanlar where maas>5000;

--Calisanlar tablosundan ismi veli han  olan tum verileri listeleyiniz

select * from calisanlar where isim = 'Veli Han';


--Calisanlar tablosundan maasi 5000  olanlari listeleyiniz

select * from calisanlar where maas = 5000;


--DML - DELETE KOMUTU

DELETE FROM 





























