# Funkcionális Specifikáció - Ádám&Fecó csapat

## 1. Bevezetés

## 2. A rendszer célja, és nem céljai

A rendszer alapvető célja egy olyan asztali alaklazmás, amely segítsgévével az ügyintézők képesek tanulók szerkesztésére a nyilvántartásba, képesek hozzáadni új tanulókat, a meglévő tanulók adatait frissíteni, szükség esetén törölni, valamint ki listázni egy-egy, vagy akár az összes tanuló adatát.
Az alkalmazás nem tartalmaz reklámokat. Nem célja az alkalmazásnak, hogy a tárolt adatokat továbbítsa bármilyen szervezet felé.
Továbbá nem szükséges, hogy bárki hozzáférhessen az adatokhoz, sőt tehát nem az interneten kell futnia az alkalmazásnak, csak az iskola helyi hálózatán.

## 3. Jelenlegi helyzet

Jelenleg az iskolában az ügyintézők a tanulókat papír alapon, úgynevezett adatlapokon tárolják mappákba rendezve. A papír alapú tárolás és feldolgozás működik, de eléggé lassú, emberi hibából adódóan a félre értések esélye jelentős. A megírt adatlapok elveszhetnek, szennyeződhetnek, megsemmisülhetnek, az emberi írás mások számára olvashatatlan lehet. 
Az ügyintézőknek jelenleg nem áll rendelkezésükre más, munkájukat segítő eszköz, a készülő program ezért lenne nagyszerű a számukra, ahol elvégezhetik a szükséges adminisztrációkat. 

A megrendelő szereti a modern dolgokat, többek között ezért is gondolta úgy, hogy itt az ideje elkészíteni az alkalmazást.
Az alkalmazás mellett szól, hogy mostanában mindenki nagy hangsúlyt fektet a környezetvédelemre, így alkalmazásunk használatával zöldebb lehet az iskola, hogy megfeleljen a társadalmi elvárásoknak. 

## 4. Vágyálom rendszer

A megrendelő egy olyan alkalmazást szeretne, ami elősegíti az iskolában dolgozó ügyintézők feladatait, munkájukat jelentősen megkönnyíti. Továbbá célja az, a készülő szoftvernek, hogy ugyanazon adathoz egyidőben akár több ügyintéző is hozzáférhessen. A szoftver megrendelője a későbbiekben valószínűleg továb szeretné fejlesztettni a meglévő applikációt, jelenleg kísérleteznek vele, milyen mértékű pozitív visszajelzéseket kapnak, később ennek megfelelően a szoftvert valószínűleg bővíteni kell egyéb funkciókkal. Az oktatási intézménybe beiratkozott tanulúk adatainak listázása mellett, a megrendelő szeretné, ha gyorsan, egyszerűen lehetne új diákokat hozzáadni az iskolában nyilvántartottakhoz, abban az esetben, ha új diákot kell felvenni. 

Továbbá célja az alkalmazásnak, hogy a régi papír alapú személyes adatok frissítését modernizáljuk, tehát az alkalmazásnak képesnek kell lenni arra, hogy egy meglévő diák adatait megváltoztassuk, szükség esetén ellehesen távolítani a diákot az adatbázisból, amennyiben kiiratkozna az iskolából. Fontos számára, hogy egyértelműek legyenek a gombok, a mezők, mit, hova kell beírni, vagy éppen hova, melyik gombra kell kattintani, az egyszerű kezelhetőséget támogatja. Nem szeretne több munkanapot eltölteni azzal, hogy megtanulja használni a szoftvert. A szoftvernek készen kell állnia arra, hogy bővíthető legyen, egyéb funkciókkal.

## 5. Jelenlegi üzleti folyamatok modellje

<hr>

![Jelenlegi1](/Documents/Kepek/current1.png)

<hr>

![Jelenlegi1](/Documents/Kepek/current2.png)

<hr>


## 6. Igényelt üzleti folyamatok modellje

