package model;

public class LesEenheid {
    private String naam;
    private int ects;
    private int studieJaar;

    public LesEenheid(String naam, int ects, int studieJaar) {
        this.naam = naam;
        this.ects = ects;
        this.studieJaar = studieJaar;
    }


    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getEcts() {
        return ects;
    }

    public void setEcts(int ects) {
        this.ects = ects;
    }

    public int getStudieJaar() {
        return studieJaar;
    }

    public void setStudieJaar(int studieJaar) {
        this.studieJaar = studieJaar;
    }

    @Override
    public String toString() {
        return this.naam + ", " + this.ects + " ects, studiejaar " + this.studieJaar;
    }
}
