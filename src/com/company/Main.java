package com.company;


public class Main {

    public static void main(String[] args) {

        ExerciseClass exp = new ExerciseClass(25,"Mahmoud",new double[]{1500,1700,1800});
        ExerciseClass exp2 = new ExerciseClass(25,"Ahmed",new double[]{1600,1900,2000});
        ExerciseClass exp3 = new ExerciseClass(25,"Yassir",new double[]{46600,77700,99900});
        exp.employeesInfo();
        exp2.employeesInfo();
        exp3.employeesInfo();

    }


}
