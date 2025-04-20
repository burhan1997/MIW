package controller;
/**
 * Auteur: burhan elaldi
 * Doel: Dit programma toont een sterrenvierkant, toont een woord vijf keer,
 * verdeelt euromunten eerlijk en berekent wisselgeld (afgerond op 0,05).
 */
import java.util.Scanner;

public class MethodLauncher {
    public static void toonSterrenVierkant() {
        for (int i = 0; i < 4; i++) {  // Loop to print 4 rows
            for (int j = 0; j < 4; j++) {  // Loop to print 4 stars in each row
                System.out.print("* ");  // Print a star
            }
            System.out.println();  // Move to the next line after each row
        }
    }

    public static void toonWoordVijfKeer(String mpWoord){
        int aantal = 5;
        for (int i=0; i<aantal; i++){
            System.out.printf(mpWoord);
        }
    }

    public static int Splitsingsproces(int mpEuro, int mpPersonNum){
        return mpEuro / mpPersonNum;
    }

    public static double berekenWisselgeld(double mpTeBetalen, double mpBetaald) {
        if (mpBetaald < mpTeBetalen) {
            System.out.println("Fout: Je hebt niet genoeg betaald.");
            return 0.0;
        } else {
            double wisselgeld = mpBetaald - mpTeBetalen;
            return Math.round(wisselgeld * 100.0) / 100.0; // Rond het resultaat af op 2 decimalen
        }
    }


    public static double roundUpToNearest005(double wisselgeldValue) {
        double remainder = wisselgeldValue % 0.05;
        if (remainder == 0) {
            return wisselgeldValue;
        }
        return wisselgeldValue + (0.05 - remainder);
    }


    public static void main(String[] args) {
        //Sterrenvierkant
        toonSterrenVierkant();
        Scanner input = new Scanner(System.in);

        //Woord rij van vijf
        System.out.print("Welke woord wil je vijf keer zien?: ");
        String antwoord = input.nextLine();
        toonWoordVijfKeer(antwoord);

        //Eerlijk delen
        System.out.print("Hoeveel euromunten wil je verdelen?: ");
        int euromunten = input.nextInt();
        System.out.print("Met hoeveel personen: ");
        int personNum = input.nextInt();

        int euroPerPerson = Splitsingsproces(euromunten, personNum);

        int blijvenMunt = euromunten - euroPerPerson * personNum;
        System.out.println("Als je " + euromunten + " euromunten verdeeld over " + personNum + " mensen dan krijgt ieder " + euroPerPerson +
                " munten en blijven er " + blijvenMunt + " over");

        //Wisselgeld
        System.out.print("Hoeveel moet je betalen?: ");
        double teBetalen = input.nextDouble();
        System.out.print("Hoeveel heb je gegeven?: ");
        double betaald = input.nextDouble();
        double wisselgeld = berekenWisselgeld(teBetalen, betaald);

        //AfgerondWisselgeld

        double afgerondWisselgeld = Math.round(wisselgeld * 20) / 20.0;
        // 1 / 0.05 = 20
        // 3.14 → (3.14 × 20 = 62.8) → round → 63 → 63 / 20.0 = 3.15
        double afgerondWisselgeld2 = roundUpToNearest005(wisselgeld);
        System.out.print("Hoeveel wisselgeld krijg je terug: " + afgerondWisselgeld2);

        System.out.print("Hoeveel wisselgeld krijg je terug: " + afgerondWisselgeld);

    }
}
