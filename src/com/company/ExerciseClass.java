package com.company;


@SuppressWarnings("unused")
class ExerciseClass<constant> {

    private int age;
    private static String name = String.class.getName();
    private double[] salaries;

    private double average;

    ExerciseClass(int age, String name, double... salaries) {
        this();
        this.age = age;
        ExerciseClass.name = name;
        this.salaries = salaries;

    }
    ExerciseClass(int age, String name, double average,double... salaries) {
        this(age,name,salaries);
        this.average = average;
    }

    ExerciseClass() {
    }

    final int getAge() {

        return this.age;
    }

    final String getName() {
        return ExerciseClass.name;
    }

    final double[] getSalaries() {
        return this.salaries;
    }

    @SuppressWarnings("unused")
    final double getAverage() {
        return this.average;
    }


    final void employeesInfo() {
        System.out.println("Name= " + this.getName() + " Age= " + this.getAge());
        calculateAverageSalaries();
    }

    @SuppressWarnings("unused")
    void employeesInfo(@SuppressWarnings("SameParameterValue") double experience) {
        this.employeesInfo();
        double incentive = experience * 2.5;
        System.out.println(incentive);
    }

    final void calculateAverageSalaries() {

        for (double iterator : this.getSalaries()) {

            this.average += iterator;

        }
        average /= this.getSalaries().length;
        System.out.println(average);
    }
    static {
        System.out.println("first");
    }

}
