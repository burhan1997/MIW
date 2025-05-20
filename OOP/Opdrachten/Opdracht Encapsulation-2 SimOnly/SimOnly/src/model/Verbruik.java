package model;

public class Verbruik {
    private final double BASIS_KOSTEN = 9.95;
    private final int VERBRUIK_ABONNEMENT = 3000;
    private final double MEERPRIJS_MB = 0.025;

    private String maand;
    private int hoeveelheidMb;
    private double kosten;

    public String getMaand() {
        return maand;
    }

    public void setHoeveelheidMb(int hoeveelheidMb) {
        this.hoeveelheidMb = hoeveelheidMb;
    }

    public Verbruik(String maand, int hoeveelheidMb) {
        this.maand = maand;
        this.hoeveelheidMb = hoeveelheidMb;
    }

    public Verbruik(String maand) {
        this.maand = maand;
        this.hoeveelheidMb = 0;
    }

    public Verbruik() {
        this.maand = "Onbekend";
        this.hoeveelheidMb = 0;
    }

    public double berekenKosten() {
        if(hoeveelheidMb > VERBRUIK_ABONNEMENT){
            int extraMb = hoeveelheidMb - VERBRUIK_ABONNEMENT;
            kosten = BASIS_KOSTEN + (extraMb * MEERPRIJS_MB);
        }else{
            kosten = BASIS_KOSTEN;
        }
        return kosten;
    }

    public void toonVerbruik() {
        System.out.printf("%-10s %-7d %.2f", maand, hoeveelheidMb, kosten);

        if (hoeveelheidMb > VERBRUIK_ABONNEMENT) {
            System.out.print(" buiten je bundel!");
        }

        System.out.println();
    }


}
