package com.company.Generices.Domain.Services;

import java.util.List;

public record RentalService<T>(List<T> objectAvailable) {

    public T rentingAvailableObject() {
        System.out.println("Searching For Available Object");
        T t = objectAvailable.remove(0);
        System.out.println("Object for Rent : " + t);
        System.out.println("remaining Objects : " + objectAvailable);
        return t;
    }

    public void retrieveRentalObject(T t) {
        System.out.println("Returned Object " + t);
        boolean addObj = objectAvailable.add(t);
        System.out.println("Checking Car Returning to Garage Status : " + addObj);
        System.out.println("Available Objects to Rent " + t);
    }

}
