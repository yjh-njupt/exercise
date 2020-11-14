package com.example.thread;

/**
 * @author ：yjh
 * @date ：Created in 2020/11/8 19:46
 * @description : 火车卖票问题原型
 * @version: v 1.0
 */
public class ThreadDemo extends Thread {

    public static void main(String[] args) {
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
