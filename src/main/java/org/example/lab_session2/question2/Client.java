package org.example.lab_session2.question2;

/*
Objective
Understand the difference between FixedThreadPool and CachedThreadPool by simulating a web scraper. Problem Statement
Given a list of 100 URLs (e.g., "http://example.com/pageX"), simulate fetching the page content using Thread.sleep(200ms).
Implement two versions:
Use a FixedThreadPool(10) to process 10 URLs at a time.
Use a CachedThreadPool to process them dynamically.
Compare the execution time for both approaches.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        String[] urls = new String[10000];
        for(int i=0; i<10000; i++){
            urls[i] = "https://www.example.com" + (i+1);
        }

        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(10);
        long startFixed = System.currentTimeMillis();
        List<Future<Void>> fixedFutures = new ArrayList<>();
        for(String url: urls){
            ScrapUrl task = new ScrapUrl(url);
            Future<Void> future = fixedThreadPool.submit(task);
            fixedFutures.add(future);
        }
        for(Future<Void> f: fixedFutures){
            f.get();
        }
        long endFixed = System.currentTimeMillis();
        fixedThreadPool.shutdown();

        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        long startCached = System.currentTimeMillis();
        List<Future<Void>> cachedFutures = new ArrayList<>();
        for(String url: urls){
            ScrapUrl task = new ScrapUrl(url);
            Future<Void> future = cachedThreadPool.submit(task);
            fixedFutures.add(future);
        }
        for(Future<Void> f: fixedFutures){
            f.get();
        }
        long endCached = System.currentTimeMillis();
        cachedThreadPool.shutdown();

        System.out.println("FixedThreadPool execution time: " + (endFixed - startFixed) + " ms");
        System.out.println("CachedThreadPool execution time: " + (endCached - startCached) + " ms");
    }
}
