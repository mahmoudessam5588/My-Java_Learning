package com.company.Streams.Test;

import com.company.Streams.LightNovel;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class StreamTest8 {
    public static List<LightNovel> lightNovel = new ArrayList<>(List.of(
            new LightNovel("Days",133.5),
            new LightNovel("Overlord",154.5),
            new LightNovel("Attack On Titans",200.75),
            new LightNovel("Hi Darling",500.5),
            new LightNovel("Trevor Duck",168.75),
            new LightNovel("Bugs Bunny",180.65),
            new LightNovel("Full Metal Alchemist",120.75),
            new LightNovel("Zircon Metal ",140.80)));

    public static void main(String[] args) {
        System.out.println((long) lightNovel.size());
        System.out.println( lightNovel.stream().count());
        System.out.println( lightNovel.stream().collect(Collectors.counting()));
        System.out.println( lightNovel.stream().collect(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))));
         lightNovel.stream().max(Comparator.comparing(LightNovel::getPrice)).ifPresent(System.out::println);
        lightNovel.stream().map(LightNovel::getPrice).reduce(Double::sum).ifPresent(System.out::println);
        System.out.println(lightNovel.stream().mapToDouble(LightNovel::getPrice).sum());
        System.out.println("below---------------");
        System.out.println(lightNovel.stream().collect(Collectors.summarizingDouble(LightNovel::getPrice)));
        System.out.println(lightNovel.stream().collect(Collectors.summingDouble(LightNovel::getPrice)));
        System.out.println("Average ----------below---------------------");
        System.out.println(lightNovel.stream().collect(Collectors.averagingDouble(LightNovel::getPrice)));
        lightNovel.stream().mapToDouble(LightNovel::getPrice).average().ifPresent(System.out::println);
        System.out.println("joining----------------------");
        System.out.println(lightNovel.stream().map(LightNovel::getTitle).sorted().collect(Collectors.joining(", ")));
        System.out.println(lightNovel.stream().map(LightNovel::getTitle).sorted().collect(Collectors.toList()));
    }

}
