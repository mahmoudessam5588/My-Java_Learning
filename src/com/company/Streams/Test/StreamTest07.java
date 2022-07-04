package com.company.Streams.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class StreamTest07 {

    public static void main(String[] args) {
        int[] ints = IntStream.rangeClosed(1, 100).filter(x -> x % 2 == 0).toArray();
        System.out.println(Arrays.toString(ints));
        Object[] objects = Stream.of(11, 35, 67, 45, 89, 76).sorted().toArray();
        System.out.println(Arrays.toString(objects));

        int[] num ={1,2,3,4,5,6,7};
        Arrays.stream(num).average().ifPresent(System.out::println);
        try(Stream<String>s = Files.lines(Paths.get("/home/mahmoud-essam/Documents/java-one-for-all/File/text.txt"))) {
            s.filter(l->l.contains("HELLO")).forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }
        //generate streams
        System.out.println("------------------");
        Stream.iterate(2,n->n+n).limit(10).forEach(System.out::println);
        System.out.println("-------------------");
        Stream.iterate(new int[]{0,1},n->new int[]{n[1],n[0]+n[1]}).limit(10).map(s->s[0]).forEach(System.out::println);
        System.out.println("------------");
        ThreadLocalRandom random =ThreadLocalRandom.current();
        Stream.generate(()->random.nextInt(0,100)).limit(5).forEach(System.out::println);
    }
}
