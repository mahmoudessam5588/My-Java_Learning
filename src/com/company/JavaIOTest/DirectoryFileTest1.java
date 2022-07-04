package com.company.JavaIOTest;

import java.io.File;
import java.io.IOException;

public class DirectoryFileTest1 {
    public static void main(String[] args) {
        File file = new File("/home/mahmoud-essam/Documents/java-one-for-all/Folder");
        boolean newDirectory = file.mkdir();
        System.out.println("is created " + newDirectory);
        File fileNew = new File("/home/mahmoud-essam/Documents/java-one-for-all/Folder/fileNew.txt");
        try {
            boolean isNewFileCreated = fileNew.createNewFile();
            System.out.println("Is Created "+isNewFileCreated);
        } catch (IOException e) {
            e.printStackTrace();
        }
        File fileRenamed = new File("/home/mahmoud-essam/Documents/java-one-for-all/Folder/fileRenamed.txt");
        boolean isRenamed = fileNew.renameTo(fileRenamed);
        System.out.println("IS Renamed" + isRenamed);

    }
}
