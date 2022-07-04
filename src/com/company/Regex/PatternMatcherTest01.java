package com.company.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args) {
        // \\d numbers from 0 to 9
        // \\D all the symbols except 0 to 9
        // \s all blank spaces
        // \S everything else
        //String regex = "\\d";
        //String regex = "\\D";
        String regex = "\\s";

        String mather = "fds121dsf ddf56";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(mather);
        while (matcher.find()){
            System.out.println(matcher.start() +" "+matcher.group() + "\n");
        }

    }
}
