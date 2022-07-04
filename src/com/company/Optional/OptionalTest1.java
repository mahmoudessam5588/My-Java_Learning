package com.company.Optional;


import java.util.List;
import java.util.Optional;


public class OptionalTest1 {
    public static void main(String[] args) {
        Optional<Optional<String>> o1 = Optional.of(fndName("Essam"));
        Optional<Optional<String>> ibrahim = Optional.ofNullable(fndName("Ibrahim"));
        System.out.println(ibrahim);
        System.out.println(o1);
         fndName("Ahmed").orElseThrow(IllegalArgumentException::new);


    }
    public static Optional <String> fndName(String name){
        List<String> list = List.of("Mahmoud", "Essam");
        int i = list.indexOf(name);
        if (i !=-1){
            return  Optional.of(list.get(i));
        }

        return Optional.empty();
    }
}
