# 📘 4. Functies in Java – Uitleg & Voorbeelden

---

## 🔹 Wat zijn functies?

- Een **functie** (ook wel methode genoemd) is een **stukje herbruikbare code** dat een bepaalde taak uitvoert.
- Voordelen:
    - **Herbruikbaarheid**: schrijf code één keer, gebruik meerdere keren.
    - **Overzichtelijkheid**: maakt je code leesbaar en georganiseerd.
    - **Modulariteit**: code opdelen in kleine logische blokken.

### 🧠 Voorbeeldconcept:
```
"Een recept voor pannenkoeken is als een functie: als je het volgt, krijg je steeds hetzelfde resultaat."
```

---

## 🔹 Functies definiëren in Java

- Een functie wordt **gedefinieerd** met een bepaalde structuur:

### 📌 Structuur:
```java
[retourtype] [functienaam]( [parameters] ) {
    // codeblok
}
```

### 📌 Voorbeeld:
```java
public static void zegHallo() {
    System.out.println("Hallo wereld!");
}
```

- `void` betekent dat de functie **niets teruggeeft**.

---

## 🔹 Functies oproepen in Java

- Om een functie uit te voeren, moet je haar **aanroepen (callen)**:

### 📌 Voorbeeld:
```java
zegHallo();  // Roept de functie aan
```

- De functie moet wel **zichtbaar zijn in dezelfde klasse**, of je moet een object maken.

---

## 🔹 Parameters in Java

- Een functie kan **parameters** accepteren: stukjes info die je meegeeft.

### 📌 Voorbeeld:
```java
public static void zegNaam(String naam) {
    System.out.println("Hallo " + naam + "!");
}

zegNaam("Burhan"); // Output: Hallo Burhan!
```

### 🧠 Belangrijk:
- Meerdere parameters scheid je met komma’s.
- Let op het **datatype**: `int`, `String`, `double`, enz.

---

## 🔹 Retourtypen in Java

- Functies kunnen **waarden teruggeven** met `return`.

### 📌 Structuur:
```java
public static int telOp(int a, int b) {
    return a + b;
}
```

### 📌 Gebruik:
```java
int resultaat = telOp(3, 5);
System.out.println(resultaat); // 8
```

### 🧠 Belangrijk:
- Gebruik `return` om een waarde terug te geven.
- Het **type** van `return` moet overeenkomen met het retourtype van de methode.

---

## 🔹 Ingebouwde functies in Java gebruiken

Java heeft veel **standaard ingebouwde functies** in zijn bibliotheken.

### 📌 Voorbeelden:
```java
String tekst = "Hallo";
System.out.println(tekst.length());   // lengte van string

int getal = Math.max(10, 25);         // hoogste van twee getallen

double wortel = Math.sqrt(16);        // vierkantswortel
```

### 🧠 Veelgebruikte klassen:
- `Math` → wiskundige functies
- `String` → tekstmanipulatie
- `Arrays`, `Collections` → lijsten en arrays bewerken
- `Scanner` → input van de gebruiker

---

## ✅ Samenvatting

| Onderdeel           | Belangrijk                                                  |
|---------------------|-------------------------------------------------------------|
| Definitie           | `public static void naam() { ... }`                         |
| Aanroepen           | `naam();`                                                   |
| Parameters          | `functie(String naam)`                                      |
| Retourtype          | `int`, `String`, `boolean`, etc. + `return`-statement       |
| Ingebouwde functies | Bijvoorbeeld: `Math.max()`, `String.length()`, `Math.sqrt()`|

---
# 📘 De `Math` Klasse in Java – Uitleg & Voorbeelden

---

## 🔹 Wat is de `Math` klasse?

- De `Math` klasse in Java is onderdeel van `java.lang` package en biedt **wiskundige methodes**.
- Je hoeft de klasse **niet te importeren**, want hij is standaard beschikbaar.
- Alle methodes zijn **`static`**, je roept ze aan via `Math.` zonder object aan te maken.

---

## 🔹 Belangrijkste methodes in `Math`

---

