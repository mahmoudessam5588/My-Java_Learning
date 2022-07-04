package com.company.Collections.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArrayConvertionTest1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Integer[] integers = list.toArray(new Integer[0]);
        System.out.println(Arrays.toString(integers));
        System.out.println("-------------------------");
        Integer[] num = new Integer[]{1,22,55,6,78,90,456,77};
        List<Integer> integers1 = Arrays.asList(num);
        System.out.println(integers1);
        List<Integer> integers2 = new ArrayList<>(Arrays.asList(num));
        integers2.add(12);
        System.out.println(integers2);
        System.out.println(Arrays.toString(num));
    }
}
