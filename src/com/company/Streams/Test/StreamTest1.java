package com.company.Streams.Test;

import com.company.Streams.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest1 {
    public static List<LightNovel> lightNovel = new ArrayList<LightNovel>(List.of(
            new LightNovel("Days",133.5),
            new LightNovel("Overlord",154.5),
            new LightNovel("Attack On Titans",200.75),
            new LightNovel("Hi Darling",500.5),
            new LightNovel("Trevor Duck",168.75),
            new LightNovel("Bugs Bunny",180.65),
            new LightNovel("Full Metal Alchemist",120.75),
            new LightNovel("Zircon Metal ",140.80)));

    public static void main(String[] args) {
        lightNovel.sort(Comparator.comparing(LightNovel::getTitle));
        System.out.println(lightNovel);
        List<String>filteredList = new ArrayList<String>();
            for (LightNovel novels : lightNovel) {
                if (novels.getPrice() <= 150.5) {
                    filteredList.add(novels.getTitle());
                }
                if (filteredList.size()>=3){
                    break;
                }
            }
        System.out.println(filteredList);



    }
}

