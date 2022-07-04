package com.company.Collections;

import com.company.Collections.Test.SmartPhones;

public class EqualsTest1 {
    public static void main(String[] args) {
        SmartPhones s1 = new SmartPhones("pro","PinePhone");
        SmartPhones s2 = new SmartPhones("pro","PinePhone");
        System.out.println(s1.equals(s2));
    }


}
