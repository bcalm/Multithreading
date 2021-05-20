package com.learning.ThreadCreationTechnique;

import com.learning.Task.Normal.FirstTask;

public class FirstTechniqure {

    public static void main(String[] args) {
        System.out.println("Main thread starts...");
        new FirstTask();
        new FirstTask();
        System.out.println("... Main thread ends");
    }
}

