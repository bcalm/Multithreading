package com.learning;

import java.util.concurrent.TimeUnit;

public class SecondTechnique {

    public static void main(String[] args) {
        System.out.println("Main thread starts...");
        new SecondTask();
        new SecondTask();
        System.out.println("... Main thread ends");
    }
}

class SecondTask implements Runnable {
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