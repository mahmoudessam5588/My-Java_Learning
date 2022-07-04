package com.company.JavaIOTest;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest1 {
    public static void main(String[] args) {
        Path pathOne = Paths.get("/home/mahmoud-essam/Documents/java-one-for-all/File");
        Path pathTwo = Paths.get("/home/mahmoud-essam/Documents/java-one-for-all/Folder");
        Path relate = pathOne.relativize(pathTwo.getParent().normalize().toAbsolutePath());
        System.out.println(relate.toAbsolutePath());


    }
}
