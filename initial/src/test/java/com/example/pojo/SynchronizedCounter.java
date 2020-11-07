package com.example.pojo;

/**
 * @author ：yjh
 * @date ：Created in 2020/11/7 19:07
 * @description :
 * @version: v 1.0
 */
public class SynchronizedCounter {
    private int c = 0;

    public synchronized void increment() {
        c++;
    }

    public synchronized void decrement() {
        c--;
    }

    public synchronized int value() {
        return c;
    }
}
