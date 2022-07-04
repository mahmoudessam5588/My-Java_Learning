package com.company.Generices;

import java.util.ArrayList;
import java.util.List;

public class GenericesTest2 {
    public static void main(String[] args) {
      List<Dogs> dogs = List.of(new Dogs(),new Dogs());
      List<Cats> cats = List.of(new Cats(),new Cats());
      List<Animal> animals = new ArrayList<>();
      print(animals);
      print(dogs);
      print(cats);
    }

    private static void print(List<? extends Animal> animal) {

        for (Animal i : animal) {
            i.consult();
        }
    }
}
