package com.company.LambdaFunctions.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaTest2 {
    public static void main(String[] args) {
        List<String> meme = List.of("Meme", "yara");
        List<Integer> map = map(meme, String::length);
        System.out.println(map);
    }
    private static <T , R> List<R> map(List<T> list , Function<T, R> function) {
        List<R> result = new ArrayList<>();
        for (T it : list) {
            R r = function.apply(it);
            result.add(r);

        }
        return result;


    }
}
