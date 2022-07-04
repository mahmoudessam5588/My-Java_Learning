package com.company.Collections.Test;



import java.util.*;


class MangaComperator implements Comparator<Manga> {


    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getId(),o2.getId());
    }
}

public class NavigableMapTest1 {
    public static void main(String[] args) {
        NavigableMap<Manga,CustomerMapTest1 > sales = new TreeMap<>();
        CustomerMapTest1 customer1 = new CustomerMapTest1("Mahmoud Essam");
        CustomerMapTest1 customer2 = new CustomerMapTest1("Ahmed Moustafa");
        CustomerMapTest1 customer3 = new CustomerMapTest1("Ibrahim Awad");
        CustomerMapTest1 customer4 = new CustomerMapTest1("Yasser Mohammed");
        CustomerMapTest1 customer5 = new CustomerMapTest1("John Smith");
        CustomerMapTest1 customer6 = new CustomerMapTest1("Edward Steward");


        Manga manga1 = new Manga(5L, "Major", 100.99);
        Manga manga2 = new Manga(4L, "Pokemon", 200.99);
        Manga manga3 = new Manga(6L, "SpaceBrothers", 155.99);
        Manga manga4 = new Manga(3L, "GEtBackers", 275.99);
        Manga manga5 = new Manga(1L, "OnePiece", 140.99);
        Manga manga6 = new Manga(2L, "Hunter", 187.99);
        sales.putIfAbsent(manga1,customer5);
        sales.putIfAbsent(manga2,customer2);
        sales.putIfAbsent(manga3,customer4);
        sales.putIfAbsent(manga6,customer3);
        sales.putIfAbsent(manga4,customer1);
        sales.putIfAbsent(manga5,customer6);
        for (Map.Entry<Manga, CustomerMapTest1> mapTest1Entry : sales.entrySet()) {
            System.out.println(mapTest1Entry.getKey().getTitle() + " : " + mapTest1Entry.getValue().getName());
        }
        NavigableSet<Manga> mangas = sales.headMap(manga1, true).descendingKeySet();
        System.out.println(mangas);


    }
}
