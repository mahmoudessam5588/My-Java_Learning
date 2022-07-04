package com.company.javacore.oop;

public class VarArgs {
    public void sumArray(int...numbers){
        int sum = 0;
        for (int num : numbers){
            sum+= num;
        }
        System.out.println(sum);
    }
}
