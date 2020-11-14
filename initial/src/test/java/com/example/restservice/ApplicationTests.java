package com.example.restservice;

import com.example.pojo.Counter;
import com.example.pojo.SynchronizedCounter;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.CollectionUtils;

/**
 * @author ：yjh
 * @date ：Created in 2020/11/3 22:43
 * @description :
 * @version: v 1.0
 */
public class ApplicationTests {
    /*
    synchronized(this)
     */
    @Test
    public void application1() {
        window1 t1 = new window1();
        window1 t2 = new window1();
        window1 t3 = new window1();

        t1.setName("售票口1");
        t2.setName("售票口2");
        t3.setName("售票口3");

        t1.start();
        t2.start();
        t3.start();
    }

    @Test
    public void application2() {
        window t1 = new window();
        window t2 = new window();
        window t3 = new window();

        t1.setName("售票口1");
        t2.setName("售票口2");
        t3.setName("售票口3");

        t1.start();
        t2.start();
        t3.start();
    }
}

class window1 extends Thread {
    private static int ticket = 100; //将其加载在类的静态区，所有线程共享该静态变量

    @Override
    public void run() {
        synchronized (this) {
            while (true) {
                if (ticket > 0) {
                    //                try {
                    //                    sleep(100);
                    //                } catch (InterruptedException e) {
                    //                    e.printStackTrace();
                    //                }
                    System.out.println(getName() + "当前售出第" + ticket + "张票");
                    ticket--;
                } else {
                    break;
                }
            }
        }

    }
}

class window extends Thread {
    private static int ticket = 100; //将其加载在类的静态区，所有线程共享该静态变量

    @Override
    public void run() {

        while (true) {
            if (ticket > 0) {
                //                try {
                //                    sleep(100);
                //                } catch (InterruptedException e) {
                //                    e.printStackTrace();
                //                }
                System.out.println(getName() + "当前售出第" + ticket + "张票");
                ticket--;
            } else {
                break;
            }
        }
    }


}

