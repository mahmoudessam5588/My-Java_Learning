package com.company.Collections.Test;

import java.util.HashMap;
import java.util.Map;

public class CustomerMapMain {
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

        Map<CustomerMapTest1, Manga> bookStore = new HashMap<>();
        bookStore.putIfAbsent(customer1,manga5);
        bookStore.putIfAbsent(customer2,manga3);
        bookStore.putIfAbsent(customer3,manga2);
        bookStore.putIfAbsent(customer4,manga1);
        bookStore.putIfAbsent(customer5,manga4);
        bookStore.putIfAbsent(customer6,manga6);
        for (Map.Entry<CustomerMapTest1, Manga> mangaEntry : bookStore.entrySet()) {
            System.out.println("----------------");
            System.out.println(mangaEntry.getKey().getName() + " -- " + mangaEntry.getValue().getTitle());
        }

    }

}
