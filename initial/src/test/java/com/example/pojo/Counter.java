package com.example.pojo;

/**
 * @author ：yjh
 * @date ：Created in 2020/11/7 18:56
 * @description :Counter is designed so that each invocation of increment will
 * add 1 to c,
 * and each invocation of decrement will subtract 1 from c. However, if a Counter
 * object is referenced from multiple threads, interference between threads may
 * prevent this from happening as expected.
 * @version: v 1.0
 */
public class Counter {
    private int c = 0;

    public void increment() {
        c++;
    }

    public void decrement() {
        c--;
    }

    public int value() {
        return c;
    }

}
