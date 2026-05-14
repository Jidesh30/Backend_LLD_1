package org.example.multhithread.addsub;

public class Value {
    private int value = 0;

    public synchronized void add(int num){
        value += num;
    }

    public synchronized void sub(int num){
        value -= num;
    }

    public synchronized int getValue() {
        return value;
    }


}
