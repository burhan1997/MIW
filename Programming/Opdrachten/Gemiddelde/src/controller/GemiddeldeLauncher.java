package controller;

import java.util.Scanner;
/**
 * Burhan Elaldi
 * Deze klasse bevat een Java-consoleapplicatie die het gemiddelde berekent van twee of meer getallen.
 * De gebruiker wordt gevraagd om twee getallen in te voeren en krijgt daarna de optie om extra getallen toe te voegen.
 * De applicatie blijft vragen om extra getallen totdat de gebruiker 'nee' antwoordt.
 * Uiteindelijk wordt het gemiddelde van alle ingevoerde getallen weergegeven.
 */
public class GemiddeldeLauncher {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dit programma berekent het gemiddelde van twee of meer getallen");
        System.out.print("Geef het eerste getal: ");
        int eersteGetal = input.nextInt();
        System.out.print("Geef het tweede getal: ");
        int tweedeGetal = input.nextInt();
        input.nextLine();// for enter cleaning
        System.out.print("Wil je van meer getallen het gemiddelde bepalen (ja/nee)? ");
        String antwoord = input.nextLine();
        while ( !antwoord.equals("ja") &&  !antwoord.equals("nee") ){
            System.out.println("Je moet ‘ja’ of ‘nee’ antwoorden");
            System.out.print("Wil je van meer getallen het gemiddelde bepalen (ja/nee)? ");
            antwoord = input.nextLine();
        }

        int sum = eersteGetal + tweedeGetal;
        int teller = 2;
        while ( antwoord.equals("ja")){
            System.out.print("Geef het volgende getal: ");
            int volgendGetal = input.nextInt();
            sum += volgendGetal;
            teller++;

            input.nextLine(); // for enter cleaning
            System.out.print("Wil je van meer getallen het gemiddelde bepalen (ja/nee)? ");
            antwoord = input.nextLine();

        }
        double gemiddelde = (double) sum / teller;
        System.out.println("Het gemiddelde van jouw " + teller + " getallen is " + gemiddelde);

    }
}
