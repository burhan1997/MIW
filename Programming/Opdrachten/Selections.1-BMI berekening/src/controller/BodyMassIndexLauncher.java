package controller;

import java.util.Scanner;

/**
 * BodyMassIndexLauncher
 *
 * Auteur: Burhan Elaldi
 * Doel: Deze applicatie berekent de Body Mass Index (BMI) van een persoon
 * op basis van lengte in centimeters en gewicht in kilogram.
 * Vervolgens geeft het een gepast advies op basis van de uitkomst.
 */
public class BodyMassIndexLauncher {
    public static void main(String[] args) {
        // BMI-drempels als constanten
        final double ONDERGEWICHT_LIMIET = 18.4;
        final double NORMAAL_GEWICHT_LIMIET = 24.9;
        final double OVERGEWICHT_LIMIET = 29.9;
        final double OBESITAS_LIMIET = 34.9;
        final double ERNSTIGE_OBESITAS_LIMIET = 39.9;

        Scanner input = new Scanner(System.in);

        // Input van de gebruiker
        System.out.print("Wat is jouw lengte in centimeters? ");
        int lengteInCentimeter = input.nextInt();

        System.out.print("Wat is jouw gewicht in kilogram? ");
        double gewichtInKilogram = input.nextDouble();

        // Omzetten van lengte naar meters
        double lengteInMeter = lengteInCentimeter / 100.0;

        // BMI berekenen
        double bmi = gewichtInKilogram / (lengteInMeter * lengteInMeter);

        // Resultaat tonen
        System.out.println("Jouw BMI is: " + bmi);

        // Advies geven op basis van de BMI-waarde
        if (bmi < ONDERGEWICHT_LIMIET) {
            System.out.println("Je hebt ondergewicht. Het is belangrijk om met een arts of diëtist te praten.");
        } else if (bmi < NORMAAL_GEWICHT_LIMIET) {
            System.out.println("Je bent goed op gewicht. Ga zo door!");
        } else if (bmi < OVERGEWICHT_LIMIET) {
            System.out.println("Je hebt overgewicht. Probeer gezond te eten en voldoende te bewegen.");
        } else if (bmi < OBESITAS_LIMIET) {
            System.out.println("Je hebt obesitas. Het is verstandig om medische hulp te zoeken.");
        } else if (bmi < ERNSTIGE_OBESITAS_LIMIET) {
            System.out.println("Je hebt ernstige obesitas. Neem contact op met een arts voor advies.");
        } else {
            System.out.println("Je hebt morbide obesitas. Professionele hulp is sterk aanbevolen.");
        }

        input.close(); // Scanner netjes afsluiten
    }
}
