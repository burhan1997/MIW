//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package model;

public class Rechthoek extends Figuur {
    private double lengte;
    private double breedte;
    private Punt hoekpuntLinksBoven;

    public Rechthoek(double lengte, double breedte, Punt hoekpuntLinksBoven, String kleur) {
        super(kleur);
        this.lengte = lengte;
        this.breedte = breedte;
        this.hoekpuntLinksBoven = hoekpuntLinksBoven;
    }

    public Rechthoek(double lengte, double breedte) {
        this(lengte, breedte, new Punt(), "wit");
    }

    public Rechthoek() {
        this((double)2.0F, (double)1.0F);
    }

    public double geefOmtrek() {
        return (double)2.0F * (this.lengte + this.breedte);
    }

    public double geefOppervlakte() {
        return this.lengte * this.breedte;
    }

    public static String geefDefinitie() {
        return "Een rechthoek is een vierhoek met vier rechte hoeken.";
    }

    public double getLengte() {
        return this.lengte;
    }

    public void setLengte(double lengte) {
        this.lengte = lengte;
    }

    public double getBreedte() {
        return this.breedte;
    }

    public void setBreedte(double breedte) {
        this.breedte = breedte;
    }

    public Punt getHoekpuntLinksBoven() {
        return this.hoekpuntLinksBoven;
    }

    public void setHoekpuntLinksBoven(Punt hoekpuntLinksBoven) {
        this.hoekpuntLinksBoven = hoekpuntLinksBoven;
    }

    public String toString() {
        String var10000 = super.toString();
        return var10000 + "\nLengte: " + this.lengte + "\nBreedte: " + this.breedte + "\nHoekpunt: " + this.hoekpuntLinksBoven.toString();
    }
}
