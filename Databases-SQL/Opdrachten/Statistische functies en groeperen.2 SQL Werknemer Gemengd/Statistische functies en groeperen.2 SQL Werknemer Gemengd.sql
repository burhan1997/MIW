-- 1. Geef de namen van de werknemers die op locatie Chicago werken. (Zoek niet zelf het
-- afdelingsnummer op
SELECT W.wnaam
FROM Afdeling AS A
JOIN Werknemer AS W
ON A.anr = W.anr
WHERE A.locatie = 'Chicago';

-- 2. Geef van alle werknemers de naam, de functie en de salarisschaal. (Hint: als het salaris van een
-- werknemer tussen de ondergrens en de bovengrens van een salarisschaal zit, dan weet je de
-- juiste schaal. Gebruik een BETWEEN …. AND …. als JOIN voorwaarde
SELECT W.wnaam, W.functie, S.schaal
FROM Werknemer AS W
JOIN S_schaal AS S
ON W.salaris BETWEEN S.ondergrens AND S.bovengrens;

-- 3. Geef de naam van de verkopers die in salarisschaal 3 zitten
SELECT W.wnaam, W.functie, S.schaal
FROM Werknemer AS W
JOIN S_schaal AS S
  ON W.salaris BETWEEN S.ondergrens AND S.bovengrens
WHERE S.schaal = 3 
  AND W.functie = 'verkoper';


-- 4. Geef van alle salarisschalen het nummer en van de bijbehorende werknemers het nummer, de
-- naam en het salaris. Sorteer de uitkomst op salarisschaal
SELECT s.schaal, w.wnr, w.wnaam, w.salaris
FROM s_schaal s 
LEFT JOIN werknemer w ON s.ondergrens < w.salaris AND  w.salaris <= s.bovengrens
ORDER BY s.schaal;

-- 5. Geef nummer en naam van de werknemers en vermeld ook het nummer en de naam van hun
-- chef. Zorg dat alle werknemers in de lijst staaN
SELECT 
    W.wnr, W.wnaam, C.wnr AS chef_wnr, C.wnaam AS chef_wnaam
FROM
    Werknemer AS W
        LEFT JOIN
    Werknemer AS C ON W.chef = C.wnr;
    
    
-- 6. Geef een overzicht van de hiërarchie in het bedrijf. Toon van elke werknemer de chef, de chef
-- van de chef en tenslotte de chef van de chef van de chef
SELECT 
    W.wnr, W.wnaam, 
    C.wnr AS chef_wnr, C.wnaam AS chef_wnaam, 
    C2.wnr AS chef_van_chef_c, C2.wnaam AS chefnaam_van_c, 
    C3.wnr AS chefvan_c2, C3.wnaam AS chefnaam_van_c3
FROM
    Werknemer AS W
LEFT JOIN
    Werknemer AS C ON W.chef = C.wnr 
LEFT JOIN  
    Werknemer AS C2 ON C.chef = C2.wnr  
LEFT JOIN  
    Werknemer AS C3 ON C2.chef = C3.wnr;  


  -- 7. Laat het aantal werknemers per functie zien
  SELECT COUNT(*) AS aantalWerknemers, functie
  FROM Werknemer
  GROUP BY functie;
  
  
  -- 8. Geef alle functies die door minstens drie werknemers wordt uitgeoefend
SELECT functie, COUNT(functie) AS aantal_werknemers
FROM werknemer
GROUP BY functie
HAVING COUNT(functie) >= 3;

-- 9.Laat per afdeling zien wat het hoogste salaris van de afdeling is
SELECT A.anr, A.anaam, MAX(W.salaris) AS hoogste_salaris
FROM Afdeling AS A
JOIN Werknemer AS W ON W.anr = A.anr
GROUP BY A.anr, A.anaam;


-- of
SELECT anr, MAX(salaris) AS hoogste_salaris
FROM  werknemer 
GROUP BY anr;


-- 10. Laat per afdeling de naam van de afdeling en het gemiddelde salaris zien
SELECT A.anaam, AVG(W.salaris)
FROM Werknemer AS W
JOIN Afdeling AS A ON W.anr = A.anr
GROUP BY A.anaam;

-- of 
SELECT anaam, AVG(salaris) AS gemiddeld_salaris
FROM werknemer W JOIN afdeling A ON W.anr = A.anr
GROUP BY W.anr;

-- 11. Welke afdelingen hebben een gemiddeld salaris van meer dan 2000
SELECT A.anaam, AVG(W.salaris) AS gemiddeld_salaris
FROM werknemer W JOIN afdeling A ON W.anr = A.anr
GROUP BY W.anr
HAVING AVG(W.salaris) > 2000;

-- OF 

SELECT anr, AVG(salaris) AS gemiddeld_salaris
FROM werknemer
GROUP BY anr
HAVING AVG(salaris) > 2000;
  

-- 12. In welke plaatsen woont meer dan één werknemer?
SELECT count(wnaam), woonplaats
from prive
group by woonplaats
having count(wnaam)>1;

-- of
SELECT woonplaats
FROM  prive 
GROUP BY woonplaats
HAVING COUNT(woonplaats) > 1;

-- 13. Geef van alle werknemers die chef zijn het aantal werknemers waar ze chef van zijn

SELECT 
  C.wnr AS chef_wnr,
  C.wnaam AS chef_naam,
  COUNT(W.wnr) AS aantal_werknemers
FROM werknemer AS C
JOIN werknemer AS W ON W.chef = C.wnr
GROUP BY C.wnr, C.wnaam;

-- of 
SELECT w.chef, c.wnaam, COUNT(w.wnr) AS aantal_werknemers
FROM werknemer w JOIN werknemer c ON w.chef = c.wnr
GROUP BY w.chef;
