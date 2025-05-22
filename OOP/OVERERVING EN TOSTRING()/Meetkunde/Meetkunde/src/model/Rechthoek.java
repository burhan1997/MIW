package model;

public class Rechthoek extends Figuur {
    private double lengte;
    private double breedte;
    private Punt hoekpuntLinksBoven;

    public Rechthoek(double lengte, double breedte, Punt hoekpuntLinksBoven, String kleur) {
        super(kleur); // Figuur sınıfındaki constructor'u çağır
        this.lengte = lengte;
        this.breedte = breedte;
        this.hoekpuntLinksBoven = hoekpuntLinksBoven;
    }

    public Rechthoek(double lengte, double breedte) {
        this(lengte, breedte, new Punt(), "wit"); // varsayılan kleur
    }

    public Rechthoek() {
        this(2, 1);
    }

    @Override
    public double geefOmtrek() {
        return 2 * (lengte + breedte);
    }

    @Override
    public double geefOppervlakte() {
        return lengte * breedte;
    }

    public static String geefDefinitie() {
        return "Een rechthoek is een vierhoek met vier rechte hoeken.";
    }

    public double getLengte() {
        return lengte;
    }

    public void setLengte(double lengte) {
        this.lengte = lengte;
    }

    public double getBreedte() {
        return breedte;
    }

    public void setBreedte(double breedte) {
        this.breedte = breedte;
    }

    public Punt getHoekpuntLinksBoven() {
        return hoekpuntLinksBoven;
    }

    public void setHoekpuntLinksBoven(Punt hoekpuntLinksBoven) {
        this.hoekpuntLinksBoven = hoekpuntLinksBoven;
    }

    @Override
    public String toString() {
        return super.toString() + "\nLengte: " + lengte +
                "\nBreedte: " + breedte +
                "\nHoekpunt: " + hoekpuntLinksBoven.toString();
    }

}
