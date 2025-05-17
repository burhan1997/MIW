package model;

public class Cirkel {
    public double straal;
    public double middelpuntX;
    public double middelpuntY;
    public String kleur;

    //all-args constructor:
    public Cirkel(double straal, double middelpuntX, double middelpuntY, String kleur){
        this.straal = straal;
        this.middelpuntX = middelpuntX;
        this.middelpuntY = middelpuntY;
        this.kleur = kleur;
    }

    //default constructor
    public Cirkel(){
        this.straal = 1;
        this.middelpuntX = 0;
        this.middelpuntY = 0;
        this.kleur = "wit";
    }


    //constructor met alleen de straal
    public Cirkel(double straal){
        this.straal = straal;
        this.middelpuntX = 0;
        this.middelpuntY = 0;
        this.kleur = "wit";
    }

    public double geefOmtrek(){
        return 2 * Math.PI * straal;
    }

    public double geefOppervlakte(){
        return Math.PI * straal * straal;
    }

    public static String geefDefinitie() {
        return "Een cirkel is een verzameling punten, die allemaal dezelfde afstand tot een middelpunt hebben.";
    }

}
