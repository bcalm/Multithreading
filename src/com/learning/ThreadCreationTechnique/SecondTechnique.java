package com.learning.ThreadCreationTechnique;

import com.learning.Task.SecondTask;

public class SecondTechnique {

    public static void main(String[] args) {
        System.out.println("Main thread starts...");
        new SecondTask();
        new SecondTask();
        System.out.println("... Main thread ends");
    }
}

