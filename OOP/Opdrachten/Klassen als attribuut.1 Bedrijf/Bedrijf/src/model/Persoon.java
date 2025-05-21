package model;

public class Persoon {

    public static final double GRENSWAARDE_BONUS = 4500.00;
    public static int aantalPersonen;
    private int personeelsNummer;
    private String naam;
    private String woonplaats;
    private double maandSalaris;
    private Afdeling afdeling;

    public Afdeling getAfdeling() {
        return afdeling;
    }

    public void setAfdeling(Afdeling afdeling) {
        this.afdeling = afdeling;
    }

    public int getPersoneelsNummer() {
        return personeelsNummer;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getWoonplaats() {
        return woonplaats;
    }

    public void setWoonplaats(String woonplaats) {
        this.woonplaats = woonplaats;
    }

    public double getMaandSalaris() {
        return maandSalaris;
    }


    public void setMaandSalaris(double salaris) {
        if (salaris < 0) {
            System.out.println("Fout: Het maandsalaris kan niet negatief zijn. Het wordt op 0 gezet.");
            this.maandSalaris = 0;
        } else {
            this.maandSalaris = salaris;
        }
    }

    public Persoon(String naam, String woonplaats, double maandSalaris, Afdeling afdeling) {
        this.naam = naam;
        this.woonplaats = woonplaats;
        setMaandSalaris(maandSalaris);
        this.personeelsNummer = ++aantalPersonen;
        this.afdeling = afdeling;
    }

    public Persoon(String naam) {
        this(naam, "Onbekend", 0, new Afdeling() );
    }

    public Persoon() {
        this("Onbekend");
    }

    public double berekenJaarInkomen() {
        return 12 * maandSalaris;
    }

    public boolean heeftRechtOpBonus(){
        return maandSalaris >= GRENSWAARDE_BONUS;
    }
}
