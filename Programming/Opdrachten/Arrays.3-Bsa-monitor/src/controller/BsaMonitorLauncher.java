/*
 * Doel van dit programma:
 * Deze applicatie helpt studenten van de Hogeschool van Amsterdam om hun studievoortgang
 * in semester 1 bij te houden. Op basis van ingevoerde cijfers berekent het programma
 * hoeveel studiepunten de student heeft behaald en voorspelt het of de student een positief
 * of negatief bindend studieadvies (BSA) zal krijgen.
 */

package controller;

import java.util.Scanner;

public class BsaMonitorLauncher {

    // Deze methode berekent de totale behaalde punten door de array van punten op te tellen.
    public static int bepaalTotaalPunten(int[] mpPuntenRij) {
        int som = 0;
        for (int i = 0; i < mpPuntenRij.length; i++) {
            som = mpPuntenRij[i] + som;
        }
        return som;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Namen van de vakken die de student volgt
        String[] vakNamen = {
                "Project Fasten Your Seatbelts",
                "Programming",
                "Databases",
                "Personal Skills",
                "Project Skills",
                "OOP1",
                "User Interaction"
        };

        // Beginpunten voor de vakken (maximale studiepunten per vak)
        int[] vakPunten = {12, 3, 3, 2, 2, 3, 3};
        double[] vakCijfers = new double[vakNamen.length];

        // Cijfers invoeren
        System.out.println("Voer behaalde cijfers in: ");
        for (int i = 0; i < vakCijfers.length; i++) {
            double cijfer;

            do {
                System.out.print(vakNamen[i] + " :");
                cijfer = input.nextDouble();
                input.nextLine();
                // Controleren of het cijfer tussen 1 en 10 ligt
                if (cijfer < 1 || cijfer > 10) {
                    System.out.println("Fout! Voer een cijfer in tussen 1.0 en 10.0.");
                }
            } while (cijfer < 1.0 || cijfer > 10.0);
            vakCijfers[i] = cijfer;
        }

        // Cijfers controleren en vakPunten aanpassen
        for (int i = 0; i < vakNamen.length; i++) {
            if (vakCijfers[i] < 5.5) {
                vakPunten[i] = 0;  // Als het cijfer lager is dan 5.5, zet de punten op 0 (niet gehaald)
            }
        }

        // Totale behaalde studiepunten berekenen
        int behaaldePunten = bepaalTotaalPunten(vakPunten);

        // Resultaten weergeven
        System.out.printf("%-25s%10s%18s\n", "Vak/project", "Cijfer", "Behaalde punten");

        for (int i = 0; i < vakNamen.length; i++) {
            System.out.printf("%-25s%10.1f%18d\n", vakNamen[i], vakCijfers[i], vakPunten[i]);
        }

        // Totale behaalde studiepunten weergeven
        System.out.println("\nTotaal behaalde studiepunten: " + behaaldePunten);

        // BSA controle en waarschuwing
        int totaalTeBehalenPunten = bepaalTotaalPunten(vakPunten); // Totaal te behalen punten
        double bsaThreshold = 0.83 * totaalTeBehalenPunten; // 83% van de te behalen punten

        if (behaaldePunten < bsaThreshold) {
            System.out.println("PAS OP: je ligt op schema voor een negatief BSA!");  // Waarschuwing voor negatief BSA
        }

    }
}