package com.company.Enum;

enum PaymentType {
    DEBIT{
        @Override
        public double calculateDiscountValue(double value) {
            return value*0.1;
        }
    },CREDIT{
        @Override
        public double calculateDiscountValue(double value) {
            return value*0.05;
        }
    };
    public abstract double calculateDiscountValue(double value);
}