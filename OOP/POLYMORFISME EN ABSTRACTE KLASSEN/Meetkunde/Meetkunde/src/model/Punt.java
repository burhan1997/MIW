//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package model;

public class Punt {
    private double xCoordinaat;
    private double yCoordinaat;

    public Punt() {
        this((double)0.0F, (double)0.0F);
    }

    public Punt(double x, double y) {
        this.xCoordinaat = x;
        this.yCoordinaat = y;
    }

    public double getxCoordinaat() {
        return this.xCoordinaat;
    }

    public void setxCoordinaat(double xCoordinaat) {
        this.xCoordinaat = xCoordinaat;
    }

    public double getyCoordinaat() {
        return this.yCoordinaat;
    }

    public void setyCoordinaat(double yCoordinaat) {
        this.yCoordinaat = yCoordinaat;
    }

    public String toString() {
        return String.format("(%.2f, %.2f)", this.xCoordinaat, this.yCoordinaat);
    }
}
