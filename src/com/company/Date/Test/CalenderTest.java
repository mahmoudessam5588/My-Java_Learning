package com.company.Date.Test;

import java.util.Calendar;
import java.util.Date;

public class CalenderTest {
    public static void main(String[] args) {
        Calendar calculateTax = Calendar.getInstance();
        System.out.println(calculateTax.getTime());
        System.out.println(calculateTax.getFirstDayOfWeek());
        System.out.println(calculateTax.get(Calendar.DAY_OF_MONTH));
        System.out.println(calculateTax.get(Calendar.DAY_OF_YEAR));
        System.out.println(calculateTax.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        calculateTax.add(Calendar.DAY_OF_MONTH,2);
        calculateTax.add(Calendar.MONTH,2);
        calculateTax.add(Calendar.HOUR_OF_DAY,12);
        Date date = calculateTax.getTime();
        System.out.println(date);
    }
}
