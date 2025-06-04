-- Geef de klanten die in Amsterdam gevestigd zijn
SELECT klantNummer
FROM Klant
WHERE locatie = 'Amsterdam';


-- 2.Geef de personeelsleden die Backend Programmeur zijn. Sorteer de personeelsleden op achternaam
SELECT *
FROM Personeelslid
WHERE functie = 'Backend Programmeur'
ORDER BY achternaam ;


-- 3. Welke personeelsleden (naam bestaande uit voornaam, tussenvoegsel en achternaam) hebben in
-- 2017 een bonus ontvangen
SELECT 
    P.voornaam, 
    P.tussenvoegsel, 
    P.achternaam
FROM 
    Personeelslid AS P
JOIN 
    Salaris AS S ON P.personeelsNummer = S.personeelsNummer
WHERE 
    S.jaar = 2017 
    AND S.jaarbonus != 0;



-- 4. Geef een overzicht van alle hoofdprojecten (dit zijn de projecten, die geen deelproject zijn van
-- een ander project).
SELECT *
FROM Project AS P
WHERE hoofdProjectNummer IS NULL;

-- 5. Geef alle hoofdprojecten (zie de opmerking bij 4.) met de naam van de klant
SELECT P.projectNaam, P.startDatum, P.eindDatum, P.klantNummer, K.klantNaam
FROM Project AS P
JOIN Klant AS K
ON P.klantNummer = K.klantNummer
WHERE hoofdProjectNummer IS NULL;


-- 6. Geef een overzicht van alle hoofdprojecten met deelprojecten. Toon het hoofdproject en de
-- bijbehorende deelprojecten
SELECT *
from Project
where hoofdProjectNummer IS NOT NULL
GROUP BY hoofdProjectNummer;














