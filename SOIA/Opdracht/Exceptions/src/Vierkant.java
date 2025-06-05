public class Vierkant {

    private double zijde;

    public double getZijde() {
        return zijde;
    }

    public void setZijde(double zijde) {
        this.zijde = zijde;
    }

    public Vierkant(double zijde) {
        this.zijde = zijde;
    }

    public Vierkant() {
        this(1.0);
    }

    @Override
    public String toString() {
        return "Vierkant met zijde: " + zijde;
    }


    public double getOppervlakte() {
        return zijde * zijde;
    }

    public static double berekenZijde(double oppervlakte) throws IllegalArgumentException {
            if (oppervlakte < 0){
                throw new IllegalArgumentException("Oppervlakte kan niet kleiner dan 0. ");
            }
            return Math.sqrt(oppervlakte);
        }
    }

