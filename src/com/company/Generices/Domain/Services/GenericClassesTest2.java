package com.company.Generices.Domain.Services;

import com.company.Generices.Domain.Boat;
import com.company.Generices.Domain.Car;

public class GenericClassesTest2 {
    public static void main(String[] args) {
        BoatRentalService boatRentalService = new BoatRentalService();
        Boat boat = boatRentalService.rentingAvailableBoat();
        System.out.println("Renting this : " + boat + " for the whole Moth");
        boatRentalService.retrieveRentalBoat(boat);
    }

}
