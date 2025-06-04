SELECT *
FROM Klant;

SELECT *
FROM Project;

SELECT *
FROM Klant, Project;


SELECT *
FROM Klant, Project
WHERE Klant.klantNummer = Project.klantNummer;

SELECT Klant.klantNummer, klantNaam, projectNummer, projectNaam,
Project.klantNummer
FROM Klant JOIN Project
ON Klant.klantNummer = Project.klantNummer;

-- Soms zie je INNER JOIN in plaats van JOIN. In Workbench zijn deze hetzelfde. Dus de
-- volgende query geeft exact hetzelfde resultaat
SELECT Klant.klantNummer, klantNaam, projectNummer, projectNaam,
Project.klantNummer
FROM Klant INNER JOIN Project
ON Klant.klantNummer = Project.klantNummer;



SELECT Klant.klantNummer, klantNaam, projectNummer, projectNaam, startDatum
FROM Klant JOIN Project
ON Klant.klantNummer = Project.klantNummer
WHERE startDatum >= '2017-11-01';

-- Aliassen worden gebruikt als alternatieve naam voor een tabel of kolom. Je kunt een
-- tabel met een lange naam afkorten of zelfs een andere naam geven. Ook kun je
-- kolomnamen afkorten of hernoemen. 
SELECT K.klantNummer, klantNaam, projectNummer, projectNaam, P.klantNummer
FROM Klant AS K JOIN Project AS P
ON K.klantNummer = P.klantNummer;

SELECT K.klantNummer, klantNaam, projectNummer, projectNaam, P.klantNummer
FROM Klant K JOIN Project P
ON K.klantNummer = P.klantNummer;



SELECT 
  P.projectNummer, 
  projectNaam, 
  PL.personeelsNummer, 
  achternaam, 
  urenPerWeek
FROM 
  (Project P JOIN ProjectUrenToewijzing PT 
     ON P.projectNummer = PT.projectNummer)
JOIN 
  Personeelslid PL 
  ON PT.personeelsNummer = PL.personeelsNummer;


SELECT concat_ws('   ', voornaam, tussenvoegsel, achternaam) volledige_naam
FROM Personeelslid;

SELECT concat(projectNaam, ' is gestart op ', startDatum) projectStartDatum
FROM project;


SELECT projectNaam, timestampdiff(Month, startDatum, eindDatum) duurProject
FROM Project;

SELECT projectNaam, startDatum, eindDatum, timestampdiff(Month, startDatum, eindDatum) duurProject
FROM Project
WHERE timestampdiff(Month, startDatum, eindDatum) > 4;


SELECT 
    UPPER(projectNaam), 
    startDatum, 
    date_add(startDatum, INTERVAL 1 DAY) AS VolgendeDag, 
    YEAR(startDatum) AS Jaar,
    MONTH(startDatum) AS Maand, 
    'Gewoon wat tekst' AS Zomaar
FROM Project;


