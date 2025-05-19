package model;

/**
 * @author Burhan,
 * Deze klasse houdt de tegenstander en de uitslag bij van een voetbalwedstrijd
 * van je favoriet team en kan wedstrijdpunten bepalen.
 *
 */

public class Wedstrijd {
    String naamTegenstander;
    int voorDoelpunten;
    int tegenDoelpunten;


    public Wedstrijd() {
        this.naamTegenstander = "Onbekend";
        this.voorDoelpunten = 0;
        this.tegenDoelpunten = 0;
    }

    public Wedstrijd(String naamTegenstander) {
        this.naamTegenstander = naamTegenstander;
        this.voorDoelpunten = 0;
        this.tegenDoelpunten = 0;
    }

    public Wedstrijd(String naamTegenstander, int voorDoelpunten, int tegenDoelpunten) {
        this.naamTegenstander = naamTegenstander;
        this.voorDoelpunten = voorDoelpunten;
        this.tegenDoelpunten = tegenDoelpunten;
    }

    public int bepaalWedstrijdPunten() {
        if (voorDoelpunten > tegenDoelpunten) {
            return 3;
        } else if (voorDoelpunten == tegenDoelpunten) {
            return 1;
        } else {
            return 0;
        }
    }

    public void  printUitslag(){
        System.out.println("Uitslag van de wedstrijd tegen " +naamTegenstander+": " + voorDoelpunten + "-" + tegenDoelpunten);
    }

    public void printWedstrijdPunten(){
        System.out.println("Dit levert " +  bepaalWedstrijdPunten() + " wedstrijdpunten op");
    }
}
