package com.company.Streams.Test;

import com.company.Streams.Category;
import com.company.Streams.LightNovel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static com.company.Streams.Category.DRAMA;
import static com.company.Streams.Category.FANTASY;

public class StreamTest9 {
    public static List<LightNovel> lightNovel = new ArrayList<>(List.of(new LightNovel("Days", 133.5, FANTASY), new LightNovel("Overlord", 154.5, DRAMA), new LightNovel("Attack On Titans", 200.75, FANTASY), new LightNovel("Hi Darling", 500.5, Category.KIDS), new LightNovel("Trevor Duck", 168.75, Category.SCIFI), new LightNovel("Bugs Bunny", 180.65, FANTASY), new LightNovel("Full Metal Alchemist", 120.75, FANTASY), new LightNovel("Zircon Metal ", 140.80, DRAMA)));

    public static void main(String[] args) {
        System.out.println(lightNovel.stream().collect(Collectors.groupingBy(LightNovel::getCategory)));
        Map<Category, List<LightNovel>> filterByCategory = new HashMap<>();
        List<LightNovel> fantasyList = new ArrayList<>();
        List<LightNovel> dramaList = new ArrayList<>();
        List<LightNovel> kidsList = new ArrayList<>();
        List<LightNovel> sciFiList = new ArrayList<>();
        for (LightNovel novel : lightNovel) {
            switch (novel.getCategory()) {
                case DRAMA -> dramaList.add(novel);
                case FANTASY -> fantasyList.add(novel);
                case KIDS -> kidsList.add(novel);
                case SCIFI -> sciFiList.add(novel);
            }
        }
        filterByCategory.put(Category.DRAMA, dramaList);
        filterByCategory.put(Category.FANTASY, fantasyList);
        filterByCategory.put(Category.KIDS, kidsList);
        filterByCategory.put(Category.SCIFI, sciFiList);
        System.out.println("------------------");
        System.out.println(filterByCategory);

    }

}
