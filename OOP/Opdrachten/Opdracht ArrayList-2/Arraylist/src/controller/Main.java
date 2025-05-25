package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // 1. Lijst van woorden
        List<String> woorden = new ArrayList<>();
        woorden.add("Morgen");
        woorden.add("wordt");
        woorden.add("het");
        woorden.add("mooi");
        woorden.add("weer");

        woorden.remove(1);       // tweede woord verwijderen ("wordt")
        woorden.add(1, "is");    // "is" op tweede plek plaatsen

        System.out.print("1. Lijst van woorden: ");
        for (String woord : woorden) {
            System.out.print(woord + " ");
        }
        System.out.println();

        // 2. Lijst van random gehele getallen
        List<Integer> randomGetallen = maakRandomRijGetallen(10, 100);
        System.out.println("2. Random getallen:");
        for (Integer i : randomGetallen) {
            System.out.println(i);
        }

        // 3. Som van een rij getallen
        int totaal = somVanRij(randomGetallen);
        System.out.println("3. Som van de rij: " + totaal);

        // 4. Gemiddelde van een rij getallen
        double gemiddelde = gemiddeldeVanRij(randomGetallen);
        System.out.println("4. Gemiddelde van de rij: " + gemiddelde);

        // 5. Lijst van getallen (gehele en gebroken getallen)
        List<Number> getallen = new ArrayList<>();
        getallen.add(5);
        getallen.add(8);
        getallen.add(13);
        getallen.add(21);
        getallen.add(34);
        getallen.add(3.14);
        getallen.add(2.72);
        getallen.add(1.62);

        // 5a. Alleen gehele getallen tonen
        System.out.println("5a. Gehele getallen:");
        for (Number num : getallen) {
            if (num instanceof Integer || num instanceof Long || num instanceof Short || num instanceof Byte) {
                System.out.println(num);
            }
        }

        // 5b. Som van gebroken getallen berekenen
        double somGebroken = 0;
        for (Number num : getallen) {
            if (num instanceof Double || num instanceof Float) {
                somGebroken += num.doubleValue();
            }
        }
        System.out.println("5b. Som van de gebroken getallen: " + somGebroken);

        // 5c. Gemiddelde van de hele lijst getallen
        double gemiddeldeGetallen = gemiddeldeVanGetallen(getallen);
        System.out.println("5c. Gemiddelde van de lijst getallen: " + gemiddeldeGetallen);
    }

    // Methode 2: maakRandomRijGetallen
    public static List<Integer> maakRandomRijGetallen(int aantal, int maximum) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < aantal; i++) {
            int randomGetal = random.nextInt(maximum) + 1;  // 1 t/m maximum
            list.add(randomGetal);
        }
        return list;
    }

    // Methode 3: somVanRij
    public static int somVanRij(List<Integer> rij) {
        int som = 0;
        for (Integer i : rij) {
            som += i;
        }
        return som;
    }

    // Methode 4: gemiddeldeVanRij
    public static double gemiddeldeVanRij(List<Integer> rij) {
        if (rij == null || rij.isEmpty()) {
            return 0;
        }
        int som = somVanRij(rij);
        return (double) som / rij.size();
    }

    // Methode 5c: gemiddeldeVanGetallen (voor List<Number>)
    public static double gemiddeldeVanGetallen(List<Number> lijst) {
        if (lijst == null || lijst.isEmpty()) {
            return 0;
        }
        double som = 0;
        for (Number num : lijst) {
            som += num.doubleValue();
        }
        return som / lijst.size();
    }
}
