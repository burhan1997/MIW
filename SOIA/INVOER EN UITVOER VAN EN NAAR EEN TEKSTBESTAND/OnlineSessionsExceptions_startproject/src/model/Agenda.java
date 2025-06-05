package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Agenda {

    private List<Session> sessions;
    private int maand;
    private int jaar;

    public Agenda(int maand, int jaar) {
        this.maand = maand;
        this.jaar = jaar;
        sessions = new ArrayList<>();
    }


    public void voegSessionToe(Session session)  {
        if (session.getDatum().getMonthValue() != maand ||
                session.getDatum().getYear() != jaar) {
            System.out.println("Deze session wordt niet toegevoegd, verkeerde maand en/of jaar!");
        } else {
            sessions.add(session);
        }
    }


    @Override
    public String toString() {
        Collections.sort(sessions);
        StringBuilder result = new StringBuilder();
        for (Session session : sessions) {
            result.append(session + "\n");
        }
        return result.toString();
    }

    public int getMaand() {
        return maand;
    }

    public int getJaar() {
        return jaar;
    }
}
