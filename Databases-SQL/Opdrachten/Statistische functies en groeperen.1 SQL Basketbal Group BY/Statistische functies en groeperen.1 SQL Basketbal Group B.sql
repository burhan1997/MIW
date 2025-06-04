SET sql_mode=ONLY_FULL_GROUP_BY;

-- 1. Geef per jaar van toetreding het aantal leden dat in dat jaar is toegetreden
SELECT jaartoe, count(*)
FROM lid
GROUP BY jaartoe;


-- 2. Geef het aantal mannelijke en het aantal vrouwelijk leden.
SELECT geslacht, count(*)
FROM lid
GROUP BY geslacht;


-- 3. Geef voor elk lid voor wie minstens 1 boete is geregistreerd, het lidnummer, de
-- gemiddelde boete (2 decimalen) en het aantal boetes
SELECT 
  L.lidnr AS LidNummer,
  ROUND(AVG(B.bedrag), 2) AS GemiddeldeBoete,
  COUNT(*) AS aantal_boetes 
FROM 
  Lid AS L
JOIN 
  Boete AS B ON L.lidnr = B.lidnummer
GROUP BY 
  L.lidnr
HAVING 
  COUNT(B.betalingnummer) >= 1;
  
  
-- 4. Geef van elk lid het lidnummer, de achternaam en het totaal aan boetebedragen die voor
-- hem of haar geregistreerd zijn. Alle leden komen precies één keer in de lijst voor en bij
-- leden waarvoor geen boete is geregistreerd moet het getal 0 getoond worden. (Tip: zoek
-- op wat de ifnull() functie doet.)
SELECT 
  L.lidnr, 
  L.achternaam, 
  SUM(IFNULL(B.bedrag, 0)) AS totaalBoete
FROM Lid AS L
LEFT JOIN Boete AS B
  ON L.lidnr = B.lidnummer
GROUP BY L.lidnr, L.achternaam;


-- 5. Geef het lidnummer van elke speler voor wie in totaal meer dan €15.- aan boetesis geregistreerd
SELECT L.lidnr,SUM(B.bedrag) AS totaal_boetes 
FROM Lid AS L
JOIN Boete AS B
  ON L.lidnr = B.lidnummer
GROUP BY L.lidnr
HAVING SUM(B.bedrag) > 15;


-- 6. Geef de voorletters, tussenvoegsel en achternaam en het aantal boetes van elk lid voor
-- wie meer dan één boete is geregistreerd
SELECT L.voorletters, L.tussenvoegsel, L.achternaam, COUNT(*) AS aantal_boetes
FROM Lid AS L
JOIN Boete AS B
ON L.lidnr = B.lidnummer
GROUP BY L.lidnr, L.voorletters, L.tussenvoegsel, L.achternaam
HAVING COUNT(*) > 1;


-- 7. Geef van de leden met boetes de hoogste en de laagste boete die geregistreerd is
SELECT L.lidnr, MAX(B.bedrag), MIN(B.bedrag)
FROM Lid AS L
JOIN Boete AS B
ON L.lidnr = B.lidnummer
GROUP BY L.lidnr;


-- 8. Geef van elk team de teamcode en het totaal aantal thuis gewonnen wedstrijden
SELECT T.teamcode, COUNT(*) AS AantalGewonnen
FROM Team AS T
JOIN Wedstrijd AS W
  ON T.teamcode = W.teamthuis
WHERE W.scorethuis > W.scoreuit
GROUP BY T.teamcode;

--
SELECT teamthuis, count(scorethuis) AS thuisgewonnen 
FROM Wedstrijd 
WHERE scorethuis > scoreuit 
GROUP BY teamthuis;



-- 9. Geef per klasse het aantal teams in die klass
SELECT T.klasse, COUNT(T.teamcode) AS aantalTeams
FROM Team AS T
GROUP BY T.klasse;


-- 10. Geef de sporthallen die door meer dan 1 team gebruikt worden als thuishal
SELECT T.thuishal, S.sporthalplaats, COUNT(*) AS aantalTeams
FROM Team AS T
JOIN Sporthal AS S
ON T.thuishal = S.sporthalnaam
GROUP BY T.thuishal, S.sporthalplaats
HAVING COUNT(*) > 1;
















