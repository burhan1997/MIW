
# 📚 Java Arrays (Tabellen)

Een **array** in Java is een datastructuur waarin je meerdere waarden van hetzelfde type kunt opslaan.

---

## 🧠 Wat is een Array?

Een array is een lijst van elementen die je met één variabelenaam kunt aanspreken. De elementen in een array hebben een **vaste volgorde** en een **vaste grootte** (aantal elementen).

```java
int[] getallen = new int[5];
```

---

## 🧱 Declaratie en Initialisatie

### 1️⃣ Declaratie

```java
int[] getallen;           // correcte syntax
double[] kommagetallen;
String[] namen;
```

### 2️⃣ Initialisatie

#### Directe initialisatie:
```java
int[] getallen = {1, 2, 3, 4, 5};
```

#### Met `new` en lengte:
```java
int[] getallen = new int[5];  // alle waarden zijn standaard 0
```

---

## 🔄 Elementen Toewijzen

```java
getallen[0] = 10;
getallen[1] = 20;
```

Je gebruikt **indexen** om de elementen te bereiken. De index begint bij **0**.

---

## 📤 Waarden Uitlezen

```java
System.out.println(getallen[0]); // geeft 10
```

---

## 🔁 For-lus om alle elementen te tonen

```java
for (int i = 0; i < getallen.length; i++) {
    System.out.println(i + ": " + getallen[i]);
}
```

---

## ❌ ArrayIndexOutOfBoundsException

Als je een index gebruikt die buiten de grenzen van de array ligt, krijg je een fout:

```java
int[] getallen = new int[5];
getallen[6] = 100; // FOUT! Index 6 bestaat niet
```

---

## 🔁 For-Each (Enhanced For Loop)

```java
for (int getal : getallen) {
    System.out.println(getal);
}
```

- Simpeler en leesbaarder als je alleen de waarden nodig hebt (niet de indexen).

---

## 📌 Arrays met Methoden Gebruiken

### Een methode die een array retourneert:

```java
public static int[] geefGetallen() {
    return new int[] {10, 20, 30};
}
```

### Methode die een array als parameter gebruikt:

```java
public static void printArray(int[] arr) {
    for (int getal : arr) {
        System.out.println(getal);
    }
}
```

---

## 📊 Voorbeeld: Grootste Getal in een Array

```java
public static double bepaalMaximum(double[] cijfers) {
    double max = cijfers[0];
    for (int i = 1; i < cijfers.length; i++) {
        if (cijfers[i] > max) {
            max = cijfers[i];
        }
    }
    return max;
}
```

---

## 🧠 Belangrijke Eigenschappen

| Eigenschap        | Beschrijving                              |
|-------------------|-------------------------------------------|
| Vaste grootte     | De grootte van een array kan niet worden gewijzigd. |
| Index start bij 0 | De eerste positie in een array is index 0. |
| Eén type          | Een array kan slechts één type bevatten.  |

---

## 🧪 Extra: Arrays.sort()

Gebruik de `Arrays` klasse om arrays te sorteren:

```java
import java.util.Arrays;

int[] cijfers = {4, 1, 3, 9};
Arrays.sort(cijfers); // sorteert van klein naar groot
```

---

## 📦 Tip: Multidimensionale Arrays

```java
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6}
};
```

Je kunt rijen en kolommen gebruiken. Denk aan tabellen of spelborden.

---

## ✅ Oefening Ideeën

- Vraag de gebruiker om 5 getallen en toon de som.
- Zoek het kleinste getal in een array.
- Draai de volgorde van een array om.

---

## 📚 Meer Lezen

- [Java Arrays - Official Documentation (EN)](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html)
- Zoek op "Java array oefeningen" voor praktijkvragen.

---

*Gemaakt door: Burhan Elaldi 💻*
