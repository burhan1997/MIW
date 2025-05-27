package model;

import java.time.LocalDate;

public class WA_Polis extends Polis{
    public static final int DEFAULT_EIGEN_RISICO_CAT = 1;
    public static final int DEFAULT_AANTAL_PERSONEN = 1;
    public static final double EIGEN_RISICO_LAAG_PERCENTAGE = 0.06;
    public static final double EIGEN_RISICO_MIDDEN_PERCENTAGE = 0.05;
    public static final double EIGEN_RISICO_HOOG_PERCENTAGE = 0.04;
    private int aantalPersonen;

    public WA_Polis(String naamPolishouder, int verzekerBedrag, LocalDate startDatum, int eigenRisicoCategorie, int aantalPersonen) {
        super(naamPolishouder, verzekerBedrag, startDatum, eigenRisicoCategorie);
        this.aantalPersonen = aantalPersonen;
    }

    public WA_Polis(String naamPolishouder, int verzekerBedrag) {
        this(naamPolishouder, verzekerBedrag, LocalDate.now(), DEFAULT_EIGEN_RISICO_CAT, DEFAULT_AANTAL_PERSONEN);
    }

    @Override
    public double berekenJaarPremie() {
        double percentage;
        if (eigenRisicoCategorie == EIGEN_RISICO_CAT_LAAG){
            percentage = EIGEN_RISICO_LAAG_PERCENTAGE;
        } else if (eigenRisicoCategorie == EIGEN_RISICO_CAT_MIDDEN) {
            percentage = EIGEN_RISICO_MIDDEN_PERCENTAGE;
        } else {
            percentage = EIGEN_RISICO_HOOG_PERCENTAGE;
        }

        double basisBedrag = verzekerdBedrag * percentage;
        return basisBedrag * aantalPersonen;
    }

    @Override
    public String toString() {
        return super.toString() +
                " Aantal personen: " + aantalPersonen +
                "\n\t Jaarpremie: " + String.format("%.2f", berekenJaarPremie()) + " euro";
    }

}
