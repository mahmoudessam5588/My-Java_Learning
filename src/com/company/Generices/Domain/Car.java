package com.company.Generices.Domain;

public class Car {
    private String name;

    public String getName() {
        return name;
    }

    public Car(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                '}';
    }
}
