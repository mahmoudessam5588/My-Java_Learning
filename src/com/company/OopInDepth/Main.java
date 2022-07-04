package com.company.OopInDepth;

public class Main {
    public static void main(String[] args) {
        Address managerAddress1 = new Address("5th Ave Street", 129808);
        Employees manager1 = new Manager("Mahmoud", 124567, managerAddress1,
                120000, "Data Architect");
        manager1.print();
    }
}
