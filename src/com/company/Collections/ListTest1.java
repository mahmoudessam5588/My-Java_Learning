package com.company.Collections;

import java.util.ArrayList;

public class ListTest1 {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>(16);
        name.add("Mahmoud");
        name.add("Essam");
        name.add("Abdel-Hamid");
        name.add("Mahmoud");
        name.add("El-Masry");
        System.out.println(name);
        for (String iterator : name){
            System.out.println(iterator);
        }
        for (int i = 0; i < name.size(); i++){
            System.out.println(name.get(i));
        }
        //System.out.println(name.remove("Mahmoud"));
        //System.out.println(name.remove(2));
        System.out.println(name);
        ArrayList<String> names = new ArrayList<String>();
        names.add("sawsan");
        names.add("Moustafa");
        names.add("El-Sharkawy");

        name.addAll(names);
        System.out.println(name);

    }
}
