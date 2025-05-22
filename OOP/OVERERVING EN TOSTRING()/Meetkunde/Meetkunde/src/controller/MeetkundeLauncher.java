package controller;

import model.Cirkel;
import model.Punt;
import model.Rechthoek;

public class MeetkundeLauncher {
    public static void main(String[] args) {

//        Cirkel mijnAllArgsCirkel = new Cirkel(3, new Punt(1, 4), "groen");
//        System.out.println(mijnAllArgsCirkel.geefOmtrek());
//        System.out.println(mijnAllArgsCirkel.geefOppervlakte());
//
//        Cirkel mijnDefaultCirkel = new Cirkel();
//        System.out.println(mijnDefaultCirkel.geefOmtrek());
//        System.out.println(mijnDefaultCirkel.geefOppervlakte());
//
//        Cirkel mijnStraalCirkel = new Cirkel(6);
//        System.out.println(mijnStraalCirkel.geefOmtrek());
//        System.out.println(mijnStraalCirkel.geefOppervlakte());
//
//        mijnDefaultCirkel.setStraal(-3);
//
//        Cirkel mijnNegatieveCirkel = new Cirkel(-10);
//        System.out.println("Straal: " + mijnNegatieveCirkel.getStraal());
//        mijnNegatieveCirkel.setStraal(-10);

        // Cirkel tipinde 3 elemanlı bir dizi oluşturduk
        Cirkel[] mijnCirkelArray = new Cirkel[3];

        mijnCirkelArray[0] = new Cirkel(3, new Punt(1, 4), "groen");

        mijnCirkelArray[1] = new Cirkel();

        mijnCirkelArray[2] = new Cirkel(6);

        for (int arrayTeller = 0; arrayTeller < mijnCirkelArray.length; arrayTeller++) {
            System.out.println(mijnCirkelArray[arrayTeller].geefOmtrek());
            System.out.println(mijnCirkelArray[arrayTeller].geefOppervlakte());
            System.out.println(mijnCirkelArray[arrayTeller].getMiddelpunt().getxCoordinaat());
            System.out.println(mijnCirkelArray[arrayTeller].getMiddelpunt().getyCoordinaat());


            System.out.println(mijnCirkelArray[arrayTeller].vertelOverGrootte());
            System.out.println(mijnCirkelArray[arrayTeller]);

        }



        System.out.println();
        System.out.println(Rechthoek.geefDefinitie());
        Rechthoek[] mijnRechthoekArray = new Rechthoek[3];
        mijnRechthoekArray[0] = new Rechthoek(4, 3, new Punt(2, 5), "blauw");
        mijnRechthoekArray[1] = new Rechthoek();
        mijnRechthoekArray[2] = new Rechthoek(25, 10);

        for (int i = 0; i < mijnRechthoekArray.length; i++) {
            System.out.println(mijnRechthoekArray[i]);
            System.out.println(mijnRechthoekArray[i].vertelOverGrootte());
        }


        Punt testPunt = new Punt(2.0, 3.5);
        System.out.println(testPunt);


    }
}
