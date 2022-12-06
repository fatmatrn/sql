                    --ALIASES
				drop table if exists calisanlar
CREATE TABLE calisanlar 
(
calisan_id char(9),
calisan_isim varchar(50),
calisan_dogdugu_sehir varchar(50) );

--Eger iki sutunun verilerini birlestirmek istiyorsak concat sembolu || kullaniriz
INSERT INTO calisanlar VALUES(123456789, 'Ali Can', 'Istanbul'); 
INSERT INTO calisanlar VALUES(234567890, 'Veli Cem', 'Ankara'); 
INSERT INTO calisanlar VALUES(345678901, 'Mine Bulut', 'Izmir');

select * from calisanlar;
select calisan_id as id,calisan_isim  ||' '|| calisan_dogdugu_sehir as calisan_bilgisi from calisanlar;


--2.yol
select calisan_id as id, concat (calisan_isim,' ',calisan_dogdugu_sehir)  as calisan_bilgisi from calisanlar

--										IS NULL CONDITION
-- Arama yapilan field’da NULL degeri almis kayitlari getirir

CREATE TABLE insanlar
(
ssn char(9),
name varchar(50),  
adres varchar(50)
);
INSERT INTO insanlar VALUES(123456789, 'Ali Can', 'Istanbul');  
INSERT INTO insanlar VALUES(234567890, 'Veli Cem', 'Ankara');  
INSERT INTO insanlar VALUES(345678901, 'Mine Bulut', 'Izmir');  
INSERT INTO insanlar (ssn, adres) VALUES(456789012, 'Bursa'); 
INSERT INTO insanlar (ssn, adres) VALUES(567890123, 'Denizli');

select * from insanlar;

--Name sutunundna null olan degerleri listeleyelim
select name from insanlar where name is null

--Name sutunundna null olmayan degerleri listeleyelim
select name from insanlar where name is not null

--Insanlar tablosunda null degre almis verileri no name olarak degistiriniz
update insanlar
set name='no name' where name is null
 
         -- ORDER BY CLAUSE
 /*
Tablolardaki verileri sıralamak için ORDER BY komutu kullanırız
Büyükten küçüğe yada küçükten büyüğe sıralama yapabiliriz
Default olarak küçükten büyüğe sıralama yapar
Eğer BÜYÜKTEN KÜÇÜĞE sıralmak istersek ORDER BY komutundan sonra DESC komutunu kullanırız
*/

CREATE TABLE people
(
ssn char(9),
isim varchar(50),
soyisim varchar(50), adres
varchar(50)
);

INSERT INTO people VALUES(123456789, 'Ali','Can', 'Istanbul');
INSERT INTO people VALUES(234567890, 'Veli','Cem', 'Ankara'); 
INSERT INTO people VALUES(345678901, 'Mine','Bulut', 'Ankara'); 
INSERT INTO people VALUES(256789012, 'Mahmut','Bulut', 'Istanbul'); 
INSERT INTO people VALUES (344678901, 'Mine','Yasa', 'Ankara'); 
INSERT INTO people VALUES (345678901, 'Veli','Yilmaz', 'Istanbul');

select * from people 

--Insanlar tablosundaki datalari adres’e gore siralayin
select * from people order by adres;

select * from people order by soyisim;

--People tablosundaki ismi mine olanlari ssn sirali olarak listeleyin
select * from people where isim= 'Mine' order by ssn;


--NOT : Order By komutundan sonra field ismi yerine field numarasi da kullanilabilir
--Insanlar tablosundaki soyismi Bulut olanlari isim sirali olarak listeleyin

select * from people where soyisim='Bulut' order by 2;

--Insanlar tablosundaki tum kayitlari SSN numarasi buyukten kucuge olarak siralayin

select * from people order by ssn desc

--People tablosundaki tum kayitlari isimler Natural sirali , Soyisimler ters sirali olarak listeleyiniz

select * from people order by isim asc , soyisim desc;

-- İsim ve soyisim değerlerini soyisim kelime uzunluklarına göre sıralayınız
/*
Eğer sutun uzunluğuna göre sıralamak istersek LENGTH komutu kullanırız 
Ve yine uzunluğu büyükten küçüğe sıralamak istersek sonuna DESC komutunu ekleriz
*/

select isim,soyisim from people order by length(soyisim) desc;

--Tüm isim ve soyisim değerlerini aynı sutunda çağırarak her bir sütun değerini uzunluğuna göre sıralayınız
select isim||' '||soyisim as isim_soyisim from people order by length (isim||soyisim)

select isim||' '||soyisim as isim_soyisim from people order by length (isim) +length (soyisim)

select concat(isim,' ',soyisim) as isim_soyisim from people order by length (isim||soyisim)

--GROUP BY CLAUSE
/*
Group By komutu sonuçları bir veya daha fazla sütuna göre gruplamak için SELECT
komutuyla birlikte kullanılır.
*/
CREATE TABLE manav
(
isim varchar(50),
Urun_adi varchar(50),
Urun_miktar int
);
INSERT INTO manav VALUES( 'Ali', 'Elma', 5);
INSERT INTO manav VALUES( 'Ayse', 'Armut', 3);
INSERT INTO manav VALUES( 'Veli', 'Elma', 2);
INSERT INTO manav VALUES( 'Hasan', 'Uzum', 4);
INSERT INTO manav VALUES( 'Ali', 'Armut', 2);
INSERT INTO manav VALUES( 'Ayse', 'Elma', 3);
INSERT INTO manav VALUES( 'Veli', 'Uzum', 5);
INSERT INTO manav VALUES( 'Ali', 'Armut', 2);
INSERT INTO manav VALUES( 'Veli', 'Elma', 3);
INSERT INTO manav VALUES( 'Ayse', 'Uzum', 2);

select * from manav

--isme gore alinan toplam urunleri bulun ve bu urunleri buyukten kucuge listeleyiniz

select isim,sum(urun_miktar) as alinantopurun from manav group by isim order by alinantopurun desc ;


--2) Urun ismine gore urunu alan toplam kisi sayisi

select urun_adi,count(isim) from manav group by urun_adi;

select isim,count(urun_adi) from manav group by isim