## 7. Követelménylista

| Sorszám | Megnevezés | Követelményről bővebben | Kifejtés |
|---------|------------|-------------------------|----------|
| K001 | Tanulók listázása | 3. Fejezet | Az ügyintéző megtudja jeleníteni az összes tanuló adatait |
| K002 | Tanuló hozzáadása | 3. Fejezet<br> 5. Fejezet | Az ügyintéző képes legyen új tanulót felvenni a nyilvántartásba
| K003 | Tanuló frissítése | 3. Fejezet | Az ügyintéző képes módosítan egy már ott tanuló adatait |
| K004 | Tanuló törlése | 3. Fejezet | Az ügyintéző képes törölni a tanulót a nyilvántartásból|
| K005 | Tanuló nyelvvizsga | 5. Fejezet | Rendelkezik-e a tanuló nyelvvizsgával és, hogy milyen nyelvű és szintű az |
| K006 | Egyszerű admin felület | 3. Fejezet | A megrendelő nem informatikus, nem szeretné tanulni a szoftvert, a lehető legegyszerűbb admin felületet kéri, egyértelmű gombokkal, mezőkkel. 

## 8. Képernyőtervek

## 9. Használati esetek

## 10. Forgatókönyvek

## 11. Funkció-követelmény megfeleltetés 

## 12. Fogalomszótár

- PHPMyadmin: Egy olyan szolgáltatás ahol a MySql tábla szerkezetet és a benne lévő adatokat tudjuk megjeleníteni, létrehozni, teszt lekérdezéseket írni. Ahhoz, hogy a PHPMyadmin felületet eltudjuk érni szükségünk van az Apache webszerver szolgáltatásra, amin keresztül a kommunikáció folyik a kliens és a szerver között. 
- MySql: Egy adatbázis szerver program. Itt tároljuk el az adatbázist, amiben a táblák szerepelnek, azokban pedig az adatok. A MySql szerver fog kommunikálni a programunkkal, ami a webszerverhez kapcsolódik.
- Apache: Egy olyan szerver oldali szolgáltatás ami képes kommunikálni a programunkkal és a kliens böngészőjével. Ez a szolgaáltatás felel azért, hogy a MySql táblában szereplő adatok megjelenjenek.
- Java: A Java általános célú, objektumorientált programozási nyelv, amelyet a Sun Microsystems fejlesztett a ’90-es évek elejétől kezdve egészen 2009-ig, amikor a céget felvásárolta az Oracle. 2011-ben a Java 1.7-es verzióját az új tulajdonos gondozásában adták ki.  A Java alkalmazásokat jellemzően bájtkód formátumra alakítják, de közvetlenül natív (gépi) kód is készíthető Java forráskódból. A bájtkód futtatása a Java virtuális géppel történik, ami vagy interpretálja a bájtkódot, vagy natív gépi kódot készít belőle, és azt futtatja az adott operációs rendszeren. Létezik közvetlenül Java bájtkódot futtató hardver is, az úgynevezett Java processzor. 
- JavaSpring: A Spring egy nyílt forráskódú, inversion of controlt megvalósító Java alkalmazás keretrendszer. Az első változatát Rod Johnson készítette el és Apache 2.0 licenc alapon 2003. júniusában jelent meg. Ezt követően az első stabil, 1.0-s verziót 2004. márciusban adták ki. A Spring 1.2.6 keretrendszer Jolt produktivitási – és JAX innovációs díjat nyert. A Spring keretrendszer magját képező szolgáltatásokat főként Java alkalmazás fejlesztésére használják a programozók. Ugyanakkor a Java EE platformra is elérhetők a bővítményei, amelyek web-alkalmazás fejlesztését segítik elő. Nem rendelkezik külön specifikált fejlesztési modellel, hanem az Enterprise JavaBean (EJB) modell kiegészítése-, helyettesítője-, vagy alternatívájaként vált népszerűvé a Java fejlesztők között.

 