package com.company.Regex;
import java.util.Scanner;

public class ScannerTest2 {
    public static void main(String[] args) {
        String text = "Eren,Levi,Mikasa,true,20000";
        Scanner scanner = new Scanner(text);
        scanner.useDelimiter(",");
        do{
            System.out.println(scanner.next());
        }while(scanner.hasNext());

    }

}
