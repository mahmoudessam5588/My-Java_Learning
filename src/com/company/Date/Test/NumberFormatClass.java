package com.company.Date.Test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatClass {
    public static void main(String[] args) {
      NumFormat();
      NumCurrencyFormat();

    }
    private static void NumFormat(){
        NumberFormat[] num = new NumberFormat[]{NumberFormat.getInstance(Locale.ITALY),
                NumberFormat.getInstance(Locale.JAPAN),
                NumberFormat.getInstance(Locale.getDefault()),NumberFormat.getInstance(Locale.CHINESE)};
        double Value = 100_000_000.213;
        for (NumberFormat numberFormat : num) {
            System.out.println(numberFormat.format(Value));
        }
    }

    private static void NumCurrencyFormat(){
        NumberFormat[] num = new NumberFormat[]{NumberFormat.getCurrencyInstance(Locale.ITALY),
                NumberFormat.getCurrencyInstance(Locale.JAPAN),
                NumberFormat.getCurrencyInstance(Locale.getDefault()),NumberFormat.getCurrencyInstance(Locale.CHINESE)};
        double Value = 100_000_000.213;
        for (NumberFormat numberFormat : num) {
            System.out.println(numberFormat.getMaximumFractionDigits());
            System.out.println(numberFormat.format(Value));
        }
        String stringValue = "1256";
        try {
            System.out.println(NumberFormat.getInstance().parse(stringValue));
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
