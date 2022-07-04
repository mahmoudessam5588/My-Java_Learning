package com.company.JavaTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterClassTest1 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String format1 = date.format(DateTimeFormatter.ISO_DATE);
        System.out.println(format1);
        LocalDateTime date2 = LocalDateTime.now();
        String format2 = date2.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(format2);
        String format3 = date2.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        System.out.println(format3);
        LocalDateTime parse = LocalDateTime.parse(format2);
        System.out.println(parse);
        DateTimeFormatter formatterBr = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String customFormatter = LocalDateTime.now().format(formatterBr);
        System.out.println(customFormatter);
        LocalDate parseBR = LocalDate.parse("15/01/2022", formatterBr);
        System.out.println(parseBR);
    }
}
