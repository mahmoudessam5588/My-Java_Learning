package com.company.Streams.Test;

import java.util.List;

public class StreamTest5 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,4,55,77,8,9,123,456,890,34,56,77);
        list.stream().reduce(Integer::sum).ifPresent(System.out::println);
        list.stream().reduce(Integer::max).ifPresent(System.out::println);
        list.stream().reduce((x,y)->x<y?x:y).ifPresent(System.out::println);


    }

}
