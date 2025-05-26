package model;

public class MotorBoot extends Boot{

    private int maxSnelheid;

    public MotorBoot(String naam, int lengte, int maxSnelheid) {
        super(naam, lengte);
        this.maxSnelheid = maxSnelheid;
    }

    @Override
    public double berekenHuurPrijs() {
        return getLengte() < 10 ? 60 : 90;
    }

    @Override
    public boolean isVaarbewijsPlichtig() {
        return getLengte() > 15 || maxSnelheid > 20;
    }

    @Override
    public String toString() {
        return "Motor" + super.toString() + "\n" +
                "Vaarbewijs vereist: " + (isVaarbewijsPlichtig() ? "ja" : "nee") + "\n" +
                "Huurprijs: " + berekenHuurPrijs() + " euro.\n";
    }
}
