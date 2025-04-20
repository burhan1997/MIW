package controller;

import java.util.Scanner;

/**
 * Programma voor het omwisselen van Euro naar vreemde valuta
 * Dit programma berekent hoeveel vreemde valuta je krijgt op basis van een ingevoerd bedrag in Euro's.
 * Het houdt rekening met transactiekosten en toont de resultaten voor Dollar, Pond en Yen.
 *
 * Naam: burhan elaldi
 * Doel: Om een bedrag in Euro om te wisselen naar Dollar, Pond en Yen, na aftrekken van transactiekosten.
 */

public class MoneyExchangeLauncher {

    public  static int GeldWisselConverter(int mpBedragInEuro, double mpWisselkoers){
        return (int) Math.round(mpBedragInEuro * mpWisselkoers);
    }

    public static double TransactieKostenBerekening (int mpEuro){
        final int MINIMUM_KOST = 2;
        final int MAXIMUM_KOST = 15;
        double fee = mpEuro * 0.015;
        if(fee < MINIMUM_KOST){
            fee = MINIMUM_KOST;
        };
        if ( fee > MAXIMUM_KOST){
            fee = MAXIMUM_KOST;
        }
        return Math.round(fee * 100) / 100.0;

    }

    public static void main(String[] args) {
        final double KOERS_DOLLAR = 1.23843;
        final double KOERS_POUND = 0.88459;
        final double KOERS_YEN = 134.64711;
        Scanner input = new Scanner(System.in);
        System.out.print("In te wisselen bedrag (alleen gehele getallen): ");
        int mijnBedrag = input.nextInt();
        System.out.println();
        System.out.println("De transactiekosten bedragen " + TransactieKostenBerekening(mijnBedrag) + " Euro.");

        double omTeWisselenBedrag = mijnBedrag - TransactieKostenBerekening(mijnBedrag);
        System.out.println("We rekenen daarom " + omTeWisselenBedrag + " voor u om.");

        System.out.println("U krijgt hiervoor " + GeldWisselConverter(mijnBedrag, KOERS_DOLLAR) + " Dollar. (Koers " + KOERS_DOLLAR + ")");
        System.out.println("U krijgt hiervoor " + GeldWisselConverter(mijnBedrag, KOERS_POUND) + " Pound. (Koers " + KOERS_POUND + ")");
        System.out.println("U krijgt hiervoor " + GeldWisselConverter(mijnBedrag, KOERS_YEN) + " Yen. (Koers " + KOERS_YEN + ")");
    }
}
