package com.company.Date.Test;

import java.text.DateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;


public class DateFormatTest {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        DateFormat[] dfa = new DateFormat[7];
        dfa[0]=DateFormat.getInstance();
        dfa[1]=DateFormat.getDateInstance();
        dfa[2]=DateFormat.getDateTimeInstance();
        dfa[3]=DateFormat.getDateInstance(DateFormat.SHORT);
        dfa[4]=DateFormat.getDateInstance(DateFormat.MEDIUM);
        dfa[5]=DateFormat.getDateInstance(DateFormat.LONG);
        dfa[6]=DateFormat.getDateInstance(DateFormat.FULL);
        Date date = new Date();

        for (DateFormat dates:dfa){
            System.out.println(dates.format(cal.getTime()));
            System.out.println(dates.format(date));
        }
    }

}
