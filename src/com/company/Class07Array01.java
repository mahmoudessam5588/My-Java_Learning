package com.company;

import java.util.Arrays;

public class Class07Array01 {
    public static void main(String[] args) {
        int[] ages = new int[3];
        ages[0]=1;
        ages[1]=2;
        ages[2]=3;
        System.out.println(Arrays.toString(ages));
        String[] names= {"mahmoud", "essam","El-Masry"};
        for (String name : names) {
            System.out.println(name);
        }
        int[][]multi = {{1,2,3},{4,5,6}};
        System.out.println(Arrays.toString(multi));

        for (int i=0; i<multi.length; i++) {
            for (int j = 0; j < multi[i].length; j++) {
                System.out.println(multi[i][j]);
            }

        }
        System.out.println("-----------------");
        for (int[]baseArray:multi){
            for (int multiple:baseArray){
                System.out.println(multiple);
            }
        }
    };


}
