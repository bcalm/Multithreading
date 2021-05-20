package com.learning.ReturnValue;

import com.learning.Task.ValueReturning.TaskC;
import com.learning.Task.ValueReturning.TaskD;
import com.learning.ThreadFactory.NamedThreadFactory;

import java.util.concurrent.*;

public class SecondTechniqueWithExecutor {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("Main Thread starts ............");

        ExecutorService executorService = Executors.newCachedThreadPool(new NamedThreadFactory());
        ExecutorCompletionService<TaskResult<String, Integer>> compService = new ExecutorCompletionService<>(executorService);

        compService.submit(new TaskD(2, 3, 1000));
        compService.submit(new TaskD(2, 4, 100));
        compService.submit(new TaskD(2, 5, 1300));

        for (int i = 0; i < 3; i++) {
            System.out.println(compService.take().get());
        }


        executorService.shutdown();
        System.out.println("Main Thread ends ............");
    }
}
