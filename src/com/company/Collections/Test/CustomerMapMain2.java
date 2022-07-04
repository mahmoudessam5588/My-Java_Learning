package com.company.Collections.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerMapMain2 {
    public static void main(String[] args) {
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

        Map<CustomerMapTest1, List<Manga>> bookStore = new HashMap<>();
        bookStore.putIfAbsent(customer1,List.of(manga1,manga3,manga4));
        bookStore.putIfAbsent(customer2,List.of(manga2,manga4,manga5));
        bookStore.putIfAbsent(customer3,List.of(manga3,manga4,manga6));
        bookStore.putIfAbsent(customer4,List.of(manga6,manga4,manga2));
        bookStore.putIfAbsent(customer5,List.of(manga4,manga2,manga3));
        bookStore.putIfAbsent(customer6,List.of(manga1,manga4,manga5));
        for (Map.Entry<CustomerMapTest1, List<Manga>> listEntry : bookStore.entrySet()) {
            System.out.println(listEntry.getKey().getName() + " :: " + listEntry.getValue().get(0));
        }


    }
}
