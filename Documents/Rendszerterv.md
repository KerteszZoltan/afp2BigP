# Rendszerterv - Ádám&Fecó csapat

## 1.  A rendszer célja
 
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
 
## 10. Teszt terv
 
## 11. Telepítési terv
 
## 12. Funkcionális terv
 
## 13. Fizikai környezet
 
## 14. Karbantartási terv