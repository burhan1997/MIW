-- -----------------------------------------------------
-- Schema Verzekeringsmaatschappij
-- -----------------------------------------------------
CREATE SCHEMA `Verzekeringsmaatschappij`;
USE `Verzekeringsmaatschappij`;

-- -----------------------------------------------------
-- Table `Verzekeringskantoor`
-- -----------------------------------------------------
CREATE TABLE `Verzekeringskantoor` (
  `naam` VARCHAR(45) NOT NULL,
  `plaats` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`naam`));

INSERT INTO verzekeringskantoor VALUES ('Bommelstein','Rommeldam'),('De Haven','Rommeldam'),('Het Kantoor','Rommeldam'),('Het Laboratorium','Rommeldam');

-- -----------------------------------------------------
-- Table `Polis`
-- -----------------------------------------------------
CREATE TABLE `Polis` (
  `idPolis` INT NOT NULL,
  `naamPolishouder` VARCHAR(45) NOT NULL,
  `verzekerdBedrag` INT NOT NULL,
  `startDatum` DATE NOT NULL,
  `eigenRisicoCategorie` INT NOT NULL,
  `naamKantoor` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idPolis`),
  INDEX `fk_Polis_Verzekeringskantoor_idx` (`naamKantoor` ASC) VISIBLE,
  CONSTRAINT `fk_Polis_Verzekeringskantoor` 
  FOREIGN KEY (`naamKantoor`) REFERENCES `Verzekeringskantoor` (`naam`));

INSERT INTO polis VALUES (1,'Hiep Hieper',50000,'2018-08-13',1,'De Haven'),(2,'Terpen Tijn',100000,'2017-07-31',2,'Het Kantoor'),(3,'Garmt Grootgrut',34000,'2020-01-01',1,'Het Kantoor'),(4,'Annemarie Doddel',50000,'2019-03-01',2,'Het Kantoor'),(5,'Pee Pastinakel',10000,'2018-04-01',1,'Bommelstein'),(6,'Okke Zielknijper',300000,'2017-05-01',3,'Het Laboratorium'),(7,'Brigadier Snuf',5000000,'2021-05-01',2,'Het Kantoor'),(8,'Querulijn Xaverius de Canteclaer',6000000,'2018-05-01',1,'Het Laboratorium'),(9,'Argus',7500000,'2018-09-01',2,'Het Laboratorium'),(10,'Joris Goedbloed',1000000,'2021-08-16',3,'De Haven');
-- -----------------------------------------------------
-- Table `WA_Polis`
-- -----------------------------------------------------
CREATE TABLE `WA_Polis` (
  `idPolis` INT NOT NULL,
  `aantalPersonen` INT NOT NULL,
  PRIMARY KEY (`idPolis`),
  CONSTRAINT `fk_polis_wa` 
  FOREIGN KEY (`idPolis`) REFERENCES `Polis` (`idPolis`));

INSERT INTO wa_polis VALUES (6,1),(7,3),(8,2),(9,2),(10,5);

-- -----------------------------------------------------
-- Table `Auto`
-- -----------------------------------------------------
CREATE TABLE `Auto` (
  `kenteken` VARCHAR(10) NOT NULL,
  `merk` VARCHAR(45) NOT NULL,
  `type` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`kenteken`));

INSERT INTO auto VALUES ('23-KZ-TH','Peugeot','507'),('34-PO-ES','Citroën','C4'),('74-OBB-3','Volkswagen','Kever'),('78-TH-LZ','Audi','A8'),('9-PPT-34','BMW','i3'),('AA-00-01','Mercedes-Benz','C-Klasse Limousine'),('H-675-DD','Toyota','Prius'),('JL-222-P','Citroën','C1'),('L-234-GV','Tesla','Model 3'),('TI-56-JN','Renault','Megane');

-- -----------------------------------------------------
-- Table `AutoPolis`
-- -----------------------------------------------------
CREATE TABLE `AutoPolis` (
  `idPolis` INT NOT NULL,
  `auto` VARCHAR(10) NOT NULL,
  `aantalSchadevrijeJaren` INT NOT NULL,
  PRIMARY KEY (`idPolis`),
  INDEX `fk_AutoPolis_Auto1_idx` (`auto` ASC) VISIBLE,
  CONSTRAINT `fk_polis_auto` 
  FOREIGN KEY (`idPolis`) REFERENCES `Polis` (`idPolis`),
  CONSTRAINT `fk_AutoPolis_Auto1` 
  FOREIGN KEY (`auto`) REFERENCES `Auto` (`kenteken`));

INSERT INTO autopolis VALUES (1,'23-KZ-TH',7),(2,'74-OBB-3',0),(3,'L-234-GV',6),(4,'TI-56-JN',15),(5,'JL-222-P',13);
-- -----------------------------------------------------
-- Table `Medewerker`
-- -----------------------------------------------------
CREATE TABLE `Medewerker` (
  `idMedewerker` INT NOT NULL,
  `voornaam` VARCHAR(45) NOT NULL,
  `tussenvoegsels` VARCHAR(45) NULL,
  `achternaam` VARCHAR(45) NOT NULL,
  `e-mailadres` VARCHAR(45) NOT NULL,
  `naamKantoor` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idMedewerker`),
  INDEX `fk_Medewerker_Verzekeringskantoor1_idx` (`naamKantoor` ASC) VISIBLE,
  CONSTRAINT `fk_Medewerker_Verzekeringskantoor1` 
  FOREIGN KEY (`naamKantoor`) REFERENCES `Verzekeringskantoor` (`naam`));

