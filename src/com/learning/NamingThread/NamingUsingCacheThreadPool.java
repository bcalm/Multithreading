package com.learning.NamingThread;

import com.learning.Task.LoopTask.LoopTaskB;
import com.learning.ThreadFactory.NamedThreadFactory;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class NamingUsingCacheThreadPool {
    public static void main(String[] args) {
        System.out.println("Main Thread starts ............");

        ExecutorService executorService = Executors.newCachedThreadPool(new NamedThreadFactory());

        for (int i = 0; i < 3; i++) {
            executorService.execute(new LoopTaskB());
        }

        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < 5; i++) {
            executorService.execute(new LoopTaskB());
        }

        executorService.shutdown();
        System.out.println("Main Thread ends ............");
    }
}
