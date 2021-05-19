package com.learning.Task;

import java.util.concurrent.TimeUnit;

public class SecondTask implements Runnable {
    private static int count = 0;
    private int id;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                TimeUnit.MILLISECONDS.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(id + " -> " + i);
        }
    }

    public SecondTask() {
        this.id = ++count;
        new Thread(this).start();
    }
}
