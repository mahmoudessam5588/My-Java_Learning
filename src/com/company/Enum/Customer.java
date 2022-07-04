package com.company.Enum;

record Customer(String name, CustomerType customerType, PaymentType PaymentType) {

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", customerType=" + customerType.getDB_VALUE() +
                ", PaymentType=" + PaymentType +
                '}';
    }
}
