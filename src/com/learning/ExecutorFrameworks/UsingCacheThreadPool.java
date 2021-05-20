package com.learning.ExecutorFrameworks;

import com.learning.Task.LoopTask.LoopTaskA;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class UsingCacheThreadPool {
    public static void main(String[] args) {
        System.out.println("Main Thread starts ............");

        ExecutorService executorService = Executors.newCachedThreadPool();

        for (int i = 0; i < 6; i++) {
            executorService.execute(new LoopTaskA());
        }

        executorService.shutdown();
        System.out.println("Main Thread ends ............");
    }
}
