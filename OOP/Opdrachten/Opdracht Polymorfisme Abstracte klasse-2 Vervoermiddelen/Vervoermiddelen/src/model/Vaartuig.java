package model;

public abstract class Vaartuig extends Vervoermiddel{

    private double lengteInMeter;

    public Vaartuig(String merk, String type, double lengteInMeter) {
        super(merk, type);
        this.lengteInMeter = lengteInMeter;
    }

    public double getLengteInMeter() {
        return lengteInMeter;
    }

    public void setLengteInMeter(double lengteInMeter) {
        this.lengteInMeter = lengteInMeter;
    }
}
