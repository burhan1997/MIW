package controller;

import java.util.Scanner;

public class ParkeergarageLauncher {
    final static double DAG_PRIJS = 25.00;

    //testen met 3,4 en 12 uit iedere klasse een en dicht bij de grens
    public static double berekenParkeergeld(int parkeerduur) {
        final int HOOG_DUUR = 3;
        final double HOOG_TARIEF = 3.75;
        final double LAAG_TARIEF = 2.75;

        //todo plus testen (commentaar)
        int hoog_uren;
        if (parkeerduur <= HOOG_DUUR)
            hoog_uren = parkeerduur;
        else
            hoog_uren = HOOG_DUUR;
        int laag_duur = parkeerduur - hoog_uren;
        double kosten = hoog_uren * HOOG_TARIEF + laag_duur * LAAG_TARIEF;
        if (kosten > DAG_PRIJS) {
            kosten = DAG_PRIJS;
        }
        return kosten;
    }

    public static int bepaalAantalAutosDagkaart(double[] mpParkeerKosten) {
        int aantal = 0;
        for (int i = 0; i < mpParkeerKosten.length; i++) {
            if (mpParkeerKosten[i] == DAG_PRIJS) {
                aantal++;
            }
        }
        return aantal;
    }

    public static void main(String[] args) {
        final int MAX_DUUR = 24;
//          Zet in block comments het doel van je programma en je naam en studentnummer.
            /*
            Het doel van deze opdracht is om een applicatie te schrijven die de parkeerkosten berekent in een
            parkeergarage. Na het invoeren van auto’s die geparkeerd hebben, bepaalt en toont de applicatie de
            parkeerkosten voor elke auto en het aantal verkochte dagkaarten. burhan 123
             */
//        1. Vraag de gebruiker om het aantal auto’s dat heeft geparkeerd.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Hoeveel auto's hebben geparkeerd? ");
        int aantalAutos = scanner.nextInt();
        scanner.nextLine();


//        2. Zorg ervoor dat de gegevens over auto’s kunnen worden opgeslagen. Van alle auto’s moet
//        het kenteken, de parkeerduur (in gehele uren) en de parkeerkosten worden bijgehouden.
//        Zorg ervoor dat de opslag precies goed is voor het opgegeven aantal auto’s.

        String[] kenteken = new String[aantalAutos];
        int[] parkeerduur = new int[aantalAutos];
        double[] parkeerkosten = new double[aantalAutos];

//        3. Vraag de gebruiker per auto om het kenteken en de parkeerduur in gehele uren. Sla de
//        gegevens voor later gebruik in een overzicht. Let wel: De parkeerduur kan maximaal 24 uur
//        zijn.

        for (int i = 0; i < aantalAutos; i++) {
            System.out.println("Auto " + (i + 1));
            System.out.print("    Kenteken: ");
            kenteken[i] = scanner.nextLine();
            do {
                System.out.print("    Geparkeerde uren (max. " + MAX_DUUR + " ): ");
                parkeerduur[i] = scanner.nextInt();
                scanner.nextLine();
                if (parkeerduur[i] > MAX_DUUR) {
                    System.out.printf("    De parkeerduur kan maximaal %d uur zijn.\n", MAX_DUUR);
                }
            } while (parkeerduur[i] > MAX_DUUR);
        }

//        4. Bereken per auto de parkeerkosten op basis van de ingevoerde parkeerduur. Maak hierbij
//        gebruik van een methode met de volgende signatuur:
//        public static double berekenParkeergeld(int parkeerduur)
//        Hoe de parkeerkosten worden berekend staat beschreven in de inleiding. Sla de
//        parkeerkosten ook op voor later gebruik.

        for (int i = 0; i < aantalAutos; i++) {
            parkeerkosten[i] = berekenParkeergeld(parkeerduur[i]);
        }


//        5. Zet in comments boven de methode welke waarden je zou willen gebruiken om de juiste
//        werking van de methode te testen en leg uit waarom juist die waarden.

        //zie boven

//        6. Gebruik de opgeslagen gegevens om een overzicht af te drukken met van elke auto het
//        kenteken, de parkeerduur in uren en de parkeerkosten.3

        System.out.println();
        System.out.printf("%-10s%6s%8s\n", "Kenteken", "Uren", "Kosten");
        for (int i = 0; i < aantalAutos; i++) {
            System.out.printf("%-10s%6d%8.2f\n", kenteken[i], parkeerduur[i], parkeerkosten[i]);
        }

//        7. Bepaal het aantal auto’s waarvoor de kosten van een dagkaart, 25 euro, is berekend.
//        public static int bepaalAantalAutosDagkaart(double[]
//        mpParkeerKosten).

        // zie boven

//        8. Druk dit aantal af.

        System.out.printf("Aantal auto’s met dagkaart van %.0f euro: %d\n", DAG_PRIJS, bepaalAantalAutosDagkaart(parkeerkosten));

    }

}
