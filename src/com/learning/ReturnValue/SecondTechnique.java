package com.learning.ReturnValue;

import com.learning.Task.ValueReturning.TaskB;

public class SecondTechnique {
    public static void main(String[] args) {
        System.out.println("main thread starts....");

        TaskB TaskB = new TaskB(2, 3, 100, new SumObserver("task 1"));
        Thread thread1 = new Thread(TaskB, "Thread 1");

        TaskB taskB = new TaskB(2, 4, 20000, new SumObserver("task 2"));
        Thread thread2 = new Thread(taskB, "Thread 2");

        TaskB taskC = new TaskB(2, 5, 1000, new SumObserver("task 3"));
        Thread thread3 = new Thread(taskC, "Thread 3");

        thread1.start();
        thread2.start();
        thread3.start();



        System.out.println("main thread ends....");
    }
}
