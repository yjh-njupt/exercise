package com.example.thread;

/**
 * @author ：yjh
 * @date ：Created in 2020/11/8 21:21
 * @description : starvation Demo Each thread have a priority. Priorities are represented
 * by a number between 1 and 10. In most cases, thread schedular schedules the threads
 * according to their priority (known as preemptive scheduling). But it is not guaranteed
 * because it depends on JVM specification that which scheduling it chooses.
 * <p>
 * public static int MIN_PRIORITY
 * public static int NORM_PRIORITY
 * public static int MAX_PRIORITY
 * <p>
 * Default priority of a thread is 5 (NORM_PRIORITY). The value of MIN_PRIORITY is 1 and
 * the value of MAX_PRIORITY is 10.
 * @version: v 1.0
 */
// Java program to illustrate Starvation concept
class StarvationDemo extends Thread {
    static int threadcount = 1;

    public void run() {
        System.out.println(threadcount + "st Child" +
                " Thread execution starts" + ":" + this.getName());
        System.out.println("Child thread execution completes");

        threadcount++;
    }

    public static void main(String[] args)
            throws InterruptedException {
        System.out.println("Main thread execution starts");

        // Thread priorities are set in a way that thread5
        // gets least priority.
        StarvationDemo thread1 = new StarvationDemo();
        thread1.setName("thread1");
        thread1.setPriority(1);
        StarvationDemo thread2 = new StarvationDemo();
        thread1.setName("thread2");
        thread2.setPriority(2);
        StarvationDemo thread3 = new StarvationDemo();
        thread1.setName("thread3");
        thread3.setPriority(3);
        StarvationDemo thread4 = new StarvationDemo();
        thread1.setName("thread4");
        thread4.setPriority(4);
        StarvationDemo thread5 = new StarvationDemo();
        thread1.setName("thread5");
        thread5.setPriority(5);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        // Here thread5 have to wait beacause of the
        // other thread. But after waiting for some
        // interval, thread5 will get the chance of
        // execution. It is known as Starvation
        thread5.start();

        System.out.println("Main thread execution completes");
    }
}
