package controller;

import java.util.Scanner;

public class OefeningLauncher {
    public static void main(String[] args) {
        // declaratie
        int[] getallen;
        //instantiatie
        getallen =  new int[5];

        int [] legeArray = new int[0];

        // initialisatie (vullen)
        getallen[0] = 5;
        getallen[1] = 3;
        getallen[2] = 5;
        getallen[3] = -7;
        getallen[4] = 100;
        System.out.println(getallen[1]);

        // Alternatief, alles in één keer
        int[] getallen2 = {5, 3, 3, -7, 100};

        double[] kommagetallen = {9.4,  8.6, 3.5, -2.4, 6, 7.6, -10.2};
        String[] dagenVanDeWeek = {"ma", "di", "wo", "do", "vr", "za", "zo"};

        System.out.println(getallen[4]);
        System.out.println(kommagetallen[2]);
        System.out.println(dagenVanDeWeek[3]);
        // System.out.println(kommagetallen); //dit werkt niet

        //print array
        for(int i=0; i < getallen.length; i++){
            System.out.println( i + " " + getallen[ i ]);
        }

        // een rij van 8 getallen vullen met random getallen tussen 1 en 6
        int AANTAL = 8;
        int[] getallen3 = new int[AANTAL];
        for (int i=0; i<AANTAL; i++){
            getallen[i] = (int) (Math.random() * 6) + 1;
        }

        // ERROR: voorbij de grens van de array gaan
        // getallen[6] =10;
        // System.out.println(getallen[10]);

        for (int i=0; i < kommagetallen.length; i++){
            System.out.println(kommagetallen[i]);
        }

        // Lees x getallen (double) van invoer, print de som

        double[] cijfers = geefCijfers(2);
        double maximum = bepaalMaximum(cijfers);
        System.out.println("het maximum is " + maximum);
    }

    public static double[] geefCijfers(int aantal){
        Scanner invoer = new Scanner(System.in);
        double[] ingevoerCijfers = new double[aantal];
        //do something
        for ( int i=0; i < aantal; i++){
            System.out.printf("Geef een getal (%d) : ", i+1);
            ingevoerCijfers[ i ] = invoer.nextDouble();

        }
        return ingevoerCijfers;
    }
    public static double bepaalMaximum(double[] waarden){
        double maximum = waarden[0];
        //do something
        for ( int i=0; i < waarden.length; i++){
            if (waarden[i] > maximum ){
                maximum = waarden[i];
            }
        }
        return maximum;
    }
}

