package controller;

import java.util.Scanner;

public class VariablesLauncher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. CONSTANT
        final double PI = 3.14159;
        System.out.println("Constante PI waarde: " + PI);

        // 2. GEBRUIKER INPUT
        System.out.print("Wat is je voornaam? ");
        String naam = scanner.nextLine(); // hele regel

        System.out.print("Wat is je leeftijd? ");
        int leeftijd = scanner.nextInt(); // int invoer
        scanner.nextLine(); // buffer leegmaken

        System.out.print("Wat is je lengte in meters? (bijv. 1.75): ");
        double lengte = scanner.nextDouble(); // double invoer
        scanner.nextLine(); // buffer leegmaken

        // 3. STRING CONCATENATIE
        System.out.println("\nHallo " + naam + "! Je bent " + leeftijd + " jaar oud en " + lengte + "m lang.");

        // 4. INTEGER DELING vs DOUBLE DELING
        int seconden = 500;
        int heleMinuten = seconden / 60; // int / int = int
        double preciezeMinuten = (double) seconden / 60; // casting om float deling te doen

        System.out.println("\nTijd omgerekend uit seconden:");
        System.out.println("Integer deling: " + seconden + " seconden = " + heleMinuten + " minuten");
        System.out.println("Double deling: " + seconden + " seconden = " + preciezeMinuten + " minuten");

        // 5. TYPE CASTING
        System.out.println("\nVoorbeeld van type casting:");
        System.out.println("(int)2.5 / 0.5 = " + ((int) 2.5 / 0.5));       // 4.0
        System.out.println("(int)(2.5 / 0.5) = " + ((int) (2.5 / 0.5)));   // 5

        // 6. CHAR en ASCII
        char teken = '3';
        int ascii = teken + 3; // '3' = 51 → 51 + 3 = 54
        System.out.println("\nKarakter '3' + 3 = " + ascii); // toont 54

        // 7. STRING VS GETAL
        System.out.println("\nString versus getal optelling:");
        System.out.println("3 + 3 = " + (3 + 3));         // 6
        System.out.println("\"3\" + \"3\" = " + ("3" + "3")); // 33
        System.out.println("\"3\" + 3 = " + ("3" + 3));   // 33
        System.out.println("3 + \"3\" = " + (3 + "3"));   // 33

        scanner.close();
    }
}
