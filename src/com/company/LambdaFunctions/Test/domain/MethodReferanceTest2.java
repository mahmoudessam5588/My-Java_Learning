package com.company.LambdaFunctions.Test.domain;

import com.company.Generices.Domain.AnimeComperator;

import java.util.ArrayList;
import java.util.List;

public class MethodReferanceTest2 {
    public static void main(String[] args) {
        List<AnimeAttributes> animeAttributes =new ArrayList<>(List.of(new AnimeAttributes("Berserk", "22"), new AnimeAttributes("SpaceBrothers", "12"),new AnimeAttributes("Zeki","6")));
        AnimeComperator animeComperator = new AnimeComperator();
        animeAttributes.sort(animeComperator::sortByTitlesNotStatic);
        System.out.println(animeAttributes);
        
    }
   

}
