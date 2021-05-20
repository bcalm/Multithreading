package com.learning.Task.ValueReturning;

import com.learning.ReturnValue.ResultNotifier;

import java.util.concurrent.TimeUnit;

public class TaskB implements Runnable {
    private static int count = 0;

    private final int firstNum;
    private final int secondNum;
    private final int sleepingTime;
    private final String taskId;
    private final ResultNotifier<Integer> resultNotifier;

    public TaskB(int firstNum, int secondNum, int sleepingTime, ResultNotifier<Integer> resultNotifier) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
        this.sleepingTime = sleepingTime;
        this.resultNotifier = resultNotifier;
        this.taskId = "Value Return Task A " + ++count;
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println("################# [" + threadName + "]" + this.taskId + " thread starts.... #############");

        try {
            TimeUnit.MILLISECONDS.sleep(sleepingTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int sum = this.firstNum + this.secondNum;
        resultNotifier.notifyResult(sum);
        System.out.println("***************** [" + threadName + "]" + this.taskId + " thread ends.... ***************");
    }
}
