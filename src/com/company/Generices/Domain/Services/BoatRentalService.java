package com.company.Generices.Domain.Services;

import com.company.Generices.Domain.Boat;

import java.util.ArrayList;
import java.util.List;

public class BoatRentalService {
    private final List<Boat> boatsAvailable = new ArrayList<>(List.of(new Boat("BMW Boat"), new Boat("MG Boat")));

    public Boat rentingAvailableBoat() {
        System.out.println("Searching For Available Boats");
        Boat boat = boatsAvailable.remove(0);
        System.out.println("Boat for Rent : " + boat);
        System.out.println("remaining Boats : " + boatsAvailable);
        return boat;
    }

    public void retrieveRentalBoat(Boat boat) {
        System.out.println("Returned Boat " + boat);
        boolean add = boatsAvailable.add(boat);
        System.out.println("Checking Boat Returning to Garage Status : " + add);
        System.out.println("Available Boats to Rent " + boat);
    }
}
