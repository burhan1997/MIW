package controller;
import model.ParkeerBoete;
import model.SnelheidsBoete;

public class VerkeersboetesLauncher {
    public static void main(String[] args) {
        // Parkeerboetes
        ParkeerBoete pb1 = new ParkeerBoete("Jan Smit", "04-SPZ-8", 1);
        ParkeerBoete pb2 = new ParkeerBoete("Eva Janssen", "11-AA-22", 2);
        ParkeerBoete pb3 = new ParkeerBoete("Tom de Boer", "33-BB-44", 3);
        ParkeerBoete pb4 = new ParkeerBoete("Piet", "ZZ-99-ZZ", 5); // onbekende zone
        ParkeerBoete pb5 = new ParkeerBoete("onbekend", "onbekend", 1);
        ParkeerBoete pb6 = new ParkeerBoete("Anna", "XY-12-XY", 0);
        ParkeerBoete pb7 = new ParkeerBoete("Mark", "AA-11-AA", 2);
        ParkeerBoete pb8 = new ParkeerBoete("Sven", "VV-22-VV", 3);

        // Snelheidsboetes
        SnelheidsBoete sb1 = new SnelheidsBoete("Kees", "KL-10-XY", 55, 50); // +5
        SnelheidsBoete sb2 = new SnelheidsBoete("Lisa", "XZ-88-XX", 70, 50); // +20
        SnelheidsBoete sb3 = new SnelheidsBoete("Ahmed", "QW-12-ZX", 90, 50); // +40
        SnelheidsBoete sb4 = new SnelheidsBoete("Sophie", "GH-66-GH", 50, 50); // 0
        SnelheidsBoete sb5 = new SnelheidsBoete("Johan", "MN-44-OP", 65, 65); // 0
        SnelheidsBoete sb6 = new SnelheidsBoete("Timo", "RT-55-UI", 110, 100); // +10
        SnelheidsBoete sb7 = new SnelheidsBoete("Ali", "BN-99-CC", 130, 100); // +30

        // Print alles
        System.out.println(pb1);
        System.out.println(pb2);
        System.out.println(pb3);
        System.out.println(pb4);
        System.out.println(pb5);
        System.out.println(pb6);
        System.out.println(pb7);
        System.out.println(pb8);

        System.out.println(sb1);
        System.out.println(sb2);
        System.out.println(sb3);
        System.out.println(sb4);
        System.out.println(sb5);
        System.out.println(sb6);
        System.out.println(sb7);
    }
}
