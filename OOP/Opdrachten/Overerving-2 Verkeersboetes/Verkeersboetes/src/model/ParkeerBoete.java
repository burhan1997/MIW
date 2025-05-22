package model;

public class ParkeerBoete extends VerkeersBoete {
    private int zone;
    private static final double BOETE_ZONE1 = 60.0;
    private static final double BOETE_ZONE2 = 100.0;
    private static final double BOETE_ZONE3 = 180.0;

    public ParkeerBoete(String naamDader, String kentekenAuto, int zone) {
        super(naamDader, kentekenAuto);
        this.zone = zone;
        bepaalBedrag();
    }

    public int getZone() {
        return zone;
    }

    public void setZone(int zone) {
        this.zone = zone;
        bepaalBedrag();
    }

    public void bepaalBedrag() {
        if (zone == 1) {
            super.setBedrag(BOETE_ZONE1);
        } else if (zone == 2) {
            super.setBedrag(BOETE_ZONE2);
        } else if (zone == 3) {
            super.setBedrag(BOETE_ZONE3);
        } else {
            super.setBedrag(0);
        }
    }


    @Override
    public String toString(){
        return super.toString().replace("Verkeersboete", "Parkeerboete") + " in zone " + getZone();
    }
}
