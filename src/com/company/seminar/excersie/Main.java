package com.company.seminar.excersie;

public class Main {
    public static void main(String[] args) {
        Students student1 = new Students("Alex",25);
        Students student2 = new Students("Mike",28);
        Students student3 = new Students("John",27);
        Students[] numberOfScienceStudents = new Students[]{student1,student2,student3};
        Place sciencePlace = new Place("California");
        Seminar ScienceSeminar = new Seminar("Science",numberOfScienceStudents,sciencePlace);
        Seminar[] seminars = new Seminar[]{ScienceSeminar};

        Professor professor = new Professor("Dr.Ahmed","ScienceField",seminars);
        ScienceSeminar.printSeminar();
        System.out.println("-------------");
        professor.printProfessor();
    }
}
