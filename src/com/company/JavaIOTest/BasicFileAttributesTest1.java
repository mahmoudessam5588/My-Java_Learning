package com.company.JavaIOTest;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFileAttributesTest1 {
    public static void main(String[] args) {
        LocalDateTime dateModified = LocalDateTime.now().minusDays(2);
        File file = new File("/home/mahmoud-essam/Documents/java-one-for-all/File/google.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println(isCreated);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        boolean isModified = file.setLastModified(dateModified.toInstant(ZoneOffset.UTC).toEpochMilli());

        Path path = Paths.get("/home/mahmoud-essam/Documents/java-one-for-all/File/newFile.txt");
        try {
            Path file1 = Files.createFile(path);
            FileTime filetime1 = FileTime.from(dateModified.toInstant(ZoneOffset.UTC));
            Files.setLastModifiedTime(path,filetime1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
