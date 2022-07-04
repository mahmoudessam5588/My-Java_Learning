package com.company.Generices.Domain.Services;

import com.company.Generices.Domain.Boat;
import com.company.Generices.Domain.Car;

import java.util.ArrayList;
import java.util.List;

public class GenericClassesTest3 {
    public static void main(String[] args) {
        List<Car> carsAvailable = new ArrayList<>(List.of(new Car("BMW"), new Car("MG")));
        List<Boat> boatsAvailable = new ArrayList<>(List.of(new Boat("BMW Boat"), new Boat("MG Boat")));
        RentalService<Car>rental=new RentalService<>(carsAvailable);
        Car car = rental.rentingAvailableObject();
        System.out.println("using " + car +" for 8 months");
        rental.retrieveRentalObject(car);
        System.out.println("--------------------------");
        RentalService<Boat>boatRental=new RentalService<>(boatsAvailable);
        Boat boat = boatRental.rentingAvailableObject();
        System.out.println("using " + boat +" for 8 months");
        boatRental.retrieveRentalObject(boat);

    }



}
