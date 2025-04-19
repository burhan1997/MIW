package controller;

import java.util.Scanner;

/**
 * VerkoopPrijsLauncher
 *
 * Auteur: burhan elaldi
 * Doel: Deze applicatie berekent de verkoopprijs van een product.
 * De verkoopprijs wordt berekend op basis van de inkoopprijs en winstmarge.
 * Vervolgens wordt de verkoopprijs inclusief BTW weergegeven op basis van het gekozen BTW-tarief.
 */

public class VerkoopPrijsLauncher {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Inkoopprijs: ");
        double inkoopPrijs = input.nextDouble();

        System.out.print("Winstmarge (%): ");
        int winstMarge = input.nextInt();

        // verkoopPrijs zonder BTW
        double verkoopPrijs = inkoopPrijs + (inkoopPrijs * winstMarge / 100.0);
        System.out.println("Verkoopprijs exclusief BTW: " + verkoopPrijs);

        System.out.println("Onder welk BTW-tarief valt het product?");
        System.out.println("1 Hoog");
        System.out.println("2 Laag");

        System.out.print("Geef je keuze: ");
        int keuze = input.nextInt();

        final int BTW_HOOG = 21;
        final int BTW_LAAG = 6;

        double verkoopPrijsInclBtw;

        switch (keuze) {
            case 1:
                verkoopPrijsInclBtw = verkoopPrijs + (verkoopPrijs * BTW_HOOG / 100.0);
                System.out.println("Verkoopprijs inclusief 21% BTW: " + verkoopPrijsInclBtw);
                break;
            case 2:
                verkoopPrijsInclBtw = verkoopPrijs + (verkoopPrijs * BTW_LAAG / 100.0);
                System.out.println("Verkoopprijs inclusief 6% BTW: " + verkoopPrijsInclBtw);
                break;
            default:
                System.out.println("Ongeldige keuze. Voer 1 of 2 in.");
        }
    }
}
