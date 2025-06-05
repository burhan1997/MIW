import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExampleLauncher {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("geef een getal: ");

        try{
            int woord = scanner.nextInt();
        } catch (InputMismatchException fout) {
            System.out.println(fout.getMessage());
            System.out.println("Let op een getal bestaat alleen uit cijfers!");
        }

    }

}
