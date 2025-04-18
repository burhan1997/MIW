# 📘 Java Introductie – Kritieke Punten

## 1. Introductie Java

### 1.1 Wat is Java?
- Bekijk de video **"What is Java?"** op [LinkedIn Learning](https://www.linkedin.com/learning/).
- Java is een objectgeoriënteerde programmeertaal.
- Java wordt gebruikt voor desktop-, web- en mobiele applicaties.
### 1.2. Packages en Classes
- Een package is een manier om classes logisch te organiseren.
- Het helpt bij het voorkomen van naamconflicten en maakt code beter beheersbaar.
- Een package wordt gebruikt om de verschillende klassen te structureren.
- De conventie is dat we de naam van een package met kleine letters schrijven (pas op, want Java is hoofdlettergevoelig, dus `controller`, `Controller` en `CONTROLLER` zijn drie verschillende dingen).

- **Toelichting**: Klassen in Java beginnen altijd met een hoofdletter en eventuele volgende delen, die een zelfstandig woord bevatten ook. Dit wordt **CamelCase** genoemd (zie ook Liang 2.8).
### 1.2.1 Wat zijn Classes?
- Bekijk de video **"Classes and Objects in Java"** op [LinkedIn Learning](https://www.linkedin.com/learning/).
- Een *class* is een blauwdruk voor objecten.
- Een class bevat velden (attributen) en methoden (functies).

#### Voorbeeld:
```java
public class Hond {
    String naam;
    int leeftijd;

    public void blaf() {
        System.out.println("Woef!");
    }
}
```

### 1.2.2 Wat zijn Objecten?
- Een object is een instantie van een class.

#### Voorbeeld:
```java
public class Main {
    public static void main(String[] args) {
        Hond mijnHond = new Hond();
        mijnHond.naam = "Max";
        mijnHond.leeftijd = 3;
        mijnHond.blaf();
    }
}
```

### 1.2.3 Wat zijn Packages?
- Bekijk de video **"Using Packages in Java"** op [LinkedIn Learning](https://www.linkedin.com/learning/).
- Een package is een manier om classes logisch te organiseren.
- Het helpt bij het voorkomen van naamconflicten en maakt code beter beheersbaar.

#### Voorbeeld:
```java
package dieren;

public class Kat {
    public void miauw() {
        System.out.println("Miauw!");
    }
}
```

- **Let op**: In 1.8 heeft Liang het over een `javac` command. Dat gebruiken we niet, we doen het zoals hierboven beschreven is met **IntelliJ**.

- **Let op**: In 1.9.2 heeft Liang het over inspringingen (indentations). **IntelliJ** regelt de inspringing voor je, standaard staat deze op vier spaties. Dit is ook de standaard binnen **MIW**. Liang gebruikt in zijn voorbeelden een inspringing van twee spaties.

## 2. VARIABELEN

### 2.1 Variabelen declareren en vullen

1. **Zet de drie regels code in comments**:
    - Dit betekent dat je de regels code als volgt van commentaar voorziet, zodat ze niet uitgevoerd worden tijdens het programma:

   ```java
   package controller;
   public class IntroductieJavaLauncher {
       public static void main(String[] args) {
           // System.out.println("Hello World!");
           // System.out.println("Programming is fun!");
           // System.out.println("Fundamentals First");
           // System.out.println("Problem Driven");
       }
   }
   ```

2. **Ga verder met Strings**:
    - Strings zijn een van de belangrijkste data types in Java. Ze worden gebruikt voor tekstuele data. Strings zijn in Java een object van de `String` class.

3. **Bekijk op LinkedIn Learning: Primitive data types**:
    - Het is belangrijk om de primitive data types in Java goed te begrijpen, zoals:
        - `int`: voor gehele getallen
        - `double`: voor kommagetallen
        - `char`: voor enkele karakters
        - `boolean`: voor waarheidswaarden (true/false)

4. **Ga verder met: Data types and variables**:
    - Variabelen in Java worden gedeclareerd met een specifiek type. Bijvoorbeeld:

      ```java
      int leeftijd = 25;
      String naam = "Burhan";
      ```

5. **Using indexes with strings**:
    - Je kunt de individuele tekens van een string benaderen door hun index:

      ```java
      String tekst = "Java";
      char letter = tekst.charAt(0); // Dit geeft 'J'
      ```

6. **Ga verder met: Concatenating strings**:
    - Strings kunnen worden samengevoegd (geconcateneerd) met behulp van de `+` operator:

      ```java
      String naam = "Burhan";
      String begroeting = "Hallo, " + naam + "!";
      System.out.println(begroeting); // Output: Hallo, Burhan!
      ```

7. **Lees Liang 2.1 en 2.2 tot aan Listing 2.1**:
    - Deze secties behandelen het gebruik van variabelen en het declareren van verschillende data types in Java. Variabelen zijn essentieel voor het opslaan van gegevens die in je programma gebruikt worden.

8. **Voer de code op regel 3 – 14 van Listing 2.1 in**:
    - De code in Listing 2.1 betreft de declaratie en initialisatie van variabelen en het gebruik ervan in methoden:

      ```java
      public class IntroductieJavaLauncher {
          public static void main(String[] args) {
              int leeftijd = 25;
              String naam = "Burhan";
              double lengte = 1.75;
              System.out.println("Mijn naam is " + naam + " en ik ben " + leeftijd + " jaar oud.");
          }
      }
      ```
    - Deze code toont hoe je variabelen kunt gebruiken in Java en hoe je ze kunt afdrukken met behulp van de `System.out.println` functie.
