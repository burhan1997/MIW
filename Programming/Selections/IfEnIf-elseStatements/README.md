# 📘 Java SELECTIONS – Belangrijke Notities & Voorbeelden

---

## 3.1 ✅ Booleans

### 🔹 Wat is een boolean?
- Een datatype dat maar twee waarden kan hebben: `true` of `false`.

### 🔹 Waarom belangrijk?
- Wordt gebruikt om beslissingen te maken (if-statements).
- Basis voor logica in programma’s.

### 🧠 Belangrijk om te onthouden:
- Booleans zijn **geen Strings**. `true` ≠ `"true"`
- Je gebruikt booleans vaak met **vergelijkingsoperatoren** (`==`, `>=`, `!=`, enz.).

### 📌 Voorbeeld:
```java
boolean isVolwassen = (leeftijd >= 18);
```

---

## 3.2 ✅ If en if-else statements

### 🔹 Wat is een if-statement?
- Een manier om te zeggen: **"als iets waar is, doe dan dit."**

### 🔹 Wat doet else?
- Else wordt uitgevoerd **als de if-conditie niet waar is**.

### 🧠 Belangrijk om te onthouden:
- De conditie tussen `()` moet een **boolean zijn**.
- Je kunt meerdere regels tussen `{}` zetten.
- Zonder `{}`, voert hij maar **één regel** uit.

### 📌 Voorbeeld:
```java
if (leeftijd >= 18) {
    System.out.println("Je mag stemmen!");
} else {
    System.out.println("Je bent te jong.");
}
```

---

## 3.3 ✅ Geneste if-else statements

### 🔹 Wat betekent genest?
- Een `if`-statement **in een andere** `if` of `else`.

### 🔹 Wanneer gebruiken?
- Als je meerdere voorwaarden **achter elkaar** wilt controleren.

### 🧠 Belangrijk om te onthouden:
- Zorg dat je **duidelijke inspringing** (indentatie) gebruikt.
- Geneste statements kunnen snel onduidelijk worden → leesbaarheid is belangrijk!

### 📌 Voorbeeld:
```java
if (leeftijd >= 18) {
    if (heeftID) {
        System.out.println("Welkom!");
    } else {
        System.out.println("Toon je ID.");
    }
}
```

---

## 3.4 ✅ Logische operatoren

### 🔹 Overzicht:

| Operator | Betekenis        | Voorbeeld                        |
|----------|------------------|----------------------------------|
| `&&`     | EN (beide waar)  | `leeftijd >= 18 && heeftID`     |
| `||`     | OF (één waar)    | `leeftijd < 16 || geenID`       |
| `!`      | NIET (omkeren)   | `!heeftID` = heeft **geen** ID  |

### 🧠 Belangrijk om te onthouden:
- `&&` is **allebei moet waar zijn**
- `||` is **één van de twee is genoeg**
- `!` keert een boolean om: `!true` = `false`

### 📌 Voorbeeld:
```java
if (leeftijd >= 18 && heeftID) {
    System.out.println("Toegang toegestaan.");
}
```

---

## 3.5 ✅ Strings vergelijken

### 🔹 Waarom speciaal?
- Strings zijn **objecten**, niet simpele waardes.
- Je gebruikt `equals()` om **inhoud** te vergelijken, niet `==`.

### 🔹 Veelgemaakte fout:
```java
if (naam == "Burhan") // ❌ Fout
```

### 🔹 Correct:
```java
if (naam.equals("Burhan")) // ✅ Goed
```

### 🧠 Belangrijk om te onthouden:
- Gebruik `trim()` om spaties aan begin/eind te verwijderen.
- Gebruik `equalsIgnoreCase()` als hoofdletters niet uitmaken.

### 📌 Voorbeeld:
```java
if (naam.trim().equalsIgnoreCase("burhan")) {
    System.out.println("Welkom!");
}
```

---

## 3.6 ✅ Switch-statements

### 🔹 Waarom gebruiken?
- Als je **veel if-else** gebruikt voor 1 variabele → beter leesbaar met `switch`.

### 🔹 Hoe werkt het?
- `switch` kijkt naar een waarde, en kiest de juiste `case`.

### 🧠 Belangrijk om te onthouden:
- Elke `case` eindigt meestal met `break` → voorkomt doorlopen.
- `default` is optioneel maar handig als vangnet.

### 📌 Voorbeeld:
```java
int dag = 5;

switch (dag) {
    case 1: System.out.println("Maandag"); break;
    case 2: System.out.println("Dinsdag"); break;
    case 3: System.out.println("Woensdag"); break;
    case 4: System.out.println("Donderdag"); break;
    case 5: System.out.println("Vrijdag"); break;
    case 6: System.out.println("Zaterdag"); break;
    case 7: System.out.println("Zondag"); break;
    default: System.out.println("Onbekende dag");
}
```

