package com.example.thread;

import ch.qos.logback.core.net.SyslogOutputStream;

/**
 * @author ：yjh
 * @date ：Created in 2020/11/7 23:09
 * @description : wait(timeout)
 * @version: v 1.0
 */
public class JoinMessages extends Thread {


    public static void main(String[] args) {
        JoinMessages joinMessages = new JoinMessages();
        joinMessages.start();
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + ":start");
        try {
            System.out.println("join start");
            join(4000);
            System.out.println("join stop");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
