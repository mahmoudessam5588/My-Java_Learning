package com.company.AbstractClasses;

abstract class Employee extends Person{
    protected String name;
    protected double salary;


    abstract void credential();
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}
