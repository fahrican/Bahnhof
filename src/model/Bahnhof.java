package model;

import java.util.ArrayList;
import java.util.List;

public class Bahnhof {

    private String bezeichnung;
    private int id;
    private List<Zug> trains = new ArrayList<>();
    private List<Bahnsteig> platforms = new ArrayList<>();

    public Bahnhof(String bezeichnung, int id) {
        this.bezeichnung = bezeichnung;
        this.id = id;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public int getId() {
        return id;
    }

    public void addZug(Zug zug){

        if (zug != null){
            this.trains.add(zug);
        }
    }

    public boolean removeZug(Zug zug){
        return this.trains.remove(zug);
    }

    public Zug getZug(int position){

        if (this.trains.get(position) != null){
            return this.trains.get(position);
        }
        return new Zug("New Train", 405, StatusTyp.STILLSTAND, "Train is not present");
    }

    public void addBahnsteig(Bahnsteig bahnsteig){

        if (bahnsteig != null){
            this.platforms.add(bahnsteig);
        }
    }

    public boolean removeBahnsteig(Bahnsteig bahnsteig){
        return this.platforms.remove(bahnsteig);
    }

    public Bahnsteig getBahnsteig(int position){

        if (this.platforms.get(position) != null){

            return this.platforms.get(position);
        }
        return new Bahnsteig("New Platform");
    }

    public void zugFährtAb(Zug zug){

    }

    public void zugFährtAb(Zug zug, int delay){

    }

    public void zugFährtEin(Zug zug, Bahnsteig steig){

    }

    public void zugFährtEin(Zug zug, Bahnsteig steig, int delay){

    }

    private boolean setzeAnzeigetafel(int id, String text){

    }

    private boolean setzeAnzeigetafel(Bahnsteig steig, String text){

    }
}
