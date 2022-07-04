package com.company.association.test;

import com.company.association.domain.Professor;
import com.company.association.domain.School;

public class SchoolTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor("steve");
        School school = new School("konoha",new Professor[]{professor});
        school.print();
    }
}
