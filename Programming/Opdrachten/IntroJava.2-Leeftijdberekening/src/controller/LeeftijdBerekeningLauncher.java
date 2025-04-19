// Naam: Burhan Elaldi
// Doel: Een applicatie die de leeftijd van een persoon berekent aan de hand van het geboortejaar.

package controller;

import java.util.Scanner;

public class LeeftijdBerekeningLauncher {

    public static void main(String[] args) {
        // Scanner object om invoer van de gebruiker te lezen
        Scanner scanner = new Scanner(System.in);

        // Vraag om de naam van de gebruiker
        System.out.print("Hoe heet je? ");
        String naam = scanner.nextLine(); // volledige naam kan uit meerdere woorden bestaan

        // Vraag om het geboortejaar
        System.out.print("Wat is je geboortejaar? ");
        int geboorteJaar = scanner.nextInt();

        // Constante voor het huidige jaar
        final int HUIDIGJAAR = 2025;

        // Leeftijd berekenen
        int leeftijd = HUIDIGJAAR - geboorteJaar;

        // Toon het resultaat
        System.out.println("Beste " + naam + ", eind " + HUIDIGJAAR + " zal je leeftijd " + leeftijd + " zijn.");

        // Scanner sluiten
        scanner.close();
    }
}
