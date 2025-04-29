# Inleiding tot Databases

## 3.1 Introductie
- Net als in de cursus *Programming* wordt er verwezen naar instructievideo’s op LinkedIn Learning. Je kunt inloggen met je HvA e-mailadres.
- We gebruiken het materiaal uit de cursus *Programming Foundations: Databases*.
- Bekijk de volgende video’s:
    1. Why use a database
    2. What you should know
    3. Understanding databases: Benefits of spreadsheets
    4. Understanding databases: Benefits of structured data

## 3.2 Data versus Informatie
- Een database is een georganiseerde verzameling van ‘ruwe’ data.
- Pas met context wordt data informatie.
- Data worden logisch gegroepeerd in tabellen met rijen en kolommen.

## 3.3 Hoe ontstaan databases?
### Stappen naar een geïmplementeerde database:
1. Informatiebehoefte wordt vastgesteld.
2. Bepalen welke gegevens nodig zijn.
3. Structurering in entiteiten en relaties → ERD (Entiteit-Relatie Diagram).
4. Ontwerp van logische database (tabellen, primaire sleutels, tussentabellen).
5. Implementatie in een DBMS (Database Management System).

### Terminologie:
| Engels               | Nederlands              |
|----------------------|--------------------------|
| Relation             | Relatie                  |
| Primary Key          | Primaire sleutel         |
| Candidate Key        | Kandidaatsleutel         |
| Composite Key        | Samengestelde sleutel    |
| Surrogate Key        | Surrogaatsleutel         |
| Foreign Key          | Vreemde sleutel          |
| Referential Integrity| Referentiële integriteit |
| Functional Dependency| Functionele afhankelijkheid |
| Determinant          | Determinant              |
| Normal Form          | Normaalvorm              |

## 3.4 Voorbeeld: Pizzabezorging
- Ongestructureerde spreadsheets zorgen voor verwarring en fouten.
- Redundantie en inconsistentie zijn risico’s.
- Ontwerpen van gestructureerde tabellen (bijv. Vestiging, Bezorger, Voertuig).
- ERD kan helpen relaties te expliciteren.

## 3.5 Primaire Sleutels
- Een primaire sleutel identificeert een rij uniek.
- Voorbeelden: klantnummer, BSN, ISBN.
- Sleutels moeten uniek én verplicht zijn (uniciteits- en totaliteitsregel).
- Gebruik geen gegevens als naam of soort als sleutel, want deze kunnen dubbel voorkomen of wijzigen.

## 3.6 Primaire Sleutels bij Pizzabezorging
- Gebruik codes of nummers als identificerende kolommen.
- Vermijd vage identificatie zoals naam of plaats.
- Sleutels moeten toekomstbestendig zijn: houd rekening met mogelijke dubbele waarden in de toekomst.

## 3.7 Samengestelde, Kandidaats- en Surrogaatsleutels
- **Samengestelde sleutel**: combinatie van twee of meer kolommen (bijv. postcode + huisnummer).
- **Kandidaatsleutel**: kolom of combinatie die in aanmerking komt als primaire sleutel.
- **Surrogaatsleutel**: kunstmatig gegenereerde sleutel (bijv. ID).

---

## Extra toelichting (toegevoegd):
- **Relationele databases** werken met tabellen die onderling verbonden zijn via sleutels.
- **Normalisatie** is het proces waarbij je tabellen zodanig inricht dat redundantie wordt vermeden en integriteit behouden blijft.
- **Referentiële integriteit** betekent dat relaties tussen tabellen kloppen: een vreemde sleutel moet verwijzen naar een bestaande primaire sleutel.
- **Praktisch belang**: databases worden gebruikt in bijna elk informatiesysteem – van webshops tot ziekenhuizen – voor het veilig en efficiënt opslaan van informatie.

> Tip: Denk bij het ontwerpen altijd aan de **toekomst**. Data groeit, verandert, en systemen worden complexer. Ontwerp daarom robuust, schaalbaar en logisch.

