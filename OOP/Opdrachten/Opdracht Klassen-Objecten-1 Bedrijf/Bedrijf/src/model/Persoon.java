package model;

public class Persoon {
    //attributes

    public final int personeelsNummer;
    public String naam;
    public String woonplaats;
    public double maandSalaris;

    public static int aantalPersonen = 0;

    //constructor(args)
    public Persoon(String naam, String woonplaats, double maandSalaris){
        this.naam = naam;
        this.woonplaats = woonplaats;
        this.maandSalaris = maandSalaris;
        this.personeelsNummer = ++aantalPersonen;
    }

    //constructor met alleen naam
    public Persoon(String naam) {
        this.naam = naam;
        this.woonplaats = "Onbekend";
        this.maandSalaris = 0.0;
        this.personeelsNummer = ++aantalPersonen;
    }

    public  Persoon(){
        this.naam = "Onbekend";
        this.woonplaats = "Onbekend";
        this.maandSalaris = 0.0;
        this.personeelsNummer = ++aantalPersonen;
    }

    public double berekenJaarInkomen(){
        return 12 * this.maandSalaris;
    }

}
