package controller;
/**
 * Naam: Burhan Elaldi
 * Doel: Dit programma vraagt een gebruiker om tentamencijfers in te voeren
 * en berekent het gemiddelde, aantal voldoendes en het hoogste cijfer.
 */

import java.util.Scanner;

public class TentamencijferLauncher {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Hoeveel cijfers wilt u invoeren?: ");
        int aantalCijfers = input.nextInt();

        while (aantalCijfers <= 0) {
            System.out.println("Aantal cijfers moet groter zijn dan 0!");
            System.out.print("Hoeveel cijfers wilt u invoeren?: ");
            aantalCijfers = input.nextInt();
        }

        double[] cijfers = new double[aantalCijfers];
        double cijferVanDeStudent;

        for (int i = 0; i < aantalCijfers; i++) {
            boolean correcteInput = false;
            do {
                System.out.printf("Cijfer student %d: ", (i + 1));
                cijferVanDeStudent = input.nextDouble();
                if (cijferVanDeStudent < 1.0) {
                    System.out.println("Cijfer mag niet lager dan 1 zijn!");
                } else if (cijferVanDeStudent > 10.0) {
                    System.out.println("Cijfer mag niet hoger dan 10 zijn!");
                } else {
                    correcteInput = true;
                }

            } while (!correcteInput);
//            while (true) {
//                System.out.print("Cijfer student " + (i + 1) + ": ");
//                cijferVanDeStudent = input.nextDouble();
//
//                if (cijferVanDeStudent < 1.0) {
//                    System.out.println("Cijfer mag niet lager dan 1 zijn!");
//                } else if (cijferVanDeStudent > 10.0) {
//                    System.out.println("Cijfer mag niet hoger dan 10 zijn!");
//                } else {
//                    break; // Not geçerli → döngüden çık
//                }
//            }
            cijfers[i] = cijferVanDeStudent;
        }

        System.out.println("Aantal cijfer: " + aantalCijfers);

        double gemiddelde = berekenGemiddelde(cijfers);
        System.out.printf("Gemiddelde cijfer: %.1f\n", gemiddelde);

        int teller = telAantalVoldoendes(cijfers);
        System.out.println("Aantal voldoendes: " + teller);

        double maximum = bepaalMaximum(cijfers);
        System.out.println("Hoogste cijfer : " + maximum);

    }

    public static double berekenGemiddelde(double[] cijfers) {
        double totaal = 0;
        double gemiddelde;
        for (int i = 0; i < cijfers.length; i++) {
            totaal = totaal + cijfers[i];
        }
        gemiddelde = totaal / cijfers.length;
        return gemiddelde;
    }

    public static int telAantalVoldoendes(double[] cijfers) {
        final double MIN = 5.5;
        int teller = 0;
        for (int i = 0; i < cijfers.length; i++) {
            if (cijfers[i] >= MIN) {
                teller++;
            }
        }
        return teller;
    }

    public static double bepaalMaximum(double[] cijfers) {
        double maximum = cijfers[0];
        for (int i = 0; i < cijfers.length; i++) {
            if (cijfers[i] > maximum) {
                maximum = cijfers[i];
            }
        }
        return maximum;
    }
}
