SELECT * FROM ProjectBeheer.Klant
WHERE klantNummer=1;

SELECT *
FROM Klant
WHERE locatie = 'Amsterdam';

SELECT klantNaam, locatie
FROM Klant
WHERE locatie = 'Amsterdam';

SELECT projectNummer, projectNaam, hoofdProjectNummer
FROM Project
WHERE hoofdProjectNummer IS NULL;

SELECT * FROM personeelslid;

INSERT INTO personeelslid
VALUES (112, 'Jan', NULL, 'Smit', 'Frontend developer');


SELECT voornaam, tussenvoegsel, achternaam
FROM personeelslid
WHERE tussenvoegsel IS NOT NULL;


-- Dit geeft alle projecten die gestart zijn in april 2017
SELECT *
FROM Project
WHERE startDatum 
BETWEEN '2017-04-01' AND '2017-04-30';

-- Het geeft alle projecten waarbij het klantnummer 1 of 2 is
SELECT *
FROM Klant
WHERE klantNummer IN (1, 2);


SELECT projectNaam, type
FROM project
WHERE type = 'FrontEnd' OR type = 'BackEnd';


SELECT projectNaam, type
FROM Project
WHERE type = 'FrontEnd' AND klantNummer = 1;


SELECT projectNaam, type
FROM project
WHERE type IN ('FrontEnd', 'BackEnd');


SELECT voornaam
FROM personeelslid
WHERE voornaam LIKE 'm%';


SELECT voornaam, functie
FROM personeelslid
WHERE functie LIKE '%end%';


