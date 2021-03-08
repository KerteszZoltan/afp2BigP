# Funkcionális Specifikáció - Ádám&Fecó csapat

## 1. Bevezetés

A csapat feladata, egy olyan alkalmazás fejlesztése, ami egy iskola ügyintézőinek a munkáját könnyíti meg. Az alkalmazás feladati közé tartozik, az iskolába újonnan érkező diákok felvétele, a jelenleg az oktatási intézménybe beírakozott diákok listázása, amennyiben megváltozik egy diák személyes adata legyen lehetőség a programban is átírni az adott adatot továbbá, ha egy diák úgy dönt, hogy itt hagyja az iskolát a program legyen alkalmas arra, hogy ellehessen távolítani diákokat a kilistázásból. Az ügyfél jelenleg nem rendelkezik, semmilyen alkalmazással, ami esetleges módon megkönnyíthetné a munkáját.

Jelenleg adatlapokon tartják nyílván a diákok adatait amiket mappákba rendezve tárolnak, mivel emberi munkáról van szó az adminisztrálásban is így a hibák gyakoriak, a papír alapú rendszer lassú, nem megbízható. Az implementációt Java Springel valósítjuk meg, a tanulók adatit phpmyadmin adatbázisban tároljuk.A csapat feladata, egy olyan alkalmazás fejlesztése, ami egy iskola ügyintézőinek a munkáját könnyíti meg. Az alkalmazás feladati közé tartozik, az iskolába újonnan érkező diákok felvétele, a jelenleg az oktatási intézménybe beírakozott diákok listázása, amennyiben megváltozik egy diák személyes adata legyen lehetőség a programban is átírni az adott adatot továbbá, ha egy diák úgy dönt, hogy itt hagyja az iskolát a program legyen alkalmas arra, hogy ellehessen távolítani diákokat a kilistázásból.

Az ügyfél jelenleg nem rendelkezik, semmilyen alkalmazással, ami esetleges módon megkönnyíthetné a munkáját. Jelenleg adatlapokon tartják nyílván a diákok adatait amiket mappákba rendezve tárolnak, mivel emberi munkáról van szó az adminisztrálásban is így a hibák gyakoriak, a papír alapú rendszer lassú, nem megbízható. Az implementációt Java Springel valósítjuk meg, a tanulók adatit phpmyadmin adatbázisban tároljuk.


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

![Jelenlegi1](/Documents/Kepek/current1.png)

<hr>

![Jelenlegi1](/Documents/Kepek/current2.png)

A jelenleg az iskolában használt módszer szerint, az ügyintézőknek kézzel kell kitölteniük a tanulók adatlapjait, majd ezeket az adatlapokat mappákba szervezni és fizikai módon tárolni. Alapvetően két fajta esetet különböztetünk meg. Egyik amikor egy új diákot kell felvenni, az ő adatai alapján kitöltik az adatlapot, majd ezt azt adatlapot alapos átnézések és többszöri adategyeztetés után, lemásolják majd mappába rendezik és fizikai módon tárolják őket egy polcban. 

A másik eset, amikor egy már beirakozott tanulónak változik valamilyen adata, ebben az esetben az ügyintézőnek megkell keresni a mappa szerkezetből az adott tanuló mappáját, ebből kiszedni azt a lapot melyen a változtatni kívánt adat szerepel, nyomtatni egy új lapot, majd azt kitölteni az új adatnak megfelelően, végezetül már csak visszakell tenni a mappába az adatlapot, azt pedig a mappaszerkezetbe.

## 6. Igényelt üzleti folyamatok modellje

![Igényelt1](/Documents/Kepek/FunkSpecIgényeltÜzlFoly1.png)

<hr>

![Igényelt1](/Documents/Kepek/FunkSpecIgényeltÜzlFoly2.png)

Egy olyan rendszert szeretnénk, hogy elkészítsenek ahol a hallgatók adatait tudjuk nyilvántartani. Fontos számunkra, hogy platform független applikációnk legyen az adatok tárolására, hogy bárhonnan elérhető legyen internet kapcsolattal.

Amit a tanulókról nyilván szeretnénk tartani adatok és a hozzájuk tartozó elvárásaink:

