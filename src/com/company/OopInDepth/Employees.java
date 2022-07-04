package com.company.OopInDepth;

class Employees {
    private final String name;
    private final int socialSecurityId;
    private final Address address;
    private final double salary;
   void print(){
       System.out.println("inside parent print method");
         System.out.println(this.getName());
         System.out.println(this.getSocialSecurityId());
         System.out.println(this.getAddress().getStreet());
         System.out.println(this.getAddress().getZipcode());
         System.out.println(this.getSalary());
     }
    {
        System.out.println("inside initialize parent class1");
    }
    {
        System.out.println("inside initialize parent class2");
    }
    static{
        System.out.println("inside  statici initialize parent class");
         }

   Employees(String name, int socialSecurityId, Address address, double salary) {
        this.name = name;
        this.socialSecurityId = socialSecurityId;
        this.address = address;
        this.salary = salary;
    }

  double getSalary() {
        return salary;
    }

    String getName() {
        return name;
    }

    int getSocialSecurityId() {
        return socialSecurityId;
    }

    public Address getAddress() {
        return address;
    }


}
