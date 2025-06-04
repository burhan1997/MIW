-- 1. Maak een view Apollohalteams, met daarin de teamgegevens van die teams die de Apollohal
-- als thuishal hebben
CREATE VIEW Apollohalteams AS
SELECT *
FROM Team
WHERE thuishal = 'Apollohal';

-- 2. Wedstrijden worden altijd gespeeld in de hal van het thuis spelende team. Gebruik de view
-- Apollohalteams (zie opgave 1) om de wedstrijden in de Apollohal weer te geven. Zet de laatst
-- gespeelde wedstrijd boven aan de lijst
SELECT *
From apollohalteams AS A
join Wedstrijd AS W
on A.teamcode = W.teamthuis
order by datum DESC;

-- of

select	* 
from	wedstrijd
where	teamthuis in
(	select	teamcode
	from	Apollohalteams
)
order by datum desc;


-- 3. Maak een view van leden, gesorteerd op lidnummer, voor wie minstens 1 boete is
-- geregistreerd. Geef ook de gegevens van deze boete (betalingnummer, type, bedrag en
-- datum)
CREATE VIEW LedenMetBoetes AS
SELECT 
  L.lidnr, 
  L.achternaam, 
  L.emailadres, 
  B.betalingnummer, 
  B.boetetype, 
  B.bedrag, 
  B.datumovertreding
FROM Lid AS L
JOIN Boete AS B 
  ON L.lidnr = B.lidnummer
order by L.lidnr;


-- 4. Geef voor elk lid voor wie minstens 1 boete is geregistreerd (gebruik de view uit opgave 3) het
-- lidnummer, de gemiddelde boete (2 decimalen) en het aantal boete

SELECT lidnr, ROUND(AVG(bedrag), 2) AS GemiddeldeBoete, COUNT(*) AS AantalBoetes
FROM LedenMetBoetes
GROUP BY lidnr;




