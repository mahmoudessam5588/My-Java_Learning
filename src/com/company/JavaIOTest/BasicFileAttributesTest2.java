package com.company.JavaIOTest;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.nio.file.attribute.PosixFileAttributes;

public class BasicFileAttributesTest2 {
    public static void main(String[] args) {
        Path path = Paths.get("/home/mahmoud-essam/Documents/java-one-for-all/File/new.txt");
        try {
            BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);
            FileTime creationTime = basicFileAttributes.creationTime();
            FileTime lastModifiedTime = basicFileAttributes.lastModifiedTime();
            FileTime lastAccessTime = basicFileAttributes.lastAccessTime();
            System.out.println("creationTime " + creationTime);
            System.out.println("lastModifiedTime "+lastModifiedTime);
            System.out.println("lastAccessTime  "+lastAccessTime);
            System.out.println("--------------------------");
        } catch (IOException e) {
            e.printStackTrace();
        }
        BasicFileAttributeView fileAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        FileTime newLastAccess = FileTime.fromMillis(System.currentTimeMillis());
        try {
            fileAttributeView.setTimes(null,newLastAccess,null);
            FileTime fileTime = fileAttributeView.readAttributes().creationTime();
            FileTime lastModifiedTime = fileAttributeView.readAttributes().lastModifiedTime();
            FileTime lastAccessTime = fileAttributeView.readAttributes().lastAccessTime();
            System.out.println("creationTime " + fileTime);
            System.out.println("lastModifiedTime "+lastModifiedTime);
            System.out.println("lastAccessTime  "+lastAccessTime);
            System.out.println("New Last Access" + newLastAccess);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
