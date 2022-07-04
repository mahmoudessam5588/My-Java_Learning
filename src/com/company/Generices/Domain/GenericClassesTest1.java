package com.company.Generices.Domain;

import com.company.Generices.Domain.Services.CarRentalService;

public class GenericClassesTest1 {
    public static void main(String[] args) {
        CarRentalService carRentalService = new CarRentalService();
        Car car = carRentalService.rentingAvailableCar();
        System.out.println("Renting this : " + car + " for the whole Moth");
        carRentalService.retrieveRentalCar(car);

    }
}
