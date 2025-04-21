package controller;

import java.util.Scanner;

/*
Burhan Elaldi
 * Dit programma laat de gebruiker oefenen met het berekenen van de oppervlakte van een driehoek.
 * Bij elke iteratie wordt gevraagd of de gebruiker wil doorgaan.
 * Als de gebruiker 'j' invoert, worden willekeurige waarden voor basis en hoogte gegenereerd (tussen 2 en 10).
 * De gebruiker moet de oppervlakte berekenen en invoeren.
 * Het programma geeft vervolgens aan of het antwoord correct is of niet,
 * en toont het juiste antwoord als het fout is.
 * Het programma blijft doorgaan totdat de gebruiker 'n' invoert.
 */

public class OppervlakteberekeningLauncher {
    public static double berekenOppervlakteDriehoek(int mpBasis, int mpHoogte) {
        return (mpBasis * mpHoogte) / 2.0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String antwoord;
        final int MAX = 10;
        final int MIN = 2;

        do {
            System.out.print("Wil je de oppervlakte van een driehoek uitrekenen?\nDoorgaan (j/n)? ");
            antwoord = input.nextLine();

            if (antwoord.equals("j")) {
                int basis = (int) ((Math.random() * (MAX - MIN + 1)) + MIN);
                int hoogte = (int) ((Math.random() * (MAX - MIN + 1)) + MIN);
                double computerAntwoord = berekenOppervlakteDriehoek(basis, hoogte);

                System.out.print("Bereken de oppervlakte van een driehoek met basis " + basis + " en hoogte " + hoogte + ": ");
                double userAntwoord = input.nextDouble();
                input.nextLine(); // buffer cleaning

                if (userAntwoord == computerAntwoord) {
                    System.out.println("Jouw antwoord is goed!");
                } else {
                    System.out.println("Jouw antwoord is fout!\nHet juiste antwoord is " + computerAntwoord + ".");
                }
            }

        } while (antwoord.equals("j"));

        System.out.println("Het programma wordt nu gestopt.");
    }
}
