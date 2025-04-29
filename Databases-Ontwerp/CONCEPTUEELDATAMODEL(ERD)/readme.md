# 📦 Conceptueel Datamodel – Pizzabezorging (ERD)

Dit project bevat een conceptueel datamodel (ERD) voor een pizzabezorgingsbedrijf. Het ERD is een representatie van de werkelijkheid, gezien vanuit de gebruiker, en dient als blauwdruk voor het ontwerp van een relationele database.

## 🔍 Wat is een ERD?

Een **Entity Relationship Diagram (ERD)** toont:
- De **entiteiten** (tabelstructuren),
- De **relaties** tussen deze entiteiten,
- De **kardinaliteiten** (bijvoorbeeld 1-op-veel, veel-op-veel),
- De optionele of verplichte aard van relaties,
- En de **primaire sleutels** van elke entiteit.

## 🎯 Doelstellingen

- Correcte weergave van informatiebehoeften van het bedrijf
- Integriteit en consistentie van het model
- Vermijden van redundantie (dubbele data)
- Gebruik als basis voor de technische implementatie in een databasesysteem

---

## 🧱 Entiteiten & Attributen

| Entiteit    | Attributen                                                                 |
|-------------|-----------------------------------------------------------------------------|
| Vestiging   | `vestiging_id` _(PK)_, naam, adres                                          |
| Voertuig    | `voertuig_id` _(PK)_, type, kenteken, vestiging_id _(FK)_                  |
| Bezorger    | `bezorger_id` _(PK)_, naam, telefoonnummer                                  |
| BezorgerVestiging _(tussenentiteit)_ | `bezorger_id` _(PK, FK)_, `vestiging_id` _(PK, FK)_       |

> _Opmerking_: De entiteit **BezorgerVestiging** is toegevoegd om de **veel-op-veel relatie** tussen bezorger en vestiging correct te modelleren.

---

## 🔗 Relaties en Kardinaliteit

### 1️⃣ **Vestiging – Voertuig** (1-op-veel)

- Een **vestiging** bezit **0 of meer voertuigen** (optioneel).
- Een **voertuig** hoort bij **precies 1 vestiging** (verplicht).

**Relatiebeschrijving**: _Een voertuig is in bezit van een vestiging._

### 2️⃣ **Vestiging – Bezorger** (veel-op-veel)

- Een **bezorger** werkt op **1 of meer vestigingen**.
- Op een **vestiging** werken **1 of meer bezorgers**.

**Relatiebeschrijving**: _Een bezorger werkt bij een vestiging._

> Deze relatie vereist een **tussenentiteit** (BezorgerVestiging) met combinaties van `bezorger_id` en `vestiging_id`.

---

## 🧭 Voorbeeldzinnen voor relaties

| Entiteit A → Entiteit B                         | Kardinaliteit         |
|--------------------------------------------------|------------------------|
| Een bezorger werkt op **1 of meer** vestigingen | verplicht, veel        |
| Een vestiging heeft **1 of meer** bezorgers     | verplicht, veel        |
| Een vestiging bezit **0 of meer** voertuigen    | optioneel, veel        |
| Een voertuig hoort bij **precies 1** vestiging  | verplicht, enkelvoudig |

---

## 📝 Belangrijke Begrippen

- **Entiteit**: Object, plaats, persoon of gebeurtenis waarvan je data wilt opslaan.
- **Attribuut**: Eigenschap van een entiteit (zoals naam, telefoonnummer).
- **Primaire sleutel**: Unieke identificatie voor een rij in een tabel.
- **Relatie**: Verband tussen twee entiteiten.
- **Kardinaliteit**: Aantal keer dat een instantie van een entiteit met een andere entiteit mag/moet voorkomen (bijv. 0, 1, of veel).

---

## ⚙️ Modelvereisten

- **Integriteit**: De structuur moet kloppen met de werkelijkheid.
- **Geen redundantie**: Informatie mag maar op één plaats worden opgeslagen.
- **Consistentie**: Geen tegenstrijdigheden in het model.

---

## 🧪 Stappenplan voor het maken van een ERD

