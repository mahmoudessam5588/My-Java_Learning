package com.company;

public class PrimitiveTypes {

    public static void main(String[] args) {
        //prim. = int ,float, double ,byte ,byte , short , long , boolean , char

        int carPrice = 20000;
        int count=0;
        int instalment;
        do{
            instalment=carPrice/++count;
            System.out.println("if value of instalment = "+ instalment + " then monthly count = " + count );

        }while(instalment>1000);
    }
}
