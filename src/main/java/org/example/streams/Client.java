package org.example.streams;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Client {
    public static void main(String[] args) {
        System.out.println("Hello Streams!");

        List<Integer> list = List.of(12, 34, 56, 78, 90, 12, 13, 45, 68, 80);

        for(Integer i: list){
            if(i%2==0) {
                System.out.println(i);
            }
        }

        List<Integer> ls = list.stream()
                .filter(((num) -> num % 2 ==0))
                .sorted().map(x -> x * x)
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Even Numbers using streams" + ls);
    }
}
