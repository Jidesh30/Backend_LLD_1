package org.example.lambdas;

import java.util.Collections;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Runnable task = () -> {
            System.out.println("Hello, World!, printing on Runnable lambda function");
        };

        Thread th = new Thread(task);
        th.start();

        List<Integer> l = new java.util.ArrayList<>(List.of(12,42,35,25,14,85));
        Collections.sort(l, (a,b) -> {
            if(a%2 == b%2) {
                return b-a;
            } else if(a%2 == 0) {
                return -1;
            } else {
                return 1;
            }
        });

        System.out.println(l);
    }
}
