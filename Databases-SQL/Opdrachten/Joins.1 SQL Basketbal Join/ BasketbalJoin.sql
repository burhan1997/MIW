-- 1. Geef van elk team de teamgegevens en de gegevens van de aanvoerder. (Hint: onderzoek
-- hoe in de database is vastgelegd wie de aanvoerder van een team is)

SELECT T.aanvoerder, T.klasse, T.teamcode, T.teamnaam, L.achternaam, L.lidnr  
FROM Team AS T
JOIN Lid AS L
ON T.aanvoerder = L.lidnr;

-- 2. Geef van elk team de teamcode en de naam van de aanvoerder
SELECT T.teamcode, T.teamnaam,  L.achternaam AS AanvoerderAchternaam
FROM Team AS T
JOIN Lid AS L
ON T.aanvoerder = L.lidnr;


-- 3. Geef van elk team uit de klasse B2000 de teamcode en de achternaam van de aanvoerder
SELECT T.klasse, T.teamcode, L.achternaam
FROM Team AS T
JOIN Lid AS L
ON T.aanvoerder = L.lidnr
WHERE T.klasse = 'B2000';


-- 4. Geef van de leden met boetes het lidnummer, de naam en de boetebedragen die voor hem
-- of haar geregistreerd zijn.
SELECT L.lidnr,B.lidnummer, L.achternaam, B.bedrag
FROM Boete AS B
JOIN Lid AS L
ON L.lidnr = B.lidnummer
WHERE B.bedrag IS NOT NULL;


-- 5. Geef van de vrouwelijke leden uit Volendam het lidnummer, de naam en de boetebedragen
-- die voor haar geregistreerd zijn
SELECT L.lidnr, L.achternaam, B.bedrag,L.woonplaats, L.geslacht
FROM Lid AS L
JOIN Boete AS B
ON L.lidnr = B.lidnummer
WHERE L.woonplaats = 'Volendam' AND L.geslacht = 'v';


-- 6. Geef van de leden, die aanvoerder van een team zijn, het lidnummer en de achternaam.
-- Geef ook de teamcode en de klasse van het team waarvan hij of zij aanvoerder is.
SELECT  L.lidnr, L.achternaam, T.teamcode, T.klasse
FROM 
Lid AS L 
JOIN Team AS T
ON L.lidnr = T.aanvoerder;

-- 7. Geef het lidnummer, de achternaam en de woonplaats van elke vrouwelijke speler die niet in
-- Delft woonachtig is
SELECT L.lidnr, L.achternaam, L.woonplaats
FROM Lid AS L
WHERE L.geslacht = 'v' AND L.woonplaats != 'Delft';

-- 8. Geef de lidnummers van de leden die in de periode 2010-2015 tot de vereniging zijn
-- toegetreden.
SELECT L.lidnr, L.jaartoe
FROM Lid AS L
WHERE L.jaartoe>=2010 AND L.jaartoe<=2015;


-- 9.Geef een lijst van leden met de achternaam, de geboortedatum en de huidige leeftijd
SELECT 
L.lidnr, 
L.achternaam, 
L.geb_datum, 
timestampdiff(Year, geb_datum, CURDATE()) huidigeLeeftijd
FROM Lid AS L;

-- 10. Geef de achternaam van de leden en het volledig adres. Het adres moet in één kolom komen
-- te staan met als kolomkop ‘adres’
SELECT
L.lidnr,
L.achternaam,
concat_ws(' ', L.straat, L.huisnr, toevoeging, postcode, woonplaats) adres
FROM Lid AS L;


-- 11. Geef een lijst van teams met hun thuis gewonnen wedstrijden. Laat het team zien met
-- daarachter de uitslag in één kolom als volgt: 30 – 24.
SELECT 
  T.teamnaam,
  concat(W.scorethuis, ' - ', W.scoreUit) AS results
FROM 
  Team AS T
JOIN 
  Wedstrijd AS W
ON 
  T.teamcode = W.teamthuis
WHERE 
  W.scorethuis > W.scoreUit;
  
  -- 12.Geef een lijst met boetes die acht of meer jaar geleden uitgedeeld zijn
  SELECT
	L.lidnr,
    B.lidnummer,
    B.betalingnummer,
    B.bedrag,
    timestampdiff(Year, B.datumovertreding, CURDATE()) AS boetesAchtOfMeerJaar
  FROM 
	Lid AS L
  JOIN 
	Boete AS B
  ON 
	L.lidnr = B.lidnummer
  WHERE
    timestampdiff(Year, B.datumovertreding, CURDATE()) >= 8;
	
-- 13. Geef een lijst van alle vrouwelijke leden, waarbij voorletters, tussenvoegsel en naam in één
-- kolom verschijnt en het geslacht in de tweede. In die tweede kolom moet het woord ´vrouw´
-- komen te staan. (tip: gebruik concat_ws)
SELECT 
  L.lidnr,
  CONCAT_WS(' ', L.voorletters, L.tussenvoegsel, L.achternaam) AS naam,
  'vrouw' AS geslacht
FROM Lid AS L
WHERE L.geslacht = 'v';

-- 14. Geef een lijst met leden, waarbij voorletters, tussenvoegsel en achternaam in één kolom
-- verschijnt en het geslacht in de tweede. In die tweede kolom moet het woord ´man´ of
-- ´vrouw´ komen te staan. (tip: gebruik case when….)
SELECT 
  L.lidnr,
  CONCAT_WS(' ', L.voorletters, L.tussenvoegsel, L.achternaam) AS naam,
  CASE
    WHEN L.geslacht = 'm' THEN 'MAN'
    WHEN L.geslacht = 'v' THEN 'VROUW'
  END AS geslacht
FROM Lid AS L;



    
    






