package com.company.LambdaFunctions.Test.domain;

import com.company.Generices.Domain.AnimeComperator;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class MethodreferenceTest4 {
    public static void main(String[] args) {
        List<AnimeAttributes> animeAttributes =new ArrayList<>(List.of(new AnimeAttributes("Xerserk", "22"), new AnimeAttributes("SpaceBrothers", "12"),new AnimeAttributes("Zeki","6")));
        //AnimeComperator animeComperator = new AnimeComperator();
        Supplier<AnimeComperator> animeCompetitors = AnimeComperator::new;
        AnimeComperator ae = animeCompetitors.get();
        animeAttributes.sort(ae::sortByTitlesNotStatic);
        System.out.println(animeAttributes);
        BiFunction<String,String,AnimeAttributes>an= AnimeAttributes::new;
        System.out.println(an.apply("Mahmoud","Essam"));
    }

}
