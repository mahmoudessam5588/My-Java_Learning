package com.company.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest3 {
    public static void main(String[] args) {
        //? zero or one
        //* zero or more
        //+ one or more
        //{n,m}from n to m
        //() grouping
        //person(a|s) === person or persona
        //$ end of the line
        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String mather = "12 0x 0x 0XFFABC 0x10G 0x";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(mather);
        while (matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.group() + "\n");
        }
    }
}
