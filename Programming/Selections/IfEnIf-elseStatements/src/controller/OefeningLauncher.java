package controller;

import java.util.Scanner;

public class OefeningLauncher {
    public static void main(String[] args) {
        //Schrijf een programma dat vraagt om een leeftijd en teruggeeft of je al mag stemmen
        //(vanaf 18 jaar) of niet.
        Scanner input = new Scanner(System.in);
        System.out.print("Wat is je leeftijd?: ");
        int leeftijd = input.nextInt();
        if (leeftijd >= 18) {
            System.out.println("Je mag stemmen!");
        } else {
            System.out.println("Je mag niet stemmen!");
        }

        //Schrijf een programma dat vraagt om een getal te raden (b.v. onder de 10) dat de computer
        //"in gedachte heeft". Mogelijke antwoorden zijn "Goed!", "Jammer: te laag" of "Jammer: te
        //hoog", gevolgd door wat het te raden getal is.
        System.out.print("Raad de getal: ");
        int getal = input.nextInt();
        final int MAX = 10;
        final int MIN = 1;
        int computerGetal = (int) ((Math.random() * (MAX - MIN + 1)) + MIN);
        if (getal == computerGetal) {
            System.out.println("Goed! Hetzelfde met onze getal die is ook " + computerGetal);
        } else if (getal < computerGetal) {
            System.out.println("Jammer: te hoog, onze getal was " + computerGetal);
        } else {
            System.out.println("Jammer: te laag, onze getal was " + computerGetal);

        }

        //Schrijf nu een programma dat vraagt om een leeftijd en teruggeeft of je verplicht naar school
        //moet (vanaf 4 jaar tot je 16e) of niet. Doe dit met 1 if statement.
        System.out.print("Wat is je leeftijd want we gaan even kijken dat je verplicht bent naar school of niet?: ");
        int jeLeeftijd = input.nextInt();
        if (jeLeeftijd >= 4 && jeLeeftijd <= 16) {
            System.out.println("Whoppaa!!Je bent verplicht naar school :)");
        } else {
            System.out.println("Je bent niet verplicht. Jammer");
        }


        //Strings vergelijken
        input.nextLine();
        System.out.print("Geef een naam van een programma : ");
        String tekst = input.nextLine();

        String programma = "java";

        if (tekst.trim().equals(programma)) {
            System.out.println("Dit is het juiste antwoord!");
        } else {
            System.out.println("Dit is niet het juiste antwoord!");
        }

        //ternary operator
        System.out.print("Geef een num: ");
        int num = input.nextInt();
        System.out.println((num % 2 == 0) ? "num is even" : "num is odd");


        //Schrijf een programma dat vraagt om een weekdag (1 – 7) en de weekdag teruggeeft
        //(maandag – zondag), of anders (als de gebruiker geen 1 – 7 invoert) een "onbekende dag".
        input.nextLine();
        System.out.print("Geef een nummer tussen 1-7: ");
        int numDag = input.nextInt();
        switch (numDag) {
            case 1:
                System.out.println("Maandag");
                break;
            case 2:
                System.out.println("Dinsdag");
                break;
            case 3:
                System.out.println("Woensdag");
                break;
            case 4:
                System.out.println("Donderdag");
                break;
            case 5:
                System.out.println("Vrijdag");
                break;
            case 6:
                System.out.println("Zaterdag");
                break;
            case 7:
                System.out.println("Zondag");
                break;
            default:
                System.out.println("Onbekende dag nummer");
        }


        //voorbeeld
        System.out.print("De hoeveelste maand is het? ");
        int nummerMaand = input.nextInt();
        String maandNaam = "onbekend";
        switch (nummerMaand) {
            case 1:
                maandNaam = "Januari";
                break;
            case 2:
                maandNaam = "Februari";
                break;
            case 3:
                maandNaam = "Maart";
                break;
            default:
                System.out.println("Geen geldig maandnummer");
        }
        System.out.println("Het is " + maandNaam);
    }

/*
            case 1 -> maandNaam = "Januari";
            case 2 -> maandNaam = "Februari";
            case 3 -> maandNaam = "Maart";
            default -> maandNaam = "onbekend";
        }
        System.out.println("Het is " + maandNaam);


 */
}


