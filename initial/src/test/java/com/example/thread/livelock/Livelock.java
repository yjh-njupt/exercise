package com.example.thread.livelock;

/**
 * @author ：yjh
 * @date ：Created in 2020/11/8 21:53
 * @description : A thread often acts in response to the action of another thread.
 * If the other thread's action is also a response to the action of another thread,
 * then livelock may result. As with deadlock, livelocked threads are unable to make
 * further progress. However, the threads are not blocked — they are simply too busy
 * responding to each other to resume work. This is comparable to two people attempting
 * to pass each other in a corridor: Alphonse moves to his left to let Gaston pass,
 * while Gaston moves to his right to let Alphonse pass. Seeing that they are still
 * blocking each other, Alphone moves to his right, while Gaston moves to his left.
 * They're still blocking each other, so
 * @version: v 1.0
 */
public class Livelock {

    public static void main(String[] args) {
        final Worker worker1 = new Worker("Worker 1 ", true);
        final Worker worker2 = new Worker("Worker 2", true);

        final CommonResource s = new CommonResource(worker1);

        new Thread(() -> {
            worker1.work(s, worker2);
        }).start();

        new Thread(() -> {
            worker2.work(s, worker1);
        }).start();
    }
}
