package com.company.exceptions;

import java.io.*;


public class RunTimeExceptions {
    public static void main(String[] args) throws IOException {

        fileCreate();
        fileReader();

        divider(1, 6);
    }

     private static void fileReader() throws IOException {
        try(Reader reader = new BufferedReader(new FileReader("/home/mahmoud-essam/Documents/java-one-for-all/File/text.txt"))){

        }catch (IOException e){

        }
     }
    public static void fileCreate() throws IOException {
        File file = new File("/home/mahmoud-essam/Documents/java-one-for-all/File/text.txt");
        try {
            boolean createNewFile = file.createNewFile();
            System.out.println(createNewFile);

        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }

    }

    @SuppressWarnings("UnusedReturnValue")
    private static double divider(@SuppressWarnings("SameParameterValue") double a, @SuppressWarnings("SameParameterValue") double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Number can't be Divided By Zero");
        } else {
            System.out.println(a / b);
        }


        return a / b;
    }

}
