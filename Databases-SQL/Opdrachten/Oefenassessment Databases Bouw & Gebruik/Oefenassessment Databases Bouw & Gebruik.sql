-- 1. Geef de SQL query die alleen de docx-documenten toont, die groter zijn dan 500 en in februari
-- 2019 zijn geplaatst. Laat de documentnaam zien en de grootte

SELECT documentNaam, grootte
FROM Document
WHERE grootte > 500 AND extensie = 'docx' AND documentNaam IN (
	SELECT documentNaam
    FROM DocumentPlaats
    WHERE month(tijdstipGeplaatst) = 02 AND year(tijdstipGeplaatst)=2019
);
-- of

SELECT d.documentNaam, d.grootte
FROM Document d 
WHERE d.grootte > 500 AND d.extensie ='docx' AND d.documentNaam IN (
  SELECT documentNaam 
  FROM documentplaats 
  WHERE MONTH(tijdstipGeplaatst) = 02 
  AND YEAR(tijdstipGeplaatst) = 2019);


-- 2. Geef de SQL query die alle folders toont met hun directe subfolders. Als een folder geen
-- subfolder heeft, toon dan de tekst ‘geen subfolders’.
SELECT 
  F1.folderNaam AS folder,
  CASE 
    WHEN F.folderNaam IS NULL THEN 'geen subfolders'
    ELSE F.folderNaam
  END AS subfolder
FROM Folder AS F1
LEFT JOIN Folder AS F ON F.superFolder = F1.folderNaam;


-- 3. Geef de SQL query om namen van documenten te tonen die in een folder staan waarvan de
-- gebruiker met gebruikersNaam ‘moost’ de eigenaar is. Gebruik een subquery!

SELECT documentNaam
FROM DocumentPlaats
WHERE folderNaam IN (
  SELECT foldernaam
  FROM Folder
  WHERE idEigenaar IN (
    SELECT idGebruiker
    FROM Gebruiker
    WHERE gebruikersnaam = 'moost'
  )
);

-- 4. Geef de SQL query die folders toont waarin de totale grootte van alle bestanden boven de 1000
-- uitkomt. Toon de naam van de folder en de totale grootte
SELECT DP.folderNaam, SUM(D.grootte) AS totaleGrootte
FROM DocumentPlaats AS DP
JOIN Document AS D 
ON DP.documentNaam = D.documentNaam
GROUP BY DP.folderNaam
HAVING SUM(D.grootte) > 1000;

-- 5. Schrijf een view genaamd FolderDocumenten, waarin alle documenten worden getoond, met de
-- naam van de folder en het tijdstip waarop de folder gemaakt is. Zorg ervoor dat de
-- documentNaam en de extensie in één kolom staan, maar gescheiden door een pu
CREATE VIEW FolderDocumenten AS
SELECT  CONCAT(D.documentNaam, '.', D.extensie) AS volledigeNaam, 
DP.folderNaam, F.tijdstipGemaakt
FROM Document AS D
JOIN DocumentPlaats AS DP ON D.documentNaam = DP.documentNaam
JOIN Folder AS F ON F.folderNaam = DP.folderNaam;


SELECT * FROM FolderDocumenten;





