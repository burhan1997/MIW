package model;
public class Punt {
    private double xCoordinaat;
    private double yCoordinaat;

    public Punt() {
        this(0,0);
    }

    public Punt (double x, double y) {
        this.xCoordinaat = x;
        this.yCoordinaat = y;
    }

    public double getxCoordinaat() {
        return xCoordinaat;
    }

    public void setxCoordinaat(double xCoordinaat) {
        this.xCoordinaat = xCoordinaat;
    }

    public double getyCoordinaat() {
        return yCoordinaat;
    }

    public void setyCoordinaat(double yCoordinaat) {
        this.yCoordinaat = yCoordinaat;
    }

    @Override
    public String toString() {
        return String.format("(%.2f, %.2f)", xCoordinaat, yCoordinaat);
    }

}