INSERT INTO medewerker VALUES (1,'Joost','de','Hond','joost@bommelstein.nl','Bommelstein'),(2,'Bulle',NULL,'Bas','bullebas@kantoor.nl','Het Kantoor'),(3,'Dirk',NULL,'Dickerdack','dirkdickerdack@kantoor.nl','Het Kantoor'),(4,'Doris',NULL,'Dorknoper','dorisdorknoper@kantoor.nl','Het Kantoor'),(5,'Wal',NULL,'Rus','walrus@haven.nl','De Haven'),(6,'Wammes',NULL,'Waggel','wammeswaggel@haven.nl','De Haven'),(7,'Zbygniew','','Prlwytzkofsky','zbygniewprlwytzkofsky@laboratorium.nl','Het Laboratorium'),(8,'Alexander',NULL,'Pieps','alexanderpieps@laboratorium.nl','Het Laboratorium'),(9,'Joachim',NULL,'Sickbock','joachimsickbock@laboratorium.nl','Het Laboratorium'),(10,'Bul',NULL,'Super','bulsuper@haven.nl','De Haven');

-- -----------------------------------------------------
-- Table `Schadeclaim`
-- -----------------------------------------------------
CREATE TABLE `Schadeclaim` (
  `idMedewerker` INT NOT NULL,
  `idPolis` INT NOT NULL,
  `schadeDatum` DATE NOT NULL,
  `schadeBedrag` DECIMAL(11,2) NOT NULL,
  `vergoedBedrag` DECIMAL(11,2) NULL,
  PRIMARY KEY (`idPolis`, `schadeDatum`),
  INDEX `fk_Medewerker_Polis_Polis1_idx` (`idPolis` ASC) VISIBLE,
  INDEX `fk_Medewerker_Polis_Medewerker1_idx` (`idMedewerker` ASC) VISIBLE,
  CONSTRAINT `fk_Medewerker_Polis_Medewerker1` 
  FOREIGN KEY (`idMedewerker`) REFERENCES `Medewerker` (`idMedewerker`),
  CONSTRAINT `fk_Medewerker_Polis_Polis1` 
  FOREIGN KEY (`idPolis`) REFERENCES `Polis` (`idPolis`));
		
INSERT INTO schadeclaim VALUES (5,1,'2019-07-31',5000.00,4139.23),(5,1,'2020-04-15',10000.00,8000.00),(3,2,'2018-07-31',11500.00,10000.00),(4,2,'2019-11-13',30000.00,30000.00),(4,4,'2020-02-28',4500.00,4500.00),(1,5,'2019-09-16',230.00,230.75),(1,5,'2021-10-11',8853.00,NULL),(7,6,'2018-12-27',100000.00,90000.00),(7,8,'2019-06-23',500000.00,450000.00),(7,8,'2020-11-29',150000.00,150000.00),(7,8,'2021-09-30',233450.00,NULL),(8,9,'2019-07-17',675000.00,345980.00),(8,9,'2020-06-18',450000.00,450000.00);

