package model;

public abstract class Vervoermiddel {
    private int id;
    private String merk;
    private String type;

    private static int aantalVervoermiddelen = 0;


    protected Vervoermiddel(String merk, String type) {
        this.merk = merk;
        this.type = type;

        this.id = ++aantalVervoermiddelen;
    }

    public abstract String geefAandrijfKracht();

    public int getId() {
        return id;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString(){
        return "Vervoermiddel #" + this.id  + " " + this.getMerk() + " " + this.getType() + "  aangedreven door " + geefAandrijfKracht();
    }
}
