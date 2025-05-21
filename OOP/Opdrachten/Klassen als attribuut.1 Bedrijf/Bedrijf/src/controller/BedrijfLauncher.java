package controller;

import model.Afdeling;
import model.Persoon;

public class BedrijfLauncher {
    public static void main(String[] args) {
//        System.out.println(Persoon.aantalPersonen);
//
//        Persoon baas = new Persoon("Mark", "Den Haag", 10000);
//        System.out.println(Persoon.aantalPersonen);
//        System.out.println(baas.getPersoneelsNummer());
//
//        Persoon medewerker = new Persoon("Caroline", "Delft", 4000);
//        System.out.println(Persoon.aantalPersonen);
//        System.out.println(medewerker.getPersoneelsNummer());
//
//        Persoon assistent = new Persoon ("Klaas");
//        Persoon manager = new Persoon();
//        System.out.println(Persoon.aantalPersonen);
//
//        if (baas.heeftRechtOpBonus()){
//            System.out.printf("%s verdient %.2f per jaar en heeft wel recht op een bonus.\n", baas.getNaam(), baas.getMaandSalaris());
//        } else{
//            System.out.printf("%s verdient %.2f per jaar en heeft geen recht op een bonus.\n", baas.getNaam(), baas.getMaandSalaris());
//        }
//        if (medewerker.heeftRechtOpBonus()) {
//            System.out.printf("%s verdient %.2f en heeft wel recht op een bonus.\n", medewerker.getNaam(), medewerker.getMaandSalaris());
//        } else {
//            System.out.printf("%s verdient %.2f en heeft geen recht op een bonus.\n", medewerker.getNaam(), medewerker.getMaandSalaris());
//        }

        Afdeling[] afdelingen = new Afdeling[4];
        afdelingen[0] = new Afdeling("Uitvoering", "Hilversum");
        afdelingen[1] = new Afdeling("Support", "Amsterdam");
        afdelingen[2] = new Afdeling("Management", "Almere" );
        afdelingen[3] = new Afdeling("Documentatie", "Gouda");


        Persoon baas = new Persoon("Mark", "Den Haag", 10000, afdelingen[2]);
        Persoon medewerker = new Persoon("Caroline", "Delft", 4000, afdelingen[1]);
        Persoon assistent = new Persoon("Klaas");

        System.out.printf("Het aantal personen in het bedrijf is %d\n", Persoon.aantalPersonen);
        System.out.printf("%s werkt in %s en woont in %s\n", baas.getNaam(), baas.getAfdeling().getAfdelingsPlaats(), baas.getWoonplaats());
        System.out.printf("%s werkt op de afdeling %s en verdient %.2f\n", medewerker.getNaam(), medewerker.getAfdeling().getAfdelingsNaam(), medewerker.getMaandSalaris());
        System.out.printf("%s werkt op de afdeling %s en woont in %s", assistent.getNaam(), assistent.getAfdeling().getAfdelingsNaam(), assistent.getWoonplaats());



    }
}
