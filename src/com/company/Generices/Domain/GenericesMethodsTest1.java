package com.company.Generices.Domain;

import java.util.List;

public class GenericesMethodsTest1 {
    public static void main(String[] args) {
        arrayObj(List.of(new Boat("MG")));

    }
    private static <T> void arrayObj(T t){
        List<T> list = List.of(t);
    }
}
