package com.company.JavaTime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersClassTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        now = now.plusDays(2);//month changed
        now = now.withDayOfMonth(12);//without month change
        now = now.with(ChronoField.DAY_OF_MONTH,12);//same result with temporal field
        now = LocalDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY));
        now = LocalDate.now().with(TemporalAdjusters.previousOrSame(DayOfWeek.FRIDAY));
        now = LocalDate.now().with(TemporalAdjusters.firstDayOfMonth());
        now = LocalDate.now().with(TemporalAdjusters.firstDayOfNextMonth());
        now = LocalDate.now().with(TemporalAdjusters.firstDayOfNextYear());
        now = LocalDate.now().with(TemporalAdjusters.firstDayOfYear());
        now = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
        now = LocalDate.now().with(TemporalAdjusters.lastDayOfYear());
    }
}
