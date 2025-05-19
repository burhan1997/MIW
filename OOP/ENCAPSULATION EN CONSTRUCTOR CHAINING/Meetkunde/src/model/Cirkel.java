package model;

public class Cirkel {
    private final static double GRENSWAARDE_GROOT_FIGUUR = 100.0;
    private double straal;
    private double middelpuntX;
    private double middelpuntY;
    private String kleur;

    public double getStraal() {
        return straal;
    }

    public void setStraal(double straal) {
        if (straal <= 0) {
            System.out.println("De straal moet positief zijn. De straal wordt op 1 gezet");
            this.straal = 1.0;
        } else {
            this.straal = straal;
        }
    }

    public double getMiddelpuntX() {
        return middelpuntX;
    }

    public void setMiddelpuntX(double middelpuntX) {
        this.middelpuntX = middelpuntX;
    }

    public double getMiddelpuntY() {
        return middelpuntY;
    }

    public void setMiddelpuntY(double middelpuntY) {
        this.middelpuntY = middelpuntY;
    }

    public String getKleur() {
        return kleur;
    }

    public void setKleur(String kleur) {
        this.kleur = kleur;
    }


    //default constructor
    public Cirkel() {
        this(1);
    }


    //constructor met alleen de straal
    public Cirkel(double straal) {
        this(straal, 0, 0, "wit");
    }

    //all-args constructor:
    public Cirkel(double straal, double middelpuntX, double middelpuntY, String kleur) {
        setStraal(straal);
        this.middelpuntX = middelpuntX;
        this.middelpuntY = middelpuntY;
        this.kleur = kleur;
    }


    public double geefOmtrek() {
        return 2 * Math.PI * straal;
    }

    public double geefOppervlakte() {
        return Math.PI * straal * straal;
    }

    public static String geefDefinitie() {
        return "Een cirkel is een verzameling punten, die allemaal dezelfde afstand tot een middelpunt hebben.";
    }


    public String vertelOverGrootte() {
        if (geefOppervlakte() > GRENSWAARDE_GROOT_FIGUUR) {
            return "Ik ben groot!!!";
        } else {
            return "Ik ben klein!!!";
        }
    }


}
