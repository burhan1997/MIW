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
