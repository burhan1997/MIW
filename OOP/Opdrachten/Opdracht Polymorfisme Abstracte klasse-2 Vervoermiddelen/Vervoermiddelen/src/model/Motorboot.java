package model;

public class Motorboot extends Vaartuig{

    private String soortBrandStof;


    public Motorboot(String merk, String type, double lengteInMeter, String soortBrandStof) {
        super(merk, type, lengteInMeter);
        this.soortBrandStof = soortBrandStof;
    }

    @Override
    public String geefAandrijfKracht() {
        return soortBrandStof + " motor";
    }
}
