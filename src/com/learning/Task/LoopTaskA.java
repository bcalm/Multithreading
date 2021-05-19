package com.learning.Task;

import java.util.concurrent.TimeUnit;

public class LoopTaskA implements Runnable {
    private static int count = 0;
    private int id;

    @Override
    public void run() {
        System.out.println("###########" + "< Task" + id + " > starts ###############");
        for (int i = 0; i < 10; i++) {
            try {
                TimeUnit.MILLISECONDS.sleep((long) Math.random() * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(id + " -> " + i);
        }
        System.out.println("***********" + "< Task" + id + " > ends *************");
    }

    public LoopTaskA() {
        this.id = ++count;
    }
}

