package model;

public class Vak extends LesEenheid {
    public static final double DEFAULT_CIJFER = -1;
    public static final double ONDERGRENS_VOLDOENDE = 5.5;

    private double cijfer;

    public Vak(double cijfer ,String naam, int ects, int studieJaar ) {
        super(naam, ects, studieJaar);
        this.cijfer = cijfer;
    }

    public Vak(String naam, int ects, int studieJaar) {
        this(DEFAULT_CIJFER, naam, ects, studieJaar);
    }

    public void setCijfer(double cijfer) {
        this.cijfer = cijfer;
    }

    public boolean isAfgerond() {
        return cijfer >= ONDERGRENS_VOLDOENDE;
    }

    @Override
    public String toString() {
        return super.toString() + ", cijfer " + this.cijfer;
    }

}
