package controller;

import model.Wedstrijd;

import java.util.Scanner;

public class VoetbalScoresLauncher {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println();
        Wedstrijd eersteWedstrijd = new Wedstrijd("PEC", 5, 0);

        eersteWedstrijd.printUitslag();
        eersteWedstrijd.printWedstrijdPunten();
        System.out.println();

        System.out.print("Wat is de tegenstander?: ");
        String tegenstanderNaam = input.nextLine();




        System.out.print("Doelpunten gescoord: ");
        int puntenGescoord = input.nextInt();
        System.out.print("Doelpunten tegenstander: ");
        int puntenTegenstander = input.nextInt();

        Wedstrijd tweedeWedstrijd = new Wedstrijd(tegenstanderNaam, puntenGescoord, puntenTegenstander);

        tweedeWedstrijd.printUitslag();
        tweedeWedstrijd.printWedstrijdPunten();

    }
}
