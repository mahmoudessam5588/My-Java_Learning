package com.company.Generices.Domain.Services;

import com.company.Generices.Domain.Car;

import java.util.ArrayList;
import java.util.List;

public class CarRentalService {
    private final List<Car> carsAvailable = new ArrayList<>(List.of(new Car("BMW"), new Car("MG")));

    public Car rentingAvailableCar() {
        System.out.println("Searching For Available Cars");
        Car car = carsAvailable.remove(0);
        System.out.println("Car for Rent : " + car);
        System.out.println("remaining Cars : " + carsAvailable);
        return car;
    }

    public void retrieveRentalCar(Car car) {
        System.out.println("Returned Car " + car);
        boolean add = carsAvailable.add(car);
        System.out.println("Checking Car Returning to Garage Status : " + add);
        System.out.println("Aviable Cars to Rent " + car);
    }

}
