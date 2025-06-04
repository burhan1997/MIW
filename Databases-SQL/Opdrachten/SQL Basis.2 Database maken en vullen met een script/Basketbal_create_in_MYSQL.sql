CREATE SCHEMA Basketbal;


CREATE TABLE Basketbal.Boete
(
  betalingnummer smallint NOT NULL,
  lidnummer smallint,
  boetetype varchar(1),
  datumovertreding date,
  bedrag decimal(5,2),
  CONSTRAINT boete_pkey PRIMARY KEY (betalingnummer)
);

CREATE TABLE Basketbal.Lid
(
  lidnr smallint NOT NULL,
  achternaam varchar(25) NOT NULL,
  voorletters varchar(6) NOT NULL,
  tussenvoegsel varchar(7),
  geb_datum date NOT NULL,
  geslacht varchar(1) NOT NULL,
  jaartoe smallint NOT NULL,
  straat varchar(50) NOT NULL,
  huisnr varchar(4) NOT NULL,
  toevoeging varchar(4),
  postcode varchar(7),
  woonplaats varchar(50) NOT NULL,
  telefoon varchar(15),
  emailadres varchar(50),
  speelt_in varchar(10),
  bank varchar(10),
  CONSTRAINT lid_pkey PRIMARY KEY (lidnr)
);

CREATE TABLE Basketbal.Sporthal
(
  sporthalnaam varchar(25) NOT NULL,
  sporthalplaats varchar(25),
  aantalvelden smallint,
  CONSTRAINT sporthal_pkey PRIMARY KEY (sporthalnaam)
);

CREATE TABLE Basketbal.Team
(
  klasse varchar(8) NOT NULL,
  teamcode varchar(10) NOT NULL,
  teamnaam varchar(50),
  thuishal varchar(25),
  aanvoerder smallint,
  CONSTRAINT team_pkey PRIMARY KEY (teamcode)
);


CREATE TABLE Basketbal.Wedstrijd
(
  datum date,
  tijd time,
  veld smallint,
  teamthuis character(6) NOT NULL,
  klasse character(8) NOT NULL,
  teamuit character(6) NOT NULL,
  scorethuis int NOT NULL,
  scoreuit int NOT NULL,
  CONSTRAINT wedstrijd_pkey PRIMARY KEY (teamthuis, teamuit)
)