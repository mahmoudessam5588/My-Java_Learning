package com.company.Generices;

abstract class Animal {
    public abstract void consult();
}

class Cats extends Animal {
    @Override
    public void consult() {
        System.out.println("Consulting Cats");
    }
}

class Dogs extends Animal {
    @Override
    public void consult() {
        System.out.println("Consulting Dogs");
    }
}

public class GenericesTest1 {
    public static void main(String[] args) {
        Dogs[] dogs = {new Dogs(), new Dogs()};
        Cats[] cats = {new Cats(), new Cats()};
        print(dogs);
        print(cats);
    }

    private static void print(Animal[] animal) {
        for (Animal i : animal) {
            i.consult();
        }
    }
}