•	Neptun kód: Ezzel tudjuk azonosítani az adott hallgatót.
•	Név: A tanuló nevét tárolni kell.
•	Szemeszter: Ez arról szól, hogy a tanuló hány félévet végzett el eddig.
•	Szak: Itt tároljuk el, hogy a tanuló milyen szakon van jelenleg.
Szeretnénk tárolni még ezeken kívül, hogy a tanuló rendelkezik-e nyelvvizsgával. Elgondolásunk szerint tároljuk azt is, hogy milyen fokozatú a nyelvvizsgája.

Amit szeretnénk, hogy a Neptun kód 6 karakterből álljon a könnyebb megjegyezhetőség érdekében.

Mivel intézmenyünk szakjai változhatnak az egyszerűbb kezelés miatt, úgy gondoljuk, hogy jobb lenne, ha valamilyen formában el lenne tárolva és csak meg kellene keresni, mikor a tanulóhoz hozzárendeljük.



## 7. Követelménylista

| Sorszám | Megnevezés | Követelményről bővebben | Kifejtés |
|---------|------------|-------------------------|----------|
| K001 | Tanulók listázása | 3. Fejezet | Az ügyintéző megtudja jeleníteni az összes tanuló adatait |
| K002 | Tanuló hozzáadása | 3. Fejezet<br> 5. Fejezet | Az ügyintéző képes legyen új tanulót felvenni a nyilvántartásba |
| K003 | Tanuló frissítése | 3. Fejezet | Az ügyintéző képes módosítan egy már ott tanuló adatait |
| K004 | Tanuló törlése | 3. Fejezet | Az ügyintéző képes törölni a tanulót a nyilvántartásból|
| K005 | Tanuló nyelvvizsga | 5. Fejezet | Rendelkezik-e a tanuló nyelvvizsgával és, hogy milyen nyelvű és szintű az |
| K006 | Egyszerű admin felület | 3. Fejezet | A megrendelő nem informatikus, nem szeretné tanulni a szoftvert, a lehető legegyszerűbb admin felületet kéri, egyértelmű gombokkal, mezőkkel. 

## 8. Képernyőtervek

![Képernyőterv1](/Documents/Kepek/FunkSpecKepernyoTerv1.png)

<hr>

![Képernyőterv1](/Documents/Kepek/FunkSpecKepernyoTerv2.png)

<hr>

![Képernyőterv1](/Documents/Kepek/FunkSpecKepernyoTerv3.png)

<hr>

![Képernyőterv1](/Documents/Kepek/FunkSpecKepernyoTerv4.png)

<hr>

![Képernyőterv1](/Documents/Kepek/FunkSpecKepernyoTerv5.png)

## 9. Használati esetek

A rendszerben alapvetően négy különböző esetet különböztetünk meg. Ezen esetek, mikor az ügyintéző:
- kilistázza a diákokat,
- új diákot vesz fel a rendszerbe,
- módosítja egy már meglévő diák adatait,
- töröl egy diákot az adatbázisból.    

![Hasznalati_list](/Documents/Kepek/usecase_list.png)

A fentebbi képen az látható, hogy az ügyintézőnek milyen műveletet kell elvégeznie, hogy kilistázza a rendszerben szereplő diákokat. 


![Hasznalati_add](/Documents/Kepek/usecase_add.png)

A fentebbi képen az látható, hogy az ügyintézőnek milyen műveletet kell elvégeznie, hogy új diákot tudjon felvenni a rendszerbe.

![Hasznalati_edit](/Documents/Kepek/usecase_edit.png)

A fentebbi képen az látható, hogy az ügyintézőnek milyen műveletet kell elvégeznie, hogy módosítsa a már létező diák adatait. 

![Hasznalati_delete](/Documents/Kepek/usecase_delete.png)

A fentebbi képen az látható, hogy az ügyintézőnek milyen műveletet kell elvégeznie, hogy törölje a diákot a rendszerből.

## 10. Forgatókönyvek

Az ügyintéző egy új diákot szeretne felvinni a nyilvántartásba, ehez nem kell mást tennie, csak elindítani az általunk készített programot, majd a megfelelő gombra kattintva, már viheti is fel az új tanuló adatait.

Az ügyintéző egy már a nyilvántartásban szereplő diákot szeretne eltávolítani, ehez nem kell mást tennie, csupán megnéznie a törleni kívánt diák egyedi azonosítóját (Neptun kód), majd ezt kimásolva, a megfelelő gombra kattintva, egy új felület jelenik meg előtte, ahová bemásolja, ezt a kódot, és a tanuló törlésre kerül a nyilvántartásból.

