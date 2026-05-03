package org.example.multhithread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FibonnacciNumber implements Callable<Integer> {
    private int n;

    public FibonnacciNumber(int n){
        this.n = n;
    }

    public int fibonnacciFunc(int num){
        if(num <= 1){
            return num;
        }
        return fibonnacciFunc(num - 1) + fibonnacciFunc(num - 2);
    }

    @Override
    public Integer call() throws Exception {
        if(n<=1) return n;

        ExecutorService executorService = Executors.newCachedThreadPool();

        Future<Integer> first = executorService.submit(new FibonnacciNumber(n-1));
        Future<Integer> second = executorService.submit(new FibonnacciNumber(n-2));

        int x = first.get();
        int y = second.get();

        return x+y;
    }
}
