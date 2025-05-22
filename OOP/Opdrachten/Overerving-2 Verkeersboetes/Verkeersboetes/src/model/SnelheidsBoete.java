package model;

public class SnelheidsBoete extends VerkeersBoete{
    private int gemetenSnelheid;
    private int maximumSnelheid;

    private static final int DREMPEL_1 = 10;
    private static final int DREMPEL_2 = 30;

    private static final int TARIEF_1 = 10;
    private static final int TARIEF_2 = 15;
    private static final int TARIEF_3 = 20;

    private static final double MAX_BEDRAG = 1000.0;

    public SnelheidsBoete(String naamDader, String kentekenAuto, int gemetenSnelheid, int maximumSnelheid) {
        super(naamDader, kentekenAuto);
        this.gemetenSnelheid = gemetenSnelheid;
        this.maximumSnelheid = maximumSnelheid;
        bepaalBedrag();
    }

    public int getGemetenSnelheid() {
        return gemetenSnelheid;
    }

    public void setGemetenSnelheid(int gemetenSnelheid) {
        this.gemetenSnelheid = gemetenSnelheid;
    }

    public int getMaximumSnelheid() {
        return maximumSnelheid;
    }

    public void setMaximumSnelheid(int maximumSnelheid) {
        this.maximumSnelheid = maximumSnelheid;
    }

    public void bepaalBedrag(){
        int overSpeed = gemetenSnelheid - maximumSnelheid;

        if (overSpeed > 0 && overSpeed <= DREMPEL_1){
            super.setBedrag(overSpeed * TARIEF_1);
        } else if (overSpeed > DREMPEL_1 && overSpeed <= DREMPEL_2) {
            super.setBedrag(overSpeed * TARIEF_2);
        } else if(overSpeed > DREMPEL_2) {
            super.setBedrag(overSpeed * TARIEF_3);
        } else {
            super.setBedrag(0);
        }

        if (super.getBedrag() > MAX_BEDRAG) {
            super.setBedrag(MAX_BEDRAG);
        }
    }

    @Override
    public String toString(){
        return super.toString().replace("Verkeersboete", "Snelheidsboete") + " voor " + getGemetenSnelheid() + " km/u waar " + getMaximumSnelheid() + "  km/u is toegestaan.";
    }

}

