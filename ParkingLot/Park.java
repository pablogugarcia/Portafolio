
package main;

import java.util.ArrayList;


public class Park {

    private ArrayList<Vehicle> place;
    private int contador = 0;

    public Park() {

    }

    public Park(int spaces) {
        place = new ArrayList<>(spaces);
    }

    public void setPlaces(Vehicle x) {
        if (place == null) {
            return;
        }
        try {
            place.add(x);
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

}
