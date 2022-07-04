package com.company.Collections.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest1 {
    public static void main(String[] args) {
        Map<String, String> mapGenre = new HashMap<>();
        mapGenre.putIfAbsent("B","Horror");
        mapGenre.putIfAbsent("C","Fantasy");
        mapGenre.putIfAbsent("D","Games");
        mapGenre.putIfAbsent("A","ScienceFiction");
        mapGenre.putIfAbsent("E","Kids");
        mapGenre.putIfAbsent("E","Children");
        System.out.println(mapGenre);
        for (String kI :mapGenre.keySet()){
            System.out.println(kI + " : " + mapGenre.get(kI));
        }
        System.out.println("-----------------------------------------");
        for (Map.Entry<String, String>  keyValuePairs : mapGenre.entrySet()) {
            System.out.println(keyValuePairs);

        }


    }
}
