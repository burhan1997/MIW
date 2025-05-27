package model;

public class Auto {

    private String kenteken;
    private String merk;
    private String klasse;

    public Auto(String kenteken, String merk, String klasse) {
        this.kenteken = kenteken;
        this.merk = merk;
        this.klasse = klasse;
    }

    public String getKlasse() {
        return klasse;
    }

    @Override
    public String toString() {
        return String.format("Auto: kenteken %s, merk %s, klasse %s", kenteken, merk, klasse);
    }
}
