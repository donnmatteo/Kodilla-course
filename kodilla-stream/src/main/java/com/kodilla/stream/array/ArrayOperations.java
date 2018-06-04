package com.kodilla.stream.array;

import java.util.stream.IntStream;

public interface ArrayOperations {
    static int getAverage(int[] numbers){
        IntStream.range(0, numbers.length)
                .forEach(System.out::println);

        IntStream.range(0, numbers.length)
                .average();
    }
}
