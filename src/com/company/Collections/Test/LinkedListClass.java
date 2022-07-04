package com.company.Collections.Test;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListClass {
    public static void main(String[] args) {
        LinkedList<String> names= new LinkedList<>();
        names.add("Ahmed");
        names.add("Mahmoud");
        names.add("Ibrahim");
        names.add("Yasser");
        names.add("Iman");
        LinkedList<String> aliases= new LinkedList<>();
        aliases.add("Sawsan");
        aliases.add("Samira");
        aliases.add("dina");
        Collections.sort(names);
        System.out.println(names);
        names.add(2,"Rokhaya");
        String s = names.get(0);
        System.out.println(s);
        names.addAll(3,aliases);
        names.listIterator(4);
        int size = names.size();
        System.out.println(size);
        names.addFirst("Mohammed");
        names.addLast("Asaad");
        LinkedList<String>  clone = (LinkedList<String>) names.clone();
        System.out.println(clone);
        names.descendingIterator();
        System.out.println(names);
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()){
            if (iterator.next().equals("Ahmed")){
                iterator.remove();

            }
        }
        System.out.println(names);
        //System.out.println(names.removeIf(x -> x.equals("Ahmed")));


    }
}
