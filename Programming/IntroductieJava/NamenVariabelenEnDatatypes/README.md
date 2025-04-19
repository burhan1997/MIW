# Belangrijke Notities over Java Basisconcepten

## 2.4 Namen, Variabelen en Datatypes
- Een variabele is een naam die verwijst naar een geheugenlocatie waarin een waarde wordt opgeslagen.
- Elke variabele heeft een type, zoals `int`, `double`, `String`, enz.
- Voorbeeld:
  ```java
  int leeftijd = 25;
  double prijs = 19.95;
  String naam = "Burhan";
  ```
- Regels voor naamgeving:
    - Moet beginnen met een letter, `_` of `$`
    - Mag geen Java-reserved words bevatten (zoals `int`, `class`, `if`)
    - Gebruik camelCase voor variabelen (`voornaam`, `aantalStudenten`)

## 2.5 Constanten
- Een constante is een variabele waarvan de waarde niet verandert tijdens de uitvoering.
- Gebruik het sleutelwoord `final`.
- Namen van constanten worden vaak in HOOFDLETTERS geschreven.
  ```java
  final double PI = 3.14159;
  final int MAX_LEEFTIJD = 120;
  ```
- Je kunt gedeeltes van code in of uit commentaar zetten met:
    - `Ctrl + Shift + /` voor een blok (`/* ... */`)
    - `Ctrl + /` voor een enkele regel (`// ...`)

## 2.6 Naamgeving van Variabelen en Constanten
- Variabelen: gebruik kleine letters met camelCase.
    - Voorbeeld: `aantalStudenten`, `prijsPerStuk`
- Constanten: gebruik hoofdletters met underscores.
    - Voorbeeld: `MAXIMUM_SCORE`, `MIN_LEEFTIJD`

## 2.7 Numerieke Datatypes en Operatoren
- `int` is voor gehele getallen, `double` is voor kommagetallen.
- Gehele deling met twee `int`-waarden levert ook een `int` op:
  ```java
  System.out.println(5 / 2);   // Output: 2
  System.out.println(5 / 2.0); // Output: 2.5
  ```
- Integer division verliest alles na de komma (wordt niet afgerond!).
- Let op bij conversie van tijd, bijvoorbeeld:
  ```java
  int seconden = 500;
  int minuten = seconden / 60; // Output: 8
  ```
- Operatoren zoals `+`, `-`, `*`, `/`, `%` werken op numerieke types.

## 2.8 Type Casting
- Type casting converteert een waarde van het ene type naar het andere.
- Je kunt expliciet casten door `(type)` te gebruiken:
  ```java
  System.out.println((int)2.5 / 0.5);   // Output: 4.0
  System.out.println((int)(2.5 / 0.5)); // Output: 5
  ```
- Zonder haakjes is de casting alleen van toepassing op het eerste getal.

## 2.9 Strings en hun Methoden
- Strings zijn objecten die tekst representeren.
- Veelgebruikte String-methoden:
    - `length()`, `toUpperCase()`, `toLowerCase()`, `charAt()`, `substring()`
- Interessante voorbeelden:
  ```java
  System.out.println(3 + 3);       // Output: 6 (optelling)
  System.out.println("3" + "3");   // Output: 33 (stringconcatenatie)
  System.out.println("3" + 3);     // Output: 33 (3 wordt geconverteerd naar string)
  System.out.println(3 + "3");     // Output: 33
  System.out.println('3' + 3);     // Output: 54 ('3' is ASCII 51 + 3 = 54)
  ```
- `'3'` is een `char`, en `'3' + 3` rekent met ASCII-waarden.
