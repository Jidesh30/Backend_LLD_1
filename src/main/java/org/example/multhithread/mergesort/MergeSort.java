package org.example.multhithread.mergesort;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import static java.util.Arrays.copyOfRange;

public class MergeSort implements Callable<int []> {

    private int arr[];

    public MergeSort(int arr[]){
        this.arr = arr;
    }

    @Override
    public int[] call() throws Exception {
        System.out.println("Thread Name: "
                + Thread.currentThread().getName()
                + " is sorting array of length: "
                + arr.length);

        if(arr.length<=1) return arr;

        int mid = arr.length/2;
        int left[] = copyOfRange(arr, 0, mid);
        int right[] = copyOfRange(arr, mid, arr.length);

        MergeSort leftTask = new MergeSort(left);
        MergeSort rightTask = new MergeSort(right);

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Future<int []> leftFuture = executorService.submit(leftTask);
        Future<int []> rightFuture = executorService.submit(rightTask);

        int leftSorted[] = leftFuture.get();
        int rightSorted[] = rightFuture.get();

        return mergeArray(leftSorted, rightSorted);

    }

    private int[] mergeArray(int leftSorted[], int rightSorted[]){
        int[] mergeArray = new int[leftSorted.length + rightSorted.length];

        int p1 = 0; int p2 = 0; int k=0;

        while(p1<leftSorted.length && p2<rightSorted.length){
            if(leftSorted[p1]<=rightSorted[p2]){
                mergeArray[k] = leftSorted[p1];
                p1++;
                k++;
            } else {
                mergeArray[k] = rightSorted[p2];
                p2++;
                k++;
            }
        }
        while(p1<leftSorted.length){
            mergeArray[k] = leftSorted[p1];
            k++;
            p1++;
        }
        while(p2<rightSorted.length){
            mergeArray[k] = rightSorted[p2];
            k++;
            p2++;
        }
        return mergeArray;
    }
}
