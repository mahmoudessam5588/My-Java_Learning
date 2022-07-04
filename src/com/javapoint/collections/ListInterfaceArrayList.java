package com.javapoint.collections;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class ListInterfaceArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrList = new ArrayList<>();
        arrList.add("Mahmoud");
        arrList.addAll(1,List.of("Essam","Abdul-Hamid","Mahmoud","El-Masry"));
        Iterator<String>itr = arrList.iterator();
        do {
            System.out.println(itr.next());

        }while(itr.hasNext());
        System.out.println(List.of(arrList));
        System.out.println(arrList.get(3));
        int i = arrList.lastIndexOf("Mahmoud");
        System.out.println(i);
        Object clone = arrList.clone();
        System.out.println(List.of(clone));
        boolean mahmoud = arrList.removeIf(s -> s.contains("Mahmoud"));
        System.out.println(mahmoud);
        System.out.println(arrList);
        Collections.sort(arrList);
        System.out.println(arrList);
        ListIterator<String>itr2 = arrList.listIterator(arrList.size());
        do {
            System.out.println(itr2.previous());

        }while(itr2.hasPrevious());

        for (int k = 0; k < arrList.size(); k++){
            System.out.println(arrList.get(k));
        }

        Iterator<String> itr3=arrList.iterator();
        itr3.forEachRemaining(System.out::println);

        try {
            FileOutputStream out = new FileOutputStream("/home/mahmoud-essam/Documents/java-one-for-all/File/Serilization.txt");
            ObjectOutputStream oos = new ObjectOutputStream(out);
            oos.writeObject(arrList);
            out.close();
            oos.close();
            FileInputStream fis = new FileInputStream("/home/mahmoud-essam/Documents/java-one-for-all/File/Serilization.txt");
            ObjectInputStream ios = new ObjectInputStream(fis);
            var arr = (ArrayList) ios.readObject();
            System.out.println(arr);

        }catch (Exception e) {
            e.printStackTrace();
        }

    }

}
