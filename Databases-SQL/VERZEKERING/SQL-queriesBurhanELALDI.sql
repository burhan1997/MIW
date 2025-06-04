-- Burhan Elaldi

-- Schadeclaims met een schadebedrag van €10.000 of meer. Toon het schadebedrag, de
-- naam van de polishouder en de categorie van het eigen risico.
CREATE VIEW GroteSchadeclaims AS
SELECT 
    S.schadeBedrag, 
    P.naamPolishouder, 
    P.eigenRisicoCategorie
FROM 
    Schadeclaim AS S 
JOIN 
    Polis AS P ON S.idPolis = P.idPolis
WHERE 
    S.schadeBedrag >= 10000;
    
SELECT * FROM GroteSchadeclaims;



-- Per medewerker die aan schadeclaims werkt het aantal schadeclaims, het totaal van de
-- schadebedragen en het gemiddelde van de schadebedragen. Toon het identificatienummer
-- van de medewerker.
SELECT 
	M.idMedewerker, 
    COUNT(*) AS aantalSchadeclaims, 
    SUM(S.schadeBedrag) AS totaalSchadebedrag, 
    AVG(S.schadeBedrag) AS gemiddeldeSchadebedrag
FROM 
	Medewerker AS M 
JOIN 
	Schadeclaim AS S
ON 
	S.idMedewerker = M.idMedewerker
GROUP BY M.idMedewerker;


-- Het aantal schadeclaims dat voor een polis wordt of is behandeld. Laat daarbij de naam en
-- de plaats van het kantoor zien, waar de polis behandeld wordt en de naam van de
-- polishouder. En toon alleen de polissen met meer dan 2 schadeclaims

SELECT 
	COUNT(S.schadeBedrag) aantalSchadeclaims,
	V.naam,
    V.plaats,
    P.naamPolishouder
FROM 
	Polis AS P
LEFT JOIN
	Schadeclaim AS S
ON
	P.idPolis = S.idPolis
JOIN 
	Verzekeringskantoor AS V
ON 
	P.naamKantoor = V.naam
GROUP BY 
	P.idPolis
HAVING 
	aantalSchadeclaims > 2;
	
    
-- Overzicht van alle medewerkers met de schadeclaims waar zij aan werken. Toon de naam
-- van de medewerker, de naam van het kantoor waar de medewerker werkt en de datum van
-- de schadeclaim. Als een medewerker niet werkt aan een schadeclaim, toon dan “Geen
-- schadeclaim” in plaats van de datum.
SELECT 
	M.idMedewerker, 
	M.voornaam, 
    M.achternaam, 
    V.naam, 
    IFNULL(S.schadeDatum, 'Geen schadeclaim')
FROM Medewerker AS M
LEFT JOIN 
	Schadeclaim AS S
ON 
	M.idMedewerker = S.idMedewerker
JOIN 
	Verzekeringskantoor AS V
ON 
	M.naamKantoor = V.naam;
	
-- Om een verjaardag te kunnen vieren wil men een overzicht hebben van alle medewerkers die
-- op hetzelfde kantoor werken als de jarige. Geef een overzicht van alle medewerkers die op
-- hetzelfde kantoor werken als Bul Super.
SELECT *
FROM Medewerker
WHERE naamKantoor = (
SELECT naamKantoor
FROM Medewerker
WHERE concat_ws(' ', voornaam, achternaam) = 'Bul Super');


-- Overzicht van alle polissen waarvoor nog géén schadeclaim is ingediend. Toon de naam van
-- de polishouder, het verzekerde bedrag en de startdatum. Sorteer de polissen op startdatum

SELECT P.naamPolishouder, P.verzekerdBedrag, P.startDatum, S.schadeBedrag, S.idPolis
FROM Polis AS P left join Schadeclaim AS S on S.idPolis = P.idPolis
WHERE S.idPolis IS  NULL
ORDER BY P.startDatum;

