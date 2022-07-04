package com.company.Collections.Test;

import java.util.ArrayList;


public class SmartPhonesLisTest1 {
    public static void main(String[] args) {
        SmartPhones phone1 = new SmartPhones("pro","PinePhone");
        SmartPhones phone2 = new SmartPhones("5","Librem");
        SmartPhones phone3 = new SmartPhones("Phosphos","Activx");
        ArrayList<SmartPhones> phonesList = new ArrayList<>(6);
        phonesList.add(phone1);
        phonesList.add(phone2);
        phonesList.add(phone3);
        System.out.println(phonesList);
        int i = phonesList.indexOf(phone2);
        System.out.println(i);
        if (i != -1){
            SmartPhones smartPhones = phonesList.get(i);
            System.out.println(smartPhones);
        }
        boolean contains = phonesList.contains(phone1);
        System.out.println(contains);
    }
}
