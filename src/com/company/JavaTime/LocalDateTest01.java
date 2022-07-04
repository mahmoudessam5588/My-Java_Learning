package com.company.JavaTime;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTest01 {
    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(Calendar.getInstance());
        LocalDate date = LocalDate.of(2022,12,22);
        LocalDate now = LocalDate.now();
        System.out.println(date);
        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.lengthOfMonth());
        System.out.println(date.get(ChronoField.DAY_OF_MONTH));
        System.out.println(date.get(ChronoField.DAY_OF_YEAR));
        System.out.println(date.get(ChronoField.DAY_OF_WEEK));
        System.out.println(now);
        now = now.plusDays(2);
        System.out.println(now);
    }
}
