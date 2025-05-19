package controller;

import model.Cirkel;

public class MeetkundeLauncher {
    public static void main(String[] args) {

        Cirkel mijnAllArgsCirkel = new Cirkel(3, 1, 4, "groen");
        System.out.println(mijnAllArgsCirkel.geefOmtrek());
        System.out.println(mijnAllArgsCirkel.geefOppervlakte());
        Cirkel mijnDefaultCirkel = new Cirkel();
        System.out.println(mijnDefaultCirkel.geefOmtrek());
        System.out.println(mijnDefaultCirkel.geefOppervlakte());
        Cirkel mijnStraalCirkel = new Cirkel(6);
        System.out.println(mijnStraalCirkel.geefOmtrek());
        System.out.println(mijnStraalCirkel.geefOppervlakte());

        mijnDefaultCirkel.setStraal(-3);

        Cirkel mijnNegatieveCirkel = new Cirkel(-10);
        System.out.println("Straal: " + mijnNegatieveCirkel.getStraal());
        mijnNegatieveCirkel.setStraal(-10);

        // Cirkel tipinde 3 elemanlı bir dizi oluşturduk
        Cirkel[] mijnCirkelArray = new Cirkel[3];

        // İlk eleman 3 parametreli constructor ile oluşturuldu
        mijnCirkelArray[0] = new Cirkel(3, 1, 4, "groen");

        // İkinci eleman default constructor ile oluşturuldu
        mijnCirkelArray[1] = new Cirkel();

        // Üçüncü eleman tek parametreli constructor ile oluşturuldu
        mijnCirkelArray[2] = new Cirkel(6);

        // Dizideki her bir eleman (Cirkel nesnesi) için döngü
        for (int arrayTeller = 0; arrayTeller < mijnCirkelArray.length; arrayTeller++) {
            System.out.println(mijnCirkelArray[arrayTeller].geefOmtrek());       // Çevreyi yazdır
            System.out.println(mijnCirkelArray[arrayTeller].geefOppervlakte());  // Alanı yazdır
        }


    }
}
