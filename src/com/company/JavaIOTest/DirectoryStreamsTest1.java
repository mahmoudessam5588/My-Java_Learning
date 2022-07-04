package com.company.JavaIOTest;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryStreamsTest1 {
    public static void main(String[] args) {
        Path dir = Paths.get(".");
        try( DirectoryStream<Path> paths = Files.newDirectoryStream(dir);) {
            for(Path iterator:paths){
                System.out.println(iterator.getFileName());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
