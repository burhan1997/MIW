package controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import model.*;

public class VerhuurLauncher {

    final static int AANTAL_VALKEN = 5;
    final static int LENGTE_VALK = 6;

    public static void main(String[] args) {
        List<Boot> valken = new ArrayList<>();
        for (int valkNummer = 0; valkNummer < AANTAL_VALKEN; valkNummer++) {
            valken.add(new ZeilBoot("Valk " + (valkNummer + 1), LENGTE_VALK));
        }

        System.out.println("Dit is de uitwerking van O.B. Bommel.");
        System.out.println();

        // Test toString() Klant
        Klant jan = new Klant("Jan de Boer");
        System.out.println(jan);
        System.out.println();

        // Test toevoegen Motorboot met negatieve lengte en de toString()
        MotorBoot motorBoot1 = new MotorBoot("De Engel", -3, 15);
        System.out.println(motorBoot1);

        // Test toString() Zeilboot
        ZeilBoot zeilBoot1 = new ZeilBoot("Schoener 1", 20);
        System.out.println(zeilBoot1);

        // Test toevoegen boot aan Verhuur met foutmelding en de toString()
        Verhuur verhuurJan = new Verhuur(jan, LocalDate.parse("2020-12-03"), 5);
        // toString() voor lege verhuur
        System.out.println(verhuurJan);
        System.out.println();

        // Foutmelding Susy mag niet verhuurd worden
        MotorBoot susy = new MotorBoot("Suzy Q", 11, 21);
        verhuurJan.voegBootToe(susy);

        // Voeg een goede boot toe en test de verhuur
        verhuurJan.voegBootToe(motorBoot1);
        System.out.println(verhuurJan);
        System.out.println();

        // Toevoegen verschillende boten aan klant met vaarbewijs
        Klant vanDerValk = new Klant("van der Valk", "valk@valkmail.com", true);
        Verhuur verhuurValk = new Verhuur(vanDerValk, LocalDate.parse("2020-12-10"), 7);
        verhuurValk.voegBootToe(motorBoot1);
        for (Boot boot : valken) {
            verhuurValk.voegBootToe(boot);
        }
        verhuurValk.voegBootToe(zeilBoot1);
        verhuurValk.voegBootToe(susy);
        System.out.println(verhuurValk);
        System.out.println();
    }

}
