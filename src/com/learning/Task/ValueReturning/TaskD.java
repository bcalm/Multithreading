package com.learning.Task.ValueReturning;

import com.learning.ReturnValue.TaskResult;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class TaskD implements Callable<TaskResult<String, Integer>> {
    private static int count = 0;

    private final int firstNum;
    private final int secondNum;
    private final int sleepingTime;
    private final String taskId;

    public TaskD(int firstNum, int secondNum, int sleepingTime) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
        this.sleepingTime = sleepingTime;
        this.taskId = "Calculation Task B " + ++count;
    }

    @Override
    public TaskResult<String, Integer> call() {
        String threadName = Thread.currentThread().getName();
        System.out.println("################# [" + threadName + "]" + this.taskId + " thread starts.... #############");

        try {
            TimeUnit.MILLISECONDS.sleep(sleepingTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("***************** [" + threadName + "]" + this.taskId + " thread ends.... ***************");
        return new TaskResult<>(taskId, this.firstNum + this.secondNum);
    }
}
