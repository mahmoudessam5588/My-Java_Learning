package com.company.Collections.Test;

import java.util.Comparator;
import java.util.TreeSet;
class MangaPriceComperator implements Comparator<Manga>{
    @Override
    public int compare(Manga o1, Manga o2) {

        return Double.compare(o1.getPrice(),o2.getPrice());
    }
}
public class NavigableSetTest1 {
    public static void main(String[] args) {
        //navigable set is sorted set
        //no duplicate make sure you use compare to attribute that can't be duplicated like title for example

        TreeSet<Manga> sortedSet =new  TreeSet<>(new MangaPriceComperator());
        sortedSet.add(new Manga(5L,"Major",100.99));
        sortedSet.add(new Manga(4L,"Pokemon",200.99));
        sortedSet.add(new Manga(6L,"SpaceBrothers",155.99));
        sortedSet.add(new Manga(3L,"GEtBackers",275.99));
        sortedSet.add(new Manga(1L,"OnePiece",140.99));
        sortedSet.add(new Manga(2L,"Hunter",187.99));
        sortedSet.add(new Manga(10L,"Hunter",187.994));
        System.out.println(sortedSet);
        for(Manga m : sortedSet.descendingSet()){
            System.out.println(m);
        }
        //4 methods => lower< |floor<= |higher > |ceiling>= compared to given object below only first result given
        Manga spaceBrother2 = new Manga(12L,"SpaceBrothers2",155);
        System.out.println("-----------------------");
        System.out.println(sortedSet.lower(spaceBrother2));
        System.out.println("----------------------");
        System.out.println(sortedSet.floor(spaceBrother2));
        System.out.println("----------------------");
        System.out.println(sortedSet.higher(spaceBrother2));
        System.out.println("----------------------");
        System.out.println(sortedSet.ceiling(spaceBrother2));

    }
}
