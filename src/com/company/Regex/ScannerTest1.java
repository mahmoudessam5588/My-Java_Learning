package com.company.Regex;

import java.util.Arrays;
import java.util.List;

public class ScannerTest1 {
    public static void main(String[] args) {
        String text = "Eren,Levi,Mikasa";
        String[] names = text.split(",");
        System.out.println(Arrays.toString(names));


    }
}
