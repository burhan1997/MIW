package model;

public class Werknemer extends Persoon {

    private static final double GRENSWAARDE_BONUS = 4500.00;
    private double maandSalaris;

    public Werknemer(String naam, String woonplaats, Afdeling afdeling, double maandSalaris) {
        super(naam, woonplaats, afdeling);
        setMaandSalaris(maandSalaris);
    }

    public Werknemer(String naam) {
        this(naam, DEFAULTWAARDE_WOONPLAATS, new Afdeling(), 0.0);
    }


    public Werknemer() {
        this(DEFAULTWAARDE_NAAM);
    }

    public double getMaandSalaris() {
        return maandSalaris;
    }

    public void setMaandSalaris(double salaris) {
        if (salaris < 0) {
            System.out.println("Fout: Het maandsalaris kan niet negatief zijn. Het wordt op 0 gezet.");
            this.maandSalaris = 0;
        } else {
            this.maandSalaris = salaris;
        }
    }

    public boolean heeftRechtOpBonus(){
        return maandSalaris >= GRENSWAARDE_BONUS;
    }

    @Override
    public double berekenJaarInkomen(){

       if (heeftRechtOpBonus()){
           return maandSalaris * 12 + maandSalaris;
       } else{
           return 12 * maandSalaris;
       }
    }

    @Override
    public String toString(){
        String bonusTekst = heeftRechtOpBonus() ? "met" : "zonder";
        return super.toString() + "en is een werknemer " +  bonusTekst + " recht op een bonus";
    }
}
