package com.company.JavaTime;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DurationClassTest01 {
    public static void main(String[] args) {
        Duration duration =  Duration.ofSeconds(200);
        Duration duration2 =  Duration.ofNanos(1000000000);
        Duration duration3 =  Duration.ofHours(300);
        Duration duration4 =  Duration.ofDays(20);
        System.out.println(duration);
        System.out.println(duration2);
        System.out.println(duration3);
        System.out.println(duration4);
        LocalDateTime ldt = LocalDateTime.now();
        LocalDateTime ldtAfterTwoYears = LocalDateTime.now().plusYears(2);
        LocalDateTime ldtAfter4Years = LocalDateTime.now().plusYears(4);
        LocalTime locale = LocalTime.now();
        LocalTime localeMinusTwoYears = LocalTime.now().minusHours(2);
        Duration duration5 = Duration.between(ldt,ldtAfterTwoYears);
        Duration duration6 = Duration.between(ldtAfter4Years,ldt);
        Duration duration7 = Duration.of(3, ChronoUnit.DAYS);
        System.out.println(duration6.negated());
        System.out.println(duration6.compareTo(duration5));
        System.out.println(duration7);




    }

}
