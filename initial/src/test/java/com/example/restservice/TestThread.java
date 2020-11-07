package com.example.restservice;

import com.example.pojo.Counter;
import com.example.pojo.SynchronizedCounter;
import org.junit.jupiter.api.Test;

import java.util.concurrent.locks.ReentrantLock;
//import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author ：yjh
 * @date ：Created in 2020/11/7 18:09
 * @description :
 * @version: v 1.0
 */
//
public class TestThread implements Runnable {

    private final ReentrantLock lock = new ReentrantLock();
    private Counter counter = new Counter();
    private SynchronizedCounter synchronizedCounter = new SynchronizedCounter();
    // ...


    public void m1() {

        try {
            // ... method body

            counter.increment();
            System.out.println("counter:" + counter.value() + "-" + Thread.currentThread().getName());

        } finally {

        }
    }

    public void m2() {

        try {
            // ... method body
            synchronizedCounter.increment();
            System.out.println("counter:" + synchronizedCounter.value() + "-" + Thread.currentThread().getName());
        } finally {

        }
    }


    public void run() {

//        lock.lock();  // block until condition holds
        try {
            // ... method body

            for (int i = 10000; i > 0; i--) {
                //               m1();
                m2();

            }
        } finally {
//            lock.unlock();
        }

    }

    @Test
    public void app1() {

        (new Thread(new TestThread())).start();
        run();
    }


}
