package model;

public class Klant {
    private String naam;
    private String emailadres;
    private boolean vaarVaardig;

    public void setVaarVaardig(boolean vaarVaardig) {
        this.vaarVaardig = vaarVaardig;
    }

    public Klant(String naam, String emailadres, boolean vaarVaardig) {
        this.naam = naam;
        this.emailadres = emailadres;
        this.vaarVaardig = vaarVaardig;
    }

    public Klant(String naam) {
        this(naam, "onbekend", false);
    }

    public Klant() {
        this("onbekend");
    }

    public boolean isVaarVaardig() {
        return vaarVaardig;
    }

    @Override
    public String toString() {
        return "Klant " + getNaam();
    }

    public String getNaam() {
        return naam;
    }

    public String getEmailadres() {
        return emailadres;
    }
}
