package controller;

import java.util.Scanner;

public class LoopsLauncher {
    /**
     * ⭐️ Sterrenrij
     * Deze methode print een rij van een bepaald aantal sterretjes.
     * Voorbeeld: toonRijSterren(5) → * * * * *
     */
    public static void toonRijSterren(int mpAantal){

        for (int i=0; i< mpAantal; i++){
            System.out.print("* ");
        }
        System.out.println();
    }

    /**
     * ⭐️ Sterrenvierkant
     * Deze methode print een vierkant van sterretjes met de opgegeven grootte.
     * Deze maakt gebruik van de methode toonRijSterren().
     */
    public static void toonSterrenVierkant(int mpAantal){
        for (int i=0; i< mpAantal; i++){
                toonRijSterren(mpAantal);
        }
    }
    /**
     * 🔤 Karakterrij
     * Deze methode print een rij van een opgegeven karakter, een bepaald aantal keer.
     * Voorbeeld: toonCharRij('&', 5) → &&&&&
     */
    public static void toonCharRij(char mpKarakter, int mpAantal){
        for (int i=0; i<=mpAantal; i++){
            System.out.print(mpKarakter);
        }
        System.out.println();
    }
    /**
     * ➕ Optellen tot aan 1000
     * Deze methode telt alle getallen vanaf 1 bij elkaar op totdat de som groter dan of gelijk aan 1000 is.
     * Het print daarna de som en het aantal getallen dat opgeteld is.
     */
    public static void optellenTotAanDuizend() {
        int sum = 0;
        int teller = 0;

        for (int i = 1; ; i++) {
            sum += i;
            teller++;
            if (sum >= 1000) {
                System.out.println("Som is: " + sum);
                System.out.println("Aantal getallen opgeteld: " + teller);
                break;
            }
        }
    }
    /**
     * 🔢 Optellen tot aan een bovengrens
     * Deze methode telt getallen vanaf 1 bij elkaar op totdat een opgegeven bovengrens is bereikt of overschreden.
     * Het retourneert het aantal getallen dat is opgeteld en print de som en teller.
     */
    public static int telAantalTeSommerenGetallen(int mpGrens){
        int sum = 0;
        int teller = 0;

        for (int i = 1; sum < mpGrens ; i++) {
            sum += i;
            teller++;
            if (sum >= mpGrens) {
                System.out.println("Som is: " + sum);
                System.out.println("Aantal getallen opgeteld: " + teller);
                break;
            }
        }
        return teller;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Welk karakter wil je dit keer gebruiken? ");
        String karakter = input.nextLine();
        char ch = karakter.charAt(0);

        System.out.print("Hoe vaak wil je het zien? ");
        int aantal = input.nextInt();

        toonRijSterren(8);
        toonSterrenVierkant(4);
        toonCharRij(ch, aantal);
        optellenTotAanDuizend();

        System.out.print("Tot hoeveel moeten we optellen? ");
        int grens = input.nextInt();
        telAantalTeSommerenGetallen(grens);

    }
}
