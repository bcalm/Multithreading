package com.learning;

import java.util.concurrent.TimeUnit;

public class FirstTechniqure {

    public static void main(String[] args) {
        System.out.println("Main thread starts...");
        new FirstTask();
        new FirstTask();
        System.out.println("... Main thread ends");
    }
}

class FirstTask extends Thread {
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

    public FirstTask() {
        this.id = ++count;
        this.start();
    }
}