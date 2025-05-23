package model;

public class ProfessionalSkills extends LesEenheid {

    private boolean gehaald;

    public ProfessionalSkills(boolean gehaald, String naam, int ects, int studieJaar) {
        super(naam, ects, studieJaar);
        this.gehaald = gehaald;
    }

    public ProfessionalSkills(String naam, int ects, int studieJaar) {
        this(false, naam, ects, studieJaar); // default olarak false
    }

    public boolean isGehaald() {
        return gehaald;
    }

    public void setGehaald(boolean gehaald) {
        this.gehaald = gehaald;
    }


    public boolean isAfgerond() {
        return gehaald;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + (isGehaald() ? "gehaald" : "niet gehaald");
    }
}
