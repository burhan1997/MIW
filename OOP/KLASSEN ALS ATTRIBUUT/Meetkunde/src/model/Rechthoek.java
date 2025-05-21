package model;

public class Rechthoek {
    private final static double GRENSWAARDE_GROOT_FIGUUR = 100.0;
    private double lengte;
    private double breedte;
    private Punt hoekpuntLinksBoven;
    private String kleur;

    public Rechthoek(double lengte, double breedte, Punt hoekpuntLinksBoven, String kleur) {
        this.lengte = lengte;
        this.breedte = breedte;
        this.hoekpuntLinksBoven = hoekpuntLinksBoven;
        this.kleur = kleur;
    }

    public Rechthoek(double lengte, double breedte) {
        this(lengte, breedte, new Punt(), "wit");
    }
    public Rechthoek() {
        this(2,1);
    }

    public double geefOmtrek(){
       return  2 * (lengte + breedte);
    }

    public double geefOpperVlakte(){
        return lengte * breedte;
    }

    public String vertelOverGrootte(){
        if (geefOpperVlakte() >= GRENSWAARDE_GROOT_FIGUUR) {
            return "Het is een groot figuur.";
        } else {
            return "Het is geen groot figuur.";
        }
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

    public String getKleur() {
        return kleur;
    }

    public void setKleur(String kleur) {
        this.kleur = kleur;
    }
}
