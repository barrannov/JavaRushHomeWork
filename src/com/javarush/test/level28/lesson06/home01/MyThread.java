package com.javarush.test.level28.lesson06.home01;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Sasha on 17.08.2016.
 */
public class MyThread extends Thread {
    static AtomicInteger
            priority = new AtomicInteger(1);
    public MyThread() {
        setMyThreadPriority();
    }

    public MyThread(Runnable target) {
        super(target);
        setMyThreadPriority();

    }

    public MyThread(ThreadGroup group, Runnable target) {
        super(group, target);
        setMyThreadPriority();

    }

    public MyThread(String name) {
        super(name);
        setMyThreadPriority();

    }

    public MyThread(ThreadGroup group, String name) {
        super(group, name);
        setMyThreadPriority();

    }

    public MyThread(Runnable target, String name) {
        super(target, name);
        setMyThreadPriority();

    }

    public MyThread(ThreadGroup group, Runnable target, String name) {
        super(group, target, name);
        setMyThreadPriority();

    }

    public MyThread(ThreadGroup group, Runnable target, String name, long stackSize) {
        super(group, target, name, stackSize);
        setMyThreadPriority();


    }
    public void setMyThreadPriority(){
        setPriority(priority.get());
if(priority.get()==10){
priority.set(0);
}
priority.incrementAndGet();
    }
}
