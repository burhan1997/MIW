package controller;

import java.util.Scanner;

public class OefeningLauncher {
    public static int sum(int eerstNummer, int tweedeNummer){
        int result = 0;
        for(int i=eerstNummer; i<=tweedeNummer; i++){
            result = result + i;
            System.out.println("Sum from " + eerstNummer + " to " + tweedeNummer + " is " + result);

        }
        return result;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //Schrijf een programma dat vraagt om een kommagetal. Rond het gegeven getal af op twee
        //cijfers achter de komma en druk dit af.
        System.out.print("Geef een getal (bv 12,345): ");
        double ingevoerdGetal = input.nextDouble();
        input.nextLine();
        double afgerondGetal = Math.round(100.0 * ingevoerdGetal) / 100.0;
        System.out.println(afgerondGetal);

        //Schrijf een programma dat een willekeurig geheel getal geeft; minimaal 2, maximaal 10.
        //Gebruik Math.random().Bedenk dat deze methode een double geeft van 0 tot 1; bekijk de
        //uitleg en de formule van pagina 146 nog een keer.
        int willekeurigGeheelGetal = (int)(Math.random() * (10 - 2 + 1)) + 2;
        System.out.println("Willekeurig getal tussen 2 en 10: " + willekeurigGeheelGetal);

        //methoden
        int sum =0;
        for (int i=0; i<=10; i++){
            sum = sum + i;
            System.out.println("Sum from 1 to 10 is " + sum);
        }
        for (int i=20; i<=37; i++){
            sum += i;
            System.out.println("Sum from 20 to 37 is " + sum);
        }

        System.out.println("Sum from 1 to 10 is " + sum(1, 10));
        System.out.println("Sum from 20 to 37 is " + sum(20, 37));

    }
}
