SELECT projectNummer, projectNaam, hoofdProjectNummer
FROM project;

-- als je zou willen weten wat de projectNaam is van het hoofdProject van het
-- project met de projectNaam OSHM Frontend, dan heb je twee queries nodig. Ten
-- eerste de query
SELECT hoofdProjectNummer
FROM project
WHERE projectNaam = 'OSHM Frontend';

-- De tweede query is dan:
SELECT projectNaam
FROM project
WHERE projectNummer = 511;


SELECT 
  P.projectNummer, 
  P.projectNaam, 
  P.hoofdProjectNummer, 
  H.projectnummer AS hoofdprojectnummer, 
  H.projectNaam AS hoofdprojectnaam
FROM 
  Project P 
JOIN 
  Project H
ON 
  P.hoofdProjectNummer = H.projectNummer;
  
 -- Om terug te gaan naar ons oorspronkelijke probleem: wat is de projectNaam van het
-- hoofdProject van het project met de projectNaam OSHM Frontend? 
SELECT H.projectNaam AS hoofdprojectnaam
FROM Project P 
JOIN Project H
ON P.hoofdProjectNummer = H.projectNummer
WHERE P.projectNaam = 'OSHM Frontend';


SELECT P.projectNummer, P.projectNaam, P.hoofdProjectNummer, H.projectnummer AS hoofdprojectnummer, H.projectNaam AS hoofdprojectnaam
FROM Project P LEFT JOIN Project H
ON P.hoofdProjectNummer = H.projectNummer;


SELECT K.klantNaam, P.projectNaam
FROM Klant K LEFT JOIN Project P
ON K.klantNummer = P.klantNummer;

SELECT K.klantNaam, P.projectNaam
FROM Project P RIGHT JOIN Klant K
ON K.klantNummer = P.klantNummer;
