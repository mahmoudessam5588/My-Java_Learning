package com.company.JavaIOTest;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;

public class JavaIOClass1 {
    public static void main(String[] args) {
        File file = new File("\\home\\mahmoud-essam\\Documents\\java-one-for-all\\File\\file.txt");
        try {
            boolean isCreated =file.createNewFile();
            boolean file1 = file.isFile();
            boolean directory = file.isDirectory();
            boolean fileHidden = file.isHidden();
            boolean delete = file.delete();
            boolean exists = file.exists();
            long lastModified =file.lastModified();
            System.out.println(new Date(lastModified));
            System.out.println(Instant.ofEpochMilli(lastModified));

            System.out.println("Is Created "+ isCreated);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
