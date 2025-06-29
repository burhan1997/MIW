package controller;

import model.*;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SessionsLauncher {

    public static void main(String[] args) {
//        List<Technicus> techniciLijst = new ArrayList<>();
//        techniciLijst.add(new Technicus("bontj","Jan","0625748231"));
//        techniciLijst.add(new Technicus("dijkd","Dick","0653623418"));
//        techniciLijst.add(new Technicus("johna","Albert","0656237822"));
//        techniciLijst.add(new Technicus("kompe","Pete","0625367188"));
//
//
//        File uitvoerBestand = new File("resources/Technici.txt");
//        try {
//            PrintWriter printWriter = new PrintWriter(uitvoerBestand);
//            for (Technicus tekky : techniciLijst) {
//                printWriter.println(tekky);
//                printWriter.println();
//            }
//            printWriter.close();
//        } catch (FileNotFoundException nietGemaakt) {
//            System.out.println("Het bestand kan niet worden aangemaakt.");
//        }


        // +++++++++

        List<String> regelsUitBestand = new ArrayList<>();
        File muzikantenBestand = new File("resources/Muzikanten.csv");
        try {
            Scanner invoer = new Scanner(muzikantenBestand);
            while (invoer.hasNextLine()) { //(1)
                regelsUitBestand.add(invoer.nextLine()); //(2)
            }
        } catch (FileNotFoundException nietGevonden) {
            System.out.println("Het bestand is niet gevonden.");
        }
        if (regelsUitBestand.size() > 0) {
            List<Muzikant> muzikanten = new ArrayList<>();
            for (int index = 0; index < regelsUitBestand.size(); index++) {
                String[] regelArray = regelsUitBestand.get(index).
                        split(","); // (3)
                String naam = regelArray[0];
                String instrument = regelArray[1];
                int jaarErvaring = Integer.parseInt(regelArray[2]);
                muzikanten.add(new Muzikant(naam, instrument, jaarErvaring)); //(4)
            }
            for (Muzikant muzikant : muzikanten) {
                System.out.println(muzikant);
                System.out.println();
            }
        }

//         File muzikantenBestand = new File("resources/Muzikanten.csv");
//        List<Muzikant> muzikanten = new ArrayList<>();
//        try {
//            Scanner invoer = new Scanner(muzikantenBestand);
//            while (invoer.hasNextLine()) {
//                String[] regelArray = invoer.nextLine().split(",");
//                String naam = regelArray[0];
//                String instrument = regelArray[1];
//                int jaarErvaring = Integer.parseInt(regelArray[2]);
//                muzikanten.add(new Muzikant(naam, instrument, jaarErvaring));
//            }
//        } catch (FileNotFoundException nietGevonden) {
//            System.out.println("Het bestand is niet gevonden.");
//        }
//        for (Muzikant muzikant : muzikanten) {
//            System.out.println(muzikant);
//            System.out.println();
//        }



        File sessionsBestand = new File("resources/Sessions.csv");
        List<Session> sessions = new ArrayList<>();

        try {
            Scanner invoer = new Scanner(sessionsBestand);
            while (invoer.hasNextLine()) { //(1)
                String regel = invoer.nextLine(); // ← sadece bir kez oku
                regelsUitBestand.add(regel);      // ← listeye eklemek istiyorsan

                String[] regelArray = regel.split(",");

                // Muzikant
                String naam = regelArray[0];
                String instrument = regelArray[1];
                int jaarErvaring = Integer.parseInt(regelArray[2]);

                Muzikant muzikant = new Muzikant(naam, instrument, jaarErvaring);

                // Session
                LocalDate datum = LocalDate.parse(regelArray[3]);
                double duur = Double.parseDouble(regelArray[4]);
                boolean opgenomen = Boolean.parseBoolean(regelArray[5]);
                int aantalMuzikanten = Integer.parseInt(regelArray[6]);

                Session session = new Session(muzikant, datum, duur, opgenomen, aantalMuzikanten);
                sessions.add(session);

            }
        } catch (FileNotFoundException nietGevonden) {
            System.out.println("Het bestand is niet gevonden.");
        }
        for (Session session : sessions){
            System.out.println(session);
            System.out.println();
        }

    }
}
