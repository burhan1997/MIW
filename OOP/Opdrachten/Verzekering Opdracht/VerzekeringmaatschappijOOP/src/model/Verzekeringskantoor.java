package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Verzekeringskantoor {
    private String naam;
    private String plaats;
    private List<Polis> polissen;

    public Verzekeringskantoor(String naam, String plaats) {
        this.naam = naam;
        this.plaats = plaats;
        this.polissen = new ArrayList<>();
    }

    public void voegPolisToe(Polis polis){
            polissen.add(polis);
    }

    @Override
    public String toString() {
        Collections.sort(polissen);
        StringBuilder sb = new StringBuilder();
        sb.append("Polissen op Verzekeringskantoor ").append(naam).append(" te ").append(plaats).append(":\n");
        for (Polis polis : polissen) {
            sb.append(polis).append("\n\n");
        }
        return sb.toString();
    }



}
