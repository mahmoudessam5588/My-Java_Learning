package com.company.Streams.Test;

import com.company.Streams.Category;
import com.company.Streams.LightNovel;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

import static com.company.Streams.Category.DRAMA;
import static com.company.Streams.Category.FANTASY;
import static java.util.stream.Collectors.groupingBy;

public class StreamTest10 {
    public static List<LightNovel> lightNovel = new ArrayList<>(List.of(new LightNovel("Days", 133.5, FANTASY), new LightNovel("Overlord", 154.5, DRAMA), new LightNovel("Attack On Titans", 200.75, FANTASY), new LightNovel("Hi Darling", 500.5, Category.KIDS), new LightNovel("Trevor Duck", 168.75, Category.SCIFI), new LightNovel("Bugs Bunny", 180.65, FANTASY), new LightNovel("Full Metal Alchemist", 120.75, FANTASY), new LightNovel("Zircon Metal ", 140.80, DRAMA)));

    public static void main(String[] args) {
        System.out.println(lightNovel.stream().collect(groupingBy(ln->ln.getPrice()<150?Promotion.UNDER_PROMOTION:Promotion.OVER_PRICED)));
        Map<Category, Map<Promotion, List<LightNovel>>> collect = lightNovel.stream().collect(groupingBy(LightNovel::getCategory, groupingBy(ln -> ln.getPrice() < 150 ? Promotion.UNDER_PROMOTION : Promotion.OVER_PRICED)));
        System.out.println(collect);
        Map<Category, Long> longMap = lightNovel.stream().collect(groupingBy(LightNovel::getCategory, Collectors.counting()));
        System.out.println(longMap);
        Map<Category, Optional<LightNovel>> collect1 = lightNovel.stream().collect(groupingBy(LightNovel::getCategory, Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))));
        System.out.println(collect1);
        Map<Category, LightNovel> collect2 = lightNovel.stream().collect(groupingBy(LightNovel::getCategory, Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice)), Optional::get)));
        Map<Category, LightNovel> collect3 = lightNovel.stream().collect(Collectors.toMap(LightNovel::getCategory, Function.identity(), BinaryOperator.maxBy(Comparator.comparing(LightNovel::getPrice))));
        System.out.println(collect3);
        System.out.println(collect2);
        System.out.println("Statistics----------------------------");
        System.out.println(lightNovel.stream().collect(Collectors.groupingBy(LightNovel::getCategory,Collectors.summarizingDouble(LightNovel::getPrice))));
        Map<Category, LinkedHashSet<Promotion>> collect4 = lightNovel.stream().collect(groupingBy(LightNovel::getCategory, Collectors.mapping(s -> s.getPrice() > 150 ? Promotion.UNDER_PROMOTION : Promotion.OVER_PRICED, Collectors.toCollection(LinkedHashSet::new))));
        System.out.println(collect4);

    }
}
