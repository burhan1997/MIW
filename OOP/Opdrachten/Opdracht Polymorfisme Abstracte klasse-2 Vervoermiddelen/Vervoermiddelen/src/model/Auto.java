package model;

public class Auto extends Voertuig{
    private String soortBrandStof;
    protected static final int AANTAL_WIELEN = 4;

    public Auto(String merk, String type, int gewicht, String soortBrandStof) {
        super(merk, type, AANTAL_WIELEN, gewicht);
        this.soortBrandStof = soortBrandStof;
    }


    @Override
    public String geefAandrijfKracht() {
        return soortBrandStof + " motor";
    }


}
