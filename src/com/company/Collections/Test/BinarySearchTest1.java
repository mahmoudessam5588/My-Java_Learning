package com.company.Collections.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BinarySearchTest1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(6);
        list.add(22);
        list.add(45);
        list.add(45);
        list.add(67);
        list.add(12);
        list.add(100);
        list.add(33);
        list.add(77);
        //list must be sorted before working with binary search
        Collections.sort(list);
        int search = Collections.binarySearch(list, 67);
        System.out.println(search);
        System.out.println(list);

    }
}
