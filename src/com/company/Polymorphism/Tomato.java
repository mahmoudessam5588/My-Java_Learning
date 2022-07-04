package com.company.Polymorphism;

public class Tomato extends Product{
    protected static final double TAX_PERCENTAGE=0.2;
    private String bestUsedBefore;

    @Override
    public String toString() {
        return "Tomato{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", bestUsedBefore='" + bestUsedBefore + '\'' +
                '}';
    }

    public String getBestUsedBefore() {
        return bestUsedBefore;
    }

    public void setBestUsedBefore(String bestUsedBefore) {
        this.bestUsedBefore = bestUsedBefore;
    }

    public Tomato(String name, double price,String bestUsedBefore) {
        super(name, price);
        this.bestUsedBefore = bestUsedBefore;
    }

    @Override
    public double calculateTax() {
        System.out.println("Tomato Tax Calculation");
        return this.price *TAX_PERCENTAGE;
    }
}
