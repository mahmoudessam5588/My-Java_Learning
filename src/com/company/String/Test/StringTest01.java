package com.company.String.Test;

public class StringTest01 {
    public static void main(String[] args) {
        String name1 = "Mahmoud";
        String name2 = "Essam";

        System.out.println(name2);
        boolean equals = name1.equals(name2);
        System.out.println(equals);
        System.out.println(name1==name2);
        String name = name1.concat( " " + name2);
        System.out.println(name);
        System.out.println(name1);
        System.out.println(name2);
        String names = new String("Mahmoud");
        System.out.println(name1.equals(names));
        System.out.println(name1==names.intern());


    }
}
