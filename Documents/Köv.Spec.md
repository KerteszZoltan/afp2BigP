# Követelmény Specifikáció - Ádám&Fecó csapat
## 1. Bevezetés
A csapat feladata, egy olyan alkalmazás fejlesztése, ami egy iskola ügyintézőinek a munkáját könnyíti meg. Az alkalmazás feladati közé tartozik, az iskolába újonnan érkező diákok felvétele, a jelenleg az oktatási intézménybe beírakozott diákok listázása, amennyiben megváltozik egy diák személyes adata legyen lehetőség a programban is átírni az adott adatot továbbá, ha egy diák úgy dönt, hogy itt hagyja az iskolát a program legyen alkalmas arra, hogy ellehessen távolítani diákokat a kilistázásból. Az ügyfél jelenleg nem rendelkezik, semmilyen alkalmazással, ami esetleges módon megkönnyíthetné a munkáját. 

Jelenleg adatlapokon tartják nyílván a diákok adatait amiket mappákba rendezve tárolnak, mivel emberi munkáról van szó az adminisztrálásban is így a hibák gyakoriak, a papír alapú rendszer lassú, nem megbízható. Az implementációt Java Springel valósítjuk meg, a tanulók adatit phpmyadmin adatbázisban tároljuk.A csapat feladata, egy olyan alkalmazás fejlesztése, ami egy iskola ügyintézőinek a munkáját könnyíti meg. Az alkalmazás feladati közé tartozik, az iskolába újonnan érkező diákok felvétele, a jelenleg az oktatási intézménybe beírakozott diákok listázása, amennyiben megváltozik egy diák személyes adata legyen lehetőség a programban is átírni az adott adatot továbbá, ha egy diák úgy dönt, hogy itt hagyja az iskolát a program legyen alkalmas arra, hogy ellehessen távolítani diákokat a kilistázásból. 

Az ügyfél jelenleg nem rendelkezik, semmilyen alkalmazással, ami esetleges módon megkönnyíthetné a munkáját. Jelenleg adatlapokon tartják nyílván a diákok adatait amiket mappákba rendezve tárolnak, mivel emberi munkáról van szó az adminisztrálásban is így a hibák gyakoriak, a papír alapú rendszer lassú, nem megbízható. Az implementációt Java Springel valósítjuk meg, a tanulók adatit phpmyadmin adatbázisban tároljuk.
## 2. Jelenlegi helyzet
Jelenleg az iskolában az ügyintézők a tanulókat papír alapon, úgynevezett adatlapokon tárolják mappákba rendezve. A papír alapú tárolás és feldolgozás működik, de eléggé lassú, emberi hibából adódóan a félre értések esélye jelentős. A megírt adatlapok elveszhetnek, szennyeződhetnek, megsemmisülhetnek, az emberi írás mások számára olvashatatlan lehet. 
Az ügyintézőknek jelenleg nem áll rendelkezésükre más, munkájukat segítő eszköz, a készülő program ezért lenne nagyszerű a számukra, ahol elvégezhetik a szükséges adminisztrációkat. 
A megrendelő szereti a modern dolgokat, többek között ezért is gondolta úgy, hogy itt az ideje elkészíteni az alkalmazást.
## 3. Vágyálom rendszer
A megrendelő egy olyan alkalmazást szeretne, ami elősegíti az iskolában dolgozó ügyintézők feladatait, munkájukat jelentősen megkönnyíti. Továbbá célja az, a készülő szoftvernek, hogy ugyanazon adathoz egyidőben akár több ügyintéző is hozzáférhessen. A szoftver megrendelője a későbbiekben valószínűleg továb szeretné fejlesztettni a meglévő applikációt, jelenleg kísérleteznek vele, milyen mértékű pozitív visszajelzéseket kapnak, később ennek megfelelően a szoftvert valószínűleg bővíteni kell egyéb funkciókkal. Az oktatási intézménybe beiratkozott tanulúk adatainak listázása mellett, a megrendelő szeretné, ha gyorsan, egyszerűen lehetne új diákokat hozzáadni az iskolában nyilvántartottakhoz, abban az esetben, ha új diákot kell felvenni. Továbbá célja az alkalmazásnak, hogy a régi papír alapú személyes adatok frissítését modernizáljuk, tehát az alkalmazásnak képesnek kell lenni arra, hogy egy meglévő diák adatait megváltoztassuk, szükség esetén ellehesen távolítani a diákot az adatbázisból, amennyiben kiiratkozna az iskolából. Fontos számára, hogy egyértelműek legyenek a gombok, a mezők, mit, hova kell beírni, vagy éppen hova, melyik gombra kell kattintani, az egyszerű kezelhetőséget támogatja. Nem szeretne több munkanapot eltölteni azzal, hogy megtanulja használni a szoftvert. A szoftvernek készen kell állnia arra, hogy bővíthető legyen, egyéb funkciókkal.
## 4. Jelenlegi üzleti folyamatok
## 5. Igényelt üzleti folyamatok
Egy olyan rendszert szeretnénk, hogy elkészítsenek ahol a hallgatók adatait tudjuk nyilvántartani. Fontos számunkra, hogy platform független applikációnk legyen az adatok tárolására, hogy bárhonnan elérhető legyen internet kapcsolattal.

Amit a tanulókról nyilván szeretnénk tartani adatok és a hozzájuk tartozó elvárásaink:
- Neptunk kód: Ezzel tudjuk azonosítani az adott hallgatót.
- Név: A tanuló nevét tárolni kell.
- Szemeszter: Ez arról szól, hogy a tanuló hány félévet végzett el eddig.
- Szak: Itt tároljuk el, hogy a tanuló milyen szakon van jelenleg. 

Szeretnénk tárolni még ezeken kívül, hogy a tanuló rendelkezik-e nyelvvizsgával. Elgondolásunk szerint tároljuk azt is, hogy milyen fokozatú a nyelvvizsgája. 

Amit szeretnénk, hogy a Neptun kód 6 karakterből álljon a könnyebb megjegyezhetőség érdekében.

Mivel intézmenyünk szakjai változhatnak az egyszerűbb kezelés miatt, úgy gondoljuk, hogy jobb lenne, ha valamilyen formában el lenne tárolva és csak meg kellene keresni, mikor a tanulóhoz hozzárendeljük. 

## 6. Követelménylista

| Sorszám | Megnevezés | Követelményről bővebben | Kifejtés |
|---------|------------|-------------------------|----------|
| K001 | Tanulók listázása | 3. Fejezet | Az ügyintéző megtudja jeleníteni az összes tanuló adatait |
| K002 | Tanuló hozzáadása | 3. Fejezet<br> 5. Fejezet | Az ügyintéző képes legyen új tanulót felvenni a nyilvántartásba
| K003 | Tanuló frissítése | 3. Fejezet | Az ügyintéző képes módosítan egy már ott tanuló adatait |
| K004 | Tanuló törlése | 3. Fejezet | Az ügyintéző képes törölni a tanulót a nyilvántartásból|
| K005 | Tanuló nyelvvizsga | 5. Fejezet | Rendelkezik-e a tanuló nyelvvizsgával és, hogy milyen nyelvű és szintű az |
| K006 | Egyszerű admin felület | 3. Fejezet | A megrendelő nem informatikus, nem szeretné tanulni a szoftvert, a lehető legegyszerűbb admin felületet kéri, egyértelmű gombokkal, mezőkkel. 
