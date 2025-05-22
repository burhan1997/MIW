package controller;

import model.Team;
import model.Wedstrijd;

import java.util.Scanner;

public class VoetbalScoresLauncher {
    public static void main(String[] args) {
        Team team1 = new Team("Twente", 15, 28, 12);
        team1.printStatusTeam();

        Team team2 = new Team("AJAX");
        Team team3 = new Team("Besiktas");

        Wedstrijd wedstrijd1 = new Wedstrijd(team2, team3, 5, 0);
        wedstrijd1.printUitslag();
        wedstrijd1.printWedstrijdPunten();

        Team[] teams = new Team[3];
        teams[0] = new Team("Galatasaray");
        teams[1] = new Team("Fenerbahce");
        teams[2] = new Team("Goztepe");


        Wedstrijd[] wedstrijds = new Wedstrijd[6];
        wedstrijds[0] = new Wedstrijd(teams[0], teams[1]);
        wedstrijds[1] = new Wedstrijd(teams[0], teams[2]);
        wedstrijds[2] = new Wedstrijd(teams[1], teams[2]);
        wedstrijds[3] = new Wedstrijd(teams[1], teams[0]);
        wedstrijds[4] = new Wedstrijd(teams[2], teams[0]);
        wedstrijds[5] = new Wedstrijd(teams[2], teams[1]);

        Scanner input = new Scanner(System.in);
        System.out.println();

        for (int i = 0; i < wedstrijds.length; i++) {
            System.out.print("Geef van de wedstrijd "
                    + wedstrijds[i].getThuisteam().getTeamNaam()
                    + " - "
                    + wedstrijds[i].getUitTeam().getTeamNaam()
                    + " de thuisdoelpunten: ");
            int antwoord = input.nextInt();

            wedstrijds[i].setThuisDoelPunten(antwoord);

            System.out.print("Geef van de wedstrijd "
                    + wedstrijds[i].getThuisteam().getTeamNaam()
                    + " - "
                    + wedstrijds[i].getUitTeam().getTeamNaam()
                    + " de uitdoelpunten: ");
            int antwoord2 = input.nextInt();

            wedstrijds[i].setUitDoelPunten(antwoord2);
            wedstrijds[i].setTotaalDoelpuntenTeams();
            wedstrijds[i].setWedstrijdPuntenThuisTeam();
            wedstrijds[i].setWedstrijdPuntenUitTeam();
        }

        for (int i = 0; i < wedstrijds.length; i++) {
            wedstrijds[i].printUitslag();
        }


        for (int i = 0; i < teams.length; i++) {
            teams[i].printStatusTeam();
        }

    }

}
