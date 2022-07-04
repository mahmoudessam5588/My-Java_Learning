package com.company.ResourceBundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleClass {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        ResourceBundle resourceBundle = ResourceBundle.getBundle("messages", new Locale("en", "us"));
        System.out.println(resourceBundle.containsKey("hello"));
        System.out.println(resourceBundle.getString("hello"));
    }
}
