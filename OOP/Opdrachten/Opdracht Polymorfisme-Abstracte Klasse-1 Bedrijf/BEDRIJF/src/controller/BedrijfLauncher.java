package controller;

import model.Afdeling;
import model.Persoon;
import model.Werknemer;
import model.Zzper;

public class BedrijfLauncher {

    public static void main(String[] args) {
        Afdeling[] afdelingen = new Afdeling[4];
        afdelingen[0] = new Afdeling("Uitvoering", "Hilversum");
        afdelingen[1] = new Afdeling("Support", "Amsterdam");
        afdelingen[2] = new Afdeling("Management", "Almere");
        afdelingen[3] = new Afdeling("Documentatie", "Gouda");

        Werknemer baas = new Werknemer("Mark", "Den Haag", afdelingen[2], 10000);
        Werknemer medewerker = new Werknemer("Caroline", "Delft", afdelingen[1], 4000);
        Zzper assistent = new Zzper("Klaas", "Diemen", afdelingen[3], 50.00);
        assistent.huurIn(160);
        Zzper projectleider = new Zzper("Ronald", "Zaandam", afdelingen[0], 80.00);
        projectleider.huurIn(320);

        Persoon[] personen = new Persoon[4];
        personen[0] = baas;
        personen[1] = medewerker;
        personen[2] = assistent;
        personen[3] = projectleider;

        for (int personenTeller = 0; personenTeller < 4; personenTeller++) {
            toonJaarInkomen(personen[personenTeller]);
        }
    }

    public static void toonJaarInkomen(Persoon persoon) {
        System.out.printf("%s verdient %.2f per jaar\n", persoon.getNaam(), persoon.berekenJaarInkomen());
    }
}
