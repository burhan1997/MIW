package model;

public class Zzper extends Persoon {
    private double uurtarief;
    private int urenGewerkt;

    public Zzper(String naam, String woonplaats, Afdeling afdeling, double uurtarief) {
        super(naam, woonplaats, afdeling);
        this.uurtarief = uurtarief;
        this.urenGewerkt = 0;  // default waarde
    }

    public double getUurtarief() {
        return uurtarief;
    }

    public void setUurtarief(double uurtarief) {
        this.uurtarief = uurtarief;
    }

    public int getUrenGewerkt() {
        return urenGewerkt;
    }

    public void setUrenGewerkt(int urenGewerkt) {
        this.urenGewerkt = urenGewerkt;
    }

    @Override
    public double berekenJaarInkomen() {
        return urenGewerkt * uurtarief;
    }

    public void huurIn(int aantalUren) {
        if (aantalUren > 0) {
            this.urenGewerkt += aantalUren;
        } else {
            System.out.println("Fout: Aantal uren moet positief zijn.");
        }
    }
    @Override
    public String toString(){
        return super.toString() + " en is een zzp-er met een uurtarief van " + getUurtarief() ;
    }

}
