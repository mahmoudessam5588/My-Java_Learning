package com.company.JavaIOTest;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest2 {
    public static void main(String[] args) throws IOException {
        Path folderCreated = Paths.get("Folder3");
        try {
            if (Files.notExists(folderCreated)) {
                Path createdFolder = Files.createDirectories(folderCreated);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
        Path subFolders = Paths.get("Folder4/subfolder1/subfolder2/subfolder3");
        try {
            if (Files.notExists(subFolders)) {
                Path nestedFolders = Files.createDirectories(subFolders);

            }


        } catch (IOException e) {
            e.printStackTrace();
        }
        Path localFile = Paths.get(subFolders.toString(), "file.txt");
        try {
            if (Files.notExists(localFile)){
            Files.createFile(localFile);}

        } catch (IOException e) {
            e.printStackTrace();
        }
        Path source = localFile;
        Path destination = Paths.get(source.getParent().toString(),"FileRenamed.txt");
        Files.copy(source,destination, StandardCopyOption.REPLACE_EXISTING);



    }
}
