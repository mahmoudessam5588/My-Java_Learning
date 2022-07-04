package com.company.Collections.Test;

import java.util.*;
import java.util.stream.Stream;

public class SetClassTest1 {
    public static void main(String[] args) {
        Set<Manga> mangaSet = new LinkedHashSet<>();
        mangaSet.add(new Manga(5L,"Major",100.99,5));
        mangaSet.add(new Manga(4L,"Pokemon",200.99,12));
        mangaSet.add(new Manga(6L,"SpaceBrothers",155.99,100));
        mangaSet.add(new Manga(3L,"GEtBackers",275.99,5));
        mangaSet.add(new Manga(1L,"OnePiece",140.99,80));
        mangaSet.add(new Manga(2L,"Hunter",187.99,1000));
        for(Manga manga:mangaSet){
            System.out.println(manga);
        }




    }
}
