package com.company.String.Test;

public class StringBuilders {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        AppendMethod(30000);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        long start2 = System.currentTimeMillis();
        AppendMethod2(30000);
        long end2 = System.currentTimeMillis();
        System.out.println(end2 - start2);


    }

private static void AppendMethod(int size){
        StringBuilder builder = new StringBuilder(size);
        for(int i = 0; i < size; i++){
            builder.append(i);
        }
}

    private static void AppendMethod2(int size){
        String builder="";
        for(int i = 0; i < size; i++){
            builder+=i;
        }


    }



}
