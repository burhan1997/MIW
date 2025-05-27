package controller;

import model.Auto;
import model.Autopolis;
import model.Verzekeringskantoor;
import model.WA_Polis;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class VerzekeringskantoorLauncher {

    public static void main(String[] args) {
        // Lijst met Auto"s maken voor AutoPolissen
        List<Auto> autoLijst = new ArrayList<>();
        autoLijst.add(new Auto("7-THT-78","Toyota","hybrid"));
        autoLijst.add(new Auto("70-HN-KL","Renault","benzine"));
        autoLijst.add(new Auto("GP-GL-46","Mercedes", "diesel"));
        autoLijst.add(new Auto("RX-462-G","Tesla","electrisch"));
        autoLijst.add(new Auto("25-ZK-FK","Dacia","benzine"));
        autoLijst.add(new Auto("34-XL-KG","Skoda","diesel"));
        autoLijst.add(new Auto("56-HFZ-2","Mitsubishi","hybrid"));
        autoLijst.add(new Auto("TP-639-X","Tesla","electrisch"));
        autoLijst.add(new Auto("ST-857-F","Renault","electrisch"));


        //Geef een welkomstboodschap met je naam
        System.out.println("Welkom bij de Verzekeringsmaatschappij!");
        System.out.println("Naam: Burhan Elaldi");
        System.out.println();


        //Laat zien dat een polis een foutmelding geeft als de ingevoerde eigen risico categorie onjuist is.
        System.out.println("Test 1 - Ongeldige eigen risico categorie:");
        WA_Polis ongeldigeRisicoPolis = new WA_Polis("Tom Poes", 1000000, LocalDate.of(2021, 9, 1), -1, 4);
        System.out.println(ongeldigeRisicoPolis);
        System.out.println();


        WA_Polis bijvoorbeeld = new WA_Polis("Robert Ali", 25000);
        System.out.println(bijvoorbeeld);
        System.out.println();


        //Laat zien dat een autopolis een foutmelding geeft als het aantal schadevrije jaren te laag is.
        System.out.println("Test 2 - Te lage schadevrije jaren:");
        Auto auto1 = new Auto("JL-223-P", "Citroën", "electrisch");
        Autopolis teLageSchadevrijePolis = new Autopolis("Wammes Waggel", 12000, LocalDate.of(2021, 7, 31), 2, auto1, -3);
        System.out.println(teLageSchadevrijePolis);
        System.out.println();


        //Laat zien dat een autopolis een foutmelding geeft als het aantal schadevrije jaren te hoog is.
        System.out.println("Test 3 - Te hoge schadevrije jaren:");
        Auto auto2 = new Auto("BR-212-A", "TeslaGwagon", "benzine");
        Autopolis teHoogSchadevrijePolis = new Autopolis("Burhan Elaldi", 12000, LocalDate.of(2021, 7, 31), 2, auto2, 45);
        System.out.println(teHoogSchadevrijePolis);
        System.out.println();

        //Laat zien dat je polissen kunt toevoegen aan een verzekeringskantoor, voeg tenminste drie
        //polissen toe.

        Auto auto3 = new Auto("KL-999-X", "Tesla", "benzine");
        Autopolis geldigeAutoPolis = new Autopolis("Piet Piraat", 20000, LocalDate.of(2022, 1, 15), 1, auto3, 6);
        WA_Polis geldigeWAPolis = new WA_Polis("Minoes", 500000, LocalDate.of(2023, 4, 20), 3, 2);
        System.out.println(auto3);
        System.out.println(geldigeAutoPolis);
        System.out.println(geldigeWAPolis);
        System.out.println();

        Verzekeringskantoor kantoor1 = new Verzekeringskantoor("Deloitte", "Ams-Zuid");
        Verzekeringskantoor kantoor2 = new Verzekeringskantoor("NN", "Den Haag");
        Verzekeringskantoor kantoor3 = new Verzekeringskantoor("Alias", "Utrecht");


        kantoor1.voegPolisToe(geldigeWAPolis);
        kantoor2.voegPolisToe(geldigeAutoPolis);
        kantoor3.voegPolisToe(geldigeWAPolis);
        System.out.println(kantoor1);
        System.out.println(kantoor2);
        System.out.println(kantoor3);

        // We hebben tot nu toe alle toString() methodes gecheckt.

        //Voeg een methode toe aan de Launcher die de auto’s van een bepaald type print. Geef de
        //methode de signature public static void toonTypeAutos(List<Auto>
        //autoLijst, String type). Roep de methode aan om van de autoLijst alle ‘electrische’
        //auto’s te tonen.

        toonTypeAutos(autoLijst, "electrisch");

    }
    public static void toonTypeAutos(List<Auto> autoLijst, String type) {
        System.out.println("Auto's van het type \"" + type + "\":");
        for (Auto auto : autoLijst) {
            if (auto.getKlasse().equalsIgnoreCase(type)) {
                System.out.println(auto);
            }
        }
        System.out.println();
    }

}