package model;

public abstract class Boot implements VrijVerhuurbaar, Comparable<Boot> {
    private static int lastId = 0;
    private int id;
    private String naam;
    private int lengte;

    protected Boot(String naam, int lengte) {
        this.naam = naam;
        setLengte(lengte);
        this.id = ++lastId;
    }

    public String getNaam() {
        return naam;
    }

    public int getLengte() {
        return lengte;
    }

    public void setLengte(int lengte) {
        if (lengte > 0) {
            this.lengte = lengte;
        } else {
            System.out.println("Fout: lengte moet positief zijn. Standaardwaarde 5 meter wordt ingesteld.");
            this.lengte = 5;
        }
    }

    @Override
    public int compareTo(Boot anotherBoot) {
        return this.naam.compareTo(anotherBoot.getNaam());
    }

    @Override
    public String toString() {
        return String.format("Boot %d met naam %s", id, naam);
    }


    public abstract double berekenHuurPrijs();
}
