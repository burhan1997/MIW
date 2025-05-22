package model;

public class Team {
    private String teamNaam;
    private int totaalWedstrijdPunten;
    private int totaalVoorDoelPunten;
    private int totaalTegenDoelPunten;

    public Team(String teamNaam, int totaalWedstrijdPunten, int totaalVoorDoelPunten, int totaalTegenDoelPunten) {
        this.teamNaam = teamNaam;
        this.totaalWedstrijdPunten = totaalWedstrijdPunten;
        this.totaalVoorDoelPunten = totaalVoorDoelPunten;
        this.totaalTegenDoelPunten = totaalTegenDoelPunten;
    }

    public Team(String teamNaam) {
        this(teamNaam, 0, 0,0 );
    }

    public Team() {
        this("",0,0,0);
    }

    public String getTeamNaam() {
        return teamNaam;
    }

    public void setTeamNaam(String teamNaam) {
        this.teamNaam = teamNaam;
    }

    public int getTotaalWedstrijdPunten() {
        return totaalWedstrijdPunten;
    }

    public void setTotaalWedstrijdPunten(int totaalWedstrijdPunten) {
        this.totaalWedstrijdPunten = totaalWedstrijdPunten;
    }

    public int getTotaalVoorDoelPunten() {
        return totaalVoorDoelPunten;
    }

    public void setTotaalVoorDoelPunten(int totaalVoorDoelPunten) {
        this.totaalVoorDoelPunten = totaalVoorDoelPunten;
    }

    public int getTotaalTegenDoelPunten() {
        return totaalTegenDoelPunten;
    }

    public void setTotaalTegenDoelPunten(int totaalTegenDoelPunten) {
        this.totaalTegenDoelPunten = totaalTegenDoelPunten;
    }

    public int getDoelSaldo(){
       return   totaalVoorDoelPunten - totaalTegenDoelPunten;
    }

    public void printStatusTeam(){
        System.out.printf("Het team %s heeft %d wedstrijdpunt(en) en een doelsaldo van %d \n", teamNaam, totaalWedstrijdPunten,getDoelSaldo());
    }
}
