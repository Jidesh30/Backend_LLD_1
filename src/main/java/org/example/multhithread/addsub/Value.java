package org.example.multhithread.addsub;

import java.util.concurrent.locks.ReentrantLock;

public class Value {
    private int value = 0;
    private final ReentrantLock lock = new ReentrantLock();

    public int getValue() {
        return value;
    }

    public int setValue(int value){
        this.value = value;
        return value;
    }
}
