-- 1. Geef de leden die in dezelfde plaats wonen als het lid met nummer 83
SELECT lidnr, achternaam, voorletters, tussenvoegsel, woonplaats
FROM Lid
WHERE woonplaats = (
SELECT lidnr
FROM Lid
WHERE lidnr = 83 
);

-- 2. Geef een overzicht van de boetes van de leden die in Amsterdam wonen. (TIP: gebruik WHERE
-- …. in…..)
SELECT * 
FROM Boete
WHERE lidnummer IN (
  SELECT lidnr
  FROM Lid
  WHERE woonplaats = 'Amsterdam'
);

-- 3. Geef de thuiswedstrijden en de uitslag van de thuiswedstrijden van de teams met als thuishal
-- de Apollohal.
SELECT datum, tijd, teamthuis,teamuit, concat_ws('-', scorethuis, scoreuit) AS uitslag 
FROM Wedstrijd
WHERE teamthuis  IN (
		SELECT teamcode
        FROM Team
        WHERE thuishal = 'Apollohal'
);


-- 4. Geef een overzicht van de boetes van de leden die voor team LEAMD1 hebben gespeeld.
SELECT *
FROM Boete
WHERE lidnummer IN (
SELECT lidnr
FROM Lid
WHERE speelt_in = 'LEAMD1'
);


-- 5. Geef de namen van de leden die de hoogste boete hebben betaald.
SELECT lidnr, achternaam, voorletters, tussenvoegsel
FROM Lid
WHERE lidnr IN (
  SELECT lidnummer
  FROM Boete
  WHERE bedrag IN (
    SELECT MAX(bedrag)
    FROM Boete
  )
);

-- 6A. Geef een lijst van leden en het aantal boetes dat ze hebben betaald, laat de naam van
-- het lid en het aantal boetes zien
SELECT COUNT(*) AS aantalBoetes, L.lidnr, L.achternaam, L.voorletters
FROM Lid AS L
JOIN Boete AS B ON L.lidnr = B.lidnummer
GROUP BY L.lidnr, L.achternaam, L.voorletters;

-- 6B. Geef de namen van de leden die meer dan 2 boetes hebben betaALD
SELECT L.achternaam, COUNT(*)
FROM Lid AS L
JOIN Boete AS B ON L.lidnr = B.lidnummer
GROUP BY L.lidnr
HAVING COUNT(*)>2;

-- 6C. Geef de naam van het lid dat meer boetes heeft betaald dan het lid met lidnummer 201
SELECT L.achternaam, COUNT(*) AS aantal_boetes
FROM Lid AS L
JOIN Boete AS B ON L.lidnr = B.lidnummer
GROUP BY L.lidnr, L.achternaam
HAVING COUNT(*) > (
    SELECT COUNT(*)
    FROM Boete
    WHERE lidnummer = 201
);

-- OF
SELECT achternaam
FROM Lid
WHERE lidnr = (
	SELECT lidnummer
	FROM Boete 
	GROUP BY lidnummer
	HAVING count(*) > (
		SELECT count(*) 
		FROM Boete 
		WHERE lidnummer = 201));


-- Antwoord met één subquery en een join:

SELECT achternaam, count(*) 
FROM Lid JOIN Boete ON Lid.lidnr = Boete.lidnummer
GROUP BY Lid.lidnr
HAVING count(*) > (	SELECT count(*) 
				FROM Boete 
				WHERE lidnummer = 201);