Az ügyintéző egy, már a nyilvántartásban szereplő diák adatait szeretné módosítani, ehez nem kell mást tenni, csupán megnéznie a módosítani kívánt diák egyedi azonosítóját (Neptun kód), majd ezt kimásolva, a megfelelő gombra kattintva, egy új felület jelenik meg előtte, ahová beírhatja az új adatait.

Az ügyintéző listázni szeretné a tanulókat, ehez nem kell mást tennie, csak elkell indítania a programot, ilyenkor ugyanis a nyilvántartásban található diákok automatikusan kilistázódnak, amennyiben egy specifikus diák adataira vagyunk kiváncsiak, nincs más teendőnk mint a megfelelő mezőbe belekattintva, megadni a keresendő diák egyedi azonosítóját (Neptun kód).

## 11. Funkció-követelmény megfeleltetés 

| Funkció | Követelmény |
|---------|-------------|
| A program elindításakor az adatbázisban található diákok kilistázódnak. | Az ügyintéző megtudja jeleníteni az összes tanuló adatait |
| A megfelelő gombra kattintva az ügyintézőnek lehetősége van új tanulót felvinni az adatbázisba | Az ügyintéző legyen képes új tanulót felvenni a nyilvántartásba |
| A megfelelő gombra kattintva az ügyintéző képes egy, már az adatbázisban lévő diák adatait módosítani | Az ügyintéző képes módosítani egy már ott tanuló adatait |
|  |  |
|  |  |
|  |  |

## 12. Fogalomszótár

- PHPMyadmin: Egy olyan szolgáltatás ahol a MySql tábla szerkezetet és a benne lévő adatokat tudjuk megjeleníteni, létrehozni, teszt lekérdezéseket írni. Ahhoz, hogy a PHPMyadmin felületet eltudjuk érni szükségünk van az Apache webszerver szolgáltatásra, amin keresztül a kommunikáció folyik a kliens és a szerver között. 
- MySql: Egy adatbázis szerver program. Itt tároljuk el az adatbázist, amiben a táblák szerepelnek, azokban pedig az adatok. A MySql szerver fog kommunikálni a programunkkal, ami a webszerverhez kapcsolódik.
- Apache: Egy olyan szerver oldali szolgáltatás ami képes kommunikálni a programunkkal és a kliens böngészőjével. Ez a szolgaáltatás felel azért, hogy a MySql táblában szereplő adatok megjelenjenek.
- Java: A Java általános célú, objektumorientált programozási nyelv, amelyet a Sun Microsystems fejlesztett a ’90-es évek elejétől kezdve egészen 2009-ig, amikor a céget felvásárolta az Oracle. 2011-ben a Java 1.7-es verzióját az új tulajdonos gondozásában adták ki.  A Java alkalmazásokat jellemzően bájtkód formátumra alakítják, de közvetlenül natív (gépi) kód is készíthető Java forráskódból. A bájtkód futtatása a Java virtuális géppel történik, ami vagy interpretálja a bájtkódot, vagy natív gépi kódot készít belőle, és azt futtatja az adott operációs rendszeren. Létezik közvetlenül Java bájtkódot futtató hardver is, az úgynevezett Java processzor. 
- JavaSpring: A Spring egy nyílt forráskódú, inversion of controlt megvalósító Java alkalmazás keretrendszer. Az első változatát Rod Johnson készítette el és Apache 2.0 licenc alapon 2003. júniusában jelent meg. Ezt követően az első stabil, 1.0-s verziót 2004. márciusban adták ki. A Spring 1.2.6 keretrendszer Jolt produktivitási – és JAX innovációs díjat nyert. A Spring keretrendszer magját képező szolgáltatásokat főként Java alkalmazás fejlesztésére használják a programozók. Ugyanakkor a Java EE platformra is elérhetők a bővítményei, amelyek web-alkalmazás fejlesztését segítik elő. Nem rendelkezik külön specifikált fejlesztési modellel, hanem az Enterprise JavaBean (EJB) modell kiegészítése-, helyettesítője-, vagy alternatívájaként vált népszerűvé a Java fejlesztők között.

 