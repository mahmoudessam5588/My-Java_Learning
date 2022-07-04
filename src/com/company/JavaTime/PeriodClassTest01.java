package com.company.JavaTime;

import com.company.repository.FileRepositoryService;

import java.time.LocalDate;
import java.time.Period;

public class PeriodClassTest01 {
    public static void main(String[] args) {
        Period period = Period.ofYears(12);
        Period period2 = Period.ofDays(20);
        Period period3 = Period.ofMonths(26);
        Period period4 = Period.ofWeeks(33);
        Period period5 = Period.of(22,12,365);
        Period period6 = Period.between(LocalDate.now(),LocalDate.now().plusYears(2));
        System.out.println(period.toTotalMonths());
        System.out.println(period2);
        System.out.println(period3.withDays(7));
        System.out.println(period4.getDays());
        System.out.println(period5);
        System.out.println(period6.toTotalMonths());
    }

}
