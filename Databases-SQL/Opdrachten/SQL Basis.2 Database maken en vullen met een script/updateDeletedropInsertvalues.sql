CREATE TABLE Bibliotheek.Boek
(Boeknr INT NOT NULL,
Titel VARCHAR(45),
Taal VARCHAR(6),
Jaar INT,
PRIMARY KEY (Boeknr)
);


INSERT INTO Boek
VALUES (11453,'Sjakie en de chocoladefabriek','nederl',1968);

INSERT INTO Boek
VALUES (11244,'Through ...','engels',1872);

UPDATE Boek
SET Titel = 'Through the looking glass',Jaar = 1873
WHERE Boeknr = 11244;

DELETE FROM Boek
WHERE Jaar <= 1960;

DELETE FROM Boek;

DROP TABLE Boek;

DROP SCHEMA bibliotheek;