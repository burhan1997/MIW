package controller;

// Naam: Burhan Elaldi
// Doel van het programma: Deze applicatie gooit herhaaldelijk een dobbelsteen totdat er een 6 wordt gegooid.
// Bij elke worp wordt de dobbelsteen grafisch weergegeven met een gekozen karakter als oog.

import java.util.Scanner;

public class DobbelsteenLauncher {
    public static int werpDobbelsteen() {
        final int MAX = 6;
        final int MIN = 1;
        return (int) ((Math.random() * (MAX - MIN + 1)) + MIN);
    }

    public static void toonDobbelsteen(int mpWorp, char mpKarakter) {
        switch (mpWorp) {
            case 1:
                System.out.println("     ");
                System.out.println("  " + mpKarakter + "  ");
                System.out.println("     ");
                break;
            case 2:
                System.out.println(mpKarakter + "    ");
                System.out.println("     ");
                System.out.println("    " + mpKarakter);
                break;
            case 3:
                System.out.println(mpKarakter + "    ");
                System.out.println("  " + mpKarakter + "  ");
                System.out.println("    " + mpKarakter);
                break;
            case 4:
                System.out.println(mpKarakter + "    " + mpKarakter);
                System.out.println("     ");
                System.out.println(mpKarakter + "    " + mpKarakter);
                break;
            case 5:
                System.out.println(mpKarakter + "    " + mpKarakter);
                System.out.println("  " + mpKarakter + "  ");
                System.out.println(mpKarakter + "    " + mpKarakter);
                break;
            case 6:
                System.out.println(mpKarakter + "    " + mpKarakter);
                System.out.println(mpKarakter + "    " + mpKarakter);
                System.out.println(mpKarakter + "    " + mpKarakter);
                break;
            default:
                System.out.println("Geçersiz zar değeri.");
        }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Welk karakter moet ik gebruiken voor het oog: ");
        String dobbelsteen = input.nextLine();
        char oog = dobbelsteen.charAt(0);

        int worp;
        do {
            worp = werpDobbelsteen();
            toonDobbelsteen(worp, oog);
            System.out.println();
        } while (worp != 6);
    }
}

