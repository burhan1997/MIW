/*
Burhan ELALDI
 Dit programma is gemaakt om een simpel systeem te maken voor het beheren van autoverzekeringen.
 - De gebruiker kan meerdere autopolissen invoeren.
 - Voor elke polis vult de gebruiker de naam van de eigenaar in, de waarde van de auto en het aantal schadevrije jaren.
 - Het programma laat aan het einde een overzicht zien in een tabel met alle gegevens van de polissen.
 - Ook laat het zien hoeveel jaarpremies lager zijn dan 1000 euro.
 */
package controller;

import java.util.Scanner;

public class VerzekeringsmaatschappijLauncher {
    final static int GRENSWAARD_JAARPREMIES = 1000;

    //testen met mpWaarde: 10000, mpAantalSchadevrijeJaren: 0 -- zonder korting -->10000*0.1 = 1000 euro
    //testen met mpWaarde: 20000, mpAantalSchadevrijeJaren: 20 -- full korting --> 20000*0.1 = 2000
    // --> 20*0.05 = 1 --> 1>0.7 = 0.7 --> 2000*0.3=600 euro
    public static double berekenJaarpremie(int mpWaarde, int mpAantalSchadevrijeJaren) {
        final double JAARPREMIE_PERCENTAGE = 0.1;
        final double MAX_KORTING = 0.70;
        final double KORTING_PER_JAAR = 0.05;
        final double BEREKENING_GETAL_HONDERD_PROCENT = 1.0;

        double basisBedrag = mpWaarde * JAARPREMIE_PERCENTAGE;

        double korting = mpAantalSchadevrijeJaren * KORTING_PER_JAAR;

        if (korting > MAX_KORTING) {
            korting = MAX_KORTING;
        }

        double premie = basisBedrag * (BEREKENING_GETAL_HONDERD_PROCENT - korting);
        return premie;
    }


    public static int bepaalLageJaarPremies(double[] mpJaarPremies, int mpGrenswaardeLaag) {

        int teller = 0;
        for (int i = 0; i < mpJaarPremies.length; i++) {
            if (mpJaarPremies[i] < mpGrenswaardeLaag) {
                teller++;
            }
        }
        return teller;
    }


