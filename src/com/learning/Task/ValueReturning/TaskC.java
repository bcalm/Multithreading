package com.learning.Task.ValueReturning;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class TaskC implements Callable<Integer> {
    private static int count = 0;

    private final int firstNum;
    private final int secondNum;
    private final int sleepingTime;
    private final String taskId;

    public TaskC(int firstNum, int secondNum, int sleepingTime) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
        this.sleepingTime = sleepingTime;
        this.taskId = "Calculation Task A " + ++count;
    }

    @Override
    public Integer call() {
        String threadName = Thread.currentThread().getName();
        System.out.println("################# [" + threadName + "]" + this.taskId + " thread starts.... #############");

        try {
            TimeUnit.MILLISECONDS.sleep(sleepingTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("***************** [" + threadName + "]" + this.taskId + " thread ends.... ***************");
        return this.firstNum + this.secondNum;
    }
}
