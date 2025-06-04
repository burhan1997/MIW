-- 1. Geef van elk lid het lidnummer, de achternaam en de boetebedragen die voor hem of haar
-- geregistreerd zijn. Dus ook alle leden zonder boetes laten zien
SELECT L.lidnr, L.achternaam, B.bedrag 
FROM Lid AS L 
LEFT JOIN Boete AS B 
ON L.lidnr = B.lidnummer;


-- 2.Geef van elk lid het lidnummer, de achternaam en de boetebedragen die voor hem of haar
-- geregistreerd zijn. Alle leden komen in de lijst voor en bij leden waarvoor geen boete is
-- geregistreerd moet het getal 0 getoond worden. (Tip: zoek op wat de ifnull() functie doet.)
SELECT L.lidnr, L.achternaam, IFNULL(B.bedrag, 0) AS boetebedrag 
FROM Lid AS L 
LEFT JOIN Boete AS B 
ON L.lidnr = B.lidnummer;


-- 3.Geef een overzicht van alle leden. Toon het lidnummer, de achternaam, het geslacht en van
-- de aanvoerders ook het team (teamcode en teamnaam) waar ze aanvoerder van zijn
SELECT L.lidnr,L.achternaam, L.geslacht, T.aanvoerder, T.teamcode, T.teamnaam
FROM Lid AS L
LEFT JOIN Team AS T
ON L.lidnr = T.aanvoerder;


-- 4. Geef een lijst van de leden die spelen in team ‘REDGH1’ . Toon indien mogelijk informatie over
-- de bestuursfunctie die het lid heeft gehad (Let op: hiervoor heb je de tabel ‘Bestuurslid’ nodig,
-- die je in opdracht 8.1 gemaakt hebt). Toon het lidnummer, de achternaam, de functie en de
-- begindatum.
SELECT L.lidnr, L.achternaam, B.functie, B.begin_datum
FROM Lid AS L
LEFT JOIN Bestuurslid AS B
ON L.lidnr = B.lidnummer
WHERE L.speelt_in = 'REDGH1';


