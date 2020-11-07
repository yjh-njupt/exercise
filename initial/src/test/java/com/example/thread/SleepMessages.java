package com.example.thread;

/**
 * @author ：yjh
 * @date ：Created in 2020/11/7 22:40
 * @description :Notice that main declares that it throws InterruptedException. This is an exception that
 * sleep throws when another thread interrupts the current thread while sleep is active. Since this application
 * has not defined another thread to cause the interrupt, it doesn't bother to catch InterruptedException.
 * @version: v 1.0
 */
public class SleepMessages {
    public static void main(String args[])
            throws InterruptedException {
        String importantInfo[] = {
                "Mares eat oats",
                "Does eat oats",
                "Little lambs eat ivy",
                "A kid will eat ivy too"
        };

        for (int i = 0;
             i < importantInfo.length;
             i++) {

            //Pause for 4 seconds
            Thread.sleep(4000);

            //Print a message
            System.out.println(importantInfo[i]);
        }


    }
}
