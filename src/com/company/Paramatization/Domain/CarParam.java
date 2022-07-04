package com.company.Paramatization.Domain;

public class CarParam {
    private final String name= "Toyota";
    private String color;
    private int year;

    public CarParam(String color, int year) {
        this.color = color;
        this.year = year;
    }

    @Override
    public String toString() {
        return "CarParam{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }
}
