package com.company.seminar.excersie;

public class Seminar {
    private String title;
    private Students[]students;
    private Place place;

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public Seminar(String title, Students[] students, Place place) {
        this.title = title;
        this.students = students;
        this.place = place;
    }
    public Seminar(String title, Place place) {
        this.title = title;
        this.place = place;
    }

    public Students[] getStudents() {
        return students;

    }
    public void printSeminar() {
        System.out.println(this.getTitle() + " " + this.getPlace());
        if (this.students == null && this.place==null ){
            return;
        }
        else if(this.students!=null) {
            for (Students student : students) {
                System.out.println(student.getName());

            }
        }

        }



    public void setStudents(Students[] students) {
        this.students = students;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


}
