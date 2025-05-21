// Naam: Burhan
// Doel: Dit programma vraagt de gebruiker om cijfers in te voeren voor vakken van semester 1,
//       berekent het aantal behaalde studiepunten en geeft een waarschuwing bij een negatief BSA.

package controller;

import model.Score;
import model.Vak;

import java.util.Scanner;

public class BSAMonitorLauncher {
    public static void main(String[] args) {

        Vak[] vakkenEnPunten = new Vak[7];
        vakkenEnPunten[0] = new Vak("Project Fasten Your Seatbelt", 12, 5.5);
        vakkenEnPunten[1] = new Vak("Programming", 3, 5.5);
        vakkenEnPunten[2] = new Vak("Databases", 3, 5.5);
        vakkenEnPunten[3] = new Vak("Personal Skills", 2, 5.5);
        vakkenEnPunten[4] = new Vak("Project Skills", 2, 5.5);
        vakkenEnPunten[5] = new Vak("OOP", 3, 5.5);
        vakkenEnPunten[6] = new Vak("User Interaction", 3, 5.5);

        Score[] scores = new Score[7];

        double totaalBehaaldePunten = 0;
        double totaalMogelijkePunten = 0.0;

        System.out.println("Voer behaalde cijfers in: ");

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < vakkenEnPunten.length; i++) {
            double studentCijfer;

            do {
                System.out.printf("%s: ", vakkenEnPunten[i].getNaam());
                studentCijfer = input.nextDouble();

                if (studentCijfer < 1.0 || studentCijfer > 10.0) {
                    System.out.println("Voer een geldig cijfer in tussen 1.0 en 10.0.");
                }

            } while (studentCijfer < 1.0 || studentCijfer > 10.0);

            scores[i] = new Score(vakkenEnPunten[i], studentCijfer);
            totaalBehaaldePunten += scores[i].getBehaaldePunten();
        }

        System.out.println();

        for (int i = 0; i < vakkenEnPunten.length; i++){
            System.out.printf("Vak/project: %-30s Cijfer: %4.1f Behaalde punten: %2d\n", vakkenEnPunten[i].getNaam(), scores[i].getCijfer(), scores[i].getBehaaldePunten());
            totaalMogelijkePunten += vakkenEnPunten[i].getPunten();
        }

        System.out.println();
        System.out.printf("Totaal behaalde studiepunten: %.0f/%.0f\n", totaalBehaaldePunten, totaalMogelijkePunten);
        if (totaalBehaaldePunten < (5.0/6.0 * totaalMogelijkePunten)){
            System.out.println("PAS OP: je ligt op schema voor een negatief BSA!");
        }


    }
}
