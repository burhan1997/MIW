-- Toon alle records van de tabel Lid.
SELECT *
FROM Lid;


-- Geef alle gegevens van de leden die voor 2011 bij de club zijn toegetreden
SELECT *
FROM Lid
WHERE jaartoe < 2011;


-- Geef van de vrouwelijke leden de achternaam, de geboortedatum en hun lidnummer
SELECT achternaam, geb_datum, lidnr, geslacht
FROM Lid
WHERE geslacht = 'v';


-- Geef alle leden die geen emailadres hebben.
SELECT *
FROM Lid
WHERE emailadres IS NULL;


-- Geef alleen de leden die wel een emailadres hebben
SELECT *
FROM Lid
WHERE emailadres IS NOT NULL;


-- Geef de namen (met voorletters en tussenvoegsel) van de leden uit Zoetermeer
SELECT achternaam, voorletters, tussenvoegsel, woonplaats
FROM Lid
WHERE woonplaats = 'Zoetermeer';


-- Geef de uitslagen (teamthuis, teamuit, scorethuis, scoreuit) van de wedstrijden 
-- uit klasse B2000 die tussen 15 uur en 19 uur gespeeld zijn. (NB Hoe noteer je een tijdstip?
SELECT teamthuis, teamuit, scorethuis, scoreuit, tijd
FROM Wedstrijd
WHERE klasse = 'B2000' AND tijd BETWEEN '15:00:00' AND '19:00:00';


-- Verwijder de leden die in Leiden wonen
DELETE 
FROM Lid
WHERE woonplaats = 'Leiden';

-- HERSTEL 8 Leden in Leiden weer toevoegen
insert into Lid(lidnr, achternaam, voorletters, tussenvoegsel, geb_datum, geslacht, jaartoe, straat, huisnr, toevoeging, postcode, woonplaats, telefoon, emailadres, speelt_in, bank) Values (91, 'Haasse','U',NULL,'2004-01-06','m',2018,'Van Vollenhovenkade',105,NULL,'2312BS','Leiden','0715356135','U.Haasse@live.nl','ZZLEH2',NULL);
insert into Lid(lidnr, achternaam, voorletters, tussenvoegsel, geb_datum, geslacht, jaartoe, straat, huisnr, toevoeging, postcode, woonplaats, telefoon, emailadres, speelt_in, bank) Values (92, 'Kluismart ','Q',NULL,'1998-06-01','m',2012,'Willem De Zwijgerlaan',51,NULL,'2461AU','Leiden','0714542457','Q.Kluismart @live.nl','ZZLEH2',NULL);
insert into Lid(lidnr, achternaam, voorletters, tussenvoegsel, geb_datum, geslacht, jaartoe, straat, huisnr, toevoeging, postcode, woonplaats, telefoon, emailadres, speelt_in, bank) Values (93, 'Jansma','J','van','2004-05-21','m',2017,'De Bazelstraat',22,NULL,'2365FR','Leiden',NULL,'J.Jansma@live.nl','ZZLEH2','ZZLEH1');
insert into Lid(lidnr, achternaam, voorletters, tussenvoegsel, geb_datum, geslacht, jaartoe, straat, huisnr, toevoeging, postcode, woonplaats, telefoon, emailadres, speelt_in, bank) Values (94, 'Dijk','D','van','2008-11-30','m',2018,'Boommarkt',53,NULL,'2312NB','Leiden','0718329569','D.Dijk@live.nl','ZZLEH2',NULL);
insert into Lid(lidnr, achternaam, voorletters, tussenvoegsel, geb_datum, geslacht, jaartoe, straat, huisnr, toevoeging, postcode, woonplaats, telefoon, emailadres, speelt_in, bank) Values (95, 'Tromp','L',NULL,'1999-12-06','m',2015,'Trompstraat',45,NULL,'2341UI','Leiden','0714593214','L.Tromp@live.nl','ZZLEH2',NULL);
insert into Lid(lidnr, achternaam, voorletters, tussenvoegsel, geb_datum, geslacht, jaartoe, straat, huisnr, toevoeging, postcode, woonplaats, telefoon, emailadres, speelt_in, bank) Values (96, 'Berger','M.R',NULL,'1993-05-09','m',2013,'Pieterskerkhof',13,NULL,'2391LI','Leiden','0719714971','M.R.Berger@live.nl','ZZLEH1',NULL);
insert into Lid(lidnr, achternaam, voorletters, tussenvoegsel, geb_datum, geslacht, jaartoe, straat, huisnr, toevoeging, postcode, woonplaats, telefoon, emailadres, speelt_in, bank) Values (97, 'Hoes','T',NULL,'1997-10-12','m',2019,'Apothekersdijk',66,NULL,'2341RX','Leiden','0717852938','T.Hoes@live.nl','ZZLEH1',NULL);
insert into Lid(lidnr, achternaam, voorletters, tussenvoegsel, geb_datum, geslacht, jaartoe, straat, huisnr, toevoeging, postcode, woonplaats, telefoon, emailadres, speelt_in, bank) Values (98, 'Albulescu','U',NULL,'1994-03-17','m',2018,'Noordeinde',86,NULL,'2418UI','Leiden','0718795024','U.Albulescu@live.nl','ZZLEH1',NULL);
insert into Lid(lidnr, achternaam, voorletters, tussenvoegsel, geb_datum, geslacht, jaartoe, straat, huisnr, toevoeging, postcode, woonplaats, telefoon, emailadres, speelt_in, bank) Values (99, 'Vlaming','Y',NULL,'1999-08-30','m',2018,'Morsstraat',13,NULL,'2375IN','Leiden','0711045024','Y.Vlaming@live.nl','ZZLEH1',NULL);
insert into Lid(lidnr, achternaam, voorletters, tussenvoegsel, geb_datum, geslacht, jaartoe, straat, huisnr, toevoeging, postcode, woonplaats, telefoon, emailadres, speelt_in, bank) Values (100, 'Vayne','N.R',NULL,'1988-04-17','m',2011,'Langebrug',143,NULL,'2370LP','Leiden',NULL,'N.R.Vayne@live.nl','ZZLEH1',NULL);


-- Voeg je zelf toe als lid sinds 2008 met lidnr 300.
-- (NB Hoe laat je een veld leeg, hoe voer je de datum in?
INSERT INTO Lid
VALUES (300, 'BURHAN', 'B', NULL, '1997-03-01', 'M', 2008, 'KLOMPWEG', 60, NULL, '1234ED', 'WEESP', NULL, NULL, NULL, NULL); 


-- Geef alle boetes hoger dan 10 euro van het type A
SELECT *
FROM Boete
WHERE boetetype='A' AND bedrag > 10;


-- Verhoog de boetes van speler 109 met 10.
UPDATE Boete
SET  bedrag = bedrag + 10 
WHERE lidnummer = 109;


-- Schrijf een create-script om de tabel Bestuurslid toe te voegen. Deze tabel bevat
-- informatie over de bestuursfuncties die leden van de club hebben bekleed. De primaire
-- sleutel bestaat uit de kolommen lidnummer en begin_datum. De tabel is hieronder gegeven
CREATE TABLE Basketbal.Bestuurslid
(lidnummer INT NOT NULL,
begin_datum VARCHAR(11)  NOT NULL,
eind_datum VARCHAR(11),
functie VARCHAR(25)  NOT NULL,
PRIMARY KEY (lidnummer, begin_datum)
);



-- Voeg de eerste 5 records toe aan de tabel Bestuursleden
INSERT INTO Bestuurslid (lidnummer, begin_datum, eind_datum, functie)
VALUES
(107, '1-jan-2017', '31-dec-2017', 'Secretaris'),
(107, '1-jan-2018', '31-dec-2018', 'Lid'),
(107, '1-jan-2019', '31-dec-2019', 'Penningmeester'),
(107, '1-jan-2020', NULL, 'Voorzitter'),
(108, '1-jan-2017', '31-dec-2018', 'Voorzitter');


-- Geef alle gegevens van de sporthallen waarvan de naam begint met een S
SELECT *
FROM Sporthal
WHERE sporthalnaam  LIKE 'S%';

-- Geef de gegevens van de thuiswedstrijden van Dames 1 teams. Daarvan eindigt de code op D1
SELECT *
FROM Wedstrijd
WHERE teamthuis LIKE '%D1';






