//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package model;

public class Cirkel extends Figuur {
    private double straal;
    private Punt middelpunt;

    public Cirkel(double straal, Punt middelpunt, String kleur) {
        super(kleur);
        this.straal = straal;
        this.middelpunt = middelpunt;
    }

    public Cirkel(double straal) {
        this(straal, new Punt(), "wit");
    }

    public Cirkel() {
        this((double)1.0F);
    }

    public double getStraal() {
        return this.straal;
    }

    public void setStraal(double straal) {
        if (straal <= (double)0.0F) {
            System.out.println("De straal moet positief zijn. De straal wordt op 1 gezet");
            this.straal = (double)1.0F;
        } else {
            this.straal = straal;
        }

    }

    public Punt getMiddelpunt() {
        return this.middelpunt;
    }

    public void setMiddelpunt(Punt middelpunt) {
        this.middelpunt = middelpunt;
    }

    public double geefOmtrek() {
        return (Math.PI * 2D) * this.straal;
    }

    public double geefOppervlakte() {
        return Math.PI * this.straal * this.straal;
    }

    public static String geefDefinitie() {
        return "Een cirkel is een verzameling punten, die allemaal dezelfde afstand tot een middelpunt hebben.";
    }

    @Override
    public String toString() {
        return String.format(
                "Kleur: %s\nOmtrek: %s\nOppervlakte: %s\nStraal: %.1f\nMiddelpunt: %s",
                getKleur(),
                geefOmtrek(),
                geefOppervlakte(),
                straal,
                middelpunt
        );
    }

}
