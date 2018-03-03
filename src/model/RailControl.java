package model;

import java.util.ArrayList;
import java.util.List;

public class RailControl {

    private List<Zug> trains = new ArrayList<>();

    public RailControl(List<Zug> trains) {
        this.trains = trains;
    }

    public void addZug(Zug zug){
        this.trains.add(zug);
    }

    public boolean deleteZug(Zug zug){
        return this.trains.remove(zug);
    }

    public Zug getZug(int position){
        return this.trains.get(position);
    }
}
