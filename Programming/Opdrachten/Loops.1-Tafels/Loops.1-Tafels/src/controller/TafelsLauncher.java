package controller;
/**
 * Doel: druk een gekozen tafel x keer af
 *
 * @author Burhan Elaldi
 */

import java.util.Scanner;

public class TafelsLauncher {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tafelNum;
        do {
            System.out.print("Welke tafel wilt u afdrukken?(0=stoppen) ");
            tafelNum = input.nextInt();

            if (tafelNum == 0) {
                break;
            }

            System.out.print("Hoeveel getallen wilt u afdrukken? ");
            int hoeveelheid = input.nextInt();

            System.out.println("De tafel van " + tafelNum + " : ");
            int teller = 0;
            for (int i = 1; i <= hoeveelheid; i++) {
                int tafelVan = tafelNum * i;
                System.out.printf("%4d", tafelVan);
                teller++;
                if (teller % 5 == 0) {
                    System.out.println();
                }
            }
            if (teller % 5 != 0) {
                System.out.println(); // Eğer son satırda 5 sayı yoksa yeni satıra geçer
            }
        } while (tafelNum != 0);

    }
}