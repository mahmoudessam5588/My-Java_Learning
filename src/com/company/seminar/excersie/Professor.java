package com.company.seminar.excersie;

public class Professor {
    private String name;
    private String researchField;
    Seminar[] seminars;

    public void printProfessor(){
        if(this.seminars==null){
            return;
        }else if (this.seminars!=null){
            for (Seminar seminar : seminars) {
                System.out.println(seminar.getTitle());

            }

        }
        System.out.println(this.getName() + " " +this.getResearchField());
    }




    public Seminar[] getSeminars() {
        return this.seminars;
    }

    public void setSeminars(Seminar[] seminars) {
        this.seminars = seminars;
    }

    public Professor(String name, String researchField, Seminar[] seminars) {
        this.name = name;
        this.researchField = researchField;
        this.seminars = seminars;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResearchField() {
        return this.researchField;
    }

    public void setResearchField(String researchField) {
        this.researchField = researchField;
    }

    public Professor(String name, String researchField) {
        this.name = name;
        this.researchField = researchField;
    }
}
