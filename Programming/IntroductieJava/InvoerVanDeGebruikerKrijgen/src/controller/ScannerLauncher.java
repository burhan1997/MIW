package controller;

import java.util.Scanner;

public class ScannerLauncher {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Geef een kommagetal: ");
        double kommagetal = input.nextDouble();
        input.nextLine(); // <--Deze regel leest de enter-toets (nieuwe regel) na nextDouble()

        System.out.print("Geef een tekst: ");
        String tekst = input.nextLine();

        System.out.print("Geef een geheel getal: ");
        int geheelGetal = input.nextInt();


        System.out.println("Kommagetal: " + kommagetal);
        System.out.println("Tekst: " + tekst);
        System.out.println("Geheel getal: " + geheelGetal);
    }
}
