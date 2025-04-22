// Naam: Burhan Elaldi
package controller;

import java.util.Scanner;

public class ArraysLauncher {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Hoeveel getallen wil je genereren?: ");
        int aantalGetallen = input.nextInt();
        System.out.print("Wat is het grootste getal dat mag voorkomen?: ");
        int hoogsteGetal = input.nextInt();

        int[] gegenereerdeGetallen = maakRandomRijGetallen(aantalGetallen, hoogsteGetal);

        System.out.print("Dit zijn de getallen: ");
        for (int i = 0; i < gegenereerdeGetallen.length; i++) {
            System.out.print(gegenereerdeGetallen[i] + " ");
        }

        int totaal = somVanRij(gegenereerdeGetallen);
        System.out.println("\nDe som is: " + totaal);

        int min = minimumVanRij(gegenereerdeGetallen);
        System.out.println("\nDe min is: " + min);


        int[] getallen = new int[1000];
        for (int i = 0; i < getallen.length; i++) {
            getallen[i] = (int) (Math.random() * (50)) + 1;
        }
        int yirmiuc = telVoorkomensInRij(getallen, 23);
        System.out.println("Getal 23 komt " + yirmiuc + " keer voor in de rij.");

        // Tel de voorkomens van getallen van 1 tot 50
        int[] voorkomens = telVoorkomensVanAlleGetallen(getallen, 50);

        // Print het overzicht van voorkomens
        System.out.println("\nOverzicht van voorkomens van getallen in rij:");
        for (int i = 0; i < voorkomens.length; i++) {
            if (voorkomens[i] > 0) {
                System.out.println("Getal " + (i + 1) + " komt " + voorkomens[i] + " keer voor.");
            }
        }
    }

    // Doel: Genereert een reeks willekeurige gehele getallen tussen 1 en een maximumwaarde
    // Amaç: 1 ile verilen maksimum değer arasında rastgele tam sayılar içeren bir dizi oluşturur.
    public static int[] maakRandomRijGetallen(int mpAantal, int mpMaximum) {
        int[] getallen = new int[mpAantal];
        for (int i = 0; i < mpAantal; i++) {
            getallen[i] = (int) (Math.random() * mpMaximum) + 1;
        }
        return getallen;
    }

    // Doel: Berekent de som van alle getallen in een array
    // Amaç: Bir dizideki tüm sayıların toplamını hesaplar.
    public static int somVanRij(int[] mpRij) {
        int som = 0;
        for (int i = 0; i < mpRij.length; i++) {
            som = som + mpRij[i];
        }
        return som;
    }

    // Doel: Vindt het minimum getal in een array
    // Amaç: Bir dizideki en küçük sayıyı bulur.
    public static int minimumVanRij(int[] mpRij) {
        int minimum = mpRij[0];
        for (int i = 1; i < mpRij.length; i++) {
            if (mpRij[i] < minimum) {
                minimum = mpRij[i];
            }
        }
        return minimum;
    }

    // Doel: Telt het aantal keren dat een specifiek getal voorkomt in een array
    // Amaç: Belirli bir sayının bir dizide kaç kez tekrar ettiğini sayar.
    public static int telVoorkomensInRij(int[] mpRij, int mpGetal) {
        int teller = 0;
        for (int i = 0; i < mpRij.length; i++) {
            if (mpRij[i] == mpGetal) {
                teller++;
            }
        }
        return teller;
    }

    // Doel: Telt de voorkomens van alle getallen tussen 1 en maxGetal in een array
    // Amaç: 1 ile `maxGetal` arasındaki tüm sayıların dizide kaç kez geçtiğini sayar.
    public static int[] telVoorkomensVanAlleGetallen(int[] mpRij, int maxGetal) {
        int[] voorkomens = new int[maxGetal]; // Een array van de grootte van maxGetal
        for (int i = 0; i < mpRij.length; i++) {
            int getal = mpRij[i];
            if (getal >= 1 && getal <= maxGetal) {
                voorkomens[getal - 1]++; // Verhoog de index die overeenkomt met het getal
            }
        }
        return voorkomens;
    }
}
