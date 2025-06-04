SELECT projectNaam, startDatum
FROM Project
ORDER BY startDatum;


SELECT projectNaam, startDatum
FROM Project
ORDER BY startDatum DESC;


SELECT klantNummer, projectNaam, startDatum
FROM Project
ORDER BY klantNummer DESC, startDatum;

SELECT personeelsNummer, 12 * maandBedrag + ifnull(jaarBonus, 0) JaarSalaris
FROM Salaris
WHERE jaar = 2017
ORDER BY JaarSalaris DESC;


SELECT COUNT(*)
FROM Project;

SELECT COUNT(*) AantalProjecten
FROM Project;

-- Er zijn dus zeven projecten waarbij een niet NULL-waarde in de
-- kolom hoofdProjectNummer staat.
SELECT COUNT(hoofdProjectNummer)
FROM Project;



SELECT functie, COUNT(*)Aantal
FROM Personeelslid
WHERE functie = 'Frontend developer';



SELECT MAX(maandBedrag) Hoogste_Salaris, MIN(maandBedrag) Laagste_Salaris,
AVG(maandBedrag) Gemiddelde
FROM Salaris
WHERE jaar = 2017;

SELECT maandBedrag, COUNT(maandBedrag)
FROM Salaris
GROUP BY maandBedrag;

SELECT functie, COUNT(*) Aantal
FROM Personeelslid
GROUP BY functie;

SELECT functie, COUNT(*) Aantal
FROM Personeelslid
GROUP BY functie
HAVING Aantal > 2;


SELECT functie, MIN(maandBedrag) MinSal
FROM Personeelslid P JOIN Salaris S
ON P.personeelsNummer = S.personeelsNummer
WHERE jaar = 2017
GROUP BY functie
HAVING AVG(maandBedrag) < 2500
ORDER BY MinSal;

SELECT klantNummer, COUNT(*) aantalProjecten
FROM Project
GROUP BY klantNummer;


SELECT P.personeelsNummer, P.voornaam, P.achternaam, AVG(ProjectUrenToewijzing.urenPerWeek)
FROM Personeelslid AS P
JOIN ProjectUrenToewijzing
ON P.personeelsNummer = ProjectUrenToewijzing.personeelsNummer
GROUP BY P.personeelsNummer;


SELECT voornaam, tussenvoegsel, achternaam, AVG(urenPerWeek)
FROM Personeelslid P JOIN ProjectUrenToewijzing PUT
ON P.personeelsNummer = PUT.personeelsNummer
GROUP BY P.personeelsNummer;





