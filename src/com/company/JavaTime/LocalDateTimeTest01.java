package com.company.JavaTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        LocalDateTime ldt2 = LocalDateTime.of(2022,5,5,1,1,50,55);
        LocalDate ldt3 = LocalDate.parse("2022-08-06");
        LocalTime ldt4 = LocalTime.parse("09:45:21");
        LocalDateTime merge = LocalDateTime.of(ldt3, ldt4);
        LocalDateTime timeObj = ldt3.atTime(ldt4);
        System.out.println(ldt);
        System.out.println(ldt2);
        System.out.println(ldt3);
        System.out.println(ldt4);
        System.out.println(merge);
        System.out.println(timeObj);

    }

}
