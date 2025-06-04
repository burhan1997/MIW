CREATE SCHEMA bestellingen;
USE bestellingen ;

-- -----------------------------------------------------
-- Tabel Klant
-- -----------------------------------------------------
CREATE TABLE Klant (
  klantnr INT NOT NULL AUTO_INCREMENT ,
  klantnaam VARCHAR(45) NOT NULL,
  plaats VARCHAR(45) NOT NULL,
  PRIMARY KEY (klantnr)
);

-- -----------------------------------------------------
-- Tabel Bestelling
-- -----------------------------------------------------
CREATE TABLE Bestelling (
  bestelnr INT NOT NULL AUTO_INCREMENT,
  klantnr INT NOT NULL,
  besteldatum DATE NOT NULL,
  PRIMARY KEY (bestelnr),
  CONSTRAINT fk_Bestelling_Klant
  FOREIGN KEY (klantnr)
  REFERENCES bestellingen.Klant (klantnr)
  ON DELETE RESTRICT
  ON UPDATE RESTRICT
);

-- -----------------------------------------------------
-- Tabel Artikel
-- -----------------------------------------------------
CREATE TABLE Artikel (
  artikelcode VARCHAR(12) NOT NULL,
  artikelnaam VARCHAR(45) NOT NULL,
  btwtarief VARCHAR(4) NOT NULL,
  artikelprijs DECIMAL(6,2) NOT NULL,
  voorraad INT NOT NULL,
  primary key (artikelcode),
  CONSTRAINT chk_Artikel_voorraad
  CHECK ( voorraad >= 0 )
);

-- -----------------------------------------------------
-- Tabel Bestelregel
-- -----------------------------------------------------
CREATE TABLE Bestelregel (
  bestelnr INT NOT NULL,
  artikelcode VARCHAR(12) NOT NULL,
  aantal INT NOT NULL,
  PRIMARY KEY (bestelnr, artikelcode),
 CONSTRAINT fk_Bestelregel_Bestelling
    FOREIGN KEY (bestelnr)
    REFERENCES Bestelling (bestelnr)
  ON DELETE CASCADE
  ON UPDATE RESTRICT,
CONSTRAINT fk_Bestelregel_Artikel
	FOREIGN KEY (artikelcode)
    REFERENCES Artikel(artikelcode)
ON DELETE RESTRICT
ON UPDATE CASCADE,
CONSTRAINT chk_Bestelregel_aantal
CHECK (aantal > 0 )
);

CREATE UNIQUE INDEX unique_klant_datum
ON Bestelling (klantnr, besteldatum);


INSERT INTO Klant (klantnaam, plaats) VALUES
('Ahmet Yılmaz', 'İstanbul'),
('Ayşe Demir', 'Ankara'),
('Mehmet Kaya', 'İzmir');

INSERT INTO Artikel (artikelcode, artikelnaam, btwtarief, artikelprijs, voorraad) VALUES
('A001', 'Kalem', 'laag', 2.50, 100),
('A002', 'Defter', 'laag', 5.00, 200),
('A003', 'Silgi', 'hoog', 1.00, 50);

INSERT INTO Bestelling (klantnr, besteldatum) VALUES
(1, '2025-05-10'),
(2, '2025-05-11'),
(3, '2025-05-12');

INSERT INTO Bestelregel (bestelnr, artikelcode, aantal) VALUES
(1, 'A001', 10),
(1, 'A002', 5),
(2, 'A003', 3);


INSERT INTO Artikel (artikelcode, artikelnaam, btwtarief, artikelprijs, voorraad)
VALUES ('A004', 'Silah', 'hoog', 10.00, -5);

INSERT INTO Bestelregel (bestelnr, artikelcode, aantal)
VALUES (1, 'A001', 0);

SELECT * FROM Bestelregel WHERE bestelnr = 1;

UPDATE Artikel SET artikelcode = 'A005' WHERE artikelcode = 'A003';
SELECT * FROM Bestelregel WHERE artikelcode = 'A005';


