package com.learning.Task.ValueReturning;

import java.util.concurrent.TimeUnit;

public class TaskA implements Runnable {
    private static int count = 0;

    private int firstNum;
    private int secondNum;
    private int sleepingTime;
    private int instanceNumber;
    private String taskId;
    private int sum;
    private volatile boolean done;

    public TaskA(int firstNum, int secondNum, int sleepingTime) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
        this.sleepingTime = sleepingTime;
        this.instanceNumber = ++count;
        this.taskId = "Value Return Task A " + instanceNumber;
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println("################# [" + threadName + "] thread starts.... ################");

        try {
            TimeUnit.MILLISECONDS.sleep(sleepingTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        this.sum = this.firstNum + this.secondNum;
        synchronized (this) {
            this.notify();
        }
        done = true;
        System.out.println("***************** [" + threadName + "] thread ends.... ***************");
    }

    public int getSum() {
        synchronized (this) {
            if (!done) {
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        return sum;
    }
}
