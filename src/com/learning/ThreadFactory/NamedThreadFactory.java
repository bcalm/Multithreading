package com.learning.ThreadFactory;

import java.util.concurrent.ThreadFactory;

public class NamedThreadFactory implements ThreadFactory {

    private static int count = 0;
    private static String name = "Pool Worker ";
    @Override
    public Thread newThread(Runnable r) {
        return new Thread(r,name + ++count);
    }
}
