-- 1. Maak een view die de gegevens van de verkopers weergeeft en noem deze Verkopers.
CREATE VIEW Verkopers AS
SELECT *
FROM Werknemer
WHERE functie = 'VERKOPER';

-- 2. Gebruik de view Verkopers om de verkopers te geven (naam, salaris) die in schaal 3 zitten
SELECT wnaam, salaris
FROM verkopers
JOIN S_schaal AS S
ON salaris BETWEEN S.ondergrens AND S.bovengrens
WHERE S.schaal = 3;


-- 3. Maak een view ‘privé data’ van alle werknemers met daarin hun privé gegevens, hun functie
-- en de locatie van de afdeling (de chef, het salaris en de commissie neem je dus niet op
CREATE VIEW priveData AS
SELECT P.wnr, 
concat_ws(' ', P.wnaam, P.voorletter) AS naam, 
concat_ws(' ', P.adres, P.postcode, P.woonplaats) AS adres, 
W.functie, 
A.locatie
FROM Prive AS P 
JOIN Werknemer AS W ON W.wnr = P.wnr
JOIN Afdeling AS A ON W.anr = A.anr;

-- of 
CREATE VIEW prive_data AS
SELECT P.wnr, P.voorletter, P.wnaam, P.postcode, P.adres, P.woonplaats, W.functie, A.locatie
FROM PRIVE P JOIN Werknemer W  ON P.wnr = W.wnr 
JOIN Afdeling A ON W.anr = A.anr;

-- 4. Gebruik de view ‘privé data’ om de werknemers te laten zien die wonen en werken in dezelfde plaats
SELECT *
FROM prive_data
WHERE woonplaats = locatie;

-- 5. Maak een view aan van alle chefs, en noem die Chefs (alle werknemer gegevens, oplopend
-- gesorteerd op naam)
CREATE VIEW Chefs AS
SELECT W.*
FROM Werknemer AS W
JOIN Werknemer AS C 
ON W.wnr = C.chef
ORDER BY W.wnaam;

-- of

CREATE VIEW Chefs AS
SELECT	*
FROM 	Werknemer
WHERE 	wnr IN
( 	SELECT	chef
	FROM	Werknemer
)
ORDER BY wnaam;




SELECT P.personeelsNummer, concat_ws(' ', voornaam, tussenvoegsel,
achternaam) AS naam, functie, S.maandBedrag
FROM personeelslid P
JOIN salaris S ON P.personeelsNummer = S.personeelsNummer
WHERE S.jaar = 2018;


CREATE VIEW Salaris2018 AS
SELECT P.personeelsNummer, concat_ws(' ', voornaam, tussenvoegsel,
achternaam) AS naam, functie, S.maandBedrag
FROM personeelslid P
JOIN salaris S ON P.personeelsNummer = S.personeelsNummer
WHERE S.jaar = 2018;

SELECT * FROM salaris2018;

SELECT functie, MAX(maandBedrag) AS Maximum
FROM salaris2018
GROUP BY functie
ORDER BY Maximum;