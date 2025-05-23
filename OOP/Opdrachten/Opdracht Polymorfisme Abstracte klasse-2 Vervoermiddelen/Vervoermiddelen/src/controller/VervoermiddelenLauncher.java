package controller;

import model.*;

public class VervoermiddelenLauncher {
    public static void main(String[] args) {


        Koets koets = new Koets("Glinkowsk", "marathonwage", 320, 2);
        Auto auto = new Auto("Dacia", "Logan MPV", 1150, "benzin");
        Fiets fiets = new Fiets("Koga Mijata", "Colmaro Race Ultegra", 9);
        Zeilboot zeilboot = new Zeilboot("Dufour", "36 Classic", 11.5);
        Motorboot motorboot = new Motorboot("Broesder", "Kotter",  13.75, "diesel");


        Vervoermiddel[] vervoermiddelen = new Vervoermiddel[] {
                koets, auto, fiets, zeilboot, motorboot
        };

        for (Vervoermiddel vm : vervoermiddelen) {
            System.out.println(vm);
        }

//        Koets koets = new Koets("Glinkowsk", "marathonwage", 320, 2);
//        System.out.println(koets);
//
//        Auto auto = new Auto("Dacia", "Logan MPV", 1150, "benzin");
//        System.out.println(auto);
//
//        Fiets fiets = new Fiets("Koga Mijata", "Colmaro Race Ultegra", 9);
//        System.out.println(fiets);
//
//        Zeilboot zeilboot = new Zeilboot("Dufour", "36 Classic", 11.5);
//        System.out.println(zeilboot);
//
//        Motorboot motorboot = new Motorboot("Broesder", "Kotter",  13.75, "diesel");
//        System.out.println(motorboot);

    }
}
