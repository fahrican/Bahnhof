package model;

public class Zug {

    private String bezeichnung;
    private int id;
    private StatusTyp status;
    private String typ;

    public Zug(String bezeichnung, int id, StatusTyp status, String typ) {
        this.bezeichnung = bezeichnung;
        this.id = id;
        this.status = status;
        this.typ = typ;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public int getId() {
        return id;
    }

    public StatusTyp getStatus() {
        return status;
    }

    public String getTyp() {
        return typ;
    }

    public void meldeEinfahrt(Bahnhof station){

    }

    public void meldeEinfahrt(Bahnhof station, int delay){

    }
}
