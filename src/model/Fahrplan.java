package model;

import java.util.Date;

public class Fahrplan {

    private Date abfahrtsZeit;
    private Date ankunftsZeit;
    private String bahnsteigBez;
    private String position;
    private Date zeit;

    public Fahrplan(Date abfahrtsZeit, Date ankunftsZeit, String bahnsteigBez, String position, Date zeit) {

        this.abfahrtsZeit = abfahrtsZeit;
        this.ankunftsZeit = ankunftsZeit;
        this.bahnsteigBez = bahnsteigBez;
        this.position = position;
        this.zeit = zeit;
    }

    public Date getAbfahrtsZeit() {
        return abfahrtsZeit;
    }

    public Date getAnkunftsZeit() {
        return ankunftsZeit;
    }

    public String getBahnsteigBez() {
        return bahnsteigBez;
    }

    public String getPosition() {
        return position;
    }

    public Date getZeit() {
        return zeit;
    }
}