    public static void main(String[] args) {
        final int MINIMAAL_WAARDE_VAN_DE_AUTO = 1000;
        final int MINIMAAL_AANTAL_SCHADEVRIJE_JAAR = 0;
        final int MAXIMAAL_AANTAL_SCHADEVRIJE_JAAR = 40;
        final String NAAM_VAN_DE_PERSON = "Burhan Elaldi";

        System.out.printf("Dit is de uitwerking van %s \n", NAAM_VAN_DE_PERSON);

        Scanner input = new Scanner(System.in);

//        1. Vraag de gebruiker om het aantal autopolissen dat geregistreerd moet worden.

        System.out.println();
        System.out.print("Hoeveel autopolissen wil je registreren? ");
        int aantalAutoPolissen = input.nextInt();
        input.nextLine();
        System.out.println();

//        2. Zorg ervoor dat de gegevens over de autopolissen kunnen worden opgeslagen. Van alle
//        polissen moet de naam van de polishouder, de waarde van de auto, het aantal schadevrije
//        jaren en de jaarpremie worden bijgehouden. De waarde van de auto legt men vast in hele
//        euro’s. Zorg ervoor dat de opslag precies goed is voor het opgegeven aantal polissen.

        String[] naamVanDePolishouder = new String[aantalAutoPolissen];
        int[] waardeVanDeAuto = new int[aantalAutoPolissen];
        int[] aantalSchadevrijeJaren = new int[aantalAutoPolissen];
        double[] jaarPremie = new double[aantalAutoPolissen];


//        3. Vraag de gebruiker per autopolis om de naam van de polishouder, de waarde in hele euro’s en
//        het aantal schadevrije jaren. Sla de gegevens op voor later gebruik in een overzicht. Let wel:
//        De waarde van een auto is minimaal 1000 euro en het aantal schadevrije jaren is minimaal 0
//        en maximaal 40.

        for (int i = 0; i < aantalAutoPolissen; i++) {
            System.out.println("Autopolis " + (i + 1));
            System.out.print("     Naam polishouder: ");
            naamVanDePolishouder[i] = input.nextLine();

            do {
                System.out.print("     Waarde van de auto in euro’s : ");
                waardeVanDeAuto[i] = input.nextInt();
                input.nextLine();
                if (waardeVanDeAuto[i] < MINIMAAL_WAARDE_VAN_DE_AUTO) {
                    System.out.printf("     De waarde moet minimaal %d euro zijn!\n", MINIMAAL_WAARDE_VAN_DE_AUTO);
                }
            } while (waardeVanDeAuto[i] < MINIMAAL_WAARDE_VAN_DE_AUTO);


            do {
                System.out.print("     Aantal schadevrije jaren: ");
                aantalSchadevrijeJaren[i] = input.nextInt();
                input.nextLine();
                if (aantalSchadevrijeJaren[i] < MINIMAAL_AANTAL_SCHADEVRIJE_JAAR) {
                    System.out.printf("     Het aantal schadevrije jaren moet minimaal %d zijn!\n", MINIMAAL_AANTAL_SCHADEVRIJE_JAAR);
                } else if (aantalSchadevrijeJaren[i] > 40) {
                    System.out.printf("     Het aantal schadevrije jaren mag maximaal %d zijn!\n", MAXIMAAL_AANTAL_SCHADEVRIJE_JAAR);
                }
            } while (aantalSchadevrijeJaren[i] < MINIMAAL_AANTAL_SCHADEVRIJE_JAAR || aantalSchadevrijeJaren[i] > MAXIMAAL_AANTAL_SCHADEVRIJE_JAAR);
        }


//        4. Bereken per autopolis de jaarpremie op basis van de ingevoerde gegevens. Maak hierbij
//        gebruik van een methode met de volgende signatuur:
//        public static double berekenJaarpremie(int mpWaarde, int mpAantalSchadevrijeJaren)
//        Hoe de jaarpremie wordt berekend staat beschreven in de inleiding. Sla de jaarpremies ook op
//        voor later gebruik.

        for (int i = 0; i < aantalAutoPolissen; i++) {
            jaarPremie[i] = berekenJaarpremie(waardeVanDeAuto[i], aantalSchadevrijeJaren[i]);
        }


//        5- Zet in comments boven de methode welke waarden je zou willen gebruiken om de juiste
//        werking van de methode te testen en leg uit waarom juist die waarden.

        //zie boven

//        6- Druk een overzicht af met van elke autopolis de naam van de polishouder, de waarde van de
//        auto, het aantal schadevrije jaren en de jaarpremie.

        System.out.println();
        System.out.println("Overzicht van de autopolissen");
        System.out.printf("%-15s%10s%14s%12s\n", "polishouder", "waarde", "aantal jaren", "jaarpremie");

        for (int i = 0; i < aantalAutoPolissen; i++) {
            System.out.printf("%-15s%10d%14d%12.2f\n", naamVanDePolishouder[i], waardeVanDeAuto[i], aantalSchadevrijeJaren[i], jaarPremie[i]);
        }

        System.out.println();


//       7- Bepaal het aantal jaarpremies van minder dan 1000 euro. Maak hierbij gebruik van een
//        methode met de volgende signatuur:
//        public static int bepaalLageJaarPremies(double[] mpJaarPremies, int mpGrenswaardeLaag).


        //ZIE BOVEN

//        8. Druk dit aantal af.

        System.out.printf("Aantal premies lager dan %d euro: %d\n", GRENSWAARD_JAARPREMIES, bepaalLageJaarPremies(jaarPremie, GRENSWAARD_JAARPREMIES));

    }
}
