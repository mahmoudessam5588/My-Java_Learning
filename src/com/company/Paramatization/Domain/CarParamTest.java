package com.company.Paramatization.Domain;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class CarParamTest {
    static List<CarParam> cars = List.of(new CarParam("Black", 1979), new CarParam("Silver", 2014));

    public static void main(String[] args) {
        List<CarParam> params = filter(cars, car -> car.getColor().equals("Black"));
        System.out.println(params);

    }

    private static <T> List<T> filter(@NotNull List<T> t, Predicate<T> predicate) {
        List<T> filtered = new ArrayList<>();
        for (T e : t) {
            if (predicate.test(e)) {
                filtered.add(e);
            }

        }
        return filtered;

    }
}
