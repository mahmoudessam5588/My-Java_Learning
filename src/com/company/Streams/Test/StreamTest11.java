package com.company.Streams.Test;

import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamTest11 {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.println(Thread.currentThread().getName());
        long num = 100_00_00L;
        sumNum(num);
        sumIterate(num);
        sumParallelIterate(num);
        sumLongIterateRangeClosed(num);
        sumParallelLongIterateRangeClosed(num);
    }

    private static void sumNum(long num) {
        long result = 0;
        long init = System.currentTimeMillis();
        for (int i = 0; i < num; i++) {
            result += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + " In MS");
    }

    private static void sumIterate(long num) {
        long init = System.currentTimeMillis();
        Long result = Stream.iterate(1L, i -> i + 1).limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + " In MS");
    }

    private static void sumParallelIterate(long num) {
        long init = System.currentTimeMillis();
        Long result = Stream.iterate(1L, i -> i + 1).parallel().limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + " In MS");
    }

    private static void sumLongIterateRangeClosed(long num){
        long init = System.currentTimeMillis();
        Long result = LongStream.rangeClosed(1L, num).reduce(0L,Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + " In MS");
    }
    private static void sumParallelLongIterateRangeClosed(long num){
        long init = System.currentTimeMillis();
        Long result = LongStream.rangeClosed(1L, num).parallel().reduce(0L,Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " " + (end - init) + " In MS");
    }



}
