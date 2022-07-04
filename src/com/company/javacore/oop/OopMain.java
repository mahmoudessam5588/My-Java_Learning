package com.company.javacore.oop;

public class OopMain {
    public static void main(String[] args) {
        calculatorCall();
        varArgsCall();
    }

    private static void varArgsCall() {
        VarArgs varArgs = new VarArgs();

        varArgs.sumArray(1,2,3,4,5);
    }

    private static void calculatorCall() {
        Calculator calculator = new Calculator(10,20);
        calculator.sumTwoNumbers();
    }
}
