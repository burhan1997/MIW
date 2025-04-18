# Invoer van de Gebruiker met de Scanner

## 1. Inleiding
De `Scanner` klasse in Java wordt gebruikt om invoer van de gebruiker te verkrijgen. Het biedt een gemakkelijke manier om gegevens van verschillende typen te lezen, zoals `int`, `double`, en `String`. Hieronder volgen enkele belangrijke overwegingen en tips voor het gebruik van de `Scanner` klasse.

## 2. Importeren van de Scanner
Bij het gebruik van `Scanner` in je Java-programma moet je de klasse importeren. Dit gebeurt meestal automatisch wanneer je begint te typen in IntelliJ.

```java
import java.util.Scanner;
```
## 3. Gebruik van de Scanner
De eerste stap is het aanmaken van een `Scanner` object. Dit object kun je gebruiken om invoer van de gebruiker te lezen. Hier is een eenvoudig voorbeeld:

```java
Scanner scanner = new Scanner(System.in);
```
Na het aanmaken van een Scanner object, kun je de volgende methoden gebruiken om verschillende typen gegevens in te voeren:
#### Voorbeeld:
```java
Scanner scanner = new Scanner(System.in);

// Invoer voor een kommagetal
System.out.print("Geef een kommagetal: ");
double eerste = scanner.nextDouble();
System.out.println("1: " + eerste);

// Invoer voor een tekst
System.out.print("Geef een tekst: ");
String tweede = scanner.nextLine();
System.out.println("2: " + tweede);

// Invoer voor een geheel getal
System.out.print("Geef een geheel getal: ");
int derde = scanner.nextInt();
System.out.println("3: " + derde);
```

## 4. Veelgemaakte Fouten bij Gebruik van de Scanner

### Fout 1: Overgebleven Enter-toets
Wanneer je een `nextDouble()` of `nextInt()` gebruikt, blijft de Enter-toets in de invoerbuffer staan, wat problemen kan veroorzaken bij het lezen van de volgende invoer.

#### Probleem:
```java
// Voer 3,14 in voor nextDouble
Geef een kommagetal: 3,14
1: 3.14
Geef een tekst: 
2: 
Geef een geheel getal:
```
### Oorzaak:
De `nextDouble()` leest alleen de waarde `3,14` en de Enter-toets blijft in de buffer. De volgende invoermethode, `nextLine()`, leest deze Enter en geeft een lege string terug.

### Oplossing:
Na het lezen van een numerieke waarde met `nextDouble()` of `nextInt()`, kun je een extra `scanner.nextLine()` gebruiken om de Enter-toets uit de buffer te verwijderen:

```java
scanner.nextLine(); // Verwijdert de Enter-toets
```
### Fout 2: Gebruik van `next()` vs. `nextLine()`
- `next()` leest de invoer tot aan de eerste spatie, terwijl `nextLine()` de gehele regel leest, inclusief spaties.

- Als een gebruiker bijvoorbeeld "Tom Poes" invoert, leest `next()` alleen "Tom" en laat "Poes" in de buffer achter.

### Oplossing:
Gebruik `next()` alleen als je een enkel woord wilt lezen. Als je een volledige zin wilt lezen, gebruik dan `nextLine()`.

### Fout 3: Probleem met Locale-instellingen bij Doubles
- Afhankelijk van de taalinstellingen van de gebruiker kan het nodig zijn om een komma of punt te gebruiken bij het invoeren van een getal.

- In sommige landen (zoals Nederland) wordt een komma gebruikt als decimale scheidingsteken (3,14).

- In andere landen (zoals de VS) wordt een punt gebruikt (3.14).

Dit kan problemen veroorzaken als de invoer niet overeenkomt met de verwachte notatie. Dit kan later worden opgelost met exception handling of door de locale-instellingen van de gebruiker aan te passen.
## 5. Opmerkingen

### Scanner Instantie
- Je hoeft maar één instantie van de `Scanner` klasse te definiëren en te gebruiken voor alle invoer. Het is een goede gewoonte om deze instantie herhaaldelijk te gebruiken in plaats van meerdere `Scanner` objecten aan te maken.

```java
Scanner scanner = new Scanner(System.in); // Maak de scanner één keer aan
```
### Gebruik van `print()` in plaats van `println()`
- Het is een goede gewoonte om `System.out.print()` te gebruiken in plaats van `System.out.println()`. Dit voorkomt dat de invoer van de gebruiker op een nieuwe regel wordt geplaatst, waardoor het er netter uitziet.

```java
System.out.print("Geef een kommagetal: "); // Gebruikt op dezelfde regel
```
### Samenvatting van Belangrijke Methodes

- **`nextLine()`**: Leest een volledige regel tekst, inclusief spaties.

- **`next()`**: Leest een enkel woord tot de eerste spatie.

- **`nextInt()`**: Leest een geheel getal (`int`).

- **`nextDouble()`**: Leest een kommagetal (`double`).

Zorg ervoor dat je begrijpt hoe deze methoden werken en de eventuele valkuilen die kunnen optreden bij het verwerken van invoer van de gebruiker.
