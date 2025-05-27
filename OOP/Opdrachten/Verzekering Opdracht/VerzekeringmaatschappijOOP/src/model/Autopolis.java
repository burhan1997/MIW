package model;

import java.time.LocalDate;

public class Autopolis extends Polis {
    public static final int MIN_SCHADEVRIJE_JAREN = 0;
    public static final int MAX_SCHADEVRIJE_JAREN = 40;
    public static final int AANTAL_SCHADEVRIJE_JAREN = 0;
    public static final int EIGEN_RISICO_CAT_LAAG_AUTOPOLIS = 1;
    public static final int EIGEN_RISICO_CAT_MIDDEN_AUTOPOLIS = 2;
    public static final double PERCENTAGE_VAN_LAAG_CAT = 0.10;
    public static final double PERCENTAGE_VAN_MIDDEN_CAT = 0.09;
    public static final double PERCENTAGE_VAN_HOOG_CAT = 0.08;
    public static final double KORTING_PER_SCHADEVRIJE_JAAR = 0.05;
    public static final double MAX_KORTING = 0.70;
    private Auto auto;
    private int aantalSchadevrijeJaren;

    public Autopolis(String naamPolishouder, int verzekerBedrag, LocalDate startDatum, int eigenRisicoCategorie, Auto auto, int aantalSchadevrijeJaren) {
        super(naamPolishouder, verzekerBedrag, startDatum, eigenRisicoCategorie);
        this.auto = auto;
        setAantalSchadevrijeJaren(aantalSchadevrijeJaren);
    }

    public void setAantalSchadevrijeJaren(int aantalSchadevrijeJaren) {
        if (aantalSchadevrijeJaren < MIN_SCHADEVRIJE_JAREN || aantalSchadevrijeJaren > MAX_SCHADEVRIJE_JAREN) {
            System.out.println("Het aantal schadevrije jaren moet minimaal 0 zijn! Het aantal schadevrije jaren mag maximaal 40 zijn!");
            this.aantalSchadevrijeJaren = AANTAL_SCHADEVRIJE_JAREN;
        } else {
            this.aantalSchadevrijeJaren = aantalSchadevrijeJaren;
        }
    }

    @Override
    public double berekenJaarPremie() {
        double percentage;
        if (eigenRisicoCategorie == EIGEN_RISICO_CAT_LAAG_AUTOPOLIS) {
            percentage = PERCENTAGE_VAN_LAAG_CAT;
        } else if (eigenRisicoCategorie == EIGEN_RISICO_CAT_MIDDEN_AUTOPOLIS) {
            percentage = PERCENTAGE_VAN_MIDDEN_CAT;
        } else {
            percentage = PERCENTAGE_VAN_HOOG_CAT;
        }

        double basisBedrag = verzekerdBedrag * percentage;

        // Korting 5% per schadevrij jaar, max 70%
        double korting = KORTING_PER_SCHADEVRIJE_JAAR * aantalSchadevrijeJaren;
        if (korting > MAX_KORTING) {
            korting = MAX_KORTING;
        }

        // Minimaal 30% betalen, dus max 70% korting
        double premieNaKorting = basisBedrag * (1 - korting);

        return premieNaKorting;
    }


    @Override
    public String toString() {
        return String.format("%s %s \n\t Aantal schadevrije jaren: %d \n\t Jaarpremie: %.2f euro \n\t", super.toString(), auto, aantalSchadevrijeJaren, berekenJaarPremie());
    }
}
