package com.company.JavaIOTest;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Set;

public class PosixFileAttributesTest1 {
    public static void main(String[] args) {
        Path path = Paths.get("/home/mahmoud-essam/Documents/java-one-for-all/Folder4/subfolder1/subfolder2/subfolder3/FileRenamed.txt");
        try {
            PosixFileAttributes posixFileAttributes = Files.readAttributes(path, PosixFileAttributes.class);
            PosixFileAttributeView fileAttributeView = Files.getFileAttributeView(path, PosixFileAttributeView.class);
            Set<PosixFilePermission> ps =PosixFilePermissions.fromString("rw-rw-rw");
            System.out.println(fileAttributeView.readAttributes().permissions());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
