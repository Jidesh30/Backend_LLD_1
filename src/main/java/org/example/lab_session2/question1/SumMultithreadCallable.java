package org.example.lab_session2.question1;

import java.util.List;
import java.util.concurrent.Callable;

public class SumMultithreadCallable implements Callable<Long> {
    List<Integer> arr;
    Integer start;
    Integer end;

    public SumMultithreadCallable(List<Integer> arr, Integer start, Integer end){
        this.arr = arr;
        this.start = start;
        this.end = end;
    }

    @Override
    public Long call() throws Exception{
        Long sum = 0L;

        for(int i=start; i<end; i++){
            sum += arr.get(i);
        }
        System.out.println("Sum from index "+ start + " to "
                + (end-1) + " is " + sum
                + " calculated by "
                + Thread.currentThread().getName());
        return sum;
    }
}
