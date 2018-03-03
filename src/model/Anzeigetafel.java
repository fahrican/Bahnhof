package model;

public class Anzeigetafel {

    private int id;
    private String infotext;

    public Anzeigetafel(int id, String infotext) {
        this.id = id;
        this.infotext = infotext;
    }

    public int getId() {
        return id;
    }

    public String getInfotext() {
        return infotext;
    }
}
