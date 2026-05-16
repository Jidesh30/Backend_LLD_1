package org.example.lab_session2.question2;

import java.util.concurrent.Callable;

public class ScrapUrl implements Callable<Void> {
    private String url;

    public ScrapUrl(String url){
        this.url = url;
    }

    @Override
    public Void call() throws Exception {
        System.out.println("Scraping URL: " + url + " by " + Thread.currentThread().getName());
        Thread.sleep(200);
        System.out.println("Finished scraping URL: " + url + " by " + Thread.currentThread().getName());
        return null;
    }
}
