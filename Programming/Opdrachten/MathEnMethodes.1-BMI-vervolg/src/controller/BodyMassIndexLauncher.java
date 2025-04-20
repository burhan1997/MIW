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
    public static double berekenBMI(int mpLengte, double mpGewicht){
        double bmi;
        bmi = Math.round(mpGewicht / Math.pow(mpLengte / 100.0, 2) * 10) / 10.0;
        return bmi;
    }

    public static String bepaalCategorie(double mpBmi) {
        final double ONDERGEWICHT_LIMIET = 18.4;
        final double NORMAAL_GEWICHT_LIMIET = 24.9;
        final double OVERGEWICHT_LIMIET = 29.9;
        final double OBESITAS_LIMIET = 34.9;
        final double ERNSTIGE_OBESITAS_LIMIET = 39.9;

        if (mpBmi < ONDERGEWICHT_LIMIET) {
            return "Je hebt ondergewicht. Het is belangrijk om met een arts of diëtist te praten.";
        } else if (mpBmi < NORMAAL_GEWICHT_LIMIET) {
            return "Je bent goed op gewicht. Ga zo door!";
        } else if (mpBmi < OVERGEWICHT_LIMIET) {
            return "Je hebt overgewicht. Probeer gezond te eten en voldoende te bewegen.";
        } else if (mpBmi < OBESITAS_LIMIET) {
            return "Je hebt obesitas. Het is verstandig om medische hulp te zoeken.";
        } else if (mpBmi < ERNSTIGE_OBESITAS_LIMIET) {
            return "Je hebt ernstige obesitas. Neem contact op met een arts voor advies.";
        } else {
            return "Je hebt morbide obesitas. Professionele hulp is sterk aanbevolen.";
        }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Wat is jouw lengte in centimeters? ");
        int lengteInCentimeter = input.nextInt();

        System.out.print("Wat is jouw gewicht in kilogram? ");
        double gewichtInKilogram = input.nextDouble();

        double resultaat = berekenBMI(lengteInCentimeter, gewichtInKilogram);

        System.out.println("Jouw BMI is: " + resultaat);

        String advies = bepaalCategorie(resultaat);
        System.out.println(advies);

        input.close(); // Scanner netjes afsluiten
    }
}


