package model;

public class ZeilBoot extends Boot{

    public ZeilBoot(String naam, int lengte) {
        super(naam, lengte);
    }

    @Override
    public double berekenHuurPrijs() {
        return getLengte() < 7 ? 40 : 70;
    }

    @Override
    public boolean isVaarbewijsPlichtig() {
        return getLengte() > 15;
    }

    @Override
    public String toString() {
        return "Zeil" + super.toString() + "\n" +
                "Vaarbewijs vereist: " + (isVaarbewijsPlichtig() ? "ja" : "nee") + "\n" +
                String.format("Huurprijs: %.2f euro.\n", berekenHuurPrijs());
    }
}
