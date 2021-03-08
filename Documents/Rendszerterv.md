# Rendszerterv - Ádám&Fecó csapat

## 1.  A rendszer célja
 
A rendszer alapvető célja egy olyan asztali alaklazmás, amely segítsgévével az ügyintézők képesek tanulók szerkesztésére a nyilvántartásba, képesek hozzáadni új tanulókat, a meglévő tanulók adatait frissíteni, szükség esetén törölni, valamint ki listázni egy-egy, vagy akár az összes tanuló adatát. Az alkalmazás nem tartalmaz reklámokat. Nem célja az alkalmazásnak, hogy a tárolt adatokat továbbítsa bármilyen szervezet felé. Továbbá nem szükséges, hogy bárki hozzáférhessen az adatokhoz, sőt tehát nem az interneten kell futnia az alkalmazásnak, csak az iskola helyi hálózatán.
Az alkalmazás feladati közé tartozik, az iskolába újonnan érkező diákok felvétele, a jelenleg az oktatási intézménybe beírakozott diákok listázása, amennyiben megváltozik egy diák személyes adata legyen lehetőség a programban is átírni az adott adatot továbbá, ha egy diák úgy dönt, hogy itt hagyja az iskolát a program legyen alkalmas arra, hogy ellehessen távolítani diákokat a kilistázásból. Az ügyfél jelenleg nem rendelkezik, semmilyen alkalmazással, ami esetleges módon megkönnyíthetné a munkáját.

Jelenleg adatlapokon tartják nyílván a diákok adatait amiket mappákba rendezve tárolnak, mivel emberi munkáról van szó az adminisztrálásban is így a hibák gyakoriak, a papír alapú rendszer lassú, nem megbízható. Az implementációt Java Springel valósítjuk meg, a tanulók adatit phpmyadmin adatbázisban tároljuk.A csapat feladata, egy olyan alkalmazás fejlesztése, ami egy iskola ügyintézőinek a munkáját könnyíti meg. Az alkalmazás feladati közé tartozik, az iskolába újonnan érkező diákok felvétele, a jelenleg az oktatási intézménybe beírakozott diákok listázása, amennyiben megváltozik egy diák személyes adata legyen lehetőség a programban is átírni az adott adatot továbbá, ha egy diák úgy dönt, hogy itt hagyja az iskolát a program legyen alkalmas arra, hogy ellehessen távolítani diákokat a kilistázásból.

Az ügyfél jelenleg nem rendelkezik, semmilyen alkalmazással, ami esetleges módon megkönnyíthetné a munkáját. Jelenleg adatlapokon tartják nyílván a diákok adatait amiket mappákba rendezve tárolnak, mivel emberi munkáról van szó az adminisztrálásban is így a hibák gyakoriak, a papír alapú rendszer lassú, nem megbízható. Az implementációt Java Springel valósítjuk meg, a tanulók adatit phpmyadmin adatbázisban tároljuk.


## 2.  Projektterv

A projekten dolgozók:


![projektResztvevok](Kepek/members.png)

A projekt menedzselését és felügyelését végző személyek:

![projektVezetok](Kepek/managers.png)

|  Dátum | Tevékenység  |
|-----------------------|--------------------------|
|    2021.02.02-03.09   | Dokumentációk elkészítése és véglegesítése | 
|         2021.03.09-         |Fejlesztés megkezdése|
|         2020.03.09-         |Unit tesztek| 
|                |Alpha teszt|
|                |Béta teszt|
|                  |Projekt átadása|

## 3. Jelenlegi üzleti folyamatok
 
## 4. Igényelt üzleti folyamatok
 
## 5. Követelménylista
 
## 6. Absztrakciós modell
 
## 7. Architekturális terv
 
## 8. Adatbázis terv

![AdatbazisModell](Kepek/Databse_connection.png)


students tábla

| Mező név | Tipus/hossz | Kötelező | Érték/validáció | Kulcs | Megj. |
|----------|-------------|----------|-----------------|-------|-------|
| neptun_code | VARCHAR(255) | Igen | Unique | PK| |
| Name | VARCHAR(255) | Igen | | |
| birth_date | date | Igen| | |
| PassedSemester | int(11) | Igen| | |
| Department | VARCHAR(255) | Igen| | |



students megszorítások

| Azonosító | Tábla 1 | Mező 1 | Tábla 2 | Mező 2 | Megj. |
|-----------|---------|--------|---------|--------|-------|
| students_PK | studentstable | neptun_code | | | |

languageknowladge tábla

| Mező név | Tipus/hossz | Kötelező | Érték/validáció | Kulcs | Megj. |
|----------|-------------|----------|-----------------|-------|-------|
| Id | INT(11) | Igen | Auto-increment | PK | |
| language | varchar(255) | Igen | |  | | 
| level | varchar(255) | Igen | |  | | 
| studentsTable | varchar(255) | Igen | | FK | | 
| idx | INT(11) | Igen | |  | | 



languageknowladge megszorítások

| Azonosító | Tábla 1 | Mező 1 | Tábla 2 | Mező 2 | Megj. |
|-----------|---------|--------|---------|--------|-------|
| languageknowladge_PK | languageknowladge | Id | | | |
| students_FK | languageknowladge | Id | studentstable | neptun_code | |

## 9. Implementációs terv

Az alkalmazás felületét és a mögötte rejlő logikát Java Spring-el, valamint mySql adatbázissal valósítjuk meg. Igyekszünk a felhasználó számára csak a működéshez feltétlenül szükséges mezőket, gombokat megjeleníteni, nem célunk, hogy kezelhetetlennek tűnjön az alkalmazás. Az általunk választott fejlesztőkörnyezet az InteliJ Idea Ultimate legújabb verziója. A csapat minden tagja egyetértett a fejlesztőkörnyezet választásában, a tesztek könnyen elvégezhetőek benne, legenerálhatóak.

## 10. Teszt terv
 
## 11. Telepítési terv
 
## 12. Funkcionális terv

Rendszerszereplők:


    Felhasználó


Rendszer használati esetek és lefutásaik:

    Felhasználó:
                - Tanulók listázása
                - Új tanuló hozzáadása
                - Tanuló törlése
                - Tanuló szerkesztése
                - Egy tanuló adatainak kilistázása

Menü hierarchiák:

    Főmenü:
            -Tanulók listázása
            -Új tanuló hozzáadása
            -Tanuló törlése
            -Tanuló szerkesztése


    Tanulók listázása szak szerint:
                                    -CS tanulók kilistázása
                                    -ITL tanulók kilistázása
                                    -BI tanulók kilistázása
                                    -TI tanulók kilistázása


## 13. Fizikai környezet
 
## 14. Karbantartási terv