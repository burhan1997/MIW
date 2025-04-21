package controller;

public class OefeningLauncher {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                System.out.println(i + " " + j);
            }
        }
        int nummerHenk = 1;
        double salarisHenk = 45.7;
        int nummerPiet = 12456;
        double salarisPiet = 400000000.56;
        System.out.printf("%-8s %6s %14s\n", "Naam", "Nummer", "Salaris");
        System.out.printf("%-8s %6d  %14.2f\n", "Henk", nummerHenk, salarisHenk);
        System.out.printf("%-8s %6d  %14.2f\n", "Pieter", nummerPiet,salarisPiet);


        String voornaam = "Kees";
        String achternaam = "Smit";
        int leeftijd = 51;
        double saldo = 12345.6789;
        System.out.printf("Goedemorgen %s %s, je leeftijd is %d en je saldo is  %f\n", voornaam, achternaam, leeftijd, saldo);

        }

}
