package com.learning.ReturnValue;

import com.learning.Task.ValueReturning.TaskA;

public class FirstTechnique {
    public static void main(String[] args) {
        System.out.println("main thread starts....");

        TaskA taskA = new TaskA(2, 3 , 100);
        Thread thread1 = new Thread(taskA, "Thread 1");

        TaskA taskB = new TaskA(2, 4 , 100);
        Thread thread2 = new Thread(taskB, "Thread 2");

        TaskA taskC = new TaskA(2, 5 , 1000);
        Thread thread3 = new Thread(taskC, "Thread 3");

        thread1.start();
        thread2.start();
        thread3.start();

        System.out.println("Result => " + taskA.getSum());
        System.out.println("Result => " + taskB.getSum());
        System.out.println("Result => " + taskC.getSum());


        System.out.println("main thread ends....");
    }
}
