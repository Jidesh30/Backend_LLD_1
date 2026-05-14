package org.example.multhithread.mergesort;

import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int arr [] = {25, 14, 15, 13, 49, 99, 10, 21};
        System.out.println("Original array "+ Arrays.toString(arr));

        MergeSort mergeSort = new MergeSort(arr);

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<int []> sortedArray = executorService.submit(mergeSort);

        System.out.println("Sorted array: " );
        System.out.println(Arrays.toString(sortedArray.get()));
    }
}
