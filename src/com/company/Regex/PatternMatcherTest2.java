package com.company.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest2 {
    public static void main(String[] args) {
        //String regex = "[CJe]";
        String regex = "[a-m]";
        String mather = "cafejunkie";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(mather);
        while (matcher.find()){
            System.out.println(matcher.start() +" "+matcher.group() + "\n");
        }

    }
}