1. 📌 **Identificeer relevante situaties** (de werkelijkheid).
2. 🗣️ **Beschrijf in natuurlijke taal** de relaties.
3. 🧱 **Bepaal entiteittypes** (tabellen).
4. 🔐 **Bepaal attributen** en **primaire sleutels**.
5. 🔄 **Bepaal relaties en kardinaliteiten**.
6. ✅ **Controleer en verbeter** waar nodig.

---

## 💡 Extra voorbeelden

### Medewerker – Auto (1-op-1)
- Een medewerker leaset **0 of 1** auto.
- Een auto wordt geleaset door **precies 1** medewerker.

### Medewerker – Project (veel-op-veel)
- Een medewerker werkt op **0 of meer projecten**.
- Een project heeft **0 of meer medewerkers**.

---


## Entiteiten en Attributen

### 🔶 Entiteitstypes:
- **Objecten**: zoals `Voertuig`
- **Personen**: zoals `Bezorger`
- **Plaatsen**: zoals `Vestiging`
- **Gebeurtenissen**: zoals `Bestelling`


## Relaties en Kardinaliteit

Een relatie beschrijft de verbinding tussen twee entiteiten. Voor iedere relatie definieer je de **kardinaliteit**: het aantal keren dat een entiteit aan een andere gekoppeld is.

### 🔁 Soorten relaties:
| Relatievorm        | Beschrijving                                           | Voorbeeld                       |
|--------------------|--------------------------------------------------------|---------------------------------|
| 1-op-1 (1:1)       | Eén entiteit hoort bij maximaal één andere             | Medewerker ↔ Leasefiets         |
| 1-op-veel (1:n)    | Eén entiteit hoort bij meerdere anderen                | Vestiging → Voertuigen          |
| Veel-op-veel (n:m) | Meerdere entiteiten kunnen bij meerdere anderen horen | Bezorger ↔ Vestiging            |

### ♾ Kardinaliteitssymbolen:
- **Minimale kardinaliteit**:
    - `0`: optioneel (weergegeven met een cirkel)
    - `1`: verplicht (weergegeven met een streep)
- **Maximale kardinaliteit**:
    - `1`: precies één
    - `n`: meerdere (weergegeven met kraaienpoot)

### 🧠 Voorbeeldzinnen:

**Relatie: Vestiging ↔ Voertuig**
- Een vestiging bezit *0 of meer* voertuigen.
- Een voertuig hoort bij *precies 1* vestiging.  
  ➡️ Relatie: **1-op-veel**

**Relatie: Bezorger ↔ Vestiging**
- Een bezorger werkt bij *1 of meer* vestigingen.
- Op een vestiging werken *1 of meer* bezorgers.  
  ➡️ Relatie: **veel-op-veel**

**Relatie: Medewerker ↔ Auto**
- Een medewerker leaset *0 of 1* auto (optioneel).
- Een auto wordt geleaset door *precies 1* medewerker (verplicht).  
  ➡️ Relatie: **1-op-1**

---

- Een **vestiging** heeft *0 of meer voertuigen* (optioneel).
- Een **voertuig** hoort bij *precies 1 vestiging* (verplicht).
- Een **bezorger** werkt bij *1 of meer vestigingen* (verplicht).
- Een **vestiging** heeft *1 of meer bezorgers* (verplicht).

---

## Belangrijke Aandachtspunten

✅ **Integriteit**: De structuur moet overeenkomen met de werkelijkheid en bedrijfsregels.  
✅ **Geen Redundantie**: Elk gegeven komt maar één keer voor.  
✅ **Consistentie**: Geen tegenstrijdige informatie.  
✅ **Relatiebeschrijvingen**: Altijd in twee zinnen vanuit elk entiteitstype.  
✅ **Kardinaliteit correct toepassen**: Zowel optioneel/verplicht als maximum aantal.

---

## 📌 Stappenplan voor het maken van een ERD

1. Selecteer relevante voorbeelden uit de werkelijkheid
2. Beschrijf ze in natuurlijke taal
3. Bepaal de entiteittypes
4. Bepaal attributen en identifiers (primaire sleutels)
5. Bepaal relaties en kardinaliteit
6. Controleer het model grondig

---