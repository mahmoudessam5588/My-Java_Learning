package com.company.Generices.Domain;

public class Boat {
    private String boat;

    public Boat(String boat) {
        this.boat = boat;
    }

    @Override
    public String toString() {
        return "Boat{" +
                "boat='" + boat + '\'' +
                '}';
    }
}
