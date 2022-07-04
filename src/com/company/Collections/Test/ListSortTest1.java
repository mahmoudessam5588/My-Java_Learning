package com.company.Collections.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSortTest1 {
    public static void main(String[] args) {
        List <String> fullName = new ArrayList<>();
        fullName.add("Mahmoud");
        fullName.add("Ahmed");
        fullName.add("Ibrahim");
        fullName.add("Yasser");
        fullName.add("Zakariya");
        fullName.add("Osama");
        fullName.add("Sawsan");
        fullName.add("Chie");
        System.out.println(fullName);
        Collections.sort(fullName);
        System.out.println(fullName);
    }
}
