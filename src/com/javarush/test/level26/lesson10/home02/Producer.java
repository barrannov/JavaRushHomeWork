package com.javarush.test.level26.lesson10.home02;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Sasha on 13.08.2016.
 */
public class Producer implements Runnable {
    protected ConcurrentHashMap<String, String> map;

    public Producer(ConcurrentHashMap<String, String> map) {
        this.map = map;
    }
    @Override
    public void run() {
        Thread currentThread = Thread.currentThread();
        try {
            int i = 1;
            while (true) {
                    System.out.println("Some text for " + i++);
                Thread.sleep(500);
            }
        }catch (InterruptedException e) {
            System.out.println(currentThread.getName() +" thread was terminated");
        }
    }
    }

