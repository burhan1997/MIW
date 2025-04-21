---

# 📄 README - For Loops en Output Formatteren (Java)

---

## 🔁 6.1 For Loop (Herhalende structuur)

### 🔹 Wat is een for-loop?
Een **for-loop** gebruik je wanneer je een stuk code een **vast aantal keren** wilt uitvoeren. Bijvoorbeeld: 300 keer een strafregel schrijven.

**Structuur:**
```java
for (initialisatie; voorwaarde; update) {
    // herhalende code
}
```

### 🔹 Voorbeelden:

#### ✅ 1. Strafregels printen
```java
final int AANTAL = 300;
for (int getal = 0; getal < AANTAL; getal++) {
    System.out.println("Ik mag niet spieken");
}
```

#### 🔽 2. Aftellen van 10 naar 1
```java
for (int getal = 10; getal > 0; getal--) {
    System.out.println(getal);
}
```

#### ➕ 3. Oneven getallen onder de 20 printen
```java
for (int getal = 1; getal < 20; getal += 2) {
    System.out.println(getal);
}
```

---

## 👨‍📈 6.2 Output Formatteren

### 🔹 Strings en variabelen combineren
Een manier om meerdere stukken tekst en variabelen samen te voegen:
```java
String voornaam = "Kees";
String achternaam = "Smit";
int leeftijd = 51;
double saldo = 12345.6789;

System.out.println("Goedemorgen " + voornaam + " " + achternaam + ", je leeftijd is " + leeftijd + " en je saldo is " + saldo);
```

### 🔹 Gebruik van `printf()` voor nettere output
Met `printf()` kun je de output formatteren op een overzichtelijke manier:

```java
System.out.printf("Goedemorgen %s %s, je leeftijd is %d en je saldo is %f\n", voornaam, achternaam, leeftijd, saldo);
```

#### Veelgebruikte format specifiers:
- `%s` → string
- `%d` → geheel getal (integer)
- `%f` → kommagetal (float of double)

### 📊 Output in tabelvorm

Met breedtespecificaties kun je kolommen maken:

```java
System.out.printf("%-9s %-11s %9s %10s\n", "voornaam", "achternaam", "leeftijd", "saldo");
System.out.printf("%-9s %-11s %9d %10.2f\n", voornaam, achternaam, leeftijd, saldo);
```

#### Betekenis:
- `%-9s`: string, links uitgelijnd, 9 tekens breed
- `%9d`: integer, rechts uitgelijnd, 9 tekens breed
- `%10.2f`: double, 10 tekens breed, 2 decimalen

---

🧠 **Samengevat:**
- Gebruik `for-loops` om herhaling te structureren.
- Gebruik `printf()` voor duidelijke, tabellaire en geformatteerde uitvoer.

