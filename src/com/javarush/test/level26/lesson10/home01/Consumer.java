package com.javarush.test.level26.lesson10.home01;


import java.util.concurrent.BlockingQueue;

/**
 * Created by Sasha on 13.08.2016.
 */
public class Consumer implements Runnable {
    protected final BlockingQueue queue;
    Consumer(BlockingQueue q) { queue = q; }

    @Override
    public void run() {
        try {
            while (true) {
                System.out.println(queue.take());
            }
        }catch (InterruptedException ex) {  System.out.println(String.format("[%s] thread was terminated", Thread.currentThread().getName()));
        }
    }

}
