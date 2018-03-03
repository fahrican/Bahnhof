package model;

public class Bahnhof {

    private String bezeichnung;
    private int id;

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
