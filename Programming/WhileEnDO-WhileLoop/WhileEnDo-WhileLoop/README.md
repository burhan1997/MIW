## 🔁 `while` en `do-while` Lussen – Belangrijke Vergelijking

| Kenmerk                     | `while` Lus                                     | `do-while` Lus                                     |
|-----------------------------|--------------------------------------------------|----------------------------------------------------|
| Controlemoment             | Voor de lus begint                              | Na het uitvoeren van het codeblok                 |
| Wordt de lus minimaal één keer uitgevoerd? | **Nee**, als de voorwaarde onwaar is, wordt het niet uitgevoerd | **Ja**, zelfs als de voorwaarde onwaar is, wordt het één keer uitgevoerd |
| Algemeen gebruiksdoel      | Uitvoeren zolang de voorwaarde waar is, **vooraf controle** | Wanneer de code ten minste één keer moet draaien, **achteraf controle** |
| Syntax                     | `while (voorwaarde) { ... }`                     | `do { ... } while (voorwaarde);`                   |

---

## 🧠 Verschillen en Gebruiksvoorbeelden

### ✅ `while` Lus – Vooraf Gecontroleerde Lus

```java
int i = 0;

while (i < 5) {
    System.out.println("i: " + i);
    i++;
}
```

🔹 **De voorwaarde wordt eerst gecontroleerd**. Als `i < 5` vanaf het begin onwaar is, wordt de lus **niet uitgevoerd**.

---

### ✅ `do-while` Lus – Achteraf Gecontroleerde Lus

```java
int i = 0;

do {
    System.out.println("i: " + i);
    i++;
} while (i < 5);
```

🔹 **Het codeblok wordt minstens één keer uitgevoerd**, daarna wordt de voorwaarde gecontroleerd. Dus zelfs als `i < 5` onwaar is, wordt het **één keer uitgevoerd**.

---

## ⚠️ Wanneer Welke Gebruiken?

| Situatie                                                        | Geschikte Lus     |
|------------------------------------------------------------------|-------------------|
| Als de gebruiker ten minste één invoer moet doen                | `do-while`        |
| Als de bewerking afhankelijk is van een voorwaarde              | `while`           |
| Menu-gebaseerde gebruikersinterfaces (meestal `do-while`)       | `do-while`        |
| Om een oneindige lus te creëren (`while(true)`)                 | `while`           |

---

## 💡 Tips

- Vergeet niet de **lusvariabele van tevoren te initialiseren**.
- Vergeet niet de **`;` (puntkomma)** aan het einde van `do-while`.
  ```java
  } while (voorwaarde); // ← belangrijk!
  ```
- Zowel `break` als `continue` werken in beide lussen.
- Zorg ervoor dat de acties binnen de lus de voorwaarde **beïnvloeden**, anders krijg je een oneindige lus.

---

## 🔄 Voorbeeld van Oneindige Lus

```java
while (true) {
    // oneindige lus
}
```

```java
do {
    // oneindige lus
} while (true);
```

---

## 📌 Voorbeeld: Vraag een getal tussen 1 en 10 aan de gebruiker

### Met `while`:

```java
Scanner scanner = new Scanner(System.in);
int num;

System.out.print("Voer een getal in tussen 1 en 10: ");
num = scanner.nextInt();

while (num < 1 || num > 10) {
    System.out.print("Ongeldig! Probeer opnieuw: ");
    num = scanner.nextInt();
}
```

### Met `do-while`:

```java
Scanner scanner = new Scanner(System.in);
int num;

do {
    System.out.print("Voer een getal in tussen 1 en 10: ");
    num = scanner.nextInt();
} while (num < 1 || num > 10);
```

