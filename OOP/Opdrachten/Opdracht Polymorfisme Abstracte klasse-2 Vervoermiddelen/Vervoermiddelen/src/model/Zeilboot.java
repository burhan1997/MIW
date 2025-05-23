package model;

public class Zeilboot extends Vaartuig {

    public Zeilboot(String merk, String type, double lengteInMeter) {
        super(merk, type, lengteInMeter);
    }

    @Override
    public String geefAandrijfKracht() {
        return "windkracht";
    }
}
