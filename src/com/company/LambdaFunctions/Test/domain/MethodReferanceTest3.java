package com.company.LambdaFunctions.Test.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferanceTest3 {
    public static <T> void main(String[] args) {
        List<String> animeAttributes =new ArrayList<>(List.of("Berserk","SpaceBrothers","Zeki"));
        animeAttributes.sort(String::compareTo);
        System.out.println(animeAttributes);

        Function<String,Integer>numberToStringInt = Integer::parseInt;
        Integer apply = numberToStringInt.apply("10");
        System.out.println(apply);

        BiPredicate<List<String>,String> checker = List::contains;
        boolean spaceBrothers = checker.test(animeAttributes, "SpaceBrothers");
        System.out.println(spaceBrothers);


    }


}
