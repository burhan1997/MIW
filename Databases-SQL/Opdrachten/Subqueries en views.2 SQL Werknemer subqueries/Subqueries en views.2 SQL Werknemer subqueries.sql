-- 1. Welke werknemer verdient het laagste salaris
SELECT wnaam
FROM Werknemer
WHERE salaris = (
SELECT MIN(salaris)
FROM Werknemer
);

-- 2. Welke werknemers verdienen meer dan het gemiddelde salaris?
SELECT wnaam, wnr, salaris
FROM Werknemer
WHERE salaris > (
SELECT AVG(salaris)
FROM Werknemer
);

-- 3. Welke werknemers werken op dezelfde afdeling als Smit
SELECT wnr, wnaam, anr
FROM Werknemer
WHERE anr IN (
  SELECT anr
  FROM Werknemer
  WHERE wnaam = 'Smith'
);

-- 4. in welke afdeling wordt het hoogste salaris verdiend?

SELECT anaam, locatie
FROM Afdeling
WHERE anr IN (
  SELECT anr
  FROM Werknemer
  WHERE salaris = (
    SELECT MAX(salaris)
    FROM Werknemer
  )
);

-- 5. Welke werknemers verdienen meer dan het gemiddelde salaris van hun afdeling?

SELECT wnaam, wnr, salaris
FROM Werknemer
WHERE wnr IN (
  SELECT wnr
  FROM Werknemer
  WHERE salaris > (
    SELECT AVG(salaris)
    FROM Werknemer
    WHERE anr = Werknemer.anr
  )
);

-- of
SELECT w1.wnr, w1.salaris
FROM werknemer w1 JOIN (	SELECT anr, AVG(salaris) avgsal 
						FROM werknemer 
						GROUP BY anr) AS afdavgsal 
ON w1.anr = afdavgsal.anr
WHERE w1.salaris > avgsal;


-- 5. Welke werknemers verdienen meer dan het gemiddelde salaris van hun afdeling?


select wnaam, wnr, salaris
from Werknemer
where salaris >  (
SELECT AVG(salaris)
FROM Werknemer
WHERE anr = Werknemer.anr
);



