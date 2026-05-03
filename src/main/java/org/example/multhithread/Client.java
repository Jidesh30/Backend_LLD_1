package org.example.multhithread;

/*
Print numbers from 1 to 100 each in a separate thread.
 */

public class Client {
    public static void main(String[] args) throws Exception {

//        for (int i = 0; i < 100; i++) {
//            Thread t = new Thread(new NumberPrinter(i));
//            t.start();
//        }
        FibonnacciNumber fibo = new FibonnacciNumber(10);
        System.out.println(fibo.call());
    }
}
