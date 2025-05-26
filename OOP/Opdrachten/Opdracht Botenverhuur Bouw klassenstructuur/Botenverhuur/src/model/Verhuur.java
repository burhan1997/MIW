package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Verhuur {
    private Klant klant;
    private List<Boot> boten;
    private LocalDate startDatum;
    private int aantalDagen;


    public Verhuur(Klant klant, LocalDate startDatum, int aantalDagen) {
        this.klant = klant;
        this.startDatum = startDatum;
        this.aantalDagen = aantalDagen;
        this.boten = new ArrayList<>();
    }

    // Eğer bot kaptan belgesi zorunlu değilse veya müşteri kaptan belgesine sahipse, o zaman kiralayabilirsin.
    private boolean magVerhuurd(Boot boot){
        return !boot.isVaarbewijsPlichtig() || klant.isVaarVaardig();
    }

    public void voegBootToe(Boot boot){
        if (magVerhuurd(boot)){
            boten.add(boot);
        } else {
            System.out.println(boot + "Mag niet verhuurd worden! Toevoegen mislukt.\n");
        }
    }

    public double berekenHuurBedrag(){
        double totaalPrijs = 0.0;

        for (Boot boot : boten){
            totaalPrijs += boot.berekenHuurPrijs();
        }
        return totaalPrijs * aantalDagen;
    }

    @Override
    public String toString() {
        Collections.sort(boten);
        StringBuilder result = new StringBuilder();
        result.append(String.format("De verhuur aan %s", klant.getNaam()));

        if (boten.isEmpty()) {
            result.append(String.format(" op %s is mislukt, geen boten toegevoegd.\n",  startDatum));
        }else {
            result.append( String.format(" van %s tot %s kost %.2f euro:", startDatum, startDatum.plusDays(aantalDagen -1), berekenHuurBedrag()));
            for (Boot boot : boten){
                result.append(boot + "\n");
            }
        }
        return result.toString();
    }

}
