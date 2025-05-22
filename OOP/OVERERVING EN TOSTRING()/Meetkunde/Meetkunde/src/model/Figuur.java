package model;

public class Figuur {
    protected final static double GRENSWAARDE_GROOT_FIGUUR = 100.0;
    protected final static String DEFAULT_WAARDE_KLEUR = "wit";
    protected String kleur;

    public Figuur(String kleur) {
        this.kleur = kleur;
    }

    public Figuur() {
        this(DEFAULT_WAARDE_KLEUR);
    }

    public static String geefDefinitie() {
        return "Een figuur is een verzameling punten";
    }


    public double geefOmtrek(){
        return 0;
    }
    public double geefOppervlakte(){
        return 0;
    }

    public String vertelOverGrootte() {
        if (geefOppervlakte() > GRENSWAARDE_GROOT_FIGUUR) {
            return "Groot figuur";
        } else {
            return "Klein figuur";
        }
    }

    public void setKleur(String kleur) {
        this.kleur = kleur;
    }

    public String getKleur() {
        return kleur;
    }

    @Override
    public String toString() {
        return "Kleur: " + kleur + "\nOmtrek: " + geefOmtrek() +
                "\nOppervlakte: " + geefOppervlakte();
    }

}
