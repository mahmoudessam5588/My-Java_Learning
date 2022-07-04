package com.company.innerClasses;

public class OuterClassTest1 {
    private String name = "Mahmoud Essam";
    class Inner{
        public void PrintAttribute(){
            System.out.println(name);
        }
    }
    public static void main(String[] args) {
        OuterClassTest1 out = new OuterClassTest1();
        OuterClassTest1.Inner in =  out.new Inner();
        in.PrintAttribute();

    }

}
