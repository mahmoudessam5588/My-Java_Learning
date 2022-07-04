package com.company.JavaIOTest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderTest1 {
    public static void main(String[] args) {
        File file = new File("/home/mahmoud-essam/Documents/java-one-for-all/File/text.txt");
        try(FileReader reader = new FileReader(file);
        BufferedReader bufferReader = new BufferedReader(reader)) {
            String i = null;
            do {
                System.out.println(i);


            }while ((i = bufferReader.readLine()) !=null);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }

