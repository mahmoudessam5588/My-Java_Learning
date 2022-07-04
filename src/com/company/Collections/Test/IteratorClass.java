package com.company.Collections.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorClass {
    public static void main(String[] args) {
        MangaTitleComperator mangaTitleComperator = new MangaTitleComperator();
        List<Manga> mangas = new ArrayList<>(15);
        mangas.add(new Manga(5L,"Major",100.99,5));
        mangas.add(new Manga(4L,"Pokemon",200.99,12));
        mangas.add(new Manga(6L,"SpaceBrothers",155.99,100));
        mangas.add(new Manga(3L,"GEtBackers",275.99,5));
        mangas.add(new Manga(1L,"OnePiece",140.99,80));
        mangas.add(new Manga(2L,"Hunter",187.99,1000));
        Iterator<Manga> mangaIterator = mangas.iterator();
        while(mangaIterator.hasNext()){
            Manga next = mangaIterator.next();
            if (next.getQuantity()==5){
                mangaIterator.remove();
            }

            }
        mangas.removeIf(x->x.getQuantity()==5);
        System.out.println(mangas);
        }
    }

