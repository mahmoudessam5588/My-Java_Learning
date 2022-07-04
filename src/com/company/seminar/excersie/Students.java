package com.company.seminar.excersie;

public class Students {
    private String name;
    private int age;
    Seminar seminar;

    public Seminar getSeminar() {
        return seminar;
    }
    public void printStudents(){
        if(this.seminar==null){
            return;
        }
        else{
            this.getSeminar();
        }
        System.out.println(this.getName() + this.getAge());
    }

    public void setSeminar(Seminar seminar) {
        this.seminar = seminar;
    }

    public Students(String name, int age, Seminar seminar) {
        this(name,age);
        this.seminar = seminar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Students(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
