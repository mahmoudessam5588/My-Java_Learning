package com.company.Polymorphism;

public abstract class Product implements Tax{
    protected  String name;
    protected double price;
    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
