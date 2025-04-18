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