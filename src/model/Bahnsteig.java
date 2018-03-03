package model;

import java.util.ArrayList;
import java.util.List;

public class Bahnsteig {

    private String bezeichnung;
    private List<Anzeigetafel> displayPanel = new ArrayList<>();

    public Bahnsteig(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void addAnzeigetafel(Anzeigetafel anzeigetafel){

        if (anzeigetafel != null){
            this.displayPanel.add(anzeigetafel);
        }
    }

    public boolean removeAnzeigetafel(Anzeigetafel anzeigetafel){
        return this.displayPanel.remove(anzeigetafel);
    }

    public Anzeigetafel getAnzeigetafel(int position){

        if (this.displayPanel.get(position) != null){
            return this.displayPanel.get(position);
        }
        return new Anzeigetafel(404, "Display panel is not present!");
    }
}
