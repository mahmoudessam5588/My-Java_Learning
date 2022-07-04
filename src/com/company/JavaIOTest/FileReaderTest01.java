package com.company.JavaIOTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class FileReaderTest01 {
    public static void main(String[] args) {
        File file = new File("/home/mahmoud-essam/Documents/java-one-for-all/File/text.txt");
        try(FileReader reader = new FileReader(file)) {
            char[] c = new char[116];
           int i;
           while ((i =reader.read())!=-1){
               System.out.print((char)i);
           }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
