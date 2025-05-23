package model;

public abstract class Voertuig extends Vervoermiddel {
    private int aantalWielen;
    private int gewicht;

    public Voertuig(String merk, String type, int aantalWielen, int gewicht) {
        super(merk, type);
        this.aantalWielen = aantalWielen;
        this.gewicht = gewicht;
    }

    public int getAantalWielen() {
        return aantalWielen;
    }

    public void setAantalWielen(int aantalWielen) {
        this.aantalWielen = aantalWielen;
    }

    public int getGewicht() {
        return gewicht;
    }

    public void setGewicht(int gewicht) {
        this.gewicht = gewicht;
    }
}
