package com.example.thread.livelock;

/**
 * @author ：yjh
 * @date ：Created in 2020/11/8 21:54
 * @description :
 * @version: v 1.0
 */
public class CommonResource {
    private Worker owner;

    public CommonResource(Worker d) {
        owner = d;
    }

    public Worker getOwner() {
        return owner;
    }

    public synchronized void setOwner(Worker d) {
        owner = d;
    }
}
