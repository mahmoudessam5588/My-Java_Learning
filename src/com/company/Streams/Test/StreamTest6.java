package com.company.Streams.Test;

import com.company.Streams.LightNovel;

import java.util.ArrayList;
import java.util.List;

public class StreamTest6 {
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
        lightNovel.stream().map(LightNovel::getPrice).filter(price -> price >133.5).reduce(Double::sum).ifPresent(System.out::println);
        lightNovel.stream().mapToDouble(LightNovel::getPrice).filter(price -> price >133.5).max().ifPresent(System.out::println);

    }
}
