package com.company.innerClasses;

public class OuterClassTest2 {
    private String name = "Ahmed Ibrahim";
    void print(){
        class LocalClass{
            void printName() {
                System.out.println(name);
            }
        }
        new LocalClass().printName();

    }
    public static void main(String[] args) {
        OuterClassTest2 outerClass = new OuterClassTest2();
        outerClass.print();

    }
}
