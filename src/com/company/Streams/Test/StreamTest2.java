package com.company.Streams.Test;

import com.company.Streams.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;


public class StreamTest2 {
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
        List<String> lightNovelStream = lightNovel.stream().sorted(Comparator.comparing(LightNovel::getTitle))
                .filter(s -> s.getPrice() <= 150.5).limit(4).map(LightNovel::getTitle).toList();
        System.out.println(lightNovelStream);
        lightNovel.forEach(ln-> System.out.println(ln.getTitle()));
    }
}
