package com.company.Enum;


import static com.company.Enum.CustomerType.*;
import static com.company.Enum.PaymentType.CREDIT;
import static com.company.Enum.PaymentType.DEBIT;

public class Main {
    public static void main(String[] args) {
        Customer c1 = new Customer("ahmed", INDIVIDUAL,DEBIT);
        Customer c2 = new Customer("Mohammed", COMPANY,CREDIT);
        System.out.println(CREDIT.calculateDiscountValue(100));
        System.out.println(DEBIT.calculateDiscountValue(100));
        CustomerType customerType = CustomerType.getByReportValue("Individual");
        assert customerType != null;
        System.out.println(customerType.getREPORT_VALUE());


        System.out.println(c1 + " , " + c2);



    }
}
