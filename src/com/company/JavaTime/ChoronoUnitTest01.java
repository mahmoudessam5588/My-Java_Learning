package com.company.JavaTime;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ChoronoUnitTest01 {
    public static void main(String[] args) {
        LocalDateTime BirthDate =  LocalDateTime.of(2022,5,5,6,30,15,1300);
        System.out.println(ChronoUnit.DAYS.between(BirthDate,LocalDateTime.now()));
        System.out.println(ChronoUnit.MONTHS.between(BirthDate,LocalDateTime.now()));
        System.out.println(ChronoUnit.WEEKS.between(BirthDate,LocalDateTime.now()));
        System.out.println(ChronoUnit.YEARS.between(BirthDate,LocalDateTime.now()));
    }

}
