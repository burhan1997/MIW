package model;

import java.time.LocalDate;

public abstract class Polis implements Comparable<Polis> {

    public static final int EIGEN_RISICO_CAT_LAAG = 1;
    public static final int EIGEN_RISICO_CAT_MIDDEN = 2;
    public static final int EIGEN_RISICO_CAT_HOOG = 3;
    protected String naamPolishouder;
    protected int verzekerdBedrag;
    protected LocalDate startDatum;
    protected int eigenRisicoCategorie;

    public Polis(String naamPolishouder, int verzekerBedrag, LocalDate startDatum, int eigenRisicoCategorie) {
        this.naamPolishouder = naamPolishouder;
        this.verzekerdBedrag = verzekerBedrag;
        this.startDatum = startDatum;
        setEigenRisicoCategorie(eigenRisicoCategorie);
    }

    public void setEigenRisicoCategorie(int eigenRisicoCategorie) {
        if (eigenRisicoCategorie == EIGEN_RISICO_CAT_LAAG || eigenRisicoCategorie == EIGEN_RISICO_CAT_MIDDEN || eigenRisicoCategorie == EIGEN_RISICO_CAT_HOOG) {
            this.eigenRisicoCategorie = eigenRisicoCategorie;
        } else {
            System.out.println("EigenrisicoCategorie kan gewoon 1, 2 of 3 zijn. Standaardwaarde 1 wordt ingesteld.");
            this.eigenRisicoCategorie = EIGEN_RISICO_CAT_LAAG;
        }
    }


    public abstract double berekenJaarPremie();

    @Override
    public int compareTo(Polis otherPolis) {
        return this.startDatum.compareTo(otherPolis.startDatum);
    }


    @Override
    public String toString() {
        return String.format("Polis op naam van %s  \n\t Verzekerd bedrag: %d euro \n\t " +
                "Startdatum: %s \n\t Eigen risico categorie: %d\n\t", naamPolishouder, verzekerdBedrag, startDatum, eigenRisicoCategorie);
    }
}
