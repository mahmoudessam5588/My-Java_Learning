package com.company.innerClasses;

public class AnnonymusClassTest1 {
    public static void main(String[] args) {
        Animal animal = new Animal() {
            @Override
            public void walk() {
                System.out.println("Something Is Walking");
            }
        };
        animal.walk();
    }
}


class Animal {
    public void walk() {
        System.out.println("Animal Walking");
    }


}

class Dog extends Animal {
    @Override
    public void walk() {
        System.out.println("Dog walking");
    }
}

