package com.company.JavaTime;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        LocalTime timeAfter = LocalTime.of(1,22,33,5);
        System.out.println(time);
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());
        System.out.println(time.get(ChronoField.AMPM_OF_DAY));
        System.out.println(timeAfter);
        System.out.println(LocalTime.MIDNIGHT);
        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MAX);
    }

}
