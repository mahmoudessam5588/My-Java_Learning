package com.company.Streams.Test;

import com.company.Streams.LightNovel;

import java.util.*;

public class StreamTest3 {
    public static void main(String[] args) {
        List<List<String>> devDojo = new ArrayList<>();
        List<String> graphicDesigner = List.of("Sawsan Moustafa","Yara Nageeb","Ahmed Mohsen");
        List<String> developers = List.of("Mahmoud Essam","Ahmed Abdullah","Hamdy Moustafa");
        List<String> students = List.of("Eyad Ali", "Lobna mohmamed", "John Smith");
        devDojo.add(graphicDesigner);
        devDojo.add(developers);
        devDojo.add(students);
        for (List<String> list : devDojo) {
            System.out.println(list);
            for (String stringsList : list) {
                System.out.println(stringsList);

            }
        }
        System.out.println("-----------------");
      devDojo.stream().flatMap(Collection::stream).forEach(System.out::println);
        List<String> strings = graphicDesigner.stream().map(m -> m.split("")).flatMap(Arrays::stream).toList();
        System.out.println(strings);
    }
}
