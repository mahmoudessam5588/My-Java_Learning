package com.company.Collections.Test;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest1 {
    public static void main(String[] args) {
        Queue<Manga> names = new PriorityQueue<>(new MangaPriceComperator().reversed());
        names.add(new Manga(5L,"Major",100.99));
        names.add(new Manga(4L,"Pokemon",200.99));
        names.add(new Manga(6L,"SpaceBrothers",155.99));
        names.add(new Manga(3L,"GEtBackers",275.99));
        names.add(new Manga(1L,"OnePiece",140.99));
        names.add(new Manga(2L,"Hunter",187.99));
        names.add(new Manga(10L,"Hunter",187.994));

        System.out.println("----------------");
        while (!names.isEmpty()) {
            Manga poll = names.poll();
            System.out.println(poll);
        }

    }
}
