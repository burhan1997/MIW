package model;

public class Koets extends Voertuig{

    private int aantalPaarden;
    protected static final int AANTAL_WIELEN = 4;

    public Koets(String merk, String type, int gewicht, int aantalPaarden) {
        super(merk, type, AANTAL_WIELEN, gewicht);
        this.aantalPaarden = aantalPaarden;
    }

    public int getAantalPaarden() {
        return aantalPaarden;
    }

    public void setAantalPaarden(int aantalPaarden) {
        this.aantalPaarden = aantalPaarden;
    }

    @Override
    public String geefAandrijfKracht() {
        return this.aantalPaarden + " paard" + (this.aantalPaarden > 1 ? "en": "") ;
    }



}
