package com.company.Date.Test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocalTest {
    public static void main(String[] args) {
        Locale locale = new Locale("ar","EG");
        Calendar cal =Calendar.getInstance();
        DateFormat dateInstance = DateFormat.getDateInstance(DateFormat.FULL, locale);
        System.out.println(dateInstance.format(cal.getTime()));
        System.out.println(Locale.getDefault());

    }

}
