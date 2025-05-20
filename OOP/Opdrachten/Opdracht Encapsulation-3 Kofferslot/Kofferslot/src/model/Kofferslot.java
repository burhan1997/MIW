package model;

public class Kofferslot {
    private char eersteLetter;
    private char tweedeLetter;
    private int cijfer;

    public char getEersteLetter() {
        return eersteLetter;
    }

    public char getTweedeLetter() {
        return tweedeLetter;
    }

    public int getCijfer() {
        return cijfer;
    }

    public Kofferslot() {
        this('A', 'A', 0);
    }

    public Kofferslot(char eersteLetter, char tweedeLetter, int cijfer) {
        this.eersteLetter = eersteLetter;
        this.tweedeLetter = tweedeLetter;
        this.cijfer = cijfer;
    }

    public void setCombinatie(char eersteLetter, char tweedeLetter, int cijfer){
        this.eersteLetter = eersteLetter;
        this.tweedeLetter = tweedeLetter;
        this.cijfer = cijfer;
    }

    public char volgendeLetter(char letter){
        if (letter == 'Z') {
            return 'A';
        } else {
            return (char)(letter + 1);
        }
    }

    public int volgendeCijfer(int cijfer){
        if ( cijfer == 9){
            return 0;
        } else {
            return (cijfer + 1);
        }
    }

    public void volgende() {
        if (cijfer < 9) {
            cijfer = volgendeCijfer(cijfer);
            return;
        }
        cijfer = volgendeCijfer(cijfer);

        if (tweedeLetter == 'Z'){
            tweedeLetter = 'A';
            eersteLetter = volgendeLetter(eersteLetter);
        }else {
            tweedeLetter = volgendeLetter(tweedeLetter);
            return;
        }
    }



}
