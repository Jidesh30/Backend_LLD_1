package org.example.streams;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Client {
    public static void main(String[] args) {
        System.out.println("Hello Streams!");

        List<String> list = List.of("Hello world","world of java","Hello streams");

//        for(Integer i: list){
//            if(i%2==0) {
//                System.out.println(i);
//            }
//        }
        //remove words from sentence to single word and make all lowercase and return list of distinct words only
        List<String> ls = list.stream().
                flatMap(s -> List.of(s.split(" ")).stream())
                .map(s -> s.toLowerCase())
                .distinct()
                .toList();

        System.out.println("Even Numbers using streams" + ls);
    }
}
