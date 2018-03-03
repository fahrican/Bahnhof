package model;

import java.util.ArrayList;
import java.util.List;

public class Lokomotive {

    private String bezeichnung;
    private List<Wagon> wagons = new ArrayList<>();

    public Lokomotive(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void addWagon(Wagon wagon){

        if (wagon != null){
            this.wagons.add(wagon);
        }
    }

    public boolean removeWagon(Wagon wagon){
        return this.wagons.remove(wagon);
    }

    public Wagon getWagon(int position){

        if (this.wagons.get(position) != null){

            return this.wagons.get(position);
        }
        return new Wagon("New Wagon");
    }
}
