package com.company.Polymorphism.service;

import com.company.Polymorphism.Computer;
import com.company.Polymorphism.Product;
import com.company.Polymorphism.Tomato;
import org.jetbrains.annotations.NotNull;

public class ProductTaxReport {




    public static void generateTaXReport(@NotNull Product product){
        System.out.println("Starting Report For Tomato");
        double taxValue = product.calculateTax();
        System.out.println("Price"+ product.getPrice());
        System.out.println("Tax Value" + taxValue);
        if(product instanceof Tomato tomato){
            System.out.println(tomato);}
        else {
            Computer computer = (Computer) product;
            System.out.println(computer);
        }


    }

}
