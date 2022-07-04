package com.company.JavaIOTest;
//file
//file-writer
//file-reader
//buffer-writer
//buffer-reader


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("/home/mahmoud-essam/Documents/java-one-for-all/File/text.txt");

        try (FileWriter writer = new FileWriter(file,true)) {
            writer.write("HELLO THERE\nTESTING NEW LINE\n");
            writer.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
