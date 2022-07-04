package com.company.OopInDepth;

 class Manager extends Employees {

    private final String department;

    Manager(String name, int socialSecurityId, Address address, double salary, String department) {
        super(name, socialSecurityId, address, salary);
        this.department = department;
    }
    @Override
    void print() {
        System.out.println("inside print child method");
        super.print();
        System.out.println(this.getDepartment());
    }
     {
         System.out.println("inside static initialize child class");
     }
     {
         System.out.println("inside initialize child class1");
     }
     {
         System.out.println("inside initialize child class2");
     }

    String getDepartment() {
        return this.department;
    }


}