### ✅ `Math.max(x, y)`
Geeft de **grootste waarde** terug van twee getallen.

```java
int grootste = Math.max(12, 7);  // Output: 12
```

---

### ✅ `Math.min(x, y)`
Geeft de **kleinste waarde** terug van twee getallen.

```java
int kleinste = Math.min(4, 9);  // Output: 4
```

---

### ✅ `Math.abs(x)`
Geeft de **absolute waarde** van een getal (positieve versie).

```java
int verschil = Math.abs(-15);  // Output: 15
```

---

### ✅ `Math.pow(basis, exponent)`
**Machtsverheffing**: basis tot de macht exponent.

```java
double macht = Math.pow(2, 3);  // Output: 8.0
```

---

### ✅ `Math.sqrt(x)`
Geeft de **vierkantswortel** van een getal.

```java
double wortel = Math.sqrt(25);  // Output: 5.0
```

---

### ✅ `Math.round(x)`
**Afronden** naar het dichtstbijzijnde gehele getal.

```java
long afgerond = Math.round(3.6);  // Output: 4
```

---

### ✅ `Math.floor(x)`
Afronden **naar beneden** (laagste gehele getal).

```java
double vloer = Math.floor(5.9);  // Output: 5.0
```

---

### ✅ `Math.ceil(x)`
Afronden **naar boven** (hoogste gehele getal).

```java
double plafond = Math.ceil(5.1);  // Output: 6.0
```

---

### ✅ `Math.random()`
Geeft een **willekeurig getal tussen 0.0 en 1.0 (exclusief 1.0)**

```java
double willekeurig = Math.random();  // Bijvoorbeeld: 0.583
```

🔁 Combineer met casting en rekenwerk om bv. 1 t/m 10 te krijgen:

```java
int getal = (int) (Math.random() * 10) + 1;
```

---

## ✅ Samenvatting – Populaire Math-methodes

| Methode             | Beschrijving                                | Voorbeeld              |
|---------------------|---------------------------------------------|------------------------|
| `Math.max(x, y)`    | Grootste waarde                             | `Math.max(10, 20)`     |
| `Math.min(x, y)`    | Kleinste waarde                             | `Math.min(3, 7)`       |
| `Math.abs(x)`       | Absolute waarde                             | `Math.abs(-5)`         |
| `Math.pow(x, y)`    | Machtverheffing                             | `Math.pow(2, 3)`       |
| `Math.sqrt(x)`      | Vierkantswortel                             | `Math.sqrt(16)`        |
| `Math.round(x)`     | Afronden                                    | `Math.round(4.5)`      |
| `Math.floor(x)`     | Afronden naar beneden                       | `Math.floor(4.9)`      |
| `Math.ceil(x)`      | Afronden naar boven                         | `Math.ceil(4.1)`       |
| `Math.random()`     | Willekeurig getal tussen 0.0 en 1.0         | `Math.random()`        |

---

## 🧠 Extra Tips

- Je kunt `Math.random()` combineren met `Math.floor()` of casting naar `int` voor games of keuzes:
```java
int dobbelsteen = (int)(Math.random() * 6) + 1;  // Getal tussen 1 en 6
```

- De `Math` klasse werkt **alleen met primitieve types** zoals `int`, `double`, `float`.

---

## ✅ Oefening:

👉 **Vraag aan gebruiker twee getallen** en geef:
1. Hun som
2. Hun maximum
3. Het absolute verschil
4. Een willekeurig getal tussen hen in

```java
import java.util.Scanner;

public class MathOefening {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Geef het eerste getal: ");
        int a = input.nextInt();

        System.out.print("Geef het tweede getal: ");
        int b = input.nextInt();

        System.out.println("Som: " + (a + b));
        System.out.println("Grootste: " + Math.max(a, b));
        System.out.println("Verschil: " + Math.abs(a - b));
        int random = (int) (Math.random() * (Math.max(a, b) - Math.min(a, b) + 1)) + Math.min(a, b);
        System.out.println("Willekeurig getal tussen de twee: " + random);

        input.close();
    }
}
```

---
