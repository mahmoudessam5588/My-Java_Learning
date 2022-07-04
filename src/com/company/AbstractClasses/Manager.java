package com.company.AbstractClasses;

public class Manager extends Employee{
    protected String role;
    public Manager(String name, double salary, String role) {
        super(name, salary);
        this.role = role;
    }

    @Override
    void credential() {
        System.out.println("manager credentials");

    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", role='" + role + '\'' +
                '}';
    }

    @Override
    void print() {
        System.out.println("printing");

    }
}
