package com.company.JavaIOTest;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterTest01 {
    public static void main(String[] args) {
        File file = new File("/home/mahmoud-essam/Documents/java-one-for-all/File/text.txt");

        try (FileWriter writer = new FileWriter(file,true);BufferedWriter bf = new BufferedWriter(writer)) {

            bf.write("HELLO THERE");
            bf.newLine();
            bf.flush();

        } catch (IOException e) {

            e.printStackTrace();
        }
    }
}
