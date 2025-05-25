package model;

public abstract class Figuur {
    protected static final double GRENSWAARDE_GROOT_FIGUUR = (double)100.0F;
    protected static final String DEFAULT_WAARDE_KLEUR = "wit";
    protected String kleur;

    public Figuur(String kleur) {
        this.kleur = kleur;
    }

    public Figuur() {
        this("wit");
    }

    public static String geefDefinitie() {
        return "Een figuur is een verzameling punten";
    }

    public abstract double geefOmtrek();
    public abstract double geefOppervlakte();

    public String vertelOverGrootte() {
        return this.geefOppervlakte() > (double)100.0F ? "Groot figuur" : "Klein figuur";
    }

    public void setKleur(String kleur) {
        this.kleur = kleur;
    }

    public String getKleur() {
        return this.kleur;
    }

    public String toString() {
        String var10000 = this.kleur;
        return "Kleur: " + var10000 + "\nOmtrek: " + this.geefOmtrek() + "\nOppervlakte: " + this.geefOppervlakte();
    }
}
