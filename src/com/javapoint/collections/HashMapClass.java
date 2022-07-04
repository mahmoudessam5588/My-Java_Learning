package com.javapoint.collections;

import java.util.*;

public class HashMapClass {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"A");
        map.put(2,"B");
        map.put(3,"C");
        map.put(4,"D");
        Set<Map.Entry<Integer, String>> set = map.entrySet();
        Iterator<Map.Entry<Integer, String>> itr  = set.iterator();
        do {
            Map.Entry<Integer,String> next = itr.next();
            System.out.println(next.getKey() + "=" + next.getValue());
        }while(itr.hasNext());
        System.out.println("---------------");
        for (Map.Entry<Integer,String>i: map.entrySet()){
            System.out.println(i.getKey() + "=" + i.getValue());
        }
        System.out.println("----------------------");
        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        System.out.println("--------------------------");
        map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
        

    }
}
