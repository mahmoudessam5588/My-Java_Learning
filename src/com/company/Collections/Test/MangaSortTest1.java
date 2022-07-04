package com.company.Collections.Test;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class MangaTitleComperator implements Comparator<Manga>{
    @Override
    public int compare(Manga M1, Manga M2) {

        return M1.getTitle().compareTo(M2.getTitle());
    }
}

public class MangaSortTest1 {
    public static void main(String[] args) {
        MangaTitleComperator mangaTitleComperator = new MangaTitleComperator();
        List<Manga> mangas = new ArrayList<>(15);
        mangas.add(new Manga(5L,"Major",100.99));
        mangas.add(new Manga(4L,"Pokemon",200.99));
        mangas.add(new Manga(6L,"SpaceBrothers",155.99));
        mangas.add(new Manga(3L,"GEtBackers",275.99));
        mangas.add(new Manga(1L,"OnePiece",140.99));
        mangas.add(new Manga(2L,"Hunter",187.99));
        System.out.println(mangas);
        System.out.println("--------------------");
        Collections.sort(mangas);
        System.out.println(mangas);
        //Collections.sort(mangas,new MangaTitleComperator());
        mangas.sort(new MangaTitleComperator());
        System.out.println("-----------------------");
        System.out.println(mangas);
        System.out.println("------------------------");
        Manga major = new Manga(5L, "Major", 100.99);
        int search = Collections.binarySearch(mangas, major, mangaTitleComperator);
        System.out.println(search);


    }



}

