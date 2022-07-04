package com.company.JavaIOTest;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class ListJavaAllFiles extends SimpleFileVisitor<Path>{
    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        System.out.println("pre Visit "+dir.getFileName());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        return super.visitFileFailed(file, exc);
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        return super.postVisitDirectory(dir, exc);
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        if(file.getFileName().toString().endsWith(".java")){
        System.out.println(file.getFileName());}
        return FileVisitResult.CONTINUE;
    }
}
public class SimpleFileVisitorTest1 {
    public static void main(String[] args) {
        Path path = Paths.get("Folder");
        try {
            Files.walkFileTree(path ,new ListJavaAllFiles());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
