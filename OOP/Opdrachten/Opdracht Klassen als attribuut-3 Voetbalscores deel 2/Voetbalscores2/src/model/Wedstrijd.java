package model;

public class Wedstrijd {
     private Team thuisteam;
     private Team uitTeam;
     private int thuisDoelPunten;
     private int uitDoelPunten;


    public Wedstrijd(Team thuisteam, Team uitTeam, int thuisDoelPunten, int uitDoelPunten) {
        this.thuisteam = thuisteam;
        this.uitTeam = uitTeam;
        this.thuisDoelPunten = thuisDoelPunten;
        this.uitDoelPunten = uitDoelPunten;
    }

    public Wedstrijd(Team thuisteam, Team uitTeam) {
        this(thuisteam, uitTeam, 0, 0);
    }

    public Wedstrijd() {
        this(null, null);
    }


    public Team getThuisteam() {
        return thuisteam;
    }

    public void setThuisteam(Team thuisteam) {
        this.thuisteam = thuisteam;
    }

    public Team getUitTeam() {
        return uitTeam;
    }

    public void setUitTeam(Team uitTeam) {
        this.uitTeam = uitTeam;
    }

    public int getThuisDoelPunten() {
        return thuisDoelPunten;
    }

    public void setThuisDoelPunten(int thuisDoelPunten) {
        this.thuisDoelPunten = thuisDoelPunten;
    }

    public int getUitDoelPunten() {
        return uitDoelPunten;
    }

    public void setUitDoelPunten(int uitDoelPunten) {
        this.uitDoelPunten = uitDoelPunten;
    }

    public int getWedstrijdenPuntenThuisTeam(){
        if (thuisDoelPunten>uitDoelPunten){
            return 3 ;
        } else if (thuisDoelPunten==uitDoelPunten) {
            return 1 ;
        } else {
            return 0;
        }
    }

    public int getWedstrijdenPuntenUitTeam(){
        if (uitDoelPunten>thuisDoelPunten){
            return 3 ;
        } else if (uitDoelPunten==thuisDoelPunten) {
            return 1 ;
        } else {
            return 0;
        }
    }

    public void setWedstrijdPuntenThuisTeam(){
         int huidigePunten =  thuisteam.getTotaalWedstrijdPunten();  // mevcut puanı al
         int wedstrijdPunten = getWedstrijdenPuntenThuisTeam();  // bu maçtan alınan puan
         thuisteam.setTotaalWedstrijdPunten(wedstrijdPunten + huidigePunten);  // toplam puanı güncelle
    }

    public void setWedstrijdPuntenUitTeam(){
        int huidigePunten = uitTeam.getTotaalWedstrijdPunten();
        int wedstrijdPunten = getWedstrijdenPuntenUitTeam();
        uitTeam.setTotaalWedstrijdPunten(wedstrijdPunten + huidigePunten);
    }

    public void setTotaalDoelpuntenTeams(){
        int thuisVoor = getThuisDoelPunten();
        int uitVoor = getUitDoelPunten();

        thuisteam.setTotaalVoorDoelPunten(thuisVoor + thuisteam.getTotaalVoorDoelPunten());
        thuisteam.setTotaalTegenDoelPunten(uitVoor + thuisteam.getTotaalTegenDoelPunten());

        uitTeam.setTotaalVoorDoelPunten(uitVoor + uitTeam.getTotaalVoorDoelPunten());
        uitTeam.setTotaalTegenDoelPunten(thuisVoor + uitTeam.getTotaalTegenDoelPunten());
    }

    public void printUitslag(){
        System.out.printf("Uitslag van de wedstrijd %s - %s: %d - %d \n",
                thuisteam.getTeamNaam(),
                uitTeam.getTeamNaam(),
                getThuisDoelPunten(),
                getUitDoelPunten());
    }


    public void printWedstrijdPunten(){
        System.out.printf(
                "Dit levert %d wedstrijdpunten voor %s en %d wedstrijdpunten voor %s.",
                getWedstrijdenPuntenThuisTeam(),
                thuisteam.getTeamNaam(),
                getWedstrijdenPuntenUitTeam(),
                uitTeam.getTeamNaam()
        );
    }

}
