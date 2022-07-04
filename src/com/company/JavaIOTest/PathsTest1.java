package com.company.JavaIOTest;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathsTest1 {
    public static void main(String[] args) {
        Path p1 = Paths.get("/home/mahmoud-essam/Documents/java-one-for-all/File/test.txt");
        System.out.println(p1.getFileName().toFile().toPath());
    }
}
