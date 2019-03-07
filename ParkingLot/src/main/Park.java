/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;

/**
 *
 * class contains physical parking
 */
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
