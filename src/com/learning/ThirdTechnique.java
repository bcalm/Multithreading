package com.learning;

import java.util.concurrent.TimeUnit;

public class ThirdTechnique {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        TimeUnit.MILLISECONDS.sleep(250);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(" -> " + i);
                }
            }
        });
        thread.start();
    }
}
