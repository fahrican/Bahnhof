package model;

import java.util.ArrayList;
import java.util.List;

public class RailControl {

    private List<Zug> trains = new ArrayList<Zug>();
    private List<Bahnhof> railwayStations = new ArrayList<Bahnhof>();

    public RailControl(List<Zug> trains, List<Bahnhof> railwayStations) {
        this.trains = trains;
        this.railwayStations = railwayStations;
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
        return new Zug("New Train", 404, StatusTyp.STILLSTAND, "Train is not present");
    }

    public void addBahnhof(Bahnhof bahnhof){

        if (bahnhof != null){

            this.railwayStations.add(bahnhof);
        }
    }

    public boolean removeBahnhof(Bahnhof bahnhof){
        return this.railwayStations.remove(bahnhof);
    }

    public Bahnhof getBahnhof(int position){

        if (this.railwayStations.get(position) != null){

            return this.railwayStations.get(position);
        }
        return new Bahnhof("New Railway Station", 333);
    }
}
