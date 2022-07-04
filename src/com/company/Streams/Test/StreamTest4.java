package com.company.Streams.Test;

import com.company.Streams.LightNovel;
import com.company.repository.FileRepositoryService;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamTest4 {
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
        System.out.println(lightNovel.stream().anyMatch(s->s.getTitle().contains("B")));
        lightNovel.stream().filter(s -> s.getPrice() > 120.5).findAny().map(LightNovel::getTitle).ifPresent(System.out::println);
        lightNovel.stream().filter(s -> s.getPrice() <= 180).min(Comparator.comparing(LightNovel::getTitle)).ifPresent(System.out::println);
    }

}
