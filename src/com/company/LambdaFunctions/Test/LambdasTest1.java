package com.company.LambdaFunctions.Test;

import java.util.List;
import java.util.function.Consumer;

public class LambdasTest1 {
    public static void main(String[] args) {
        List<String> names = List.of("Mahmoud", "Essam", "Abdel-Hamid");
        List<Integer> values =List.of(1,33,4,55,78,890,45,44);
        iteratorList(names, x -> System.out.println(x));
        System.out.println("--------------------------------");
        iteratorList(values, x -> System.out.println(x));

    }
    private static <T> void iteratorList(List<T> t , Consumer<T> consumer) {
        for(T e : t){
            consumer.accept(e);
        }
    }
}
