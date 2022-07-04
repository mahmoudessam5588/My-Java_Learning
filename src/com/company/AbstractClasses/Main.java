package com.company.AbstractClasses;

public class Main {
    public static void main(String[] args) {
        Manager districtManager = new Manager("Mahmoud",20000,"AreaManager");
        System.out.println(districtManager);
        districtManager.credential();
        Owner owner = new Owner("Ahmed",1000000);
        System.out.println(owner);
        owner.credential();
    }
}
