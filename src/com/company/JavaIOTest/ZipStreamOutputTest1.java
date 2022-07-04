package com.company.JavaIOTest;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipStreamOutputTest1 {
    public static void main(String[] args) {
        Path zipFile = Paths.get("Folder/fileZipped.zip");
        Path targetFile = Paths.get("/home/mahmoud-essam/Documents/java-one-for-all/Folder4/subfolder1/subfolder2/subfolder3");
zip(zipFile, targetFile);
    }
    private static  void zip (Path zipFile, Path targetFile){
        try (ZipOutputStream zipOutputStream = new ZipOutputStream(Files.newOutputStream(zipFile));
        DirectoryStream<Path> directoryStream=Files.newDirectoryStream(targetFile)) {
            for(Path iterator : directoryStream){
                ZipEntry zipEntry = new ZipEntry(iterator.getFileName().toString());
                zipOutputStream.putNextEntry(zipEntry);
                Files.copy(iterator,zipOutputStream);
                zipOutputStream.closeEntry();

            }
        }catch (IOException e){e.printStackTrace();}
    }
}
