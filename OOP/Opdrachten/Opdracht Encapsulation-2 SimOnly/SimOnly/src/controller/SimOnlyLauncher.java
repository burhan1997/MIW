package controller;

import model.Verbruik;

import java.util.Scanner;

public class SimOnlyLauncher {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Verbruik augustusVerbruik = new Verbruik("Augustus", 4563);
        System.out.println(augustusVerbruik.berekenKosten());
        augustusVerbruik.toonVerbruik();

        Verbruik[] maandArray = new Verbruik[4];
        maandArray[0] = new Verbruik("Juli");
        maandArray[1] = new Verbruik("Augustus");
        maandArray[2] = new Verbruik("September");
        maandArray[3] = new Verbruik("October");

        for (int arrayTeller = 0; arrayTeller < maandArray.length;
             arrayTeller++) {
            System.out.print("Geef het verbruik in MB voor de maand " + maandArray[arrayTeller].getMaand() + ": ");
            int mb = input.nextInt();
            maandArray[ arrayTeller ].setHoeveelheidMb(mb);
        }

        for (int arrayTeller = 0; arrayTeller < maandArray.length;
             arrayTeller++){
            maandArray[arrayTeller].berekenKosten();
        }


        System.out.printf("\n%-10s %-7s %-7s\n", "MAAND", "MB", "KOSTEN");

        for (int arrayTeller = 0; arrayTeller < maandArray.length;
             arrayTeller++){
            maandArray[arrayTeller].toonVerbruik();
        }
    }
}
