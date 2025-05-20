package controller;

import model.Kofferslot;

public class KofferslotLauncher {
    public static void main(String[] args) {
        Kofferslot slot1 = new Kofferslot();
        System.out.println("Default constructor test:");
        System.out.println("eersteLetter: " + slot1.getEersteLetter());
        System.out.println("tweedeLetter: " + slot1.getTweedeLetter());
        System.out.println("cijfer: " + slot1.getCijfer());
        System.out.println(slot1.getEersteLetter() + "" + slot1.getTweedeLetter() + slot1.getCijfer());

        System.out.println();

        Kofferslot slot2 = new Kofferslot('B', 'R', 9);
        System.out.println("All args constructor test:");
        System.out.println("eersteLetter: " + slot2.getEersteLetter());
        System.out.println("tweedeLetter: " + slot2.getTweedeLetter());
        System.out.println("cijfer: " + slot2.getCijfer());
        System.out.println(slot2.getEersteLetter() + "" + slot2.getTweedeLetter() + slot2.getCijfer());


        System.out.println();

        Kofferslot slot3 = new Kofferslot('A', 'A', 0);
        System.out.println("Volgende methode test: ");
        slot3.volgende();
        System.out.println("AA0 volgende: " + slot3.getEersteLetter() + "" + slot3.getTweedeLetter() + slot3.getCijfer());
    }
}
