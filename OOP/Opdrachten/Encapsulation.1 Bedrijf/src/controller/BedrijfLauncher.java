package controller;

import model.Persoon;

public class BedrijfLauncher {
    public static void main(String[] args) {
        System.out.println(Persoon.aantalPersonen);

        Persoon baas = new Persoon("Mark", "Den Haag", 10000);
        System.out.println(Persoon.aantalPersonen);
        System.out.println(baas.getPersoneelsNummer());

        Persoon medewerker = new Persoon("Caroline", "Delft", 4000);
        System.out.println(Persoon.aantalPersonen);
        System.out.println(medewerker.getPersoneelsNummer());

        Persoon assistent = new Persoon ("Klaas");
        Persoon manager = new Persoon();
        System.out.println(Persoon.aantalPersonen);

        if (baas.heeftRechtOpBonus()){
            System.out.printf("%s verdient %.2f per jaar en heeft wel recht op een bonus.\n", baas.getNaam(), baas.getMaandSalaris());
        } else{
            System.out.printf("%s verdient %.2f per jaar en heeft geen recht op een bonus.\n", baas.getNaam(), baas.getMaandSalaris());
        }
        if (medewerker.heeftRechtOpBonus()) {
            System.out.printf("%s verdient %.2f en heeft wel recht op een bonus.\n", medewerker.getNaam(), medewerker.getMaandSalaris());
        } else {
            System.out.printf("%s verdient %.2f en heeft geen recht op een bonus.\n", medewerker.getNaam(), medewerker.getMaandSalaris());
        }

    }
}
