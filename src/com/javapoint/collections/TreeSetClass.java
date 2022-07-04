package com.javapoint.collections;

import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class TreeSetClass {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>(List.of("Mahmoud", "Essam", "Abdul_hamid", "Mahmoud", "Essam", "El-Masry"));
        System.out.println(treeSet);
        System.out.println(treeSet.descendingSet());
        String ceiling = treeSet.ceiling("M");
        System.out.println(ceiling);
        System.out.println(treeSet.floor("E"));
        System.out.println(treeSet.pollFirst());
        System.out.println(treeSet);
        System.out.println(treeSet.pollLast());
        System.out.println(treeSet);

    }
}
