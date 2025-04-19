package controller;

import java.util.Scanner;

public class OefeningLauncher {

    public static void printHello() {
        System.out.println("Welkom bij de Method Demo Launcher");
        System.out.println("Dit is al de eerste methode");
    }

    public static int geefRandomIntTussen1en10() {
        int random_getal = (int)((Math.random() * 10) + 1);
        return random_getal;
    }

    public static int geefRandomIntTussenWaardes( int onderGrens, int bovenGrens) {
        int random_getal = (int)((Math.random() * ((bovenGrens - onderGrens) + 1)) + onderGrens);
        return random_getal;
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


        System.out.println( "Demo van Math" );

        System.out.println( "PI: " + Math.PI );

        System.out.println( "Machtsverheffen: " + Math.pow(2,10) );

        System.out.println( "Afronden: " + Math.round( 11.5 ) );

        System.out.println( "Floor: " + Math.floor( 11.5 ) );

        System.out.println( "Ceiling: " + Math.ceil( 11) );

        System.out.println( "PI afronden op 2 cijfers: " + Math.round(Math.PI*100) / 100.0);
        System.out.printf("PI %.2f\n", Math.PI);


        //methoden
        printHello();

        int getal = geefRandomIntTussen1en10();
        System.out.println("Mijn random getal is: "  + getal);

        int getal2 = geefRandomIntTussenWaardes( 1, 6 );
        System.out.println("Mijn random getal is: "  + getal2);

    }
}
