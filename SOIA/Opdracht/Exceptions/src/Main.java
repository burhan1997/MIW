
/*
 * Dit programma demonstreert exception handling in Java met betrekking tot invoer van een gebruiker.
 *
 * Functionaliteit:
 * 1. Het vraagt de gebruiker om de lengte van een zijde van een vierkant.
 *    - Indien de invoer geen geldig getal is (zoals een woord of letter), wordt dit netjes afgehandeld.
 * 2. Het maakt een Vierkant-object aan en toont de berekende oppervlakte.
 * 3. Vervolgens vraagt het programma om een oppervlakte.
 *    - Het berekent de bijbehorende zijde via de methode berekenZijde().
 *    - Indien de gebruiker een ongeldig getal of een negatieve waarde invoert, wordt dit ook opgevangen.
 *
 * Gebruikte exception handling:
 * - InputMismatchException: als de gebruiker een onjuist type invoert (bijv. tekst in plaats van een getal).
 * - IllegalArgumentException: als de gebruiker een negatieve oppervlakte invoert.
 *
 * Doel:
 * - De gebruiker begeleiden bij correcte invoer.
 * - Robuust omgaan met fouten zonder dat het programma crasht.
 */


import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isJuisteInvoer = false;
        Vierkant vierkant = new Vierkant();

        do {
            System.out.println("Voer een zijde: ");
            try {
                double gebruikerZijde = scanner.nextDouble();
                vierkant = new Vierkant(gebruikerZijde);
                isJuisteInvoer = true;
            } catch (InputMismatchException getalFout) {
                System.out.println("Je moet een getal invoeren met een komma.");
                scanner.nextLine();
            }
        } while (!isJuisteInvoer);

        System.out.println(vierkant);
        System.out.println("Oppervlakte: " + vierkant.getOppervlakte());

        boolean juisteOppervlakteInvoer = false;
        while (!juisteOppervlakteInvoer) {

            try {
                System.out.println("Voer een oppervlakte: ");
                double gebruikerOppervlakte = scanner.nextDouble();
                double zijdeBerekend = Vierkant.berekenZijde(gebruikerOppervlakte);
                System.out.println("Zijde is " + zijdeBerekend);
                juisteOppervlakteInvoer = true;
            } catch (InputMismatchException e) {
                System.out.println("Je moet een getal invoeren met een komma.");
                scanner.nextLine();
            } catch (IllegalArgumentException fout) {
                System.out.println(fout.getMessage());
            }
        }

    }
}
