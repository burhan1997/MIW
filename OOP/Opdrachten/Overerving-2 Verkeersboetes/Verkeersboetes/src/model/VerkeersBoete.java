package model;

public class VerkeersBoete {
    private String naamDader;
    private String kentekenAuto;
    private double bedrag;

    private VerkeersBoete(String naamDader, String kentekenAuto, double bedrag) {
        this.naamDader = naamDader;
        this.kentekenAuto = kentekenAuto;
        this.bedrag = bedrag;
    }

    public VerkeersBoete(String naamDader, String kentekenAuto) {
        this.naamDader = naamDader;
        this.kentekenAuto = kentekenAuto;
        this.bedrag = 0.0;
    }

    public VerkeersBoete() {
        this("onbekend", "onbekend", 0.0);
    }

    public double getBedrag() {
        return bedrag;
    }

    public void setBedrag(double bedrag) {
        this.bedrag = bedrag;
    }

    @Override
    public String toString(){
        return "Verkeersboete voor " + naamDader + ", kenteken " + kentekenAuto + ", " + bedrag + " euro";
    }
}
