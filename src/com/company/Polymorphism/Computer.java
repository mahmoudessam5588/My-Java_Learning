package com.company.Polymorphism;

public class Computer extends Product{
    protected static final double TAX_PERCENTAGE=0.06;
    public Computer(String name, double price) {
        super(name, price);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public double calculateTax() {
        System.out.println("Computer Tax Calculation");
        return this.price *TAX_PERCENTAGE;
    }
}
