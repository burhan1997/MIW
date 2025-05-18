package controller;

import model.Persoon;

public class BedrijfLauncher {
    public static void main(String[] args) {
        System.out.println(Persoon.aantalPersonen);
        Persoon baas = new Persoon("Mark", "Den Haag", 10000);
        System.out.println(Persoon.aantalPersonen);
        System.out.println(baas.personeelsNummer);
        Persoon medewerker = new Persoon("Caroline", "Delft", 4000);
        System.out.println(Persoon.aantalPersonen);
        System.out.println(medewerker.personeelsNummer);


        Persoon p1 = new Persoon("Mark", "Den Haag", 10000);
        Persoon p2 = new Persoon("Ali");
        Persoon p3 = new Persoon();

        System.out.println(p1.berekenJaarInkomen());
        System.out.println(p2.berekenJaarInkomen());
        System.out.println(p3.berekenJaarInkomen());

        Persoon assistent = new Persoon ("Klaas");
        Persoon manager = new Persoon();
        System.out.println(Persoon.aantalPersonen);
        System.out.printf("%s verdient %.2f per jaar\n", baas.naam,
                baas.berekenJaarInkomen());
        System.out.printf("%s woont in %s\n", assistent.naam,
                assistent.woonplaats);
    }
}
