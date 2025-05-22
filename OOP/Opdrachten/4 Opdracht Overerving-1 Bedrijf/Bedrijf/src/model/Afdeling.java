

package model;

public class Afdeling {
    private String afdelingsNaam;
    private String afdelingsPlaats;

    public Afdeling(String afdelingsNaam, String afdelingsPlaats) {
        this.afdelingsNaam = afdelingsNaam;
        this.afdelingsPlaats = afdelingsPlaats;
    }

    @Override
    public String toString() {
        return "afdeling " + afdelingsNaam + " te " + afdelingsPlaats ;
    }

    public Afdeling() {
        this("Onbekend", "Onbekend");
    }

    public String getAfdelingsNaam() {
        return this.afdelingsNaam;
    }

    public void setAfdelingsNaam(String afdelingsNaam) {
        this.afdelingsNaam = afdelingsNaam;
    }

    public String getAfdelingsPlaats() {
        return this.afdelingsPlaats;
    }

    public void setAfdelingsPlaats(String afdelingsPlaats) {
        this.afdelingsPlaats = afdelingsPlaats;
    }
}
