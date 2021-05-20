package com.learning.Task.LoopTask;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

public class LoopTaskB implements Runnable {
    private static int count = 0;
    private int instanceNumber;
    private String taskId;

    @Override
    public void run() {
        System.out.println("########### ["+ Thread.currentThread().getName() + " ]< Task" + taskId + " > starts ###############");
        for (int i = 0; i < 10; i++) {
            System.out.println("["+ Thread.currentThread().getName() + " ]< Task" + taskId + " > tick tick " + i);
            try {
                TimeUnit.MILLISECONDS.sleep((long) Math.random() * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("***********["+ Thread.currentThread().getName() + " ]< Task" + taskId + " > ends *************");
    }

    public LoopTaskB() {
        this.instanceNumber = ++count;
        this.taskId = "LoopTaskB" + this.instanceNumber;
    }
}

