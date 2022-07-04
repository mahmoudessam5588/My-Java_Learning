package com.company.innerClasses;

import com.company.Generices.Domain.Car;

import java.util.ArrayList;

import java.util.Comparator;
import java.util.List;

public class AnnonymusClassTest2 {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>(List.of(new Car("Toyota"), new Car("Honda")));
        cars.sort(Comparator.comparing(Car::getName));
        System.out.println(cars);

    }
}
