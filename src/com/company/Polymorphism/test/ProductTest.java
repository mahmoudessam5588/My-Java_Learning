package com.company.Polymorphism.test;

import com.company.Polymorphism.Computer;
import com.company.Polymorphism.Tomato;
import com.company.Polymorphism.service.ProductTaxReport;

public class ProductTest {
    public static void main(String[] args) {
        Computer computer = new Computer("Dell",12500);
        System.out.println(computer);
        System.out.println("--------------------------------------");
        Tomato tomato = new Tomato("Cherry Tomato",12,"3Days");
        System.out.println(tomato);
        System.out.println("------------------------------------");
        ProductTaxReport.generateTaXReport(tomato);
        System.out.println("-----------------------------------");
        ProductTaxReport.generateTaXReport(computer);



    }
}
