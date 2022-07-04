package com.company.Overridding;

public class AnimeClass {
    private final String name;
    @Override
    public String toString() {
        return "AnimeClass{" +
                "name='" + name + '\'' +
                '}';
    }
     AnimeClass(String name) {
        this.name = name;
    }
}
