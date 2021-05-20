package com.learning.ReturnValue;

import com.learning.Task.LoopTask.LoopTaskA;
import com.learning.Task.ValueReturning.TaskC;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FirstTechniqueWithExecutor {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("Main Thread starts ............");

        ExecutorService executorService = Executors.newCachedThreadPool();

        Future<Integer> result1 = executorService.submit(new TaskC(2, 3, 1000));
        Future<Integer> result2 = executorService.submit(new TaskC(2, 4, 100));
        Future<Integer> result3 = executorService.submit(new TaskC(2, 5, 1300));

        System.out.println("Result 1 => " + result1.get());
        System.out.println("Result 2 => " + result2.get());
        System.out.println("Result 3 => " + result3.get());

        executorService.shutdown();
        System.out.println("Main Thread ends ............");
    }
}
