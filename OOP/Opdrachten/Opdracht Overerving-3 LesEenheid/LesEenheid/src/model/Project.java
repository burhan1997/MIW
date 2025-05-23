package model;

public class Project extends LesEenheid {

    public static final double DEFAULT_CIJFER = -1;
    public static final double ONDERGRENS_VOLDOENDE = 5.5;

    private double productCijfer;
    private double procesCijfer;
    private double techniekCijfer;

    public Project(double productCijfer, double procesCijfer, double techniekCijfer,
                   String naam, int ects, int studieJaar) {
        super(naam, ects, studieJaar);
        this.productCijfer = productCijfer;
        this.procesCijfer = procesCijfer;
        this.techniekCijfer = techniekCijfer;
    }

    public boolean isAfgerond() {
        if (productCijfer < ONDERGRENS_VOLDOENDE) return false;
        if (procesCijfer < ONDERGRENS_VOLDOENDE) return false;
        if (techniekCijfer < ONDERGRENS_VOLDOENDE) return false;
        return true;
    }


    public Project(String naam, int ects, int studieJaar) {
        this(DEFAULT_CIJFER, DEFAULT_CIJFER, DEFAULT_CIJFER, naam, ects, studieJaar);
    }

    public double getProductCijfer() {
        return productCijfer;
    }

    public void setProductCijfer(double productCijfer) {
        this.productCijfer = productCijfer;
    }

    public double getProcesCijfer() {
        return procesCijfer;
    }

    public void setProcesCijfer(double procesCijfer) {
        this.procesCijfer = procesCijfer;
    }

    public double getTechniekCijfer() {
        return techniekCijfer;
    }

    public void setTechniekCijfer(double techniekCijfer) {
        this.techniekCijfer = techniekCijfer;
    }

    @Override
    public String toString() {
        return super.toString() + " (" + getProductCijfer() + ", " + getProcesCijfer() + ", " + getTechniekCijfer() + ")";
    }
}
