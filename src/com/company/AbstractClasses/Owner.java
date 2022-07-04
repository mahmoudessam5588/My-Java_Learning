package com.company.AbstractClasses;

public class Owner extends Employee{
    public Owner(String name, double salary) {
        super(name, salary);
    }

    @Override
    void credential() {
        System.out.println("Owner credentials");
    }

    @Override
    void print() {
        System.out.println("printing");

    }
}
